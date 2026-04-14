package org.adblockplus.libadblockplus;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface LogSystem {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class LogLevel {
        private static final /* synthetic */ LogLevel[] $VALUES = null;
        public static final LogLevel ERROR = null;
        public static final LogLevel INFO = null;
        public static final LogLevel LOG = null;
        public static final LogLevel TRACE = null;
        public static final LogLevel WARN = null;

        private static /* synthetic */ LogLevel[] $values() {
        }

        private LogLevel(String str, int i) {
        }

        public static LogLevel valueOf(String str) {
        }

        public static LogLevel[] values() {
        }
    }

    void logCallback(LogLevel logLevel, String str, String str2);
}
