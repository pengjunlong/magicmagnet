package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final CacheKeyFactory cacheKeyFactory;
    private final DataSource cacheReadDataSource;
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private DataSource currentDataSource;
    private long currentDataSourceBytesRead;
    private DataSpec currentDataSpec;
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    private final EventListener eventListener;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private long readPosition;
    private DataSpec requestDataSpec;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    public static final class Factory implements DataSource.Factory {
        private Cache cache;
        private boolean cacheIsReadOnly;
        private CacheKeyFactory cacheKeyFactory;
        private DataSource.Factory cacheReadDataSourceFactory;
        private DataSink.Factory cacheWriteDataSinkFactory;
        private EventListener eventListener;
        private int flags;
        private DataSource.Factory upstreamDataSourceFactory;
        private int upstreamPriority;
        private PriorityTaskManager upstreamPriorityTaskManager;

        private CacheDataSource createDataSourceInternal(DataSource dataSource, int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ DataSource createDataSource() {
        }

        public CacheDataSource createDataSourceForDownloading() {
        }

        public CacheDataSource createDataSourceForRemovingDownload() {
        }

        public Cache getCache() {
        }

        public CacheKeyFactory getCacheKeyFactory() {
        }

        public PriorityTaskManager getUpstreamPriorityTaskManager() {
        }

        @CanIgnoreReturnValue
        public Factory setCache(Cache cache) {
        }

        @CanIgnoreReturnValue
        public Factory setCacheKeyFactory(CacheKeyFactory cacheKeyFactory) {
        }

        @CanIgnoreReturnValue
        public Factory setCacheReadDataSourceFactory(DataSource.Factory factory) {
        }

        @CanIgnoreReturnValue
        public Factory setCacheWriteDataSinkFactory(DataSink.Factory factory) {
        }

        @CanIgnoreReturnValue
        public Factory setEventListener(EventListener eventListener) {
        }

        @CanIgnoreReturnValue
        public Factory setFlags(int i) {
        }

        @CanIgnoreReturnValue
        public Factory setUpstreamDataSourceFactory(DataSource.Factory factory) {
        }

        @CanIgnoreReturnValue
        public Factory setUpstreamPriority(int i) {
        }

        @CanIgnoreReturnValue
        public Factory setUpstreamPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public CacheDataSource createDataSource() {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* synthetic */ CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, CacheKeyFactory cacheKeyFactory, int i, PriorityTaskManager priorityTaskManager, int i2, EventListener eventListener, C02301 c02301) {
    }

    private void closeCurrentSource() throws IOException {
    }

    private static Uri getRedirectedUriOrDefault(Cache cache, String str, Uri uri) {
    }

    private void handleBeforeThrow(Throwable th) {
    }

    private boolean isBypassingCache() {
    }

    private boolean isReadingFromCache() {
    }

    private boolean isReadingFromUpstream() {
    }

    private boolean isWritingToCache() {
    }

    private void notifyBytesRead() {
    }

    private void notifyCacheIgnored(int i) {
    }

    private void openNextSource(DataSpec dataSpec, boolean z) throws IOException {
    }

    private void setNoBytesRemainingAndMaybeStoreLength(String str) throws IOException {
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
    }

    public Cache getCache() {
    }

    public CacheKeyFactory getCacheKeyFactory() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }

    public CacheDataSource(Cache cache, DataSource dataSource) {
    }

    public CacheDataSource(Cache cache, DataSource dataSource, int i) {
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i, EventListener eventListener) {
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i, EventListener eventListener, CacheKeyFactory cacheKeyFactory) {
    }

    private CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, CacheKeyFactory cacheKeyFactory, int i, PriorityTaskManager priorityTaskManager, int i2, EventListener eventListener) {
    }
}
