package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class zzfp<V> extends FutureTask<V> implements Comparable<zzfp<V>> {
    final boolean zza;
    final /* synthetic */ zzfr zzb;
    private final long zzc;
    private final String zzd;

    zzfp(zzfr zzfrVar, Runnable runnable, boolean z, String str) {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
    }

    zzfp(zzfr zzfrVar, Callable<V> callable, boolean z, String str) {
    }
}
