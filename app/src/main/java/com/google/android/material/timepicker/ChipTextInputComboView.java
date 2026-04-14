package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    private final Chip chip;
    private final EditText editText;
    private TextView label;
    private final TextInputLayout textInputLayout;
    private TextWatcher watcher;

    private class TextFormatter extends TextWatcherAdapter {
        private static final String DEFAULT_TEXT = "00";
        final /* synthetic */ ChipTextInputComboView this$0;

        private TextFormatter(ChipTextInputComboView chipTextInputComboView) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        /* synthetic */ TextFormatter(ChipTextInputComboView chipTextInputComboView, C04801 c04801) {
        }
    }

    public ChipTextInputComboView(Context context) {
    }

    static /* synthetic */ String access$100(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
    }

    static /* synthetic */ Chip access$200(ChipTextInputComboView chipTextInputComboView) {
    }

    private String formatText(CharSequence charSequence) {
    }

    private void updateHintLocales() {
    }

    public void addInputFilter(InputFilter inputFilter) {
    }

    CharSequence getChipText() {
    }

    public TextInputLayout getTextInput() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setChipDelegate(androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setCursorVisible(boolean z) {
    }

    public void setHelperText(CharSequence charSequence) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
    }

    public void setText(CharSequence charSequence) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
    }
}
