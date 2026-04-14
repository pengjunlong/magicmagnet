package com.tencent.tinker.loader;

import android.content.Context;
import java.io.File;
import java.lang.Thread;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerUncaughtHandler implements Thread.UncaughtExceptionHandler {
    private static final String TAG = "Tinker.UncaughtHandler";
    private final Context context;
    private final File crashFile;
    private final Thread.UncaughtExceptionHandler ueh;

    public TinkerUncaughtHandler(Context context) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
    }
}
