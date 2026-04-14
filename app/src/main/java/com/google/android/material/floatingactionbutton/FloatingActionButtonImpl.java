package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class FloatingActionButtonImpl {
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100;
    static final long ELEVATION_ANIM_DURATION = 100;
    static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = null;
    static final int[] EMPTY_STATE_SET = null;
    static final int[] ENABLED_STATE_SET = null;
    static final int[] FOCUSED_ENABLED_STATE_SET = null;
    private static final int HIDE_ANIM_DURATION_ATTR = 0;
    private static final int HIDE_ANIM_EASING_ATTR = 0;
    private static final float HIDE_ICON_SCALE = 0.4f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.4f;
    static final int[] HOVERED_ENABLED_STATE_SET = null;
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = null;
    static final int[] PRESSED_ENABLED_STATE_SET = null;
    static final float SHADOW_MULTIPLIER = 1.5f;
    private static final int SHOW_ANIM_DURATION_ATTR = 0;
    private static final int SHOW_ANIM_EASING_ATTR = 0;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;
    private static final float SPEC_HIDE_ICON_SCALE = 0.0f;
    private static final float SPEC_HIDE_SCALE = 0.0f;
    private int animState;
    BorderDrawable borderDrawable;
    Drawable contentBackground;
    private Animator currentAnimator;
    float elevation;
    boolean ensureMinTouchTargetSize;
    private ArrayList<Animator.AnimatorListener> hideListeners;
    private MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    private float imageMatrixScale;
    private int maxImageSize;
    int minTouchTargetSize;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    float pressedTranslationZ;
    Drawable rippleDrawable;
    private float rotation;
    boolean shadowPaddingEnabled;
    final ShadowViewDelegate shadowViewDelegate;
    ShapeAppearanceModel shapeAppearance;
    MaterialShapeDrawable shapeDrawable;
    private ArrayList<Animator.AnimatorListener> showListeners;
    private MotionSpec showMotionSpec;
    private final StateListAnimator stateListAnimator;
    private final Matrix tmpMatrix;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;
    private ArrayList<InternalTransformationCallback> transformationCallbacks;
    final FloatingActionButton view;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1 */
    class C03621 extends AnimatorListenerAdapter {
        private boolean cancelled;
        final /* synthetic */ FloatingActionButtonImpl this$0;
        final /* synthetic */ boolean val$fromUser;
        final /* synthetic */ InternalVisibilityChangedListener val$listener;

        C03621(FloatingActionButtonImpl floatingActionButtonImpl, boolean z, InternalVisibilityChangedListener internalVisibilityChangedListener) {
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

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$2 */
    class C03632 extends AnimatorListenerAdapter {
        final /* synthetic */ FloatingActionButtonImpl this$0;
        final /* synthetic */ boolean val$fromUser;
        final /* synthetic */ InternalVisibilityChangedListener val$listener;

        C03632(FloatingActionButtonImpl floatingActionButtonImpl, boolean z, InternalVisibilityChangedListener internalVisibilityChangedListener) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$3 */
    class C03643 extends MatrixEvaluator {
        final /* synthetic */ FloatingActionButtonImpl this$0;

        C03643(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.animation.MatrixEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$4 */
    class C03654 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ FloatingActionButtonImpl this$0;
        final /* synthetic */ Matrix val$matrix;
        final /* synthetic */ float val$startAlpha;
        final /* synthetic */ float val$startImageMatrixScale;
        final /* synthetic */ float val$startScaleX;
        final /* synthetic */ float val$startScaleY;
        final /* synthetic */ float val$targetIconScale;
        final /* synthetic */ float val$targetOpacity;
        final /* synthetic */ float val$targetScale;

        C03654(FloatingActionButtonImpl floatingActionButtonImpl, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$5 */
    class C03665 implements TypeEvaluator<Float> {
        FloatEvaluator floatEvaluator;
        final /* synthetic */ FloatingActionButtonImpl this$0;

        C03665(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
        }

        /* renamed from: evaluate, reason: avoid collision after fix types in other method */
        public Float evaluate2(float f, Float f2, Float f3) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$6 */
    class ViewTreeObserverOnPreDrawListenerC03676 implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ FloatingActionButtonImpl this$0;

        ViewTreeObserverOnPreDrawListenerC03676(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    private class DisabledElevationAnimation extends ShadowAnimatorImpl {
        final /* synthetic */ FloatingActionButtonImpl this$0;

        DisabledElevationAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
        }
    }

    private class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        final /* synthetic */ FloatingActionButtonImpl this$0;

        ElevateToHoveredFocusedTranslationZAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
        }
    }

    private class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        final /* synthetic */ FloatingActionButtonImpl this$0;

        ElevateToPressedTranslationZAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
        }
    }

    interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    private class ResetElevationAnimation extends ShadowAnimatorImpl {
        final /* synthetic */ FloatingActionButtonImpl this$0;

        ResetElevationAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
        }
    }

    private abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private float shadowSizeEnd;
        private float shadowSizeStart;
        final /* synthetic */ FloatingActionButtonImpl this$0;
        private boolean validValues;

        private ShadowAnimatorImpl(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        protected abstract float getTargetShadowSize();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }

        /* synthetic */ ShadowAnimatorImpl(FloatingActionButtonImpl floatingActionButtonImpl, C03621 c03621) {
        }
    }

    FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
    }

    static /* synthetic */ int access$002(FloatingActionButtonImpl floatingActionButtonImpl, int i) {
    }

    static /* synthetic */ Animator access$102(FloatingActionButtonImpl floatingActionButtonImpl, Animator animator) {
    }

    static /* synthetic */ float access$202(FloatingActionButtonImpl floatingActionButtonImpl, float f) {
    }

    static /* synthetic */ void access$300(FloatingActionButtonImpl floatingActionButtonImpl, float f, Matrix matrix) {
    }

    private void calculateImageMatrixFromScale(float f, Matrix matrix) {
    }

    private AnimatorSet createAnimator(MotionSpec motionSpec, float f, float f2, float f3) {
    }

    private AnimatorSet createDefaultAnimator(float f, float f2, float f3, int i, int i2) {
    }

    private ValueAnimator createElevationAnimator(ShadowAnimatorImpl shadowAnimatorImpl) {
    }

    private ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener() {
    }

    private boolean shouldAnimateVisibilityChange() {
    }

    private void workAroundOreoBug(ObjectAnimator objectAnimator) {
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    void addTransformationCallback(InternalTransformationCallback internalTransformationCallback) {
    }

    MaterialShapeDrawable createShapeDrawable() {
    }

    final Drawable getContentBackground() {
    }

    float getElevation() {
    }

    boolean getEnsureMinTouchTargetSize() {
    }

    final MotionSpec getHideMotionSpec() {
    }

    float getHoveredFocusedTranslationZ() {
    }

    void getPadding(Rect rect) {
    }

    float getPressedTranslationZ() {
    }

    final ShapeAppearanceModel getShapeAppearance() {
    }

    final MotionSpec getShowMotionSpec() {
    }

    void hide(InternalVisibilityChangedListener internalVisibilityChangedListener, boolean z) {
    }

    void initializeBackgroundDrawable(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
    }

    boolean isOrWillBeHidden() {
    }

    boolean isOrWillBeShown() {
    }

    void jumpDrawableToCurrentState() {
    }

    void onAttachedToWindow() {
    }

    void onCompatShadowChanged() {
    }

    void onDetachedFromWindow() {
    }

    void onDrawableStateChanged(int[] iArr) {
    }

    void onElevationsChanged(float f, float f2, float f3) {
    }

    void onPaddingUpdated(Rect rect) {
    }

    void onPreDraw() {
    }

    void onScaleChanged() {
    }

    void onTranslationChanged() {
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
    }

    void removeTransformationCallback(InternalTransformationCallback internalTransformationCallback) {
    }

    boolean requirePreDrawListener() {
    }

    void setBackgroundTintList(ColorStateList colorStateList) {
    }

    void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    final void setElevation(float f) {
    }

    void setEnsureMinTouchTargetSize(boolean z) {
    }

    final void setHideMotionSpec(MotionSpec motionSpec) {
    }

    final void setHoveredFocusedTranslationZ(float f) {
    }

    final void setImageMatrixScale(float f) {
    }

    final void setMaxImageSize(int i) {
    }

    void setMinTouchTargetSize(int i) {
    }

    final void setPressedTranslationZ(float f) {
    }

    void setRippleColor(ColorStateList colorStateList) {
    }

    void setShadowPaddingEnabled(boolean z) {
    }

    final void setShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
    }

    final void setShowMotionSpec(MotionSpec motionSpec) {
    }

    boolean shouldAddPadding() {
    }

    final boolean shouldExpandBoundsForA11y() {
    }

    void show(InternalVisibilityChangedListener internalVisibilityChangedListener, boolean z) {
    }

    void updateFromViewRotation() {
    }

    final void updateImageMatrixScale() {
    }

    final void updatePadding() {
    }

    void updateShapeElevation(float f) {
    }
}
