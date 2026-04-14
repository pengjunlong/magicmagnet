package io.realm;

import android.content.Context;
import io.realm.bppbpdbCeZVhQNTixBml1lll11l;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.UncheckedRow;
import java.io.Closeable;
import java.util.List;
import p000.dddqpBgcDmlll11;
import p000.f81;
import p000.r41;
import p000.s41;
import p000.z41;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class dbpqdHhmDSIHIJiwc1ll1l1 implements Closeable {
    public static final bpdqqiQNVROMLC1ll1l1l11 bdddqmITkkeGpsxVXHR1l1llll = null;
    static final z41 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll = null;
    static volatile Context pbppbpqbamJRy11l1l1;
    public static final z41 qbdpqpstJKhhKkXrsOGvbWw1l1llll = null;
    final long bpdqqiQNVROMLC1ll1l1l11;
    private OsSharedRealm.SchemaChangedCallback dbppbdqpeLmcbs11l11;
    public OsSharedRealm ddbbbeXHXx111ll;
    final boolean dpbdpqRKAscW1lll1l;
    private boolean dqpdbEevAufTOvPphbjykClll1l11;
    private qppqdpppIauLKaAtRkB11111l dqpqqqbqQyjyB11111l1;
    protected final bpbbpOxqjGWQAsycX11ll1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

    static final class bpdqqiQNVROMLC1ll1l1l11 extends ThreadLocal<dpbdpqRKAscW1lll1l> {
        bpdqqiQNVROMLC1ll1l1l11() {
        }

        protected dpbdpqRKAscW1lll1l dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // java.lang.ThreadLocal
        protected /* bridge */ /* synthetic */ dpbdpqRKAscW1lll1l initialValue() {
        }
    }

    /* renamed from: io.realm.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    class C2050dbpqdHhmDSIHIJiwc1ll1l1 implements OsSharedRealm.SchemaChangedCallback {
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;

        C2050dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
        public void onSchemaChanged() {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements OsSharedRealm.InitializationCallback {
        final /* synthetic */ bppbpdbCeZVhQNTixBml1lll11l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdbdpbLwkLpObyKsq1lll1;

        dpbdbdpbLwkLpObyKsq1lll1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, bppbpdbCeZVhQNTixBml1lll11l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l12) {
        }

        @Override // io.realm.internal.OsSharedRealm.InitializationCallback
        public void onInit(OsSharedRealm osSharedRealm) {
        }
    }

    public static final class dpbdpqRKAscW1lll1l {
        private List<String> bpdqqiQNVROMLC1ll1l1l11;
        private dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;
        private f81 dpbdbdpbLwkLpObyKsq1lll1;
        private boolean dpbdpqRKAscW1lll1l;
        private dddqpBgcDmlll11 dqqppqiKzJi1l1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11() {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public List<String> dpbdpqRKAscW1lll1l() {
        }

        public void dqpqqqbqQyjyB11111l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, f81 f81Var, dddqpBgcDmlll11 dddqpbgcdmlll11, boolean z, List<String> list) {
        }

        public dddqpBgcDmlll11 dqqppqiKzJi1l1lll1l() {
        }

        public f81 ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }
    }

    class dqqppqiKzJi1l1lll1l implements OsSharedRealm.MigrationCallback {
        final /* synthetic */ r41 dbpqdHhmDSIHIJiwc1ll1l1;

        dqqppqiKzJi1l1lll1l(r41 r41Var) {
        }

        @Override // io.realm.internal.OsSharedRealm.MigrationCallback
        public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2) {
        }
    }

    dbpqdHhmDSIHIJiwc1ll1l1(qppqdpppIauLKaAtRkB11111l qppqdpppiaulkaatrkb11111l, OsSchemaInfo osSchemaInfo, OsSharedRealm.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private static OsSharedRealm.MigrationCallback dqdqbpQposEBDyDxIyyz1ll11(r41 r41Var) {
    }

    public void bdddqmITkkeGpsxVXHR1l1llll() {
    }

    <E extends s41> E bpbbpOxqjGWQAsycX11ll1l1(Class<E> cls, String str, UncheckedRow uncheckedRow) {
    }

    OsSharedRealm bpqbbqTOKdRXac1ll1l1lll() {
    }

    public String bpqdqbqpviKiORjqgp1l111l11() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    void dbbpdqqpdVUhpQ1ll11() {
    }

    protected void dbppbdqpeLmcbs11l11() {
    }

    public bpbbpOxqjGWQAsycX11ll1l1 dddbpbpNqzZZJmSG1111l() {
    }

    protected void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    public void dpbdbdpbLwkLpObyKsq1lll1() {
    }

    public void dpbdpqRKAscW1lll1l() {
    }

    public void dpbdqAKWNZAIXLyehU1lll1lll1() {
    }

    protected void dqpqqqbqQyjyB11111l1() {
    }

    public boolean dqqpbqaYiRPLeqRCYteXfDW1l111l11l() {
    }

    protected void finalize() throws Throwable {
    }

    public boolean isClosed() {
    }

    public abstract bpqbbqTOKdRXac1ll1l1lll pdpqbmApOBCmNMwnn1ll111();

    protected void ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }

    public abstract dbpqdHhmDSIHIJiwc1ll1l1 qbdqqpbqpCWRpIKEKtzoceYOll1ll1l();

    public long qbpbddbpyaPAbpThgWCvm11l11l1() {
    }

    <E extends s41> E qdqdpyALEmZFGGaahRTIU1ll11(Class<E> cls, long j, boolean z, List<String> list) {
    }

    <E extends s41> E qppqdpppIauLKaAtRkB11111l(Class<E> cls, String str, long j) {
    }

    public boolean qqbqbddiRRgLpniPxlUfQzP1l1l1l() {
    }

    dbpqdHhmDSIHIJiwc1ll1l1(bpbbpOxqjGWQAsycX11ll1l1 bpbbpoxqjgwqasycx11ll1l1, OsSchemaInfo osSchemaInfo, OsSharedRealm.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    dbpqdHhmDSIHIJiwc1ll1l1(OsSharedRealm osSharedRealm) {
    }
}
