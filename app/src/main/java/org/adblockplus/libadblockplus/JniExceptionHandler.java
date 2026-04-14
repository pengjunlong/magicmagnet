package org.adblockplus.libadblockplus;

import android.annotation.SuppressLint;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class JniExceptionHandler {
    private static final String TAG = null;
    private static LogWorker logWorker;

    static /* synthetic */ String access$200() {
    }

    public static void logException(Throwable th) {
    }

    private static final class LogWorker implements Runnable {
        LinkedBlockingQueue<Throwable> exceptionQueue;

        private LogWorker() {
        }

        static /* synthetic */ void access$100(LogWorker logWorker, Throwable th) {
        }

        private void logException(Throwable th) {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"LogNotTimber"})
        public void run() {
        }

        /* synthetic */ LogWorker(C17381 c17381) {
        }
    }
}
