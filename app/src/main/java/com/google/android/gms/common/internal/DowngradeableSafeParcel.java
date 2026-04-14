package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = null;
    private static ClassLoader zzb;
    private static Integer zzc;
    private boolean zzd;

    @KeepForSdk
    protected static boolean canUnparcelSafely(String str) {
    }

    @KeepForSdk
    protected static Integer getUnparcelClientVersion() {
    }

    private static ClassLoader zza() {
    }

    @KeepForSdk
    protected abstract boolean prepareForClientVersion(int i);

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
    }

    @KeepForSdk
    protected boolean shouldDowngrade() {
    }
}
