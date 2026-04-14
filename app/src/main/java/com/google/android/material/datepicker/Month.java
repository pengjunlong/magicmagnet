package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = null;
    final int daysInMonth;
    final int daysInWeek;
    private final Calendar firstOfMonth;
    private String longName;
    final int month;
    final long timeInMillis;
    final int year;

    /* renamed from: com.google.android.material.datepicker.Month$1 */
    class C03411 implements Parcelable.Creator<Month> {
        C03411() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Month createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Month[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Month createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Month[] newArray(int i) {
        }
    }

    private Month(Calendar calendar) {
    }

    static Month create(long j) {
    }

    static Month current() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Month month) {
    }

    int daysFromStartOfWeekToFirstOfMonth(int i) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    long getDay(int i) {
    }

    int getDayOfMonth(long j) {
    }

    String getLongName() {
    }

    long getStableId() {
    }

    public int hashCode() {
    }

    Month monthsLater(int i) {
    }

    int monthsUntil(Month month) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Month month) {
    }

    static Month create(int i, int i2) {
    }
}
