package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private final Context zzb;
    private volatile String zzc;

    private GoogleSignatureVerifier(Context context) {
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context) {
    }

    public static boolean zza(PackageInfo packageInfo, boolean z) {
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
    }

    private final zzl zza(String str, int i) {
    }

    private final zzl zza(String str) {
    }

    private static zzd zza(PackageInfo packageInfo, zzd... zzdVarArr) {
    }
}
