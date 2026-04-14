package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    private static final String FORWARD_SLASH_REGEX = null;
    private static final Pattern ID_PATTERN = null;
    static final String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    static final String PREFKEY_FIREBASE_IID = "firebase.installation.id";
    static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    static final String PREFKEY_LEGACY_INSTALLATION_UUID = "crashlytics.installation.id";
    private static final String SYNTHETIC_FID_PREFIX = "SYN_";
    private final Context appContext;
    private final String appIdentifier;
    private String crashlyticsInstallId;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final InstallerPackageNameProvider installerPackageNameProvider;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
    }

    private synchronized String createAndCacheCrashlyticsInstallId(String str, SharedPreferences sharedPreferences) {
    }

    static String createSyntheticFid() {
    }

    private String fetchTrueFid() {
    }

    private static String formatId(String str) {
    }

    static boolean isSyntheticFid(String str) {
    }

    private String readCachedCrashlyticsInstallId(SharedPreferences sharedPreferences) {
    }

    private String removeForwardSlashesIn(String str) {
    }

    public String getAppIdentifier() {
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    public synchronized String getCrashlyticsInstallId() {
    }

    public String getInstallerPackageName() {
    }

    public String getModelName() {
    }

    public String getOsBuildVersionString() {
    }

    public String getOsDisplayVersionString() {
    }
}
