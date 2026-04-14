package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class SheetDelegate {
    SheetDelegate() {
    }

    abstract float calculateSlideOffsetBasedOnOutwardEdge(int i);

    abstract int calculateTargetStateOnViewReleased(View view, float f, float f2);

    abstract int getExpandedOffset();

    abstract int getHiddenOffset();

    abstract <V extends View> int getOutwardEdge(V v);

    abstract int getSheetEdge();

    abstract boolean isSettling(View view, int i, boolean z);

    abstract boolean shouldHide(View view, float f);

    abstract void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);
}
