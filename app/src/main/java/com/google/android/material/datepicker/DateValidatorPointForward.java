package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = null;
    private final long point;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$1 */
    class C03231 implements Parcelable.Creator<DateValidatorPointForward> {
        C03231() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DateValidatorPointForward createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DateValidatorPointForward[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DateValidatorPointForward[] newArray(int i) {
        }
    }

    /* synthetic */ DateValidatorPointForward(long j, C03231 c03231) {
    }

    public static DateValidatorPointForward from(long j) {
    }

    public static DateValidatorPointForward now() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    private DateValidatorPointForward(long j) {
    }
}
