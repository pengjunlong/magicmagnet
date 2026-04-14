package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = null;
    private static final int MSG_ADD_DOWNLOAD = 6;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 10;
    private static final int MSG_DOWNLOAD_UPDATE = 2;
    private static final int MSG_INITIALIZE = 0;
    private static final int MSG_INITIALIZED = 0;
    private static final int MSG_PROCESSED = 1;
    private static final int MSG_RELEASE = 12;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 8;
    private static final int MSG_REMOVE_DOWNLOAD = 7;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 1;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 4;
    private static final int MSG_SET_MIN_RETRY_COUNT = 5;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 2;
    private static final int MSG_SET_STOP_REASON = 3;
    private static final int MSG_TASK_STOPPED = 9;
    private static final int MSG_UPDATE_PROGRESS = 11;
    private static final String TAG = "DownloadManager";
    private int activeTaskCount;
    private final Handler applicationHandler;
    private final Context context;
    private final WritableDownloadIndex downloadIndex;
    private List<Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final InternalHandler internalHandler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final RequirementsWatcher.Listener requirementsListener;
    private RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    private static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean z, List<Download> list, Exception exc) {
        }
    }

    public interface Listener {
        void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc);

        void onDownloadRemoved(DownloadManager downloadManager, Download download);

        void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z);

        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i);

        void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z);
    }

    private static class Task extends Thread implements Downloader.ProgressListener {
        private long contentLength;
        private final DownloadProgress downloadProgress;
        private final Downloader downloader;
        private Exception finalException;
        private volatile InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final DownloadRequest request;

        /* synthetic */ Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z, int i, InternalHandler internalHandler, C01521 c01521) {
        }

        static /* synthetic */ boolean access$000(Task task) {
        }

        static /* synthetic */ DownloadRequest access$200(Task task) {
        }

        static /* synthetic */ boolean access$300(Task task) {
        }

        static /* synthetic */ Exception access$400(Task task) {
        }

        private static int getRetryDelayMillis(int i) {
        }

        public void cancel(boolean z) {
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long j, long j2, float f) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        private Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z, int i, InternalHandler internalHandler) {
        }
    }

    @Deprecated
    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DownloadManager downloadManager, RequirementsWatcher requirementsWatcher, int i) {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(DownloadManager downloadManager, Message message) {
    }

    private boolean handleMainMessage(Message message) {
    }

    static Download mergeRequest(Download download, DownloadRequest downloadRequest, int i, long j) {
    }

    private void notifyWaitingForRequirementsChanged() {
    }

    private void onDownloadUpdate(DownloadUpdate downloadUpdate) {
    }

    private void onInitialized(List<Download> list) {
    }

    private void onMessageProcessed(int i, int i2) {
    }

    private void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
    }

    private void setDownloadsPaused(boolean z) {
    }

    private boolean updateWaitingForRequirements() {
    }

    public void addDownload(DownloadRequest downloadRequest) {
    }

    public void addListener(Listener listener) {
    }

    public Looper getApplicationLooper() {
    }

    public List<Download> getCurrentDownloads() {
    }

    public DownloadIndex getDownloadIndex() {
    }

    public boolean getDownloadsPaused() {
    }

    public int getMaxParallelDownloads() {
    }

    public int getMinRetryCount() {
    }

    public int getNotMetRequirements() {
    }

    public Requirements getRequirements() {
    }

    public boolean isIdle() {
    }

    public boolean isInitialized() {
    }

    public boolean isWaitingForRequirements() {
    }

    public void pauseDownloads() {
    }

    public void release() {
    }

    public void removeAllDownloads() {
    }

    public void removeDownload(String str) {
    }

    public void removeListener(Listener listener) {
    }

    public void resumeDownloads() {
    }

    public void setMaxParallelDownloads(int i) {
    }

    public void setMinRetryCount(int i) {
    }

    public void setRequirements(Requirements requirements) {
    }

    public void setStopReason(String str, int i) {
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
    }

    public void addDownload(DownloadRequest downloadRequest, int i) {
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
    }

    private static final class InternalHandler extends Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final HashMap<String, Task> activeTasks;
        private final WritableDownloadIndex downloadIndex;
        private final DownloaderFactory downloaderFactory;
        private final ArrayList<Download> downloads;
        private boolean downloadsPaused;
        private boolean hasActiveRemoveTask;
        private final Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final HandlerThread thread;

        public InternalHandler(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i, int i2, boolean z) {
        }

        private void addDownload(DownloadRequest downloadRequest, int i) {
        }

        private boolean canDownloadsRun() {
        }

        private static int compareStartTimes(Download download, Download download2) {
        }

        private static Download copyDownloadWithState(Download download, int i, int i2) {
        }

        public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(Download download, Download download2) {
        }

        private Download getDownload(String str, boolean z) {
        }

        private int getDownloadIndex(String str) {
        }

        private void initialize(int i) {
        }

        private void onContentLengthChanged(Task task, long j) {
        }

        private void onDownloadTaskStopped(Download download, Exception exc) {
        }

        private void onRemoveTaskStopped(Download download) {
        }

        private void onTaskStopped(Task task) {
        }

        private Download putDownload(Download download) {
        }

        private Download putDownloadWithState(Download download, int i, int i2) {
        }

        private void release() {
        }

        private void removeAllDownloads() {
        }

        private void removeDownload(String str) {
        }

        private void setDownloadsPaused(boolean z) {
        }

        private void setMaxParallelDownloads(int i) {
        }

        private void setMinRetryCount(int i) {
        }

        private void setNotMetRequirements(int i) {
        }

        private void setStopReason(String str, int i) {
        }

        private void syncDownloadingDownload(Task task, Download download, int i) {
        }

        private Task syncQueuedDownload(Task task, Download download) {
        }

        private void syncRemovingDownload(Task task, Download download) {
        }

        private void syncStoppedDownload(Task task) {
        }

        private void syncTasks() {
        }

        private void updateProgress() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        private void setStopReason(Download download, int i) {
        }
    }
}
