package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(Context context) {
    }

    private void initializeDrawables() {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* bridge */ /* synthetic */ LinearProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet) {
    }

    public int getIndeterminateAnimationType() {
    }

    public int getIndicatorDirection() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    public void setIndeterminateAnimationType(int i) {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
    }

    public void setIndicatorDirection(int i) {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: createSpec, reason: avoid collision after fix types in other method */
    LinearProgressIndicatorSpec createSpec2(Context context, AttributeSet attributeSet) {
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
    }
}
