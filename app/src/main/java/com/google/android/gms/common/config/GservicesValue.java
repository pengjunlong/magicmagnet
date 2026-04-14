package com.google.android.gms.common.config;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class GservicesValue<T> {
    private static final Object zzc = null;
    private static zza zzd;
    private static int zze;
    private static Context zzf;
    private static Set<String> zzg;
    protected final String zza;
    protected final T zzb;
    private T zzh;

    private interface zza {
        Boolean zza(String str, Boolean bool);

        Float zza(String str, Float f);

        Integer zza(String str, Integer num);

        Long zza(String str, Long l);

        String zza(String str, String str2);
    }

    protected GservicesValue(String str, T t) {
    }

    @KeepForSdk
    public static boolean isInitialized() {
    }

    @KeepForSdk
    public static GservicesValue<Boolean> value(String str, boolean z) {
    }

    private static boolean zza() {
    }

    @KeepForSdk
    public final T get() {
    }

    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
    }

    @VisibleForTesting
    @KeepForSdk
    public void override(T t) {
    }

    @VisibleForTesting
    @KeepForSdk
    public void resetOverride() {
    }

    protected abstract T zza(String str);

    @KeepForSdk
    public static GservicesValue<Long> value(String str, Long l) {
    }

    @KeepForSdk
    public static GservicesValue<Integer> value(String str, Integer num) {
    }

    @KeepForSdk
    public static GservicesValue<Float> value(String str, Float f) {
    }

    @KeepForSdk
    public static GservicesValue<String> value(String str, String str2) {
    }
}
