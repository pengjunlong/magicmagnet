package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class SafeLoggingExecutor implements Executor {
    private final Executor delegate;

    static class SafeLoggingRunnable implements Runnable {
        private final Runnable delegate;

        SafeLoggingRunnable(Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    SafeLoggingExecutor(Executor executor) {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }
}
