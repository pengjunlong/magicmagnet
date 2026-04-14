package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    private static final int[] CHECKABLE_STATE_SET = null;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DRAGGED_STATE_SET = null;
    private static final String LOG_TAG = "MaterialCardView";
    private final MaterialCardViewHelper cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private OnCheckedChangeListener onCheckedChangeListener;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
    }

    static /* synthetic */ float access$001(MaterialCardView materialCardView) {
    }

    private void forceRippleRedrawIfNeeded() {
    }

    private RectF getBoundsAsRectF() {
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
    }

    public ColorStateList getCardForegroundColor() {
    }

    float getCardViewRadius() {
    }

    public Drawable getCheckedIcon() {
    }

    public int getCheckedIconGravity() {
    }

    public int getCheckedIconMargin() {
    }

    public int getCheckedIconSize() {
    }

    public ColorStateList getCheckedIconTint() {
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
    }

    public float getProgress() {
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
    }

    public ColorStateList getRippleColor() {
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Deprecated
    public int getStrokeColor() {
    }

    public ColorStateList getStrokeColorStateList() {
    }

    public int getStrokeWidth() {
    }

    public boolean isCheckable() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    public boolean isDragged() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    void setAncestorContentPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    void setBackgroundInternal(Drawable drawable) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
    }

    public void setCheckable(boolean z) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCheckedIcon(Drawable drawable) {
    }

    public void setCheckedIconGravity(int i) {
    }

    public void setCheckedIconMargin(int i) {
    }

    public void setCheckedIconMarginResource(int i) {
    }

    public void setCheckedIconResource(int i) {
    }

    public void setCheckedIconSize(int i) {
    }

    public void setCheckedIconSizeResource(int i) {
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
    }

    public void setDragged(boolean z) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
    }

    public void setProgress(float f) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
    }

    public void setRippleColor(ColorStateList colorStateList) {
    }

    public void setRippleColorResource(int i) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setStrokeColor(int i) {
    }

    public void setStrokeWidth(int i) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
    }

    public void setStrokeColor(ColorStateList colorStateList) {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
    }
}
