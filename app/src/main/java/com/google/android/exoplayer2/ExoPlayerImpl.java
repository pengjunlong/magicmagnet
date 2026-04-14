package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.AudioBecomingNoisyManager;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.StreamVolumeManager;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ExoPlayerImpl extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {
    private static final String TAG = "ExoPlayerImpl";
    private final AnalyticsCollector analyticsCollector;
    private final Context applicationContext;
    private final Looper applicationLooper;
    private AudioAttributes audioAttributes;
    private final AudioBecomingNoisyManager audioBecomingNoisyManager;
    private DecoderCounters audioDecoderCounters;
    private final AudioFocusManager audioFocusManager;
    private Format audioFormat;
    private final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private int audioSessionId;
    private Player.Commands availableCommands;
    private final BandwidthMeter bandwidthMeter;
    private CameraMotionListener cameraMotionListener;
    private final Clock clock;
    private final ComponentListener componentListener;
    private final ConditionVariable constructorFinished;
    private CueGroup currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private DeviceInfo deviceInfo;
    final TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;
    private AudioTrack keepSessionIdAudioTrack;
    private final ListenerSet<Player.Listener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private MediaMetadata mediaMetadata;
    private final MediaSource.Factory mediaSourceFactory;
    private final List<MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private int pendingPlayWhenReadyChangeReason;
    private final Timeline.Period period;
    final Player.Commands permanentAvailableCommands;
    private PlaybackInfo playbackInfo;
    private final HandlerWrapper playbackInfoUpdateHandler;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private MediaMetadata playlistMetadata;
    private PriorityTaskManager priorityTaskManager;
    private final Renderer[] renderers;
    private int repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;
    private SphericalGLSurfaceView sphericalGLSurfaceView;
    private MediaMetadata staticAndDynamicMediaMetadata;
    private final StreamVolumeManager streamVolumeManager;
    private SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private Size surfaceSize;
    private TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final TrackSelector trackSelector;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;
    private DecoderCounters videoDecoderCounters;
    private Format videoFormat;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private Object videoOutput;
    private int videoScalingMode;
    private VideoSize videoSize;
    private float volume;
    private final WakeLockManager wakeLockManager;
    private final WifiLockManager wifiLockManager;
    private final Player wrappingPlayer;

    private static final class Api31 {
        private Api31() {
        }

        public static PlayerId registerMediaMetricsListener(Context context, ExoPlayerImpl exoPlayerImpl, boolean z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener {
        final /* synthetic */ ExoPlayerImpl this$0;

        private ComponentListener(ExoPlayerImpl exoPlayerImpl) {
        }

        public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(List list, Player.Listener listener) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(Metadata metadata, Player.Listener listener) {
        }

        public static /* synthetic */ void ddbbbeXHXx111ll(boolean z, Player.Listener listener) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(VideoSize videoSize, Player.Listener listener) {
        }

        public static /* synthetic */ void dpbdpqRKAscW1lll1l(CueGroup cueGroup, Player.Listener listener) {
        }

        public static /* synthetic */ void dqpqqqbqQyjyB11111l1(DeviceInfo deviceInfo, Player.Listener listener) {
        }

        public static /* synthetic */ void dqqppqiKzJi1l1lll1l(int i, boolean z, Player.Listener listener) {
        }

        private static /* synthetic */ void lambda$onCues$2(List list, Player.Listener listener) {
        }

        private static /* synthetic */ void lambda$onCues$3(CueGroup cueGroup, Player.Listener listener) {
        }

        private /* synthetic */ void lambda$onMetadata$4(Player.Listener listener) {
        }

        private static /* synthetic */ void lambda$onMetadata$5(Metadata metadata, Player.Listener listener) {
        }

        private static /* synthetic */ void lambda$onSkipSilenceEnabledChanged$1(boolean z, Player.Listener listener) {
        }

        private static /* synthetic */ void lambda$onStreamTypeChanged$6(DeviceInfo deviceInfo, Player.Listener listener) {
        }

        private static /* synthetic */ void lambda$onStreamVolumeChanged$7(int i, boolean z, Player.Listener listener) {
        }

        private static /* synthetic */ void lambda$onVideoSizeChanged$0(VideoSize videoSize, Player.Listener listener) {
        }

        public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(ComponentListener componentListener, Player.Listener listener) {
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int i) {
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioCodecError(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(String str, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(String str) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDisabled(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioEnabled(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioInputFormatChanged(Format format) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioSinkError(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(List<Cue> list) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onDroppedFrames(int i, long j) {
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public /* synthetic */ void onExperimentalOffloadedPlayback(boolean z) {
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public void onExperimentalSleepingForOffloadChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onRenderedFirstFrame(Object obj, long j) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(int i, boolean z) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoCodecError(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(String str, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderReleased(String str) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDisabled(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoEnabled(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j, int i) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoInputFormatChanged(Format format) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(Surface surface) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(Surface surface) {
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float f) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        /* synthetic */ ComponentListener(ExoPlayerImpl exoPlayerImpl, C00711 c00711) {
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(CueGroup cueGroup) {
        }
    }

    private static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
        private CameraMotionListener cameraMotionListener;
        private CameraMotionListener internalCameraMotionListener;
        private VideoFrameMetadataListener internalVideoFrameMetadataListener;
        private VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
        }

        @Override // com.google.android.exoplayer2.PlayerMessage.Target
        public void handleMessage(int i, Object obj) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotion(long j, float[] fArr) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j, long j2, Format format, MediaFormat mediaFormat) {
        }

        /* synthetic */ FrameMetadataListener(C00711 c00711) {
        }
    }

    private static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        private Timeline timeline;
        private final Object uid;

        public MediaSourceHolderSnapshot(Object obj, Timeline timeline) {
        }

        static /* synthetic */ Timeline access$202(MediaSourceHolderSnapshot mediaSourceHolderSnapshot, Timeline timeline) {
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Timeline getTimeline() {
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Object getUid() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public ExoPlayerImpl(ExoPlayer.Builder builder, Player player) {
    }

    static /* synthetic */ Format access$1002(ExoPlayerImpl exoPlayerImpl, Format format) {
    }

    static /* synthetic */ boolean access$1100(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ boolean access$1102(ExoPlayerImpl exoPlayerImpl, boolean z) {
    }

    static /* synthetic */ CueGroup access$1202(ExoPlayerImpl exoPlayerImpl, CueGroup cueGroup) {
    }

    static /* synthetic */ MediaMetadata access$1300(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ MediaMetadata access$1302(ExoPlayerImpl exoPlayerImpl, MediaMetadata mediaMetadata) {
    }

    static /* synthetic */ MediaMetadata access$1400(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ MediaMetadata access$1500(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ MediaMetadata access$1502(ExoPlayerImpl exoPlayerImpl, MediaMetadata mediaMetadata) {
    }

    static /* synthetic */ boolean access$1600(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ void access$1700(ExoPlayerImpl exoPlayerImpl, Object obj) {
    }

    static /* synthetic */ void access$1800(ExoPlayerImpl exoPlayerImpl, int i, int i2) {
    }

    static /* synthetic */ void access$1900(ExoPlayerImpl exoPlayerImpl, SurfaceTexture surfaceTexture) {
    }

    static /* synthetic */ void access$2000(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ int access$2100(boolean z, int i) {
    }

    static /* synthetic */ void access$2200(ExoPlayerImpl exoPlayerImpl, boolean z, int i, int i2) {
    }

    static /* synthetic */ StreamVolumeManager access$2300(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ DeviceInfo access$2400(StreamVolumeManager streamVolumeManager) {
    }

    static /* synthetic */ DeviceInfo access$2500(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ DeviceInfo access$2502(ExoPlayerImpl exoPlayerImpl, DeviceInfo deviceInfo) {
    }

    static /* synthetic */ void access$2600(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ DecoderCounters access$302(ExoPlayerImpl exoPlayerImpl, DecoderCounters decoderCounters) {
    }

    static /* synthetic */ AnalyticsCollector access$400(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ Format access$502(ExoPlayerImpl exoPlayerImpl, Format format) {
    }

    static /* synthetic */ VideoSize access$602(ExoPlayerImpl exoPlayerImpl, VideoSize videoSize) {
    }

    static /* synthetic */ ListenerSet access$700(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ Object access$800(ExoPlayerImpl exoPlayerImpl) {
    }

    static /* synthetic */ DecoderCounters access$902(ExoPlayerImpl exoPlayerImpl, DecoderCounters decoderCounters) {
    }

    private List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i, List<MediaSource> list) {
    }

    public static /* synthetic */ void bbdbbpdOJSuInlll111l(int i, Player.Listener listener) {
    }

    public static /* synthetic */ void bdddqmITkkeGpsxVXHR1l1llll(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    public static /* synthetic */ void bpbbpOxqjGWQAsycX11ll1l1(PlaybackInfo playbackInfo, int i, Player.Listener listener) {
    }

    public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(float f, Player.Listener listener) {
    }

    public static /* synthetic */ void bppbpdbCeZVhQNTixBml1lll11l(ExoPlayerImpl exoPlayerImpl, Player.Listener listener) {
    }

    public static /* synthetic */ void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(ExoPlayerImpl exoPlayerImpl, Player.Listener listener) {
    }

    public static /* synthetic */ void bpqdqbqpviKiORjqgp1l111l11(ExoPlayerImpl exoPlayerImpl, ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    private MediaMetadata buildUpdatedMediaMetadata() {
    }

    private static DeviceInfo createDeviceInfo(StreamVolumeManager streamVolumeManager) {
    }

    private Timeline createMaskingTimeline() {
    }

    private List<MediaSource> createMediaSources(List<MediaItem> list) {
    }

    private PlayerMessage createMessageInternal(PlayerMessage.Target target) {
    }

    public static /* synthetic */ void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(AudioAttributes audioAttributes, Player.Listener listener) {
    }

    public static /* synthetic */ void dbbpdqqpdVUhpQ1ll11(MediaMetadata mediaMetadata, Player.Listener listener) {
    }

    public static /* synthetic */ void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(PlaybackInfo playbackInfo, int i, Player.Listener listener) {
    }

    public static /* synthetic */ void dbppbdqpeLmcbs11l11(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(TrackSelectionParameters trackSelectionParameters, Player.Listener listener) {
    }

    public static /* synthetic */ void ddbbbeXHXx111ll(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    public static /* synthetic */ void dddbpbpNqzZZJmSG1111l(Player.Listener listener) {
    }

    public static /* synthetic */ void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(boolean z, Player.Listener listener) {
    }

    public static /* synthetic */ void dpbdpqRKAscW1lll1l(ExoPlayerImpl exoPlayerImpl, Player.Listener listener, FlagSet flagSet) {
    }

    public static /* synthetic */ void dqdqbpQposEBDyDxIyyz1ll11(ExoPlayerImpl exoPlayerImpl, ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    public static /* synthetic */ void dqpdbEevAufTOvPphbjykClll1l11(int i, int i2, Player.Listener listener) {
    }

    public static /* synthetic */ void dqpqqqbqQyjyB11111l1(boolean z, Player.Listener listener) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2, boolean z, int i, boolean z2, boolean z3) {
    }

    private long getCurrentPositionUsInternal(PlaybackInfo playbackInfo) {
    }

    private int getCurrentWindowIndexInternal() {
    }

    private Pair<Object, Long> getPeriodPositionUsAfterTimelineChanged(Timeline timeline, Timeline timeline2) {
    }

    private static int getPlayWhenReadyChangeReason(boolean z, int i) {
    }

    private Player.PositionInfo getPositionInfo(long j) {
    }

    private Player.PositionInfo getPreviousPositionInfo(int i, PlaybackInfo playbackInfo, int i2) {
    }

    private static long getRequestedContentPositionUs(PlaybackInfo playbackInfo) {
    }

    private void handlePlaybackInfo(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    private int initializeKeepSessionIdAudioTrack(int i) {
    }

    private static boolean isPlaying(PlaybackInfo playbackInfo) {
    }

    private static /* synthetic */ void lambda$maybeNotifySurfaceSizeChanged$27(int i, int i2, Player.Listener listener) {
    }

    private /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
    }

    private /* synthetic */ void lambda$new$1(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    private /* synthetic */ void lambda$new$2(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
    }

    private static /* synthetic */ void lambda$release$5(Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$setAudioAttributes$8(AudioAttributes audioAttributes, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$setAudioSessionId$9(int i, Player.Listener listener) {
    }

    private /* synthetic */ void lambda$setPlaylistMetadata$7(Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$setRepeatMode$3(int i, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$setShuffleModeEnabled$4(boolean z, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$setSkipSilenceEnabled$11(boolean z, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$setTrackSelectionParameters$6(TrackSelectionParameters trackSelectionParameters, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$setVolume$10(float f, Player.Listener listener) {
    }

    private /* synthetic */ void lambda$updateAvailableCommands$26(Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$12(PlaybackInfo playbackInfo, int i, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$13(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$14(MediaItem mediaItem, int i, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$15(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$16(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$17(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$18(MediaMetadata mediaMetadata, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$19(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$20(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$21(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$22(PlaybackInfo playbackInfo, int i, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$23(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$24(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private static /* synthetic */ void lambda$updatePlaybackInfo$25(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private PlaybackInfo maskTimelineAndPosition(PlaybackInfo playbackInfo, Timeline timeline, Pair<Object, Long> pair) {
    }

    private Pair<Object, Long> maskWindowPositionMsOrGetPeriodPositionUs(Timeline timeline, int i, long j) {
    }

    private void maybeNotifySurfaceSizeChanged(int i, int i2) {
    }

    public static /* synthetic */ void pbppbpqbamJRy11l1l1(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private long periodPositionUsToWindowPositionUs(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j) {
    }

    public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    public static /* synthetic */ void qbddqbdJBkudFfhX1ll1l111(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
    }

    public static /* synthetic */ void qbdpqpstJKhhKkXrsOGvbWw1l1llll(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    public static /* synthetic */ void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(int i, Player.Listener listener) {
    }

    public static /* synthetic */ void qdqdpyALEmZFGGaahRTIU1ll11(MediaItem mediaItem, int i, Player.Listener listener) {
    }

    public static /* synthetic */ void qppqdpppIauLKaAtRkB11111l(PlaybackInfo playbackInfo, Player.Listener listener) {
    }

    private PlaybackInfo removeMediaItemsInternal(int i, int i2) {
    }

    private void removeMediaSourceHolders(int i, int i2) {
    }

    private void removeSurfaceCallbacks() {
    }

    private void sendRendererMessage(int i, int i2, Object obj) {
    }

    private void sendVolumeToRenderers() {
    }

    private void setMediaSourcesInternal(List<MediaSource> list, int i, long j, boolean z) {
    }

    private void setNonVideoOutputSurfaceHolderInternal(SurfaceHolder surfaceHolder) {
    }

    private void setSurfaceTextureInternal(SurfaceTexture surfaceTexture) {
    }

    private void setVideoOutputInternal(Object obj) {
    }

    private void stopInternal(boolean z, ExoPlaybackException exoPlaybackException) {
    }

    private void updateAvailableCommands() {
    }

    private void updatePlayWhenReady(boolean z, int i, int i2) {
    }

    private void updatePlaybackInfo(PlaybackInfo playbackInfo, int i, int i2, boolean z, boolean z2, int i3, long j, int i4, boolean z3) {
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z) {
    }

    private void updateWakeAndWifiLock() {
    }

    private void verifyApplicationThread() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int i, List<MediaItem> list) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(List<MediaSource> list) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(CameraMotionListener cameraMotionListener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoTextureView(TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void decreaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public AnalyticsCollector getAnalyticsCollector() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Looper getApplicationLooper() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public AudioAttributes getAudioAttributes() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @CanIgnoreReturnValue
    @Deprecated
    public ExoPlayer.AudioComponent getAudioComponent() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public DecoderCounters getAudioDecoderCounters() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Format getAudioFormat() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Player.Commands getAvailableCommands() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Clock getClock() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public CueGroup getCurrentCues() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public TrackGroupArray getCurrentTrackGroups() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public TrackSelectionArray getCurrentTrackSelections() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Tracks getCurrentTracks() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @CanIgnoreReturnValue
    @Deprecated
    public ExoPlayer.DeviceComponent getDeviceComponent() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public DeviceInfo getDeviceInfo() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public int getDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getMaxSeekToPreviousPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getMediaMetadata() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
    }

    @Override // com.google.android.exoplayer2.Player
    public /* bridge */ /* synthetic */ PlaybackException getPlayerError() {
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getPlaylistMetadata() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Renderer getRenderer(int i) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public SeekParameters getSeekParameters() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
    }

    @Override // com.google.android.exoplayer2.Player
    public Size getSurfaceSize() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @CanIgnoreReturnValue
    @Deprecated
    public ExoPlayer.TextComponent getTextComponent() {
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public TrackSelector getTrackSelector() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @CanIgnoreReturnValue
    @Deprecated
    public ExoPlayer.VideoComponent getVideoComponent() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public DecoderCounters getVideoDecoderCounters() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Format getVideoFormat() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public VideoSize getVideoSize() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public float getVolume() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void increaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public boolean isDeviceMuted() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isTunnelingEnabled() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int i, int i2, int i3) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void retry() {
    }

    @Override // com.google.android.exoplayer2.BasePlayer
    public void seekTo(int i, long j, int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioSessionId(int i) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setCameraMotionListener(CameraMotionListener cameraMotionListener) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceMuted(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceVolume(int i) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean z) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleWakeLock(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> list, boolean z) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> list) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int i) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(SeekParameters seekParameters) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean z) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(boolean z) {
    }

    void setThrowsWhenUsingWrongThread(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int i) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int i) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurface(Surface surface) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoTextureView(TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setVolume(float f) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setWakeMode(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
    }

    @Override // com.google.android.exoplayer2.Player
    public ExoPlaybackException getPlayerError() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int i, MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int i, List<MediaSource> list) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> list, int i, long j) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long j) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> list, boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface(Surface surface) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> list, int i, long j) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean z) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
    }
}
