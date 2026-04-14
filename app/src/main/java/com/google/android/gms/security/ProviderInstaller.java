package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.lang.reflect.Method;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = null;
    private static final Object zzb = null;
    private static Method zzc;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
    }

    private static Context zza(Context context) {
    }

    private static Context zzb(Context context) {
    }

    static /* synthetic */ GoogleApiAvailabilityLight zza() {
    }
}
