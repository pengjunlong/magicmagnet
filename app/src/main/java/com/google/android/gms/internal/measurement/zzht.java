package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class zzht<T> {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = null;
    private static volatile zzhs zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference<Collection<zzht<?>>> zzg = null;
    private static final zzhv zzh = null;
    private static final AtomicInteger zzj = null;
    final zzhr zza;
    final String zzb;
    private final T zzi;
    private volatile int zzk;
    private volatile T zzl;
    private final boolean zzm;

    /* synthetic */ zzht(zzhr zzhrVar, String str, Object obj, boolean z, zzhn zzhnVar) {
    }

    @Deprecated
    public static void zzb(Context context) {
    }

    static void zzc() {
    }

    abstract T zza(Object obj);

    public final String zzd() {
    }

    public final T zze() {
    }
}
