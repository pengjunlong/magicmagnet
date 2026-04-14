package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class GmsClientSupervisor {
    private static int zza = 129;
    private static final Object zzb = null;
    private static GmsClientSupervisor zzc;

    protected static final class zza {
        private static final Uri zzf = null;
        private final String zza;
        private final String zzb;
        private final ComponentName zzc;
        private final int zzd;
        private final boolean zze;

        public zza(String str, int i) {
        }

        public final boolean equals(Object obj) {
        }

        public final int hashCode() {
        }

        public final String toString() {
        }

        public final String zza() {
        }

        public final ComponentName zzb() {
        }

        public final int zzc() {
        }

        private zza(String str, String str2, int i) {
        }

        private final Intent zzb(Context context) {
        }

        public final Intent zza(Context context) {
        }

        public zza(String str, String str2, int i, boolean z) {
        }

        public zza(ComponentName componentName, int i) {
        }
    }

    @KeepForSdk
    public static int getDefaultBindFlags() {
    }

    @KeepForSdk
    public static GmsClientSupervisor getInstance(Context context) {
    }

    @KeepForSdk
    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
    }

    @KeepForSdk
    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
    }

    public final void zza(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
    }

    protected abstract boolean zza(zza zzaVar, ServiceConnection serviceConnection, String str);

    protected abstract void zzb(zza zzaVar, ServiceConnection serviceConnection, String str);

    @KeepForSdk
    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
    }

    @KeepForSdk
    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
    }
}
