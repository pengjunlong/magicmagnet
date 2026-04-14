package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class WakeLockTracker {
    private static WakeLockTracker zza;
    private static Boolean zzb;

    @VisibleForTesting
    private static boolean zzc;

    @KeepForSdk
    public static WakeLockTracker getInstance() {
    }

    private static void zza(Context context, WakeLockEvent wakeLockEvent) {
    }

    @KeepForSdk
    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i, String str4) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i, List<String> list, boolean z, long j) {
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
    }

    @KeepForSdk
    public void registerReleaseEvent(Context context, Intent intent) {
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
    }

    private static boolean zza() {
    }
}
