package com.google.firebase.crashlytics.internal.unity;

import android.content.Context;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ResourceUnityVersionProvider implements UnityVersionProvider {
    private final Context context;
    private boolean hasRead;
    private String unityVersion;

    public ResourceUnityVersionProvider(Context context) {
    }

    @Override // com.google.firebase.crashlytics.internal.unity.UnityVersionProvider
    public String getUnityVersion() {
    }
}
