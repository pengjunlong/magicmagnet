package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.dqpqqqbqQyjyB11111l1;
import androidx.lifecycle.qbdpqpstJKhhKkXrsOGvbWw1l1llll;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p000.dpdbbbqbsGpwLpmeeQKDSr1111l;
import p000.dpqdqqqbNHDsaj1l11l;
import p000.q50;
import p000.qdqbpdqJlgbar11l1l;
import p000.r50;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class ViewDataBinding extends qdqbpdqJlgbar11l1l {
    private static final androidx.databinding.dbpqdHhmDSIHIJiwc1ll1l1 bbdbbpdOJSuInlll111l = null;
    private static final int bdddqmITkkeGpsxVXHR1l1llll = 8;
    private static final dpqdqqqbNHDsaj1l11l<Object, ViewDataBinding, Void> bppbpdbCeZVhQNTixBml1lll11l = null;
    private static final View.OnAttachStateChangeListener bpppdpppqFAXRSTHUAmVJLvH11lllll1l = null;
    private static final androidx.databinding.dbpqdHhmDSIHIJiwc1ll1l1 dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 = null;
    private static final androidx.databinding.dbpqdHhmDSIHIJiwc1ll1l1 dbbpdqqpdVUhpQ1ll11 = null;
    private static final boolean dqdqbpQposEBDyDxIyyz1ll11 = false;
    private static final androidx.databinding.dbpqdHhmDSIHIJiwc1ll1l1 qbddqbdJBkudFfhX1ll1l111 = null;
    static int qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private static final ReferenceQueue<ViewDataBinding> qbdqqpbqpCWRpIKEKtzoceYOll1ll1l = null;
    private final View bpdqqiQNVROMLC1ll1l1l11;
    protected final dpdbbbqbsGpwLpmeeQKDSr1111l dbppbdqpeLmcbs11l11;
    private final Runnable dbpqdHhmDSIHIJiwc1ll1l1;
    private final Choreographer.FrameCallback ddbbbeXHXx111ll;
    private r50 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private boolean dpbdbdpbLwkLpObyKsq1lll1;
    private androidx.databinding.dpbdpqRKAscW1lll1l[] dpbdpqRKAscW1lll1l;
    private Handler dqpdbEevAufTOvPphbjykClll1l11;
    private Choreographer dqpqqqbqQyjyB11111l1;
    private boolean dqqppqiKzJi1l1lll1l;
    private ViewDataBinding pbppbpqbamJRy11l1l1;
    private boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

    static class OnStartListener implements q50 {
        final WeakReference<ViewDataBinding> dpbdpqRKAscW1lll1l;

        @qbdpqpstJKhhKkXrsOGvbWw1l1llll(dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1.ON_START)
        public void onStart() {
        }
    }

    class bpdqqiQNVROMLC1ll1l1l11 extends dpqdqqqbNHDsaj1l11l<Object, ViewDataBinding, Void> {
        bpdqqiQNVROMLC1ll1l1l11() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements androidx.databinding.dbpqdHhmDSIHIJiwc1ll1l1 {
        dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    class ddbbbeXHXx111ll implements Choreographer.FrameCallback {
        final /* synthetic */ ViewDataBinding dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(ViewDataBinding viewDataBinding) {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements androidx.databinding.dbpqdHhmDSIHIJiwc1ll1l1 {
        dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    class dpbdpqRKAscW1lll1l implements androidx.databinding.dbpqdHhmDSIHIJiwc1ll1l1 {
        dpbdpqRKAscW1lll1l() {
        }
    }

    protected static class dqpdbEevAufTOvPphbjykClll1l11 {
    }

    class dqpqqqbqQyjyB11111l1 implements Runnable {
        final /* synthetic */ ViewDataBinding dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(ViewDataBinding viewDataBinding) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dqqppqiKzJi1l1lll1l implements androidx.databinding.dbpqdHhmDSIHIJiwc1ll1l1 {
        dqqppqiKzJi1l1lll1l() {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements View.OnAttachStateChangeListener {
        ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    protected ViewDataBinding(dpdbbbqbsGpwLpmeeQKDSr1111l dpdbbbqbsgpwlpmeeqkdsr1111l, View view, int i) {
    }

    protected static Object[] bdddqmITkkeGpsxVXHR1l1llll(dpdbbbqbsGpwLpmeeQKDSr1111l dpdbbbqbsgpwlpmeeqkdsr1111l, View view, int i, dqpdbEevAufTOvPphbjykClll1l11 dqpdbeevauftovpphbjykclll1l11, SparseIntArray sparseIntArray) {
    }

    static /* synthetic */ View.OnAttachStateChangeListener bpdqqiQNVROMLC1ll1l1l11() {
    }

    static ViewDataBinding dbppbdqpeLmcbs11l11(View view) {
    }

    static /* synthetic */ Runnable dbpqdHhmDSIHIJiwc1ll1l1(ViewDataBinding viewDataBinding) {
    }

    private void ddbbbeXHXx111ll() {
    }

    private static boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(String str, int i) {
    }

    static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(ViewDataBinding viewDataBinding, boolean z) {
    }

    static /* synthetic */ View dpbdpqRKAscW1lll1l(ViewDataBinding viewDataBinding) {
    }

    private static int dqdqbpQposEBDyDxIyyz1ll11(String str, int i) {
    }

    static /* synthetic */ void dqqppqiKzJi1l1lll1l() {
    }

    private static dpdbbbqbsGpwLpmeeQKDSr1111l ppbdpwWWljzmXXdHNabfWhgjl111l11(Object obj) {
    }

    private static void qbddqbdJBkudFfhX1ll1l111() {
    }

    private static void qbdpqpstJKhhKkXrsOGvbWw1l1llll(dpdbbbqbsGpwLpmeeQKDSr1111l dpdbbbqbsgpwlpmeeqkdsr1111l, View view, Object[] objArr, dqpdbEevAufTOvPphbjykClll1l11 dqpdbeevauftovpphbjykclll1l11, SparseIntArray sparseIntArray, boolean z) {
    }

    protected void bbdbbpdOJSuInlll111l(View view) {
    }

    protected void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
    }

    public void dqpdbEevAufTOvPphbjykClll1l11() {
    }

    protected abstract void dqpqqqbqQyjyB11111l1();

    public abstract boolean pbppbpqbamJRy11l1l1();

    protected ViewDataBinding(Object obj, View view, int i) {
    }
}
