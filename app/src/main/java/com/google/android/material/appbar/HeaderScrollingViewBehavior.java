package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
    }

    private static int resolveGravity(int i) {
    }

    abstract View findFirstDependency(List<View> list);

    final int getOverlapPixelsForOffset(View view) {
    }

    float getOverlapRatioForOffset(View view) {
    }

    public final int getOverlayTop() {
    }

    int getScrollRange(View view) {
    }

    final int getVerticalLayoutGap() {
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
    }

    public final void setOverlayTop(int i) {
    }

    protected boolean shouldHeaderOverlapScrollingChild() {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
    }
}
