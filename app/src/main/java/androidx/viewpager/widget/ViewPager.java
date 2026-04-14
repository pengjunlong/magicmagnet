package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p000.bn0;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<ppbdpwWWljzmXXdHNabfWhgjl111l11> COMPARATOR = null;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS = null;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = null;
    private static final bdddqmITkkeGpsxVXHR1l1llll sPositionComparator = null;
    private int mActivePointerId;
    androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1 mAdapter;
    private List<dqpdbEevAufTOvPphbjykClll1l11> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private dbppbdqpeLmcbs11l11 mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ppbdpwWWljzmXXdHNabfWhgjl111l11> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mObserver;
    private int mOffscreenPageLimit;
    private dbppbdqpeLmcbs11l11 mOnPageChangeListener;
    private List<dbppbdqpeLmcbs11l11> mOnPageChangeListeners;
    private int mPageMargin;
    private pbppbpqbamJRy11l1l1 mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ppbdpwWWljzmXXdHNabfWhgjl111l11 mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    static class bdddqmITkkeGpsxVXHR1l1llll implements Comparator<View> {
        bdddqmITkkeGpsxVXHR1l1llll() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(View view, View view2) {
        }

        public int dbpqdHhmDSIHIJiwc1ll1l1(View view, View view2) {
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface bpdqqiQNVROMLC1ll1l1l11 {
    }

    public interface dbppbdqpeLmcbs11l11 {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    static class dbpqdHhmDSIHIJiwc1ll1l1 implements Comparator<ppbdpwWWljzmXXdHNabfWhgjl111l11> {
        dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l112) {
        }

        public int dbpqdHhmDSIHIJiwc1ll1l1(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l112) {
        }
    }

    class ddbbbeXHXx111ll extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ ViewPager dbpqdHhmDSIHIJiwc1ll1l1;

        ddbbbeXHXx111ll(ViewPager viewPager) {
        }

        private boolean dbpqdHhmDSIHIJiwc1ll1l1() {
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

    private class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends DataSetObserver {
        final /* synthetic */ ViewPager dbpqdHhmDSIHIJiwc1ll1l1;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(ViewPager viewPager) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    static class dpbdbdpbLwkLpObyKsq1lll1 implements Interpolator {
        dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
        }
    }

    class dpbdpqRKAscW1lll1l implements bn0 {
        private final Rect dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ ViewPager dpbdbdpbLwkLpObyKsq1lll1;

        dpbdpqRKAscW1lll1l(ViewPager viewPager) {
        }

        @Override // p000.bn0
        public androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    public interface dqpdbEevAufTOvPphbjykClll1l11 {
        void onAdapterChanged(ViewPager viewPager, androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l12);
    }

    class dqqppqiKzJi1l1lll1l implements Runnable {
        final /* synthetic */ ViewPager dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(ViewPager viewPager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface pbppbpqbamJRy11l1l1 {
        void dbpqdHhmDSIHIJiwc1ll1l1(View view, float f);
    }

    static class ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        float bpdqqiQNVROMLC1ll1l1l11;
        Object dbpqdHhmDSIHIJiwc1ll1l1;
        int dpbdbdpbLwkLpObyKsq1lll1;
        float dpbdpqRKAscW1lll1l;
        boolean dqqppqiKzJi1l1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }
    }

    public static class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<qbdpqpstJKhhKkXrsOGvbWw1l1llll> CREATOR = null;
        Parcelable bpdqqiQNVROMLC1ll1l1l11;
        int dpbdpqRKAscW1lll1l;
        ClassLoader ppbdpwWWljzmXXdHNabfWhgjl111l11;

        static class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.ClassLoaderCreator<qbdpqpstJKhhKkXrsOGvbWw1l1llll> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            public qbdpqpstJKhhKkXrsOGvbWw1l1llll dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel, ClassLoader classLoader) {
            }

            public qbdpqpstJKhhKkXrsOGvbWw1l1llll[] dqqppqiKzJi1l1lll1l(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public qbdpqpstJKhhKkXrsOGvbWw1l1llll(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public ViewPager(Context context) {
    }

    private void calculatePageOffsets(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, int i, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l112) {
    }

    private void completeScroll(boolean z) {
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
    }

    private void dispatchOnPageSelected(int i) {
    }

    private void dispatchOnScrollStateChanged(int i) {
    }

    private void enableLayers(boolean z) {
    }

    private void endDrag() {
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
    }

    private int getClientWidth() {
    }

    private ppbdpwWWljzmXXdHNabfWhgjl111l11 infoForCurrentScrollPosition() {
    }

    private static boolean isDecorView(View view) {
    }

    private boolean isGutterDrag(float f, float f2) {
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
    }

    private boolean pageScrolled(int i) {
    }

    private boolean performDrag(float f) {
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
    }

    private void removeNonDecorViews() {
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
    }

    private boolean resetTouch() {
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
    }

    private void setScrollingCacheEnabled(boolean z) {
    }

    private void sortChildDrawingOrder() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
    }

    ppbdpwWWljzmXXdHNabfWhgjl111l11 addNewItem(int i, int i2) {
    }

    public void addOnAdapterChangeListener(dqpdbEevAufTOvPphbjykClll1l11 dqpdbeevauftovpphbjykclll1l11) {
    }

    public void addOnPageChangeListener(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    public boolean arrowScroll(int i) {
    }

    public boolean beginFakeDrag() {
    }

    protected boolean canScroll(View view, boolean z, int i, int i2, int i3) {
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void clearOnPageChangeListeners() {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    void dataSetChanged() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    float distanceInfluenceForSnapDuration(float f) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
    }

    public void endFakeDrag() {
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
    }

    public void fakeDragBy(float f) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1 getAdapter() {
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
    }

    public int getCurrentItem() {
    }

    public int getOffscreenPageLimit() {
    }

    public int getPageMargin() {
    }

    ppbdpwWWljzmXXdHNabfWhgjl111l11 infoForAnyChild(View view) {
    }

    ppbdpwWWljzmXXdHNabfWhgjl111l11 infoForChild(View view) {
    }

    ppbdpwWWljzmXXdHNabfWhgjl111l11 infoForPosition(int i) {
    }

    void initViewPager() {
    }

    public boolean isFakeDragging() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    protected void onPageScrolled(int i, float f, int i2) {
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    boolean pageLeft() {
    }

    boolean pageRight() {
    }

    void populate() {
    }

    public void removeOnAdapterChangeListener(dqpdbEevAufTOvPphbjykClll1l11 dqpdbeevauftovpphbjykclll1l11) {
    }

    public void removeOnPageChangeListener(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
    }

    public void setAdapter(androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setCurrentItem(int i) {
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2) {
    }

    dbppbdqpeLmcbs11l11 setInternalPageChangeListener(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    public void setOffscreenPageLimit(int i) {
    }

    @Deprecated
    public void setOnPageChangeListener(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    public void setPageMargin(int i) {
    }

    public void setPageMarginDrawable(Drawable drawable) {
    }

    public void setPageTransformer(boolean z, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    void setScrollState(int i) {
    }

    void smoothScrollTo(int i, int i2) {
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
    }

    public static class dqpqqqbqQyjyB11111l1 extends ViewGroup.LayoutParams {
        int bpdqqiQNVROMLC1ll1l1l11;
        public boolean dbpqdHhmDSIHIJiwc1ll1l1;
        public int dpbdbdpbLwkLpObyKsq1lll1;
        boolean dpbdpqRKAscW1lll1l;
        float dqqppqiKzJi1l1lll1l;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dqpqqqbqQyjyB11111l1() {
        }

        public dqpqqqbqQyjyB11111l1(Context context, AttributeSet attributeSet) {
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    void populate(int i) {
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
    }

    public void setPageTransformer(boolean z, pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1, int i) {
    }

    void smoothScrollTo(int i, int i2, int i3) {
    }

    public void setCurrentItem(int i, boolean z) {
    }

    public void setPageMarginDrawable(int i) {
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
    }
}
