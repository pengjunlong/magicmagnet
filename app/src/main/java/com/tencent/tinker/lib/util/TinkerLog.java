package com.tencent.tinker.lib.util;

import com.tencent.tinker.loader.shareutil.ShareTinkerLog;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerLog {
    private static final String TAG = "Tinker.TinkerLog";

    public interface TinkerLogImp extends ShareTinkerLog.TinkerLogImp {
    }

    /* renamed from: d */
    public static void m842d(String str, String str2, Object... objArr) {
    }

    /* renamed from: e */
    public static void m843e(String str, String str2, Object... objArr) {
    }

    public static ShareTinkerLog.TinkerLogImp getImpl() {
    }

    /* renamed from: i */
    public static void m844i(String str, String str2, Object... objArr) {
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
    }

    public static void printPendingLogs() {
    }

    public static void setTinkerLogImp(TinkerLogImp tinkerLogImp) {
    }

    /* renamed from: v */
    public static void m845v(String str, String str2, Object... objArr) {
    }

    /* renamed from: w */
    public static void m846w(String str, String str2, Object... objArr) {
    }
}
