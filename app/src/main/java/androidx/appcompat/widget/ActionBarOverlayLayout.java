package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11;
import p000.dbbbpqvUTKVDNyPZHLllll111l;
import p000.ddpppsnTvuMTCFFfnFiYul1111;
import p000.pg0;
import p000.qg0;
import p000.rg0;
import p000.sg0;

@SuppressLint({"UnknownNullness"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ActionBarOverlayLayout extends ViewGroup implements ddpppsnTvuMTCFFfnFiYul1111, rg0, pg0, qg0 {
    static final int[] qqpbppebHUxqEmlGoAJWl1lll = null;
    private final Rect bbdbbpdOJSuInlll111l;
    boolean bdddqmITkkeGpsxVXHR1l1llll;
    private androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll bpbbpOxqjGWQAsycX11ll1l1;
    private int bpdqqiQNVROMLC1ll1l1l11;
    private final Rect bppbpdbCeZVhQNTixBml1lll11l;
    private final Rect bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private final Runnable bpppqdQjfPiCT111111111;
    final AnimatorListenerAdapter bpqbbqTOKdRXac1ll1l1lll;
    private androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll bpqdqbqpviKiORjqgp1l111l11;
    private final Rect dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final Rect dbbpdqqpdVUhpQ1ll11;
    private dpbdpqRKAscW1lll1l dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private boolean dbppbdqpeLmcbs11l11;
    private dbbbpqvUTKVDNyPZHLllll111l ddbbbeXHXx111ll;
    private androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll dddbpbpNqzZZJmSG1111l;
    private OverScroller ddddbbdqIccDnEitQc1l1l1l;
    private boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private int dpbdpqRKAscW1lll1l;
    private int dqdqbpQposEBDyDxIyyz1ll11;
    private Drawable dqpdbEevAufTOvPphbjykClll1l11;
    ActionBarContainer dqpqqqbqQyjyB11111l1;
    private final sg0 dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private boolean pbppbpqbamJRy11l1l1;
    ViewPropertyAnimator pdpqbmApOBCmNMwnn1ll111;
    private ContentFrameLayout ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private int qbddqbdJBkudFfhX1ll1l111;
    private boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private final Rect qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private final Runnable qbpbddbpyaPAbpThgWCvm11l11l1;
    private final Rect qdqdpyALEmZFGGaahRTIU1ll11;
    private androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll qppqdpppIauLKaAtRkB11111l;

    public static class bpdqqiQNVROMLC1ll1l1l11 extends ViewGroup.MarginLayoutParams {
        public bpdqqiQNVROMLC1ll1l1l11(Context context, AttributeSet attributeSet) {
        }

        public bpdqqiQNVROMLC1ll1l1l11(int i, int i2) {
        }

        public bpdqqiQNVROMLC1ll1l1l11(ViewGroup.LayoutParams layoutParams) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 extends AnimatorListenerAdapter {
        final /* synthetic */ ActionBarOverlayLayout dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(ActionBarOverlayLayout actionBarOverlayLayout) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
        final /* synthetic */ ActionBarOverlayLayout dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(ActionBarOverlayLayout actionBarOverlayLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface dpbdpqRKAscW1lll1l {
        void bpdqqiQNVROMLC1ll1l1l11();

        void dbpqdHhmDSIHIJiwc1ll1l1();

        void dpbdbdpbLwkLpObyKsq1lll1(int i);

        void dpbdpqRKAscW1lll1l(boolean z);

        void dqqppqiKzJi1l1lll1l();

        void ppbdpwWWljzmXXdHNabfWhgjl111l11();
    }

    class dqqppqiKzJi1l1lll1l implements Runnable {
        final /* synthetic */ ActionBarOverlayLayout dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(ActionBarOverlayLayout actionBarOverlayLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
    }

    private void bbdbbpdOJSuInlll111l() {
    }

    private dbbbpqvUTKVDNyPZHLllll111l bdddqmITkkeGpsxVXHR1l1llll(View view) {
    }

    private boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l(float f) {
    }

    private void dbbpdqqpdVUhpQ1ll11() {
    }

    private void dbppbdqpeLmcbs11l11() {
    }

    private boolean pbppbpqbamJRy11l1l1(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    private void qbddqbdJBkudFfhX1ll1l111(Context context) {
    }

    private void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public boolean bpdqqiQNVROMLC1ll1l1l11() {
    }

    void bppbpdbCeZVhQNTixBml1lll11l() {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public boolean dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public boolean dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public void ddbbbeXHXx111ll(int i) {
    }

    protected bpdqqiQNVROMLC1ll1l1l11 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public boolean dpbdbdpbLwkLpObyKsq1lll1() {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public void dpbdpqRKAscW1lll1l(Menu menu, dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    void dqdqbpQposEBDyDxIyyz1ll11() {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public void dqpdbEevAufTOvPphbjykClll1l11() {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public boolean dqpqqqbqQyjyB11111l1() {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public boolean dqqppqiKzJi1l1lll1l() {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getActionBarHideOffset() {
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
    }

    public CharSequence getTitle() {
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onNestedPreFling(View view, float f, float f2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.pg0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // p000.qg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // p000.pg0
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    @Override // p000.pg0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
    }

    @Override // p000.pg0
    public void onStopNestedScroll(View view, int i) {
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public void ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }

    public bpdqqiQNVROMLC1ll1l1l11 qbdpqpstJKhhKkXrsOGvbWw1l1llll(AttributeSet attributeSet) {
    }

    public void setActionBarHideOffset(int i) {
    }

    public void setActionBarVisibilityCallback(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
    }

    public void setHasNonEmbeddedTabs(boolean z) {
    }

    public void setHideOnContentScrollEnabled(boolean z) {
    }

    public void setIcon(int i) {
    }

    public void setLogo(int i) {
    }

    public void setOverlayMode(boolean z) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public void setWindowCallback(Window.Callback callback) {
    }

    @Override // p000.ddpppsnTvuMTCFFfnFiYul1111
    public void setWindowTitle(CharSequence charSequence) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // p000.pg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedScrollAccepted(View view, View view2, int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onStartNestedScroll(View view, View view2, int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onStopNestedScroll(View view) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    public void setIcon(Drawable drawable) {
    }
}
