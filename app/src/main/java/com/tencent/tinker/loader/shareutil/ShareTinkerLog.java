package com.tencent.tinker.loader.shareutil;

import android.os.Handler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ShareTinkerLog {
    public static final int FN_LOG_PRINT_PENDING_LOGS = 4002;
    public static final int FN_LOG_PRINT_STACKTRACE = 4001;
    private static final String TAG = "Tinker.ShareTinkerLog";
    private static final TinkerLogImp debugLog = null;
    private static final TinkerLogImp[] tinkerLogImpRef = null;
    private static final Handler[] tinkerLogInlineFenceRef = null;

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareTinkerLog$1 */
    static class C16571 implements TinkerLogImp {
        C16571() {
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

    public interface TinkerLogImp {
        /* renamed from: d */
        void mo97d(String str, String str2, Object... objArr);

        /* renamed from: e */
        void mo98e(String str, String str2, Object... objArr);

        /* renamed from: i */
        void mo99i(String str, String str2, Object... objArr);

        void printErrStackTrace(String str, Throwable th, String str2, Object... objArr);

        /* renamed from: v */
        void mo100v(String str, String str2, Object... objArr);

        /* renamed from: w */
        void mo101w(String str, String str2, Object... objArr);
    }

    /* renamed from: d */
    public static void m847d(String str, String str2, Object... objArr) {
    }

    /* renamed from: e */
    public static void m848e(String str, String str2, Object... objArr) {
    }

    public static TinkerLogImp getDefaultImpl() {
    }

    public static TinkerLogImp getImpl() {
    }

    private static Handler getInlineFence() {
    }

    /* renamed from: i */
    public static void m849i(String str, String str2, Object... objArr) {
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
    }

    private static void printLog(int i, String str, String str2, Object... objArr) {
    }

    public static void printPendingLogs() {
    }

    public static void setTinkerLogImp(TinkerLogImp tinkerLogImp) {
    }

    /* renamed from: v */
    public static void m850v(String str, String str2, Object... objArr) {
    }

    /* renamed from: w */
    public static void m851w(String str, String str2, Object... objArr) {
    }

    private static void printLog(String str, Throwable th, String str2, Object... objArr) {
    }
}
