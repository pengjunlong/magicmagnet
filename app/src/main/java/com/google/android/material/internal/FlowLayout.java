package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(Context context) {
    }

    private static int getMeasuredDimension(int i, int i2, int i3) {
    }

    private void loadFromAttributes(Context context, AttributeSet attributeSet) {
    }

    protected int getItemSpacing() {
    }

    protected int getLineSpacing() {
    }

    protected int getRowCount() {
    }

    public int getRowIndex(View view) {
    }

    public boolean isSingleLine() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    protected void setItemSpacing(int i) {
    }

    protected void setLineSpacing(int i) {
    }

    public void setSingleLine(boolean z) {
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
    }

    @TargetApi(21)
    public FlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
    }
}
