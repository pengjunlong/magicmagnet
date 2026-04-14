package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DeviceProperties {
    private static Boolean zza;
    private static Boolean zzb;
    private static Boolean zzc;
    private static Boolean zzd;
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzg;
    private static Boolean zzh;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(Context context) {
    }

    @KeepForSdk
    @Deprecated
    public static boolean isFeaturePhone(Context context) {
    }

    @KeepForSdk
    public static boolean isLatchsky(Context context) {
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean isSidewinder(Context context) {
    }

    @KeepForSdk
    public static boolean isTablet(Resources resources) {
    }

    @KeepForSdk
    public static boolean isTv(Context context) {
    }

    @KeepForSdk
    public static boolean isUserBuild() {
    }

    @KeepForSdk
    @TargetApi(20)
    public static boolean isWearable(Context context) {
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(Context context) {
    }

    public static boolean zza(Context context) {
    }

    @TargetApi(21)
    private static boolean zzb(Context context) {
    }

    @KeepForSdk
    public static boolean isAuto(PackageManager packageManager) {
    }

    @KeepForSdk
    public static boolean isTv(PackageManager packageManager) {
    }

    @KeepForSdk
    @TargetApi(20)
    public static boolean isWearable(PackageManager packageManager) {
    }
}
