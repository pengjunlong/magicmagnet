package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1 {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = 0;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    static final Property<View, Float> HEIGHT = null;
    private static final int HIDE = 1;
    static final Property<View, Float> PADDING_END = null;
    static final Property<View, Float> PADDING_START = null;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    static final Property<View, Float> WIDTH = null;
    private int animState;
    private boolean animateShowBeforeLayout;
    private final CoordinatorLayout.dqqppqiKzJi1l1lll1l<ExtendedFloatingActionButton> behavior;
    private final AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;
    private final MotionStrategy extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;
    protected ColorStateList originalTextCsl;
    private int originalWidth;
    private final MotionStrategy showStrategy;
    private final MotionStrategy shrinkStrategy;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1 */
    class C03521 implements Size {
        final /* synthetic */ ExtendedFloatingActionButton this$0;

        C03521(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2 */
    class C03532 implements Size {
        final /* synthetic */ ExtendedFloatingActionButton this$0;

        C03532(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3 */
    class C03543 implements Size {
        final /* synthetic */ ExtendedFloatingActionButton this$0;
        final /* synthetic */ Size val$wrapContentSize;

        C03543(ExtendedFloatingActionButton extendedFloatingActionButton, Size size) {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4 */
    class C03554 implements Size {
        final /* synthetic */ ExtendedFloatingActionButton this$0;
        final /* synthetic */ Size val$matchParentSize;
        final /* synthetic */ Size val$wrapContentSize;

        C03554(ExtendedFloatingActionButton extendedFloatingActionButton, Size size, Size size2) {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getHeight() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public ViewGroup.LayoutParams getLayoutParams() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getPaddingStart() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public int getWidth() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5 */
    class C03565 extends AnimatorListenerAdapter {
        private boolean cancelled;
        final /* synthetic */ ExtendedFloatingActionButton this$0;
        final /* synthetic */ OnChangedCallback val$callback;
        final /* synthetic */ MotionStrategy val$strategy;

        C03565(ExtendedFloatingActionButton extendedFloatingActionButton, MotionStrategy motionStrategy, OnChangedCallback onChangedCallback) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6 */
    class C03576 extends Property<View, Float> {
        C03576(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(View view) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(View view, Float f) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7 */
    class C03587 extends Property<View, Float> {
        C03587(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(View view) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(View view, Float f) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8 */
    class C03598 extends Property<View, Float> {
        C03598(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(View view) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(View view, Float f) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9 */
    class C03609 extends Property<View, Float> {
        C03609(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(View view) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(View view) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(View view, Float f) {
        }
    }

    class ChangeSizeStrategy extends BaseMotionStrategy {
        private final boolean extending;
        private final Size size;
        final /* synthetic */ ExtendedFloatingActionButton this$0;

        ChangeSizeStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker, Size size, boolean z) {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public AnimatorSet createAnimator() {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
        }
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;
        private OnChangedCallback internalAutoHideCallback;
        private OnChangedCallback internalAutoShrinkCallback;
        private Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
        }

        private static boolean isBottomSheet(View view) {
        }

        private boolean shouldUpdateVisibility(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        private boolean updateFabVisibilityForBottomSheet(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        protected void extendOrShow(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        }

        public boolean isAutoHideEnabled() {
        }

        public boolean isAutoShrinkEnabled() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public void onAttachedToLayoutParams(CoordinatorLayout.ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        }

        public void setAutoHideEnabled(boolean z) {
        }

        public void setAutoShrinkEnabled(boolean z) {
        }

        void setInternalAutoHideCallback(OnChangedCallback onChangedCallback) {
        }

        void setInternalAutoShrinkCallback(OnChangedCallback onChangedCallback) {
        }

        protected void shrinkOrHide(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        }
    }

    class HideStrategy extends BaseMotionStrategy {
        private boolean isCancelled;
        final /* synthetic */ ExtendedFloatingActionButton this$0;

        public HideStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
        }
    }

    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    class ShowStrategy extends BaseMotionStrategy {
        final /* synthetic */ ExtendedFloatingActionButton this$0;

        public ShowStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
        }
    }

    interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
    }

    static /* synthetic */ int access$000(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    static /* synthetic */ int access$100(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    static /* synthetic */ int access$200(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    static /* synthetic */ int access$202(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
    }

    static /* synthetic */ int access$300(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    static /* synthetic */ int access$302(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
    }

    static /* synthetic */ void access$400(ExtendedFloatingActionButton extendedFloatingActionButton, int i, OnChangedCallback onChangedCallback) {
    }

    static /* synthetic */ boolean access$500(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    static /* synthetic */ boolean access$502(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z) {
    }

    static /* synthetic */ boolean access$602(ExtendedFloatingActionButton extendedFloatingActionButton, boolean z) {
    }

    static /* synthetic */ int access$702(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
    }

    static /* synthetic */ boolean access$800(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    static /* synthetic */ boolean access$900(ExtendedFloatingActionButton extendedFloatingActionButton) {
    }

    private Size getSizeFromExtendStrategyType(int i) {
    }

    private boolean isOrWillBeHidden() {
    }

    private boolean isOrWillBeShown() {
    }

    private void performMotion(int i, OnChangedCallback onChangedCallback) {
    }

    private void saveOriginalTextCsl() {
    }

    private boolean shouldAnimateVisibilityChange() {
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void extend() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dpbdbdpbLwkLpObyKsq1lll1
    public CoordinatorLayout.dqqppqiKzJi1l1lll1l<ExtendedFloatingActionButton> getBehavior() {
    }

    int getCollapsedPadding() {
    }

    int getCollapsedSize() {
    }

    public MotionSpec getExtendMotionSpec() {
    }

    public MotionSpec getHideMotionSpec() {
    }

    public MotionSpec getShowMotionSpec() {
    }

    public MotionSpec getShrinkMotionSpec() {
    }

    public void hide() {
    }

    public final boolean isExtended() {
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
    }

    public void setExtendMotionSpecResource(int i) {
    }

    public void setExtended(boolean z) {
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
    }

    public void setHideMotionSpecResource(int i) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
    }

    public void setShowMotionSpecResource(int i) {
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
    }

    public void setShrinkMotionSpecResource(int i) {
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
    }

    public void show() {
    }

    public void shrink() {
    }

    protected void silentlyUpdateTextColor(ColorStateList colorStateList) {
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
    }

    public void extend(OnChangedCallback onChangedCallback) {
    }

    public void hide(OnChangedCallback onChangedCallback) {
    }

    public void show(OnChangedCallback onChangedCallback) {
    }

    public void shrink(OnChangedCallback onChangedCallback) {
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
    }
}
