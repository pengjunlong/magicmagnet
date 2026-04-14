package com.tencent.bugly.beta.tinker;

import java.lang.Thread;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final String DALVIK_XPOSED_CRASH = "Class ref in pre-verified class resolved to unexpected implementation";
    public static final int MAX_CRASH_COUNT = 3;
    private static final long QUICK_CRASH_ELAPSE = 10000;
    private static final String TAG = "Tinker.TinkerUncaughtExceptionHandler";
    private final Thread.UncaughtExceptionHandler ueh;

    private boolean tinkerFastCrashProtect() {
    }

    private void tinkerPreVerifiedCrashHandler(Throwable th) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
    }
}
