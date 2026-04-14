package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Utils {
    private static final Pattern API_KEY_FORMAT = null;
    private static final String APP_ID_IDENTIFICATION_SUBSTRING = ":";
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = 0;
    private static Utils singleton;
    private final Clock clock;

    private Utils(Clock clock) {
    }

    public static Utils getInstance() {
    }

    static boolean isValidApiKeyFormat(String str) {
    }

    static boolean isValidAppIdFormat(String str) {
    }

    public long currentTimeInMillis() {
    }

    public long currentTimeInSecs() {
    }

    public long getRandomDelayForSyncPrevention() {
    }

    public boolean isAuthTokenExpired(PersistedInstallationEntry persistedInstallationEntry) {
    }

    public static Utils getInstance(Clock clock) {
    }
}
