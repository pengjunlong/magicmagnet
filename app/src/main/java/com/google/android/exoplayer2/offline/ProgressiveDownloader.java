package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ProgressiveDownloader implements Downloader {
    private final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final PriorityTaskManager priorityTaskManager;
    private Downloader.ProgressListener progressListener;

    /* renamed from: com.google.android.exoplayer2.offline.ProgressiveDownloader$1 */
    class C01551 extends RunnableFutureTask<Void, IOException> {
        final /* synthetic */ ProgressiveDownloader this$0;

        C01551(ProgressiveDownloader progressiveDownloader) {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        protected void cancelWork() {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        protected /* bridge */ /* synthetic */ Void doWork() throws Exception {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* renamed from: doWork, reason: avoid collision after fix types in other method */
        protected Void doWork2() throws IOException {
        }
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
    }

    static /* synthetic */ CacheWriter access$000(ProgressiveDownloader progressiveDownloader) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ProgressiveDownloader progressiveDownloader, long j, long j2, long j3) {
    }

    private void onProgress(long j, long j2, long j3) {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void download(Downloader.ProgressListener progressListener) throws IOException, InterruptedException {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void remove() {
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
    }
}
