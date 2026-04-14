package com.ashokvarma.bottomnavigation.behaviour;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class VerticalScrollingBehavior<V extends View> extends CoordinatorLayout.dqqppqiKzJi1l1lll1l<V> {
    private int bpdqqiQNVROMLC1ll1l1l11;
    private int dbpqdHhmDSIHIJiwc1ll1l1;
    private int dpbdbdpbLwkLpObyKsq1lll1;
    private int dpbdpqRKAscW1lll1l;
    private int dqqppqiKzJi1l1lll1l;
    private int ppbdpwWWljzmXXdHNabfWhgjl111l11;

    public VerticalScrollingBehavior(Context context, AttributeSet attributeSet) {
    }

    protected abstract boolean dbpqdHhmDSIHIJiwc1ll1l1(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z, int i);

    public abstract void dpbdbdpbLwkLpObyKsq1lll1(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3);

    public abstract void dpbdpqRKAscW1lll1l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    public abstract void dqqppqiKzJi1l1lll1l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.dqqppqiKzJi1l1lll1l
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
    }

    public VerticalScrollingBehavior() {
    }
}
