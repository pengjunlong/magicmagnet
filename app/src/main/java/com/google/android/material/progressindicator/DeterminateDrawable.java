package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import androidx.dynamicanimation.animation.dbpqdHhmDSIHIJiwc1ll1l1;
import androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import p000.pl1;
import p000.ql1;
import p000.v4;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private static final dbpqdHhmDSIHIJiwc1ll1l1<DeterminateDrawable> INDICATOR_LENGTH_IN_LEVEL = null;
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private DrawingDelegate<S> drawingDelegate;
    private float indicatorFraction;
    private boolean skipAnimationOnLevelChange;
    private final pl1 springAnimation;
    private final ql1 springForce;

    /* renamed from: com.google.android.material.progressindicator.DeterminateDrawable$1 */
    class C04091 extends dbpqdHhmDSIHIJiwc1ll1l1<DeterminateDrawable> {
        C04091(String str) {
        }

        @Override // androidx.dynamicanimation.animation.dbpqdHhmDSIHIJiwc1ll1l1
        public /* bridge */ /* synthetic */ float getValue(DeterminateDrawable determinateDrawable) {
        }

        @Override // androidx.dynamicanimation.animation.dbpqdHhmDSIHIJiwc1ll1l1
        public /* bridge */ /* synthetic */ void setValue(DeterminateDrawable determinateDrawable, float f) {
        }

        /* renamed from: getValue, reason: avoid collision after fix types in other method */
        public float getValue2(DeterminateDrawable determinateDrawable) {
        }

        /* renamed from: setValue, reason: avoid collision after fix types in other method */
        public void setValue2(DeterminateDrawable determinateDrawable, float f) {
        }
    }

    DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate<S> drawingDelegate) {
    }

    static /* synthetic */ float access$000(DeterminateDrawable determinateDrawable) {
    }

    static /* synthetic */ void access$100(DeterminateDrawable determinateDrawable, float f) {
    }

    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
    }

    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
    }

    private float getIndicatorFraction() {
    }

    private void setIndicatorFraction(float f) {
    }

    public void addSpringAnimationEndListener(v4.qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
    }

    DrawingDelegate<S> getDrawingDelegate() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ void registerAnimationCallback(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    public void removeSpringAnimationEndListener(v4.qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
    }

    void setDrawingDelegate(DrawingDelegate<S> drawingDelegate) {
    }

    void setLevelByFraction(float f) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
    }
}
