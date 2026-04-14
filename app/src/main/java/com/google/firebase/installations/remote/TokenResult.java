package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class TokenResult {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TokenResult build();

        public abstract Builder setResponseCode(ResponseCode responseCode);

        public abstract Builder setToken(String str);

        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class ResponseCode {
        private static final /* synthetic */ ResponseCode[] $VALUES = null;
        public static final ResponseCode AUTH_ERROR = null;
        public static final ResponseCode BAD_CONFIG = null;
        public static final ResponseCode OK = null;

        private ResponseCode(String str, int i) {
        }

        public static ResponseCode valueOf(String str) {
        }

        public static ResponseCode[] values() {
        }
    }

    public static Builder builder() {
    }

    public abstract ResponseCode getResponseCode();

    public abstract String getToken();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();
}
