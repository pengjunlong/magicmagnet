package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.qqdbbfmUWwoYYpfYHJZdaUO1111llll;
import androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1;
import androidx.vectordrawable.graphics.drawable.dqqppqiKzJi1l1lll1l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int[][] CHECKBOX_STATES = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] ERROR_STATE_SET = null;

    @SuppressLint({"DiscouragedApi"})
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID = 0;
    private static final int[] INDETERMINATE_STATE_SET = null;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;
    private Drawable buttonDrawable;
    private Drawable buttonIconDrawable;
    ColorStateList buttonIconTintList;
    private PorterDuff.Mode buttonIconTintMode;
    ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;
    private CharSequence customStateDescription;
    private CharSequence errorAccessibilityLabel;
    private boolean errorShown;
    private ColorStateList materialThemeColorsTintList;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private final LinkedHashSet<OnCheckedStateChangedListener> onCheckedStateChangedListeners;
    private final LinkedHashSet<OnErrorChangedListener> onErrorChangedListeners;
    private final dqqppqiKzJi1l1lll1l transitionToUnchecked;
    private final dpbdbdpbLwkLpObyKsq1lll1 transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$1 */
    class C03021 extends dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ MaterialCheckBox this$0;

        C03021(MaterialCheckBox materialCheckBox) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1
        public void onAnimationEnd(Drawable drawable) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1
        public void onAnimationStart(Drawable drawable) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(MaterialCheckBox materialCheckBox, int i);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(MaterialCheckBox materialCheckBox, boolean z);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        int checkedState;

        /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$1 */
        class C03031 implements Parcelable.Creator<SavedState> {
            C03031() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C03021 c03021) {
        }

        private String getCheckedStateString() {
        }

        public String toString() {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        SavedState(Parcelable parcelable) {
        }

        private SavedState(Parcel parcel) {
        }
    }

    public MaterialCheckBox(Context context) {
    }

    static /* synthetic */ int[] access$000(MaterialCheckBox materialCheckBox) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(MaterialCheckBox materialCheckBox) {
    }

    private String getButtonStateDescription() {
    }

    private ColorStateList getMaterialThemeColorsTintList() {
    }

    private ColorStateList getSuperButtonTintList() {
    }

    private boolean isButtonDrawableLegacy(qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll) {
    }

    private /* synthetic */ void lambda$new$0() {
    }

    private void refreshButtonDrawable() {
    }

    private void setDefaultStateDescription() {
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
    }

    private void updateButtonTints() {
    }

    private void updateIconTintIfNeeded() {
    }

    public void addOnCheckedStateChangedListener(OnCheckedStateChangedListener onCheckedStateChangedListener) {
    }

    public void addOnErrorChangedListener(OnErrorChangedListener onErrorChangedListener) {
    }

    public void clearOnCheckedStateChangedListeners() {
    }

    public void clearOnErrorChangedListeners() {
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
    }

    public Drawable getButtonIconDrawable() {
    }

    public ColorStateList getButtonIconTintList() {
    }

    public PorterDuff.Mode getButtonIconTintMode() {
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
    }

    public int getCheckedState() {
    }

    public CharSequence getErrorAccessibilityLabel() {
    }

    public boolean isCenterIfNoTextEnabled() {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
    }

    public boolean isErrorShown() {
    }

    public boolean isUseMaterialThemeColors() {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public void removeOnCheckedStateChangedListener(OnCheckedStateChangedListener onCheckedStateChangedListener) {
    }

    public void removeOnErrorChangedListener(OnErrorChangedListener onErrorChangedListener) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
    }

    public void setButtonIconDrawable(Drawable drawable) {
    }

    public void setButtonIconDrawableResource(int i) {
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
    }

    public void setCenterIfNoTextEnabled(boolean z) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCheckedState(int i) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
    }

    public void setErrorAccessibilityLabelResource(int i) {
    }

    public void setErrorShown(boolean z) {
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
    }

    public void setUseMaterialThemeColors(boolean z) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
    }
}
