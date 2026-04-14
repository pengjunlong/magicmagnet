package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.List;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {
    private static final String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int CHIP_BODY_VIRTUAL_ID = 0;
    private static final int CLOSE_ICON_VIRTUAL_ID = 1;
    private static final int DEF_STYLE_RES = 0;
    private static final Rect EMPTY_BOUNDS = null;
    private static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final String RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.RadioButton";
    private static final int[] SELECTED_STATE = null;
    private static final String TAG = "Chip";
    private CharSequence accessibilityClassName;
    private ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private boolean ensureMinTouchTargetSize;
    private final TextAppearanceFontCallback fontCallback;
    private InsetDrawable insetBackgroundDrawable;
    private int lastLayoutDirection;
    private int minTouchTargetSize;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListenerInternal;
    private View.OnClickListener onCloseIconClickListener;
    private final Rect rect;
    private final RectF rectF;
    private RippleDrawable ripple;
    private final ChipTouchHelper touchHelper;
    private boolean touchHelperEnabled;

    /* renamed from: com.google.android.material.chip.Chip$1 */
    class C03041 extends TextAppearanceFontCallback {
        final /* synthetic */ Chip this$0;

        C03041(Chip chip) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(Typeface typeface, boolean z) {
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$2 */
    class C03052 extends ViewOutlineProvider {
        final /* synthetic */ Chip this$0;

        C03052(Chip chip) {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
        }
    }

    private class ChipTouchHelper extends dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ Chip this$0;

        ChipTouchHelper(Chip chip, Chip chip2) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected int getVirtualViewAt(float f, float f2) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected void getVisibleVirtualViews(List<Integer> list) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected void onPopulateNodeForHost(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected void onPopulateNodeForVirtualView(int i, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.customview.widget.dbpqdHhmDSIHIJiwc1ll1l1
        protected void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
        }
    }

    public Chip(Context context) {
    }

    static /* synthetic */ ChipDrawable access$000(Chip chip) {
    }

    static /* synthetic */ boolean access$100(Chip chip) {
    }

    static /* synthetic */ RectF access$200(Chip chip) {
    }

    static /* synthetic */ View.OnClickListener access$300(Chip chip) {
    }

    static /* synthetic */ boolean access$402(Chip chip, boolean z) {
    }

    static /* synthetic */ Rect access$500(Chip chip) {
    }

    static /* synthetic */ Rect access$600() {
    }

    private void applyChipDrawable(ChipDrawable chipDrawable) {
    }

    private int[] createCloseIconDrawableState() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(Chip chip, CompoundButton compoundButton, boolean z) {
    }

    private void ensureChipDrawableHasCallback() {
    }

    private RectF getCloseIconTouchBounds() {
    }

    private Rect getCloseIconTouchBoundsInt() {
    }

    private TextAppearance getTextAppearance() {
    }

    private boolean hasCloseIcon() {
    }

    private void initMinTouchTarget(Context context, AttributeSet attributeSet, int i) {
    }

    private void initOutlineProvider() {
    }

    private void insetChipBackgroundDrawable(int i, int i2, int i3, int i4) {
    }

    private /* synthetic */ void lambda$new$0(CompoundButton compoundButton, boolean z) {
    }

    private void removeBackgroundInset() {
    }

    private void setCloseIconHovered(boolean z) {
    }

    private void setCloseIconPressed(boolean z) {
    }

    private void unapplyChipDrawable(ChipDrawable chipDrawable) {
    }

    private void updateAccessibilityDelegate() {
    }

    private void updateBackgroundDrawable() {
    }

    private void updateFrameworkRippleBackground() {
    }

    private void updatePaddingInternal() {
    }

    private void updateTextPaintDrawState() {
    }

    private void validateAttributes(AttributeSet attributeSet) {
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
    }

    public boolean ensureAccessibleTouchTarget(int i) {
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
    }

    public Drawable getBackgroundDrawable() {
    }

    public Drawable getCheckedIcon() {
    }

    public ColorStateList getCheckedIconTint() {
    }

    public ColorStateList getChipBackgroundColor() {
    }

    public float getChipCornerRadius() {
    }

    public Drawable getChipDrawable() {
    }

    public float getChipEndPadding() {
    }

    public Drawable getChipIcon() {
    }

    public float getChipIconSize() {
    }

    public ColorStateList getChipIconTint() {
    }

    public float getChipMinHeight() {
    }

    public float getChipStartPadding() {
    }

    public ColorStateList getChipStrokeColor() {
    }

    public float getChipStrokeWidth() {
    }

    @Deprecated
    public CharSequence getChipText() {
    }

    public Drawable getCloseIcon() {
    }

    public CharSequence getCloseIconContentDescription() {
    }

    public float getCloseIconEndPadding() {
    }

    public float getCloseIconSize() {
    }

    public float getCloseIconStartPadding() {
    }

    public ColorStateList getCloseIconTint() {
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
    }

    public MotionSpec getHideMotionSpec() {
    }

    public float getIconEndPadding() {
    }

    public float getIconStartPadding() {
    }

    public ColorStateList getRippleColor() {
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    public MotionSpec getShowMotionSpec() {
    }

    public float getTextEndPadding() {
    }

    public float getTextStartPadding() {
    }

    public boolean isCheckable() {
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
    }

    public boolean isCheckedIconVisible() {
    }

    @Deprecated
    public boolean isChipIconEnabled() {
    }

    public boolean isChipIconVisible() {
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
    }

    public boolean isCloseIconVisible() {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public boolean performCloseIconClick() {
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
    }

    public void setCheckableResource(int i) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCheckedIcon(Drawable drawable) {
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
    }

    public void setCheckedIconResource(int i) {
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
    }

    public void setCheckedIconTintResource(int i) {
    }

    public void setCheckedIconVisible(int i) {
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
    }

    public void setChipBackgroundColorResource(int i) {
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
    }

    public void setChipEndPadding(float f) {
    }

    public void setChipEndPaddingResource(int i) {
    }

    public void setChipIcon(Drawable drawable) {
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
    }

    public void setChipIconResource(int i) {
    }

    public void setChipIconSize(float f) {
    }

    public void setChipIconSizeResource(int i) {
    }

    public void setChipIconTint(ColorStateList colorStateList) {
    }

    public void setChipIconTintResource(int i) {
    }

    public void setChipIconVisible(int i) {
    }

    public void setChipMinHeight(float f) {
    }

    public void setChipMinHeightResource(int i) {
    }

    public void setChipStartPadding(float f) {
    }

    public void setChipStartPaddingResource(int i) {
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
    }

    public void setChipStrokeColorResource(int i) {
    }

    public void setChipStrokeWidth(float f) {
    }

    public void setChipStrokeWidthResource(int i) {
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
    }

    @Deprecated
    public void setChipTextResource(int i) {
    }

    public void setCloseIcon(Drawable drawable) {
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
    }

    public void setCloseIconEndPadding(float f) {
    }

    public void setCloseIconEndPaddingResource(int i) {
    }

    public void setCloseIconResource(int i) {
    }

    public void setCloseIconSize(float f) {
    }

    public void setCloseIconSizeResource(int i) {
    }

    public void setCloseIconStartPadding(float f) {
    }

    public void setCloseIconStartPaddingResource(int i) {
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
    }

    public void setCloseIconTintResource(int i) {
    }

    public void setCloseIconVisible(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
    }

    public void setHideMotionSpecResource(int i) {
    }

    public void setIconEndPadding(float f) {
    }

    public void setIconEndPaddingResource(int i) {
    }

    public void setIconStartPadding(float f) {
    }

    public void setIconStartPaddingResource(int i) {
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    public void setInternalOnCheckedChangeListener(MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
    }

    public void setRippleColor(ColorStateList colorStateList) {
    }

    public void setRippleColorResource(int i) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
    }

    public void setShowMotionSpecResource(int i) {
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
    }

    public void setTextAppearance(TextAppearance textAppearance) {
    }

    public void setTextAppearanceResource(int i) {
    }

    public void setTextEndPadding(float f) {
    }

    public void setTextEndPaddingResource(int i) {
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
    }

    public void setTextStartPadding(float f) {
    }

    public void setTextStartPaddingResource(int i) {
    }

    public boolean shouldEnsureMinTouchTargetSize() {
    }

    public Chip(Context context, AttributeSet attributeSet) {
    }

    public void setCloseIconVisible(boolean z) {
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
    }

    public void setCheckedIconVisible(boolean z) {
    }

    public void setChipIconVisible(boolean z) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
    }
}
