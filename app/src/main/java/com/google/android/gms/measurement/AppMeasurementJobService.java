package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;

@TargetApi(24)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AppMeasurementJobService extends JobService implements zzjp {
    private zzjq<AppMeasurementJobService> zza;

    private final zzjq<AppMeasurementJobService> zzd() {
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public final boolean zza(int i) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    @TargetApi(24)
    public final void zzb(JobParameters jobParameters, boolean z) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public final void zzc(Intent intent) {
    }
}
