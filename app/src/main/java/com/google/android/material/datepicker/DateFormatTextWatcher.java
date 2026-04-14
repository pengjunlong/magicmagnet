package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    private static final int VALIDATION_DELAY = 1000;
    private final CalendarConstraints constraints;
    private final DateFormat dateFormat;
    private final String outOfRange;
    private final Runnable setErrorCallback;
    private Runnable setRangeErrorCallback;
    private final TextInputLayout textInputLayout;

    DateFormatTextWatcher(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
    }

    private Runnable createRangeErrorCallback(long j) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DateFormatTextWatcher dateFormatTextWatcher, String str) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(DateFormatTextWatcher dateFormatTextWatcher, long j) {
    }

    private /* synthetic */ void lambda$createRangeErrorCallback$1(long j) {
    }

    private /* synthetic */ void lambda$new$0(String str) {
    }

    private String sanitizeDateString(String str) {
    }

    void onInvalidDate() {
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    abstract void onValidDate(Long l);

    public void runValidation(View view, Runnable runnable) {
    }
}
