package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.IcyDataSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final Format ICY_FORMAT = null;
    private static final Map<String, String> ICY_METADATA_HEADERS = null;
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    private final String customCacheKey;
    private final DataSource dataSource;
    private int dataType;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private final Handler handler;
    private boolean haveAudioVideoTracks;
    private IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final ConditionVariable loadCondition;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private TrackState trackState;
    private final Uri uri;

    final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private DataSpec dataSpec;
        private final ExtractorOutput extractorOutput;
        private TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private final long loadTaskId;
        private boolean pendingExtractorSeek;
        private final PositionHolder positionHolder;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        final /* synthetic */ ProgressiveMediaPeriod this$0;
        private final Uri uri;

        public ExtractingLoadable(ProgressiveMediaPeriod progressiveMediaPeriod, Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
        }

        static /* synthetic */ StatsDataSource access$100(ExtractingLoadable extractingLoadable) {
        }

        static /* synthetic */ long access$200(ExtractingLoadable extractingLoadable) {
        }

        static /* synthetic */ DataSpec access$300(ExtractingLoadable extractingLoadable) {
        }

        static /* synthetic */ long access$400(ExtractingLoadable extractingLoadable) {
        }

        static /* synthetic */ void access$500(ExtractingLoadable extractingLoadable, long j, long j2) {
        }

        private DataSpec buildDataSpec(long j) {
        }

        private void setLoadPosition(long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
        }

        @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
        }
    }

    interface Listener {
        void onSourceInfoRefreshed(long j, boolean z, boolean z2);
    }

    private final class SampleStreamImpl implements SampleStream {
        final /* synthetic */ ProgressiveMediaPeriod this$0;
        private final int track;

        public SampleStreamImpl(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        }

        static /* synthetic */ int access$000(SampleStreamImpl sampleStreamImpl) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
        }
    }

    private static final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public TrackId(int i, boolean z) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    private static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
        }
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Listener listener, Allocator allocator, String str, int i) {
    }

    static /* synthetic */ Runnable access$1000(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    static /* synthetic */ Handler access$1100(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    static /* synthetic */ long access$1200(ProgressiveMediaPeriod progressiveMediaPeriod, boolean z) {
    }

    static /* synthetic */ Map access$1300() {
    }

    static /* synthetic */ String access$1400(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    static /* synthetic */ void access$600(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    static /* synthetic */ IcyHeaders access$700(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    static /* synthetic */ IcyHeaders access$702(ProgressiveMediaPeriod progressiveMediaPeriod, IcyHeaders icyHeaders) {
    }

    static /* synthetic */ Format access$800() {
    }

    static /* synthetic */ long access$900(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i) {
    }

    private static Map<String, String> createIcyMetadataHeaders() {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(ProgressiveMediaPeriod progressiveMediaPeriod, SeekMap seekMap) {
    }

    private int getExtractedSamplesCount() {
    }

    private long getLargestQueuedTimestampUs(boolean z) {
    }

    private boolean isPendingReset() {
    }

    private /* synthetic */ void lambda$new$0() {
    }

    private /* synthetic */ void lambda$onLengthKnown$2() {
    }

    private /* synthetic */ void lambda$seekMap$1(SeekMap seekMap) {
    }

    private void maybeFinishPrepare() {
    }

    private void maybeNotifyDownstreamFormat(int i) {
    }

    private void maybeStartDeferredRetry(int i) {
    }

    private void onLengthKnown() {
    }

    private TrackOutput prepareTrackOutput(TrackId trackId) {
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j) {
    }

    private void setSeekMap(SeekMap seekMap) {
    }

    private void startLoading() {
    }

    private boolean suppressRead() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
    }

    TrackOutput icyTrack() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
    }

    boolean isReady(int i) {
    }

    void maybeThrowError(int i) throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(ExtractingLoadable extractingLoadable, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ExtractingLoadable extractingLoadable, long j, long j2, IOException iOException, int i) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
    }

    int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
    }

    int skipData(int i, long j) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
    }

    /* renamed from: onLoadCanceled, reason: avoid collision after fix types in other method */
    public void onLoadCanceled2(ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
    }

    /* renamed from: onLoadCompleted, reason: avoid collision after fix types in other method */
    public void onLoadCompleted2(ExtractingLoadable extractingLoadable, long j, long j2) {
    }

    /* renamed from: onLoadError, reason: avoid collision after fix types in other method */
    public Loader.LoadErrorAction onLoadError2(ExtractingLoadable extractingLoadable, long j, long j2, IOException iOException, int i) {
    }

    void maybeThrowError() throws IOException {
    }
}
