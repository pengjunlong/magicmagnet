package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p000.bn0;
import p000.ev0;
import p000.n0;
import p000.pg0;
import p000.qg0;
import p000.sg0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class CoordinatorLayout extends ViewGroup implements pg0, qg0 {
    static final Class<?>[] CONSTRUCTOR_PARAMS = null;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR = null;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME = null;
    static final ThreadLocal<Map<String, Constructor<dqqppqiKzJi1l1lll1l>>> sConstructors = null;
    private static final ev0<Rect> sRectPool = null;
    private bn0 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final n0<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private bdddqmITkkeGpsxVXHR1l1llll mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final sg0 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private dqpqqqbqQyjyB11111l1 mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    private class bpdqqiQNVROMLC1ll1l1l11 implements ViewGroup.OnHierarchyChangeListener {
        final /* synthetic */ CoordinatorLayout dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(CoordinatorLayout coordinatorLayout) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements bn0 {
        final /* synthetic */ CoordinatorLayout dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(CoordinatorLayout coordinatorLayout) {
        }

        @Override // p000.bn0
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    public interface dpbdbdpbLwkLpObyKsq1lll1 {
        dqqppqiKzJi1l1lll1l getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface dpbdpqRKAscW1lll1l {
        Class<? extends dqqppqiKzJi1l1lll1l> value();
    }

    static class dqpdbEevAufTOvPphbjykClll1l11 implements Comparator<View> {
        dqpdbEevAufTOvPphbjykClll1l11() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(View view, View view2) {
        }

        public int dbpqdHhmDSIHIJiwc1ll1l1(View view, View view2) {
        }
    }

    class dqpqqqbqQyjyB11111l1 implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ CoordinatorLayout dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(CoordinatorLayout coordinatorLayout) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    public static abstract class dqqppqiKzJi1l1lll1l<V extends View> {
        public dqqppqiKzJi1l1lll1l() {
        }

        public static Object getTag(View view) {
        }

        public static void setTag(View view, Object obj) {
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }

        public void onAttachedToLayoutParams(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        }

        public dqqppqiKzJi1l1lll1l(Context context, AttributeSet attributeSet) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        }
    }

    public CoordinatorLayout(Context context) {
    }

    private static Rect acquireTempRect() {
    }

    private static int clamp(int i, int i2, int i3) {
    }

    private void constrainChildRect(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, Rect rect, int i, int i2) {
    }

    private bdddqmITkkeGpsxVXHR1l1llll dispatchApplyWindowInsetsToBehaviors(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect2, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, int i2, int i3) {
    }

    private int getKeyline(int i) {
    }

    private void getTopSortedChildren(List<View> list) {
    }

    private boolean hasDependencies(View view) {
    }

    private void layoutChild(View view, int i) {
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
    }

    private void offsetChildByInset(View view, Rect rect, int i) {
    }

    static dqqppqiKzJi1l1lll1l parseBehavior(Context context, AttributeSet attributeSet, String str) {
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
    }

    private void prepareChildren() {
    }

    private static void releaseTempRect(Rect rect) {
    }

    private void resetTouchBehaviors(boolean z) {
    }

    private static int resolveAnchoredChildGravity(int i) {
    }

    private static int resolveGravity(int i) {
    }

    private static int resolveKeylineGravity(int i) {
    }

    private void setInsetOffsetX(View view, int i) {
    }

    private void setInsetOffsetY(View view, int i) {
    }

    private void setupForInsets() {
    }

    void addPreDrawListener() {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void dispatchDependentViewsChanged(View view) {
    }

    public boolean doViewsOverlap(View view, View view2) {
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
    }

    void ensurePreDrawListener() {
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    void getChildRect(View view, boolean z, Rect rect) {
    }

    public List<View> getDependencies(View view) {
    }

    final List<View> getDependencySortedChildren() {
    }

    public List<View> getDependents(View view) {
    }

    void getDescendantRect(View view, Rect rect) {
    }

    void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
    }

    void getLastChildRect(View view, Rect rect) {
    }

    public final bdddqmITkkeGpsxVXHR1l1llll getLastWindowInsets() {
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
    }

    ppbdpwWWljzmXXdHNabfWhgjl111l11 getResolvedLayoutParams(View view) {
    }

    public Drawable getStatusBarBackground() {
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
    }

    void offsetChildToAnchor(View view, int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    final void onChildViewsChanged(int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onLayoutChild(View view, int i) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
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

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onNestedScrollAccepted(View view, View view2, int i) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public boolean onStartNestedScroll(View view, View view2, int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.rg0
    public void onStopNestedScroll(View view) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    void recordLastChildRect(View view, Rect rect) {
    }

    void removePreDrawListener() {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
    }

    public void setStatusBarBackground(Drawable drawable) {
    }

    public void setStatusBarBackgroundColor(int i) {
    }

    public void setStatusBarBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    final bdddqmITkkeGpsxVXHR1l1llll setWindowInsets(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    protected ppbdpwWWljzmXXdHNabfWhgjl111l11 generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // p000.pg0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // p000.pg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
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

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.view.ViewGroup
    public ppbdpwWWljzmXXdHNabfWhgjl111l11 generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // p000.qg0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup
    protected ppbdpwWWljzmXXdHNabfWhgjl111l11 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    protected static class ddbbbeXHXx111ll extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<ddbbbeXHXx111ll> CREATOR = null;
        SparseArray<Parcelable> dpbdpqRKAscW1lll1l;

        static class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.ClassLoaderCreator<ddbbbeXHXx111ll> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            public ddbbbeXHXx111ll dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public ddbbbeXHXx111ll dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel, ClassLoader classLoader) {
            }

            public ddbbbeXHXx111ll[] dqqppqiKzJi1l1lll1l(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ ddbbbeXHXx111ll createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public ddbbbeXHXx111ll(Parcel parcel, ClassLoader classLoader) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public ddbbbeXHXx111ll(Parcelable parcelable) {
        }
    }

    public static class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends ViewGroup.MarginLayoutParams {
        Object bbdbbpdOJSuInlll111l;
        private boolean bdddqmITkkeGpsxVXHR1l1llll;
        public int bpdqqiQNVROMLC1ll1l1l11;
        final Rect dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
        int dbppbdqpeLmcbs11l11;
        dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1;
        public int ddbbbeXHXx111ll;
        View ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        boolean dpbdbdpbLwkLpObyKsq1lll1;
        public int dpbdpqRKAscW1lll1l;
        private boolean dqdqbpQposEBDyDxIyyz1ll11;
        int dqpdbEevAufTOvPphbjykClll1l11;
        public int dqpqqqbqQyjyB11111l1;
        public int dqqppqiKzJi1l1lll1l;
        View pbppbpqbamJRy11l1l1;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;
        private boolean qbddqbdJBkudFfhX1ll1l111;
        private boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(int i, int i2) {
        }

        private void bdddqmITkkeGpsxVXHR1l1llll(View view, CoordinatorLayout coordinatorLayout) {
        }

        private boolean bppbpdbCeZVhQNTixBml1lll11l(View view, CoordinatorLayout coordinatorLayout) {
        }

        private boolean dbbpdqqpdVUhpQ1ll11(View view, int i) {
        }

        void bbdbbpdOJSuInlll111l(int i, boolean z) {
        }

        public int bpdqqiQNVROMLC1ll1l1l11() {
        }

        void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(Rect rect) {
        }

        boolean dbppbdqpeLmcbs11l11(int i) {
        }

        boolean dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        Rect ddbbbeXHXx111ll() {
        }

        void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(int i) {
        }

        boolean dpbdbdpbLwkLpObyKsq1lll1(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        View dpbdpqRKAscW1lll1l(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void dqdqbpQposEBDyDxIyyz1ll11(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        boolean dqpdbEevAufTOvPphbjykClll1l11(CoordinatorLayout coordinatorLayout, View view) {
        }

        boolean dqpqqqbqQyjyB11111l1() {
        }

        boolean dqqppqiKzJi1l1lll1l() {
        }

        void pbppbpqbamJRy11l1l1() {
        }

        public dqqppqiKzJi1l1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        void qbddqbdJBkudFfhX1ll1l111(boolean z) {
        }

        void qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
        }

        ppbdpwWWljzmXXdHNabfWhgjl111l11(Context context, AttributeSet attributeSet) {
        }

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
        }

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(ViewGroup.LayoutParams layoutParams) {
        }
    }
}
