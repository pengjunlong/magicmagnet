package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Callable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";
    final CrashlyticsCore core;

    /* renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$1 */
    class C10911 implements Continuation<Void, Object> {
        C10911() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task<Void> task) throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$2 */
    class CallableC10922 implements Callable<Void> {
        final /* synthetic */ CrashlyticsCore val$core;
        final /* synthetic */ boolean val$finishCoreInBackground;
        final /* synthetic */ SettingsController val$settingsController;

        CallableC10922(boolean z, CrashlyticsCore crashlyticsCore, SettingsController settingsController) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() throws Exception {
        }
    }

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
    }

    public static FirebaseCrashlytics getInstance() {
    }

    static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Deferred<CrashlyticsNativeComponent> deferred, Deferred<AnalyticsConnector> deferred2) {
    }

    public Task<Boolean> checkForUnsentReports() {
    }

    public void deleteUnsentReports() {
    }

    public boolean didCrashOnPreviousExecution() {
    }

    public void log(String str) {
    }

    public void recordException(Throwable th) {
    }

    public void sendUnsentReports() {
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
    }

    public void setCustomKey(String str, boolean z) {
    }

    public void setCustomKeys(CustomKeysAndValues customKeysAndValues) {
    }

    public void setUserId(String str) {
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
    }

    public void setCustomKey(String str, double d) {
    }

    public void setCustomKey(String str, float f) {
    }

    public void setCustomKey(String str, int i) {
    }

    public void setCustomKey(String str, long j) {
    }

    public void setCustomKey(String str, String str2) {
    }
}
