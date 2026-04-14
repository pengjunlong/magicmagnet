package io.realm.internal.objectstore;

import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import java.io.Closeable;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import p000.d41;
import p000.s41;
import p000.zu;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OsObjectBuilder implements Closeable {
    private static bpqpbicsQtfVpOtr11l1l<Double> bbdbbpdOJSuInlll111l;
    private static bpqpbicsQtfVpOtr11l1l<Decimal128> bddbppbdHQMVgPvQSDhmnXZYkDh1ll111;
    private static bpqpbicsQtfVpOtr11l1l<Integer> bdddqmITkkeGpsxVXHR1l1llll;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, ObjectId>> bdpdqYMMfHmzHyUIbllllll1;
    private static bpqpbicsQtfVpOtr11l1l<Short> bdqbblVddTYAmqrWwacZmi111ll1;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Boolean>> bpbbpOxqjGWQAsycX11ll1l1;
    private static bpqpbicsQtfVpOtr11l1l<io.realm.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l> bpbbpbppqsLrtEPjeDMEnOv1l1l1;
    private static bpqpbicsQtfVpOtr11l1l<Double> bpbqbqdqqjASPQfJSXuVkkgll1lll1ll;
    private static bpqpbicsQtfVpOtr11l1l<Boolean> bpdddqbpEtpkwNYukGjjNs1l111;
    private static bpqpbicsQtfVpOtr11l1l<byte[]> bppbpdbCeZVhQNTixBml1lll11l;
    private static bpqpbicsQtfVpOtr11l1l<Decimal128> bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Double>> bpppqdQjfPiCT111111111;
    private static bpqpbicsQtfVpOtr11l1l<Integer> bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Byte>> bpqbbqTOKdRXac1ll1l1lll;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Integer>> bpqdqbqpviKiORjqgp1l111l11;
    private static bpqpbicsQtfVpOtr11l1l<Byte> bpqpbicsQtfVpOtr11l1l;
    private static bpqpbicsQtfVpOtr11l1l<Float> dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private static bpqpbicsQtfVpOtr11l1l<Date> dbbpdqqpdVUhpQ1ll11;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Float>> dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private static bpqpbicsQtfVpOtr11l1l<? extends s41> dbppbdqpeLmcbs11l11;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, String>> dddbpbpNqzZZJmSG1111l;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Long>> ddddbbdqIccDnEitQc1l1l1l;
    private static bpqpbicsQtfVpOtr11l1l<Byte> ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private static bpqpbicsQtfVpOtr11l1l<String> dpbdqAKWNZAIXLyehU1lll1lll1;
    private static bpqpbicsQtfVpOtr11l1l<Long> dqbbdddqpLERmaRLiHiDpL1l1l1l;
    private static bpqpbicsQtfVpOtr11l1l<Long> dqdqbpQposEBDyDxIyyz1ll11;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Date>> dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private static bpqpbicsQtfVpOtr11l1l<UUID> pbdbqZLBIrMLYk1l11l1ll1;
    private static bpqpbicsQtfVpOtr11l1l<Date> pbddqdbpoVvTyZPOoYl1111;
    private static bpqpbicsQtfVpOtr11l1l<String> pbppbpqbamJRy11l1l1;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Short>> pdpqbmApOBCmNMwnn1ll111;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, UUID>> ppdqqzXJzQiU11ll11;
    private static bpqpbicsQtfVpOtr11l1l<byte[]> ppppqdfPOyVswFHMTylxLClll1l1111;
    private static bpqpbicsQtfVpOtr11l1l<Boolean> qbddqbdJBkudFfhX1ll1l111;
    private static bpqpbicsQtfVpOtr11l1l<Short> qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private static bpqpbicsQtfVpOtr11l1l<Object> qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private static bpqpbicsQtfVpOtr11l1l<Float> qbpbbZWTnlDkwOgZlllll;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, byte[]>> qbpbddbpyaPAbpThgWCvm11l11l1;
    private static bpqpbicsQtfVpOtr11l1l<ObjectId> qddbbpxsbNjqxvn111ll;
    private static bpqpbicsQtfVpOtr11l1l<ObjectId> qdqdpyALEmZFGGaahRTIU1ll11;
    private static bpqpbicsQtfVpOtr11l1l<UUID> qppqdpppIauLKaAtRkB11111l;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, io.realm.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l>> qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    private static bpqpbicsQtfVpOtr11l1l<io.realm.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l> qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private static bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Decimal128>> qqpbppebHUxqEmlGoAJWl1lll;
    private final long bpdqqiQNVROMLC1ll1l1l11;
    private final io.realm.internal.dqqppqiKzJi1l1lll1l ddbbbeXHXx111ll;
    private final Table dpbdpqRKAscW1lll1l;
    private final boolean dqpdbEevAufTOvPphbjykClll1l11;
    private final long dqpqqqbqQyjyB11111l1;
    private final long ppbdpwWWljzmXXdHNabfWhgjl111l11;

    class bbdbbpdOJSuInlll111l implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Decimal128>> {
        bbdbbpdOJSuInlll111l() {
        }
    }

    class bdddqmITkkeGpsxVXHR1l1llll implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Byte>> {
        bdddqmITkkeGpsxVXHR1l1llll() {
        }
    }

    class bdpdqYMMfHmzHyUIbllllll1 implements bpqpbicsQtfVpOtr11l1l<ObjectId> {
        bdpdqYMMfHmzHyUIbllllll1() {
        }
    }

    class bdqbblVddTYAmqrWwacZmi111ll1 implements bpqpbicsQtfVpOtr11l1l<Double> {
        bdqbblVddTYAmqrWwacZmi111ll1() {
        }
    }

    class bpbbpOxqjGWQAsycX11ll1l1 implements bpqpbicsQtfVpOtr11l1l<Boolean> {
        bpbbpOxqjGWQAsycX11ll1l1() {
        }
    }

    class bpdddqbpEtpkwNYukGjjNs1l111 implements bpqpbicsQtfVpOtr11l1l<Long> {
        bpdddqbpEtpkwNYukGjjNs1l111() {
        }
    }

    class bpdqqiQNVROMLC1ll1l1l11 implements bpqpbicsQtfVpOtr11l1l<ObjectId> {
        bpdqqiQNVROMLC1ll1l1l11() {
        }
    }

    class bppbpdbCeZVhQNTixBml1lll11l implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, UUID>> {
        bppbpdbCeZVhQNTixBml1lll11l() {
        }
    }

    class bpppdpppqFAXRSTHUAmVJLvH11lllll1l implements bpqpbicsQtfVpOtr11l1l<String> {
        bpppdpppqFAXRSTHUAmVJLvH11lllll1l() {
        }
    }

    class bpppqdQjfPiCT111111111 implements bpqpbicsQtfVpOtr11l1l<byte[]> {
        bpppqdQjfPiCT111111111() {
        }
    }

    class bpqbbpqpqkDmeOUxxUylkHyYgWv11111 implements bpqpbicsQtfVpOtr11l1l<Boolean> {
        bpqbbpqpqkDmeOUxxUylkHyYgWv11111() {
        }
    }

    class bpqbbqTOKdRXac1ll1l1lll implements bpqpbicsQtfVpOtr11l1l<Double> {
        bpqbbqTOKdRXac1ll1l1lll() {
        }
    }

    class bpqdqbqpviKiORjqgp1l111l11 implements bpqpbicsQtfVpOtr11l1l<Long> {
        bpqdqbqpviKiORjqgp1l111l11() {
        }
    }

    private interface bpqpbicsQtfVpOtr11l1l<T> {
    }

    class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Date>> {
        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
        }
    }

    class dbbpdqqpdVUhpQ1ll11 implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, ObjectId>> {
        dbbpdqqpdVUhpQ1ll11() {
        }
    }

    class dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 implements bpqpbicsQtfVpOtr11l1l<Short> {
        dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
        }
    }

    class dbppbdqpeLmcbs11l11 implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Float>> {
        dbppbdqpeLmcbs11l11() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements bpqpbicsQtfVpOtr11l1l<Date> {
        dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    class ddbbbeXHXx111ll implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, String>> {
        ddbbbeXHXx111ll() {
        }
    }

    class dddbpbpNqzZZJmSG1111l implements bpqpbicsQtfVpOtr11l1l<Integer> {
        dddbpbpNqzZZJmSG1111l() {
        }
    }

    class ddddbbdqIccDnEitQc1l1l1l implements bpqpbicsQtfVpOtr11l1l<Byte> {
        ddddbbdqIccDnEitQc1l1l1l() {
        }
    }

    class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Long>> {
        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements bpqpbicsQtfVpOtr11l1l<byte[]> {
        dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    class dpbdpqRKAscW1lll1l implements bpqpbicsQtfVpOtr11l1l<Decimal128> {
        dpbdpqRKAscW1lll1l() {
        }
    }

    class dpbdqAKWNZAIXLyehU1lll1lll1 implements bpqpbicsQtfVpOtr11l1l<Integer> {
        dpbdqAKWNZAIXLyehU1lll1lll1() {
        }
    }

    class dqbbdddqpLERmaRLiHiDpL1l1l1l implements bpqpbicsQtfVpOtr11l1l<Float> {
        dqbbdddqpLERmaRLiHiDpL1l1l1l() {
        }
    }

    class dqdqbpQposEBDyDxIyyz1ll11 implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Double>> {
        dqdqbpQposEBDyDxIyyz1ll11() {
        }
    }

    class dqpdbEevAufTOvPphbjykClll1l11 implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Integer>> {
        dqpdbEevAufTOvPphbjykClll1l11() {
        }
    }

    class dqpqqqbqQyjyB11111l1 implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Boolean>> {
        dqpqqqbqQyjyB11111l1() {
        }
    }

    class dqqpbqaYiRPLeqRCYteXfDW1l111l11l implements bpqpbicsQtfVpOtr11l1l<Date> {
        dqqpbqaYiRPLeqRCYteXfDW1l111l11l() {
        }
    }

    class dqqppqiKzJi1l1lll1l implements bpqpbicsQtfVpOtr11l1l<Object> {
        dqqppqiKzJi1l1lll1l() {
        }
    }

    class pbppbpqbamJRy11l1l1 implements bpqpbicsQtfVpOtr11l1l<s41> {
        pbppbpqbamJRy11l1l1() {
        }
    }

    class pdpqbmApOBCmNMwnn1ll111 implements bpqpbicsQtfVpOtr11l1l<Float> {
        pdpqbmApOBCmNMwnn1ll111() {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements bpqpbicsQtfVpOtr11l1l<UUID> {
        ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }
    }

    class ppdqqzXJzQiU11ll11 implements bpqpbicsQtfVpOtr11l1l<UUID> {
        ppdqqzXJzQiU11ll11() {
        }
    }

    class qbddqbdJBkudFfhX1ll1l111 implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, byte[]>> {
        qbddqbdJBkudFfhX1ll1l111() {
        }
    }

    class qbdpqpstJKhhKkXrsOGvbWw1l1llll implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, Short>> {
        qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
        }
    }

    class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l implements bpqpbicsQtfVpOtr11l1l<Map.Entry<String, io.realm.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l>> {
        private final d41 dbpqdHhmDSIHIJiwc1ll1l1;

        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
        }
    }

    class qbpbddbpyaPAbpThgWCvm11l11l1 implements bpqpbicsQtfVpOtr11l1l<Byte> {
        qbpbddbpyaPAbpThgWCvm11l11l1() {
        }
    }

    class qdqdpyALEmZFGGaahRTIU1ll11 implements bpqpbicsQtfVpOtr11l1l<io.realm.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l> {
        private final d41 dbpqdHhmDSIHIJiwc1ll1l1;

        qdqdpyALEmZFGGaahRTIU1ll11() {
        }
    }

    class qppqdpppIauLKaAtRkB11111l implements bpqpbicsQtfVpOtr11l1l<String> {
        qppqdpppIauLKaAtRkB11111l() {
        }
    }

    class qqbqbddiRRgLpniPxlUfQzP1l1l1l implements bpqpbicsQtfVpOtr11l1l<io.realm.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l> {
        private final d41 dbpqdHhmDSIHIJiwc1ll1l1;

        qqbqbddiRRgLpniPxlUfQzP1l1l1l() {
        }
    }

    class qqdbbfmUWwoYYpfYHJZdaUO1111llll implements bpqpbicsQtfVpOtr11l1l<Short> {
        qqdbbfmUWwoYYpfYHJZdaUO1111llll() {
        }
    }

    class qqpbppebHUxqEmlGoAJWl1lll implements bpqpbicsQtfVpOtr11l1l<Decimal128> {
        qqpbppebHUxqEmlGoAJWl1lll() {
        }
    }

    public OsObjectBuilder(Table table, Set<zu> set) {
    }

    private static native void nativeAddBoolean(long j, long j2, boolean z);

    private static native void nativeAddByteArray(long j, long j2, byte[] bArr);

    private static native void nativeAddDate(long j, long j2, long j3);

    private static native void nativeAddFloat(long j, long j2, float f);

    private static native void nativeAddInteger(long j, long j2, long j3);

    private static native void nativeAddNull(long j, long j2);

    private static native void nativeAddString(long j, long j2, String str);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long j, long j2, long j3, boolean z, boolean z2);

    private static native void nativeDestroyBuilder(long j);

    public void bdddqmITkkeGpsxVXHR1l1llll(long j, String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void dbbpdqqpdVUhpQ1ll11() {
    }

    public void dbppbdqpeLmcbs11l11(long j, Integer num) {
    }

    public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(long j, Long l) {
    }

    public void dpbdbdpbLwkLpObyKsq1lll1(long j, Boolean bool) {
    }

    public void dpbdpqRKAscW1lll1l(long j, byte[] bArr) {
    }

    public UncheckedRow dqdqbpQposEBDyDxIyyz1ll11() {
    }

    public void dqpqqqbqQyjyB11111l1(long j, Float f) {
    }

    public void ppbdpwWWljzmXXdHNabfWhgjl111l11(long j, Date date) {
    }
}
