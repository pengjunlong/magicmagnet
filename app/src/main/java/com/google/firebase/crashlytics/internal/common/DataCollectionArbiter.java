package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class DataCollectionArbiter {
    private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    private Boolean crashlyticsDataCollectionEnabled;
    TaskCompletionSource<Void> dataCollectionEnabledTask;
    private final TaskCompletionSource<Void> dataCollectionExplicitlyApproved;
    private final FirebaseApp firebaseApp;
    private boolean setInManifest;
    private final SharedPreferences sharedPreferences;
    private final Object taskLock;
    boolean taskResolved;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
    }

    private Boolean getDataCollectionValueFromManifest(Context context) {
    }

    private Boolean getDataCollectionValueFromSharedPreferences() {
    }

    private void logDataCollectionState(boolean z) {
    }

    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context context) {
    }

    @SuppressLint({"ApplySharedPref"})
    private static void storeDataCollectionValueInSharedPreferences(SharedPreferences sharedPreferences, Boolean bool) {
    }

    public void grantDataCollectionPermission(boolean z) {
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(Boolean bool) {
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
    }

    public Task<Void> waitForDataCollectionPermission() {
    }
}
