package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class zzh implements ServiceConnection, zzj {
    private final Map<ServiceConnection, ServiceConnection> zza;
    private int zzb;
    private boolean zzc;
    private IBinder zzd;
    private final GmsClientSupervisor.zza zze;
    private ComponentName zzf;
    private final /* synthetic */ zzf zzg;

    public zzh(zzf zzfVar, GmsClientSupervisor.zza zzaVar) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void zza(String str) {
    }

    public final void zzb(String str) {
    }

    public final boolean zzc() {
    }

    public final IBinder zzd() {
    }

    public final ComponentName zze() {
    }

    public final int zzb() {
    }

    public final void zza(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
    }

    public final void zza(ServiceConnection serviceConnection, String str) {
    }

    public final boolean zza() {
    }

    public final boolean zza(ServiceConnection serviceConnection) {
    }
}
