package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class BorderDrawable extends Drawable {
    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333f;
    private ColorStateList borderTint;
    float borderWidth;
    private int bottomInnerStrokeColor;
    private int bottomOuterStrokeColor;
    private final RectF boundsRectF;
    private int currentBorderTintColor;
    private boolean invalidateShader;
    private final Paint paint;
    private final ShapeAppearancePathProvider pathProvider;
    private final Rect rect;
    private final RectF rectF;
    private ShapeAppearanceModel shapeAppearanceModel;
    private final Path shapePath;
    private final BorderState state;
    private int topInnerStrokeColor;
    private int topOuterStrokeColor;

    private class BorderState extends Drawable.ConstantState {
        final /* synthetic */ BorderDrawable this$0;

        private BorderState(BorderDrawable borderDrawable) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
        }

        /* synthetic */ BorderState(BorderDrawable borderDrawable, C03511 c03511) {
        }
    }

    BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
    }

    private Shader createGradientShader() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    protected RectF getBoundsAsRectF() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
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

    void setBorderTint(ColorStateList colorStateList) {
    }

    public void setBorderWidth(float f) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    void setGradientColors(int i, int i2, int i3, int i4) {
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }
}
