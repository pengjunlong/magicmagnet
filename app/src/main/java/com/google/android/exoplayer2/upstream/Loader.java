package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Loader implements LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final LoadErrorAction DONT_RETRY = null;
    public static final LoadErrorAction DONT_RETRY_FATAL = null;
    public static final LoadErrorAction RETRY = null;
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT = null;
    private static final String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";
    private LoadTask<? extends Loadable> currentTask;
    private final ExecutorService downloadExecutorService;
    private IOException fatalError;

    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t, long j, long j2, boolean z);

        void onLoadCompleted(T t, long j, long j2);

        LoadErrorAction onLoadError(T t, long j, long j2, IOException iOException, int i);
    }

    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        /* synthetic */ LoadErrorAction(int i, long j, C02271 c02271) {
        }

        static /* synthetic */ int access$300(LoadErrorAction loadErrorAction) {
        }

        static /* synthetic */ long access$400(LoadErrorAction loadErrorAction) {
        }

        public boolean isRetry() {
        }

        private LoadErrorAction(int i, long j) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_FATAL_ERROR = 3;
        private static final int MSG_FINISH = 1;
        private static final int MSG_IO_EXCEPTION = 2;
        private static final int MSG_START = 0;
        private static final String TAG = "LoadTask";
        private Callback<T> callback;
        private boolean canceled;
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;
        final /* synthetic */ Loader this$0;

        public LoadTask(Loader loader, Looper looper, T t, Callback<T> callback, int i, long j) {
        }

        private void execute() {
        }

        private void finish() {
        }

        private long getRetryDelayMillis() {
        }

        public void cancel(boolean z) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        public void maybeThrowError(int i) throws IOException {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void start(long j) {
        }
    }

    public interface Loadable {
        void cancelLoad();

        void load() throws IOException;
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    private static final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback releaseCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
        }
    }

    public Loader(String str) {
    }

    static /* synthetic */ LoadTask access$100(Loader loader) {
    }

    static /* synthetic */ LoadTask access$102(Loader loader, LoadTask loadTask) {
    }

    static /* synthetic */ IOException access$202(Loader loader, IOException iOException) {
    }

    static /* synthetic */ ExecutorService access$500(Loader loader) {
    }

    public static LoadErrorAction createRetryAction(boolean z, long j) {
    }

    public void cancelLoading() {
    }

    public void clearFatalError() {
    }

    public boolean hasFatalError() {
    }

    public boolean isLoading() {
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
    }

    public void release() {
    }

    public <T extends Loadable> long startLoading(T t, Callback<T> callback, int i) {
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int i) throws IOException {
    }

    public void release(ReleaseCallback releaseCallback) {
    }
}
