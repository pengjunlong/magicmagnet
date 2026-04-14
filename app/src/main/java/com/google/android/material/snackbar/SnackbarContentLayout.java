package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(Context context) {
    }

    private static void updateTopBottomPadding(View view, int i, int i2) {
    }

    private boolean updateViewsWithinLayout(int i, int i2, int i3) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i, int i2) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i, int i2) {
    }

    public Button getActionView() {
    }

    public TextView getMessageView() {
    }

    @Override // android.view.View
    protected void onFinishInflate() {
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public void setMaxInlineActionWidth(int i) {
    }

    void updateActionTextColorAlphaIfNeeded(float f) {
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
    }
}
