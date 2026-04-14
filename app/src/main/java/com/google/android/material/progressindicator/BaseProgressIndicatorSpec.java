package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public int[] indicatorColors;
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public int trackThickness;

    protected BaseProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private void loadIndicatorColors(Context context, TypedArray typedArray) {
    }

    private void loadTrackColor(Context context, TypedArray typedArray) {
    }

    public boolean isHideAnimationEnabled() {
    }

    public boolean isShowAnimationEnabled() {
    }

    abstract void validateSpec();
}
