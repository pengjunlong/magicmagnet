package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11;
import androidx.appcompat.widget.ddddbbdqIccDnEitQc1l1l1l;
import java.util.List;
import p000.pc0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class dpbdbdpbLwkLpObyKsq1lll1 extends ddbbbeXHXx111ll implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int bpqbbqTOKdRXac1ll1l1lll = 0;
    private View bbdbbpdOJSuInlll111l;
    private final View.OnAttachStateChangeListener bdddqmITkkeGpsxVXHR1l1llll;
    private boolean bpbbpOxqjGWQAsycX11ll1l1;
    private final Context bpdqqiQNVROMLC1ll1l1l11;
    private int bppbpdbCeZVhQNTixBml1lll11l;
    private boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 bpqdqbqpviKiORjqgp1l111l11;
    private int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    View dbbpdqqpdVUhpQ1ll11;
    ViewTreeObserver dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    final Handler dbppbdqpeLmcbs11l11;
    private final int ddbbbeXHXx111ll;
    private boolean dddbpbpNqzZZJmSG1111l;
    private PopupWindow.OnDismissListener ddddbbdqIccDnEitQc1l1l1l;
    final List<dpbdpqRKAscW1lll1l> ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final pc0 dqdqbpQposEBDyDxIyyz1ll11;
    private final boolean dqpdbEevAufTOvPphbjykClll1l11;
    private final int dqpqqqbqQyjyB11111l1;
    private final List<bpdqqiQNVROMLC1ll1l1l11> pbppbpqbamJRy11l1l1;
    boolean pdpqbmApOBCmNMwnn1ll111;
    private final int ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private int qbddqbdJBkudFfhX1ll1l111;
    final ViewTreeObserver.OnGlobalLayoutListener qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private int qdqdpyALEmZFGGaahRTIU1ll11;
    private int qppqdpppIauLKaAtRkB11111l;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* renamed from: androidx.appcompat.view.menu.dpbdbdpbLwkLpObyKsq1lll1$dpbdbdpbLwkLpObyKsq1lll1, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC1912dpbdbdpbLwkLpObyKsq1lll1 implements View.OnAttachStateChangeListener {
        final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;

        ViewOnAttachStateChangeListenerC1912dpbdbdpbLwkLpObyKsq1lll1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    private static class dpbdpqRKAscW1lll1l {
        public final ddddbbdqIccDnEitQc1l1l1l dbpqdHhmDSIHIJiwc1ll1l1;
        public final bpdqqiQNVROMLC1ll1l1l11 dpbdbdpbLwkLpObyKsq1lll1;
        public final int dqqppqiKzJi1l1lll1l;

        public dpbdpqRKAscW1lll1l(ddddbbdqIccDnEitQc1l1l1l ddddbbdqiccdneitqc1l1l1l, bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, int i) {
        }

        public ListView dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    class dqqppqiKzJi1l1lll1l implements pc0 {
        final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ MenuItem bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ dpbdpqRKAscW1lll1l dpbdpqRKAscW1lll1l;
            final /* synthetic */ dqqppqiKzJi1l1lll1l dqpqqqbqQyjyB11111l1;
            final /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, MenuItem menuItem, bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        dqqppqiKzJi1l1lll1l(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        @Override // p000.pc0
        public void dqqppqiKzJi1l1lll1l(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
        }

        @Override // p000.pc0
        public void qbdpqpstJKhhKkXrsOGvbWw1l1llll(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
        }
    }

    public dpbdbdpbLwkLpObyKsq1lll1(Context context, View view, int i, int i2, boolean z) {
    }

    private int bbdbbpdOJSuInlll111l(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    private View bppbpdbCeZVhQNTixBml1lll11l(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    private int bpppdpppqFAXRSTHUAmVJLvH11lllll1l(int i) {
    }

    private ddddbbdqIccDnEitQc1l1l1l dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
    }

    private MenuItem dbbpdqqpdVUhpQ1ll11(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l112) {
    }

    private int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    private void qdqdpyALEmZFGGaahRTIU1ll11(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    @Override // p000.cg1
    public ListView bdddqmITkkeGpsxVXHR1l1llll() {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    public void dbppbdqpeLmcbs11l11(int i) {
    }

    @Override // p000.cg1
    public boolean dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    public void ddbbbeXHXx111ll(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(boolean z) {
    }

    @Override // p000.cg1
    public void dismiss() {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    public void dpbdbdpbLwkLpObyKsq1lll1(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    public void dqpdbEevAufTOvPphbjykClll1l11(int i) {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    protected boolean dqqppqiKzJi1l1lll1l() {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean flagActionItems() {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void onCloseMenu(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean onSubMenuSelected(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    public void pbppbpqbamJRy11l1l1(PopupWindow.OnDismissListener onDismissListener) {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    public void ppbdpwWWljzmXXdHNabfWhgjl111l11(View view) {
    }

    @Override // androidx.appcompat.view.menu.ddbbbeXHXx111ll
    public void qbdpqpstJKhhKkXrsOGvbWw1l1llll(int i) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void setCallback(dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    @Override // p000.cg1
    public void show() {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void updateMenuView(boolean z) {
    }
}
