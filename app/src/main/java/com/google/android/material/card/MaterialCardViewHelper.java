package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class MaterialCardViewHelper {
    private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5f;
    private static final int CHECKED_ICON_LAYER_INDEX = 2;
    private static final Drawable CHECKED_ICON_NONE = null;
    private static final double COS_45 = 0.0d;
    public static final int DEFAULT_FADE_ANIM_DURATION = 300;
    private static final int DEFAULT_STROKE_VALUE = -1;
    private final MaterialShapeDrawable bgDrawable;
    private boolean checkable;
    private float checkedAnimationProgress;
    private Drawable checkedIcon;
    private int checkedIconGravity;
    private int checkedIconMargin;
    private int checkedIconSize;
    private ColorStateList checkedIconTint;
    private LayerDrawable clickableForegroundDrawable;
    private MaterialShapeDrawable compatRippleDrawable;
    private Drawable fgDrawable;
    private final MaterialShapeDrawable foregroundContentDrawable;
    private MaterialShapeDrawable foregroundShapeDrawable;
    private ValueAnimator iconAnimator;
    private final TimeInterpolator iconFadeAnimInterpolator;
    private final int iconFadeInAnimDuration;
    private final int iconFadeOutAnimDuration;
    private boolean isBackgroundOverwritten;
    private final MaterialCardView materialCardView;
    private ColorStateList rippleColor;
    private Drawable rippleDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private ColorStateList strokeColor;
    private int strokeWidth;
    private final Rect userContentPadding;

    /* renamed from: com.google.android.material.card.MaterialCardViewHelper$1 */
    class C03011 extends InsetDrawable {
        final /* synthetic */ MaterialCardViewHelper this$0;

        C03011(MaterialCardViewHelper materialCardViewHelper, Drawable drawable, int i, int i2, int i3, int i4) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
        }
    }

    public MaterialCardViewHelper(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
    }

    private float calculateActualCornerPadding() {
    }

    private float calculateCornerPaddingForCornerTreatment(CornerTreatment cornerTreatment, float f) {
    }

    private float calculateHorizontalBackgroundPadding() {
    }

    private float calculateVerticalBackgroundPadding() {
    }

    private boolean canClipToOutline() {
    }

    private Drawable createCompatRippleDrawable() {
    }

    private Drawable createForegroundRippleDrawable() {
    }

    private MaterialShapeDrawable createForegroundShapeDrawable() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MaterialCardViewHelper materialCardViewHelper, ValueAnimator valueAnimator) {
    }

    private Drawable getClickableForeground() {
    }

    private float getParentCardViewCalculatedCornerPadding() {
    }

    private Drawable insetDrawable(Drawable drawable) {
    }

    private boolean isCheckedIconBottom() {
    }

    private boolean isCheckedIconEnd() {
    }

    private /* synthetic */ void lambda$animateCheckedIcon$0(ValueAnimator valueAnimator) {
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
    }

    private void updateInsetForeground(Drawable drawable) {
    }

    private void updateRippleColor() {
    }

    public void animateCheckedIcon(boolean z) {
    }

    void forceRippleRedraw() {
    }

    MaterialShapeDrawable getBackground() {
    }

    ColorStateList getCardBackgroundColor() {
    }

    ColorStateList getCardForegroundColor() {
    }

    Drawable getCheckedIcon() {
    }

    int getCheckedIconGravity() {
    }

    int getCheckedIconMargin() {
    }

    int getCheckedIconSize() {
    }

    ColorStateList getCheckedIconTint() {
    }

    float getCornerRadius() {
    }

    float getProgress() {
    }

    ColorStateList getRippleColor() {
    }

    ShapeAppearanceModel getShapeAppearanceModel() {
    }

    int getStrokeColor() {
    }

    ColorStateList getStrokeColorStateList() {
    }

    int getStrokeWidth() {
    }

    Rect getUserContentPadding() {
    }

    boolean isBackgroundOverwritten() {
    }

    boolean isCheckable() {
    }

    void loadFromAttributes(TypedArray typedArray) {
    }

    void recalculateCheckedIconPosition(int i, int i2) {
    }

    void setBackgroundOverwritten(boolean z) {
    }

    void setCardBackgroundColor(ColorStateList colorStateList) {
    }

    void setCardForegroundColor(ColorStateList colorStateList) {
    }

    void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    void setCheckedIcon(Drawable drawable) {
    }

    void setCheckedIconGravity(int i) {
    }

    void setCheckedIconMargin(int i) {
    }

    void setCheckedIconSize(int i) {
    }

    void setCheckedIconTint(ColorStateList colorStateList) {
    }

    void setCornerRadius(float f) {
    }

    void setProgress(float f) {
    }

    void setRippleColor(ColorStateList colorStateList) {
    }

    void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    void setStrokeColor(ColorStateList colorStateList) {
    }

    void setStrokeWidth(int i) {
    }

    void setUserContentPadding(int i, int i2, int i3, int i4) {
    }

    void updateClickable() {
    }

    void updateContentPadding() {
    }

    void updateElevation() {
    }

    void updateInsets() {
    }

    void updateStroke() {
    }

    public void setChecked(boolean z, boolean z2) {
    }
}
