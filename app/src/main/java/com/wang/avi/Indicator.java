package com.wang.avi;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class Indicator extends Drawable implements Animatable {
    private static final Rect ZERO_BOUNDS_RECT = null;
    private int alpha;
    protected Rect drawBounds;
    private ArrayList<ValueAnimator> mAnimators;
    private boolean mHasAnimators;
    private Paint mPaint;
    private HashMap<ValueAnimator, ValueAnimator.AnimatorUpdateListener> mUpdateListeners;

    private void ensureAnimators() {
    }

    private boolean isStarted() {
    }

    private void startAnimators() {
    }

    private void stopAnimators() {
    }

    public void addUpdateListener(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    public int centerX() {
    }

    public int centerY() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public abstract void draw(Canvas canvas, Paint paint);

    public float exactCenterX() {
    }

    public float exactCenterY() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    public int getColor() {
    }

    public Rect getDrawBounds() {
    }

    public int getHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public int getWidth() {
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
    }

    public abstract ArrayList<ValueAnimator> onCreateAnimators();

    public void postInvalidate() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setColor(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setDrawBounds(Rect rect) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    public void setDrawBounds(int i, int i2, int i3, int i4) {
    }
}
