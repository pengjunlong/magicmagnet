package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = null;
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    final int format;
    int hour;
    private final MaxInputValidator hourInputValidator;
    int minute;
    private final MaxInputValidator minuteInputValidator;
    int period;
    int selection;

    /* renamed from: com.google.android.material.timepicker.TimeModel$1 */
    class C04871 implements Parcelable.Creator<TimeModel> {
        C04871() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TimeModel createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TimeModel[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i) {
        }
    }

    public TimeModel() {
    }

    public static String formatText(Resources resources, CharSequence charSequence) {
    }

    private static int getPeriod(int i) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public int getHourContentDescriptionResId() {
    }

    public int getHourForDisplay() {
    }

    public MaxInputValidator getHourInputValidator() {
    }

    public MaxInputValidator getMinuteInputValidator() {
    }

    public int hashCode() {
    }

    public void setHour(int i) {
    }

    public void setHourOfDay(int i) {
    }

    public void setMinute(int i) {
    }

    public void setPeriod(int i) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public TimeModel(int i) {
    }

    public static String formatText(Resources resources, CharSequence charSequence, String str) {
    }

    public TimeModel(int i, int i2, int i3, int i4) {
    }

    protected TimeModel(Parcel parcel) {
    }
}
