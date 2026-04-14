package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.dpbdbdpbLwkLpObyKsq1lll1;
import com.google.android.material.internal.CheckableImageButton;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class EndIconDelegate {
    final Context context;
    final CheckableImageButton endIconView;
    final EndCompoundLayout endLayout;
    final TextInputLayout textInputLayout;

    EndIconDelegate(EndCompoundLayout endCompoundLayout) {
    }

    void afterEditTextChanged(Editable editable) {
    }

    void beforeEditTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    int getIconContentDescriptionResId() {
    }

    int getIconDrawableResId() {
    }

    View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
    }

    View.OnClickListener getOnIconClickListener() {
    }

    View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
    }

    dpbdbdpbLwkLpObyKsq1lll1.InterfaceC1941dpbdbdpbLwkLpObyKsq1lll1 getTouchExplorationStateChangeListener() {
    }

    boolean isBoxBackgroundModeSupported(int i) {
    }

    boolean isIconActivable() {
    }

    boolean isIconActivated() {
    }

    boolean isIconCheckable() {
    }

    boolean isIconChecked() {
    }

    void onEditTextAttached(EditText editText) {
    }

    void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
    }

    void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    void onSuffixVisibilityChanged(boolean z) {
    }

    final void refreshIconState() {
    }

    void setUp() {
    }

    boolean shouldTintIconOnError() {
    }

    void tearDown() {
    }
}
