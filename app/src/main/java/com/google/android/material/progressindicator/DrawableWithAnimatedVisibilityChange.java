package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> GROW_FRACTION = null;
    private List<dpbdbdpbLwkLpObyKsq1lll1> animationCallbacks;
    AnimatorDurationScaleProvider animatorDurationScaleProvider;
    final BaseProgressIndicatorSpec baseSpec;
    final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private dpbdbdpbLwkLpObyKsq1lll1 internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    final Paint paint;
    private ValueAnimator showAnimator;
    private int totalAlpha;

    /* renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$1 */
    class C04101 extends AnimatorListenerAdapter {
        final /* synthetic */ DrawableWithAnimatedVisibilityChange this$0;

        C04101(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$2 */
    class C04112 extends AnimatorListenerAdapter {
        final /* synthetic */ DrawableWithAnimatedVisibilityChange this$0;

        C04112(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3 */
    class C04123 extends Property<DrawableWithAnimatedVisibilityChange, Float> {
        C04123(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Float get2(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
        }
    }

    DrawableWithAnimatedVisibilityChange(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
    }

    static /* synthetic */ void access$000(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
    }

    static /* synthetic */ boolean access$101(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, boolean z, boolean z2) {
    }

    static /* synthetic */ void access$200(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
    }

    private void cancelAnimatorsWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
    }

    private void dispatchAnimationEnd() {
    }

    private void dispatchAnimationStart() {
    }

    private void endAnimatorsWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
    }

    private void maybeInitializeAnimators() {
    }

    private void setHideAnimator(ValueAnimator valueAnimator) {
    }

    private void setShowAnimator(ValueAnimator valueAnimator) {
    }

    public void clearAnimationCallbacks() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    float getGrowFraction() {
    }

    ValueAnimator getHideAnimator() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public boolean hideNow() {
    }

    public boolean isHiding() {
    }

    public boolean isRunning() {
    }

    public boolean isShowing() {
    }

    public void registerAnimationCallback(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    void setGrowFraction(float f) {
    }

    void setInternalAnimationCallback(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    void setMockHideAnimationRunning(boolean z, float f) {
    }

    void setMockShowAnimationRunning(boolean z, float f) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
    }

    public void start() {
    }

    public void stop() {
    }

    public boolean unregisterAnimationCallback(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
    }
}
