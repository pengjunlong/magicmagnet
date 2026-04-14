package com.google.android.material.textfield;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TextInputEditText extends AppCompatEditText {
    private final Rect parentRect;
    private boolean textInputLayoutFocusedRectEnabled;

    public TextInputEditText(Context context) {
    }

    private String getAccessibilityNodeInfoText(TextInputLayout textInputLayout) {
    }

    private CharSequence getHintFromLayout() {
    }

    private TextInputLayout getTextInputLayout() {
    }

    private boolean shouldUseTextInputLayoutFocusedRect(TextInputLayout textInputLayout) {
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
    }

    public boolean isTextInputLayoutFocusedRectEnabled() {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
    }
}
