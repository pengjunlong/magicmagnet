package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CrashlyticsController {
    static final FilenameFilter APP_EXCEPTION_MARKER_FILTER = null;
    static final String APP_EXCEPTION_MARKER_PREFIX = ".ae";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    static final String NATIVE_SESSION_DIR = "native-sessions";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final AppData appData;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    final AtomicBoolean checkForUnsentReportsCalled;
    private final Context context;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FileStore fileStore;
    private final IdManager idManager;
    private final LogFileManager.DirectoryProvider logFileDirectoryProvider;
    private final LogFileManager logFileManager;
    private final CrashlyticsNativeComponent nativeComponent;
    final TaskCompletionSource<Boolean> reportActionProvided;
    private final SessionReportingCoordinator reportingCoordinator;
    private final String unityVersion;
    final TaskCompletionSource<Boolean> unsentReportsAvailable;
    final TaskCompletionSource<Void> unsentReportsHandled;
    private final UserMetadata userMetadata;

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$1 */
    class C10991 implements CrashlyticsUncaughtExceptionHandler.CrashListener {
        final /* synthetic */ CrashlyticsController this$0;

        C10991(CrashlyticsController crashlyticsController) {
        }

        @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
        public void onUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th) {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$10, reason: invalid class name */
    class AnonymousClass10 implements Callable<Void> {
        final /* synthetic */ CrashlyticsController this$0;
        final /* synthetic */ long val$timestamp;

        AnonymousClass10(CrashlyticsController crashlyticsController, long j) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$2 */
    class CallableC11002 implements Callable<Task<Void>> {
        final /* synthetic */ CrashlyticsController this$0;
        final /* synthetic */ Throwable val$ex;
        final /* synthetic */ SettingsDataProvider val$settingsDataProvider;
        final /* synthetic */ Thread val$thread;
        final /* synthetic */ long val$timestampMillis;

        /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$2$1, reason: invalid class name */
        class AnonymousClass1 implements SuccessContinuation<AppSettingsData, Void> {
            final /* synthetic */ CallableC11002 this$1;
            final /* synthetic */ Executor val$executor;

            AnonymousClass1(CallableC11002 callableC11002, Executor executor) {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public /* bridge */ /* synthetic */ Task<Void> then(AppSettingsData appSettingsData) throws Exception {
            }

            /* renamed from: then, reason: avoid collision after fix types in other method */
            public Task<Void> then2(AppSettingsData appSettingsData) throws Exception {
            }
        }

        CallableC11002(CrashlyticsController crashlyticsController, long j, Throwable th, Thread thread, SettingsDataProvider settingsDataProvider) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Task<Void> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Task<Void> call() throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$3 */
    class C11013 implements SuccessContinuation<Void, Boolean> {
        final /* synthetic */ CrashlyticsController this$0;

        C11013(CrashlyticsController crashlyticsController) {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public /* bridge */ /* synthetic */ Task<Boolean> then(Void r1) throws Exception {
        }

        /* renamed from: then, reason: avoid collision after fix types in other method */
        public Task<Boolean> then2(Void r1) throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4 */
    class C11024 implements SuccessContinuation<Boolean, Void> {
        final /* synthetic */ CrashlyticsController this$0;
        final /* synthetic */ Task val$appSettingsDataTask;

        /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4$1, reason: invalid class name */
        class AnonymousClass1 implements Callable<Task<Void>> {
            final /* synthetic */ C11024 this$1;
            final /* synthetic */ Boolean val$send;

            /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4$1$1, reason: invalid class name and collision with other inner class name */
            class C20081 implements SuccessContinuation<AppSettingsData, Void> {
                final /* synthetic */ AnonymousClass1 this$2;
                final /* synthetic */ Executor val$executor;

                C20081(AnonymousClass1 anonymousClass1, Executor executor) {
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public /* bridge */ /* synthetic */ Task<Void> then(AppSettingsData appSettingsData) throws Exception {
                }

                /* renamed from: then, reason: avoid collision after fix types in other method */
                public Task<Void> then2(AppSettingsData appSettingsData) throws Exception {
                }
            }

            AnonymousClass1(C11024 c11024, Boolean bool) {
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Task<Void> call() throws Exception {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Task<Void> call() throws Exception {
            }
        }

        C11024(CrashlyticsController crashlyticsController, Task task) {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public /* bridge */ /* synthetic */ Task<Void> then(Boolean bool) throws Exception {
        }

        /* renamed from: then, reason: avoid collision after fix types in other method */
        public Task<Void> then2(Boolean bool) throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$5 */
    class CallableC11035 implements Callable<Void> {
        final /* synthetic */ CrashlyticsController this$0;
        final /* synthetic */ String val$msg;
        final /* synthetic */ long val$timestamp;

        CallableC11035(CrashlyticsController crashlyticsController, long j, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$6 */
    class RunnableC11046 implements Runnable {
        final /* synthetic */ CrashlyticsController this$0;
        final /* synthetic */ Throwable val$ex;
        final /* synthetic */ Thread val$thread;
        final /* synthetic */ long val$timestampMillis;

        RunnableC11046(CrashlyticsController crashlyticsController, long j, Throwable th, Thread thread) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$7 */
    class CallableC11057 implements Callable<Void> {
        final /* synthetic */ CrashlyticsController this$0;
        final /* synthetic */ UserMetadata val$userMetaData;

        CallableC11057(CrashlyticsController crashlyticsController, UserMetadata userMetadata) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$8 */
    class CallableC11068 implements Callable<Void> {
        final /* synthetic */ CrashlyticsController this$0;
        final /* synthetic */ boolean val$isInternal;
        final /* synthetic */ Map val$keyData;

        CallableC11068(CrashlyticsController crashlyticsController, Map map, boolean z) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() throws Exception {
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$9 */
    class CallableC11079 implements Callable<Void> {
        final /* synthetic */ CrashlyticsController this$0;

        CallableC11079(CrashlyticsController crashlyticsController) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() throws Exception {
        }
    }

    CrashlyticsController(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, LogFileManager.DirectoryProvider directoryProvider, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger) {
    }

    static /* synthetic */ long access$000(long j) {
    }

    static /* synthetic */ String access$100(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ LogFileManager access$1000(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ AnalyticsEventLogger access$1100(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ CrashlyticsFileMarker access$200(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ SessionReportingCoordinator access$300(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ void access$400(CrashlyticsController crashlyticsController, long j) {
    }

    static /* synthetic */ void access$500(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ DataCollectionArbiter access$600(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ CrashlyticsBackgroundWorker access$700(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ Task access$800(CrashlyticsController crashlyticsController) {
    }

    static /* synthetic */ void access$900(File[] fileArr) {
    }

    private void cacheKeyData(Map<String, String> map, boolean z) {
    }

    private void cacheUserData(UserMetadata userMetadata) {
    }

    private static StaticSessionData.AppData createAppData(IdManager idManager, AppData appData, String str) {
    }

    private static StaticSessionData.DeviceData createDeviceData(Context context) {
    }

    private static StaticSessionData.OsData createOsData(Context context) {
    }

    public static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(File file, String str) {
    }

    private static void deleteFiles(File[] fileArr) {
    }

    private void doOpenSession() {
    }

    private void doWriteAppExceptionMarker(long j) {
    }

    private static File[] ensureFileArrayNotNull(File[] fileArr) {
    }

    private void finalizePreviousNativeSession(String str) {
    }

    private static boolean firebaseCrashExists() {
    }

    private Context getContext() {
    }

    private String getCurrentSessionId() {
    }

    private static long getCurrentTimestampSeconds() {
    }

    static List<NativeSessionFile> getNativeSessionFiles(NativeSessionFileProvider nativeSessionFileProvider, String str, File file, byte[] bArr) {
    }

    private static long getTimestampSeconds(long j) {
    }

    private static /* synthetic */ boolean lambda$static$0(File file, String str) {
    }

    private File[] listFilesMatching(FilenameFilter filenameFilter) {
    }

    private Task<Void> logAnalyticsAppExceptionEvent(long j) {
    }

    private Task<Void> logAnalyticsAppExceptionEvents() {
    }

    private Task<Boolean> waitForReportAction() {
    }

    private void writeApplicationExitInfoEventIfRelevant(String str) {
    }

    Task<Boolean> checkForUnsentReports() {
    }

    Task<Void> deleteUnsentReports() {
    }

    boolean didCrashOnPreviousExecution() {
    }

    void doCloseSessions(SettingsDataProvider settingsDataProvider) {
    }

    void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsDataProvider settingsDataProvider) {
    }

    boolean finalizeSessions(SettingsDataProvider settingsDataProvider) {
    }

    File getFilesDir() {
    }

    File getNativeSessionFilesDir() {
    }

    UserMetadata getUserMetadata() {
    }

    synchronized void handleUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th) {
    }

    boolean isHandlingException() {
    }

    File[] listAppExceptionMarkerFiles() {
    }

    File[] listNativeSessionFileDirectories() {
    }

    void openSession() {
    }

    Task<Void> sendUnsentReports() {
    }

    void setCustomKey(String str, String str2) {
    }

    void setCustomKeys(Map<String, String> map) {
    }

    void setInternalKey(String str, String str2) {
    }

    void setUserId(String str) {
    }

    Task<Void> submitAllReports(Task<AppSettingsData> task) {
    }

    void writeNonFatalException(Thread thread, Throwable th) {
    }

    void writeToLog(long j, String str) {
    }

    private void doCloseSessions(boolean z, SettingsDataProvider settingsDataProvider) {
    }

    private static File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
    }
}
