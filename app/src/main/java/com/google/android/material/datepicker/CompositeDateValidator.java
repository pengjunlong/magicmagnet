package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    private static final Operator ALL_OPERATOR = null;
    private static final Operator ANY_OPERATOR = null;
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = null;
    private final Operator operator;
    private final List<CalendarConstraints.DateValidator> validators;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$1 */
    class C03191 implements Operator {
        C03191() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(List<CalendarConstraints.DateValidator> list, long j) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$2 */
    class C03202 implements Operator {
        C03202() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(List<CalendarConstraints.DateValidator> list, long j) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$3 */
    class C03213 implements Parcelable.Creator<CompositeDateValidator> {
        C03213() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CompositeDateValidator createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CompositeDateValidator[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CompositeDateValidator createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CompositeDateValidator[] newArray(int i) {
        }
    }

    private interface Operator {
        int getId();

        boolean isValid(List<CalendarConstraints.DateValidator> list, long j);
    }

    /* synthetic */ CompositeDateValidator(List list, Operator operator, C03191 c03191) {
    }

    static /* synthetic */ Operator access$000() {
    }

    static /* synthetic */ Operator access$100() {
    }

    public static CalendarConstraints.DateValidator allOf(List<CalendarConstraints.DateValidator> list) {
    }

    public static CalendarConstraints.DateValidator anyOf(List<CalendarConstraints.DateValidator> list) {
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

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> list, Operator operator) {
    }
}
