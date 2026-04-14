package com.google.firebase.perf.util;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class Constants {
    public static final int BURST_CAPACITY = 500;
    public static final String ENABLE_DISABLE = "isEnabled";
    public static final int FROZEN_FRAME_TIME = 700;
    public static final int MAX_ATTRIBUTE_KEY_LENGTH = 40;
    public static final int MAX_ATTRIBUTE_VALUE_LENGTH = 100;
    public static final int MAX_CONTENT_TYPE_LENGTH = 128;
    public static final int MAX_COUNTER_ID_LENGTH = 100;
    public static final int MAX_HOST_LENGTH = 255;
    public static final float MAX_SAMPLING_RATE = 1.0f;
    public static final int MAX_SUBTRACE_DEEP = 1;
    public static final int MAX_TRACE_CUSTOM_ATTRIBUTES = 5;
    public static final int MAX_TRACE_ID_LENGTH = 100;
    public static final int MAX_URL_LENGTH = 2000;
    public static final float MIN_SAMPLING_RATE = 0.0f;
    public static final String PREFS_NAME = "FirebasePerfSharedPrefs";
    public static final int RATE_PER_MINUTE = 100;
    public static final String SCREEN_TRACE_PREFIX = "_st_";
    public static final int SLOW_FRAME_TIME = 16;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class CounterNames {
        private static final /* synthetic */ CounterNames[] $VALUES = null;
        public static final CounterNames FRAMES_FROZEN = null;
        public static final CounterNames FRAMES_SLOW = null;
        public static final CounterNames FRAMES_TOTAL = null;
        public static final CounterNames NETWORK_TRACE_EVENT_RATE_LIMITED = null;
        public static final CounterNames TRACE_EVENT_RATE_LIMITED = null;
        public static final CounterNames TRACE_STARTED_NOT_STOPPED = null;
        private String mName;

        private CounterNames(String str, int i, String str2) {
        }

        public static CounterNames valueOf(String str) {
        }

        public static CounterNames[] values() {
        }

        @Override // java.lang.Enum
        public String toString() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class TraceNames {
        private static final /* synthetic */ TraceNames[] $VALUES = null;
        public static final TraceNames APP_START_TRACE_NAME = null;
        public static final TraceNames BACKGROUND_TRACE_NAME = null;
        public static final TraceNames FOREGROUND_TRACE_NAME = null;
        public static final TraceNames ON_CREATE_TRACE_NAME = null;
        public static final TraceNames ON_RESUME_TRACE_NAME = null;
        public static final TraceNames ON_START_TRACE_NAME = null;
        private String mName;

        private TraceNames(String str, int i, String str2) {
        }

        public static TraceNames valueOf(String str) {
        }

        public static TraceNames[] values() {
        }

        @Override // java.lang.Enum
        public String toString() {
        }
    }
}
