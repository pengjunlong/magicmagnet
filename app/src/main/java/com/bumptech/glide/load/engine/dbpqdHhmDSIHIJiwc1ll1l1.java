package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.dqdqbpQposEBDyDxIyyz1ll11;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import p000.a71;
import p000.v10;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class dbpqdHhmDSIHIJiwc1ll1l1 {
    private dqdqbpQposEBDyDxIyyz1ll11.dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11;
    private final boolean dbpqdHhmDSIHIJiwc1ll1l1;
    private final Executor dpbdbdpbLwkLpObyKsq1lll1;
    private final ReferenceQueue<dqdqbpQposEBDyDxIyyz1ll11<?>> dpbdpqRKAscW1lll1l;
    private volatile dqqppqiKzJi1l1lll1l dqpqqqbqQyjyB11111l1;
    final Map<v10, dpbdpqRKAscW1lll1l> dqqppqiKzJi1l1lll1l;
    private volatile boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

    /* renamed from: com.bumptech.glide.load.engine.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    class ThreadFactoryC2001dbpqdHhmDSIHIJiwc1ll1l1 implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
        class RunnableC2002dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ ThreadFactoryC2001dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ Runnable dpbdpqRKAscW1lll1l;

            RunnableC2002dbpqdHhmDSIHIJiwc1ll1l1(ThreadFactoryC2001dbpqdHhmDSIHIJiwc1ll1l1 threadFactoryC2001dbpqdHhmDSIHIJiwc1ll1l1, Runnable runnable) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        ThreadFactoryC2001dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static final class dpbdpqRKAscW1lll1l extends WeakReference<dqdqbpQposEBDyDxIyyz1ll11<?>> {
        final v10 dbpqdHhmDSIHIJiwc1ll1l1;
        final boolean dpbdbdpbLwkLpObyKsq1lll1;
        a71<?> dqqppqiKzJi1l1lll1l;

        dpbdpqRKAscW1lll1l(v10 v10Var, dqdqbpQposEBDyDxIyyz1ll11<?> dqdqbpqposebdydxiyyz1ll11, ReferenceQueue<? super dqdqbpQposEBDyDxIyyz1ll11<?>> referenceQueue, boolean z) {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    interface dqqppqiKzJi1l1lll1l {
        void dbpqdHhmDSIHIJiwc1ll1l1();
    }

    dbpqdHhmDSIHIJiwc1ll1l1(boolean z) {
    }

    synchronized dqdqbpQposEBDyDxIyyz1ll11<?> bpdqqiQNVROMLC1ll1l1l11(v10 v10Var) {
    }

    synchronized void dbpqdHhmDSIHIJiwc1ll1l1(v10 v10Var, dqdqbpQposEBDyDxIyyz1ll11<?> dqdqbpqposebdydxiyyz1ll11) {
    }

    void dpbdbdpbLwkLpObyKsq1lll1() {
    }

    synchronized void dpbdpqRKAscW1lll1l(v10 v10Var) {
    }

    void dqqppqiKzJi1l1lll1l(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
    }

    void ppbdpwWWljzmXXdHNabfWhgjl111l11(dqdqbpQposEBDyDxIyyz1ll11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    dbpqdHhmDSIHIJiwc1ll1l1(boolean z, Executor executor) {
    }
}
