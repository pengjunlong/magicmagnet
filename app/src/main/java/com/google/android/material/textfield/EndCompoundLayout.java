package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.qqdbbfmUWwoYYpfYHJZdaUO1111llll;
import androidx.core.view.accessibility.dpbdbdpbLwkLpObyKsq1lll1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;

@SuppressLint({"ViewConstructor"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class EndCompoundLayout extends LinearLayout {
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;
    private dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1941dpbdbdpbLwkLpObyKsq1lll1 touchExplorationStateChangeListener;

    /* renamed from: com.google.android.material.textfield.EndCompoundLayout$1 */
    class C04691 extends TextWatcherAdapter {
        final /* synthetic */ EndCompoundLayout this$0;

        C04691(EndCompoundLayout endCompoundLayout) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.EndCompoundLayout$2 */
    class C04702 implements TextInputLayout.OnEditTextAttachedListener {
        final /* synthetic */ EndCompoundLayout this$0;

        C04702(EndCompoundLayout endCompoundLayout) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public void onEditTextAttached(TextInputLayout textInputLayout) {
        }
    }

    /* renamed from: com.google.android.material.textfield.EndCompoundLayout$3 */
    class ViewOnAttachStateChangeListenerC04713 implements View.OnAttachStateChangeListener {
        final /* synthetic */ EndCompoundLayout this$0;

        ViewOnAttachStateChangeListenerC04713(EndCompoundLayout endCompoundLayout) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    private static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates;
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        EndIconDelegates(EndCompoundLayout endCompoundLayout, qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll) {
        }

        static /* synthetic */ int access$500(EndIconDelegates endIconDelegates) {
        }

        private EndIconDelegate create(int i) {
        }

        EndIconDelegate get(int i) {
        }
    }

    EndCompoundLayout(TextInputLayout textInputLayout, qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll) {
    }

    static /* synthetic */ EditText access$000(EndCompoundLayout endCompoundLayout) {
    }

    static /* synthetic */ EditText access$002(EndCompoundLayout endCompoundLayout, EditText editText) {
    }

    static /* synthetic */ TextWatcher access$100(EndCompoundLayout endCompoundLayout) {
    }

    static /* synthetic */ void access$200(EndCompoundLayout endCompoundLayout, EndIconDelegate endIconDelegate) {
    }

    static /* synthetic */ void access$300(EndCompoundLayout endCompoundLayout) {
    }

    static /* synthetic */ void access$400(EndCompoundLayout endCompoundLayout) {
    }

    private void addTouchExplorationStateChangeListenerIfNeeded() {
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
    }

    private void dispatchOnEndIconChanged(int i) {
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
    }

    private void initEndIconView(qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll) {
    }

    private void initErrorIconView(qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll) {
    }

    private void initSuffixTextView(qqdbbfmUWwoYYpfYHJZdaUO1111llll qqdbbfmuwwoyypfyhjzdauo1111llll) {
    }

    private void removeTouchExplorationStateChangeListenerIfNeeded() {
    }

    private void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
    }

    private void setUpDelegate(EndIconDelegate endIconDelegate) {
    }

    private void tearDownDelegate(EndIconDelegate endIconDelegate) {
    }

    private void tintEndIconOnError(boolean z) {
    }

    private void updateEndLayoutVisibility() {
    }

    private void updateErrorIconVisibility() {
    }

    private void updateSuffixTextVisibility() {
    }

    void addOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
    }

    void checkEndIcon() {
    }

    void clearOnEndIconChangedListeners() {
    }

    CheckableImageButton getCurrentEndIconView() {
    }

    CharSequence getEndIconContentDescription() {
    }

    EndIconDelegate getEndIconDelegate() {
    }

    Drawable getEndIconDrawable() {
    }

    int getEndIconMinSize() {
    }

    int getEndIconMode() {
    }

    ImageView.ScaleType getEndIconScaleType() {
    }

    CheckableImageButton getEndIconView() {
    }

    Drawable getErrorIconDrawable() {
    }

    CharSequence getPasswordVisibilityToggleContentDescription() {
    }

    Drawable getPasswordVisibilityToggleDrawable() {
    }

    CharSequence getSuffixText() {
    }

    ColorStateList getSuffixTextColor() {
    }

    TextView getSuffixTextView() {
    }

    boolean hasEndIcon() {
    }

    boolean isEndIconCheckable() {
    }

    boolean isEndIconChecked() {
    }

    boolean isEndIconVisible() {
    }

    boolean isErrorIconVisible() {
    }

    boolean isPasswordVisibilityToggleEnabled() {
    }

    void onHintStateChanged(boolean z) {
    }

    void onTextInputBoxStateUpdated() {
    }

    void refreshEndIconDrawableState() {
    }

    void refreshErrorIconDrawableState() {
    }

    void refreshIconState(boolean z) {
    }

    void removeOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
    }

    void setEndIconActivated(boolean z) {
    }

    void setEndIconCheckable(boolean z) {
    }

    void setEndIconContentDescription(int i) {
    }

    void setEndIconDrawable(int i) {
    }

    void setEndIconMinSize(int i) {
    }

    void setEndIconMode(int i) {
    }

    void setEndIconOnClickListener(View.OnClickListener onClickListener) {
    }

    void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    void setEndIconScaleType(ImageView.ScaleType scaleType) {
    }

    void setEndIconTintList(ColorStateList colorStateList) {
    }

    void setEndIconTintMode(PorterDuff.Mode mode) {
    }

    void setEndIconVisible(boolean z) {
    }

    void setErrorIconDrawable(int i) {
    }

    void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
    }

    void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    void setErrorIconTintList(ColorStateList colorStateList) {
    }

    void setErrorIconTintMode(PorterDuff.Mode mode) {
    }

    void setPasswordVisibilityToggleContentDescription(int i) {
    }

    void setPasswordVisibilityToggleDrawable(int i) {
    }

    void setPasswordVisibilityToggleEnabled(boolean z) {
    }

    void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
    }

    void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
    }

    void setSuffixText(CharSequence charSequence) {
    }

    void setSuffixTextAppearance(int i) {
    }

    void setSuffixTextColor(ColorStateList colorStateList) {
    }

    void togglePasswordVisibilityToggle(boolean z) {
    }

    void updateSuffixTextViewPadding() {
    }

    void setEndIconContentDescription(CharSequence charSequence) {
    }

    void setEndIconDrawable(Drawable drawable) {
    }

    void setErrorIconDrawable(Drawable drawable) {
    }

    void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
    }

    void setPasswordVisibilityToggleDrawable(Drawable drawable) {
    }
}
