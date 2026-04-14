package io.realm.internal;

import io.realm.internal.bpdqqiQNVROMLC1ll1l1l11;
import p000.el0;
import p000.jg0;
import p000.s41;
import p000.u41;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OsObject implements jg0 {
    private static final long nativeFinalizerPtr = 0;
    private final long nativePtr;
    private bpdqqiQNVROMLC1ll1l1l11<dpbdbdpbLwkLpObyKsq1lll1> observerPairs;

    private static class dbpqdHhmDSIHIJiwc1ll1l1 implements bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1<dpbdbdpbLwkLpObyKsq1lll1> {
        private final String[] dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(String[] strArr) {
        }

        private el0 dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // io.realm.internal.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public /* bridge */ /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, Object obj) {
        }

        public void dqqppqiKzJi1l1lll1l(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, Object obj) {
        }
    }

    public static class dpbdbdpbLwkLpObyKsq1lll1<T extends s41> extends bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1<T, u41<T>> {
        public dpbdbdpbLwkLpObyKsq1lll1(T t, u41<T> u41Var) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1(T t, el0 el0Var) {
        }
    }

    private static class dqqppqiKzJi1l1lll1l implements el0 {
        final String[] dbpqdHhmDSIHIJiwc1ll1l1;
        final boolean dpbdbdpbLwkLpObyKsq1lll1;

        dqqppqiKzJi1l1lll1l(String[] strArr, boolean z) {
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
    }

    public static UncheckedRow create(Table table) {
    }

    public static long createEmbeddedObject(Table table, long j, long j2) {
    }

    public static long createRow(Table table) {
    }

    public static long createRowWithPrimaryKey(Table table, long j, Object obj) {
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
    }

    private static native long nativeCreate(long j, long j2);

    private static native long nativeCreateEmbeddedObject(long j, long j2, long j3);

    private static native long nativeCreateNewObject(long j);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateRow(long j);

    private static native long nativeCreateRowWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j, long j2, long j3, String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private void notifyChangeListeners(String[] strArr) {
    }

    public <T extends s41> void addListener(T t, u41<T> u41Var) {
    }

    @Override // p000.jg0
    public long getNativeFinalizerPtr() {
    }

    @Override // p000.jg0
    public long getNativePtr() {
    }

    public <T extends s41> void removeListener(T t) {
    }

    public void setObserverPairs(bpdqqiQNVROMLC1ll1l1l11<dpbdbdpbLwkLpObyKsq1lll1> bpdqqiqnvromlc1ll1l1l11) {
    }

    public <T extends s41> void removeListener(T t, u41<T> u41Var) {
    }
}
