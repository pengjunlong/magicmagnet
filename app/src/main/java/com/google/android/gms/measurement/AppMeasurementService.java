package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AppMeasurementService extends Service implements zzjp {
    private zzjq<AppMeasurementService> zza;

    private final zzjq<AppMeasurementService> zzd() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public final boolean zza(int i) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public final void zzb(JobParameters jobParameters, boolean z) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public final void zzc(Intent intent) {
    }
}
