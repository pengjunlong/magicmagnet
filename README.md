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

加固原理：应用启动时，壳在内存中解密真实 DEX 并动态加载，因此在内存中可以拿到明文 DEX。

#### 3.1 环境搭建

```bash
# PC 端安装 frida
pip install frida-tools

# 将 frida-server 推送到模拟器（aarch64 版本）
adb push frida-server /data/local/tmp/
adb shell "chmod 755 /data/local/tmp/frida-server"
adb shell "/data/local/tmp/frida-server &"

# 安装目标 APK
adb install magicmagnet.apk
```

#### 3.2 脱壳脚本策略

通过 Frida 脚本 Hook 以下关键点，在 DEX 被解密加载到内存后进行 Dump：
- Java 层：`DexFile` 构造函数、`InMemoryDexClassLoader`、`BaseDexClassLoader`
- Native 层：`libart.so!OpenMemory`、`mmap`
- 主动内存扫描：搜索 DEX magic header (`dex\n035`)

使用 Python 脚本控制 Frida 会话生命周期，等待 30~45 秒让壳充分解密：

```python
import frida, time

pkg = "com.magicmagnet"
device = frida.get_usb_device(timeout=10)
pid = device.spawn([pkg])
session = device.attach(pid)
script = session.create_script(JS_SCRIPT)
script.on("message", on_message)
script.load()
device.resume(pid)
time.sleep(45)  # 等待壳解密完成
session.detach()
```

#### 3.3 成功提取 DEX

从模拟器 `/data/data/com.magicmagnet/` 中成功 pull 出三个解密后的 DEX：

```
00O000ll111l_0.dex   ← 主业务 DEX（com.magicmagnet.*）
00O000ll111l_1.dex   ← 次业务 DEX（play、dlna、data.bean 等）
00O000ll111l_2.dex   ← 迅雷 SDK DEX（com.xunlei.downloadlib.*）
```

验证方式（DEX 合法性检查）：
```bash
xxd 00O000ll111l_0.dex | head -2
# 正确结果: 64 65 78 0a 30 33 35 00  → "dex\n035\0"
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
│   │   ├── play/                 ← 视频播放模块
│   │   ├── dlna/                 ← DLNA 投屏模块
│   │   ├── main/view/            ← 主页（下载任务管理）
│   │   ├── search/               ← 搜索模块（内嵌 WebView）
│   │   ├── history/              ← 播放历史
│   │   ├── data/bean/            ← 数据模型
│   │   ├── common/service/       ← XService（下载服务）
│   │   └── ...
│   └── com/xunlei/downloadlib/  ← 迅雷下载 SDK（反编译源码）
│       ├── XLDownloadManager.java
│       ├── MagicXLoader.java
│       ├── XLLoader.java         ← JNI 接口（所有 native 方法）
│       └── parameter/            ← 参数数据结构
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

## 四、其他技术方案

### WebView 搜索 + 广告拦截

- `WebViewFragment` — 内嵌 WebView 搜索磁力资源
- `XAdBlockWebView extends AdblockWebView` — 集成 AdblockPlus SDK，拦截搜索页广告

### 数据库

- 使用 **Realm** (`librealm-jni.so`) 存储播放历史（`HistoryPosition`）

### 崩溃上报

- **Bugly** (`libBugly.so`) + **Firebase Crashlytics** (`libcrashlytics*.so`)

### 热修复

- 集成 **Tinker**（`MTinkerApplication`）支持热修复补丁

---

## 五、应用基本信息

| 字段 | 值 |
|------|----|
| 包名 | `com.magicmagnet` |
| 版本 | 4.3.8 (100) |
| 最低 SDK | 21 (Android 5.0) |
| 目标 SDK | 33 (Android 13) |
| 加固方案 | 娜迦 Shella 4.5.3.9 |
| 主要语言 | Kotlin（编译后反编译为 Java） |

