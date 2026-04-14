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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = null;
    private CharSequence error;
    private Long selectedItem;
    private SimpleDateFormat textInputFormat;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$1 */
    class C03461 extends DateFormatTextWatcher {
        final /* synthetic */ SingleDateSelector this$0;
        final /* synthetic */ TextInputLayout val$dateTextInput;
        final /* synthetic */ OnSelectionChangedListener val$listener;

        C03461(SingleDateSelector singleDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener, TextInputLayout textInputLayout2) {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        void onInvalidDate() {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        void onValidDate(Long l) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$2 */
    class C03472 implements Parcelable.Creator<SingleDateSelector> {
        C03472() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SingleDateSelector createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SingleDateSelector[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SingleDateSelector createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SingleDateSelector[] newArray(int i) {
        }
    }

    static /* synthetic */ void access$000(SingleDateSelector singleDateSelector) {
    }

    static /* synthetic */ CharSequence access$102(SingleDateSelector singleDateSelector, CharSequence charSequence) {
    }

    static /* synthetic */ Long access$202(SingleDateSelector singleDateSelector, Long l) {
    }

    private void clearSelection() {
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
    public /* bridge */ /* synthetic */ Long getSelection() {
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
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener<Long> onSelectionChangedListener) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(Long l) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(SimpleDateFormat simpleDateFormat) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public Long getSelection() {
    }

    /* renamed from: setSelection, reason: avoid collision after fix types in other method */
    public void setSelection2(Long l) {
    }
}
