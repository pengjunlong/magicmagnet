package androidx.lifecycle;

import androidx.lifecycle.dqpqqqbqQyjyB11111l1;
import p000.l91;
import p000.r50;
import p000.zl0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class LiveData<T> {
    static final Object pbppbpqbamJRy11l1l1 = null;
    private volatile Object bpdqqiQNVROMLC1ll1l1l11;
    private final Runnable dbppbdqpeLmcbs11l11;
    final Object dbpqdHhmDSIHIJiwc1ll1l1;
    private boolean ddbbbeXHXx111ll;
    private l91<zl0<? super T>, LiveData<T>.dqqppqiKzJi1l1lll1l> dpbdbdpbLwkLpObyKsq1lll1;
    private boolean dpbdpqRKAscW1lll1l;
    private boolean dqpdbEevAufTOvPphbjykClll1l11;
    private int dqpqqqbqQyjyB11111l1;
    int dqqppqiKzJi1l1lll1l;
    volatile Object ppbdpwWWljzmXXdHNabfWhgjl111l11;

    class LifecycleBoundObserver extends LiveData<T>.dqqppqiKzJi1l1lll1l implements dqpdbEevAufTOvPphbjykClll1l11 {
        final r50 ddbbbeXHXx111ll;
        final /* synthetic */ LiveData dqpdbEevAufTOvPphbjykClll1l11;

        LifecycleBoundObserver(LiveData liveData, r50 r50Var, zl0<? super T> zl0Var) {
        }

        @Override // androidx.lifecycle.LiveData.dqqppqiKzJi1l1lll1l
        boolean dbppbdqpeLmcbs11l11(r50 r50Var) {
        }

        @Override // androidx.lifecycle.dqpdbEevAufTOvPphbjykClll1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(r50 r50Var, dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        @Override // androidx.lifecycle.LiveData.dqqppqiKzJi1l1lll1l
        void dqpdbEevAufTOvPphbjykClll1l11() {
        }

        @Override // androidx.lifecycle.LiveData.dqqppqiKzJi1l1lll1l
        boolean pbppbpqbamJRy11l1l1() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
        final /* synthetic */ LiveData dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(LiveData liveData) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private class dpbdbdpbLwkLpObyKsq1lll1 extends LiveData<T>.dqqppqiKzJi1l1lll1l {
        final /* synthetic */ LiveData ddbbbeXHXx111ll;

        dpbdbdpbLwkLpObyKsq1lll1(LiveData liveData, zl0<? super T> zl0Var) {
        }

        @Override // androidx.lifecycle.LiveData.dqqppqiKzJi1l1lll1l
        boolean pbppbpqbamJRy11l1l1() {
        }
    }

    private abstract class dqqppqiKzJi1l1lll1l {
        boolean bpdqqiQNVROMLC1ll1l1l11;
        final zl0<? super T> dpbdpqRKAscW1lll1l;
        final /* synthetic */ LiveData dqpqqqbqQyjyB11111l1;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dqqppqiKzJi1l1lll1l(LiveData liveData, zl0<? super T> zl0Var) {
        }

        boolean dbppbdqpeLmcbs11l11(r50 r50Var) {
        }

        void dqpdbEevAufTOvPphbjykClll1l11() {
        }

        void dqpqqqbqQyjyB11111l1(boolean z) {
        }

        abstract boolean pbppbpqbamJRy11l1l1();
    }

    public LiveData(T t) {
    }

    static void dbpqdHhmDSIHIJiwc1ll1l1(String str) {
    }

    private void dqqppqiKzJi1l1lll1l(LiveData<T>.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    public T bpdqqiQNVROMLC1ll1l1l11() {
    }

    protected void dbppbdqpeLmcbs11l11(T t) {
    }

    protected void ddbbbeXHXx111ll() {
    }

    public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(r50 r50Var) {
    }

    void dpbdbdpbLwkLpObyKsq1lll1(int i) {
    }

    void dpbdpqRKAscW1lll1l(LiveData<T>.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    protected void dqpdbEevAufTOvPphbjykClll1l11() {
    }

    public void dqpqqqbqQyjyB11111l1(zl0<? super T> zl0Var) {
    }

    public void pbppbpqbamJRy11l1l1(zl0<? super T> zl0Var) {
    }

    public void ppbdpwWWljzmXXdHNabfWhgjl111l11(r50 r50Var, zl0<? super T> zl0Var) {
    }

    protected void qbdpqpstJKhhKkXrsOGvbWw1l1llll(T t) {
    }

    public LiveData() {
    }
}
