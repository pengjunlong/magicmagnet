package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.File;
import org.json.JSONObject;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class PersistedInstallation {
    private static final String AUTH_TOKEN_KEY = "AuthToken";
    private static final String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final String FIS_ERROR_KEY = "FisError";
    private static final String PERSISTED_STATUS_KEY = "Status";
    private static final String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private final File dataFile;
    private final FirebaseApp firebaseApp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class RegistrationStatus {
        private static final /* synthetic */ RegistrationStatus[] $VALUES = null;
        public static final RegistrationStatus ATTEMPT_MIGRATION = null;
        public static final RegistrationStatus NOT_GENERATED = null;
        public static final RegistrationStatus REGISTERED = null;
        public static final RegistrationStatus REGISTER_ERROR = null;
        public static final RegistrationStatus UNREGISTERED = null;

        private RegistrationStatus(String str, int i) {
        }

        public static RegistrationStatus valueOf(String str) {
        }

        public static RegistrationStatus[] values() {
        }
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
    }

    private JSONObject readJSONFromFile() {
    }

    public void clearForTesting() {
    }

    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
    }
}
