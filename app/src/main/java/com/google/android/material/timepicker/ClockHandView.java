package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;
    private final int selectorStrokeWidth;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$1 */
    class C04831 extends AnimatorListenerAdapter {
        final /* synthetic */ ClockHandView this$0;

        C04831(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }
    }

    public interface OnActionUpListener {
        void onActionUp(float f, boolean z);
    }

    public interface OnRotateListener {
        void onRotate(float f, boolean z);
    }

    public ClockHandView(Context context) {
    }

    private void adjustLevel(float f, float f2) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ClockHandView clockHandView, ValueAnimator valueAnimator) {
    }

    private void drawSelector(Canvas canvas) {
    }

    private int getDegreesFromXY(float f, float f2) {
    }

    private int getLeveledCircleRadius(int i) {
    }

    private Pair<Float, Float> getValuesForAnimation(float f) {
    }

    private boolean handleTouchInput(float f, float f2, boolean z, boolean z2, boolean z3) {
    }

    private /* synthetic */ void lambda$setHandRotation$0(ValueAnimator valueAnimator) {
    }

    private void setHandRotationInternal(float f, boolean z) {
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
    }

    int getCurrentLevel() {
    }

    public RectF getCurrentSelectorBox() {
    }

    public float getHandRotation() {
    }

    public int getSelectorRadius() {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setAnimateOnTouchUp(boolean z) {
    }

    public void setCircleRadius(int i) {
    }

    void setCurrentLevel(int i) {
    }

    public void setHandRotation(float f) {
    }

    void setMultiLevel(boolean z) {
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
    }

    public void setHandRotation(float f, boolean z) {
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
    }
}
