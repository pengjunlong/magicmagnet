package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.source.rtsp.RtspClient;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import javax.net.SocketFactory;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class RtspMediaPeriod implements MediaPeriod {
    private static final int PORT_BINDING_MAX_RETRY_COUNT = 3;
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final Handler handler;
    private final InternalListener internalListener;
    private boolean isUsingRtpTcp;
    private final Listener listener;
    private boolean loadingFinished;
    private boolean notifyDiscontinuity;
    private long pendingSeekPositionUs;
    private long pendingSeekPositionUsForTcpRetry;
    private RtspMediaSource.RtspPlaybackException playbackException;
    private int portBindingRetryCount;
    private IOException preparationError;
    private boolean prepared;
    private boolean released;
    private long requestedSeekPositionUs;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    private final RtspClient rtspClient;
    private final List<RtspLoaderWrapper> rtspLoaderWrappers;
    private final List<RtpLoadInfo> selectedLoadInfos;
    private ImmutableList<TrackGroup> trackGroups;
    private boolean trackSelected;

    private final class InternalListener implements ExtractorOutput, Loader.Callback<RtpDataLoadable>, SampleQueue.UpstreamFormatChangedListener, RtspClient.SessionInfoListener, RtspClient.PlaybackEventListener {
        final /* synthetic */ RtspMediaPeriod this$0;

        private InternalListener(RtspMediaPeriod rtspMediaPeriod) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(RtspMediaPeriod rtspMediaPeriod) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(RtspMediaPeriod rtspMediaPeriod) {
        }

        private static /* synthetic */ void lambda$endTracks$0(RtspMediaPeriod rtspMediaPeriod) {
        }

        private static /* synthetic */ void lambda$onUpstreamFormatChanged$1(RtspMediaPeriod rtspMediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
        }

        /* renamed from: onLoadCanceled, reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(RtpDataLoadable rtpDataLoadable, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(RtpDataLoadable rtpDataLoadable, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(RtpDataLoadable rtpDataLoadable, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(RtpDataLoadable rtpDataLoadable, long j, long j2, IOException iOException, int i) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackStarted(long j, ImmutableList<RtspTrackTiming> immutableList) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onRtspSetupCompleted() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineRequestFailed(String str, Throwable th) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, ImmutableList<RtspMediaTrack> immutableList) {
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
        public void onUpstreamFormatChanged(Format format) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int i, int i2) {
        }

        /* synthetic */ InternalListener(RtspMediaPeriod rtspMediaPeriod, C01911 c01911) {
        }

        /* renamed from: onLoadCompleted, reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(RtpDataLoadable rtpDataLoadable, long j, long j2) {
        }

        /* renamed from: onLoadError, reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(RtpDataLoadable rtpDataLoadable, long j, long j2, IOException iOException, int i) {
        }
    }

    interface Listener {
        void onSeekingUnsupported();

        void onSourceInfoRefreshed(RtspSessionTiming rtspSessionTiming);
    }

    final class RtpLoadInfo {
        private final RtpDataLoadable loadable;
        public final RtspMediaTrack mediaTrack;
        final /* synthetic */ RtspMediaPeriod this$0;
        private String transport;

        public RtpLoadInfo(RtspMediaPeriod rtspMediaPeriod, RtspMediaTrack rtspMediaTrack, int i, RtpDataChannel.Factory factory) {
        }

        static /* synthetic */ RtpDataLoadable access$300(RtpLoadInfo rtpLoadInfo) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(RtpLoadInfo rtpLoadInfo, String str, RtpDataChannel rtpDataChannel) {
        }

        private /* synthetic */ void lambda$new$0(String str, RtpDataChannel rtpDataChannel) {
        }

        public Uri getTrackUri() {
        }

        public String getTransport() {
        }

        public boolean isTransportReady() {
        }
    }

    private final class RtspLoaderWrapper {
        private boolean canceled;
        public final RtpLoadInfo loadInfo;
        private final Loader loader;
        private boolean released;
        private final SampleQueue sampleQueue;
        final /* synthetic */ RtspMediaPeriod this$0;

        public RtspLoaderWrapper(RtspMediaPeriod rtspMediaPeriod, RtspMediaTrack rtspMediaTrack, int i, RtpDataChannel.Factory factory) {
        }

        static /* synthetic */ boolean access$100(RtspLoaderWrapper rtspLoaderWrapper) {
        }

        static /* synthetic */ SampleQueue access$200(RtspLoaderWrapper rtspLoaderWrapper) {
        }

        public void cancelLoad() {
        }

        public long getBufferedPositionUs() {
        }

        public boolean isSampleQueueReady() {
        }

        public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        }

        public void release() {
        }

        public void seekTo(long j) {
        }

        public int skipData(long j) {
        }

        public void startLoading() {
        }
    }

    private final class SampleStreamImpl implements SampleStream {
        final /* synthetic */ RtspMediaPeriod this$0;
        private final int track;

        public SampleStreamImpl(RtspMediaPeriod rtspMediaPeriod, int i) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws RtspMediaSource.RtspPlaybackException {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
        }
    }

    public RtspMediaPeriod(Allocator allocator, RtpDataChannel.Factory factory, Uri uri, Listener listener, String str, SocketFactory socketFactory, boolean z) {
    }

    static /* synthetic */ int access$1008(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ RtspMediaSource.RtspPlaybackException access$1100(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ RtspMediaSource.RtspPlaybackException access$1102(RtspMediaPeriod rtspMediaPeriod, RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
    }

    static /* synthetic */ long access$1200(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ long access$1202(RtspMediaPeriod rtspMediaPeriod, long j) {
    }

    static /* synthetic */ long access$1300(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ long access$1302(RtspMediaPeriod rtspMediaPeriod, long j) {
    }

    static /* synthetic */ RtspClient access$1400(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ List access$1500(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ Listener access$1600(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ boolean access$1700(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ boolean access$1802(RtspMediaPeriod rtspMediaPeriod, boolean z) {
    }

    static /* synthetic */ long access$1900(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ long access$1902(RtspMediaPeriod rtspMediaPeriod, long j) {
    }

    static /* synthetic */ RtpDataLoadable access$2000(RtspMediaPeriod rtspMediaPeriod, Uri uri) {
    }

    static /* synthetic */ RtpDataChannel.Factory access$2100(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ void access$2200(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ Allocator access$2300(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ InternalListener access$2400(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ void access$2500(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ void access$2600(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ List access$400(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ Handler access$500(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ boolean access$600(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ boolean access$602(RtspMediaPeriod rtspMediaPeriod, boolean z) {
    }

    static /* synthetic */ void access$700(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ boolean access$800(RtspMediaPeriod rtspMediaPeriod) {
    }

    static /* synthetic */ IOException access$902(RtspMediaPeriod rtspMediaPeriod, IOException iOException) {
    }

    private static ImmutableList<TrackGroup> buildTrackGroups(ImmutableList<RtspLoaderWrapper> immutableList) {
    }

    private RtpDataLoadable getLoadableByTrackUri(Uri uri) {
    }

    private boolean isSeekPending() {
    }

    private void maybeFinishPrepare() {
    }

    private void maybeSetupTracks() {
    }

    private void retryWithRtpTcp() {
    }

    private boolean seekInsideBufferUs(long j) {
    }

    private boolean suppressRead() {
    }

    private void updateLoadingFinished() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
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
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
    }

    boolean isReady(int i) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
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

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
    }

    int skipData(int i, long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public ImmutableList<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
    }
}
