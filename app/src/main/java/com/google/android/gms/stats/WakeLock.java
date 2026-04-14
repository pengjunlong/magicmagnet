package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

@ShowFirstParty
@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class WakeLock {
    private static ScheduledExecutorService zzn;
    private static volatile zza zzo;
    private final Object zza;
    private final PowerManager.WakeLock zzb;
    private WorkSource zzc;
    private final int zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final Context zzh;
    private boolean zzi;
    private final Map<String, Integer[]> zzj;
    private final Set<Future<?>> zzk;
    private int zzl;
    private AtomicInteger zzm;

    public interface zza {
    }

    @KeepForSdk
    public WakeLock(Context context, int i, String str) {
    }

    private final List<String> zza() {
    }

    @KeepForSdk
    public void acquire(long j) {
    }

    @KeepForSdk
    public boolean isHeld() {
    }

    @KeepForSdk
    public void release() {
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
    }

    private final void zza(int i) {
    }

    private WakeLock(Context context, int i, String str, String str2, String str3) {
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private WakeLock(Context context, int i, String str, String str2, String str3, String str4) {
    }

    private final String zza(String str) {
    }

    static /* synthetic */ void zza(WakeLock wakeLock, int i) {
    }
}
