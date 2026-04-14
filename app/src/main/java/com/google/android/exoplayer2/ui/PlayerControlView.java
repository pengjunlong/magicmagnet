package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
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
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private long currentBufferedPosition;
    private long currentPosition;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    private final View nextButton;
    private final View pauseButton;
    private final Timeline.Period period;
    private final View playButton;
    private boolean[] playedAdGroups;
    private Player player;
    private final TextView positionView;
    private final View previousButton;
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    private final View vrButton;
    private final Timeline.Window window;

    private static final class Api21 {
        private Api21() {
        }

        public static boolean isAccessibilityFocused(View view) {
        }
    }

    private final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        final /* synthetic */ PlayerControlView this$0;

        private ComponentListener(PlayerControlView playerControlView) {
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
        public /* synthetic */ void onCues(CueGroup cueGroup) {
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
        public void onEvents(Player player, Player.Events events) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
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
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackStateChanged(int i) {
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
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j) {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j) {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
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
        public /* synthetic */ void onTracksChanged(Tracks tracks) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f) {
        }

        /* synthetic */ ComponentListener(PlayerControlView playerControlView, C02071 c02071) {
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    public PlayerControlView(Context context) {
    }

    static /* synthetic */ void access$100(PlayerControlView playerControlView) {
    }

    static /* synthetic */ Formatter access$1000(PlayerControlView playerControlView) {
    }

    static /* synthetic */ Player access$1100(PlayerControlView playerControlView) {
    }

    static /* synthetic */ void access$1200(PlayerControlView playerControlView, Player player, long j) {
    }

    static /* synthetic */ View access$1300(PlayerControlView playerControlView) {
    }

    static /* synthetic */ View access$1400(PlayerControlView playerControlView) {
    }

    static /* synthetic */ View access$1500(PlayerControlView playerControlView) {
    }

    static /* synthetic */ View access$1600(PlayerControlView playerControlView) {
    }

    static /* synthetic */ View access$1700(PlayerControlView playerControlView) {
    }

    static /* synthetic */ void access$1800(PlayerControlView playerControlView, Player player) {
    }

    static /* synthetic */ View access$1900(PlayerControlView playerControlView) {
    }

    static /* synthetic */ void access$200(PlayerControlView playerControlView) {
    }

    static /* synthetic */ void access$2000(PlayerControlView playerControlView, Player player) {
    }

    static /* synthetic */ ImageView access$2100(PlayerControlView playerControlView) {
    }

    static /* synthetic */ int access$2200(PlayerControlView playerControlView) {
    }

    static /* synthetic */ ImageView access$2300(PlayerControlView playerControlView) {
    }

    static /* synthetic */ void access$300(PlayerControlView playerControlView) {
    }

    static /* synthetic */ void access$400(PlayerControlView playerControlView) {
    }

    static /* synthetic */ void access$500(PlayerControlView playerControlView) {
    }

    static /* synthetic */ void access$600(PlayerControlView playerControlView) {
    }

    static /* synthetic */ boolean access$702(PlayerControlView playerControlView, boolean z) {
    }

    static /* synthetic */ TextView access$800(PlayerControlView playerControlView) {
    }

    static /* synthetic */ StringBuilder access$900(PlayerControlView playerControlView) {
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(PlayerControlView playerControlView) {
    }

    private void dispatchPause(Player player) {
    }

    private void dispatchPlay(Player player) {
    }

    private void dispatchPlayPause(Player player) {
    }

    private void hideAfterTimeout() {
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
    }

    private void requestPlayPauseAccessibilityFocus() {
    }

    private void requestPlayPauseFocus() {
    }

    private void seekTo(Player player, int i, long j) {
    }

    private void seekToTimeBarPosition(Player player, long j) {
    }

    private boolean shouldShowPauseButton() {
    }

    private void updateAll() {
    }

    private void updateButton(boolean z, boolean z2, View view) {
    }

    private void updateNavigation() {
    }

    private void updatePlayPauseButton() {
    }

    private void updateProgress() {
    }

    private void updateRepeatModeButton() {
    }

    private void updateShuffleButton() {
    }

    private void updateTimeline() {
    }

    public void addVisibilityListener(VisibilityListener visibilityListener) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public Player getPlayer() {
    }

    public int getRepeatToggleModes() {
    }

    public boolean getShowShuffleButton() {
    }

    public int getShowTimeoutMs() {
    }

    public boolean getShowVrButton() {
    }

    public void hide() {
    }

    public boolean isVisible() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
    }

    public void setPlayer(Player player) {
    }

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener) {
    }

    public void setRepeatToggleModes(int i) {
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

    public void setShowTimeoutMs(int i) {
    }

    public void setShowVrButton(boolean z) {
    }

    public void setTimeBarMinUpdateInterval(int i) {
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
    }

    public void show() {
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
    }
}
