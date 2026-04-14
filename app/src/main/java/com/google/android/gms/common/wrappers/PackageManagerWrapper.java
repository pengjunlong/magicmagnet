package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class PackageManagerWrapper {
    private final Context zza;

    public PackageManagerWrapper(Context context) {
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(String str) {
    }

    @KeepForSdk
    public int checkPermission(String str, String str2) {
    }

    @KeepForSdk
    public ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @KeepForSdk
    public CharSequence getApplicationLabel(String str) throws PackageManager.NameNotFoundException {
    }

    @KeepForSdk
    public PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
    }

    public final PackageInfo zza(String str, int i, int i2) throws PackageManager.NameNotFoundException {
    }

    public final String[] zza(int i) {
    }

    @TargetApi(19)
    public final boolean zza(int i, String str) {
    }
}
