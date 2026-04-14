package com.google.type;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CalendarPeriod implements Internal.EnumLite {
    private static final /* synthetic */ CalendarPeriod[] $VALUES = null;
    public static final CalendarPeriod CALENDAR_PERIOD_UNSPECIFIED = null;
    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final CalendarPeriod DAY = null;
    public static final int DAY_VALUE = 1;
    public static final CalendarPeriod FORTNIGHT = null;
    public static final int FORTNIGHT_VALUE = 3;
    public static final CalendarPeriod HALF = null;
    public static final int HALF_VALUE = 6;
    public static final CalendarPeriod MONTH = null;
    public static final int MONTH_VALUE = 4;
    public static final CalendarPeriod QUARTER = null;
    public static final int QUARTER_VALUE = 5;
    public static final CalendarPeriod UNRECOGNIZED = null;
    public static final CalendarPeriod WEEK = null;
    public static final int WEEK_VALUE = 2;
    public static final CalendarPeriod YEAR = null;
    public static final int YEAR_VALUE = 7;
    private static final Internal.EnumLiteMap<CalendarPeriod> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.type.CalendarPeriod$1 */
    class C13651 implements Internal.EnumLiteMap<CalendarPeriod> {
        C13651() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ CalendarPeriod findValueByNumber(int i) {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: findValueByNumber, reason: avoid collision after fix types in other method */
        public CalendarPeriod findValueByNumber2(int i) {
        }
    }

    private static final class CalendarPeriodVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private CalendarPeriodVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private CalendarPeriod(String str, int i, int i2) {
    }

    public static CalendarPeriod forNumber(int i) {
    }

    public static Internal.EnumLiteMap<CalendarPeriod> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static CalendarPeriod valueOf(String str) {
    }

    public static CalendarPeriod[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static CalendarPeriod valueOf(int i) {
    }
}
