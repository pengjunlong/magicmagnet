package com.google.firebase.installations.local;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.PersistedInstallation;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class PersistedInstallationEntry {
    public static PersistedInstallationEntry INSTANCE;

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PersistedInstallationEntry build();

        public abstract Builder setAuthToken(String str);

        public abstract Builder setExpiresInSecs(long j);

        public abstract Builder setFirebaseInstallationId(String str);

        public abstract Builder setFisError(String str);

        public abstract Builder setRefreshToken(String str);

        public abstract Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus);

        public abstract Builder setTokenCreationEpochInSecs(long j);
    }

    public static Builder builder() {
    }

    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    public abstract String getFirebaseInstallationId();

    public abstract String getFisError();

    public abstract String getRefreshToken();

    public abstract PersistedInstallation.RegistrationStatus getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
    }

    public boolean isNotGenerated() {
    }

    public boolean isRegistered() {
    }

    public boolean isUnregistered() {
    }

    public boolean shouldAttemptMigration() {
    }

    public abstract Builder toBuilder();

    public PersistedInstallationEntry withAuthToken(String str, long j, long j2) {
    }

    public PersistedInstallationEntry withClearedAuthToken() {
    }

    public PersistedInstallationEntry withFisError(String str) {
    }

    public PersistedInstallationEntry withNoGeneratedFid() {
    }

    public PersistedInstallationEntry withRegisteredFid(String str, String str2, long j, String str3, long j2) {
    }

    public PersistedInstallationEntry withUnregisteredFid(String str) {
    }
}
