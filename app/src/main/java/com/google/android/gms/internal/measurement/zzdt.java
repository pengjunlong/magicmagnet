package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class zzdt implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzee zzk;

    zzdt(zzee zzeeVar, boolean z) {
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    abstract void zza() throws RemoteException;

    protected void zzb() {
    }
}
