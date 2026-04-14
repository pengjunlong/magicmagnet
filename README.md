# 神奇磁力 (MagicMagnet) — 逆向工程项目

> 本项目由原始 APK 经 **Frida 动态脱壳 + jadx 反编译** 还原而来，供学习研究使用。

---

## 一、APK 反编译流程

### 1. 准备工具

| 工具 | 用途 |
|------|------|
| `apktool` | 提取资源文件、`AndroidManifest.xml`、`assets`、`lib` |
| `jadx` | 反编译 DEX → Java 源码 |
| `frida-tools` (PC) | 动态注入脚本 |
| `frida-server` (Android) | 运行在模拟器上的 Frida 服务端 |
| `adb` | 与 Android 模拟器交互 |

### 2. 初步尝试（失败）

```bash
apktool d magicmagnet.apk -o apktool_out
jadx magicmagnet.apk -d decompiled_src
```

反编译出的代码均为**加固保护层**，核心业务代码无法获取：
- `AndroidManifest.xml` 中 `Application` 为 `WrapperProxyApplication`
- `assets/0OO00l111l1l` 为加密 DEX（魔数和 size 字段被篡改）
- `lib/arm64-v8a/libshella-4.5.3.9.so` — **Shella/娜迦加固** Native 壳

### 3. Frida 动态脱壳

加固原理：应用启动时，壳（`libshella-4.5.3.9.so`）在 Native 层解密真实 DEX 并通过 `libart.so!OpenMemory` 动态加载，解密后的 DEX 明文短暂存在于内存中，可被 Frida 捕获。

#### 3.1 环境搭建

```bash
# 1. PC 端安装 frida（版本需与 frida-server 一致）
pip install frida-tools          # 当前使用版本: 17.9.1

# 2. 下载对应架构的 frida-server（模拟器为 arm64）
FRIDA_VER="17.9.1"
curl -L "https://github.com/frida/frida/releases/download/${FRIDA_VER}/frida-server-${FRIDA_VER}-android-arm64.xz" \
     -o frida-server.xz
xz -d frida-server.xz

# 3. 部署到模拟器
adb push frida-server /data/local/tmp/frida-server
adb shell "chmod 755 /data/local/tmp/frida-server"
adb shell "killall frida-server 2>/dev/null; /data/local/tmp/frida-server -D &"

# 4. 验证连接
frida-ps -U | head -5

# 5. 安装目标 APK
adb install magicmagnet.apk
```

#### 3.2 脱壳脚本 `dexdump.js`

脚本采用**六层 Hook 策略**，覆盖从 Java 层到 Native 层的所有 DEX 加载路径：

```javascript
/**
 * Frida DEX 脱壳脚本
 * 原理：hook Android 系统加载 DEX 的关键函数，在解密后立即 dump
 */

var dumpedSet = new Set();   // 去重，避免重复 dump 同一内存块
var dumpCount = 0;
var outputDir = "/data/local/tmp/dex_dump";

// ---------- 工具函数：写入文件 ----------
function dumpMemory(addr, size, tag) {
    try {
        var key = addr.toString() + "_" + size;
        if (dumpedSet.has(key)) return;
        dumpedSet.add(key);

        // 验证 DEX magic: "dex\n" = 0x64 0x65 0x78 0x0a
        var magic = new Uint8Array(Memory.readByteArray(ptr(addr), 8));
        if (magic[0] !== 0x64 || magic[1] !== 0x65 ||
            magic[2] !== 0x78 || magic[3] !== 0x0a) return;

        dumpCount++;
        var filename = outputDir + "/" + tag + "_" + dumpCount + "_" + size + ".dex";
        console.log("[+] Dumping DEX -> " + filename);

        var buf = Memory.readByteArray(ptr(addr), size);
        var fos = Java.use("java.io.FileOutputStream").$new(filename);
        fos.write(Java.array("byte", Array.from(new Uint8Array(buf))));
        fos.flush();
        fos.close();
        console.log("[+] Saved: " + filename);
    } catch (e) {
        console.log("[!] dumpMemory error: " + e);
    }
}

Java.perform(function () {
    // 确保输出目录存在
    var dir = Java.use("java.io.File").$new(outputDir);
    if (!dir.exists()) dir.mkdirs();

    // ===== 方案1: Hook DexFile.loadDex =====
    // 针对从文件路径加载 DEX 的情形
    try {
        var DexFile = Java.use("dalvik.system.DexFile");
        DexFile.loadDex.overload("java.lang.String", "java.lang.String", "int")
            .implementation = function (src, out, flags) {
            console.log("[*] DexFile.loadDex: " + src);
            return this.loadDex(src, out, flags);
        };
    } catch (e) { console.log("[-] DexFile.loadDex hook failed: " + e); }

    // ===== 方案2: Hook InMemoryDexClassLoader (API 26+) =====
    // 针对直接从内存 ByteBuffer 加载 DEX 的情形
    try {
        var InMemoryDexClassLoader = Java.use("dalvik.system.InMemoryDexClassLoader");
        InMemoryDexClassLoader.$init
            .overload("java.nio.ByteBuffer", "java.lang.ClassLoader")
            .implementation = function (buf, loader) {
            try {
                var position = buf.position();
                var size = buf.limit() - position;
                var jArr = Java.array("byte", new Array(size));
                buf.get(jArr);
                buf.position(position);   // 还原 buffer 位置

                dumpCount++;
                var filename = outputDir + "/InMemory_" + dumpCount + "_" + size + ".dex";
                var fos = Java.use("java.io.FileOutputStream").$new(filename);
                fos.write(jArr);
                fos.flush();
                fos.close();
                console.log("[+] InMemoryDexClassLoader dump: " + filename);
            } catch (e2) { console.log("[!] InMemory dump error: " + e2); }
            return this.$init(buf, loader);
        };
    } catch (e) { console.log("[-] InMemoryDexClassLoader hook failed: " + e); }

    // ===== 方案3: Hook BaseDexClassLoader =====
    // 记录所有 dexPath，辅助定位解密后落盘路径
    try {
        var BaseDexClassLoader = Java.use("dalvik.system.BaseDexClassLoader");
        BaseDexClassLoader.$init
            .overload("java.lang.String", "java.io.File", "java.lang.String", "java.lang.ClassLoader")
            .implementation = function (dexPath, optimizedDir, libSearchPath, parent) {
            console.log("[*] BaseDexClassLoader: dexPath=" + dexPath);
            return this.$init(dexPath, optimizedDir, libSearchPath, parent);
        };
    } catch (e) { console.log("[-] BaseDexClassLoader hook failed: " + e); }
});

// ===== 方案4: Native Hook - libart.so OpenMemory =====
// 最底层方法：拦截 ART 虚拟机加载内存中 DEX 的函数
// 适用于所有加固方案，包括直接内存解密型
function hookNativeOpenMemory() {
    var artLib = Process.getModuleByName("libart.so");
    if (!artLib) { console.log("[-] libart.so not found"); return; }

    // 优先从导出表找，找不到则枚举符号表
    var funcs = artLib.enumerateExports()
        .filter(function (e) { return e.name && e.name.indexOf("OpenMemory") !== -1; });
    if (funcs.length === 0) {
        try {
            funcs = artLib.enumerateSymbols()
                .filter(function (s) { return s.name && s.name.indexOf("OpenMemory") !== -1; });
        } catch (e) {}
    }

    console.log("[*] Found " + funcs.length + " OpenMemory functions");
    funcs.forEach(function (func) {
        console.log("    -> " + func.name + " @ " + func.address);
        Interceptor.attach(func.address, {
            onEnter: function (args) {
                // args[0]=内存地址, args[1]=size, args[2]=文件名(可选)
                this.addr = args[0];
                this.size = args[1].toInt32();
                this.name = args[2] ? args[2].readCString() : "unknown";
                console.log("[*] OpenMemory: addr=" + this.addr +
                    " size=" + this.size + " name=" + this.name);
            },
            onLeave: function (retval) {
                if (this.size > 0x1000 && this.addr) {
                    Java.perform(function () {
                        dumpMemory(this.addr, this.size, "OpenMemory");
                    }.bind(this));
                }
            }
        });
    });
}

// ===== 方案5: Hook mmap =====
// 拦截所有内存映射，筛选出 DEX magic 开头的映射区域
function hookMmap() {
    var mmapPtr = Module.findExportByName(null, "mmap");
    if (!mmapPtr) { console.log("[-] mmap not found"); return; }
    console.log("[*] Hooking mmap @ " + mmapPtr);

    Interceptor.attach(mmapPtr, {
        onEnter: function (args) {
            this.length = args[1].toInt32();
            this.prot   = args[2].toInt32();  // PROT_READ=1, PROT_WRITE=2, PROT_EXEC=4
        },
        onLeave: function (retval) {
            if (retval.equals(ptr(-1))) return;
            if (this.length < 0x1000) return;
            if ((this.prot & 0x1) === 0) return;   // 过滤不可读映射
            try {
                var view = new Uint8Array(Memory.readByteArray(retval, 4));
                if (view[0] === 0x64 && view[1] === 0x65 &&
                    view[2] === 0x78 && view[3] === 0x0a) {
                    console.log("[*] mmap DEX found: " + retval + " size=" + this.length);
                    Java.perform(function () {
                        dumpMemory(retval, this.length, "mmap");
                    }.bind(this));
                }
            } catch (e) {}
        }
    });
}

// ===== 方案6: 主动内存扫描 =====
// 在等待一段时间后主动扫描所有可读内存区域，找 DEX magic
// DEX 结构：offset 0 = "dex\n035\0"，offset 32 = file_size (uint32_le)
function scanMemoryForDex() {
    console.log("[*] Scanning memory for DEX magic...");
    var count = 0;
    Process.enumerateRanges("r--").forEach(function (range) {
        try {
            Memory.scanSync(range.base, range.size, "64 65 78 0a")
                .forEach(function (match) {
                    try {
                        var dexSize = Memory.readU32(match.address.add(32));
                        if (dexSize > 0x1000 && dexSize <= range.size) {
                            console.log("[*] Found DEX: " + match.address + " size=" + dexSize);
                            Java.perform(function () {
                                dumpMemory(match.address, dexSize, "scan");
                            });
                            count++;
                        }
                    } catch (e) {}
                });
        } catch (e) {}
    });
    console.log("[*] Scan complete, found " + count + " DEX candidates");
}

// 启动 Native hooks（在主线程执行后 100ms）
setTimeout(function () {
    hookNativeOpenMemory();
    hookMmap();
}, 100);

// 8s 后第一次内存扫描（等待应用初始化和壳开始解密）
setTimeout(function () {
    Java.perform(function () { scanMemoryForDex(); });
}, 8000);

// 15s 后再扫描一次（等待壳完全解密）
setTimeout(function () {
    Java.perform(function () {
        console.log("[*] Second memory scan...");
        scanMemoryForDex();
    });
}, 15000);

console.log("[*] All hooks installed, waiting...");
```

#### 3.3 Python 控制脚本 `dump_runner.py`

Frida CLI 的 `--timeout` 仅控制 CLI 进程本身，无法保证脚本内的 `setTimeout` 有足够时间执行。因此用 Python 精确控制会话生命周期：

```python
#!/usr/bin/env python3
"""
Frida DEX 脱壳运行器
用 Python 控制 frida 会话，等待足够长时间让加固层解密后 dump
"""
import frida, sys, time

JS_SCRIPT = open("/tmp/frida_dump/dexdump.js").read()

def on_message(message, data):
    if message["type"] == "send":
        print("[JS]", message["payload"])
    elif message["type"] == "error":
        print("[ERR]", message["stack"])

def main():
    device = frida.get_usb_device(timeout=10)
    print(f"[*] Connected: {device}")

    pkg = "com.magicmagnet"
    # spawn 模式：从头启动应用，确保 Hook 在壳运行前就已就位
    pid = device.spawn([pkg])
    print(f"[*] Spawned PID: {pid}")

    session = device.attach(pid)
    script = session.create_script(JS_SCRIPT)
    script.on("message", on_message)
    script.load()

    device.resume(pid)   # 脚本加载完毕后再恢复应用执行
    print("[*] App resumed, waiting for DEX dump...")

    # 等待 30s（覆盖脚本内 8s + 15s 两次扫描）
    for i in range(30):
        time.sleep(1)
        sys.stdout.write(f"\r[*] Waiting... {i+1}/30s")
        sys.stdout.flush()

    print("\n[*] Extra 15s for second scan...")
    time.sleep(15)

    session.detach()
    print("[*] Done!")

if __name__ == "__main__":
    main()
```

运行方式：
```bash
# 先强制停止应用，确保从干净状态 spawn
adb shell "am force-stop com.magicmagnet"

# 执行脱壳（总耗时约 45s）
python3 /tmp/frida_dump/dump_runner.py
```

#### 3.4 成功提取 DEX

**实际脱壳路径**：壳解密后直接将 DEX 写入了应用私有目录，无需从 Hook 回调中 dump，直接 pull 即可：

```bash
# 壳解密后的 DEX 存放路径
adb pull /data/data/com.magicmagnet/files/prodexdir/00O000ll111l_0.dex ./dex_pulled/
adb pull /data/data/com.magicmagnet/files/prodexdir/00O000ll111l_1.dex ./dex_pulled/
adb pull /data/data/com.magicmagnet/files/prodexdir/00O000ll111l_2.dex ./dex_pulled/
```

| 文件 | 内容 | 大小 |
|------|------|------|
| `00O000ll111l_0.dex` | 主业务层（`com.magicmagnet.*`） | 约 3MB |
| `00O000ll111l_1.dex` | 次业务层（`play`、`dlna`、`data.bean` 等） | 约 4MB |
| `00O000ll111l_2.dex` | 迅雷 SDK（`com.xunlei.downloadlib.*`） | 约 1MB |

验证 DEX 合法性：
```bash
# 检查 magic + 声明大小与实际大小是否一致
for f in dex_pulled/*.dex; do
    echo "=== $f ==="
    xxd "$f" | head -2
    python3 -c "
import struct
d = open('$f', 'rb').read()
print('Magic:', d[:8])
print('Declared size:', struct.unpack_from('<I', d, 32)[0], 'bytes')
print('Actual size:', len(d), 'bytes')
"
done
# 正确结果：Magic 为 b'dex\n035\x00'，Declared size == Actual size
```

### 4. 反编译还原源码

```bash
# 使用 jadx 反混淆反编译
export JAVA_HOME=/Library/Java/JavaVirtualMachines/openjdk-17.jdk/Contents/Home
jadx --deobf --deobf-min 2 \
     00O000ll111l_0.dex 00O000ll111l_1.dex 00O000ll111l_2.dex \
     -d decompiled_src

# 将资源从 apktool 导出
jadx --export-gradle magicmagnet.apk -d jadx_gradle_out
```

### 5. 导入项目结构

```bash
# 资源文件
cp -r jadx_gradle_out/app/src/main/res/   app/src/main/res/
cp -r apktool_out/assets/                  app/src/main/assets/
cp -r apktool_out/lib/                     app/src/main/jniLibs/

# Java 源码
cp -r decompiled_src/sources/              app/src/main/java/
```

---

## 二、项目结构

```
app/src/main/
├── java/
│   ├── com/magicmagnet/          ← 业务源码（289 个类）
│   │   ├── MagicMagnetApp.java   ← Application 入口，全局初始化
│   │   ├── play/                 ← 视频播放模块（4 个类）
│   │   ├── dlna/                 ← DLNA 投屏模块（6 个类）
│   │   │   ├── control/          ← 投屏控制
│   │   │   └── search/           ← 设备发现
│   │   ├── main/view/            ← 主页（下载任务管理，11 个类）
│   │   ├── search/               ← 搜索模块（内嵌 WebView，9 个类）
│   │   ├── history/              ← 播放历史（2 个类）
│   │   ├── mserver/view/         ← 用户中心（登录/注册/会员，13 个类）
│   │   ├── hotmovie/             ← 热门影视推荐（2 个类）
│   │   ├── filmreview/           ← 影评模块（3 个类）
│   │   ├── setting/              ← 设置页（3 个类）
│   │   ├── searchsource/         ← 搜索源管理（3 个类）
│   │   ├── favorite/             ← 收藏（1 个类）
│   │   ├── bookmark/             ← 书签（1 个类）
│   │   ├── goods/                ← 商品/购买（1 个类）
│   │   ├── feedback/             ← 意见反馈（1 个类）
│   │   ├── common/               ← 公共基础层（31 个类）
│   │   │   ├── base/mvp/         ← MVP 基类（BaseActivity/BaseSlidrActivity）
│   │   │   ├── activity/         ← 通用 Activity（Splash/About/Pro/PhotoView）
│   │   │   ├── service/          ← 后台服务（XService/DLNAService/PublishService）
│   │   │   ├── clipboard/        ← 剪贴板链接检测（LinkDetectViewModel）
│   │   │   ├── view/             ← 自定义 View（XWebView/XAdBlockWebView）
│   │   │   ├── manager/          ← BackupRestore（数据备份还原）
│   │   │   ├── encrypt/          ← Base32 编码工具
│   │   │   ├── provider/         ← ContentProvider（BuglyProvider/UpgradeProvider）
│   │   │   └── receiver/         ← NetworkMonitorReceiver
│   │   └── data/                 ← 数据层（193 个类）
│   │       ├── bean/             ← API 响应/请求数据模型（约 80 个）
│   │       ├── db/               ← 本地数据库实体（Realm + GreenDAO）
│   │       └── user/             ← 用户相关数据模型（47 个）
│   ├── com/xunlei/downloadlib/  ← 迅雷下载 SDK（反编译源码）
│   │   ├── XLDownloadManager.java
│   │   ├── MagicXLoader.java
│   │   ├── XLLoader.java         ← JNI 接口（所有 native 方法）
│   │   └── parameter/            ← 参数数据结构
│   └── [第三方库源码]             ← 约 11,000 个反编译类（见第六节）
│       ├── okhttp3/              ← OkHttp（178 个类）
│       ├── org/                  ← Realm、Cling（DLNA）等（1235 个类）
│       ├── p000/                 ← 混淆依赖库（4145 个类，见说明）
│       ├── retrofit2/            ← Retrofit（2 个类）
│       ├── rx/                   ← RxJava（25 个类）
│       └── androidx/             ← AndroidX（481 个类）
├── res/                          ← 资源文件（3073 个）
├── assets/                       ← 原始资产（含加密 DEX 壳文件）
└── jniLibs/arm64-v8a/            ← Native 库
    ├── libmagicmagnetsdk.so      ← 迅雷 SDK Native 核心
    ├── libijkplayer.so           ← IJK 播放器
    ├── libijkffmpeg.so           ← FFmpeg 编解码
    ├── libijksdl.so              ← SDL 渲染
    ├── libffmpeg0.so             ← 补充 FFmpeg
    ├── librtmp-jni.so            ← RTMP 流支持
    ├── libadblockplus-jni.so     ← 广告拦截
    ├── libBugly.so               ← Bugly 崩溃上报
    ├── libshella-4.5.3.9.so      ← 娜迦加固壳（原 APK 遗留）
    └── ...
```

### 业务模块快速索引

| 想看什么 | 去哪里找 |
|---------|---------|
| 应用启动 & 全局初始化顺序 | `MagicMagnetApp.java` → `initXunLeiManager()`、`initRealm()`、`initAdBlock()`… |
| 主界面下载任务列表 | `main/view/MainFragment.java` → `MainActivity.java` |
| 解析/输入 magnet 链接 | `main/view/ParseActivity.java` |
| 迅雷下载核心逻辑 | `common/service/XService.java` |
| 播放器启动 | `play/PlayActivity.java` → `play/VideoView.java` |
| 投屏搜索弹窗 | `dlna/search/DLNASearchDialogFragment.java` |
| 投屏控制页 | `dlna/control/DLNAControlActivity.java` |
| WebView 搜索资源 | `search/view/WebViewFragment.java` |
| 用户登录/注册 | `mserver/view/LoginActivity.java` |
| 历史记录 | `history/HistoryFragment.java` |
| 数据库实体 | `data/db/*.java` |
| 网络 API 数据模型 | `data/bean/*.java` |

---

## 三、Magnet 播放原理

整个流程分为**下载引擎**和**播放器**两层。

### 3.1 整体数据流

```
用户输入 magnet: 链接
        │
        ▼
┌─────────────────────────────────┐
│  XService（后台下载服务）         │
│  com.magicmagnet.common.service  │
│                                  │
│  XLDownloadManager               │
│  .createBtMagnetTask(            │
│      MagnetTaskParam {           │
│          mUrl = "magnet:?xt=..." │
│          mFilePath = 缓存目录    │
│      }, taskId                   │
│  )                               │
│  .startTask(taskId)              │
│                                  │
│  → 迅雷 P2P 网络加速下载         │
│  → 边下边播（prefetch 模式）     │
└──────────────┬──────────────────┘
               │ BtSubTaskDetail（子文件信息）
               │ XLTaskInfo（下载进度）
               ▼
┌─────────────────────────────────┐
│  getLocalUrl()                   │
│  生成本地 HTTP 代理地址           │
│  → http://127.0.0.1:xxxx/...    │
└──────────────┬──────────────────┘
               │ FtnData {
               │   play_url  = "http://127.0.0.1:..."
               │   play_host = "..."
               │   play_ftn  = "迅雷 FTN 标识"
               │   taskId    = 下载任务 ID
               │   subTaskIndex = 文件索引
               │ }
               ▼
┌─────────────────────────────────┐
│  PlayActivity                    │
│  → VideoView.setUp(url, ...)     │
└──────────────┬──────────────────┘
               ▼
┌─────────────────────────────────┐
│  VideoView extends               │
│  StandardGSYVideoPlayer          │  ← GSYVideoPlayer 框架
│                                  │    UI 控制栏、手势、全屏
│  底层引擎: IjkMediaPlayer        │  ← B站 ijkplayer（FFmpeg）
│  Native:  libijkplayer.so        │
│           libijkffmpeg.so        │
└──────────────┬──────────────────┘
               ▼
         视频画面渲染
         + 弹幕叠加（DanmakuController）
```

### 3.2 下载引擎：迅雷 SDK

| 类 | 职责 |
|----|------|
| `MagicXLoader` | 应用封装的 SDK 初始化入口，加载 `libmagicmagnetsdk.so` |
| `XLDownloadManager` | 单例下载管理器，封装所有下载操作 |
| `XLLoader` | JNI 桥接层，所有 `native` 方法声明 |
| `MagnetTaskParam` | 磁力链接任务参数（`mUrl`、`mFilePath`、`mFileName`） |
| `BtTaskParam` | BT 种子任务参数 |
| `BtSubTaskDetail` | BT 种子内单个文件信息（index、size、localPath） |
| `XLTaskInfo` | 任务下载进度（speed、downloadSize、totalSize） |
| `XLTaskLocalUrl` | 本地代理 HTTP 地址（用于播放器） |

关键 API 流程：
```java
// 1. 初始化
MagicXLoader.getInstance().setContext(context);
MagicXLoader.getInstance().initASync();

// 2. 创建磁力任务
MagnetTaskParam param = new MagnetTaskParam();
param.mUrl = "magnet:?xt=urn:btih:...";
param.mFilePath = getCacheDir().getPath();
GetTaskId taskId = new GetTaskId();
XLDownloadManager.getInstance().createBtMagnetTask(param, taskId);

// 3. 启动下载（边下边播）
XLDownloadManager.getInstance().startTask(taskId.mTaskId);
XLDownloadManager.getInstance().enterPrefetchMode(taskId.mTaskId);

// 4. 获取本地播放代理 URL
XLTaskLocalUrl localUrl = new XLTaskLocalUrl();
XLDownloadManager.getInstance().getLocalUrl(urlHash, localUrl);
// localUrl.mStrUrl → "http://127.0.0.1:xxxx/..."

// 5. 传给播放器
FtnData data = new FtnData(..., localUrl.mStrUrl, ...);
PlayActivity.start(context, data);
```

### 3.3 播放器：GSYVideoPlayer + IjkPlayer

| 类/库 | 职责 |
|-------|------|
| `VideoView extends StandardGSYVideoPlayer` | 核心播放 View，自定义 UI 控制层 |
| `PlayActivity` | 播放页，管理生命周期与屏幕旋转 |
| `GSYVideoManager` | 全局播放器状态管理（反射代理） |
| `IjkMediaPlayer` | 底层播放引擎（B站开源，基于 FFmpeg） |
| `libijkplayer.so` | IJK 核心 Native 库 |
| `libijkffmpeg.so` | 编解码 Native 库 |
| `libijksdl.so` | 渲染 Native 库 |

`VideoView` 支持：
- 多音轨切换（`ITrackInfo[]`）
- 字幕 TimedText（`IjkTimedText`）
- 弹幕控制器（`getDanmakuController()`）
- 亮度/音量/进度手势
- 全屏/小窗切换
- 播放出错回调（`onPlayError`）

### 3.4 DLNA 投屏

当用户选择投屏时，走 DLNA 协议把本地代理 URL 推送给局域网设备：

```
XLDownloadManager.getLocalUrl()
    → http://127.0.0.1:xxxx/...
         │
         ▼
DLNASearchDialogFragment   ← 搜索局域网 DLNA 设备
         │
         ▼
DLNAControlActivity        ← 控制投屏播放
         │
         ▼
DLNAService                ← 后台维持 DLNA 连接
```

### 3.5 FtnData 数据结构

```java
public final class FtnData implements Parcelable {
    String id;              // 文件唯一 ID
    String name;            // 文件名
    String play_url;        // 本地代理播放地址 http://127.0.0.1:...
    String play_host;       // 播放服务 host
    String play_ftn;        // 迅雷 FTN（Fast Transfer Network）标识
    String play_url_cookie; // 播放 Cookie（部分资源需要）
    Long   taskId;          // 迅雷下载任务 ID
    Integer subTaskIndex;   // BT 子文件索引
    boolean done;           // 是否下载完成
}
```

---

## 四、架构模式

### 4.1 整体架构

项目采用 **MVP（主流程）+ MVVM（部分页面）混合架构**，具体体现：

```
┌─────────────────────────────────────────────────────────┐
│                        View 层                           │
│  Activity / Fragment（继承 BaseActivity<P>）              │
│  → implements sp（View 接口，方法命名已混淆）               │
└────────────────┬────────────────────────────────────────┘
                 │ 调用 Presenter 方法
┌────────────────▼────────────────────────────────────────┐
│                      Presenter 层                        │
│  继承 up（混淆后的 BasePresenter），持有 View 弱引用        │
│  例：p000.jl0 / p000.k72 等（均为混淆名）                  │
└────────────────┬────────────────────────────────────────┘
                 │ 调用 Model / Service
┌────────────────▼────────────────────────────────────────┐
│                       Model 层                           │
│  XService（迅雷下载后台服务）                              │
│  data/bean/（API 数据模型）                                │
│  data/db/（本地数据库）                                    │
└─────────────────────────────────────────────────────────┘
```

**注意**：反编译后的 Presenter/接口类名已被混淆为 `p000.up`、`p000.sp`、`p000.jl0` 等。
业务逻辑方法名同样被混淆（如 `bdddqmITkkeGpsxVXHR1l1llll`），阅读时需结合调用关系和参数类型推断语义。

少部分新增功能（如 `LinkDetectViewModel`）使用了 **Jetpack ViewModel + LiveData**，属于局部 MVVM。

### 4.2 数据层架构

```
data/
├── bean/           ← API 请求/响应 POJO（约 80 个类）
│   ├── FtnData         播放传参（核心，含 play_url）
│   ├── XLFile          下载文件信息
│   ├── XLResponse      迅雷通用响应
│   ├── SearchResult    搜索结果
│   ├── HotMovieResponse热门影视响应
│   ├── DoubanResponse  豆瓣数据
│   ├── PlayAddressResponse 播放地址
│   └── ...（其余为各搜索源的响应体）
│
├── db/             ← 本地持久化实体
│   ├── History / HistoryPosition  ← 播放历史（Realm 存储）
│   ├── Favorite / FavoriteMovie   ← 收藏
│   ├── Bookmark                   ← 书签
│   ├── SearchSource               ← 搜索源配置（可自定义）
│   ├── ConfigDB                   ← 应用配置
│   ├── LinkRecord                 ← 链接记录
│   ├── HotMovie / HotMovieDetail  ← 热门影视缓存
│   └── unvalid/（GreenDAO 自动生成代码，可忽略）
│
└── user/           ← 用户系统数据模型（47 个类）
    ├── BaseResponse       用户服务通用响应
    ├── ConfigResponse     服务端配置下发
    ├── ProResponse        会员状态
    ├── AnnouncementResponse 公告
    └── ...（注册/登录/改密等请求响应体）
```

### 4.3 后台服务架构

| Service | 职责 | 交互方式 |
|---------|------|---------|
| `XService` | 迅雷下载引擎宿主，管理所有下载任务的生命周期 | Binder 绑定 + 状态广播 |
| `DLNAService` | 维持 DLNA 投屏连接，监听 `CancelDLNAReceiver` | 前台 Service + 通知栏 |
| `PublishService` | 推送消息服务（应用内通知/公告） | 独立后台 Service |
| `TinkerPatchService` | Tinker 热修复补丁下发服务 | 腾讯 Tinker 框架内置 |

### 4.4 四大组件一览（来自 AndroidManifest）

**Activity（主要）**
| Activity | 功能 |
|----------|------|
| `SplashActivity` | 启动屏，初始化并跳转主页 |
| `MainActivity` | 主页，下载任务列表 |
| `ParseActivity` | 解析 magnet/torrent 链接 |
| `PlayActivity` | 视频播放 |
| `DLNASearchActivity` | 搜索 DLNA 设备 |
| `DLNAControlActivity` | DLNA 投屏控制 |
| `SearchActivity` | 搜索入口 |
| `WebViewFragment`/`BrowserActivity` | 内嵌浏览器 |
| `LoginActivity` / `RegisterActivity` | 用户登录注册 |
| `UserActivity` | 个人中心 |
| `SettingActivity` / `SettingsActivity` | 应用设置 |
| `AboutActivity` | 关于页 |
| `ProActivity` | 会员购买 |
| `HistoryActivity` | 播放历史 |
| `PhotoViewActivity` | 图片查看 |

**权限清单**
| 权限 | 用途 |
|------|------|
| `INTERNET` | 网络访问（下载 + API） |
| `ACCESS_NETWORK_STATE` | 检测网络状态 |
| `ACCESS_WIFI_STATE` | DLNA 需要 WiFi 信息 |
| `READ/WRITE_EXTERNAL_STORAGE` | 读写本地文件（下载保存） |
| `READ_PHONE_STATE` | 设备唯一标识（SDK 初始化） |
| `CAMERA` | 扫码功能 |
| `WAKE_LOCK` | 下载时保持 CPU 唤醒 |
| `REQUEST_INSTALL_PACKAGES` | Tinker 热修复安装补丁 |
| `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` | 后台下载不被杀死 |

---

## 五、其他技术方案

### 5.1 WebView 搜索 + 广告拦截

- `WebViewFragment` — 内嵌 WebView 搜索磁力资源
- `XAdBlockWebView extends AdblockWebView` — 集成 AdblockPlus SDK，拦截搜索页广告
- 支持多搜索源切换（`SearchSource`、`SearchSourceManager`），用户可自定义搜索站点

### 5.2 数据库方案

| 框架 | 用于存储 | 说明 |
|------|---------|------|
| **Realm** (`librealm-jni.so`) | 播放历史（`HistoryPosition`）、收藏、影评缓存 | 文件路径 `files/default.realm` |
| **GreenDAO** (`org.greenrobot.greendao`) | 黑名单/无效词（`UnvalidDao`、`DaoSession`） | SQLite 轻量补充 |

### 5.3 崩溃上报

- **Bugly** (`libBugly.so`) + `BuglyProvider` — 腾讯 Bugly SDK，崩溃日志上报
- **Firebase Crashlytics** (`libcrashlytics*.so`) — Google Crashlytics 双保险

### 5.4 热修复

- 集成 **Tinker**（微信开源），注册了多个 `TinkerPatchService` 和 `ActivityStubs`
- 补丁通过 `UpgradeProvider` 进行下发检测

### 5.5 其他三方库完整清单

| 包名前缀 | 库名 | 用途 |
|---------|------|------|
| `okhttp3` | OkHttp 3.x | HTTP 网络请求基础库（178 个类） |
| `retrofit2` | Retrofit 2.x | REST API 封装 |
| `rx` | RxJava | 异步响应式编程 |
| `com.google.gson` | Gson | JSON 序列化/反序列化 |
| `com.alibaba.fastjson` | FastJSON | 部分场景 JSON 解析 |
| `com.bumptech.glide` | Glide | 图片加载 |
| `io.realm` | Realm | 移动端数据库 |
| `org.greenrobot.eventbus` | EventBus 3 | 组件间事件总线 |
| `org.greenrobot.greendao` | GreenDAO | SQLite ORM |
| `org.fourthline.cling` | Cling | DLNA/UPnP 协议实现 |
| `com.danikula.videocache` | AndroidVideoCache | HTTP 视频代理缓存（补充方案） |
| `com.shuyu.gsyvideoplayer` | GSYVideoPlayer | 视频播放 UI 框架 |
| `tv.danmaku.ijk.media` | IjkPlayer | B站视频播放引擎（FFmpeg） |
| `com.tencent.bugly` | Bugly | 崩溃上报 |
| `com.tencent.tinker` | Tinker | 热修复 |
| `com.github` | 各开源组件 | 工具类库集合 |
| `com.afollestad.materialdialogs` | MaterialDialogs | Material 风格对话框 |
| `com.ashokvarma.bottomnavigation` | BottomNavigation | 底部导航栏 |
| `com.arlib.floatingsearchview` | FloatingSearchView | 浮动搜索框 |
| `com.drakeet.multitype` | MultiType | RecyclerView 多类型适配 |
| `com.elvishew.xlog` | XLog | 日志框架 |
| `com.daimajia.androidanimations` | AndroidAnimations | 动画库 |
| `com.flaviofaria.kenburnsview` | KenBurnsView | 图片 Ken Burns 动效 |
| `com.flipboard.bottomsheet` | BottomSheet | 底部弹出面板 |
| `com.liulishuo.filedownloader` | FileDownloader | 廖子尧文件下载器（备用下载） |
| `com.linsh.utilseverywhere` | UtilsEverywhere | Android 工具类集合 |
| `com.mikepenz` | MaterialDrawer 等 | 侧边抽屉导航 |
| `com.journeyapps` | ZXing Android | 二维码扫码 |
| `com.genymobile.mirror` | Mirror | 反射工具库 |
| `com.iflytek` | 讯飞 SDK | 语音识别（搜索语音输入） |
| `com.squareup.picasso` | Picasso | 图片加载（部分场景） |
| `com.getkeepsafe.relinker` | ReLinker | 安全加载 Native .so 库 |
| `com.wang` | ColorPicker 等 | UI 控件 |
| `com.othershe` | CombineDrawable 等 | Drawable 工具 |
| `de.*` / `fi.*` / `moe.*` | 国际化工具库 | UPnP 相关辅助 |
| `master.flame.danmaku` | DanmakuFlameMaster | 弹幕引擎（B站开源） |
| `androidx` | AndroidX 组件 | 现代 Android 基础库 |
| `p000` | （混淆的内部库） | 4145 个类，主要为 Kotlin 标准库、网络层封装、MVP 框架等经过混淆的依赖 |

> **p000 包说明**：这是 jadx 反编译时对无法识别包名的类统一归入的 `p000` 命名空间。4145 个类均来自原 APK 被混淆的内部依赖（包含 Kotlin stdlib 混淆部分、自研网络框架、MVP 基类等）。阅读业务代码时可忽略其具体实现，仅关注它们对外暴露的接口即可。

---

## 六、反编译代码阅读指南

### 6.1 混淆类名说明

本项目经过**代码混淆（ProGuard/R8）**，反编译后存在大量如下特征的类名：

```
bpdqqiQNVROMLC1ll1l1l11.java   ← 随机字母 + 数字组合
dbpqdHhmDSIHIJiwc1ll1l1.java   ← 同上
p000.jl0 / p000.k72 / p000.up  ← jadx 归入 p000 包的混淆类
```

**阅读策略：**

1. **只关注 `com.magicmagnet.*` 命名正常的类** — 这些是业务核心，虽然方法名也被混淆，但类名和文件结构保留了语义
2. **通过方法参数类型和返回值推断语义** — 例如返回 `XLTaskInfo` 的方法必然与下载进度查询相关
3. **善用 IDE 的"Find Usages"** — 找到混淆类被谁调用，从调用方推断其功能
4. **关注 `@Override` 注释** — jadx 会在 `@Override` 后标注父类/接口的原始方法名，是还原语义的捷径：
   ```java
   @Override // android.app.Service
   public IBinder onBind(Intent intent) { ... }

   @Override // p000.sp    ← 说明 sp 是某 View 接口
   public void bdddqmITkkeGpsxVXHR1l1llll(String str, boolean z) { ... }
   ```
5. **`/* loaded from: ... */` 注释** — 每个类头部都有来源 DEX 路径，可以快速定位类属于哪个 DEX

### 6.2 典型反编译代码示例

以 `XService` 为例，混淆后的关键模式：

```java
// 字段名已混淆，但类型保留了语义
public final class XService extends Service {
    private no1 ppbdpwWWljzmXXdHNabfWhgjl111l11;  // no1 是某下载状态监听接口
    private final y40 ddbbbeXHXx111ll;              // y40 可能是 Handler/Observable

    // 内部类继承/实现了可识别类型
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements qh<File> {
        // qh<File> → 返回 File 的 Callable/Supplier 接口
    }

    // BroadcastReceiver 子类名称保留了语义
    public static final class CancelReceiver extends BroadcastReceiver { }
}
```

**解读技巧：** 看 `extends` / `implements` 后面的类型，以及方法的注解（`@Override`），这两处是混淆后残留的最多语义信息。

### 6.3 jadx 实用技巧

```bash
# 反混淆（--deobf）+ 最小化混淆命名阈值（--deobf-min 2）
jadx --deobf --deobf-min 2 xxx.dex -d out/

# 导出为 Gradle 项目（可直接在 Android Studio 打开）
jadx --export-gradle magicmagnet.apk -d jadx_gradle_out/

# 搜索特定字符串（适合找 API key、URL 等）
jadx-gui 中使用 Ctrl+Shift+F（全局搜索）

# 命令行搜索
grep -rn "api.magicmagnet\|http://\|https://" out/ | grep "\.java:" | grep -v "Binary"
```

### 6.4 调试注意事项

- 反编译的代码**不能直接编译运行**，因为 `p000.*` 等类缺少 stub，且 Native so 与源码签名绑定
- 如需二次打包，需要：① 修复所有 import 错误 ② 重新签名 ③ 处理 Native so 的签名校验
- 本项目仅用于**学习研究**，还原的源码仅供分析参考

---

## 七、快速上手（新同学）

如果你是第一次接触这个项目，推荐按以下顺序阅读：

### 第 1 步：了解应用入口
```
MagicMagnetApp.java      ← Application，了解全局初始化了哪些模块
AndroidManifest.xml      ← 了解四大组件注册情况
common/activity/SplashActivity.java  ← 启动屏，看跳转逻辑
```

### 第 2 步：主流程（下载）
```
main/view/MainActivity.java     ← 主页
main/view/MainFragment.java     ← 主页 Fragment，任务列表渲染
main/view/ParseActivity.java    ← 输入/解析 magnet 链接
common/service/XService.java    ← 下载服务（绑定 XLDownloadManager）
```

### 第 3 步：迅雷 SDK 核心
```
com/xunlei/downloadlib/
├── MagicXLoader.java        ← SDK 初始化、加载 libmagicmagnetsdk.so
├── XLDownloadManager.java   ← 所有下载 API（createBtMagnetTask / startTask / getLocalUrl）
├── XLLoader.java            ← JNI native 方法声明
└── parameter/               ← 所有参数/结果数据结构
```

### 第 4 步：播放流程
```
play/PlayActivity.java   ← 播放页，接收 FtnData 启动
play/VideoView.java      ← 自定义播放器 View（GSY + IJK）
data/bean/FtnData.java   ← 播放参数（最重要的数据结构）
```

### 第 5 步：进阶模块
```
dlna/search/DLNASearchDialogFragment.java    ← DLNA 设备发现
dlna/control/DLNAControlActivity.java        ← 投屏控制
search/view/WebViewFragment.java             ← WebView 搜索
data/db/*.java                               ← 数据库实体
```

---

## 八、常见问题

**Q: 为什么很多方法体是空的？**
> 反编译过程中，部分内联方法或被优化的方法体可能为空。这是 R8 优化 + jadx 反编译不完全的结果，不影响整体架构理解。

**Q: `p000.xxx` 是什么类，怎么看懂？**
> 是混淆后无法还原包名的第三方/内部依赖类。通过 `@Override` 注解、参数类型、调用方上下文推断其语义即可，通常不需要深入阅读其实现。

**Q: 能直接编译运行这个项目吗？**
> 不能。反编译源码存在以下问题：① `p000.*` 包没有 jar 依赖  ② Native so 库有签名校验  ③ 部分反编译代码语法不合法。本项目仅用于学习研究。

**Q: jadx 反编译时报 `UnsupportedClassVersionError`？**
> 需要 Java 17+。执行：
> ```bash
> export JAVA_HOME=/Library/Java/JavaVirtualMachines/openjdk-17.jdk/Contents/Home
> jadx --deobf ...
> ```

**Q: Frida 连接失败 / `Failed to spawn: timeout`？**
> ① 确认 frida-server 已在模拟器后台运行（`adb shell ps | grep frida`）
> ② frida PC 端与 frida-server 版本必须完全一致
> ③ 用 `frida-ps -U` 验证连接，确认能列出进程
> ④ 若 `spawn` 超时，尝试先手动启动应用再用 `frida -U -n com.magicmagnet -l dexdump.js`

**Q: pull 出来的 DEX 反编译后找不到 `com.magicmagnet.*`？**
> 确认 pull 的是正确路径：`/data/data/com.magicmagnet/files/prodexdir/`。
> 若路径不存在，说明壳将 DEX 存放在了其他位置，需用 Frida 脚本的内存扫描方案（方案6）从内存中 dump。

---

## 九、应用基本信息

| 字段 | 值 |
|------|----|
| 包名 | `com.magicmagnet` |
| 版本 | 4.3.8 (100) |
| 最低 SDK | 21 (Android 5.0) |
| 目标 SDK | 33 (Android 13) |
| 加固方案 | 娜迦 Shella 4.5.3.9 |
| 主要语言 | Kotlin（编译后反编译为 Java） |

