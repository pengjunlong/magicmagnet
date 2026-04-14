package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BackendResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Status {
        private static final /* synthetic */ Status[] $VALUES = null;
        public static final Status FATAL_ERROR = null;
        public static final Status OK = null;
        public static final Status TRANSIENT_ERROR = null;

        private Status(String str, int i) {
        }

        public static Status valueOf(String str) {
        }

        public static Status[] values() {
        }
    }

    public static BackendResponse fatalError() {
    }

    public static BackendResponse ok(long j) {
    }

    public static BackendResponse transientError() {
    }

    public abstract long getNextRequestWaitMillis();

    public abstract Status getStatus();
}
