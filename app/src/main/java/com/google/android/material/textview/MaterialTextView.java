package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
    }

    private void applyLineHeightFromViewAppearance(Resources.Theme theme, int i) {
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
    }

    private static int findViewAppearanceResourceId(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
    }

    private void initialize(AttributeSet attributeSet, int i, int i2) {
    }

    private static int readFirstAvailableDimension(Context context, TypedArray typedArray, int... iArr) {
    }

    private static boolean viewAttrsHasLineHeight(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
    }

    @Deprecated
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
    }
}
