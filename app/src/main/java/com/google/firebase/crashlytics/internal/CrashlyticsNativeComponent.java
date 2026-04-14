package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface CrashlyticsNativeComponent {
    void finalizeSession(String str);

    NativeSessionFileProvider getSessionFileProvider(String str);

    boolean hasCrashDataForSession(String str);

    void openSession(String str, String str2, long j, StaticSessionData staticSessionData);
}
