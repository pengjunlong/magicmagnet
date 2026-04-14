package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class SimpleBasePlayer extends BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final HashSet<ListenableFuture<?>> pendingOperations;
    private final Timeline.Period period;
    private boolean released;
    private State state;

    protected static final class MediaItemData {
        private final MediaMetadata combinedMediaMetadata;
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;
        public final MediaItem.LiveConfiguration liveConfiguration;
        public final Object manifest;
        public final MediaItem mediaItem;
        public final MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final ImmutableList<PeriodData> periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final Tracks tracks;
        public final Object uid;
        public final long windowStartTimeMs;

        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;
            private MediaItem.LiveConfiguration liveConfiguration;
            private Object manifest;
            private MediaItem mediaItem;
            private MediaMetadata mediaMetadata;
            private ImmutableList<PeriodData> periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private Tracks tracks;
            private Object uid;
            private long windowStartTimeMs;

            /* synthetic */ Builder(MediaItemData mediaItemData, C00791 c00791) {
            }

            static /* synthetic */ MediaItem.LiveConfiguration access$4700(Builder builder) {
            }

            static /* synthetic */ long access$4800(Builder builder) {
            }

            static /* synthetic */ long access$4900(Builder builder) {
            }

            static /* synthetic */ long access$5000(Builder builder) {
            }

            static /* synthetic */ ImmutableList access$5100(Builder builder) {
            }

            static /* synthetic */ long access$5200(Builder builder) {
            }

            static /* synthetic */ long access$5300(Builder builder) {
            }

            static /* synthetic */ Object access$5400(Builder builder) {
            }

            static /* synthetic */ Tracks access$5500(Builder builder) {
            }

            static /* synthetic */ MediaItem access$5600(Builder builder) {
            }

            static /* synthetic */ MediaMetadata access$5700(Builder builder) {
            }

            static /* synthetic */ Object access$5800(Builder builder) {
            }

            static /* synthetic */ boolean access$5900(Builder builder) {
            }

            static /* synthetic */ boolean access$6000(Builder builder) {
            }

            static /* synthetic */ long access$6100(Builder builder) {
            }

            static /* synthetic */ boolean access$6200(Builder builder) {
            }

            public MediaItemData build() {
            }

            @CanIgnoreReturnValue
            public Builder setDefaultPositionUs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setDurationUs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setElapsedRealtimeEpochOffsetMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setIsDynamic(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setIsPlaceholder(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setIsSeekable(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
            }

            @CanIgnoreReturnValue
            public Builder setManifest(Object obj) {
            }

            @CanIgnoreReturnValue
            public Builder setMediaItem(MediaItem mediaItem) {
            }

            @CanIgnoreReturnValue
            public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
            }

            @CanIgnoreReturnValue
            public Builder setPeriods(List<PeriodData> list) {
            }

            @CanIgnoreReturnValue
            public Builder setPositionInFirstPeriodUs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setPresentationStartTimeMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setTracks(Tracks tracks) {
            }

            @CanIgnoreReturnValue
            public Builder setUid(Object obj) {
            }

            @CanIgnoreReturnValue
            public Builder setWindowStartTimeMs(long j) {
            }

            public Builder(Object obj) {
            }

            private Builder(MediaItemData mediaItemData) {
            }
        }

        /* synthetic */ MediaItemData(Builder builder, C00791 c00791) {
        }

        static /* synthetic */ Object access$4300(MediaItemData mediaItemData, int i) {
        }

        static /* synthetic */ Timeline.Window access$4400(MediaItemData mediaItemData, int i, Timeline.Window window) {
        }

        static /* synthetic */ Timeline.Period access$4500(MediaItemData mediaItemData, int i, int i2, Timeline.Period period) {
        }

        static /* synthetic */ MediaMetadata access$7100(MediaItemData mediaItemData) {
        }

        private static MediaMetadata getCombinedMediaMetadata(MediaItem mediaItem, Tracks tracks) {
        }

        private Timeline.Period getPeriod(int i, int i2, Timeline.Period period) {
        }

        private Object getPeriodUid(int i) {
        }

        private Timeline.Window getWindow(int i, Timeline.Window window) {
        }

        public Builder buildUpon() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        private MediaItemData(Builder builder) {
        }
    }

    protected static final class PeriodData {
        public final AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final Object uid;

        public static final class Builder {
            private AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private Object uid;

            /* synthetic */ Builder(PeriodData periodData, C00791 c00791) {
            }

            static /* synthetic */ Object access$6500(Builder builder) {
            }

            static /* synthetic */ long access$6600(Builder builder) {
            }

            static /* synthetic */ AdPlaybackState access$6700(Builder builder) {
            }

            static /* synthetic */ boolean access$6800(Builder builder) {
            }

            public PeriodData build() {
            }

            @CanIgnoreReturnValue
            public Builder setAdPlaybackState(AdPlaybackState adPlaybackState) {
            }

            @CanIgnoreReturnValue
            public Builder setDurationUs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setIsPlaceholder(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setUid(Object obj) {
            }

            public Builder(Object obj) {
            }

            private Builder(PeriodData periodData) {
            }
        }

        /* synthetic */ PeriodData(Builder builder, C00791 c00791) {
        }

        public Builder buildUpon() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        private PeriodData(Builder builder) {
        }
    }

    private static final class PlaceholderUid {
        private PlaceholderUid() {
        }

        /* synthetic */ PlaceholderUid(C00791 c00791) {
        }
    }

    private static final class PlaylistTimeline extends Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final HashMap<Object, Integer> periodIndexByUid;
        private final ImmutableList<MediaItemData> playlist;
        private final int[] windowIndexByPeriodIndex;

        public PlaylistTimeline(ImmutableList<MediaItemData> immutableList) {
        }

        private static int getPeriodCountInMediaItem(MediaItemData mediaItemData) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public interface PositionSupplier {
        public static final PositionSupplier ZERO = null;

        long get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final class State {
        public final PositionSupplier adBufferedPositionMsSupplier;
        public final PositionSupplier adPositionMsSupplier;
        public final AudioAttributes audioAttributes;
        public final Player.Commands availableCommands;
        public final PositionSupplier contentBufferedPositionMsSupplier;
        public final PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final DeviceInfo deviceInfo;
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;
        public final PlaybackException playerError;
        public final ImmutableList<MediaItemData> playlist;
        public final MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final Size surfaceSize;
        public final Metadata timedMetadata;
        public final Timeline timeline;
        public final PositionSupplier totalBufferedDurationMsSupplier;
        public final TrackSelectionParameters trackSelectionParameters;
        public final VideoSize videoSize;
        public final float volume;

        public static final class Builder {
            private PositionSupplier adBufferedPositionMsSupplier;
            private Long adPositionMs;
            private PositionSupplier adPositionMsSupplier;
            private AudioAttributes audioAttributes;
            private Player.Commands availableCommands;
            private PositionSupplier contentBufferedPositionMsSupplier;
            private Long contentPositionMs;
            private PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private CueGroup currentCues;
            private int currentMediaItemIndex;
            private DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;
            private PlaybackException playerError;
            private ImmutableList<MediaItemData> playlist;
            private MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private Size surfaceSize;
            private Metadata timedMetadata;
            private Timeline timeline;
            private PositionSupplier totalBufferedDurationMsSupplier;
            private TrackSelectionParameters trackSelectionParameters;
            private VideoSize videoSize;
            private float volume;

            /* synthetic */ Builder(State state, C00791 c00791) {
            }

            static /* synthetic */ Timeline access$100(Builder builder) {
            }

            static /* synthetic */ boolean access$1000(Builder builder) {
            }

            static /* synthetic */ boolean access$1100(Builder builder) {
            }

            static /* synthetic */ int access$1200(Builder builder) {
            }

            static /* synthetic */ PlaybackParameters access$1300(Builder builder) {
            }

            static /* synthetic */ PositionSupplier access$1400(Builder builder) {
            }

            static /* synthetic */ Long access$1500(Builder builder) {
            }

            static /* synthetic */ Player.Commands access$1600(Builder builder) {
            }

            static /* synthetic */ int access$1700(Builder builder) {
            }

            static /* synthetic */ int access$1800(Builder builder) {
            }

            static /* synthetic */ boolean access$1900(Builder builder) {
            }

            static /* synthetic */ int access$200(Builder builder) {
            }

            static /* synthetic */ long access$2000(Builder builder) {
            }

            static /* synthetic */ long access$2100(Builder builder) {
            }

            static /* synthetic */ long access$2200(Builder builder) {
            }

            static /* synthetic */ TrackSelectionParameters access$2300(Builder builder) {
            }

            static /* synthetic */ AudioAttributes access$2400(Builder builder) {
            }

            static /* synthetic */ float access$2500(Builder builder) {
            }

            static /* synthetic */ VideoSize access$2600(Builder builder) {
            }

            static /* synthetic */ CueGroup access$2700(Builder builder) {
            }

            static /* synthetic */ DeviceInfo access$2800(Builder builder) {
            }

            static /* synthetic */ int access$2900(Builder builder) {
            }

            static /* synthetic */ int access$300(Builder builder) {
            }

            static /* synthetic */ boolean access$3000(Builder builder) {
            }

            static /* synthetic */ Size access$3100(Builder builder) {
            }

            static /* synthetic */ boolean access$3200(Builder builder) {
            }

            static /* synthetic */ Metadata access$3300(Builder builder) {
            }

            static /* synthetic */ ImmutableList access$3400(Builder builder) {
            }

            static /* synthetic */ MediaMetadata access$3500(Builder builder) {
            }

            static /* synthetic */ PositionSupplier access$3600(Builder builder) {
            }

            static /* synthetic */ PositionSupplier access$3700(Builder builder) {
            }

            static /* synthetic */ PositionSupplier access$3800(Builder builder) {
            }

            static /* synthetic */ boolean access$3900(Builder builder) {
            }

            static /* synthetic */ int access$400(Builder builder) {
            }

            static /* synthetic */ int access$4000(Builder builder) {
            }

            static /* synthetic */ long access$4100(Builder builder) {
            }

            static /* synthetic */ int access$500(Builder builder) {
            }

            static /* synthetic */ Long access$600(Builder builder) {
            }

            static /* synthetic */ PositionSupplier access$700(Builder builder) {
            }

            static /* synthetic */ PlaybackException access$900(Builder builder) {
            }

            public State build() {
            }

            @CanIgnoreReturnValue
            public Builder clearPositionDiscontinuity() {
            }

            @CanIgnoreReturnValue
            public Builder setAdBufferedPositionMs(PositionSupplier positionSupplier) {
            }

            @CanIgnoreReturnValue
            public Builder setAdPositionMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            }

            @CanIgnoreReturnValue
            public Builder setAvailableCommands(Player.Commands commands) {
            }

            @CanIgnoreReturnValue
            public Builder setContentBufferedPositionMs(PositionSupplier positionSupplier) {
            }

            @CanIgnoreReturnValue
            public Builder setContentPositionMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setCurrentAd(int i, int i2) {
            }

            @CanIgnoreReturnValue
            public Builder setCurrentCues(CueGroup cueGroup) {
            }

            @CanIgnoreReturnValue
            public Builder setCurrentMediaItemIndex(int i) {
            }

            @CanIgnoreReturnValue
            public Builder setDeviceInfo(DeviceInfo deviceInfo) {
            }

            @CanIgnoreReturnValue
            public Builder setDeviceVolume(int i) {
            }

            @CanIgnoreReturnValue
            public Builder setIsDeviceMuted(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setIsLoading(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setMaxSeekToPreviousPositionMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setNewlyRenderedFirstFrame(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setPlayWhenReady(boolean z, int i) {
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackParameters(PlaybackParameters playbackParameters) {
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackState(int i) {
            }

            @CanIgnoreReturnValue
            public Builder setPlaybackSuppressionReason(int i) {
            }

            @CanIgnoreReturnValue
            public Builder setPlayerError(PlaybackException playbackException) {
            }

            @CanIgnoreReturnValue
            public Builder setPlaylist(List<MediaItemData> list) {
            }

            @CanIgnoreReturnValue
            public Builder setPlaylistMetadata(MediaMetadata mediaMetadata) {
            }

            @CanIgnoreReturnValue
            public Builder setPositionDiscontinuity(int i, long j) {
            }

            @CanIgnoreReturnValue
            public Builder setRepeatMode(int i) {
            }

            @CanIgnoreReturnValue
            public Builder setSeekBackIncrementMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setSeekForwardIncrementMs(long j) {
            }

            @CanIgnoreReturnValue
            public Builder setShuffleModeEnabled(boolean z) {
            }

            @CanIgnoreReturnValue
            public Builder setSurfaceSize(Size size) {
            }

            @CanIgnoreReturnValue
            public Builder setTimedMetadata(Metadata metadata) {
            }

            @CanIgnoreReturnValue
            public Builder setTotalBufferedDurationMs(PositionSupplier positionSupplier) {
            }

            @CanIgnoreReturnValue
            public Builder setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
            }

            @CanIgnoreReturnValue
            public Builder setVideoSize(VideoSize videoSize) {
            }

            @CanIgnoreReturnValue
            public Builder setVolume(float f) {
            }

            public Builder() {
            }

            @CanIgnoreReturnValue
            public Builder setAdPositionMs(PositionSupplier positionSupplier) {
            }

            @CanIgnoreReturnValue
            public Builder setContentPositionMs(PositionSupplier positionSupplier) {
            }

            private Builder(State state) {
            }
        }

        /* synthetic */ State(Builder builder, C00791 c00791) {
        }

        public Builder buildUpon() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        private State(Builder builder) {
        }
    }

    protected SimpleBasePlayer(Looper looper) {
    }

    static /* synthetic */ int access$800(Timeline timeline, int i, long j, Timeline.Window window, Timeline.Period period) {
    }

    public static /* synthetic */ State bbdbbpdOJSuInlll111l(State state, SurfaceHolder surfaceHolder) {
    }

    public static /* synthetic */ void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State bdddqmITkkeGpsxVXHR1l1llll(SimpleBasePlayer simpleBasePlayer, State state, int i, int i2, int i3) {
    }

    public static /* synthetic */ void bdpdqYMMfHmzHyUIbllllll1(MediaMetadata mediaMetadata, Player.Listener listener) {
    }

    public static /* synthetic */ State bdqbblVddTYAmqrWwacZmi111ll1(State state) {
    }

    public static /* synthetic */ State bpbbpOxqjGWQAsycX11ll1l1(State state, boolean z) {
    }

    public static /* synthetic */ void bpbbpbppqsLrtEPjeDMEnOv1l1l1(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State bpbqbqdqqjASPQfJSXuVkkgll1lll1ll(State state, MediaMetadata mediaMetadata) {
    }

    public static /* synthetic */ void bpdddqbpEtpkwNYukGjjNs1l111(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void bppbpdbCeZVhQNTixBml1lll11l(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(Tracks tracks, Player.Listener listener) {
    }

    public static /* synthetic */ State bpppqdQjfPiCT111111111(State state, TrackSelectionParameters trackSelectionParameters) {
    }

    public static /* synthetic */ State bpqbbpqpqkDmeOUxxUylkHyYgWv11111(State state) {
    }

    public static /* synthetic */ void bpqbbqTOKdRXac1ll1l1lll(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
    }

    public static /* synthetic */ void bpqdqbqpviKiORjqgp1l111l11(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void bpqpbicsQtfVpOtr11l1l(State state, int i, Player.Listener listener) {
    }

    public static /* synthetic */ void bqdbpBvxFUC1lll11(State state, Player.Listener listener) {
    }

    private static State buildStateForNewPosition(State.Builder builder, State state, long j, List<MediaItemData> list, int i, long j2, boolean z) {
    }

    private void clearVideoOutput(Object obj) {
    }

    public static /* synthetic */ void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void dbbpdqqpdVUhpQ1ll11(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(MediaItem mediaItem, int i, Player.Listener listener) {
    }

    public static /* synthetic */ void dbppbdqpeLmcbs11l11(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State dbpqdHhmDSIHIJiwc1ll1l1(State state, int i, long j) {
    }

    public static /* synthetic */ State ddbbbeXHXx111ll(State state, Size size) {
    }

    public static /* synthetic */ State dddbpbpNqzZZJmSG1111l(State state) {
    }

    public static /* synthetic */ void ddddbbdqIccDnEitQc1l1l1l(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void ddppqbqqbIhInevqvPYIBnGmBIE111lll(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(State state, float f) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(SimpleBasePlayer simpleBasePlayer, Player.Listener listener, FlagSet flagSet) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State dpbdqAKWNZAIXLyehU1lll1lll1(State state) {
    }

    public static /* synthetic */ State dqbbdddqpLERmaRLiHiDpL1l1l1l(SimpleBasePlayer simpleBasePlayer, State state, List list, int i) {
    }

    public static /* synthetic */ State dqdqbpQposEBDyDxIyyz1ll11(State state, int i) {
    }

    public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State dqpqqqbqQyjyB11111l1(State state, boolean z) {
    }

    public static /* synthetic */ void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State dqqppqiKzJi1l1lll1l(State state) {
    }

    private static long getContentBufferedPositionMsInternal(State state) {
    }

    private static long getContentPositionMsInternal(State state) {
    }

    private static int getCurrentMediaItemIndexInternal(State state) {
    }

    private static int getCurrentPeriodIndexInternal(State state, Timeline.Window window, Timeline.Period period) {
    }

    private static long getCurrentPeriodOrAdPositionMs(State state, Object obj, Timeline.Period period) {
    }

    private static Tracks getCurrentTracksInternal(State state) {
    }

    private static int getMediaItemIndexInNewPlaylist(List<MediaItemData> list, Timeline timeline, int i, Timeline.Period period) {
    }

    private static int getMediaItemTransitionReason(State state, State state2, int i, boolean z, Timeline.Window window) {
    }

    private static MediaMetadata getMediaMetadataInternal(State state) {
    }

    private static int getPeriodIndexFromWindowPosition(Timeline timeline, int i, long j, Timeline.Window window, Timeline.Period period) {
    }

    private static long getPeriodOrAdDurationMs(State state, Object obj, Timeline.Period period) {
    }

    private static int getPositionDiscontinuityReason(State state, State state2, boolean z, Timeline.Window window, Timeline.Period period) {
    }

    private static Player.PositionInfo getPositionInfo(State state, boolean z, Timeline.Window window, Timeline.Period period) {
    }

    private static long getPositionOrDefaultInMediaItem(long j, State state) {
    }

    private static State getStateWithNewPlaylist(State state, List<MediaItemData> list, Timeline.Period period) {
    }

    private static State getStateWithNewPlaylistAndPosition(State state, List<MediaItemData> list, int i, long j) {
    }

    private static Size getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
    }

    private static int getTimelineChangeReason(List<MediaItemData> list, List<MediaItemData> list2) {
    }

    private static boolean isPlaying(State state) {
    }

    private /* synthetic */ State lambda$addMediaItems$3(State state, List list, int i) {
    }

    private static /* synthetic */ State lambda$clearVideoOutput$20(State state) {
    }

    private static /* synthetic */ State lambda$decreaseDeviceVolume$23(State state) {
    }

    private static /* synthetic */ State lambda$increaseDeviceVolume$22(State state) {
    }

    private /* synthetic */ State lambda$moveMediaItems$4(State state, int i, int i2, int i3) {
    }

    private /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
    }

    private static /* synthetic */ State lambda$prepare$6(State state) {
    }

    private static /* synthetic */ State lambda$release$12(State state) {
    }

    private /* synthetic */ State lambda$removeMediaItems$5(State state, int i, int i2) {
    }

    private static /* synthetic */ State lambda$seekTo$9(State state, int i, long j) {
    }

    private static /* synthetic */ State lambda$setDeviceMuted$24(State state, boolean z) {
    }

    private static /* synthetic */ State lambda$setDeviceVolume$21(State state, int i) {
    }

    private /* synthetic */ State lambda$setMediaItemsInternal$2(List list, State state, int i, long j) {
    }

    private static /* synthetic */ State lambda$setPlayWhenReady$1(State state, boolean z) {
    }

    private static /* synthetic */ State lambda$setPlaybackParameters$10(State state, PlaybackParameters playbackParameters) {
    }

    private static /* synthetic */ State lambda$setPlaylistMetadata$14(State state, MediaMetadata mediaMetadata) {
    }

    private static /* synthetic */ State lambda$setRepeatMode$7(State state, int i) {
    }

    private static /* synthetic */ State lambda$setShuffleModeEnabled$8(State state, boolean z) {
    }

    private static /* synthetic */ State lambda$setTrackSelectionParameters$13(State state, TrackSelectionParameters trackSelectionParameters) {
    }

    private static /* synthetic */ State lambda$setVideoSurface$16(State state) {
    }

    private static /* synthetic */ State lambda$setVideoSurfaceHolder$17(State state, SurfaceHolder surfaceHolder) {
    }

    private static /* synthetic */ State lambda$setVideoSurfaceView$18(State state, SurfaceView surfaceView) {
    }

    private static /* synthetic */ State lambda$setVideoTextureView$19(State state, Size size) {
    }

    private static /* synthetic */ State lambda$setVolume$15(State state, float f) {
    }

    private static /* synthetic */ State lambda$stop$11(State state) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$25(State state, int i, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$26(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$27(MediaItem mediaItem, int i, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$28(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$29(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$30(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$31(Tracks tracks, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$32(MediaMetadata mediaMetadata, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$33(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$34(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$35(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$36(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$37(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$38(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$39(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$40(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$41(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$42(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$43(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$44(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$45(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$46(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$47(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$48(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$49(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$50(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$51(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$52(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$53(State state, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updateStateAndInformListeners$54(State state, Player.Listener listener) {
    }

    private /* synthetic */ void lambda$updateStateForPendingOperation$55(ListenableFuture listenableFuture) {
    }

    public static /* synthetic */ State pbdbqZLBIrMLYk1l11l1ll1(State state) {
    }

    public static /* synthetic */ void pbddqdbpoVvTyZPOoYl1111(SimpleBasePlayer simpleBasePlayer, Runnable runnable) {
    }

    public static /* synthetic */ void pbppbpqbamJRy11l1l1(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void pdpqbmApOBCmNMwnn1ll111(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void pdqdddDNpMbeVT11ll11(SimpleBasePlayer simpleBasePlayer, ListenableFuture listenableFuture) {
    }

    private void postOrRunOnApplicationHandler(Runnable runnable) {
    }

    public static /* synthetic */ State ppbdpwWWljzmXXdHNabfWhgjl111l11(SimpleBasePlayer simpleBasePlayer, State state, int i, int i2) {
    }

    public static /* synthetic */ void ppdqqzXJzQiU11ll11(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void ppppqdfPOyVswFHMTylxLClll1l1111(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l(State state) {
    }

    public static /* synthetic */ void qbddqbdJBkudFfhX1ll1l111(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State qbdpqpstJKhhKkXrsOGvbWw1l1llll(State state, SurfaceView surfaceView) {
    }

    public static /* synthetic */ void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State qbpbbZWTnlDkwOgZlllll(State state, boolean z) {
    }

    public static /* synthetic */ void qbpbddbpyaPAbpThgWCvm11l11l1(State state, Player.Listener listener) {
    }

    public static /* synthetic */ State qddbbpxsbNjqxvn111ll(State state, int i) {
    }

    public static /* synthetic */ State qdqdpyALEmZFGGaahRTIU1ll11(State state, PlaybackParameters playbackParameters) {
    }

    public static /* synthetic */ State qppqdpppIauLKaAtRkB11111l(SimpleBasePlayer simpleBasePlayer, List list, State state, int i, long j) {
    }

    public static /* synthetic */ void qqbqbddiRRgLpniPxlUfQzP1l1l1l(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void qqdbbfmUWwoYYpfYHJZdaUO1111llll(State state, Player.Listener listener) {
    }

    public static /* synthetic */ void qqpbppebHUxqEmlGoAJWl1lll(State state, Player.Listener listener) {
    }

    @RequiresNonNull({RemoteConfigConstants.ResponseFieldKey.STATE})
    private void setMediaItemsInternal(List<MediaItem> list, int i, long j) {
    }

    @RequiresNonNull({RemoteConfigConstants.ResponseFieldKey.STATE})
    private boolean shouldHandleCommand(int i) {
    }

    @RequiresNonNull({RemoteConfigConstants.ResponseFieldKey.STATE})
    private void updateStateAndInformListeners(State state, boolean z, boolean z2) {
    }

    @RequiresNonNull({RemoteConfigConstants.ResponseFieldKey.STATE})
    private void updateStateForPendingOperation(ListenableFuture<?> listenableFuture, Supplier<State> supplier) {
    }

    @EnsuresNonNull({RemoteConfigConstants.ResponseFieldKey.STATE})
    private void verifyApplicationThreadAndInitState() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItems(int i, List<MediaItem> list) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurface() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoTextureView(TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void decreaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final Looper getApplicationLooper() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final AudioAttributes getAudioAttributes() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final Player.Commands getAvailableCommands() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getBufferedPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentBufferedPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public final CueGroup getCurrentCues() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentMediaItemIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final Timeline getCurrentTimeline() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final Tracks getCurrentTracks() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final DeviceInfo getDeviceInfo() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final int getDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getMaxSeekToPreviousPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata getMediaMetadata() {
    }

    @ForOverride
    protected MediaItemData getPlaceholderMediaItemData(MediaItem mediaItem) {
    }

    @ForOverride
    protected State getPlaceholderState(State state) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getPlayWhenReady() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackParameters getPlaybackParameters() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackState() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackSuppressionReason() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackException getPlayerError() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata getPlaylistMetadata() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getRepeatMode() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekBackIncrement() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekForwardIncrement() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getShuffleModeEnabled() {
    }

    @ForOverride
    protected abstract State getState();

    @Override // com.google.android.exoplayer2.Player
    public final Size getSurfaceSize() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getTotalBufferedDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final VideoSize getVideoSize() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final float getVolume() {
    }

    @ForOverride
    protected ListenableFuture<?> handleAddMediaItems(int i, List<MediaItem> list) {
    }

    @ForOverride
    protected ListenableFuture<?> handleClearVideoOutput(Object obj) {
    }

    @ForOverride
    protected ListenableFuture<?> handleDecreaseDeviceVolume() {
    }

    @ForOverride
    protected ListenableFuture<?> handleIncreaseDeviceVolume() {
    }

    @ForOverride
    protected ListenableFuture<?> handleMoveMediaItems(int i, int i2, int i3) {
    }

    @ForOverride
    protected ListenableFuture<?> handlePrepare() {
    }

    @ForOverride
    protected ListenableFuture<?> handleRelease() {
    }

    @ForOverride
    protected ListenableFuture<?> handleRemoveMediaItems(int i, int i2) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSeek(int i, long j, int i2) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetDeviceMuted(boolean z) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetDeviceVolume(int i) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetMediaItems(List<MediaItem> list, int i, long j) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetRepeatMode(int i) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetShuffleModeEnabled(boolean z) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetVideoOutput(Object obj) {
    }

    @ForOverride
    protected ListenableFuture<?> handleSetVolume(float f) {
    }

    @ForOverride
    protected ListenableFuture<?> handleStop() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void increaseDeviceVolume() {
    }

    protected final void invalidateState() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final boolean isDeviceMuted() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isLoading() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlayingAd() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void moveMediaItems(int i, int i2, int i3) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void prepare() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeMediaItems(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.BasePlayer
    public final void seekTo(int i, long j, int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void setDeviceMuted(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void setDeviceVolume(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(List<MediaItem> list, boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlayWhenReady(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaylistMetadata(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setRepeatMode(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setShuffleModeEnabled(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurface(Surface surface) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoTextureView(TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final void setVolume(float f) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop() {
    }

    protected SimpleBasePlayer(Looper looper, Clock clock) {
    }

    @RequiresNonNull({RemoteConfigConstants.ResponseFieldKey.STATE})
    private void updateStateForPendingOperation(ListenableFuture<?> listenableFuture, Supplier<State> supplier, boolean z, boolean z2) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurface(Surface surface) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(List<MediaItem> list, int i, long j) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop(boolean z) {
    }
}
