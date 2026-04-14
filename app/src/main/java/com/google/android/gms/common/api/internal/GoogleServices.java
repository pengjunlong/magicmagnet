package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class GoogleServices {
    private static final Object zza = null;
    private static GoogleServices zzb;
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(Context context) {
    }

    @KeepForSdk
    private static GoogleServices checkInitialized(String str) {
    }

    @VisibleForTesting
    @KeepForSdk
    static void clearInstanceForTest() {
    }

    @KeepForSdk
    public static String getGoogleAppId() {
    }

    @KeepForSdk
    public static Status initialize(Context context, String str, boolean z) {
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
    }

    @VisibleForTesting
    @KeepForSdk
    final Status checkGoogleAppId(String str) {
    }

    @KeepForSdk
    public static Status initialize(Context context) {
    }

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(String str, boolean z) {
    }
}
