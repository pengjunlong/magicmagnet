package io.realm.internal;

import io.realm.internal.ObservableCollection;
import java.util.Iterator;
import java.util.ListIterator;
import p000.f41;
import p000.hp0;
import p000.jg0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OsResults implements jg0, ObservableCollection {
    private static final long pbppbpqbamJRy11l1l1 = 0;
    private final OsSharedRealm bpdqqiQNVROMLC1ll1l1l11;
    protected final bpdqqiQNVROMLC1ll1l1l11<ObservableCollection.dpbdbdpbLwkLpObyKsq1lll1> dbppbdqpeLmcbs11l11;
    protected boolean ddbbbeXHXx111ll;
    private final long dpbdpqRKAscW1lll1l;
    private boolean dqpdbEevAufTOvPphbjykClll1l11;
    private final Table dqpqqqbqQyjyB11111l1;
    private final io.realm.internal.dqqppqiKzJi1l1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11;

    public static abstract class dbpqdHhmDSIHIJiwc1ll1l1<T> implements Iterator<T> {
        protected int bpdqqiQNVROMLC1ll1l1l11;
        protected OsResults dpbdpqRKAscW1lll1l;

        public dbpqdHhmDSIHIJiwc1ll1l1(OsResults osResults) {
        }

        void bpdqqiQNVROMLC1ll1l1l11() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        protected abstract T dpbdpqRKAscW1lll1l(int i, OsResults osResults);

        T dqqppqiKzJi1l1lll1l(int i) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
        }
    }

    public static abstract class dpbdbdpbLwkLpObyKsq1lll1<T> extends dbpqdHhmDSIHIJiwc1ll1l1<T> implements ListIterator<T> {
        public dpbdbdpbLwkLpObyKsq1lll1(OsResults osResults, int i) {
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void add(T t) {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        public T previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void set(T t) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class dqqppqiKzJi1l1lll1l {
        public static final dqqppqiKzJi1l1lll1l bpdqqiQNVROMLC1ll1l1l11 = null;
        public static final dqqppqiKzJi1l1lll1l ddbbbeXHXx111ll = null;
        public static final dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l = null;
        private static final /* synthetic */ dqqppqiKzJi1l1lll1l[] dqpdbEevAufTOvPphbjykClll1l11 = null;
        public static final dqqppqiKzJi1l1lll1l dqpqqqbqQyjyB11111l1 = null;
        public static final dqqppqiKzJi1l1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;

        private dqqppqiKzJi1l1lll1l(String str, int i) {
        }

        static dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1(byte b) {
        }

        public static dqqppqiKzJi1l1lll1l valueOf(String str) {
        }

        public static dqqppqiKzJi1l1lll1l[] values() {
        }
    }

    OsResults(OsSharedRealm osSharedRealm, Table table, long j) {
    }

    static /* synthetic */ OsSharedRealm dbpqdHhmDSIHIJiwc1ll1l1(OsResults osResults) {
    }

    static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(OsResults osResults) {
    }

    private static native void nativeClear(long j);

    protected static native long nativeCreateResults(long j, long j2);

    private static native long nativeCreateSnapshot(long j);

    private static native void nativeEvaluateQueryIfNeeded(long j, boolean z);

    private static native long nativeFirstRow(long j);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j);

    private static native long nativeGetRow(long j, int i);

    private static native Object nativeGetValue(long j, int i);

    private static native boolean nativeIsValid(long j);

    private static native long nativeSize(long j);

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    public static OsResults ppbdpwWWljzmXXdHNabfWhgjl111l11(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
    }

    public long bbdbbpdOJSuInlll111l() {
    }

    public void bdddqmITkkeGpsxVXHR1l1llll() {
    }

    public void bpdqqiQNVROMLC1ll1l1l11() {
    }

    public <T> void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(T t, f41<T> f41Var) {
    }

    public UncheckedRow dbppbdqpeLmcbs11l11(int i) {
    }

    public UncheckedRow ddbbbeXHXx111ll() {
    }

    public boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    public <T> void dpbdpqRKAscW1lll1l(T t, f41<T> f41Var) {
    }

    public void dqdqbpQposEBDyDxIyyz1ll11() {
    }

    public dqqppqiKzJi1l1lll1l dqpdbEevAufTOvPphbjykClll1l11() {
    }

    public OsResults dqpqqqbqQyjyB11111l1() {
    }

    public <T> void dqqppqiKzJi1l1lll1l(T t, hp0<T> hp0Var) {
    }

    @Override // p000.jg0
    public long getNativeFinalizerPtr() {
    }

    @Override // p000.jg0
    public long getNativePtr() {
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
    }

    public Object pbppbpqbamJRy11l1l1(int i) {
    }

    public <T> void qbddqbdJBkudFfhX1ll1l111(T t, hp0<T> hp0Var) {
    }

    public boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
    }
}
