package com.google.type;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DayOfWeek implements Internal.EnumLite {
    private static final /* synthetic */ DayOfWeek[] $VALUES = null;
    public static final DayOfWeek DAY_OF_WEEK_UNSPECIFIED = null;
    public static final int DAY_OF_WEEK_UNSPECIFIED_VALUE = 0;
    public static final DayOfWeek FRIDAY = null;
    public static final int FRIDAY_VALUE = 5;
    public static final DayOfWeek MONDAY = null;
    public static final int MONDAY_VALUE = 1;
    public static final DayOfWeek SATURDAY = null;
    public static final int SATURDAY_VALUE = 6;
    public static final DayOfWeek SUNDAY = null;
    public static final int SUNDAY_VALUE = 7;
    public static final DayOfWeek THURSDAY = null;
    public static final int THURSDAY_VALUE = 4;
    public static final DayOfWeek TUESDAY = null;
    public static final int TUESDAY_VALUE = 2;
    public static final DayOfWeek UNRECOGNIZED = null;
    public static final DayOfWeek WEDNESDAY = null;
    public static final int WEDNESDAY_VALUE = 3;
    private static final Internal.EnumLiteMap<DayOfWeek> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.type.DayOfWeek$1 */
    class C13691 implements Internal.EnumLiteMap<DayOfWeek> {
        C13691() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ DayOfWeek findValueByNumber(int i) {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: findValueByNumber, reason: avoid collision after fix types in other method */
        public DayOfWeek findValueByNumber2(int i) {
        }
    }

    private static final class DayOfWeekVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private DayOfWeekVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private DayOfWeek(String str, int i, int i2) {
    }

    public static DayOfWeek forNumber(int i) {
    }

    public static Internal.EnumLiteMap<DayOfWeek> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static DayOfWeek valueOf(String str) {
    }

    public static DayOfWeek[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static DayOfWeek valueOf(int i) {
    }
}
