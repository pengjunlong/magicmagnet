package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.bn0;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    static final int DEFAULT_ANIMATION_FADE_DURATION = 180;
    private static final TimeInterpolator DEFAULT_ANIMATION_FADE_INTERPOLATOR = null;
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 150;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 75;
    private static final TimeInterpolator DEFAULT_ANIMATION_SCALE_INTERPOLATOR = null;
    private static final TimeInterpolator DEFAULT_ANIMATION_SLIDE_INTERPOLATOR = null;
    static final int DEFAULT_SLIDE_ANIMATION_DURATION = 250;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    static final int MSG_DISMISS = 1;
    static final int MSG_SHOW = 0;
    private static final int[] SNACKBAR_STYLE_ATTR = null;
    private static final String TAG = null;
    private static final boolean USE_OFFSET_API = false;
    static final Handler handler = null;
    private final AccessibilityManager accessibilityManager;
    private Anchor anchor;
    private boolean anchorViewLayoutListenerEnabled;
    private final int animationFadeInDuration;
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;
    private final TimeInterpolator animationScaleInterpolator;
    private final int animationSlideDuration;
    private final TimeInterpolator animationSlideInterpolator;
    private Behavior behavior;
    private final Runnable bottomMarginGestureInsetRunnable;
    private List<BaseCallback<B>> callbacks;
    private final com.google.android.material.snackbar.ContentViewCallback contentViewCallback;
    private final Context context;
    private int duration;
    private int extraBottomMarginAnchorView;
    private int extraBottomMarginGestureInset;
    private int extraBottomMarginWindowInset;
    private int extraLeftMarginWindowInset;
    private int extraRightMarginWindowInset;
    private boolean gestureInsetBottomIgnored;
    SnackbarManager.Callback managerCallback;
    private boolean pendingShowingView;
    private final ViewGroup targetParent;
    protected final SnackbarBaseLayout view;

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$1 */
    class C04501 implements Handler.Callback {
        C04501() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$10, reason: invalid class name */
    class AnonymousClass10 extends AnimatorListenerAdapter {
        final /* synthetic */ BaseTransientBottomBar this$0;
        final /* synthetic */ int val$event;

        AnonymousClass10(BaseTransientBottomBar baseTransientBottomBar, int i) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$11, reason: invalid class name */
    class AnonymousClass11 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BaseTransientBottomBar this$0;

        AnonymousClass11(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$12, reason: invalid class name */
    class AnonymousClass12 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ BaseTransientBottomBar this$0;

        AnonymousClass12(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$13, reason: invalid class name */
    class AnonymousClass13 extends AnimatorListenerAdapter {
        final /* synthetic */ BaseTransientBottomBar this$0;

        AnonymousClass13(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$14, reason: invalid class name */
    class AnonymousClass14 implements ValueAnimator.AnimatorUpdateListener {
        private int previousAnimatedIntValue;
        final /* synthetic */ BaseTransientBottomBar this$0;
        final /* synthetic */ int val$translationYBottom;

        AnonymousClass14(BaseTransientBottomBar baseTransientBottomBar, int i) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$15, reason: invalid class name */
    class AnonymousClass15 extends AnimatorListenerAdapter {
        final /* synthetic */ BaseTransientBottomBar this$0;
        final /* synthetic */ int val$event;

        AnonymousClass15(BaseTransientBottomBar baseTransientBottomBar, int i) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$16, reason: invalid class name */
    class AnonymousClass16 implements ValueAnimator.AnimatorUpdateListener {
        private int previousAnimatedIntValue;
        final /* synthetic */ BaseTransientBottomBar this$0;

        AnonymousClass16(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$2 */
    class RunnableC04512 implements Runnable {
        final /* synthetic */ BaseTransientBottomBar this$0;

        RunnableC04512(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$3 */
    class C04523 implements bn0 {
        final /* synthetic */ BaseTransientBottomBar this$0;

        C04523(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // p000.bn0
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$4 */
    class C04534 extends dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ BaseTransientBottomBar this$0;

        C04534(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$5 */
    class C04545 implements SnackbarManager.Callback {
        final /* synthetic */ BaseTransientBottomBar this$0;

        C04545(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public void dismiss(int i) {
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public void show() {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$6 */
    class RunnableC04556 implements Runnable {
        final /* synthetic */ BaseTransientBottomBar this$0;

        RunnableC04556(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$7 */
    class C04567 implements SwipeDismissBehavior.OnDismissListener {
        final /* synthetic */ BaseTransientBottomBar this$0;

        C04567(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
        public void onDismiss(View view) {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
        public void onDragStateChanged(int i) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$8 */
    class RunnableC04578 implements Runnable {
        final /* synthetic */ BaseTransientBottomBar this$0;

        RunnableC04578(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$9 */
    class C04589 extends AnimatorListenerAdapter {
        final /* synthetic */ BaseTransientBottomBar this$0;

        C04589(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    static class Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        private final WeakReference<View> anchorView;
        private final WeakReference<BaseTransientBottomBar> transientBottomBar;

        private Anchor(BaseTransientBottomBar baseTransientBottomBar, View view) {
        }

        static Anchor anchor(BaseTransientBottomBar baseTransientBottomBar, View view) {
        }

        private boolean unanchorIfNoTransientBottomBar() {
        }

        View getAnchorView() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        void unanchor() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        public void onDismissed(B b, int i) {
        }

        public void onShown(B b) {
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final BehaviorDelegate delegate;

        static /* synthetic */ void access$1100(Behavior behavior, BaseTransientBottomBar baseTransientBottomBar) {
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        }
    }

    public static class BehaviorDelegate {
        private SnackbarManager.Callback managerCallback;

        public BehaviorDelegate(SwipeDismissBehavior<?> swipeDismissBehavior) {
        }

        public boolean canSwipeDismissView(View view) {
        }

        public void onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        }

        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
        }
    }

    @Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    protected static class SnackbarBaseLayout extends FrameLayout {
        private static final View.OnTouchListener consumeAllTouchListener = null;
        private final float actionTextColorAlpha;
        private boolean addingToTargetParent;
        private int animationMode;
        private final float backgroundOverlayColorAlpha;
        private ColorStateList backgroundTint;
        private PorterDuff.Mode backgroundTintMode;
        private BaseTransientBottomBar<?> baseTransientBottomBar;
        private final int maxInlineActionWidth;
        private final int maxWidth;
        private Rect originalMargins;
        ShapeAppearanceModel shapeAppearanceModel;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1 */
        class ViewOnTouchListenerC04591 implements View.OnTouchListener {
            ViewOnTouchListenerC04591() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
            }
        }

        protected SnackbarBaseLayout(Context context) {
        }

        static /* synthetic */ Rect access$1000(SnackbarBaseLayout snackbarBaseLayout) {
        }

        static /* synthetic */ void access$500(SnackbarBaseLayout snackbarBaseLayout, BaseTransientBottomBar baseTransientBottomBar) {
        }

        private Drawable createThemedBackground() {
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
        }

        private void updateOriginalMargins(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        void addToTargetParent(ViewGroup viewGroup) {
        }

        float getActionTextColorAlpha() {
        }

        int getAnimationMode() {
        }

        float getBackgroundOverlayColorAlpha() {
        }

        int getMaxInlineActionWidth() {
        }

        int getMaxWidth() {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
        }

        void setAnimationMode(int i) {
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
        }

        protected SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
        }
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
    }

    static /* synthetic */ Context access$000(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ int access$100(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ void access$1200(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ void access$1300(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ int access$1400(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ int access$1500(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ com.google.android.material.snackbar.ContentViewCallback access$1600(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ boolean access$1700() {
    }

    static /* synthetic */ int access$1800(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ MaterialShapeDrawable access$1900(int i, ShapeAppearanceModel shapeAppearanceModel) {
    }

    static /* synthetic */ int access$200(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ GradientDrawable access$2000(int i, Resources resources) {
    }

    static /* synthetic */ boolean access$2100(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ void access$2200(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ int access$300(BaseTransientBottomBar baseTransientBottomBar) {
    }

    static /* synthetic */ String access$400() {
    }

    static /* synthetic */ int access$602(BaseTransientBottomBar baseTransientBottomBar, int i) {
    }

    static /* synthetic */ int access$702(BaseTransientBottomBar baseTransientBottomBar, int i) {
    }

    static /* synthetic */ int access$802(BaseTransientBottomBar baseTransientBottomBar, int i) {
    }

    static /* synthetic */ void access$900(BaseTransientBottomBar baseTransientBottomBar) {
    }

    private void animateViewOut(int i) {
    }

    private int calculateBottomMarginForAnchorView() {
    }

    private static GradientDrawable createGradientDrawableBackground(int i, Resources resources) {
    }

    private static MaterialShapeDrawable createMaterialShapeDrawableBackground(int i, ShapeAppearanceModel shapeAppearanceModel) {
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
    }

    private ValueAnimator getScaleAnimator(float... fArr) {
    }

    private int getScreenHeight() {
    }

    private int getTranslationYBottom() {
    }

    private int getViewAbsoluteBottom() {
    }

    private boolean isSwipeDismissable() {
    }

    private void recalculateAndUpdateMargins() {
    }

    private void setUpBehavior(CoordinatorLayout.ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    private boolean shouldUpdateGestureInset() {
    }

    private void showViewImpl() {
    }

    private void startFadeInAnimation() {
    }

    private void startFadeOutAnimation(int i) {
    }

    private void startSlideInAnimation() {
    }

    private void startSlideOutAnimation(int i) {
    }

    private void updateMargins() {
    }

    public B addCallback(BaseCallback<B> baseCallback) {
    }

    void animateViewIn() {
    }

    public void dismiss() {
    }

    protected void dispatchDismiss(int i) {
    }

    public View getAnchorView() {
    }

    public int getAnimationMode() {
    }

    public Behavior getBehavior() {
    }

    public Context getContext() {
    }

    public int getDuration() {
    }

    protected SwipeDismissBehavior<? extends View> getNewBehavior() {
    }

    protected int getSnackbarBaseLayoutResId() {
    }

    public View getView() {
    }

    protected boolean hasSnackbarStyleAttr() {
    }

    final void hideView(int i) {
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
    }

    public boolean isGestureInsetBottomIgnored() {
    }

    public boolean isShown() {
    }

    public boolean isShownOrQueued() {
    }

    void onAttachedToWindow() {
    }

    void onDetachedFromWindow() {
    }

    void onLayoutChange() {
    }

    void onViewHidden(int i) {
    }

    void onViewShown() {
    }

    public B removeCallback(BaseCallback<B> baseCallback) {
    }

    public B setAnchorView(View view) {
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z) {
    }

    public B setAnimationMode(int i) {
    }

    public B setBehavior(Behavior behavior) {
    }

    public B setDuration(int i) {
    }

    public B setGestureInsetBottomIgnored(boolean z) {
    }

    boolean shouldAnimate() {
    }

    public void show() {
    }

    final void showView() {
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
    }

    public B setAnchorView(int i) {
    }
}
