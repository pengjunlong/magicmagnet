package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import p000.ks1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class RippleDrawableCompat extends Drawable implements Shapeable, ks1 {
    private RippleDrawableCompatState drawableState;

    static final class RippleDrawableCompatState extends Drawable.ConstantState {
        MaterialShapeDrawable delegate;
        boolean shouldDrawDelegate;

        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public /* bridge */ /* synthetic */ Drawable newDrawable() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public RippleDrawableCompat newDrawable() {
        }

        public RippleDrawableCompatState(RippleDrawableCompatState rippleDrawableCompatState) {
        }
    }

    /* synthetic */ RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState, C04201 c04201) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTint(int i) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTintMode(PorterDuff.Mode mode) {
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
    }

    @Override // android.graphics.drawable.Drawable
    public RippleDrawableCompat mutate() {
    }

    private RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
    }
}
