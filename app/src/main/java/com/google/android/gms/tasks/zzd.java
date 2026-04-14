package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class zzd<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, zzr<TResult> {
    private final Executor zza;
    private final Continuation<TResult, Task<TContinuationResult>> zzb;
    private final zzu<TContinuationResult> zzc;

    public zzd(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation, zzu<TContinuationResult> zzuVar) {
    }

    static /* synthetic */ zzu zzb(zzd zzdVar) {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
    }

    @Override // com.google.android.gms.tasks.zzr
    public final void zza(Task<TResult> task) {
    }

    @Override // com.google.android.gms.tasks.zzr
    public final void zza() {
    }

    static /* synthetic */ Continuation zza(zzd zzdVar) {
    }
}
