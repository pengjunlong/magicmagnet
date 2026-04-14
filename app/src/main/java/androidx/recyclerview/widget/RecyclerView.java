package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.bbdbbpdOJSuInlll111l;
import androidx.recyclerview.widget.dbbpdqqpdVUhpQ1ll11;
import androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1;
import androidx.recyclerview.widget.dqpqqqbqQyjyB11111l1;
import androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.ng0;
import p000.og0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class RecyclerView extends ViewGroup implements ng0 {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    static final boolean ALLOW_THREAD_GAP_WORK = false;
    static final boolean DEBUG = false;
    private static final float DECELERATION_RATE = 0.0f;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = false;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 sDefaultEdgeEffectFactory = null;
    static final Interpolator sQuinticInterpolator = null;
    androidx.recyclerview.widget.bdddqmITkkeGpsxVXHR1l1llll mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    ddbbbeXHXx111ll mAdapter;
    androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1 mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private pbppbpqbamJRy11l1l1 mChildDrawingOrderCallback;
    androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.dqpqqqbqQyjyB11111l1 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private dbbpdqqpdVUhpQ1ll11 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    qbdpqpstJKhhKkXrsOGvbWw1l1llll mItemAnimator;
    private qbdpqpstJKhhKkXrsOGvbWw1l1llll.dpbdbdpbLwkLpObyKsq1lll1 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<dqdqbpQposEBDyDxIyyz1ll11> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final qppqdpppIauLKaAtRkB11111l mObserver;
    private List<dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1> mOnChildAttachStateListeners;
    private bbdbbpdOJSuInlll111l mOnFlingListener;
    private final ArrayList<dbbpdqqpdVUhpQ1ll11> mOnItemTouchListeners;
    final List<bpqbbqTOKdRXac1ll1l1lll> mPendingAccessibilityImportanceChange;
    bpbbpOxqjGWQAsycX11ll1l1 mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final bpppdpppqFAXRSTHUAmVJLvH11lllll1l mRecycler;
    qdqdpyALEmZFGGaahRTIU1ll11 mRecyclerListener;
    final List<qdqdpyALEmZFGGaahRTIU1ll11> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private bppbpdbCeZVhQNTixBml1lll11l mScrollListener;
    private List<bppbpdbCeZVhQNTixBml1lll11l> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private og0 mScrollingChildHelper;
    final bpqdqbqpviKiORjqgp1l111l11 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final pdpqbmApOBCmNMwnn1ll111 mViewFlinger;
    private final dbbpdqqpdVUhpQ1ll11.dpbdbdpbLwkLpObyKsq1lll1 mViewInfoProcessCallback;
    final androidx.recyclerview.widget.dbbpdqqpdVUhpQ1ll11 mViewInfoStore;

    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.bbdbbpdOJSuInlll111l mHorizontalBoundCheck;
        private final bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1 mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        dddbpbpNqzZZJmSG1111l mSmoothScroller;
        androidx.recyclerview.widget.bbdbbpdOJSuInlll111l mVerticalBoundCheck;
        private final bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1 mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        class dbpqdHhmDSIHIJiwc1ll1l1 implements bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1 {
            final /* synthetic */ LayoutManager dbpqdHhmDSIHIJiwc1ll1l1;

            dbpqdHhmDSIHIJiwc1ll1l1(LayoutManager layoutManager) {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public int bpdqqiQNVROMLC1ll1l1l11(View view) {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public View dbpqdHhmDSIHIJiwc1ll1l1(int i) {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public int dpbdbdpbLwkLpObyKsq1lll1(View view) {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public int dpbdpqRKAscW1lll1l() {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public int dqqppqiKzJi1l1lll1l() {
            }
        }

        class dpbdbdpbLwkLpObyKsq1lll1 implements bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1 {
            final /* synthetic */ LayoutManager dbpqdHhmDSIHIJiwc1ll1l1;

            dpbdbdpbLwkLpObyKsq1lll1(LayoutManager layoutManager) {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public int bpdqqiQNVROMLC1ll1l1l11(View view) {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public View dbpqdHhmDSIHIJiwc1ll1l1(int i) {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public int dpbdbdpbLwkLpObyKsq1lll1(View view) {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public int dpbdpqRKAscW1lll1l() {
            }

            @Override // androidx.recyclerview.widget.bbdbbpdOJSuInlll111l.dpbdbdpbLwkLpObyKsq1lll1
            public int dqqppqiKzJi1l1lll1l() {
            }
        }

        public interface dqqppqiKzJi1l1lll1l {
            void dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2);
        }

        private void addViewInt(View view, int i, boolean z) {
        }

        public static int chooseSize(int i, int i2, int i3) {
        }

        private void detachViewInternal(int i, View view) {
        }

        @Deprecated
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
        }

        public static Properties getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        }

        private void scrapOrRecycleView(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, int i, View view) {
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
        }

        public void assertInLayoutOrScroll(String str) {
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
        }

        public void attachView(View view, int i, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
        }

        public boolean canScrollHorizontally() {
        }

        public boolean canScrollVertically() {
        }

        public boolean checkLayoutParams(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i, int i2, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        public int computeHorizontalScrollExtent(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public int computeHorizontalScrollOffset(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public int computeHorizontalScrollRange(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public int computeVerticalScrollExtent(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public int computeVerticalScrollOffset(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public int computeVerticalScrollRange(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public void detachAndScrapAttachedViews(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        public void detachAndScrapView(View view, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        public void detachAndScrapViewAt(int i, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        public void detachView(View view) {
        }

        public void detachViewAt(int i) {
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
        }

        public View findContainingItemView(View view) {
        }

        public View findViewByPosition(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public abstract qbddqbdJBkudFfhX1ll1l111 generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public qbddqbdJBkudFfhX1ll1l111 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public int getBaseline() {
        }

        public int getBottomDecorationHeight(View view) {
        }

        public View getChildAt(int i) {
        }

        public int getChildCount() {
        }

        public boolean getClipToPadding() {
        }

        public int getColumnCountForAccessibility(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public int getDecoratedBottom(View view) {
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        }

        public int getDecoratedLeft(View view) {
        }

        public int getDecoratedMeasuredHeight(View view) {
        }

        public int getDecoratedMeasuredWidth(View view) {
        }

        public int getDecoratedRight(View view) {
        }

        public int getDecoratedTop(View view) {
        }

        public View getFocusedChild() {
        }

        public int getHeight() {
        }

        public int getHeightMode() {
        }

        public int getItemCount() {
        }

        public int getItemViewType(View view) {
        }

        public int getLayoutDirection() {
        }

        public int getLeftDecorationWidth(View view) {
        }

        public int getMinimumHeight() {
        }

        public int getMinimumWidth() {
        }

        public int getPaddingBottom() {
        }

        public int getPaddingEnd() {
        }

        public int getPaddingLeft() {
        }

        public int getPaddingRight() {
        }

        public int getPaddingStart() {
        }

        public int getPaddingTop() {
        }

        public int getPosition(View view) {
        }

        public int getRightDecorationWidth(View view) {
        }

        public int getRowCountForAccessibility(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public int getSelectionModeForAccessibility(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public int getTopDecorationHeight(View view) {
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
        }

        public int getWidth() {
        }

        public int getWidthMode() {
        }

        boolean hasFlexibleChildInBothOrientations() {
        }

        public boolean hasFocus() {
        }

        public void ignoreView(View view) {
        }

        public boolean isAttachedToWindow() {
        }

        public boolean isAutoMeasureEnabled() {
        }

        public boolean isFocused() {
        }

        public final boolean isItemPrefetchEnabled() {
        }

        public boolean isLayoutHierarchical(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public boolean isMeasurementCacheEnabled() {
        }

        public boolean isSmoothScrolling() {
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        }

        public void measureChild(View view, int i, int i2) {
        }

        public void measureChildWithMargins(View view, int i, int i2) {
        }

        public void moveView(int i, int i2) {
        }

        public void offsetChildrenHorizontal(int i) {
        }

        public void offsetChildrenVertical(int i) {
        }

        public void onAdapterChanged(ddbbbeXHXx111ll ddbbbexhxx111ll, ddbbbeXHXx111ll ddbbbexhxx111ll2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onDetachedFromWindow(RecyclerView recyclerView, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        public View onFocusSearchFailed(View view, int i, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        }

        void onInitializeAccessibilityNodeInfo(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        public void onInitializeAccessibilityNodeInfoForItem(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        public View onInterceptFocusSearch(View view, int i) {
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public void onMeasure(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int i, int i2) {
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
        }

        public void onScrollStateChanged(int i) {
        }

        void onSmoothScrollerStopped(dddbpbpNqzZZJmSG1111l dddbpbpnqzzzjmsg1111l) {
        }

        boolean performAccessibilityAction(int i, Bundle bundle) {
        }

        boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        }

        public boolean performAccessibilityActionForItem(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, View view, int i, Bundle bundle) {
        }

        public void postOnAnimation(Runnable runnable) {
        }

        public void removeAllViews() {
        }

        public void removeAndRecycleAllViews(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        void removeAndRecycleScrapInt(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        public void removeAndRecycleView(View view, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        public void removeAndRecycleViewAt(int i, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
        }

        public boolean removeCallbacks(Runnable runnable) {
        }

        public void removeDetachedView(View view) {
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
        }

        public void removeViewAt(int i) {
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        }

        public void requestLayout() {
        }

        public void requestSimpleAnimationsInNextLayout() {
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public void scrollToPosition(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        }

        public final void setItemPrefetchEnabled(boolean z) {
        }

        void setMeasureSpecs(int i, int i2) {
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
        }

        void setMeasuredDimensionFromChildren(int i, int i2) {
        }

        public void setMeasurementCacheEnabled(boolean z) {
        }

        void setRecyclerView(RecyclerView recyclerView) {
        }

        boolean shouldMeasureChild(View view, int i, int i2, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
        }

        boolean shouldMeasureTwice() {
        }

        boolean shouldReMeasureChild(View view, int i, int i2, qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(dddbpbpNqzZZJmSG1111l dddbpbpnqzzzjmsg1111l) {
        }

        public void stopIgnoringView(View view) {
        }

        void stopSmoothScroller() {
        }

        public boolean supportsPredictiveItemAnimations() {
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
        }

        public void onInitializeAccessibilityEvent(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, AccessibilityEvent accessibilityEvent) {
        }

        public void onInitializeAccessibilityNodeInfo(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, View view, View view2) {
        }

        public boolean performAccessibilityAction(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int i, Bundle bundle) {
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        }

        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
        }

        public void attachView(View view, int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public qbddqbdJBkudFfhX1ll1l111 generateLayoutParams(Context context, AttributeSet attributeSet) {
        }

        public void setMeasuredDimension(int i, int i2) {
        }

        public void attachView(View view) {
        }
    }

    public static abstract class bbdbbpdOJSuInlll111l {
        public abstract boolean dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2);
    }

    private class bdddqmITkkeGpsxVXHR1l1llll implements qbdpqpstJKhhKkXrsOGvbWw1l1llll.dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ RecyclerView dbpqdHhmDSIHIJiwc1ll1l1;

        bdddqmITkkeGpsxVXHR1l1llll(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.qbdpqpstJKhhKkXrsOGvbWw1l1llll.dpbdbdpbLwkLpObyKsq1lll1
        public void dbpqdHhmDSIHIJiwc1ll1l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }
    }

    class bpdqqiQNVROMLC1ll1l1l11 implements dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ RecyclerView dbpqdHhmDSIHIJiwc1ll1l1;

        bpdqqiQNVROMLC1ll1l1l11(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public void addView(View view, int i) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public void bpdqqiQNVROMLC1ll1l1l11(int i) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public View dbpqdHhmDSIHIJiwc1ll1l1(int i) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public void ddbbbeXHXx111ll(View view, int i, ViewGroup.LayoutParams layoutParams) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public void dpbdbdpbLwkLpObyKsq1lll1(View view) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public bpqbbqTOKdRXac1ll1l1lll dpbdpqRKAscW1lll1l(View view) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public void dqpqqqbqQyjyB11111l1(View view) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public int dqqppqiKzJi1l1lll1l() {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public int ppbdpwWWljzmXXdHNabfWhgjl111l11(View view) {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public void removeAllViews() {
        }

        @Override // androidx.recyclerview.widget.dqqppqiKzJi1l1lll1l.dpbdbdpbLwkLpObyKsq1lll1
        public void removeViewAt(int i) {
        }
    }

    public static abstract class bppbpdbCeZVhQNTixBml1lll11l {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public final class bpppdpppqFAXRSTHUAmVJLvH11lllll1l {
        private int bpdqqiQNVROMLC1ll1l1l11;
        final ArrayList<bpqbbqTOKdRXac1ll1l1lll> dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ RecyclerView ddbbbeXHXx111ll;
        ArrayList<bpqbbqTOKdRXac1ll1l1lll> dpbdbdpbLwkLpObyKsq1lll1;
        private final List<bpqbbqTOKdRXac1ll1l1lll> dpbdpqRKAscW1lll1l;
        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l dqpqqqbqQyjyB11111l1;
        final ArrayList<bpqbbqTOKdRXac1ll1l1lll> dqqppqiKzJi1l1lll1l;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public bpppdpppqFAXRSTHUAmVJLvH11lllll1l(RecyclerView recyclerView) {
        }

        private void bbdbbpdOJSuInlll111l(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        private void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(ViewGroup viewGroup, boolean z) {
        }

        private void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(ddbbbeXHXx111ll<?> ddbbbexhxx111ll) {
        }

        private void ddddbbdqIccDnEitQc1l1l1l(ddbbbeXHXx111ll<?> ddbbbexhxx111ll, boolean z) {
        }

        private void dpbdbdpbLwkLpObyKsq1lll1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        private void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
        }

        private boolean qqdbbfmUWwoYYpfYHJZdaUO1111llll(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, int i, int i2, long j) {
        }

        View bdddqmITkkeGpsxVXHR1l1llll(int i) {
        }

        void bdpdqYMMfHmzHyUIbllllll1(qbdqqpbqpCWRpIKEKtzoceYOll1ll1l qbdqqpbqpcwrpikektzoceyoll1ll1l) {
        }

        void bdqbblVddTYAmqrWwacZmi111ll1(int i, int i2) {
        }

        void bpbbpOxqjGWQAsycX11ll1l1(ddbbbeXHXx111ll<?> ddbbbexhxx111ll, ddbbbeXHXx111ll<?> ddbbbexhxx111ll2, boolean z) {
        }

        void bpdddqbpEtpkwNYukGjjNs1l111(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        void bpdqqiQNVROMLC1ll1l1l11() {
        }

        void bppbpdbCeZVhQNTixBml1lll11l() {
        }

        void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(int i, int i2) {
        }

        void bpppqdQjfPiCT111111111(int i) {
        }

        void bpqbbpqpqkDmeOUxxUylkHyYgWv11111() {
        }

        void bpqbbqTOKdRXac1ll1l1lll() {
        }

        void bpqdqbqpviKiORjqgp1l111l11() {
        }

        void dbbpdqqpdVUhpQ1ll11() {
        }

        int dbppbdqpeLmcbs11l11() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, boolean z) {
        }

        bpqbbqTOKdRXac1ll1l1lll ddbbbeXHXx111ll(int i) {
        }

        void dddbpbpNqzZZJmSG1111l() {
        }

        bpqbbqTOKdRXac1ll1l1lll ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(long j, int i, boolean z) {
        }

        void dpbdpqRKAscW1lll1l() {
        }

        bpqbbqTOKdRXac1ll1l1lll dpbdqAKWNZAIXLyehU1lll1lll1(int i, boolean z, long j) {
        }

        boolean dqbbdddqpLERmaRLiHiDpL1l1l1l(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        public View dqdqbpQposEBDyDxIyyz1ll11(int i) {
        }

        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l dqpdbEevAufTOvPphbjykClll1l11() {
        }

        void dqpqqqbqQyjyB11111l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        public void dqqppqiKzJi1l1lll1l() {
        }

        public List<bpqbbqTOKdRXac1ll1l1lll> pbppbpqbamJRy11l1l1() {
        }

        void pdpqbmApOBCmNMwnn1ll111(View view) {
        }

        public int ppbdpwWWljzmXXdHNabfWhgjl111l11(int i) {
        }

        void ppdqqzXJzQiU11ll11(ddddbbdqIccDnEitQc1l1l1l ddddbbdqiccdneitqc1l1l1l) {
        }

        View qbddqbdJBkudFfhX1ll1l111(int i, boolean z) {
        }

        bpqbbqTOKdRXac1ll1l1lll qbdpqpstJKhhKkXrsOGvbWw1l1llll(int i, boolean z) {
        }

        public void qbpbddbpyaPAbpThgWCvm11l11l1(View view) {
        }

        void qdqdpyALEmZFGGaahRTIU1ll11(int i, int i2) {
        }

        void qppqdpppIauLKaAtRkB11111l(int i, int i2, boolean z) {
        }

        public void qqbqbddiRRgLpniPxlUfQzP1l1l1l(int i) {
        }

        void qqpbppebHUxqEmlGoAJWl1lll(View view) {
        }
    }

    public static abstract class bpqbbqTOKdRXac1ll1l1lll {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = null;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        ddbbbeXHXx111ll<? extends bpqbbqTOKdRXac1ll1l1lll> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads;
        int mPendingAccessibilityState;
        int mPosition;
        int mPreLayoutPosition;
        bpppdpppqFAXRSTHUAmVJLvH11lllll1l mScrapContainer;
        bpqbbqTOKdRXac1ll1l1lll mShadowedHolder;
        bpqbbqTOKdRXac1ll1l1lll mShadowingHolder;
        List<Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        public bpqbbqTOKdRXac1ll1l1lll(View view) {
        }

        private void createPayloadsIfNeeded() {
        }

        void addChangePayload(Object obj) {
        }

        void addFlags(int i) {
        }

        void clearOldPosition() {
        }

        void clearPayload() {
        }

        void clearReturnedFromScrapFlag() {
        }

        void clearTmpDetachFlag() {
        }

        boolean doesTransientStatePreventRecycling() {
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
        }

        public final int getAbsoluteAdapterPosition() {
        }

        @Deprecated
        public final int getAdapterPosition() {
        }

        public final ddbbbeXHXx111ll<? extends bpqbbqTOKdRXac1ll1l1lll> getBindingAdapter() {
        }

        public final int getBindingAdapterPosition() {
        }

        public final long getItemId() {
        }

        public final int getItemViewType() {
        }

        public final int getLayoutPosition() {
        }

        public final int getOldPosition() {
        }

        @Deprecated
        public final int getPosition() {
        }

        List<Object> getUnmodifiedPayloads() {
        }

        boolean hasAnyOfTheFlags(int i) {
        }

        boolean isAdapterPositionUnknown() {
        }

        boolean isAttachedToTransitionOverlay() {
        }

        boolean isBound() {
        }

        boolean isInvalid() {
        }

        public final boolean isRecyclable() {
        }

        boolean isRemoved() {
        }

        boolean isScrap() {
        }

        boolean isTmpDetached() {
        }

        boolean isUpdated() {
        }

        boolean needsUpdate() {
        }

        void offsetPosition(int i, boolean z) {
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
        }

        void resetInternal() {
        }

        void saveOldPosition() {
        }

        void setFlags(int i, int i2) {
        }

        public final void setIsRecyclable(boolean z) {
        }

        void setScrapContainer(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, boolean z) {
        }

        boolean shouldBeKeptAsChild() {
        }

        boolean shouldIgnore() {
        }

        void stopIgnoring() {
        }

        public String toString() {
        }

        void unScrap() {
        }

        boolean wasReturnedFromScrap() {
        }
    }

    public static class bpqdqbqpviKiORjqgp1l111l11 {
        long bdddqmITkkeGpsxVXHR1l1llll;
        int bpdqqiQNVROMLC1ll1l1l11;
        int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
        boolean dbppbdqpeLmcbs11l11;
        int dbpqdHhmDSIHIJiwc1ll1l1;
        boolean ddbbbeXHXx111ll;
        boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        private SparseArray<Object> dpbdbdpbLwkLpObyKsq1lll1;
        int dpbdpqRKAscW1lll1l;
        int dqdqbpQposEBDyDxIyyz1ll11;
        boolean dqpdbEevAufTOvPphbjykClll1l11;
        boolean dqpqqqbqQyjyB11111l1;
        int dqqppqiKzJi1l1lll1l;
        boolean pbppbpqbamJRy11l1l1;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;
        int qbddqbdJBkudFfhX1ll1l111;
        int qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        public boolean bpdqqiQNVROMLC1ll1l1l11() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1(int i) {
        }

        public int dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public boolean dpbdpqRKAscW1lll1l() {
        }

        public boolean dqpqqqbqQyjyB11111l1() {
        }

        public int dqqppqiKzJi1l1lll1l() {
        }

        void ppbdpwWWljzmXXdHNabfWhgjl111l11(ddbbbeXHXx111ll ddbbbexhxx111ll) {
        }

        public String toString() {
        }
    }

    public interface dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 {
        void dbpqdHhmDSIHIJiwc1ll1l1(View view);

        void dpbdbdpbLwkLpObyKsq1lll1(View view);
    }

    public interface dbbpdqqpdVUhpQ1ll11 {
        void dbpqdHhmDSIHIJiwc1ll1l1(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean dpbdbdpbLwkLpObyKsq1lll1(RecyclerView recyclerView, MotionEvent motionEvent);

        void dqqppqiKzJi1l1lll1l(boolean z);
    }

    static class dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 extends ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        protected EdgeEffect dbpqdHhmDSIHIJiwc1ll1l1(RecyclerView recyclerView, int i) {
        }
    }

    public static abstract class dbppbdqpeLmcbs11l11 {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
        final /* synthetic */ RecyclerView dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(RecyclerView recyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static abstract class ddbbbeXHXx111ll<VH extends bpqbbqTOKdRXac1ll1l1lll> {
        private boolean mHasStableIds;
        private final dqpdbEevAufTOvPphbjykClll1l11 mObservable;
        private dbpqdHhmDSIHIJiwc1ll1l1 mStateRestorationPolicy;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
            public static final dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11 = null;
            public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;
            private static final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1[] dqpqqqbqQyjyB11111l1 = null;
            public static final dbpqdHhmDSIHIJiwc1ll1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;

            private dbpqdHhmDSIHIJiwc1ll1l1(String str, int i) {
            }

            public static dbpqdHhmDSIHIJiwc1ll1l1 valueOf(String str) {
            }

            public static dbpqdHhmDSIHIJiwc1ll1l1[] values() {
            }
        }

        public final void bindViewHolder(VH vh, int i) {
        }

        boolean canRestoreState() {
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
        }

        public int findRelativeAdapterPositionIn(ddbbbeXHXx111ll<? extends bpqbbqTOKdRXac1ll1l1lll> ddbbbexhxx111ll, bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, int i) {
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
        }

        public int getItemViewType(int i) {
        }

        public final dbpqdHhmDSIHIJiwc1ll1l1 getStateRestorationPolicy() {
        }

        public final boolean hasObservers() {
        }

        public final boolean hasStableIds() {
        }

        public final void notifyDataSetChanged() {
        }

        public final void notifyItemChanged(int i) {
        }

        public final void notifyItemInserted(int i) {
        }

        public final void notifyItemMoved(int i, int i2) {
        }

        public final void notifyItemRangeChanged(int i, int i2) {
        }

        public final void notifyItemRangeInserted(int i, int i2) {
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
        }

        public final void notifyItemRemoved(int i) {
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
        }

        public void setHasStableIds(boolean z) {
        }

        public void setStateRestorationPolicy(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public void unregisterAdapterDataObserver(dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
        }

        public final void notifyItemChanged(int i, Object obj) {
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        }
    }

    public static abstract class dddbpbpNqzZZJmSG1111l {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final dbpqdHhmDSIHIJiwc1ll1l1 mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition;
        private View mTargetView;

        public static class dbpqdHhmDSIHIJiwc1ll1l1 {
            private Interpolator bpdqqiQNVROMLC1ll1l1l11;
            private int dbpqdHhmDSIHIJiwc1ll1l1;
            private int dpbdbdpbLwkLpObyKsq1lll1;
            private int dpbdpqRKAscW1lll1l;
            private int dqpqqqbqQyjyB11111l1;
            private int dqqppqiKzJi1l1lll1l;
            private boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

            public dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2) {
            }

            private void bpdqqiQNVROMLC1ll1l1l11() {
            }

            boolean dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            public void dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            public void dpbdpqRKAscW1lll1l(int i, int i2, int i3, Interpolator interpolator) {
            }

            void dqqppqiKzJi1l1lll1l(RecyclerView recyclerView) {
            }

            public dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2, int i3, Interpolator interpolator) {
            }
        }

        public interface dpbdbdpbLwkLpObyKsq1lll1 {
            PointF computeScrollVectorForPosition(int i);
        }

        public PointF computeScrollVectorForPosition(int i) {
        }

        public View findViewByPosition(int i) {
        }

        public int getChildCount() {
        }

        public int getChildPosition(View view) {
        }

        public LayoutManager getLayoutManager() {
        }

        public int getTargetPosition() {
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
        }

        public boolean isPendingInitialRun() {
        }

        public boolean isRunning() {
        }

        protected void normalize(PointF pointF) {
        }

        void onAnimation(int i, int i2) {
        }

        protected void onChildAttachedToWindow(View view) {
        }

        protected abstract void onSeekTargetStep(int i, int i2, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1);

        public void setTargetPosition(int i) {
        }

        void start(RecyclerView recyclerView, LayoutManager layoutManager) {
        }

        protected final void stop() {
        }
    }

    public static abstract class ddddbbdqIccDnEitQc1l1l1l {
    }

    public static class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        protected EdgeEffect dbpqdHhmDSIHIJiwc1ll1l1(RecyclerView recyclerView, int i) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
        final /* synthetic */ RecyclerView dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(RecyclerView recyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dpbdpqRKAscW1lll1l implements dbbpdqqpdVUhpQ1ll11.dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ RecyclerView dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdpqRKAscW1lll1l(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.dbbpdqqpdVUhpQ1ll11.dpbdbdpbLwkLpObyKsq1lll1
        public void dbpqdHhmDSIHIJiwc1ll1l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2) {
        }

        @Override // androidx.recyclerview.widget.dbbpdqqpdVUhpQ1ll11.dpbdbdpbLwkLpObyKsq1lll1
        public void dpbdbdpbLwkLpObyKsq1lll1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        @Override // androidx.recyclerview.widget.dbbpdqqpdVUhpQ1ll11.dpbdbdpbLwkLpObyKsq1lll1
        public void dpbdpqRKAscW1lll1l(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2) {
        }

        @Override // androidx.recyclerview.widget.dbbpdqqpdVUhpQ1ll11.dpbdbdpbLwkLpObyKsq1lll1
        public void dqqppqiKzJi1l1lll1l(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2) {
        }
    }

    public static abstract class dqdqbpQposEBDyDxIyyz1ll11 {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }
    }

    static class dqpdbEevAufTOvPphbjykClll1l11 extends Observable<dbppbdqpeLmcbs11l11> {
        dqpdbEevAufTOvPphbjykClll1l11() {
        }

        public void bpdqqiQNVROMLC1ll1l1l11(int i, int i2, Object obj) {
        }

        public boolean dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public void ddbbbeXHXx111ll() {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public void dpbdpqRKAscW1lll1l(int i, int i2) {
        }

        public void dqpqqqbqQyjyB11111l1(int i, int i2) {
        }

        public void dqqppqiKzJi1l1lll1l(int i, int i2) {
        }

        public void ppbdpwWWljzmXXdHNabfWhgjl111l11(int i, int i2) {
        }
    }

    static /* synthetic */ class dqpqqqbqQyjyB11111l1 {
        static final /* synthetic */ int[] dbpqdHhmDSIHIJiwc1ll1l1 = null;
    }

    class dqqppqiKzJi1l1lll1l implements Interpolator {
        dqqppqiKzJi1l1lll1l() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
        }
    }

    public interface pbppbpqbamJRy11l1l1 {
        int dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2);
    }

    class pdpqbmApOBCmNMwnn1ll111 implements Runnable {
        private int bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ RecyclerView dbppbdqpeLmcbs11l11;
        private boolean ddbbbeXHXx111ll;
        private int dpbdpqRKAscW1lll1l;
        private boolean dqpdbEevAufTOvPphbjykClll1l11;
        Interpolator dqpqqqbqQyjyB11111l1;
        OverScroller ppbdpwWWljzmXXdHNabfWhgjl111l11;

        pdpqbmApOBCmNMwnn1ll111(RecyclerView recyclerView) {
        }

        private int dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2) {
        }

        private void dqqppqiKzJi1l1lll1l() {
        }

        public void bpdqqiQNVROMLC1ll1l1l11(int i, int i2, int i3, Interpolator interpolator) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(int i, int i2) {
        }

        void dpbdpqRKAscW1lll1l() {
        }

        public void ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ RecyclerView dbpqdHhmDSIHIJiwc1ll1l1;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1
        public void bpdqqiQNVROMLC1ll1l1l11(int i, int i2, Object obj) {
        }

        @Override // androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1
        public void dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1
        public void ddbbbeXHXx111ll(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1
        public void dpbdbdpbLwkLpObyKsq1lll1(dbpqdHhmDSIHIJiwc1ll1l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        @Override // androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1
        public void dpbdpqRKAscW1lll1l(int i, int i2) {
        }

        void dqpdbEevAufTOvPphbjykClll1l11(dbpqdHhmDSIHIJiwc1ll1l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        @Override // androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1
        public void dqpqqqbqQyjyB11111l1(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1
        public void dqqppqiKzJi1l1lll1l(dbpqdHhmDSIHIJiwc1ll1l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        @Override // androidx.recyclerview.widget.dbpqdHhmDSIHIJiwc1ll1l1.InterfaceC1971dbpqdHhmDSIHIJiwc1ll1l1
        public bpqbbqTOKdRXac1ll1l1lll ppbdpwWWljzmXXdHNabfWhgjl111l11(int i) {
        }
    }

    public static abstract class qbdpqpstJKhhKkXrsOGvbWw1l1llll {
        private long bpdqqiQNVROMLC1ll1l1l11;
        private dpbdbdpbLwkLpObyKsq1lll1 dbpqdHhmDSIHIJiwc1ll1l1;
        private ArrayList<dbpqdHhmDSIHIJiwc1ll1l1> dpbdbdpbLwkLpObyKsq1lll1;
        private long dpbdpqRKAscW1lll1l;
        private long dqqppqiKzJi1l1lll1l;
        private long ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public interface dbpqdHhmDSIHIJiwc1ll1l1 {
            void dbpqdHhmDSIHIJiwc1ll1l1();
        }

        interface dpbdbdpbLwkLpObyKsq1lll1 {
            void dbpqdHhmDSIHIJiwc1ll1l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll);
        }

        public static class dqqppqiKzJi1l1lll1l {
            public int dbpqdHhmDSIHIJiwc1ll1l1;
            public int dpbdbdpbLwkLpObyKsq1lll1;
            public int dpbdpqRKAscW1lll1l;
            public int dqqppqiKzJi1l1lll1l;

            public dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
            }

            public dqqppqiKzJi1l1lll1l dpbdbdpbLwkLpObyKsq1lll1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, int i) {
            }
        }

        static int bpdqqiQNVROMLC1ll1l1l11(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        public void bbdbbpdOJSuInlll111l(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        public long bdddqmITkkeGpsxVXHR1l1llll() {
        }

        public dqqppqiKzJi1l1lll1l bppbpdbCeZVhQNTixBml1lll11l(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, int i, List<Object> list) {
        }

        void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        public dqqppqiKzJi1l1lll1l dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
        }

        public dqqppqiKzJi1l1lll1l dbbpdqqpdVUhpQ1ll11(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        public abstract void dbppbdqpeLmcbs11l11(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll);

        public abstract boolean dbpqdHhmDSIHIJiwc1ll1l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2);

        public final void ddbbbeXHXx111ll(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        public long ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
        }

        public abstract boolean dpbdbdpbLwkLpObyKsq1lll1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll2, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2);

        public abstract boolean dpbdpqRKAscW1lll1l(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2);

        public long dqdqbpQposEBDyDxIyyz1ll11() {
        }

        public final void dqpdbEevAufTOvPphbjykClll1l11() {
        }

        public boolean dqpqqqbqQyjyB11111l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, List<Object> list) {
        }

        public abstract boolean dqqppqiKzJi1l1lll1l(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2);

        public abstract void pbppbpqbamJRy11l1l1();

        public abstract boolean ppbdpwWWljzmXXdHNabfWhgjl111l11(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll);

        public abstract boolean qbddqbdJBkudFfhX1ll1l111();

        public long qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
        }

        public abstract void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l();
    }

    public static class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l {
        SparseArray<dbpqdHhmDSIHIJiwc1ll1l1> dbpqdHhmDSIHIJiwc1ll1l1;
        int dpbdbdpbLwkLpObyKsq1lll1;
        Set<ddbbbeXHXx111ll<?>> dqqppqiKzJi1l1lll1l;

        static class dbpqdHhmDSIHIJiwc1ll1l1 {
            final ArrayList<bpqbbqTOKdRXac1ll1l1lll> dbpqdHhmDSIHIJiwc1ll1l1;
            int dpbdbdpbLwkLpObyKsq1lll1;
            long dpbdpqRKAscW1lll1l;
            long dqqppqiKzJi1l1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }
        }

        private dbpqdHhmDSIHIJiwc1ll1l1 dqpdbEevAufTOvPphbjykClll1l11(int i) {
        }

        boolean bdddqmITkkeGpsxVXHR1l1llll(int i, long j, long j2) {
        }

        void bpdqqiQNVROMLC1ll1l1l11(ddbbbeXHXx111ll<?> ddbbbexhxx111ll, boolean z) {
        }

        void dbppbdqpeLmcbs11l11(ddbbbeXHXx111ll<?> ddbbbexhxx111ll, ddbbbeXHXx111ll<?> ddbbbexhxx111ll2, boolean z) {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public bpqbbqTOKdRXac1ll1l1lll ddbbbeXHXx111ll(int i) {
        }

        long ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(long j, long j2) {
        }

        void dpbdbdpbLwkLpObyKsq1lll1(ddbbbeXHXx111ll<?> ddbbbexhxx111ll) {
        }

        void dpbdpqRKAscW1lll1l() {
        }

        boolean dqdqbpQposEBDyDxIyyz1ll11(int i, long j, long j2) {
        }

        void dqpqqqbqQyjyB11111l1(int i, long j) {
        }

        public void dqqppqiKzJi1l1lll1l() {
        }

        public void pbppbpqbamJRy11l1l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
        }

        void ppbdpwWWljzmXXdHNabfWhgjl111l11(int i, long j) {
        }

        public void qbdpqpstJKhhKkXrsOGvbWw1l1llll(int i, int i2) {
        }
    }

    public interface qdqdpyALEmZFGGaahRTIU1ll11 {
        void dbpqdHhmDSIHIJiwc1ll1l1(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll);
    }

    private class qppqdpppIauLKaAtRkB11111l extends dbppbdqpeLmcbs11l11 {
        final /* synthetic */ RecyclerView dbpqdHhmDSIHIJiwc1ll1l1;

        qppqdpppIauLKaAtRkB11111l(RecyclerView recyclerView) {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onChanged() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeChanged(int i, int i2, Object obj) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeInserted(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeRemoved(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onStateRestorationPolicyChanged() {
        }
    }

    public RecyclerView(Context context) {
    }

    static /* synthetic */ void access$000(RecyclerView recyclerView, View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    static /* synthetic */ void access$100(RecyclerView recyclerView, int i) {
    }

    static /* synthetic */ boolean access$200(RecyclerView recyclerView) {
    }

    static /* synthetic */ void access$300(RecyclerView recyclerView, int i, int i2) {
    }

    private void addAnimatingView(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
    }

    private void animateChange(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll2, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2, boolean z, boolean z2) {
    }

    private void cancelScroll() {
    }

    static void clearNestedRecyclerViewIfNotNested(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
    }

    private int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
    }

    private boolean didChildRangeChange(int i, int i2) {
    }

    private void dispatchContentChangedIfNecessary() {
    }

    private void dispatchLayoutStep1() {
    }

    private void dispatchLayoutStep2() {
    }

    private void dispatchLayoutStep3() {
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
    }

    static RecyclerView findNestedRecyclerView(View view) {
    }

    private View findNextViewToFocus() {
    }

    static bpqbbqTOKdRXac1ll1l1lll getChildViewHolderInt(View view) {
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
    }

    private int getDeepestFocusedViewWithId(View view) {
    }

    private String getFullClassName(Context context, String str) {
    }

    private og0 getScrollingChildHelper() {
    }

    private float getSplineFlingDistance(int i) {
    }

    private void handleMissingPreInfoForChangeError(long j, bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll2) {
    }

    private boolean hasUpdatedView() {
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
    }

    private void initChildrenHelper() {
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
    }

    private void nestedScrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
    }

    private void onPointerUp(MotionEvent motionEvent) {
    }

    private boolean predictiveItemAnimationsEnabled() {
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
    }

    private void pullGlows(float f, float f2, float f3, float f4) {
    }

    private void recoverFocusFromState() {
    }

    private void releaseGlows() {
    }

    private int releaseHorizontalGlow(int i, float f) {
    }

    private int releaseVerticalGlow(int i, float f) {
    }

    private void requestChildOnScreen(View view, View view2) {
    }

    private void resetFocusInfo() {
    }

    private void resetScroll() {
    }

    private void saveFocusInfo() {
    }

    private void setAdapterInternal(ddbbbeXHXx111ll<?> ddbbbexhxx111ll, boolean z, boolean z2) {
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i, int i2) {
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
    }

    private void stopScrollersInternal() {
    }

    void absorbGlows(int i, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
    }

    public void addItemDecoration(dqdqbpQposEBDyDxIyyz1ll11 dqdqbpqposebdydxiyyz1ll11, int i) {
    }

    public void addOnChildAttachStateChangeListener(dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbbpbdqppoihgplmhjlfsbeeoqw11l1ll1l1) {
    }

    public void addOnItemTouchListener(dbbpdqqpdVUhpQ1ll11 dbbpdqqpdvuhpq1ll11) {
    }

    public void addOnScrollListener(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l) {
    }

    public void addRecyclerListener(qdqdpyALEmZFGGaahRTIU1ll11 qdqdpyalemzfggaahrtiu1ll11) {
    }

    void animateAppearance(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2) {
    }

    void animateDisappearance(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l2) {
    }

    void assertInLayoutOrScroll(String str) {
    }

    void assertNotInLayoutOrScroll(String str) {
    }

    boolean canReuseUpdatedViewHolder(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    void clearOldPositions() {
    }

    public void clearOnChildAttachStateChangeListeners() {
    }

    public void clearOnScrollListeners() {
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
    public int computeVerticalScrollExtent() {
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
    }

    void considerReleasingGlowsOnScroll(int i, int i2) {
    }

    int consumeFlingInHorizontalStretch(int i) {
    }

    int consumeFlingInVerticalStretch(int i) {
    }

    void consumePendingUpdateOperations() {
    }

    void defaultOnMeasure(int i, int i2) {
    }

    void dispatchChildAttached(View view) {
    }

    void dispatchChildDetached(View view) {
    }

    void dispatchLayout() {
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

    void dispatchOnScrollStateChanged(int i) {
    }

    void dispatchOnScrolled(int i, int i2) {
    }

    void dispatchPendingImportantForAccessibilityChanges() {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
    }

    void ensureBottomGlow() {
    }

    void ensureLeftGlow() {
    }

    void ensureRightGlow() {
    }

    void ensureTopGlow() {
    }

    String exceptionLabel() {
    }

    final void fillRemainingScrollValues(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    public View findChildViewUnder(float f, float f2) {
    }

    public View findContainingItemView(View view) {
    }

    public bpqbbqTOKdRXac1ll1l1lll findContainingViewHolder(View view) {
    }

    public bpqbbqTOKdRXac1ll1l1lll findViewHolderForAdapterPosition(int i) {
    }

    public bpqbbqTOKdRXac1ll1l1lll findViewHolderForItemId(long j) {
    }

    public bpqbbqTOKdRXac1ll1l1lll findViewHolderForLayoutPosition(int i) {
    }

    @Deprecated
    public bpqbbqTOKdRXac1ll1l1lll findViewHolderForPosition(int i) {
    }

    public boolean fling(int i, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
    }

    public ddbbbeXHXx111ll getAdapter() {
    }

    int getAdapterPositionInRecyclerView(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
    }

    @Override // android.view.View
    public int getBaseline() {
    }

    long getChangedHolderKey(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
    }

    public int getChildAdapterPosition(View view) {
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
    }

    public long getChildItemId(View view) {
    }

    public int getChildLayoutPosition(View view) {
    }

    @Deprecated
    public int getChildPosition(View view) {
    }

    public bpqbbqTOKdRXac1ll1l1lll getChildViewHolder(View view) {
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
    }

    public androidx.recyclerview.widget.bdddqmITkkeGpsxVXHR1l1llll getCompatAccessibilityDelegate() {
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
    }

    public ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll getEdgeEffectFactory() {
    }

    public qbdpqpstJKhhKkXrsOGvbWw1l1llll getItemAnimator() {
    }

    Rect getItemDecorInsetsForChild(View view) {
    }

    public dqdqbpQposEBDyDxIyyz1ll11 getItemDecorationAt(int i) {
    }

    public int getItemDecorationCount() {
    }

    public LayoutManager getLayoutManager() {
    }

    public int getMaxFlingVelocity() {
    }

    public int getMinFlingVelocity() {
    }

    long getNanoTime() {
    }

    public bbdbbpdOJSuInlll111l getOnFlingListener() {
    }

    public boolean getPreserveFocusAfterLayout() {
    }

    public qbdqqpbqpCWRpIKEKtzoceYOll1ll1l getRecycledViewPool() {
    }

    public int getScrollState() {
    }

    public boolean hasFixedSize() {
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
    }

    public boolean hasPendingAdapterUpdates() {
    }

    void initAdapterManager() {
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
    }

    void invalidateGlows() {
    }

    public void invalidateItemDecorations() {
    }

    boolean isAccessibilityEnabled() {
    }

    public boolean isAnimating() {
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
    }

    public boolean isComputingLayout() {
    }

    @Deprecated
    public boolean isLayoutFrozen() {
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
    }

    @Override // android.view.View, p000.ng0
    public boolean isNestedScrollingEnabled() {
    }

    void jumpToPositionForSmoothScroller(int i) {
    }

    void markItemDecorInsetsDirty() {
    }

    void markKnownViewsInvalid() {
    }

    public void nestedScrollBy(int i, int i2) {
    }

    public void offsetChildrenHorizontal(int i) {
    }

    public void offsetChildrenVertical(int i) {
    }

    void offsetPositionRecordsForInsert(int i, int i2) {
    }

    void offsetPositionRecordsForMove(int i, int i2) {
    }

    void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    void onEnterLayoutOrScroll() {
    }

    void onExitLayoutOrScroll() {
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
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

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    void postAnimationRunner() {
    }

    void processDataSetCompletelyChanged(boolean z) {
    }

    void recordAnimationInfoIfBouncedHiddenView(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, qbdpqpstJKhhKkXrsOGvbWw1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    void removeAndRecycleViews() {
    }

    boolean removeAnimatingView(View view) {
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
    }

    public void removeItemDecoration(dqdqbpQposEBDyDxIyyz1ll11 dqdqbpqposebdydxiyyz1ll11) {
    }

    public void removeItemDecorationAt(int i) {
    }

    public void removeOnChildAttachStateChangeListener(dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbbpbdqppoihgplmhjlfsbeeoqw11l1ll1l1) {
    }

    public void removeOnItemTouchListener(dbbpdqqpdVUhpQ1ll11 dbbpdqqpdvuhpq1ll11) {
    }

    public void removeOnScrollListener(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l) {
    }

    public void removeRecyclerListener(qdqdpyALEmZFGGaahRTIU1ll11 qdqdpyalemzfggaahrtiu1ll11) {
    }

    void repositionShadowingViews() {
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

    void saveOldPositions() {
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
    }

    boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
    }

    void scrollStep(int i, int i2, int[] iArr) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void scrollToPosition(int i) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    public void setAdapter(ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    public void setChildDrawingOrderCallback(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    boolean setChildImportantForAccessibilityInternal(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll, int i) {
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
    }

    public void setEdgeEffectFactory(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll) {
    }

    public void setHasFixedSize(boolean z) {
    }

    public void setItemAnimator(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
    }

    public void setItemViewCacheSize(int i) {
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
    }

    public void setLayoutManager(LayoutManager layoutManager) {
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
    }

    public void setOnFlingListener(bbdbbpdOJSuInlll111l bbdbbpdojsuinlll111l) {
    }

    @Deprecated
    public void setOnScrollListener(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l) {
    }

    public void setPreserveFocusAfterLayout(boolean z) {
    }

    public void setRecycledViewPool(qbdqqpbqpCWRpIKEKtzoceYOll1ll1l qbdqqpbqpcwrpikektzoceyoll1ll1l) {
    }

    @Deprecated
    public void setRecyclerListener(qdqdpyALEmZFGGaahRTIU1ll11 qdqdpyalemzfggaahrtiu1ll11) {
    }

    void setScrollState(int i) {
    }

    public void setScrollingTouchSlop(int i) {
    }

    public void setViewCacheExtension(ddddbbdqIccDnEitQc1l1l1l ddddbbdqiccdneitqc1l1l1l) {
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    public void smoothScrollBy(int i, int i2) {
    }

    public void smoothScrollToPosition(int i) {
    }

    void startInterceptRequestLayout() {
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
    }

    void stopInterceptRequestLayout(boolean z) {
    }

    @Override // android.view.View, p000.ng0
    public void stopNestedScroll() {
    }

    public void stopScroll() {
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
    }

    public void swapAdapter(ddbbbeXHXx111ll ddbbbexhxx111ll, boolean z) {
    }

    void viewRangeUpdate(int i, int i2, Object obj) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
    }

    bpqbbqTOKdRXac1ll1l1lll findViewHolderForPosition(int i, boolean z) {
    }

    public boolean hasNestedScrollingParent(int i) {
    }

    void onExitLayoutOrScroll(boolean z) {
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
    }

    public boolean startNestedScroll(int i, int i2) {
    }

    public void stopNestedScroll(int i) {
    }

    public static class bpbbpOxqjGWQAsycX11ll1l1 extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<bpbbpOxqjGWQAsycX11ll1l1> CREATOR = null;
        Parcelable dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.ClassLoaderCreator<bpbbpOxqjGWQAsycX11ll1l1> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            public bpbbpOxqjGWQAsycX11ll1l1 dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public bpbbpOxqjGWQAsycX11ll1l1 dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel, ClassLoader classLoader) {
            }

            public bpbbpOxqjGWQAsycX11ll1l1[] dqqppqiKzJi1l1lll1l(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ bpbbpOxqjGWQAsycX11ll1l1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        bpbbpOxqjGWQAsycX11ll1l1(Parcel parcel, ClassLoader classLoader) {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1(bpbbpOxqjGWQAsycX11ll1l1 bpbbpoxqjgwqasycx11ll1l1) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        bpbbpOxqjGWQAsycX11ll1l1(Parcelable parcelable) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
    }

    public static class qbddqbdJBkudFfhX1ll1l111 extends ViewGroup.MarginLayoutParams {
        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        bpqbbqTOKdRXac1ll1l1lll mViewHolder;

        public qbddqbdJBkudFfhX1ll1l111(Context context, AttributeSet attributeSet) {
        }

        public int getAbsoluteAdapterPosition() {
        }

        public int getBindingAdapterPosition() {
        }

        @Deprecated
        public int getViewAdapterPosition() {
        }

        public int getViewLayoutPosition() {
        }

        @Deprecated
        public int getViewPosition() {
        }

        public boolean isItemChanged() {
        }

        public boolean isItemRemoved() {
        }

        public boolean isViewInvalid() {
        }

        public boolean viewNeedsUpdate() {
        }

        public qbddqbdJBkudFfhX1ll1l111(int i, int i2) {
        }

        public qbddqbdJBkudFfhX1ll1l111(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public qbddqbdJBkudFfhX1ll1l111(ViewGroup.LayoutParams layoutParams) {
        }

        public qbddqbdJBkudFfhX1ll1l111(qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
    }

    public void addItemDecoration(dqdqbpQposEBDyDxIyyz1ll11 dqdqbpqposebdydxiyyz1ll11) {
    }
}
