package com.google.android.gms.tasks;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Tasks {

    interface zza extends OnCanceledListener, OnFailureListener, OnSuccessListener<Object> {
    }

    private static final class zzb implements zza {
        private final CountDownLatch zza;

        private zzb() {
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(Object obj) {
        }

        public final void zza() throws InterruptedException {
        }

        public final boolean zza(long j, TimeUnit timeUnit) throws InterruptedException {
        }

        /* synthetic */ zzb(zzy zzyVar) {
        }
    }

    private static final class zzc implements zza {
        private final Object zza;
        private final int zzb;
        private final zzu<Void> zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private Exception zzg;
        private boolean zzh;

        public zzc(int i, zzu<Void> zzuVar) {
        }

        private final void zza() {
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(Object obj) {
        }
    }

    private Tasks() {
    }

    public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
    }

    public static <TResult> Task<TResult> forCanceled() {
    }

    public static <TResult> Task<TResult> forException(Exception exc) {
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
    }

    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task<?>> collection) {
    }

    private static <TResult> TResult zza(Task<TResult> task) throws ExecutionException {
    }

    public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
    }

    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Task<?>... taskArr) {
    }

    private static void zza(Task<?> task, zza zzaVar) {
    }

    public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
    }

    public static Task<Void> whenAll(Task<?>... taskArr) {
    }
}
