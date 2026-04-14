package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.security.MessageDigest;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class AndroidUtilsLight {
    private static volatile int zza = -1;

    @KeepForSdk
    @TargetApi(24)
    @Deprecated
    public static Context getDeviceProtectedStorageContext(Context context) {
    }

    @KeepForSdk
    public static byte[] getPackageCertificateHashBytes(Context context, String str) throws PackageManager.NameNotFoundException {
    }

    public static MessageDigest zza(String str) {
    }
}
