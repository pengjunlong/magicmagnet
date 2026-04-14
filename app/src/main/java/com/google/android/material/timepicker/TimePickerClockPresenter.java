package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private static final String[] HOUR_CLOCK_24_VALUES = null;
    private static final String[] HOUR_CLOCK_VALUES = null;
    private static final String[] MINUTE_CLOCK_VALUES = null;
    private boolean broadcasting;
    private float hourRotation;
    private float minuteRotation;
    private final TimeModel time;
    private final TimePickerView timePickerView;

    /* renamed from: com.google.android.material.timepicker.TimePickerClockPresenter$1 */
    class C04881 extends ClickActionDelegate {
        final /* synthetic */ TimePickerClockPresenter this$0;

        C04881(TimePickerClockPresenter timePickerClockPresenter, Context context, int i) {
        }

        @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerClockPresenter$2 */
    class C04892 extends ClickActionDelegate {
        final /* synthetic */ TimePickerClockPresenter this$0;

        C04892(TimePickerClockPresenter timePickerClockPresenter, Context context, int i) {
        }

        @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
    }

    static /* synthetic */ TimeModel access$000(TimePickerClockPresenter timePickerClockPresenter) {
    }

    private String[] getHourClockValues() {
    }

    private int getHourRotation() {
    }

    private void performHapticFeedback(int i, int i2) {
    }

    private void updateCurrentLevel() {
    }

    private void updateTime() {
    }

    private void updateValues() {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f, boolean z) {
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i) {
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
    }

    void setSelection(int i, boolean z) {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
    }

    private void updateValues(String[] strArr, String str) {
    }
}
