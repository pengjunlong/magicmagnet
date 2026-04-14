package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DynamiteModule {

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;

    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = null;

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = null;

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = null;
    private static Boolean zza = null;
    private static zzk zzb = null;
    private static zzm zzc = null;
    private static String zzd = null;
    private static int zze = -1;
    private static final ThreadLocal<zza> zzf = null;
    private static final VersionPolicy.zzb zzg = null;
    private static final VersionPolicy zzh = null;
    private final Context zzi;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        private LoadingException(String str) {
        }

        private LoadingException(String str, Throwable th) {
        }

        /* synthetic */ LoadingException(String str, com.google.android.gms.dynamite.zzb zzbVar) {
        }

        /* synthetic */ LoadingException(String str, Throwable th, com.google.android.gms.dynamite.zzb zzbVar) {
        }
    }

    public interface VersionPolicy {

        public static class zza {
            public int zza;
            public int zzb;
            public int zzc;
        }

        public interface zzb {
            int zza(Context context, String str);

            int zza(Context context, String str, boolean z) throws LoadingException;
        }

        zza zza(Context context, String str, zzb zzbVar) throws LoadingException;
    }

    private static class zza {
        public Cursor zza;

        private zza() {
        }

        /* synthetic */ zza(com.google.android.gms.dynamite.zzb zzbVar) {
        }
    }

    private static class zzb implements VersionPolicy.zzb {
        private final int zza;
        private final int zzb;

        public zzb(int i, int i2) {
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb
        public final int zza(Context context, String str) {
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb
        public final int zza(Context context, String str, boolean z) {
        }
    }

    private DynamiteModule(Context context) {
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
    }

    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
    }

    public static int zza(Context context, String str, boolean z) {
    }

    private static int zzb(Context context, String str, boolean z) {
    }

    private static int zzc(Context context, String str, boolean z) throws LoadingException {
    }

    @KeepForSdk
    public final Context getModuleContext() {
    }

    @KeepForSdk
    public final IBinder instantiate(String str) throws LoadingException {
    }

    private static DynamiteModule zzb(Context context, String str, int i) throws LoadingException, RemoteException {
    }

    private static DynamiteModule zza(Context context, String str) {
    }

    private static DynamiteModule zza(Context context, String str, int i) throws LoadingException {
    }

    private static zzk zza(Context context) {
    }

    private static Boolean zza() {
    }

    private static void zza(ClassLoader classLoader) throws LoadingException {
    }
}
