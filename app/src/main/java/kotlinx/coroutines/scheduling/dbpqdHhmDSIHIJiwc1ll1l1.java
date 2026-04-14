package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import p000.dp1;
import p000.mq1;
import p000.nq1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.u42;
import p000.x61;
import p000.xc0;
import p000.zk;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class dbpqdHhmDSIHIJiwc1ll1l1 implements Executor, Closeable {
    private static final /* synthetic */ AtomicIntegerFieldUpdater bdddqmITkkeGpsxVXHR1l1llll = null;
    private static final /* synthetic */ AtomicLongFieldUpdater ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll = null;
    public static final dp1 dqdqbpQposEBDyDxIyyz1ll11 = null;
    public static final C2059dbpqdHhmDSIHIJiwc1ll1l1 pbppbpqbamJRy11l1l1 = null;
    static final /* synthetic */ AtomicLongFieldUpdater qbdpqpstJKhhKkXrsOGvbWw1l1llll = null;
    private volatile /* synthetic */ int _isTerminated;
    public final int bpdqqiQNVROMLC1ll1l1l11;
    volatile /* synthetic */ long controlState;
    public final x61<dqqppqiKzJi1l1lll1l> dbppbdqpeLmcbs11l11;
    public final zk ddbbbeXHXx111ll;
    public final int dpbdpqRKAscW1lll1l;
    public final zk dqpdbEevAufTOvPphbjykClll1l11;
    public final String dqpqqqbqQyjyB11111l1;
    private volatile /* synthetic */ long parkedWorkersStack;
    public final long ppbdpwWWljzmXXdHNabfWhgjl111l11;

    @Metadata
    /* renamed from: kotlinx.coroutines.scheduling.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    public static final class C2059dbpqdHhmDSIHIJiwc1ll1l1 {
        private C2059dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ C2059dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    @xc0
    public /* synthetic */ class dpbdbdpbLwkLpObyKsq1lll1 {
        public static final /* synthetic */ int[] dbpqdHhmDSIHIJiwc1ll1l1 = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @Metadata
    public static final class dpbdpqRKAscW1lll1l {
        public static final dpbdpqRKAscW1lll1l bpdqqiQNVROMLC1ll1l1l11 = null;
        public static final dpbdpqRKAscW1lll1l ddbbbeXHXx111ll = null;
        public static final dpbdpqRKAscW1lll1l dpbdpqRKAscW1lll1l = null;
        private static final /* synthetic */ dpbdpqRKAscW1lll1l[] dqpdbEevAufTOvPphbjykClll1l11 = null;
        public static final dpbdpqRKAscW1lll1l dqpqqqbqQyjyB11111l1 = null;
        public static final dpbdpqRKAscW1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;

        private dpbdpqRKAscW1lll1l(String str, int i) {
        }

        private static final /* synthetic */ dpbdpqRKAscW1lll1l[] dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public static dpbdpqRKAscW1lll1l valueOf(String str) {
        }

        public static dpbdpqRKAscW1lll1l[] values() {
        }
    }

    public dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2, long j, String str) {
    }

    private final int bdddqmITkkeGpsxVXHR1l1llll(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    private final void bpbbpOxqjGWQAsycX11ll1l1(boolean z) {
    }

    static /* synthetic */ boolean bpqbbqTOKdRXac1ll1l1lll(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, long j, int i, Object obj) {
    }

    private final mq1 bpqdqbqpviKiORjqgp1l111l11(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, mq1 mq1Var, boolean z) {
    }

    public static /* synthetic */ void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, Runnable runnable, nq1 nq1Var, boolean z, int i, Object obj) {
    }

    private final boolean dpbdbdpbLwkLpObyKsq1lll1(mq1 mq1Var) {
    }

    private final int dpbdpqRKAscW1lll1l() {
    }

    private final dqqppqiKzJi1l1lll1l dqdqbpQposEBDyDxIyyz1ll11() {
    }

    private final dqqppqiKzJi1l1lll1l dqpqqqbqQyjyB11111l1() {
    }

    private final boolean pdpqbmApOBCmNMwnn1ll111(long j) {
    }

    private final boolean qbpbddbpyaPAbpThgWCvm11l11l1() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final boolean dbbpdqqpdVUhpQ1ll11(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    public final void dbppbdqpeLmcbs11l11(Runnable runnable, nq1 nq1Var, boolean z) {
    }

    public final void dddbpbpNqzZZJmSG1111l() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }

    public final boolean isTerminated() {
    }

    public final mq1 ppbdpwWWljzmXXdHNabfWhgjl111l11(Runnable runnable, nq1 nq1Var) {
    }

    public final void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, int i, int i2) {
    }

    public final void qdqdpyALEmZFGGaahRTIU1ll11(mq1 mq1Var) {
    }

    public final void qppqdpppIauLKaAtRkB11111l(long j) {
    }

    public String toString() {
    }

    @Metadata
    public final class dqqppqiKzJi1l1lll1l extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater pbppbpqbamJRy11l1l1 = null;
        public dpbdpqRKAscW1lll1l bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dbppbdqpeLmcbs11l11;
        private int ddbbbeXHXx111ll;
        public final u42 dpbdpqRKAscW1lll1l;
        public boolean dqpdbEevAufTOvPphbjykClll1l11;
        private long dqpqqqbqQyjyB11111l1;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private long ppbdpwWWljzmXXdHNabfWhgjl111l11;
        volatile /* synthetic */ int workerCtl;

        private dqqppqiKzJi1l1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        private final void bbdbbpdOJSuInlll111l() {
        }

        private final void bdddqmITkkeGpsxVXHR1l1llll() {
        }

        private final mq1 bpdqqiQNVROMLC1ll1l1l11(boolean z) {
        }

        private final mq1 bppbpdbCeZVhQNTixBml1lll11l(boolean z) {
        }

        private final boolean dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
        }

        private final boolean dbppbdqpeLmcbs11l11() {
        }

        public static final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        private final void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
        }

        private final void dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }

        private final void dpbdpqRKAscW1lll1l(mq1 mq1Var) {
        }

        private final void dqpdbEevAufTOvPphbjykClll1l11(int i) {
        }

        private final void dqqppqiKzJi1l1lll1l(int i) {
        }

        private final mq1 qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
        }

        private final void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
        }

        public final boolean dbbpdqqpdVUhpQ1ll11(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
        }

        public final Object ddbbbeXHXx111ll() {
        }

        public final void dqdqbpQposEBDyDxIyyz1ll11(int i) {
        }

        public final int dqpqqqbqQyjyB11111l1() {
        }

        public final int pbppbpqbamJRy11l1l1(int i) {
        }

        public final mq1 ppbdpwWWljzmXXdHNabfWhgjl111l11(boolean z) {
        }

        public final void qbddqbdJBkudFfhX1ll1l111(Object obj) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public dqqppqiKzJi1l1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i) {
        }
    }
}
