package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class AutoValue_TokenResult extends TokenResult {
    private final TokenResult.ResponseCode responseCode;
    private final String token;
    private final long tokenExpirationTimestamp;

    static final class Builder extends TokenResult.Builder {
        private TokenResult.ResponseCode responseCode;
        private String token;
        private Long tokenExpirationTimestamp;

        /* synthetic */ Builder(TokenResult tokenResult, C11611 c11611) {
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult build() {
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setToken(String str) {
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setTokenExpirationTimestamp(long j) {
        }

        Builder() {
        }

        private Builder(TokenResult tokenResult) {
        }
    }

    /* synthetic */ AutoValue_TokenResult(String str, long j, TokenResult.ResponseCode responseCode, C11611 c11611) {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.ResponseCode getResponseCode() {
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String getToken() {
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long getTokenExpirationTimestamp() {
    }

    public int hashCode() {
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder toBuilder() {
    }

    public String toString() {
    }

    private AutoValue_TokenResult(String str, long j, TokenResult.ResponseCode responseCode) {
    }
}
