package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class RightSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    RightSheetDelegate(SideSheetBehavior<? extends View> sideSheetBehavior) {
    }

    private boolean isReleasedCloseToOriginEdge(View view) {
    }

    private boolean isSwipeSignificant(float f, float f2) {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    float calculateSlideOffsetBasedOnOutwardEdge(int i) {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int calculateTargetStateOnViewReleased(View view, float f, float f2) {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getExpandedOffset() {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getHiddenOffset() {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    <V extends View> int getOutwardEdge(V v) {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int getSheetEdge() {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean isSettling(View view, int i, boolean z) {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean shouldHide(View view, float f) {
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
    }
}
