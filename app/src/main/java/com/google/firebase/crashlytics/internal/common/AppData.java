package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.internal.unity.UnityVersionProvider;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AppData {
    public final String buildId;
    public final String googleAppId;
    public final String installerPackageName;
    public final String packageName;
    public final UnityVersionProvider unityVersionProvider;
    public final String versionCode;
    public final String versionName;

    public AppData(String str, String str2, String str3, String str4, String str5, String str6, UnityVersionProvider unityVersionProvider) {
    }

    public static AppData create(Context context, IdManager idManager, String str, String str2, UnityVersionProvider unityVersionProvider) throws PackageManager.NameNotFoundException {
    }
}
