package com.google.firebase.crashlytics.internal.settings.model;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AppSettingsData {
    public static final String STATUS_ACTIVATED = "activated";
    public static final String STATUS_CONFIGURED = "configured";
    public static final String STATUS_NEW = "new";
    public final String bundleId;
    public final int nativeReportUploadVariant;
    public final String ndkReportsUrl;
    public final String organizationId;
    public final int reportUploadVariant;
    public final String reportsUrl;
    public final String status;
    public final boolean updateRequired;
    public final String url;

    public AppSettingsData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, int i2) {
    }

    public AppSettingsData(String str, String str2, String str3, String str4, boolean z) {
    }
}
