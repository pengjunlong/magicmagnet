package com.google.firebase.crashlytics.internal.settings.model;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class SettingsData implements Settings {
    public final AppSettingsData appData;
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final FeaturesSettingsData featuresData;
    public final SessionSettingsData sessionData;
    public final int settingsVersion;

    public SettingsData(long j, AppSettingsData appSettingsData, SessionSettingsData sessionSettingsData, FeaturesSettingsData featuresSettingsData, int i, int i2) {
    }

    public AppSettingsData getAppSettingsData() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.model.Settings
    public int getCacheDuration() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.model.Settings
    public long getExpiresAtMillis() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.model.Settings
    public FeaturesSettingsData getFeaturesData() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.model.Settings
    public SessionSettingsData getSessionData() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.model.Settings
    public int getSettingsVersion() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.model.Settings
    public boolean isExpired(long j) {
    }
}
