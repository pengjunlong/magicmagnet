package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class TimePickerView extends ConstraintLayout implements TimePickerControls {
    static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final ClockFaceView clockFace;
    private final ClockHandView clockHandView;
    private final Chip hourView;
    private final Chip minuteView;
    private OnDoubleTapListener onDoubleTapListener;
    private OnPeriodChangeListener onPeriodChangeListener;
    private OnSelectionChange onSelectionChangeListener;
    private final View.OnClickListener selectionListener;
    private final MaterialButtonToggleGroup toggle;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$1 */
    class ViewOnClickListenerC04951 implements View.OnClickListener {
        final /* synthetic */ TimePickerView this$0;

        ViewOnClickListenerC04951(TimePickerView timePickerView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$2 */
    class C04962 extends GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ TimePickerView this$0;

        C04962(TimePickerView timePickerView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$3 */
    class ViewOnTouchListenerC04973 implements View.OnTouchListener {
        final /* synthetic */ TimePickerView this$0;
        final /* synthetic */ GestureDetector val$gestureDetector;

        ViewOnTouchListenerC04973(TimePickerView timePickerView, GestureDetector gestureDetector) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    interface OnDoubleTapListener {
        void onDoubleTap();
    }

    interface OnPeriodChangeListener {
        void onPeriodChange(int i);
    }

    interface OnSelectionChange {
        void onSelectionChanged(int i);
    }

    public TimePickerView(Context context) {
    }

    static /* synthetic */ OnSelectionChange access$000(TimePickerView timePickerView) {
    }

    static /* synthetic */ OnDoubleTapListener access$100(TimePickerView timePickerView) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    private /* synthetic */ void lambda$new$0(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    private void setUpDisplay() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupDoubleTap() {
    }

    private void updateSelection(Chip chip, boolean z) {
    }

    public void addOnRotateListener(ClockHandView.OnRotateListener onRotateListener) {
    }

    int getCurrentLevel() {
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int i) {
    }

    public void setAnimateOnTouchUp(boolean z) {
    }

    void setCurrentLevel(int i) {
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float f) {
    }

    public void setHourClickDelegate(androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setMinuteHourDelegate(androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
    }

    void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
    }

    void setOnPeriodChangeListener(OnPeriodChangeListener onPeriodChangeListener) {
    }

    void setOnSelectionChangeListener(OnSelectionChange onSelectionChange) {
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(String[] strArr, int i) {
    }

    public void showToggle() {
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    @SuppressLint({"DefaultLocale"})
    public void updateTime(int i, int i2, int i3) {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
    }

    public void setHandRotation(float f, boolean z) {
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
    }
}
