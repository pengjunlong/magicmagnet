package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1 {
    private static final int DEF_STYLE_RES = 0;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_ATTR = 0;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_DEFAULT = 300;
    private static final int FAB_ALIGNMENT_ANIM_EASING_ATTR = 0;
    private static final float FAB_ALIGNMENT_ANIM_EASING_MIDPOINT = 0.2f;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    private static final int NO_FAB_END_MARGIN = -1;
    private static final int NO_MENU_RES_ID = 0;
    private int animatingModeChangeCounter;
    private ArrayList<AnimationListener> animationListeners;
    private Behavior behavior;
    private int bottomInset;
    private int fabAlignmentMode;
    private int fabAlignmentModeEndMargin;
    private int fabAnchorMode;
    AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    private boolean fabAttached;
    private final int fabOffsetEndMode;
    TransformationCallback<FloatingActionButton> fabTransformationCallback;
    private boolean hideOnScroll;
    private int leftInset;
    private final MaterialShapeDrawable materialShapeDrawable;
    private int menuAlignmentMode;
    private boolean menuAnimatingWithFabAlignmentMode;
    private Animator menuAnimator;
    private Animator modeAnimator;
    private Integer navigationIconTint;
    private final boolean paddingBottomSystemWindowInsets;
    private final boolean paddingLeftSystemWindowInsets;
    private final boolean paddingRightSystemWindowInsets;
    private int pendingMenuResId;
    private final boolean removeEmbeddedFabElevation;
    private int rightInset;

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$1 */
    class C02711 extends AnimatorListenerAdapter {
        final /* synthetic */ BottomAppBar this$0;

        C02711(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$2 */
    class C02722 implements TransformationCallback<FloatingActionButton> {
        final /* synthetic */ BottomAppBar this$0;

        C02722(BottomAppBar bottomAppBar) {
        }

        @Override // com.google.android.material.animation.TransformationCallback
        public /* bridge */ /* synthetic */ void onScaleChanged(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.animation.TransformationCallback
        public /* bridge */ /* synthetic */ void onTranslationChanged(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: onScaleChanged, reason: avoid collision after fix types in other method */
        public void onScaleChanged2(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: onTranslationChanged, reason: avoid collision after fix types in other method */
        public void onTranslationChanged2(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$3 */
    class C02733 implements ViewUtils.OnApplyWindowInsetsListener {
        final /* synthetic */ BottomAppBar this$0;

        C02733(BottomAppBar bottomAppBar) {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, ViewUtils.RelativePadding relativePadding) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$4 */
    class C02744 extends AnimatorListenerAdapter {
        final /* synthetic */ BottomAppBar this$0;

        C02744(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5 */
    class C02755 extends FloatingActionButton.OnVisibilityChangedListener {
        final /* synthetic */ BottomAppBar this$0;
        final /* synthetic */ int val$targetMode;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5$1, reason: invalid class name */
        class AnonymousClass1 extends FloatingActionButton.OnVisibilityChangedListener {
            final /* synthetic */ C02755 this$1;

            AnonymousClass1(C02755 c02755) {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
            public void onShown(FloatingActionButton floatingActionButton) {
            }
        }

        C02755(BottomAppBar bottomAppBar, int i) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
        public void onHidden(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$6 */
    class C02766 extends AnimatorListenerAdapter {
        final /* synthetic */ BottomAppBar this$0;

        C02766(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$7 */
    class C02777 extends AnimatorListenerAdapter {
        public boolean cancelled;
        final /* synthetic */ BottomAppBar this$0;
        final /* synthetic */ ActionMenuView val$actionMenuView;
        final /* synthetic */ boolean val$targetAttached;
        final /* synthetic */ int val$targetMode;

        C02777(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$8 */
    class RunnableC02788 implements Runnable {
        final /* synthetic */ BottomAppBar this$0;
        final /* synthetic */ ActionMenuView val$actionMenuView;
        final /* synthetic */ int val$fabAlignmentMode;
        final /* synthetic */ boolean val$fabAttached;

        RunnableC02788(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$9 */
    class C02799 extends AnimatorListenerAdapter {
        final /* synthetic */ BottomAppBar this$0;

        C02799(BottomAppBar bottomAppBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    interface AnimationListener {
        void onAnimationEnd(BottomAppBar bottomAppBar);

        void onAnimationStart(BottomAppBar bottomAppBar);
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect fabContentRect;
        private final View.OnLayoutChangeListener fabLayoutListener;
        private int originalBottomMargin;
        private WeakReference<BottomAppBar> viewRef;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$1 */
        class ViewOnLayoutChangeListenerC02801 implements View.OnLayoutChangeListener {
            final /* synthetic */ Behavior this$0;

            ViewOnLayoutChangeListenerC02801(Behavior behavior) {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            }
        }

        public Behavior() {
        }

        static /* synthetic */ WeakReference access$2500(Behavior behavior) {
        }

        static /* synthetic */ Rect access$2600(Behavior behavior) {
        }

        static /* synthetic */ int access$2700(Behavior behavior) {
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuAlignmentMode {
    }

    static class SavedState extends dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        int fabAlignmentMode;
        boolean fabAttached;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$1 */
        class C02811 implements Parcelable.ClassLoaderCreator<SavedState> {
            C02811() {
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

        public SavedState(Parcelable parcelable) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public BottomAppBar(Context context) {
    }

    static /* synthetic */ boolean access$000(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ boolean access$002(BottomAppBar bottomAppBar, boolean z) {
    }

    static /* synthetic */ int access$100(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ int access$1000(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ int access$1002(BottomAppBar bottomAppBar, int i) {
    }

    static /* synthetic */ boolean access$1100(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ int access$1200(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ int access$1202(BottomAppBar bottomAppBar, int i) {
    }

    static /* synthetic */ void access$1300(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ void access$1400(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ void access$1500(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ void access$1600(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ void access$1700(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ Animator access$1802(BottomAppBar bottomAppBar, Animator animator) {
    }

    static /* synthetic */ float access$1900(BottomAppBar bottomAppBar, int i) {
    }

    static /* synthetic */ boolean access$200(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ Animator access$2002(BottomAppBar bottomAppBar, Animator animator) {
    }

    static /* synthetic */ int access$2100(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ void access$2200(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
    }

    static /* synthetic */ FloatingActionButton access$2300(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ float access$2400(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ int access$2800(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ int access$2900(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ void access$300(BottomAppBar bottomAppBar, int i, boolean z) {
    }

    static /* synthetic */ int access$3000(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ int access$3100(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ View access$3200(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ void access$3300(BottomAppBar bottomAppBar, View view) {
    }

    static /* synthetic */ boolean access$3400(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ void access$3500(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
    }

    static /* synthetic */ int access$400(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ MaterialShapeDrawable access$500(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ BottomAppBarTopEdgeTreatment access$600(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ boolean access$700(BottomAppBar bottomAppBar) {
    }

    static /* synthetic */ int access$802(BottomAppBar bottomAppBar, int i) {
    }

    static /* synthetic */ boolean access$900(BottomAppBar bottomAppBar) {
    }

    private void addFabAnimationListeners(FloatingActionButton floatingActionButton) {
    }

    private void cancelAnimations() {
    }

    private void createFabTranslationXAnimation(int i, List<Animator> list) {
    }

    private void createMenuViewTranslationAnimation(int i, boolean z, List<Animator> list) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
    }

    private void dispatchAnimationEnd() {
    }

    private void dispatchAnimationStart() {
    }

    private FloatingActionButton findDependentFab() {
    }

    private View findDependentView() {
    }

    private ActionMenuView getActionMenuView() {
    }

    private int getBottomInset() {
    }

    private int getFabAlignmentAnimationDuration() {
    }

    private float getFabTranslationX(int i) {
    }

    private float getFabTranslationY() {
    }

    private int getLeftInset() {
    }

    private int getRightInset() {
    }

    private BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
    }

    private boolean isFabVisibleOrWillBeShown() {
    }

    private static /* synthetic */ void lambda$onLayout$0(View view) {
    }

    private void maybeAnimateMenuView(int i, boolean z) {
    }

    private void maybeAnimateModeChange(int i) {
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
    }

    private void setActionMenuViewPosition() {
    }

    private void setCutoutStateAndTranslateFab() {
    }

    private void translateActionMenuView(ActionMenuView actionMenuView, int i, boolean z) {
    }

    private static void updateFabAnchorGravity(BottomAppBar bottomAppBar, View view) {
    }

    void addAnimationListener(AnimationListener animationListener) {
    }

    public void addOnScrollStateChangedListener(HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
    }

    public void clearOnScrollStateChangedListeners() {
    }

    protected void createFabDefaultXAnimation(int i, List<Animator> list) {
    }

    protected int getActionMenuViewTranslationX(ActionMenuView actionMenuView, int i, boolean z) {
    }

    public ColorStateList getBackgroundTint() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1
    public /* bridge */ /* synthetic */ CoordinatorLayout.dqqppqiKzJi1l1lll1l getBehavior() {
    }

    public float getCradleVerticalOffset() {
    }

    public int getFabAlignmentMode() {
    }

    public int getFabAlignmentModeEndMargin() {
    }

    public int getFabAnchorMode() {
    }

    public int getFabAnimationMode() {
    }

    public float getFabCradleMargin() {
    }

    public float getFabCradleRoundedCornerRadius() {
    }

    public boolean getHideOnScroll() {
    }

    public int getMenuAlignmentMode() {
    }

    public boolean isScrolledDown() {
    }

    public boolean isScrolledUp() {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    public void performHide() {
    }

    public void performShow() {
    }

    void removeAnimationListener(AnimationListener animationListener) {
    }

    public void removeOnScrollStateChangedListener(HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
    }

    public void replaceMenu(int i) {
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
    }

    public void setCradleVerticalOffset(float f) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setFabAlignmentMode(int i) {
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
    }

    public void setFabAlignmentModeEndMargin(int i) {
    }

    public void setFabAnchorMode(int i) {
    }

    public void setFabAnimationMode(int i) {
    }

    void setFabCornerSize(float f) {
    }

    public void setFabCradleMargin(float f) {
    }

    public void setFabCradleRoundedCornerRadius(float f) {
    }

    boolean setFabDiameter(int i) {
    }

    public void setHideOnScroll(boolean z) {
    }

    public void setMenuAlignmentMode(int i) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
    }

    public void setNavigationIconTint(int i) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
    }

    private void translateActionMenuView(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1
    public Behavior getBehavior() {
    }

    public void performHide(boolean z) {
    }

    public void performShow(boolean z) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
    }

    private float getFabTranslationX() {
    }
}
