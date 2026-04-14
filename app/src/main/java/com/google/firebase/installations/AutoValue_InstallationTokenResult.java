package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    static final class Builder extends InstallationTokenResult.Builder {
        private String token;
        private Long tokenCreationTimestamp;
        private Long tokenExpirationTimestamp;

        /* synthetic */ Builder(InstallationTokenResult installationTokenResult, C11531 c11531) {
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
        }

        Builder() {
        }

        private Builder(InstallationTokenResult installationTokenResult) {
        }
    }

    /* synthetic */ AutoValue_InstallationTokenResult(String str, long j, long j2, C11531 c11531) {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public String getToken() {
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenCreationTimestamp() {
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenExpirationTimestamp() {
    }

    public int hashCode() {
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
    }

    public String toString() {
    }

    private AutoValue_InstallationTokenResult(String str, long j, long j2) {
    }
}
