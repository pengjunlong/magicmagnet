package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(Context context) {
    }

    private void initializeDrawables() {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* bridge */ /* synthetic */ CircularProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet) {
    }

    public int getIndicatorDirection() {
    }

    public int getIndicatorInset() {
    }

    public int getIndicatorSize() {
    }

    public void setIndicatorDirection(int i) {
    }

    public void setIndicatorInset(int i) {
    }

    public void setIndicatorSize(int i) {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: createSpec, reason: avoid collision after fix types in other method */
    CircularProgressIndicatorSpec createSpec2(Context context, AttributeSet attributeSet) {
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
    }
}
