package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    private static final class MediaPeriodQueueTracker {
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue;
        private ImmutableMap<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelines;
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period) {
        }

        static /* synthetic */ ImmutableList access$000(MediaPeriodQueueTracker mediaPeriodQueueTracker) {
        }

        private void addTimelineForMediaPeriodId(ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        }

        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, ImmutableList<MediaSource.MediaPeriodId> immutableList, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Object obj, boolean z, int i, int i2, int i3) {
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
        }

        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
        }

        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
        }

        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
        }

        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
        }

        public void onPositionDiscontinuity(Player player) {
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId, Player player) {
        }

        public void onTimelineChanged(Player player) {
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
    }

    public static /* synthetic */ void bbdbbpdOJSuInlll111l(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(AnalyticsListener.EventTime eventTime, boolean z, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bdddqmITkkeGpsxVXHR1l1llll(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bdpdqYMMfHmzHyUIbllllll1(AnalyticsListener.EventTime eventTime, int i, long j, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bdqbblVddTYAmqrWwacZmi111ll1(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bdqpqbqbgFttbl1ll1l(DefaultAnalyticsCollector defaultAnalyticsCollector, Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    public static /* synthetic */ void bpbbpOxqjGWQAsycX11ll1l1(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpbbpbppqsLrtEPjeDMEnOv1l1l1(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll(AnalyticsListener.EventTime eventTime, long j, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpdddqbpEtpkwNYukGjjNs1l111(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(AnalyticsListener.EventTime eventTime, long j, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bppbpdbCeZVhQNTixBml1lll11l(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpppqdQjfPiCT111111111(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bppqdpqbpvFfYvVMQwal1l1l1(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpqbbpqpqkDmeOUxxUylkHyYgWv11111(AnalyticsListener.EventTime eventTime, int i, long j, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpqbbqTOKdRXac1ll1l1lll(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpqdqbqpviKiORjqgp1l111l11(AnalyticsListener.EventTime eventTime, long j, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bpqpbicsQtfVpOtr11l1l(AnalyticsListener.EventTime eventTime, Player.Commands commands, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bqdbpBvxFUC1lll11(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void bqdppdGFpODiqhzhhiaXKl11l1(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dbbpdqqpdVUhpQ1ll11(AnalyticsListener.EventTime eventTime, List list, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(AnalyticsListener.EventTime eventTime, int i, int i2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dbppbdqpeLmcbs11l11(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dbppbpzxVnfullll1(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void ddbbbeXHXx111ll(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dddbpbpNqzZZJmSG1111l(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void ddddbbdqIccDnEitQc1l1l1l(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void ddpbddGpKmMvSPZaXEkLg11l11(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void ddppqbqqbIhInevqvPYIBnGmBIE111lll(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(AnalyticsListener.EventTime eventTime, int i, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dpbdqAKWNZAIXLyehU1lll1lll1(AnalyticsListener.EventTime eventTime, CueGroup cueGroup, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dqbbdddqpLERmaRLiHiDpL1l1l1l(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dqdqbpQposEBDyDxIyyz1ll11(AnalyticsListener.EventTime eventTime, float f, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dqpqqqbqQyjyB11111l1(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(PlaybackException playbackException) {
    }

    private static /* synthetic */ void lambda$new$0(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    private static /* synthetic */ void lambda$notifySeekStarted$2(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioAttributesChanged$56(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioCodecError$11(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioDecoderInitialized$4(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioDecoderReleased$8(AnalyticsListener.EventTime eventTime, String str, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioDisabled$9(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioEnabled$3(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioInputFormatChanged$5(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioPositionAdvancing$6(AnalyticsListener.EventTime eventTime, long j, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioSessionIdChanged$55(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioSinkError$10(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAudioUnderrun$7(AnalyticsListener.EventTime eventTime, int i, long j, long j2, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onAvailableCommandsChanged$33(AnalyticsListener.EventTime eventTime, Player.Commands commands, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onBandwidthSample$61(AnalyticsListener.EventTime eventTime, int i, long j, long j2, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onCues$51(AnalyticsListener.EventTime eventTime, List list, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onCues$52(AnalyticsListener.EventTime eventTime, CueGroup cueGroup, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDeviceInfoChanged$59(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDeviceVolumeChanged$60(AnalyticsListener.EventTime eventTime, int i, boolean z, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDownstreamFormatChanged$28(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDrmKeysLoaded$63(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDrmKeysRemoved$66(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDrmKeysRestored$65(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDrmSessionAcquired$62(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDrmSessionManagerError$64(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDrmSessionReleased$67(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onDroppedFrames$16(AnalyticsListener.EventTime eventTime, int i, long j, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onIsLoadingChanged$32(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onIsPlayingChanged$38(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onLoadCanceled$25(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onLoadCompleted$24(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onLoadError$26(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onLoadStarted$23(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onMaxSeekToPreviousPositionChanged$47(AnalyticsListener.EventTime eventTime, long j, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onMediaItemTransition$30(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onMediaMetadataChanged$48(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onMetadata$50(AnalyticsListener.EventTime eventTime, Metadata metadata, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPlayWhenReadyChanged$36(AnalyticsListener.EventTime eventTime, boolean z, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPlaybackParametersChanged$44(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPlaybackStateChanged$35(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPlaybackSuppressionReasonChanged$37(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPlayerError$41(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPlayerErrorChanged$42(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPlayerStateChanged$34(AnalyticsListener.EventTime eventTime, boolean z, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPlaylistMetadataChanged$49(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onPositionDiscontinuity$43(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onRenderedFirstFrame$19(AnalyticsListener.EventTime eventTime, Object obj, long j, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onRepeatModeChanged$39(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onSeekBackIncrementChanged$45(AnalyticsListener.EventTime eventTime, long j, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onSeekForwardIncrementChanged$46(AnalyticsListener.EventTime eventTime, long j, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onSeekProcessed$53(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onShuffleModeEnabledChanged$40(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onSkipSilenceEnabledChanged$54(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onSurfaceSizeChanged$22(AnalyticsListener.EventTime eventTime, int i, int i2, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onTimelineChanged$29(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onTrackSelectionParametersChanged$58(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onTracksChanged$31(AnalyticsListener.EventTime eventTime, Tracks tracks, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onUpstreamDiscarded$27(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVideoCodecError$21(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVideoDecoderInitialized$14(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVideoDecoderReleased$17(AnalyticsListener.EventTime eventTime, String str, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVideoDisabled$18(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVideoEnabled$13(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVideoFrameProcessingOffset$20(AnalyticsListener.EventTime eventTime, long j, int i, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVideoInputFormatChanged$15(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVideoSizeChanged$57(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$onVolumeChanged$12(AnalyticsListener.EventTime eventTime, float f, AnalyticsListener analyticsListener) {
    }

    private static /* synthetic */ void lambda$releaseInternal$68(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    private /* synthetic */ void lambda$setPlayer$1(Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    public static /* synthetic */ void pbdbqZLBIrMLYk1l11l1ll1(AnalyticsListener.EventTime eventTime, Tracks tracks, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void pbddqdbpoVvTyZPOoYl1111(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void pbppbpqbamJRy11l1l1(AnalyticsListener.EventTime eventTime, long j, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void pdpqbmApOBCmNMwnn1ll111(AnalyticsListener.EventTime eventTime, Metadata metadata, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void pdpqqbqbpFAaViLnU1l1ll11l1(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    public static /* synthetic */ void pdqdddDNpMbeVT11ll11(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void ppbddpbbYwysRtaAnAwzNYP11l11111l(AnalyticsListener.EventTime eventTime, String str, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(DefaultAnalyticsCollector defaultAnalyticsCollector) {
    }

    public static /* synthetic */ void ppdqqzXJzQiU11ll11(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void ppppqdfPOyVswFHMTylxLClll1l1111(AnalyticsListener.EventTime eventTime, int i, long j, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l(AnalyticsListener.EventTime eventTime, boolean z, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void pqqqddFCECdWHkSTrqHcll111111l(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qbddqbdJBkudFfhX1ll1l111(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qbdpqpstJKhhKkXrsOGvbWw1l1llll(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qbpbbZWTnlDkwOgZlllll(AnalyticsListener.EventTime eventTime, String str, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qbpbddbpyaPAbpThgWCvm11l11l1(AnalyticsListener.EventTime eventTime, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qbqdqqqqdvTduGNll111l1(AnalyticsListener.EventTime eventTime, long j, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qddbbpxsbNjqxvn111ll(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qdqdpyALEmZFGGaahRTIU1ll11(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qpbqqHZCUeoATyA11ll1l1(AnalyticsListener.EventTime eventTime, Object obj, long j, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qpdbbbbbmKdyKHlllllll1(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qppqdpppIauLKaAtRkB11111l(AnalyticsListener.EventTime eventTime, Exception exc, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qqbqbddiRRgLpniPxlUfQzP1l1l1l(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qqdbbfmUWwoYYpfYHJZdaUO1111llll(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z, AnalyticsListener analyticsListener) {
    }

    public static /* synthetic */ void qqpbppebHUxqEmlGoAJWl1lll(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, AnalyticsListener analyticsListener) {
    }

    private void releaseInternal() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void addListener(AnalyticsListener analyticsListener) {
    }

    protected final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
    }

    @RequiresNonNull({"player"})
    protected final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioCodecError(Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioSessionIdChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioSinkError(Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioUnderrun(int i, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(List<Cue> list) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onDroppedFrames(int i, long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMediaItemTransition(MediaItem mediaItem, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMetadata(Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackStateChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(Object obj, long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onRepeatModeChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekBackIncrementChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekForwardIncrementChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSeekProcessed() {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onTimelineChanged(Timeline timeline, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTracksChanged(Tracks tracks) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoCodecError(Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(long j, int i) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVolumeChanged(float f) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void release() {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void removeListener(AnalyticsListener analyticsListener) {
    }

    protected final void sendEvent(AnalyticsListener.EventTime eventTime, int i, ListenerSet.Event<AnalyticsListener> event) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public void setPlayer(Player player, Looper looper) {
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(CueGroup cueGroup) {
    }

    private AnalyticsListener.EventTime generateEventTime(MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
