package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = null;
    private final long point;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$1 */
    class C03221 implements Parcelable.Creator<DateValidatorPointBackward> {
        C03221() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DateValidatorPointBackward createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DateValidatorPointBackward[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DateValidatorPointBackward[] newArray(int i) {
        }
    }

    /* synthetic */ DateValidatorPointBackward(long j, C03221 c03221) {
    }

    public static DateValidatorPointBackward before(long j) {
    }

    public static DateValidatorPointBackward now() {
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

    private DateValidatorPointBackward(long j) {
    }
}
