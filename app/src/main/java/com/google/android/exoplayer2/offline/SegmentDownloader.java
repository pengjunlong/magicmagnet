package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<StreamKey> streamKeys;

    /* renamed from: com.google.android.exoplayer2.offline.SegmentDownloader$1 */
    class C01561 extends RunnableFutureTask<M, IOException> {
        final /* synthetic */ SegmentDownloader this$0;
        final /* synthetic */ DataSource val$dataSource;
        final /* synthetic */ DataSpec val$dataSpec;

        C01561(SegmentDownloader segmentDownloader, DataSource dataSource, DataSpec dataSpec) {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        protected /* bridge */ /* synthetic */ Object doWork() throws Exception {
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        protected M doWork() throws IOException {
        }
    }

    private static final class ProgressNotifier implements CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(Downloader.ProgressListener progressListener, long j, int i, long j2, int i2) {
        }

        private float getPercentDownloaded() {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
        public void onProgress(long j, long j2, long j3) {
        }

        public void onSegmentDownloaded() {
        }
    }

    protected static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j, DataSpec dataSpec) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Segment segment) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Segment segment) {
        }
    }

    private static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        private final CacheWriter cacheWriter;
        public final CacheDataSource dataSource;
        private final ProgressNotifier progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(Segment segment, CacheDataSource cacheDataSource, ProgressNotifier progressNotifier, byte[] bArr) {
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

    @Deprecated
    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor) {
    }

    static /* synthetic */ ParsingLoadable.Parser access$000(SegmentDownloader segmentDownloader) {
    }

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnableFutureTask) throws InterruptedException {
    }

    private static boolean canMergeSegments(DataSpec dataSpec, DataSpec dataSpec2) {
    }

    protected static DataSpec getCompressibleDataSpec(Uri uri) {
    }

    private static void mergeSegments(List<Segment> list, CacheKeyFactory cacheKeyFactory, long j) {
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnableFutureTask) {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void download(Downloader.ProgressListener progressListener) throws IOException, InterruptedException {
    }

    protected final <T> T execute(RunnableFutureTask<T, ?> runnableFutureTask, boolean z) throws InterruptedException, IOException {
    }

    protected final M getManifest(DataSource dataSource, DataSpec dataSpec, boolean z) throws InterruptedException, IOException {
    }

    protected abstract List<Segment> getSegments(DataSource dataSource, M m, boolean z) throws IOException, InterruptedException;

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor, long j) {
    }

    private void removeActiveRunnable(int i) {
    }
}
