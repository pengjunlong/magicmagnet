package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface ExoPlayer extends Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        AudioAttributes getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

        @Deprecated
        void setAudioSessionId(int i);

        @Deprecated
        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        @Deprecated
        void setSkipSilenceEnabled(boolean z);

        @Deprecated
        void setVolume(float f);
    }

    public interface AudioOffloadListener {
        void onExperimentalOffloadSchedulingEnabledChanged(boolean z);

        void onExperimentalOffloadedPlayback(boolean z);

        void onExperimentalSleepingForOffloadChanged(boolean z);
    }

    public static final class Builder {
        Function<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        Supplier<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        Supplier<LoadControl> loadControlSupplier;
        Looper looper;
        Supplier<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        Looper playbackLooper;
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        Supplier<RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        Supplier<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(Context context) {
        }

        public static /* synthetic */ AnalyticsCollector bbdbbpdOJSuInlll111l(AnalyticsCollector analyticsCollector, Clock clock) {
        }

        public static /* synthetic */ RenderersFactory bdddqmITkkeGpsxVXHR1l1llll(Context context) {
        }

        public static /* synthetic */ BandwidthMeter bpdqqiQNVROMLC1ll1l1l11(Context context) {
        }

        public static /* synthetic */ RenderersFactory bppbpdbCeZVhQNTixBml1lll11l(RenderersFactory renderersFactory) {
        }

        public static /* synthetic */ MediaSource.Factory bpppdpppqFAXRSTHUAmVJLvH11lllll1l(MediaSource.Factory factory) {
        }

        public static /* synthetic */ BandwidthMeter dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(BandwidthMeter bandwidthMeter) {
        }

        public static /* synthetic */ BandwidthMeter dbbpdqqpdVUhpQ1ll11(BandwidthMeter bandwidthMeter) {
        }

        public static /* synthetic */ RenderersFactory dbppbdqpeLmcbs11l11(RenderersFactory renderersFactory) {
        }

        public static /* synthetic */ RenderersFactory dbpqdHhmDSIHIJiwc1ll1l1(RenderersFactory renderersFactory) {
        }

        public static /* synthetic */ TrackSelector ddbbbeXHXx111ll(TrackSelector trackSelector) {
        }

        public static /* synthetic */ TrackSelector ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(Context context) {
        }

        public static /* synthetic */ AnalyticsCollector dpbdbdpbLwkLpObyKsq1lll1(AnalyticsCollector analyticsCollector, Clock clock) {
        }

        public static /* synthetic */ MediaSource.Factory dpbdpqRKAscW1lll1l(MediaSource.Factory factory) {
        }

        public static /* synthetic */ MediaSource.Factory dqdqbpQposEBDyDxIyyz1ll11(Context context) {
        }

        public static /* synthetic */ RenderersFactory dqpdbEevAufTOvPphbjykClll1l11(Context context) {
        }

        public static /* synthetic */ MediaSource.Factory dqpqqqbqQyjyB11111l1(MediaSource.Factory factory) {
        }

        public static /* synthetic */ MediaSource.Factory dqqppqiKzJi1l1lll1l(Context context) {
        }

        private static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
        }

        private static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
        }

        private static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
        }

        private static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
        }

        private static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
        }

        private static /* synthetic */ TrackSelector lambda$new$14(Context context) {
        }

        private static /* synthetic */ BandwidthMeter lambda$new$15(Context context) {
        }

        private static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
        }

        private static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
        }

        private static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
        }

        private static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
        }

        private static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, Clock clock) {
        }

        private static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
        }

        private static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
        }

        private static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
        }

        private static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
        }

        private static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
        }

        public static /* synthetic */ MediaSource.Factory pbppbpqbamJRy11l1l1(MediaSource.Factory factory) {
        }

        public static /* synthetic */ LoadControl ppbdpwWWljzmXXdHNabfWhgjl111l11(LoadControl loadControl) {
        }

        public static /* synthetic */ TrackSelector qbddqbdJBkudFfhX1ll1l111(TrackSelector trackSelector) {
        }

        public static /* synthetic */ RenderersFactory qbdpqpstJKhhKkXrsOGvbWw1l1llll(RenderersFactory renderersFactory) {
        }

        public static /* synthetic */ LoadControl qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(LoadControl loadControl) {
        }

        public ExoPlayer build() {
        }

        SimpleExoPlayer buildSimpleExoPlayer() {
        }

        @CanIgnoreReturnValue
        public Builder experimentalSetForegroundModeTimeoutMs(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
        }

        @CanIgnoreReturnValue
        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
        }

        @CanIgnoreReturnValue
        public Builder setClock(Clock clock) {
        }

        @CanIgnoreReturnValue
        public Builder setDetachSurfaceTimeoutMs(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setHandleAudioBecomingNoisy(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
        }

        @CanIgnoreReturnValue
        public Builder setLoadControl(LoadControl loadControl) {
        }

        @CanIgnoreReturnValue
        public Builder setLooper(Looper looper) {
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
        }

        @CanIgnoreReturnValue
        public Builder setPauseAtEndOfMediaItems(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackLooper(Looper looper) {
        }

        @CanIgnoreReturnValue
        public Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
        }

        @CanIgnoreReturnValue
        public Builder setReleaseTimeoutMs(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setRenderersFactory(RenderersFactory renderersFactory) {
        }

        @CanIgnoreReturnValue
        public Builder setSeekBackIncrementMs(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setSeekForwardIncrementMs(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setSeekParameters(SeekParameters seekParameters) {
        }

        @CanIgnoreReturnValue
        public Builder setSkipSilenceEnabled(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setTrackSelector(TrackSelector trackSelector) {
        }

        @CanIgnoreReturnValue
        public Builder setUseLazyPreparation(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setUsePlatformDiagnostics(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setVideoChangeFrameRateStrategy(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setVideoScalingMode(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setWakeMode(int i) {
        }

        public Builder(Context context, RenderersFactory renderersFactory) {
        }

        public Builder(Context context, MediaSource.Factory factory) {
        }

        public Builder(Context context, RenderersFactory renderersFactory, MediaSource.Factory factory) {
        }

        public Builder(Context context, RenderersFactory renderersFactory, MediaSource.Factory factory, TrackSelector trackSelector, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector) {
        }

        private Builder(Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2) {
        }

        private Builder(Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2, Supplier<TrackSelector> supplier3, Supplier<LoadControl> supplier4, Supplier<BandwidthMeter> supplier5, Function<Clock, AnalyticsCollector> function) {
        }
    }

    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z);

        @Deprecated
        void setDeviceVolume(int i);
    }

    @Deprecated
    public interface TextComponent {
        @Deprecated
        CueGroup getCurrentCues();
    }

    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        VideoSize getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i);

        @Deprecated
        void setVideoSurface(Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    PlayerMessage createMessage(PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z);

    AnalyticsCollector getAnalyticsCollector();

    @Deprecated
    AudioComponent getAudioComponent();

    DecoderCounters getAudioDecoderCounters();

    Format getAudioFormat();

    int getAudioSessionId();

    Clock getClock();

    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @Deprecated
    DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    ExoPlaybackException getPlayerError();

    @Override // com.google.android.exoplayer2.Player
    /* bridge */ /* synthetic */ PlaybackException getPlayerError();

    Renderer getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @Deprecated
    TextComponent getTextComponent();

    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    VideoComponent getVideoComponent();

    DecoderCounters getVideoDecoderCounters();

    Format getVideoFormat();

    int getVideoScalingMode();

    boolean isTunnelingEnabled();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Deprecated
    void retry();

    void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    @Deprecated
    void setHandleWakeLock(boolean z);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j);

    void setMediaSource(MediaSource mediaSource, boolean z);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i, long j);

    void setMediaSources(List<MediaSource> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(PriorityTaskManager priorityTaskManager);

    void setSeekParameters(SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i);

    void setWakeMode(int i);
}
