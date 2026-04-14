package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class MaterialButtonHelper {
    private static final boolean IS_LOLLIPOP = false;
    private static final boolean IS_MIN_LOLLIPOP = false;
    private boolean backgroundOverwritten;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private boolean cornerRadiusSet;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private Drawable maskDrawable;
    private final MaterialButton materialButton;
    private ColorStateList rippleColor;
    private LayerDrawable rippleDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private boolean shouldDrawSurfaceColorStroke;
    private ColorStateList strokeColor;
    private int strokeWidth;
    private boolean toggleCheckedStateOnClick;

    MaterialButtonHelper(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
    }

    private Drawable createBackground() {
    }

    private MaterialShapeDrawable getMaterialShapeDrawable(boolean z) {
    }

    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
    }

    private void setVerticalInsets(int i, int i2) {
    }

    private void updateBackground() {
    }

    private void updateButtonShape(ShapeAppearanceModel shapeAppearanceModel) {
    }

    private void updateStroke() {
    }

    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
    }

    int getCornerRadius() {
    }

    public int getInsetBottom() {
    }

    public int getInsetTop() {
    }

    public Shapeable getMaskDrawable() {
    }

    ColorStateList getRippleColor() {
    }

    ShapeAppearanceModel getShapeAppearanceModel() {
    }

    ColorStateList getStrokeColor() {
    }

    int getStrokeWidth() {
    }

    ColorStateList getSupportBackgroundTintList() {
    }

    PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    boolean isBackgroundOverwritten() {
    }

    boolean isCheckable() {
    }

    boolean isToggleCheckedStateOnClick() {
    }

    void loadFromAttributes(TypedArray typedArray) {
    }

    void setBackgroundColor(int i) {
    }

    void setBackgroundOverwritten() {
    }

    void setCheckable(boolean z) {
    }

    void setCornerRadius(int i) {
    }

    public void setInsetBottom(int i) {
    }

    public void setInsetTop(int i) {
    }

    void setRippleColor(ColorStateList colorStateList) {
    }

    void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
    }

    void setStrokeColor(ColorStateList colorStateList) {
    }

    void setStrokeWidth(int i) {
    }

    void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    void setToggleCheckedStateOnClick(boolean z) {
    }

    void updateMaskBounds(int i, int i2) {
    }

    MaterialShapeDrawable getMaterialShapeDrawable() {
    }
}
