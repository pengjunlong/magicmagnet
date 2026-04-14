package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import p000.bdpdqYMMfHmzHyUIbllllll1;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.z12;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    private ColorStateList backgroundTint;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final z12.dqqppqiKzJi1l1lll1l dragCallback;
    private boolean draggable;
    float elevation;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    z12 viewDragHelper;
    WeakReference<V> viewRef;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$1 */
    class RunnableC02831 implements Runnable {
        final /* synthetic */ BottomSheetBehavior this$0;
        final /* synthetic */ View val$child;
        final /* synthetic */ int val$finalState;

        RunnableC02831(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$2 */
    class C02842 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BottomSheetBehavior this$0;

        C02842(BottomSheetBehavior bottomSheetBehavior) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$3 */
    class C02853 implements ViewUtils.OnApplyWindowInsetsListener {
        final /* synthetic */ BottomSheetBehavior this$0;
        final /* synthetic */ boolean val$shouldHandleGestureInsets;

        C02853(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, ViewUtils.RelativePadding relativePadding) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$4 */
    class C02864 extends z12.dqqppqiKzJi1l1lll1l {
        final /* synthetic */ BottomSheetBehavior this$0;
        private long viewCapturedMillis;

        C02864(BottomSheetBehavior bottomSheetBehavior) {
        }

        private boolean releasedLow(View view) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int clampViewPositionHorizontal(View view, int i, int i2) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int clampViewPositionVertical(View view, int i, int i2) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public int getViewVerticalDragRange(View view) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onViewDragStateChanged(int i) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public void onViewReleased(View view, float f, float f2) {
        }

        @Override // z12.dqqppqiKzJi1l1lll1l
        public boolean tryCaptureView(View view, int i) {
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$5 */
    class C02875 implements bdpdqYMMfHmzHyUIbllllll1 {
        final /* synthetic */ BottomSheetBehavior this$0;
        final /* synthetic */ int val$state;

        C02875(BottomSheetBehavior bottomSheetBehavior, int i) {
        }

        @Override // p000.bdpdqYMMfHmzHyUIbllllll1
        public boolean perform(View view, bdpdqYMMfHmzHyUIbllllll1.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    public static abstract class BottomSheetCallback {
        void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    protected static class SavedState extends dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1 */
        class C02881 implements Parcelable.ClassLoaderCreator<SavedState> {
            C02881() {
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

        public SavedState(Parcel parcel) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public BottomSheetBehavior() {
    }

    static /* synthetic */ void access$100(BottomSheetBehavior bottomSheetBehavior, View view, int i, boolean z) {
    }

    static /* synthetic */ boolean access$1000(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ int access$1102(BottomSheetBehavior bottomSheetBehavior, int i) {
    }

    static /* synthetic */ void access$1200(BottomSheetBehavior bottomSheetBehavior, boolean z) {
    }

    static /* synthetic */ boolean access$1300(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ boolean access$1400(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ int access$1500(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ boolean access$1600(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ int access$1900(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ MaterialShapeDrawable access$200(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ boolean access$2000(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ int access$302(BottomSheetBehavior bottomSheetBehavior, int i) {
    }

    static /* synthetic */ boolean access$400(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ int access$500(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ int access$502(BottomSheetBehavior bottomSheetBehavior, int i) {
    }

    static /* synthetic */ boolean access$600(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ boolean access$700(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ boolean access$800(BottomSheetBehavior bottomSheetBehavior) {
    }

    static /* synthetic */ boolean access$900(BottomSheetBehavior bottomSheetBehavior) {
    }

    private int addAccessibilityActionForState(View view, int i, int i2) {
    }

    private void calculateCollapsedOffset() {
    }

    private void calculateHalfExpandedOffset() {
    }

    private int calculatePeekHeight() {
    }

    private float calculateSlideOffsetWithTop(int i) {
    }

    private boolean canBeHiddenByDragging() {
    }

    private void clearAccessibilityAction(View view, int i) {
    }

    private bdpdqYMMfHmzHyUIbllllll1 createAccessibilityViewCommandForState(int i) {
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
    }

    private void createShapeValueAnimator() {
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
    }

    private int getTopOffsetForState(int i) {
    }

    private float getYVelocity() {
    }

    private boolean isExpandedAndShouldRemoveCorners() {
    }

    private boolean isLayouting(V v) {
    }

    private void replaceAccessibilityActionForState(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, int i) {
    }

    private void reset() {
    }

    private void restoreOptionalState(SavedState savedState) {
    }

    private void runAfterLayout(V v, Runnable runnable) {
    }

    private void setWindowInsetsListener(View view) {
    }

    private boolean shouldHandleDraggingWithHelper() {
    }

    private void startSettling(View view, int i, boolean z) {
    }

    private void updateAccessibilityActions() {
    }

    private void updateDrawableForTargetState(int i, boolean z) {
    }

    private void updateImportantForAccessibility(boolean z) {
    }

    private void updatePeekHeight(boolean z) {
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
    }

    public float calculateSlideOffset() {
    }

    public void disableShapeAnimations() {
    }

    void dispatchOnSlide(int i) {
    }

    View findScrollingChild(View view) {
    }

    public int getExpandedOffset() {
    }

    public float getHalfExpandedRatio() {
    }

    public float getHideFriction() {
    }

    public int getLastStableState() {
    }

    MaterialShapeDrawable getMaterialShapeDrawable() {
    }

    public int getMaxHeight() {
    }

    public int getMaxWidth() {
    }

    public int getPeekHeight() {
    }

    int getPeekHeightMin() {
    }

    public int getSaveFlags() {
    }

    public int getSignificantVelocityThreshold() {
    }

    public boolean getSkipCollapsed() {
    }

    public int getState() {
    }

    public boolean isDraggable() {
    }

    public boolean isFitToContents() {
    }

    public boolean isGestureInsetBottomIgnored() {
    }

    public boolean isHideable() {
    }

    public boolean isHideableWhenDragging() {
    }

    public boolean isNestedScrollingCheckEnabled() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onAttachedToLayoutParams(CoordinatorLayout.ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onDetachedFromLayoutParams() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
    }

    void setAccessibilityDelegateView(View view) {
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
    }

    public void setDraggable(boolean z) {
    }

    public void setExpandedOffset(int i) {
    }

    public void setFitToContents(boolean z) {
    }

    public void setGestureInsetBottomIgnored(boolean z) {
    }

    public void setHalfExpandedRatio(float f) {
    }

    public void setHideFriction(float f) {
    }

    public void setHideable(boolean z) {
    }

    public void setHideableInternal(boolean z) {
    }

    public void setMaxHeight(int i) {
    }

    public void setMaxWidth(int i) {
    }

    public void setPeekHeight(int i) {
    }

    public void setSaveFlags(int i) {
    }

    public void setSignificantVelocityThreshold(int i) {
    }

    public void setSkipCollapsed(boolean z) {
    }

    public void setState(int i) {
    }

    void setStateInternal(int i) {
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
    }

    public boolean shouldExpandOnUpwardDrag(long j, float f) {
    }

    boolean shouldHide(View view, float f) {
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
    }

    public boolean shouldSkipSmoothAnimation() {
    }

    private class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;
        final /* synthetic */ BottomSheetBehavior this$0;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker$1 */
        class RunnableC02891 implements Runnable {
            final /* synthetic */ StateSettlingTracker this$1;

            RunnableC02891(StateSettlingTracker stateSettlingTracker) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private StateSettlingTracker(BottomSheetBehavior bottomSheetBehavior) {
        }

        static /* synthetic */ boolean access$1702(StateSettlingTracker stateSettlingTracker, boolean z) {
        }

        static /* synthetic */ int access$1800(StateSettlingTracker stateSettlingTracker) {
        }

        void continueSettlingToState(int i) {
        }

        /* synthetic */ StateSettlingTracker(BottomSheetBehavior bottomSheetBehavior, RunnableC02831 runnableC02831) {
        }
    }

    public final void setPeekHeight(int i, boolean z) {
    }

    private void updateAccessibilityActions(View view, int i) {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
    }
}
