package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 valueAccessibilityDelegate;
    private String[] values;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$1 */
    class ViewTreeObserverOnPreDrawListenerC04811 implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ ClockFaceView this$0;

        ViewTreeObserverOnPreDrawListenerC04811(ClockFaceView clockFaceView) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$2 */
    class C04822 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ ClockFaceView this$0;

        C04822(ClockFaceView clockFaceView) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        }
    }

    public ClockFaceView(Context context) {
    }

    static /* synthetic */ ClockHandView access$000(ClockFaceView clockFaceView) {
    }

    static /* synthetic */ int access$100(ClockFaceView clockFaceView) {
    }

    static /* synthetic */ SparseArray access$200(ClockFaceView clockFaceView) {
    }

    static /* synthetic */ Rect access$300(ClockFaceView clockFaceView) {
    }

    private void findIntersectingTextView() {
    }

    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
    }

    private TextView getSelectedTextView(RectF rectF) {
    }

    private static float max3(float f, float f2, float f3) {
    }

    private void updateTextViews(int i) {
    }

    int getCurrentLevel() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
    }

    void setCurrentLevel(int i) {
    }

    public void setHandRotation(float f) {
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i) {
    }

    public void setValues(String[] strArr, int i) {
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    protected void updateLayoutParams() {
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
    }
}
