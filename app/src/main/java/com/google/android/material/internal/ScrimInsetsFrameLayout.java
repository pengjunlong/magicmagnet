package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import p000.bn0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {
    private boolean drawBottomInsetForeground;
    private boolean drawLeftInsetForeground;
    private boolean drawRightInsetForeground;
    private boolean drawTopInsetForeground;
    Drawable insetForeground;
    Rect insets;
    private Rect tempRect;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$1 */
    class C03811 implements bn0 {
        final /* synthetic */ ScrimInsetsFrameLayout this$0;

        C03811(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        }

        @Override // p000.bn0
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    protected void onInsetsChanged(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    public void setDrawBottomInsetForeground(boolean z) {
    }

    public void setDrawLeftInsetForeground(boolean z) {
    }

    public void setDrawRightInsetForeground(boolean z) {
    }

    public void setDrawTopInsetForeground(boolean z) {
    }

    public void setScrimInsetForeground(Drawable drawable) {
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
    }
}
