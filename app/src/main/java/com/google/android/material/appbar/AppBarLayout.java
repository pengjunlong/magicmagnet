package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.bdpdqYMMfHmzHyUIbllllll1;
import p000.bn0;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1 {
    private static final int DEF_STYLE_RES = 0;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private boolean haveChildWithInterpolator;
    private bdddqmITkkeGpsxVXHR1l1llll lastInsets;
    private boolean liftOnScroll;
    private final ColorStateList liftOnScrollColor;
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;
    private WeakReference<View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;
    private Drawable statusBarForeground;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    /* renamed from: com.google.android.material.appbar.AppBarLayout$1 */
    class C02541 implements bn0 {
        final /* synthetic */ AppBarLayout this$0;

        C02541(AppBarLayout appBarLayout) {
        }

        @Override // p000.bn0
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final double EXPAND_BY_KEY_EVENT_THRESHOLD_PERCENTAGE = 0.1d;
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private boolean coordinatorLayoutA11yScrollable;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$1 */
        class C02551 implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ BaseBehavior this$0;
            final /* synthetic */ AppBarLayout val$child;
            final /* synthetic */ CoordinatorLayout val$coordinatorLayout;

            C02551(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$2 */
        class C02562 extends dbpqdHhmDSIHIJiwc1ll1l1 {
            final /* synthetic */ BaseBehavior this$0;

            C02562(BaseBehavior baseBehavior) {
            }

            @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
            public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$3 */
        class C02573 implements bdpdqYMMfHmzHyUIbllllll1 {
            final /* synthetic */ BaseBehavior this$0;
            final /* synthetic */ AppBarLayout val$appBarLayout;
            final /* synthetic */ CoordinatorLayout val$coordinatorLayout;
            final /* synthetic */ int val$dy;
            final /* synthetic */ View val$scrollingView;

            C02573(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            }

            @Override // p000.bdpdqYMMfHmzHyUIbllllll1
            public boolean perform(View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$4 */
        class C02584 implements bdpdqYMMfHmzHyUIbllllll1 {
            final /* synthetic */ BaseBehavior this$0;
            final /* synthetic */ AppBarLayout val$appBarLayout;
            final /* synthetic */ boolean val$expand;

            C02584(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
            }

            @Override // p000.bdpdqYMMfHmzHyUIbllllll1
            public boolean perform(View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
            }
        }

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(T t);
        }

        public BaseBehavior() {
        }

        static /* synthetic */ boolean access$000(BaseBehavior baseBehavior) {
        }

        static /* synthetic */ int access$100(BaseBehavior baseBehavior) {
        }

        private boolean addAccessibilityScrollActions(CoordinatorLayout coordinatorLayout, T t, View view) {
        }

        private void addActionToExpand(CoordinatorLayout coordinatorLayout, T t, dqqpbqaYiRPLeqRCYteXfDW1l111l11l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, boolean z) {
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
        }

        private void animateOffsetWithDuration(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
        }

        private int calculateSnapOffset(int i, int i2, int i3) {
        }

        private boolean canScrollChildren(CoordinatorLayout coordinatorLayout, T t, View view) {
        }

        private static boolean checkFlag(int i, int i2) {
        }

        private boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
        }

        private void controlExpansionOnKeyPress(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
        }

        public static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(BaseBehavior baseBehavior, View view, AppBarLayout appBarLayout, View view2, int i, KeyEvent keyEvent) {
        }

        public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(BaseBehavior baseBehavior, View view, AppBarLayout appBarLayout, View view2, KeyEvent keyEvent) {
        }

        private View findFirstScrollingChild(CoordinatorLayout coordinatorLayout) {
        }

        private static View getAppBarChildOnOffset(AppBarLayout appBarLayout, int i) {
        }

        private int getChildIndexOnOffset(T t, int i) {
        }

        private View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
        }

        private int interpolateOffset(T t, int i) {
        }

        private /* synthetic */ boolean lambda$onLayoutChild$0(View view, AppBarLayout appBarLayout, View view2, KeyEvent keyEvent) {
        }

        private /* synthetic */ boolean lambda$onLayoutChild$1(View view, AppBarLayout appBarLayout, View view2, int i, KeyEvent keyEvent) {
        }

        private boolean shouldJumpElevationState(CoordinatorLayout coordinatorLayout, T t) {
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, T t) {
        }

        private void updateAccessibilityActions(CoordinatorLayout coordinatorLayout, T t) {
        }

        private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ boolean canDragView(View view) {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ int getMaxDragOffset(View view) {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ int getScrollRangeForDragFling(View view) {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int getTopBottomOffsetForScrollingSibling() {
        }

        boolean isOffsetAnimatorRunning() {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ void onFlingFinished(CoordinatorLayout coordinatorLayout, View view) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        }

        void restoreScrollState(SavedState savedState, boolean z) {
        }

        SavedState saveScrollState(Parcelable parcelable, T t) {
        }

        public void setDragCallback(BaseDragCallback baseDragCallback) {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
        }

        boolean canDragView(T t) {
        }

        int getMaxDragOffset(T t) {
        }

        int getScrollRangeForDragFling(T t) {
        }

        void onFlingFinished(CoordinatorLayout coordinatorLayout, T t) {
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
        }

        int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
        }

        protected static class SavedState extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
            public static final Parcelable.Creator<SavedState> CREATOR = null;
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1 */
            class C02591 implements Parcelable.ClassLoaderCreator<SavedState> {
                C02591() {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Object[] newArray(int i) {
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                }

                @Override // android.os.Parcelable.Creator
                public SavedState[] newArray(int i) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                }

                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
            }

            public SavedState(Parcelable parcelable) {
            }
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.BaseDragCallback baseDragCallback) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(AppBarLayout appBarLayout, View view, float f);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect ghostRect;
        private final Rect relativeRect;

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(AppBarLayout appBarLayout, View view, float f) {
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        private ChildScrollEffect createScrollEffectFromInt(int i) {
        }

        public ChildScrollEffect getScrollEffect() {
        }

        public int getScrollFlags() {
        }

        public Interpolator getScrollInterpolator() {
        }

        boolean isCollapsible() {
        }

        public void setScrollEffect(ChildScrollEffect childScrollEffect) {
        }

        public void setScrollFlags(int i) {
        }

        public void setScrollInterpolator(Interpolator interpolator) {
        }

        public void setScrollEffect(int i) {
        }

        public LayoutParams(int i, int i2) {
        }

        public LayoutParams(int i, int i2, float f) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
        }

        public LayoutParams(LayoutParams layoutParams) {
        }
    }

    public interface LiftOnScrollListener {
        void onUpdate(float f, int i);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
        }

        private void offsetChildAsNeeded(View view, View view2) {
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* bridge */ /* synthetic */ View findFirstDependency(List list) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float getOverlapRatioForOffset(View view) {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int getScrollRange(View view) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        AppBarLayout findFirstDependency(List<View> list) {
        }
    }

    public AppBarLayout(Context context) {
    }

    private void clearLiftOnScrollTargetView() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
    }

    private View findLiftOnScrollTargetView(View view) {
    }

    private boolean hasCollapsibleChild() {
    }

    private void initializeLiftOnScrollWithColor(MaterialShapeDrawable materialShapeDrawable) {
    }

    private void initializeLiftOnScrollWithElevation(Context context, MaterialShapeDrawable materialShapeDrawable) {
    }

    private void invalidateScrollRanges() {
    }

    private /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
    }

    private boolean setLiftableState(boolean z) {
    }

    private boolean shouldDrawStatusBarForeground() {
    }

    private boolean shouldOffsetFirstChild() {
    }

    private void startLiftOnScrollColorAnimation(float f, float f2) {
    }

    private void updateWillNotDraw() {
    }

    public void addLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
    }

    public void addOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void clearLiftOnScrollListener() {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1
    public CoordinatorLayout.dqqppqiKzJi1l1lll1l<AppBarLayout> getBehavior() {
    }

    int getDownNestedPreScrollRange() {
    }

    int getDownNestedScrollRange() {
    }

    public int getLiftOnScrollTargetViewId() {
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
    }

    int getPendingAction() {
    }

    public Drawable getStatusBarForeground() {
    }

    @Deprecated
    public float getTargetElevation() {
    }

    final int getTopInset() {
    }

    public final int getTotalScrollRange() {
    }

    int getUpNestedPreScrollRange() {
    }

    boolean hasChildWithInterpolator() {
    }

    boolean hasScrollableChildren() {
    }

    public boolean isLiftOnScroll() {
    }

    public boolean isLifted() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    void onOffsetChanged(int i) {
    }

    bdddqmITkkeGpsxVXHR1l1llll onWindowInsetChanged(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    public boolean removeLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
    }

    public void removeOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
    }

    void resetPendingAction() {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setExpanded(boolean z) {
    }

    public void setLiftOnScroll(boolean z) {
    }

    public void setLiftOnScrollTargetView(View view) {
    }

    public void setLiftOnScrollTargetViewId(int i) {
    }

    public boolean setLiftable(boolean z) {
    }

    public void setLiftableOverrideEnabled(boolean z) {
    }

    public boolean setLifted(boolean z) {
    }

    boolean setLiftedState(boolean z) {
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
    }

    public void setStatusBarForeground(Drawable drawable) {
    }

    public void setStatusBarForegroundColor(int i) {
    }

    public void setStatusBarForegroundResource(int i) {
    }

    @Deprecated
    public void setTargetElevation(float f) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    boolean shouldLift(View view) {
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setExpanded(boolean z, boolean z2) {
    }

    boolean setLiftedState(boolean z, boolean z2) {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
    }

    private void setExpanded(boolean z, boolean z2, boolean z3) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }
}
