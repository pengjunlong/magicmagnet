package org.conscrypt.ct;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class VerifiedSCT {
    public final SignedCertificateTimestamp sct;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Status {
        private static final /* synthetic */ Status[] $VALUES = null;
        public static final Status INVALID_SCT = null;
        public static final Status INVALID_SIGNATURE = null;
        public static final Status UNKNOWN_LOG = null;
        public static final Status VALID = null;

        private Status(String str, int i) {
        }

        public static Status valueOf(String str) {
        }

        public static Status[] values() {
        }
    }

    public VerifiedSCT(SignedCertificateTimestamp signedCertificateTimestamp, Status status) {
    }
}
