package com.google.android.material.timepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.timepicker.TimePickerView;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    private final TimePickerTextInputKeyController controller;
    private final EditText hourEditText;
    private final ChipTextInputComboView hourTextInput;
    private final TextWatcher hourTextWatcher;
    private final EditText minuteEditText;
    private final ChipTextInputComboView minuteTextInput;
    private final TextWatcher minuteTextWatcher;
    private final TimeModel time;
    private final LinearLayout timePickerView;
    private MaterialButtonToggleGroup toggle;

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$1 */
    class C04901 extends TextWatcherAdapter {
        final /* synthetic */ TimePickerTextInputPresenter this$0;

        C04901(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$2 */
    class C04912 extends TextWatcherAdapter {
        final /* synthetic */ TimePickerTextInputPresenter this$0;

        C04912(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$3 */
    class ViewOnClickListenerC04923 implements View.OnClickListener {
        final /* synthetic */ TimePickerTextInputPresenter this$0;

        ViewOnClickListenerC04923(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$4 */
    class C04934 extends ClickActionDelegate {
        final /* synthetic */ TimePickerTextInputPresenter this$0;
        final /* synthetic */ TimeModel val$time;

        C04934(TimePickerTextInputPresenter timePickerTextInputPresenter, Context context, int i, TimeModel timeModel) {
        }

        @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$5 */
    class C04945 extends ClickActionDelegate {
        final /* synthetic */ TimePickerTextInputPresenter this$0;
        final /* synthetic */ TimeModel val$time;

        C04945(TimePickerTextInputPresenter timePickerTextInputPresenter, Context context, int i, TimeModel timeModel) {
        }

        @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    public TimePickerTextInputPresenter(LinearLayout linearLayout, TimeModel timeModel) {
    }

    static /* synthetic */ TimeModel access$000(TimePickerTextInputPresenter timePickerTextInputPresenter) {
    }

    private void addTextWatchers() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(TimePickerTextInputPresenter timePickerTextInputPresenter, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    private /* synthetic */ void lambda$setupPeriodToggle$0(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    private void removeTextWatchers() {
    }

    private static void setCursorDrawableColor(EditText editText, int i) {
    }

    private void setTime(TimeModel timeModel) {
    }

    private void setupPeriodToggle() {
    }

    private void updateSelection() {
    }

    public void clearCheck() {
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

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
    }

    public void resetChecked() {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
    }
}
