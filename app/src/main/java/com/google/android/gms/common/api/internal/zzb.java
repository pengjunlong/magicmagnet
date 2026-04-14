package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class zzb extends Fragment implements LifecycleFragment {
    private static WeakHashMap<Activity, WeakReference<zzb>> zza;
    private Map<String, LifecycleCallback> zzb;
    private int zzc;
    private Bundle zzd;

    public static zzb zza(Activity activity) {
    }

    static /* synthetic */ Bundle zzb(zzb zzbVar) {
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity getLifecycleActivity() {
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
    }

    @Override // android.app.Fragment
    public final void onResume() {
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // android.app.Fragment
    public final void onStart() {
    }

    @Override // android.app.Fragment
    public final void onStop() {
    }

    static /* synthetic */ int zza(zzb zzbVar) {
    }
}
