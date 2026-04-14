package com.tencent.bugly.beta.tinker;

import com.tencent.tinker.lib.util.TinkerLog;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerLogger implements TinkerLog.TinkerLogImp {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 5;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    private static final String TAG = "Tinker.TinkerLogger";
    private static int level;

    public static int getLogLevel() {
    }

    public static void setLevel(int i) {
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    /* renamed from: d */
    public void mo97d(String str, String str2, Object... objArr) {
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    /* renamed from: e */
    public void mo98e(String str, String str2, Object... objArr) {
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    /* renamed from: i */
    public void mo99i(String str, String str2, Object... objArr) {
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    /* renamed from: v */
    public void mo100v(String str, String str2, Object... objArr) {
    }

    @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
    /* renamed from: w */
    public void mo101w(String str, String str2, Object... objArr) {
    }
}
