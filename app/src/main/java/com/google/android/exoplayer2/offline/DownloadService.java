package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.Scheduler;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, DownloadManagerHelper> downloadManagerHelpers = null;
    private final int channelDescriptionResourceId;
    private final String channelId;
    private final int channelNameResourceId;
    private DownloadManagerHelper downloadManagerHelper;
    private final ForegroundNotificationUpdater foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* JADX INFO: Access modifiers changed from: private */
    static final class DownloadManagerHelper implements DownloadManager.Listener {
        private final Context context;
        private final DownloadManager downloadManager;
        private DownloadService downloadService;
        private final boolean foregroundAllowed;
        private Requirements scheduledRequirements;
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        /* synthetic */ DownloadManagerHelper(Context context, DownloadManager downloadManager, boolean z, Scheduler scheduler, Class cls, C01541 c01541) {
        }

        static /* synthetic */ DownloadManager access$100(DownloadManagerHelper downloadManagerHelper) {
        }

        @RequiresNonNull({"scheduler"})
        private void cancelScheduler() {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DownloadManagerHelper downloadManagerHelper, DownloadService downloadService) {
        }

        private /* synthetic */ void lambda$attachService$0(DownloadService downloadService) {
        }

        private void restartService() {
        }

        private boolean schedulerNeedsUpdate(Requirements requirements) {
        }

        private boolean serviceMayNeedRestart() {
        }

        public void attachService(DownloadService downloadService) {
        }

        public void detachService(DownloadService downloadService) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public /* synthetic */ void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onInitialized(DownloadManager downloadManager) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
        public void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z) {
        }

        public boolean updateScheduler() {
        }

        private DownloadManagerHelper(Context context, DownloadManager downloadManager, boolean z, Scheduler scheduler, Class<? extends DownloadService> cls) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ForegroundNotificationUpdater {
        private final Handler handler;
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        final /* synthetic */ DownloadService this$0;
        private final long updateInterval;

        public ForegroundNotificationUpdater(DownloadService downloadService, int i, long j) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ForegroundNotificationUpdater foregroundNotificationUpdater) {
        }

        private void update() {
        }

        public void invalidate() {
        }

        public void showNotificationIfNotAlready() {
        }

        public void startPeriodicUpdates() {
        }

        public void stopPeriodicUpdates() {
        }
    }

    protected DownloadService(int i) {
    }

    static /* synthetic */ DownloadManagerHelper access$200(DownloadService downloadService) {
    }

    static /* synthetic */ void access$300(DownloadService downloadService, List list) {
    }

    static /* synthetic */ void access$400(DownloadService downloadService, Download download) {
    }

    static /* synthetic */ boolean access$500(int i) {
    }

    static /* synthetic */ void access$600(DownloadService downloadService) {
    }

    static /* synthetic */ void access$700(DownloadService downloadService) {
    }

    static /* synthetic */ boolean access$800(DownloadService downloadService) {
    }

    static /* synthetic */ Intent access$900(Context context, Class cls, String str) {
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, String str, int i, boolean z) {
    }

    public static void clearDownloadManagerHelpers() {
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
    }

    private boolean isStopped() {
    }

    private static boolean needsStartedService(int i) {
    }

    private void notifyDownloadChanged(Download download) {
    }

    private void notifyDownloadRemoved() {
    }

    private void notifyDownloads(List<Download> list) {
    }

    private void onIdle() {
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, String str, int i, boolean z) {
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
    }

    private static void startService(Context context, Intent intent, boolean z) {
    }

    protected abstract DownloadManager getDownloadManager();

    protected abstract Notification getForegroundNotification(List<Download> list, int i);

    protected abstract Scheduler getScheduler();

    protected final void invalidateForegroundNotification() {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
    }

    protected DownloadService(int i, long j) {
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str) {
    }

    @Deprecated
    protected DownloadService(int i, long j, String str, int i2) {
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
    }

    protected DownloadService(int i, long j, String str, int i2, int i3) {
    }
}
