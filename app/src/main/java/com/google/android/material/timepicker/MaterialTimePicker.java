package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MaterialTimePicker extends bpdqqiQNVROMLC1ll1l1l11 implements TimePickerView.OnDoubleTapListener {
    public static final int INPUT_MODE_CLOCK = 0;
    static final String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    static final String NEGATIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String NEGATIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final String OVERRIDE_THEME_RES_ID = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    static final String POSITIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String POSITIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    static final String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    static final String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";
    private TimePickerPresenter activePresenter;
    private Button cancelButton;
    private final Set<DialogInterface.OnCancelListener> cancelListeners;
    private int clockIcon;
    private final Set<DialogInterface.OnDismissListener> dismissListeners;
    private int inputMode;
    private int keyboardIcon;
    private MaterialButton modeButton;
    private final Set<View.OnClickListener> negativeButtonListeners;
    private CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private int overrideThemeResId;
    private final Set<View.OnClickListener> positiveButtonListeners;
    private CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private ViewStub textInputStub;
    private TimeModel time;
    private TimePickerClockPresenter timePickerClockPresenter;
    private TimePickerTextInputPresenter timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private int titleResId;
    private CharSequence titleText;

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$1 */
    class ViewOnClickListenerC04841 implements View.OnClickListener {
        final /* synthetic */ MaterialTimePicker this$0;

        ViewOnClickListenerC04841(MaterialTimePicker materialTimePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$2 */
    class ViewOnClickListenerC04852 implements View.OnClickListener {
        final /* synthetic */ MaterialTimePicker this$0;

        ViewOnClickListenerC04852(MaterialTimePicker materialTimePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$3 */
    class ViewOnClickListenerC04863 implements View.OnClickListener {
        final /* synthetic */ MaterialTimePicker this$0;

        ViewOnClickListenerC04863(MaterialTimePicker materialTimePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static final class Builder {
        private Integer inputMode;
        private CharSequence negativeButtonText;
        private int negativeButtonTextResId;
        private int overrideThemeResId;
        private CharSequence positiveButtonText;
        private int positiveButtonTextResId;
        private TimeModel time;
        private CharSequence titleText;
        private int titleTextResId;

        static /* synthetic */ TimeModel access$000(Builder builder) {
        }

        static /* synthetic */ Integer access$100(Builder builder) {
        }

        static /* synthetic */ int access$200(Builder builder) {
        }

        static /* synthetic */ CharSequence access$300(Builder builder) {
        }

        static /* synthetic */ int access$400(Builder builder) {
        }

        static /* synthetic */ CharSequence access$500(Builder builder) {
        }

        static /* synthetic */ int access$600(Builder builder) {
        }

        static /* synthetic */ CharSequence access$700(Builder builder) {
        }

        static /* synthetic */ int access$800(Builder builder) {
        }

        public MaterialTimePicker build() {
        }

        @CanIgnoreReturnValue
        public Builder setHour(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setInputMode(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setMinute(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setTheme(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setTimeFormat(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setTitleText(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder setTitleText(CharSequence charSequence) {
        }
    }

    static /* synthetic */ Set access$1000(MaterialTimePicker materialTimePicker) {
    }

    static /* synthetic */ int access$1100(MaterialTimePicker materialTimePicker) {
    }

    static /* synthetic */ int access$1102(MaterialTimePicker materialTimePicker, int i) {
    }

    static /* synthetic */ MaterialButton access$1200(MaterialTimePicker materialTimePicker) {
    }

    static /* synthetic */ void access$1300(MaterialTimePicker materialTimePicker, MaterialButton materialButton) {
    }

    static /* synthetic */ MaterialTimePicker access$1400(Builder builder) {
    }

    static /* synthetic */ Set access$900(MaterialTimePicker materialTimePicker) {
    }

    private Pair<Integer, Integer> dataForMode(int i) {
    }

    private int getThemeResId() {
    }

    private TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int i, TimePickerView timePickerView, ViewStub viewStub) {
    }

    private /* synthetic */ void lambda$onViewCreated$0() {
    }

    private static MaterialTimePicker newInstance(Builder builder) {
    }

    public static /* synthetic */ void pddpddbdIotonl1ll1l11(MaterialTimePicker materialTimePicker) {
    }

    private void restoreState(Bundle bundle) {
    }

    private void updateCancelButtonVisibility() {
    }

    private void updateInputMode(MaterialButton materialButton) {
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
    }

    public boolean addOnPositiveButtonClickListener(View.OnClickListener onClickListener) {
    }

    public void clearOnCancelListeners() {
    }

    public void clearOnDismissListeners() {
    }

    public void clearOnNegativeButtonClickListeners() {
    }

    public void clearOnPositiveButtonClickListeners() {
    }

    public int getHour() {
    }

    public int getInputMode() {
    }

    public int getMinute() {
    }

    TimePickerClockPresenter getTimePickerClockPresenter() {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11
    public final Dialog onCreateDialog(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
    public void onDoubleTap() {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
    }

    public boolean removeOnPositiveButtonClickListener(View.OnClickListener onClickListener) {
    }

    void setActivePresenter(TimePickerPresenter timePickerPresenter) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11
    public void setCancelable(boolean z) {
    }

    public void setHour(int i) {
    }

    public void setMinute(int i) {
    }
}
