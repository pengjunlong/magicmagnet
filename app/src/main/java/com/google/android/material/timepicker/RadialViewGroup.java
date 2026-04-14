package com.google.android.material.timepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class RadialViewGroup extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(Context context) {
    }

    private void addConstraints(List<View> list, androidx.constraintlayout.widget.dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, int i) {
    }

    private Drawable createBackground() {
    }

    private static boolean shouldSkipView(View view) {
    }

    private void updateLayoutParamsAsync() {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    int getLeveledRadius(int i) {
    }

    public int getRadius() {
    }

    @Override // android.view.View
    protected void onFinishInflate() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    public void setRadius(int i) {
    }

    protected void updateLayoutParams() {
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
    }
}
