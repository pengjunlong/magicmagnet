package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    private int itemMinimumHeight;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(Context context) {
    }

    private int makeSharedHeightSpec(int i, int i2, int i3) {
    }

    private int measureChildHeight(View view, int i, int i2) {
    }

    private int measureSharedChildHeights(int i, int i2, int i3, View view) {
    }

    private int measureShiftingChildHeights(int i, int i2, int i3) {
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    protected NavigationBarItemView createNavigationBarItemView(Context context) {
    }

    public int getItemMinimumHeight() {
    }

    int getMenuGravity() {
    }

    boolean isTopGravity() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    public void setItemMinimumHeight(int i) {
    }

    void setMenuGravity(int i) {
    }
}
