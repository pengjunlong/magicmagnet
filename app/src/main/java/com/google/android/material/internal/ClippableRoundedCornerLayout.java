package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    private Path path;

    public ClippableRoundedCornerLayout(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    public void resetClipBoundsAndCornerRadius() {
    }

    public void updateClipBoundsAndCornerRadius(Rect rect, float f) {
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
    }

    public void updateClipBoundsAndCornerRadius(float f, float f2, float f3, float f4, float f5) {
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
    }

    public void updateClipBoundsAndCornerRadius(RectF rectF, float f) {
    }
}
