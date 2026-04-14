package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawableWrapper;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ShadowDrawableWrapper extends DrawableWrapper {
    static final double COS_45 = 0.0d;
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    final RectF contentBounds;
    float cornerRadius;
    final Paint cornerShadowPaint;
    Path cornerShadowPath;
    private boolean dirty;
    final Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f, float f2, float f3) {
    }

    private void buildComponents(Rect rect) {
    }

    private void buildShadowCorners() {
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
    }

    private void drawShadow(Canvas canvas) {
    }

    private static int toEven(float f) {
    }

    public void draw(Canvas canvas) {
    }

    public float getCornerRadius() {
    }

    public float getMaxShadowSize() {
    }

    public float getMinHeight() {
    }

    public float getMinWidth() {
    }

    public int getOpacity() {
    }

    public boolean getPadding(Rect rect) {
    }

    public float getShadowSize() {
    }

    protected void onBoundsChange(Rect rect) {
    }

    public void setAddPaddingForCorners(boolean z) {
    }

    public void setAlpha(int i) {
    }

    public void setCornerRadius(float f) {
    }

    public void setMaxShadowSize(float f) {
    }

    public final void setRotation(float f) {
    }

    public void setShadowSize(float f, float f2) {
    }

    public void setShadowSize(float f) {
    }
}
