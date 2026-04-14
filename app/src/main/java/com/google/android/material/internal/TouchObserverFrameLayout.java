package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class TouchObserverFrameLayout extends FrameLayout {
    private View.OnTouchListener onTouchListener;

    public TouchObserverFrameLayout(Context context) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    public TouchObserverFrameLayout(Context context, AttributeSet attributeSet) {
    }

    public TouchObserverFrameLayout(Context context, AttributeSet attributeSet, int i) {
    }
}
