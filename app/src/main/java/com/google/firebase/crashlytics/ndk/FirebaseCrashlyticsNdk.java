package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class FirebaseCrashlyticsNdk implements CrashlyticsNativeComponent {
    private static final String FILES_PATH = ".com.google.firebase.crashlytics-ndk";
    private final CrashpadController controller;

    FirebaseCrashlyticsNdk(CrashpadController crashpadController) {
    }

    static FirebaseCrashlyticsNdk create(Context context) {
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void finalizeSession(String str) {
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public NativeSessionFileProvider getSessionFileProvider(String str) {
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(String str) {
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void openSession(String str, String str2, long j, StaticSessionData staticSessionData) {
    }
}
