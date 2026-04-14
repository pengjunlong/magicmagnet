package androidx.core.provider;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import p000.dqqbbdbpuvRfPll1lll1l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class ddbbbeXHXx111ll {

    private static class dbpqdHhmDSIHIJiwc1ll1l1 implements ThreadFactory {
        private int bpdqqiQNVROMLC1ll1l1l11;
        private String dpbdpqRKAscW1lll1l;

        /* renamed from: androidx.core.provider.ddbbbeXHXx111ll$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
        private static class C1937dbpqdHhmDSIHIJiwc1ll1l1 extends Thread {
            private final int dpbdpqRKAscW1lll1l;

            C1937dbpqdHhmDSIHIJiwc1ll1l1(Runnable runnable, String str, int i) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        dbpqdHhmDSIHIJiwc1ll1l1(String str, int i) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    private static class dpbdbdpbLwkLpObyKsq1lll1<T> implements Runnable {
        private dqqbbdbpuvRfPll1lll1l<T> bpdqqiQNVROMLC1ll1l1l11;
        private Callable<T> dpbdpqRKAscW1lll1l;
        private Handler ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ Object bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ dqqbbdbpuvRfPll1lll1l dpbdpqRKAscW1lll1l;
            final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, dqqbbdbpuvRfPll1lll1l dqqbbdbpuvrfpll1lll1l, Object obj) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        dpbdbdpbLwkLpObyKsq1lll1(Handler handler, Callable<T> callable, dqqbbdbpuvRfPll1lll1l<T> dqqbbdbpuvrfpll1lll1l) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static ThreadPoolExecutor dbpqdHhmDSIHIJiwc1ll1l1(String str, int i, int i2) {
    }

    static <T> void dpbdbdpbLwkLpObyKsq1lll1(Executor executor, Callable<T> callable, dqqbbdbpuvRfPll1lll1l<T> dqqbbdbpuvrfpll1lll1l) {
    }

    static <T> T dqqppqiKzJi1l1lll1l(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
    }
}
