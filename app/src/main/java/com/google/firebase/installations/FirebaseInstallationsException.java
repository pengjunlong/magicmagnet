package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FirebaseInstallationsException extends FirebaseException {
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Status {
        private static final /* synthetic */ Status[] $VALUES = null;
        public static final Status BAD_CONFIG = null;
        public static final Status TOO_MANY_REQUESTS = null;
        public static final Status UNAVAILABLE = null;

        private Status(String str, int i) {
        }

        public static Status valueOf(String str) {
        }

        public static Status[] values() {
        }
    }

    public FirebaseInstallationsException(Status status) {
    }

    public Status getStatus() {
    }

    public FirebaseInstallationsException(String str, Status status) {
    }

    public FirebaseInstallationsException(String str, Status status, Throwable th) {
    }
}
