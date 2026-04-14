package com.google.android.material.timepicker;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {
    private final ChipTextInputComboView hourLayoutComboView;
    private boolean keyListenerRunning;
    private final ChipTextInputComboView minuteLayoutComboView;
    private final TimeModel time;

    TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
    }

    private void clearPrefilledText(EditText editText) {
    }

    private void moveSelection(int i) {
    }

    private boolean onHourKeyPress(int i, KeyEvent keyEvent, EditText editText) {
    }

    private boolean onMinuteKeyPress(int i, KeyEvent keyEvent, EditText editText) {
    }

    public void bind() {
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
    }
}
