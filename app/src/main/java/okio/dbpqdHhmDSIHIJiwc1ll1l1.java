package okio;

import java.io.IOException;
import kotlin.Metadata;
import p000.aj1;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class dbpqdHhmDSIHIJiwc1ll1l1 extends okio.dpbdbdpbLwkLpObyKsq1lll1 {
    public static final C2065dbpqdHhmDSIHIJiwc1ll1l1 Companion = null;
    private static final long IDLE_TIMEOUT_MILLIS = 0;
    private static final long IDLE_TIMEOUT_NANOS = 0;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static dbpqdHhmDSIHIJiwc1ll1l1 head;
    private boolean inQueue;
    private dbpqdHhmDSIHIJiwc1ll1l1 next;
    private long timeoutAt;

    @Metadata
    /* renamed from: okio.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    public static final class C2065dbpqdHhmDSIHIJiwc1ll1l1 {
        private C2065dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public /* synthetic */ C2065dbpqdHhmDSIHIJiwc1ll1l1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        private final void bpdqqiQNVROMLC1ll1l1l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, long j, boolean z) {
        }

        public static final /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(C2065dbpqdHhmDSIHIJiwc1ll1l1 c2065dbpqdHhmDSIHIJiwc1ll1l1, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public static final /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(C2065dbpqdHhmDSIHIJiwc1ll1l1 c2065dbpqdHhmDSIHIJiwc1ll1l1, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, long j, boolean z) {
        }

        private final boolean dpbdpqRKAscW1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public final dbpqdHhmDSIHIJiwc1ll1l1 dqqppqiKzJi1l1lll1l() throws InterruptedException {
        }
    }

    @Metadata
    private static final class dpbdbdpbLwkLpObyKsq1lll1 extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    @Metadata
    public static final class dpbdpqRKAscW1lll1l implements cl1 {
        final /* synthetic */ cl1 bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, cl1 cl1Var) {
        }

        @Override // p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1 dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }

        @Override // p000.cl1
        public /* bridge */ /* synthetic */ okio.dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }

        public String toString() {
        }
    }

    @Metadata
    public static final class dqqppqiKzJi1l1lll1l implements aj1 {
        final /* synthetic */ aj1 bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, aj1 aj1Var) {
        }

        @Override // p000.aj1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1 dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.aj1, java.io.Flushable
        public void flush() {
        }

        @Override // p000.aj1
        public /* bridge */ /* synthetic */ okio.dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }

        public String toString() {
        }

        @Override // p000.aj1
        public void write(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }
    }

    public static final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 access$getHead$cp() {
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
    }

    public static final /* synthetic */ boolean access$getInQueue$p(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public static final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 access$getNext$p(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public static final /* synthetic */ long access$remainingNanos(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, long j) {
    }

    public static final /* synthetic */ void access$setHead$cp(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public static final /* synthetic */ void access$setInQueue$p(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, boolean z) {
    }

    public static final /* synthetic */ void access$setNext$p(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l12) {
    }

    public static final /* synthetic */ void access$setTimeoutAt$p(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, long j) {
    }

    private final long remainingNanos(long j) {
    }

    public final IOException access$newTimeoutException(IOException iOException) {
    }

    public final void enter() {
    }

    public final boolean exit() {
    }

    protected IOException newTimeoutException(IOException iOException) {
    }

    public final aj1 sink(aj1 aj1Var) {
    }

    public final cl1 source(cl1 cl1Var) {
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(qh<? extends T> qhVar) {
    }
}
