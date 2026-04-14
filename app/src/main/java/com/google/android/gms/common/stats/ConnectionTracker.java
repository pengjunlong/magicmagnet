package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zzo;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ConnectionTracker {
    private static final Object zza = null;
    private static volatile ConnectionTracker zzb = null;

    @VisibleForTesting
    private static boolean zzc = false;
    private static zzo<Boolean> zzd;

    @VisibleForTesting
    private ConcurrentHashMap<ServiceConnection, ServiceConnection> zze;

    private ConnectionTracker() {
    }

    @KeepForSdk
    public static ConnectionTracker getInstance() {
    }

    static final /* synthetic */ boolean zza() {
    }

    @KeepForSdk
    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
    }

    @KeepForSdk
    @SuppressLint({"UntrackedBindService"})
    public void unbindService(Context context, ServiceConnection serviceConnection) {
    }

    @KeepForSdk
    @SuppressLint({"UntrackedBindService"})
    public void unbindServiceSafe(Context context, ServiceConnection serviceConnection) {
    }

    public final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
    }

    @SuppressLint({"UntrackedBindService"})
    private final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
    }

    private static boolean zza(ServiceConnection serviceConnection) {
    }

    @SuppressLint({"UntrackedBindService"})
    private static void zza(Context context, ServiceConnection serviceConnection) {
    }
}
