package com.google.logging.type;

import com.google.protobuf.Internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LogSeverity implements Internal.EnumLite {
    private static final /* synthetic */ LogSeverity[] $VALUES = null;
    public static final LogSeverity ALERT = null;
    public static final int ALERT_VALUE = 700;
    public static final LogSeverity CRITICAL = null;
    public static final int CRITICAL_VALUE = 600;
    public static final LogSeverity DEBUG = null;
    public static final int DEBUG_VALUE = 100;
    public static final LogSeverity DEFAULT = null;
    public static final int DEFAULT_VALUE = 0;
    public static final LogSeverity EMERGENCY = null;
    public static final int EMERGENCY_VALUE = 800;
    public static final LogSeverity ERROR = null;
    public static final int ERROR_VALUE = 500;
    public static final LogSeverity INFO = null;
    public static final int INFO_VALUE = 200;
    public static final LogSeverity NOTICE = null;
    public static final int NOTICE_VALUE = 300;
    public static final LogSeverity UNRECOGNIZED = null;
    public static final LogSeverity WARNING = null;
    public static final int WARNING_VALUE = 400;
    private static final Internal.EnumLiteMap<LogSeverity> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.logging.type.LogSeverity$1 */
    class C12641 implements Internal.EnumLiteMap<LogSeverity> {
        C12641() {
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public /* bridge */ /* synthetic */ LogSeverity findValueByNumber(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public LogSeverity findValueByNumber(int i) {
        }
    }

    private static final class LogSeverityVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private LogSeverityVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
        }
    }

    private LogSeverity(String str, int i, int i2) {
    }

    public static LogSeverity forNumber(int i) {
    }

    public static Internal.EnumLiteMap<LogSeverity> internalGetValueMap() {
    }

    public static Internal.EnumVerifier internalGetVerifier() {
    }

    public static LogSeverity valueOf(String str) {
    }

    public static LogSeverity[] values() {
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
    }

    @Deprecated
    public static LogSeverity valueOf(int i) {
    }
}
