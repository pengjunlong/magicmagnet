package com.google.firebase;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.internal.DataCollectionConfigStorage;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FirebaseApp {
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_COMMON = "fire-core";
    static final Map<String, FirebaseApp> INSTANCES = null;
    private static final String KOTLIN = "kotlin";
    private static final Object LOCK = null;
    private static final String LOG_TAG = "FirebaseApp";
    private static final Executor UI_EXECUTOR = null;
    private final Context applicationContext;
    private final AtomicBoolean automaticResourceManagementEnabled;
    private final List<BackgroundStateChangeListener> backgroundStateChangeListeners;
    private final ComponentRuntime componentRuntime;
    private final Lazy<DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final AtomicBoolean deleted;
    private final List<FirebaseAppLifecycleListener> lifecycleListeners;
    private final String name;
    private final FirebaseOptions options;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    private static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<GlobalBackgroundStateListener> INSTANCE;

        private GlobalBackgroundStateListener() {
        }

        static /* synthetic */ void access$100(Context context) {
        }

        private static void ensureBackgroundStateListenerRegistered(Context context) {
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
        }
    }

    private static class UiExecutor implements Executor {
        private static final Handler HANDLER = null;

        private UiExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }

        /* synthetic */ UiExecutor(C10791 c10791) {
        }
    }

    @TargetApi(24)
    private static class UserUnlockReceiver extends BroadcastReceiver {
        private static AtomicReference<UserUnlockReceiver> INSTANCE;
        private final Context applicationContext;

        public UserUnlockReceiver(Context context) {
        }

        static /* synthetic */ void access$200(Context context) {
        }

        private static void ensureReceiverRegistered(Context context) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public void unregister() {
        }
    }

    protected FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
    }

    static /* synthetic */ Object access$300() {
    }

    static /* synthetic */ void access$400(FirebaseApp firebaseApp) {
    }

    static /* synthetic */ AtomicBoolean access$500(FirebaseApp firebaseApp) {
    }

    static /* synthetic */ void access$600(FirebaseApp firebaseApp, boolean z) {
    }

    private void checkNotDeleted() {
    }

    public static void clearInstancesForTest() {
    }

    public static /* synthetic */ DataCollectionConfigStorage dbpqdHhmDSIHIJiwc1ll1l1(FirebaseApp firebaseApp, Context context) {
    }

    private static List<String> getAllAppNames() {
    }

    public static List<FirebaseApp> getApps(Context context) {
    }

    public static FirebaseApp getInstance() {
    }

    private void initializeAllApis() {
    }

    public static FirebaseApp initializeApp(Context context) {
    }

    private /* synthetic */ DataCollectionConfigStorage lambda$new$0(Context context) {
    }

    private static String normalize(String str) {
    }

    private void notifyBackgroundStateChangeListeners(boolean z) {
    }

    private void notifyOnAppDeleted() {
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
    }

    @KeepForSdk
    public void addLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
    }

    public void delete() {
    }

    public boolean equals(Object obj) {
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
    }

    public Context getApplicationContext() {
    }

    public String getName() {
    }

    public FirebaseOptions getOptions() {
    }

    @KeepForSdk
    public String getPersistenceKey() {
    }

    public int hashCode() {
    }

    void initializeAllComponents() {
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
    }

    @KeepForSdk
    public boolean isDefaultApp() {
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
    }

    @KeepForSdk
    public void removeLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean bool) {
    }

    public String toString() {
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
    }

    public static FirebaseApp getInstance(String str) {
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions) {
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions, String str) {
    }
}
