package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class LibraryVersion {
    private static final GmsLogger zza = null;
    private static LibraryVersion zzb;
    private ConcurrentHashMap<String, String> zzc;

    @VisibleForTesting
    protected LibraryVersion() {
    }

    @KeepForSdk
    public static LibraryVersion getInstance() {
    }

    @KeepForSdk
    public String getVersion(String str) {
    }
}
