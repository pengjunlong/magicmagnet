package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class tk implements ExecutorService {
    private static final long bpdqqiQNVROMLC1ll1l1l11 = 0;
    private static volatile int ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private final ExecutorService dpbdpqRKAscW1lll1l;

    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private String bpdqqiQNVROMLC1ll1l1l11;
        private final boolean dbpqdHhmDSIHIJiwc1ll1l1;
        private int dpbdbdpbLwkLpObyKsq1lll1;
        private dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l;
        private int dqqppqiKzJi1l1lll1l;
        private long ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dbpqdHhmDSIHIJiwc1ll1l1(boolean z) {
        }

        public tk dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1 dpbdbdpbLwkLpObyKsq1lll1(String str) {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1 dqqppqiKzJi1l1lll1l(int i) {
        }
    }

    private static final class dpbdbdpbLwkLpObyKsq1lll1 implements ThreadFactory {
        final dqqppqiKzJi1l1lll1l bpdqqiQNVROMLC1ll1l1l11;
        private final String dpbdpqRKAscW1lll1l;
        private int dqpqqqbqQyjyB11111l1;
        final boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 extends Thread {
            final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, Runnable runnable, String str) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        dpbdbdpbLwkLpObyKsq1lll1(String str, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, boolean z) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
        }
    }

    public interface dqqppqiKzJi1l1lll1l {
        public static final dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1 = null;
        public static final dqqppqiKzJi1l1lll1l dpbdbdpbLwkLpObyKsq1lll1 = null;
        public static final dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l = null;
        public static final dqqppqiKzJi1l1lll1l dqqppqiKzJi1l1lll1l = null;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements dqqppqiKzJi1l1lll1l {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // tk.dqqppqiKzJi1l1lll1l
            public void dbpqdHhmDSIHIJiwc1ll1l1(Throwable th) {
            }
        }

        class dpbdbdpbLwkLpObyKsq1lll1 implements dqqppqiKzJi1l1lll1l {
            dpbdbdpbLwkLpObyKsq1lll1() {
            }

            @Override // tk.dqqppqiKzJi1l1lll1l
            public void dbpqdHhmDSIHIJiwc1ll1l1(Throwable th) {
            }
        }

        /* renamed from: tk$dqqppqiKzJi1l1lll1l$dqqppqiKzJi1l1lll1l, reason: collision with other inner class name */
        class C2089dqqppqiKzJi1l1lll1l implements dqqppqiKzJi1l1lll1l {
            C2089dqqppqiKzJi1l1lll1l() {
            }

            @Override // tk.dqqppqiKzJi1l1lll1l
            public void dbpqdHhmDSIHIJiwc1ll1l1(Throwable th) {
            }
        }

        void dbpqdHhmDSIHIJiwc1ll1l1(Throwable th);
    }

    tk(ExecutorService executorService) {
    }

    public static tk bpdqqiQNVROMLC1ll1l1l11() {
    }

    public static int dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    public static tk ddbbbeXHXx111ll() {
    }

    public static dbpqdHhmDSIHIJiwc1ll1l1 dpbdbdpbLwkLpObyKsq1lll1() {
    }

    public static dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l() {
    }

    public static tk dqpqqqbqQyjyB11111l1() {
    }

    public static tk dqqppqiKzJi1l1lll1l() {
    }

    public static dbpqdHhmDSIHIJiwc1ll1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
    }

    public String toString() {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
    }
}
