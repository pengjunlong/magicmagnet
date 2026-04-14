package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = null;
    private final Month end;
    private final int firstDayOfWeek;
    private final int monthSpan;
    private Month openAt;
    private final Month start;
    private final DateValidator validator;
    private final int yearSpan;

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$1 */
    class C03181 implements Parcelable.Creator<CalendarConstraints> {
        C03181() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CalendarConstraints createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CalendarConstraints[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CalendarConstraints createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CalendarConstraints[] newArray(int i) {
        }
    }

    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i, C03181 c03181) {
    }

    static /* synthetic */ Month access$100(CalendarConstraints calendarConstraints) {
    }

    static /* synthetic */ Month access$200(CalendarConstraints calendarConstraints) {
    }

    static /* synthetic */ Month access$300(CalendarConstraints calendarConstraints) {
    }

    static /* synthetic */ int access$400(CalendarConstraints calendarConstraints) {
    }

    static /* synthetic */ DateValidator access$500(CalendarConstraints calendarConstraints) {
    }

    Month clamp(Month month) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public DateValidator getDateValidator() {
    }

    Month getEnd() {
    }

    public long getEndMs() {
    }

    int getFirstDayOfWeek() {
    }

    int getMonthSpan() {
    }

    Month getOpenAt() {
    }

    public Long getOpenAtMs() {
    }

    Month getStart() {
    }

    public long getStartMs() {
    }

    int getYearSpan() {
    }

    public int hashCode() {
    }

    boolean isWithinBounds(long j) {
    }

    void setOpenAt(Month month) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
    }

    public static final class Builder {
        private static final String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        static final long DEFAULT_END = 0;
        static final long DEFAULT_START = 0;
        private long end;
        private int firstDayOfWeek;
        private Long openAt;
        private long start;
        private DateValidator validator;

        public Builder() {
        }

        public CalendarConstraints build() {
        }

        @CanIgnoreReturnValue
        public Builder setEnd(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setOpenAt(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setStart(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setValidator(DateValidator dateValidator) {
        }

        Builder(CalendarConstraints calendarConstraints) {
        }
    }
}
