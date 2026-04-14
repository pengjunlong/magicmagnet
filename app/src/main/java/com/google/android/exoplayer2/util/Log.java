package com.google.android.exoplayer2.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static final Object lock = null;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;
    private static Logger logger;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {
        public static final Logger DEFAULT = null;

        /* renamed from: com.google.android.exoplayer2.util.Log$Logger$1 */
        class C02341 implements Logger {
            C02341() {
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* renamed from: d */
            public void mo21d(String str, String str2) {
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* renamed from: e */
            public void mo22e(String str, String str2) {
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* renamed from: i */
            public void mo23i(String str, String str2) {
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* renamed from: w */
            public void mo24w(String str, String str2) {
            }
        }

        /* renamed from: d */
        void mo21d(String str, String str2);

        /* renamed from: e */
        void mo22e(String str, String str2);

        /* renamed from: i */
        void mo23i(String str, String str2);

        /* renamed from: w */
        void mo24w(String str, String str2);
    }

    private Log() {
    }

    @Pure
    private static String appendThrowableString(String str, Throwable th) {
    }

    @Pure
    /* renamed from: d */
    public static void m13d(String str, String str2) {
    }

    @Pure
    /* renamed from: e */
    public static void m15e(String str, String str2) {
    }

    @Pure
    public static int getLogLevel() {
    }

    @Pure
    public static String getThrowableString(Throwable th) {
    }

    @Pure
    /* renamed from: i */
    public static void m17i(String str, String str2) {
    }

    @Pure
    private static boolean isCausedByUnknownHostException(Throwable th) {
    }

    public static void setLogLevel(int i) {
    }

    public static void setLogStackTraces(boolean z) {
    }

    public static void setLogger(Logger logger2) {
    }

    @Pure
    /* renamed from: w */
    public static void m19w(String str, String str2) {
    }

    @Pure
    /* renamed from: d */
    public static void m14d(String str, String str2, Throwable th) {
    }

    @Pure
    /* renamed from: e */
    public static void m16e(String str, String str2, Throwable th) {
    }

    @Pure
    /* renamed from: i */
    public static void m18i(String str, String str2, Throwable th) {
    }

    @Pure
    /* renamed from: w */
    public static void m20w(String str, String str2, Throwable th) {
    }
}
