package com.xunlei.downloadlib;

import java.io.File;
import java.text.SimpleDateFormat;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XLLog {
    private static SimpleDateFormat DATEFORMAT;
    private static LogConfig sLogConfig;

    private static class LogConfig {
        private String mAnrDir;
        private long mAnrInterval;
        private String mCrashDir;
        private boolean mDumpCrash;
        private File mFile;
        private String mFileName;
        private LogLevel mLevel;
        private String mLogDir;
        private String mLogFilter;
        private long mLogSize;
        private int mNext;
        private int mRun;

        public String getAnrDir() {
        }

        public long getAnrInterval() {
        }

        public String getCrashDir() {
        }

        public File getLogFile() {
        }

        public long getLogFileSize() {
        }

        public String getLogFilter() {
        }

        public LogLevel getLogLevel() {
        }

        public boolean needDumpCrash() {
        }

        public boolean parseConfigFile(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class LogLevel {
        private static final /* synthetic */ LogLevel[] $VALUES = null;
        public static final LogLevel LOG_LEVEL_DEBUG = null;
        public static final LogLevel LOG_LEVEL_ERROR = null;
        public static final LogLevel LOG_LEVEL_INFO = null;
        public static final LogLevel LOG_LEVEL_OFF = null;
        public static final LogLevel LOG_LEVEL_WARN = null;
        private int logLevel;

        private LogLevel(String str, int i, int i2) {
        }

        public static LogLevel valueOf(String str) {
        }

        public static LogLevel[] values() {
        }

        public int getValue() {
        }

        public void setValue(String str) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        public String toString(boolean z) {
        }
    }

    public static boolean canbeLog(LogLevel logLevel) {
    }

    /* renamed from: d */
    public static void m853d(String str, String str2) {
    }

    /* renamed from: e */
    public static void m854e(String str, String str2) {
    }

    private static String formatMessage(String str, String str2) {
    }

    public static String getAnrDir() {
    }

    public static long getAnrInterval() {
    }

    public static String getCrashDir() {
    }

    private static String getMethodLocationInfo(String str) {
    }

    /* renamed from: i */
    public static void m855i(String str, String str2) {
    }

    public static boolean init(String str) {
    }

    private static void log(LogLevel logLevel, String str, String str2) {
    }

    private static void logfile(LogLevel logLevel, String str, String str2) {
    }

    public static boolean needDumpCrash() {
    }

    public static void printStackTrace(Throwable th) {
    }

    /* renamed from: v */
    public static void m856v(String str, String str2) {
    }

    /* renamed from: w */
    public static void m857w(String str, String str2) {
    }

    /* renamed from: w */
    public static void m858w(String str, String str2, Throwable th) {
    }

    public static void wtf(String str, String str2, Throwable th) {
    }
}
