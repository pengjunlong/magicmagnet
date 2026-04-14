package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import p000.sq0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class RangeDateSelector implements DateSelector<sq0<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = null;
    private CharSequence error;
    private final String invalidRangeEndError;
    private String invalidRangeStartError;
    private Long proposedTextEnd;
    private Long proposedTextStart;
    private Long selectedEndItem;
    private Long selectedStartItem;
    private SimpleDateFormat textInputFormat;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$1 */
    class C03431 extends DateFormatTextWatcher {
        final /* synthetic */ RangeDateSelector this$0;
        final /* synthetic */ TextInputLayout val$endTextInput;
        final /* synthetic */ OnSelectionChangedListener val$listener;
        final /* synthetic */ TextInputLayout val$startTextInput;

        C03431(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        void onInvalidDate() {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        void onValidDate(Long l) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$2 */
    class C03442 extends DateFormatTextWatcher {
        final /* synthetic */ RangeDateSelector this$0;
        final /* synthetic */ TextInputLayout val$endTextInput;
        final /* synthetic */ OnSelectionChangedListener val$listener;
        final /* synthetic */ TextInputLayout val$startTextInput;

        C03442(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        void onInvalidDate() {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        void onValidDate(Long l) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$3 */
    class C03453 implements Parcelable.Creator<RangeDateSelector> {
        C03453() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RangeDateSelector createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RangeDateSelector[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RangeDateSelector createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RangeDateSelector[] newArray(int i) {
        }
    }

    static /* synthetic */ Long access$002(RangeDateSelector rangeDateSelector, Long l) {
    }

    static /* synthetic */ void access$100(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
    }

    static /* synthetic */ Long access$202(RangeDateSelector rangeDateSelector, Long l) {
    }

    static /* synthetic */ Long access$302(RangeDateSelector rangeDateSelector, Long l) {
    }

    static /* synthetic */ Long access$402(RangeDateSelector rangeDateSelector, Long l) {
    }

    private void clearInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
    }

    private boolean isValidRange(long j, long j2) {
    }

    private void setInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
    }

    private void updateError(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
    }

    private void updateIfValidTextProposal(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener<sq0<Long, Long>> onSelectionChangedListener) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getError() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> getSelectedDays() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<sq0<Long, Long>> getSelectedRanges() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ sq0<Long, Long> getSelection() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionContentDescription(Context context) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionDisplayString(Context context) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener<sq0<Long, Long>> onSelectionChangedListener) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(sq0<Long, Long> sq0Var) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(SimpleDateFormat simpleDateFormat) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: getSelection, reason: avoid collision after fix types in other method */
    public sq0<Long, Long> getSelection2() {
    }

    /* renamed from: setSelection, reason: avoid collision after fix types in other method */
    public void setSelection2(sq0<Long, Long> sq0Var) {
    }
}
