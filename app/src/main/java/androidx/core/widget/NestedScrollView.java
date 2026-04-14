package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.ng0;
import p000.og0;
import p000.qg0;
import p000.sg0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class NestedScrollView extends FrameLayout implements qg0, ng0 {
    private static final dbpqdHhmDSIHIJiwc1ll1l1 bpppqdQjfPiCT111111111 = null;
    private static final float bpqbbqTOKdRXac1ll1l1lll = 0.0f;
    private static final int[] qbpbddbpyaPAbpThgWCvm11l11l1 = null;
    private int bbdbbpdOJSuInlll111l;
    private boolean bdddqmITkkeGpsxVXHR1l1llll;
    private int bpbbpOxqjGWQAsycX11ll1l1;
    private long bpdqqiQNVROMLC1ll1l1l11;
    private int bppbpdbCeZVhQNTixBml1lll11l;
    private final int[] bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private final sg0 bpqdqbqpviKiORjqgp1l111l11;
    private boolean dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private int dbbpdqqpdVUhpQ1ll11;
    private final og0 dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private int dbppbdqpeLmcbs11l11;
    public EdgeEffect ddbbbeXHXx111ll;
    private dpbdpqRKAscW1lll1l dddbpbpNqzZZJmSG1111l;
    private float ddddbbdqIccDnEitQc1l1l1l;
    private boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final float dpbdpqRKAscW1lll1l;
    private VelocityTracker dqdqbpQposEBDyDxIyyz1ll11;
    public EdgeEffect dqpdbEevAufTOvPphbjykClll1l11;
    private OverScroller dqpqqqbqQyjyB11111l1;
    private boolean pbppbpqbamJRy11l1l1;
    private dqqppqiKzJi1l1lll1l pdpqbmApOBCmNMwnn1ll111;
    private final Rect ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private boolean qbddqbdJBkudFfhX1ll1l111;
    private View qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private final int[] qdqdpyALEmZFGGaahRTIU1ll11;
    private int qppqdpppIauLKaAtRkB11111l;

    static class dbpqdHhmDSIHIJiwc1ll1l1 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        }
    }

    static class dpbdbdpbLwkLpObyKsq1lll1 {
        static boolean dbpqdHhmDSIHIJiwc1ll1l1(ViewGroup viewGroup) {
        }
    }

    static class dpbdpqRKAscW1lll1l extends View.BaseSavedState {
        public static final Parcelable.Creator<dpbdpqRKAscW1lll1l> CREATOR = null;
        public int dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<dpbdpqRKAscW1lll1l> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dpbdpqRKAscW1lll1l createFromParcel(Parcel parcel) {
            }

            public dpbdpqRKAscW1lll1l dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dpbdpqRKAscW1lll1l[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dpbdpqRKAscW1lll1l[] newArray(int i) {
            }
        }

        dpbdpqRKAscW1lll1l(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        dpbdpqRKAscW1lll1l(Parcel parcel) {
        }
    }

    public interface dqqppqiKzJi1l1lll1l {
        void dbpqdHhmDSIHIJiwc1ll1l1(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
    }

    private View bdddqmITkkeGpsxVXHR1l1llll(boolean z, int i, int i2) {
    }

    private boolean bdpdqYMMfHmzHyUIbllllll1(EdgeEffect edgeEffect, int i) {
    }

    private boolean bpbbpOxqjGWQAsycX11ll1l1(View view, int i, int i2) {
    }

    private static int bpdqqiQNVROMLC1ll1l1l11(int i, int i2, int i3) {
    }

    private void bppbpdbCeZVhQNTixBml1lll11l() {
    }

    private void bpppdpppqFAXRSTHUAmVJLvH11lllll1l() {
    }

    private void bpppqdQjfPiCT111111111(boolean z) {
    }

    private boolean bpqbbpqpqkDmeOUxxUylkHyYgWv11111(MotionEvent motionEvent) {
    }

    private int bpqbbqTOKdRXac1ll1l1lll(int i, float f) {
    }

    private void bpqdqbqpviKiORjqgp1l111l11(MotionEvent motionEvent) {
    }

    private float dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(int i) {
    }

    private boolean dbbpdqqpdVUhpQ1ll11(int i, int i2) {
    }

    private void dbppbdqpeLmcbs11l11(int i) {
    }

    private void dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    private void dddbpbpNqzZZJmSG1111l(int i, int i2, int[] iArr) {
    }

    private void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    private boolean dpbdpqRKAscW1lll1l() {
    }

    private void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(View view) {
    }

    private boolean dqqppqiKzJi1l1lll1l() {
    }

    private float getVerticalScrollFactorCompat() {
    }

    private boolean pbppbpqbamJRy11l1l1(int i) {
    }

    private void pdpqbmApOBCmNMwnn1ll111() {
    }

    private void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    private boolean qbpbddbpyaPAbpThgWCvm11l11l1(int i, int i2, int i3) {
    }

    private boolean qdqdpyALEmZFGGaahRTIU1ll11(View view) {
    }

    private static boolean qppqdpppIauLKaAtRkB11111l(View view, View view2) {
    }

    private void qqbqbddiRRgLpniPxlUfQzP1l1l1l(int i, int i2, int i3, boolean z) {
    }

    private boolean qqpbppebHUxqEmlGoAJWl1lll(Rect rect, boolean z) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
    }

    public boolean bbdbbpdOJSuInlll111l(int i) {
    }

    public boolean bpdddqbpEtpkwNYukGjjNs1l111(int i, int i2) {
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
    }

    boolean dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
    }

    public boolean ddbbbeXHXx111ll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
    }

    public boolean ddddbbdqIccDnEitQc1l1l1l(int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
    }

    public boolean dpbdbdpbLwkLpObyKsq1lll1(int i) {
    }

    void dpbdqAKWNZAIXLyehU1lll1lll1(int i, int i2, boolean z) {
    }

    public void dqbbdddqpLERmaRLiHiDpL1l1l1l(int i) {
    }

    public void dqdqbpQposEBDyDxIyyz1ll11(int i) {
    }

    public void dqpdbEevAufTOvPphbjykClll1l11(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
    }

    int dqpqqqbqQyjyB11111l1(int i) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
    }

    public int getMaxScrollAmount() {
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
    }

    int getScrollRange() {
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
    }

    @Override // android.view.View, p000.ng0
    public boolean isNestedScrollingEnabled() {
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onNestedPreFling(View view, float f, float f2) {
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

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onStartNestedScroll(View view, View view2, int i) {
    }

    @Override // p000.pg0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
    }

    @Override // p000.pg0
    public void onStopNestedScroll(View view, int i) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    protected int ppbdpwWWljzmXXdHNabfWhgjl111l11(Rect rect) {
    }

    public final void ppdqqzXJzQiU11ll11(int i, int i2) {
    }

    public boolean qbddqbdJBkudFfhX1ll1l111(int i) {
    }

    public boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll(KeyEvent keyEvent) {
    }

    void qqdbbfmUWwoYYpfYHJZdaUO1111llll(int i, int i2, int i3, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setFillViewport(boolean z) {
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
    }

    public void setOnScrollChangeListener(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
    }

    @Override // android.view.View, p000.ng0
    public void stopNestedScroll() {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.pg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedScrollAccepted(View view, View view2, int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onStopNestedScroll(View view) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }
}
