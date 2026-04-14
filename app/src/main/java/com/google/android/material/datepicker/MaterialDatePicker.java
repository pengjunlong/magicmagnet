package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll;
import androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.LinkedHashSet;
import p000.bn0;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.sq0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MaterialDatePicker<S> extends bpdqqiQNVROMLC1ll1l1l11 {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    static final Object CANCEL_BUTTON_TAG = null;
    static final Object CONFIRM_BUTTON_TAG = null;
    private static final String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final String NEGATIVE_BUTTON_TEXT_RES_ID_KEY = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT_KEY";
    private static final String POSITIVE_BUTTON_TEXT_RES_ID_KEY = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    static final Object TOGGLE_BUTTON_TAG = null;
    private MaterialShapeDrawable background;
    private MaterialCalendar<S> calendar;
    private CalendarConstraints calendarConstraints;
    private Button confirmButton;
    private DateSelector<S> dateSelector;
    private DayViewDecorator dayViewDecorator;
    private boolean edgeToEdgeEnabled;
    private CharSequence fullTitleText;
    private boolean fullscreen;
    private TextView headerSelectionText;
    private TextView headerTitleTextView;
    private CheckableImageButton headerToggleButton;
    private int inputMode;
    private CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private final LinkedHashSet<DialogInterface.OnCancelListener> onCancelListeners;
    private final LinkedHashSet<DialogInterface.OnDismissListener> onDismissListeners;
    private final LinkedHashSet<View.OnClickListener> onNegativeButtonClickListeners;
    private final LinkedHashSet<MaterialPickerOnPositiveButtonClickListener<? super S>> onPositiveButtonClickListeners;
    private int overrideThemeResId;
    private PickerFragment<S> pickerFragment;
    private CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private CharSequence singleLineTitleText;
    private CharSequence titleText;
    private int titleTextResId;

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$1 */
    class ViewOnClickListenerC03341 implements View.OnClickListener {
        final /* synthetic */ MaterialDatePicker this$0;

        ViewOnClickListenerC03341(MaterialDatePicker materialDatePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$2 */
    class C03352 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ MaterialDatePicker this$0;

        C03352(MaterialDatePicker materialDatePicker) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$3 */
    class ViewOnClickListenerC03363 implements View.OnClickListener {
        final /* synthetic */ MaterialDatePicker this$0;

        ViewOnClickListenerC03363(MaterialDatePicker materialDatePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$4 */
    class C03374 implements bn0 {
        final /* synthetic */ MaterialDatePicker this$0;
        final /* synthetic */ View val$headerLayout;
        final /* synthetic */ int val$originalHeaderHeight;
        final /* synthetic */ int val$originalPaddingTop;

        C03374(MaterialDatePicker materialDatePicker, int i, View view, int i2) {
        }

        @Override // p000.bn0
        public bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$5 */
    class C03385 extends OnSelectionChangedListener<S> {
        final /* synthetic */ MaterialDatePicker this$0;

        C03385(MaterialDatePicker materialDatePicker) {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onIncompleteSelectionChanged() {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onSelectionChanged(S s) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$6 */
    class ViewOnClickListenerC03396 implements View.OnClickListener {
        final /* synthetic */ MaterialDatePicker this$0;

        ViewOnClickListenerC03396(MaterialDatePicker materialDatePicker) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    static /* synthetic */ LinkedHashSet access$000(MaterialDatePicker materialDatePicker) {
    }

    static /* synthetic */ DateSelector access$100(MaterialDatePicker materialDatePicker) {
    }

    static /* synthetic */ LinkedHashSet access$200(MaterialDatePicker materialDatePicker) {
    }

    static /* synthetic */ Button access$300(MaterialDatePicker materialDatePicker) {
    }

    static /* synthetic */ CheckableImageButton access$400(MaterialDatePicker materialDatePicker) {
    }

    static /* synthetic */ void access$500(MaterialDatePicker materialDatePicker, CheckableImageButton checkableImageButton) {
    }

    static /* synthetic */ void access$600(MaterialDatePicker materialDatePicker) {
    }

    private static Drawable createHeaderToggleDrawable(Context context) {
    }

    private void enableEdgeToEdgeIfNeeded(Window window) {
    }

    private DateSelector<S> getDateSelector() {
    }

    private static CharSequence getFirstLineBySeparator(CharSequence charSequence) {
    }

    private String getHeaderContentDescription() {
    }

    private static int getPaddedPickerWidth(Context context) {
    }

    private int getThemeResId(Context context) {
    }

    private void initHeaderToggle(Context context) {
    }

    static boolean isFullscreen(Context context) {
    }

    private boolean isLandscape() {
    }

    static boolean isNestedScrollable(Context context) {
    }

    static <S> MaterialDatePicker<S> newInstance(Builder<S> builder) {
    }

    static boolean readMaterialCalendarStyleBoolean(Context context, int i) {
    }

    private void startPickerFragment() {
    }

    public static long thisMonthInUtcMilliseconds() {
    }

    public static long todayInUtcMilliseconds() {
    }

    private void updateTitle(boolean z) {
    }

    private void updateToggleContentDescription(CheckableImageButton checkableImageButton) {
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
    }

    public boolean addOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
    }

    public void clearOnCancelListeners() {
    }

    public void clearOnDismissListeners() {
    }

    public void clearOnNegativeButtonClickListeners() {
    }

    public void clearOnPositiveButtonClickListeners() {
    }

    public String getHeaderText() {
    }

    public final S getSelection() {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11
    public final Dialog onCreateDialog(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11, androidx.fragment.app.Fragment
    public void onStop() {
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
    }

    public boolean removeOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
    }

    void updateHeader(String str) {
    }

    public static final class Builder<S> {
        CalendarConstraints calendarConstraints;
        final DateSelector<S> dateSelector;
        DayViewDecorator dayViewDecorator;
        int inputMode;
        CharSequence negativeButtonText;
        int negativeButtonTextResId;
        int overrideThemeResId;
        CharSequence positiveButtonText;
        int positiveButtonTextResId;
        S selection;
        CharSequence titleText;
        int titleTextResId;

        private Builder(DateSelector<S> dateSelector) {
        }

        private Month createDefaultOpenAt() {
        }

        public static <S> Builder<S> customDatePicker(DateSelector<S> dateSelector) {
        }

        public static Builder<Long> datePicker() {
        }

        public static Builder<sq0<Long, Long>> dateRangePicker() {
        }

        private static boolean monthInValidRange(Month month, CalendarConstraints calendarConstraints) {
        }

        public MaterialDatePicker<S> build() {
        }

        @CanIgnoreReturnValue
        public Builder<S> setCalendarConstraints(CalendarConstraints calendarConstraints) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setDayViewDecorator(DayViewDecorator dayViewDecorator) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setInputMode(int i) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonText(int i) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonText(int i) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setSelection(S s) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setTextInputFormat(SimpleDateFormat simpleDateFormat) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setTheme(int i) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setTitleText(int i) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonText(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonText(CharSequence charSequence) {
        }

        @CanIgnoreReturnValue
        public Builder<S> setTitleText(CharSequence charSequence) {
        }
    }
}
