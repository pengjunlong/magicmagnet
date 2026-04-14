package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.SntpClient;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;

    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final DashChunkSource.Factory chunkSourceFactory;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private final DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final DataSource.Factory manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    private final MediaItem mediaItem;
    private TransferListener mediaTransferListener;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$1 */
    class C01711 implements SntpClient.InitializationCallback {
        final /* synthetic */ DashMediaSource this$0;

        C01711(DashMediaSource dashMediaSource) {
        }

        @Override // com.google.android.exoplayer2.util.SntpClient.InitializationCallback
        public void onInitializationFailed(IOException iOException) {
        }

        @Override // com.google.android.exoplayer2.util.SntpClient.InitializationCallback
        public void onInitialized() {
        }
    }

    private static final class DashTimeline extends Timeline {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;
        private final MediaItem.LiveConfiguration liveConfiguration;
        private final DashManifest manifest;
        private final MediaItem mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        public DashTimeline(long j, long j2, long j3, int i, long j4, long j5, long j6, DashManifest dashManifest, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j) {
        }

        private static boolean isMovingLiveWindow(DashManifest dashManifest) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    private final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        final /* synthetic */ DashMediaSource this$0;

        private DefaultPlayerEmsgCallback(DashMediaSource dashMediaSource) {
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j) {
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
        }

        /* synthetic */ DefaultPlayerEmsgCallback(DashMediaSource dashMediaSource, C01711 c01711) {
        }
    }

    public static final class Factory implements MediaSourceFactory {
        private final DashChunkSource.Factory chunkSourceFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private final DataSource.Factory manifestDataSourceFactory;
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;

        public Factory(DataSource.Factory factory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public /* bridge */ /* synthetic */ MediaSource createMediaSource(MediaItem mediaItem) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
        }

        @CanIgnoreReturnValue
        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        @CanIgnoreReturnValue
        public Factory setFallbackTargetLiveOffsetMs(long j) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        @CanIgnoreReturnValue
        public Factory setManifestParser(ParsingLoadable.Parser<? extends DashManifest> parser) {
        }

        public Factory(DashChunkSource.Factory factory, DataSource.Factory factory2) {
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest, MediaItem mediaItem) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public DashMediaSource createMediaSource(MediaItem mediaItem) {
        }
    }

    static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = null;

        Iso8601Parser() {
        }

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public /* bridge */ /* synthetic */ Long parse(Uri uri, InputStream inputStream) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
        }
    }

    private final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        final /* synthetic */ DashMediaSource this$0;

        private ManifestCallback(DashMediaSource dashMediaSource) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException, int i) {
        }

        /* synthetic */ ManifestCallback(DashMediaSource dashMediaSource, C01711 c01711) {
        }

        /* renamed from: onLoadCanceled, reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, boolean z) {
        }

        /* renamed from: onLoadCompleted, reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
        }

        /* renamed from: onLoadError, reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException, int i) {
        }
    }

    private final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        final /* synthetic */ DashMediaSource this$0;

        private UtcTimestampCallback(DashMediaSource dashMediaSource) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException, int i) {
        }

        /* synthetic */ UtcTimestampCallback(DashMediaSource dashMediaSource, C01711 c01711) {
        }

        /* renamed from: onLoadCanceled, reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(ParsingLoadable<Long> parsingLoadable, long j, long j2, boolean z) {
        }

        /* renamed from: onLoadCompleted, reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
        }

        /* renamed from: onLoadError, reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException, int i) {
        }
    }

    private static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        private XsDateTimeParser() {
        }

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public /* bridge */ /* synthetic */ Long parse(Uri uri, InputStream inputStream) throws IOException {
        }

        /* synthetic */ XsDateTimeParser(C01711 c01711) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
        }
    }

    /* synthetic */ DashMediaSource(MediaItem mediaItem, DashManifest dashManifest, DataSource.Factory factory, ParsingLoadable.Parser parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j, C01711 c01711) {
    }

    static /* synthetic */ void access$500(DashMediaSource dashMediaSource, long j) {
    }

    static /* synthetic */ void access$600(DashMediaSource dashMediaSource, IOException iOException) {
    }

    static /* synthetic */ Loader access$700(DashMediaSource dashMediaSource) {
    }

    static /* synthetic */ IOException access$800(DashMediaSource dashMediaSource) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DashMediaSource dashMediaSource) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(DashMediaSource dashMediaSource) {
    }

    private static long getAvailableEndTimeInManifestUs(Period period, long j, long j2) {
    }

    private static long getAvailableStartTimeInManifestUs(Period period, long j, long j2) {
    }

    private static long getIntervalUntilNextManifestRefreshMs(DashManifest dashManifest, long j) {
    }

    private long getManifestLoadRetryDelayMillis() {
    }

    private static boolean hasVideoOrAudioAdaptationSets(Period period) {
    }

    private static boolean isIndexExplicit(Period period) {
    }

    private /* synthetic */ void lambda$new$0() {
    }

    private void loadNtpTimeOffset() {
    }

    private void onUtcTimestampResolutionError(IOException iOException) {
    }

    private void onUtcTimestampResolved(long j) {
    }

    private void processManifest(boolean z) {
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
    }

    private void scheduleManifestRefresh(long j) {
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i) {
    }

    private void startLoadingManifest() {
    }

    private void updateLiveConfiguration(long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    void onDashManifestPublishTimeExpired(long j) {
    }

    void onDashManifestRefreshRequested() {
    }

    void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j, long j2) {
    }

    void onManifestLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
    }

    Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException, int i) {
    }

    void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
    }

    Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    public void replaceManifestUri(Uri uri) {
    }

    final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        final /* synthetic */ DashMediaSource this$0;

        ManifestLoadErrorThrower(DashMediaSource dashMediaSource) {
        }

        private void maybeThrowManifestError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int i) throws IOException {
        }
    }

    private DashMediaSource(MediaItem mediaItem, DashManifest dashManifest, DataSource.Factory factory, ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
    }
}
