package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CrashlyticsCore {
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_STACK_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    public final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private CrashlyticsController controller;
    private final ExecutorService crashHandlerExecutor;
    private CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final IdManager idManager;
    private CrashlyticsFileMarker initializationMarker;
    private final CrashlyticsNativeComponent nativeComponent;
    private final long startTime;

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$1 */
    class CallableC11081 implements Callable<Task<Void>> {
        final /* synthetic */ CrashlyticsCore this$0;
        final /* synthetic */ SettingsDataProvider val$settingsProvider;

        CallableC11081(CrashlyticsCore crashlyticsCore, SettingsDataProvider settingsDataProvider) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Task<Void> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Task<Void> call() throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$2 */
    class RunnableC11092 implements Runnable {
        final /* synthetic */ CrashlyticsCore this$0;
        final /* synthetic */ SettingsDataProvider val$settingsDataProvider;

        RunnableC11092(CrashlyticsCore crashlyticsCore, SettingsDataProvider settingsDataProvider) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$3 */
    class CallableC11103 implements Callable<Boolean> {
        final /* synthetic */ CrashlyticsCore this$0;

        CallableC11103(CrashlyticsCore crashlyticsCore) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Boolean call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$4 */
    class CallableC11114 implements Callable<Boolean> {
        final /* synthetic */ CrashlyticsCore this$0;

        CallableC11114(CrashlyticsCore crashlyticsCore) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Boolean call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
        }
    }

    private static final class LogFileDirectoryProvider implements LogFileManager.DirectoryProvider {
        private static final String LOG_FILES_DIR = "log-files";
        private final FileStore rootFileStore;

        public LogFileDirectoryProvider(FileStore fileStore) {
        }

        @Override // com.google.firebase.crashlytics.internal.log.LogFileManager.DirectoryProvider
        public File getLogFileDir() {
        }
    }

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, ExecutorService executorService) {
    }

    static /* synthetic */ Task access$000(CrashlyticsCore crashlyticsCore, SettingsDataProvider settingsDataProvider) {
    }

    static /* synthetic */ CrashlyticsFileMarker access$100(CrashlyticsCore crashlyticsCore) {
    }

    static /* synthetic */ CrashlyticsController access$200(CrashlyticsCore crashlyticsCore) {
    }

    private void checkForPreviousCrash() {
    }

    private Task<Void> doBackgroundInitialization(SettingsDataProvider settingsDataProvider) {
    }

    private void finishInitSynchronously(SettingsDataProvider settingsDataProvider) {
    }

    public static String getVersion() {
    }

    static boolean isBuildIdValid(String str, boolean z) {
    }

    public Task<Boolean> checkForUnsentReports() {
    }

    public Task<Void> deleteUnsentReports() {
    }

    public boolean didCrashOnPreviousExecution() {
    }

    boolean didPreviousInitializationFail() {
    }

    public Task<Void> doBackgroundInitializationAsync(SettingsDataProvider settingsDataProvider) {
    }

    CrashlyticsController getController() {
    }

    public void log(String str) {
    }

    public void logException(Throwable th) {
    }

    void markInitializationComplete() {
    }

    void markInitializationStarted() {
    }

    public boolean onPreExecute(AppData appData, SettingsDataProvider settingsDataProvider) {
    }

    public Task<Void> sendUnsentReports() {
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
    }

    public void setCustomKey(String str, String str2) {
    }

    public void setCustomKeys(Map<String, String> map) {
    }

    public void setInternalKey(String str, String str2) {
    }

    public void setUserId(String str) {
    }
}
