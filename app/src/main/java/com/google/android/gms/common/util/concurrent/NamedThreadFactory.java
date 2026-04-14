package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class NamedThreadFactory implements ThreadFactory {
    private final String zza;
    private final int zzb;
    private final ThreadFactory zzc;

    @KeepForSdk
    public NamedThreadFactory(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
    }

    private NamedThreadFactory(String str, int i) {
    }
}
