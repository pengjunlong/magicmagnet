package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11;
import androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialButton extends ppbdpwWWljzmXXdHNabfWhgjl111l11 implements Checkable, Shapeable {
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private boolean broadcasting;
    private boolean checked;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final MaterialButtonHelper materialButtonHelper;
    private final LinkedHashSet<OnCheckedChangeListener> onCheckedChangeListeners;
    private OnPressedChangeListener onPressedChangeListenerInternal;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton materialButton, boolean z);
    }

    interface OnPressedChangeListener {
        void onPressedChanged(MaterialButton materialButton, boolean z);
    }

    static class SavedState extends dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        boolean checked;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$1 */
        class C02981 implements Parcelable.ClassLoaderCreator<SavedState> {
            C02981() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        public SavedState(Parcelable parcelable) {
        }

        private void readFromParcel(Parcel parcel) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public MaterialButton(Context context) {
    }

    private String getA11yClassName() {
    }

    private Layout.Alignment getActualTextAlignment() {
    }

    private Layout.Alignment getGravityTextAlignment() {
    }

    private int getTextHeight() {
    }

    private int getTextLayoutWidth() {
    }

    private boolean isIconEnd() {
    }

    private boolean isIconStart() {
    }

    private boolean isIconTop() {
    }

    private boolean isLayoutRTL() {
    }

    private boolean isUsingOriginalBackground() {
    }

    private void resetIconDrawable() {
    }

    private void updateIcon(boolean z) {
    }

    private void updateIconPosition(int i, int i2) {
    }

    public void addOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void clearOnCheckedChangeListeners() {
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
    }

    public int getCornerRadius() {
    }

    public Drawable getIcon() {
    }

    public int getIconGravity() {
    }

    public int getIconPadding() {
    }

    public int getIconSize() {
    }

    public ColorStateList getIconTint() {
    }

    public PorterDuff.Mode getIconTintMode() {
    }

    public int getInsetBottom() {
    }

    public int getInsetTop() {
    }

    public ColorStateList getRippleColor() {
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    public ColorStateList getStrokeColor() {
    }

    public int getStrokeWidth() {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, p000.ls1
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, p000.ls1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    public boolean isCheckable() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    public boolean isToggleCheckedStateOnClick() {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View
    public boolean performClick() {
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    public void removeOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.view.View
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

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCornerRadius(int i) {
    }

    public void setCornerRadiusResource(int i) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setIconGravity(int i) {
    }

    public void setIconPadding(int i) {
    }

    public void setIconResource(int i) {
    }

    public void setIconSize(int i) {
    }

    public void setIconTint(ColorStateList colorStateList) {
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
    }

    public void setIconTintResource(int i) {
    }

    public void setInsetBottom(int i) {
    }

    public void setInsetTop(int i) {
    }

    void setInternalBackground(Drawable drawable) {
    }

    void setOnPressedChangeListenerInternal(OnPressedChangeListener onPressedChangeListener) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
    }

    public void setRippleColor(ColorStateList colorStateList) {
    }

    public void setRippleColorResource(int i) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
    }

    public void setStrokeColor(ColorStateList colorStateList) {
    }

    public void setStrokeColorResource(int i) {
    }

    public void setStrokeWidth(int i) {
    }

    public void setStrokeWidthResource(int i) {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, p000.ls1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // androidx.appcompat.widget.ppbdpwWWljzmXXdHNabfWhgjl111l11, p000.ls1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
    }

    public void setToggleCheckedStateOnClick(boolean z) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
    }
}
