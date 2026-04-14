package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class PlayerView extends FrameLayout implements AdViewProvider {
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final FrameLayout adOverlayFrameLayout;
    private final ImageView artworkView;
    private final View bufferingView;
    private final ComponentListener componentListener;
    private final AspectRatioFrameLayout contentFrame;
    private final PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private PlayerControlView.VisibilityListener controllerVisibilityListener;
    private CharSequence customErrorMessage;
    private Drawable defaultArtwork;
    private ErrorMessageProvider<? super PlaybackException> errorMessageProvider;
    private final TextView errorMessageView;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;
    private final FrameLayout overlayFrameLayout;
    private Player player;
    private int showBuffering;
    private final View shutterView;
    private final SubtitleView subtitleView;
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    private final class ComponentListener implements Player.Listener, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.VisibilityListener {
        private Object lastPeriodUidWithTracks;
        private final Timeline.Period period;
        final /* synthetic */ PlayerView this$0;

        public ComponentListener(PlayerView playerView) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(CueGroup cueGroup) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTracksChanged(Tracks tracks) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener
        public void onVisibilityChange(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    public PlayerView(Context context) {
    }

    static /* synthetic */ SubtitleView access$000(PlayerView playerView) {
    }

    static /* synthetic */ void access$100(PlayerView playerView) {
    }

    static /* synthetic */ int access$1000(PlayerView playerView) {
    }

    static /* synthetic */ void access$1100(TextureView textureView, int i) {
    }

    static /* synthetic */ void access$1200(PlayerView playerView) {
    }

    static /* synthetic */ void access$1300(PlayerView playerView) {
    }

    static /* synthetic */ View access$200(PlayerView playerView) {
    }

    static /* synthetic */ Player access$300(PlayerView playerView) {
    }

    static /* synthetic */ void access$400(PlayerView playerView, boolean z) {
    }

    static /* synthetic */ void access$500(PlayerView playerView) {
    }

    static /* synthetic */ void access$600(PlayerView playerView) {
    }

    static /* synthetic */ void access$700(PlayerView playerView) {
    }

    static /* synthetic */ boolean access$800(PlayerView playerView) {
    }

    static /* synthetic */ boolean access$900(PlayerView playerView) {
    }

    private static void applyTextureViewRotation(TextureView textureView, int i) {
    }

    private void closeShutter() {
    }

    private static void configureEditModeLogo(Context context, Resources resources, ImageView imageView) {
    }

    private static void configureEditModeLogoV23(Context context, Resources resources, ImageView imageView) {
    }

    private void hideArtwork() {
    }

    @SuppressLint({"InlinedApi"})
    private boolean isDpadKey(int i) {
    }

    private boolean isPlayingAd() {
    }

    private void maybeShowController(boolean z) {
    }

    @RequiresNonNull({"artworkView"})
    private boolean setArtworkFromMediaMetadata(MediaMetadata mediaMetadata) {
    }

    @RequiresNonNull({"artworkView"})
    private boolean setDrawableArtwork(Drawable drawable) {
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
    }

    private boolean shouldShowControllerIndefinitely() {
    }

    public static void switchTargetView(Player player, PlayerView playerView, PlayerView playerView2) {
    }

    private void toggleControllerVisibility() {
    }

    private void updateAspectRatio() {
    }

    private void updateBuffering() {
    }

    private void updateContentDescription() {
    }

    private void updateControllerVisibility() {
    }

    private void updateErrorMessage() {
    }

    private void updateForCurrentTrackSelections(boolean z) {
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean useArtwork() {
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public List<AdOverlayInfo> getAdOverlayInfos() {
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public ViewGroup getAdViewGroup() {
    }

    public boolean getControllerAutoShow() {
    }

    public boolean getControllerHideOnTouch() {
    }

    public int getControllerShowTimeoutMs() {
    }

    public Drawable getDefaultArtwork() {
    }

    public FrameLayout getOverlayFrameLayout() {
    }

    public Player getPlayer() {
    }

    public int getResizeMode() {
    }

    public SubtitleView getSubtitleView() {
    }

    public boolean getUseArtwork() {
    }

    public boolean getUseController() {
    }

    public View getVideoSurfaceView() {
    }

    public void hideController() {
    }

    public boolean isControllerVisible() {
    }

    protected void onContentAspectRatioChanged(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean performClick() {
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
    }

    public void setControllerAutoShow(boolean z) {
    }

    public void setControllerHideDuringAds(boolean z) {
    }

    public void setControllerHideOnTouch(boolean z) {
    }

    public void setControllerShowTimeoutMs(int i) {
    }

    public void setControllerVisibilityListener(PlayerControlView.VisibilityListener visibilityListener) {
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
    }

    public void setDefaultArtwork(Drawable drawable) {
    }

    public void setErrorMessageProvider(ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
    }

    public void setKeepContentOnPlayerReset(boolean z) {
    }

    public void setPlayer(Player player) {
    }

    public void setRepeatToggleModes(int i) {
    }

    public void setResizeMode(int i) {
    }

    public void setShowBuffering(int i) {
    }

    public void setShowFastForwardButton(boolean z) {
    }

    public void setShowMultiWindowTimeBar(boolean z) {
    }

    public void setShowNextButton(boolean z) {
    }

    public void setShowPreviousButton(boolean z) {
    }

    public void setShowRewindButton(boolean z) {
    }

    public void setShowShuffleButton(boolean z) {
    }

    public void setShutterBackgroundColor(int i) {
    }

    public void setUseArtwork(boolean z) {
    }

    public void setUseController(boolean z) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public void showController() {
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
    }

    private void showController(boolean z) {
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i) {
    }
}
