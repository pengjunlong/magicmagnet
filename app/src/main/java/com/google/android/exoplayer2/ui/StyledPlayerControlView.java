package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
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
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class StyledPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS = null;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;
    private final View audioTrackButton;
    private final AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private final StyledPlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final ImageView fullScreenButton;
    private final String fullScreenEnterContentDescription;
    private final Drawable fullScreenEnterDrawable;
    private final String fullScreenExitContentDescription;
    private final Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;
    private final ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    private final View nextButton;
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Timeline.Period period;
    private final View playPauseButton;
    private final PlaybackSpeedAdapter playbackSpeedAdapter;
    private final View playbackSpeedButton;
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
    private final Resources resources;
    private final View rewindButton;
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private final SettingsAdapter settingsAdapter;
    private final View settingsButton;
    private final RecyclerView settingsView;
    private final PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private int showTimeoutMs;
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private final TextTrackSelectionAdapter textTrackSelectionAdapter;
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final TrackNameProvider trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    private final View vrButton;
    private final Timeline.Window window;

    /* JADX INFO: Access modifiers changed from: private */
    final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        final /* synthetic */ StyledPlayerControlView this$0;

        private AudioTrackSelectionAdapter(StyledPlayerControlView styledPlayerControlView) {
        }

        public static /* synthetic */ void ddbbbeXHXx111ll(AudioTrackSelectionAdapter audioTrackSelectionAdapter, View view) {
        }

        private boolean hasSelectionOverride(TrackSelectionParameters trackSelectionParameters) {
        }

        private /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
        }

        /* synthetic */ AudioTrackSelectionAdapter(StyledPlayerControlView styledPlayerControlView, C02111 c02111) {
        }
    }

    private final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        final /* synthetic */ StyledPlayerControlView this$0;

        private ComponentListener(StyledPlayerControlView styledPlayerControlView) {
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

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
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

        /* synthetic */ ComponentListener(StyledPlayerControlView styledPlayerControlView, C02111 c02111) {
        }
    }

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class PlaybackSpeedAdapter extends RecyclerView.ddbbbeXHXx111ll<SubSettingViewHolder> {
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;
        final /* synthetic */ StyledPlayerControlView this$0;

        public PlaybackSpeedAdapter(StyledPlayerControlView styledPlayerControlView, String[] strArr, float[] fArr) {
        }

        public static /* synthetic */ void dqpqqqbqQyjyB11111l1(PlaybackSpeedAdapter playbackSpeedAdapter, int i, View view) {
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        public String getSelectedText() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        }

        public void updateSelectedIndex(float f) {
        }

        /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(SubSettingViewHolder subSettingViewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        /* renamed from: onCreateViewHolder, reason: avoid collision after fix types in other method */
        public SubSettingViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i) {
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SettingViewHolder extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;
        final /* synthetic */ StyledPlayerControlView this$0;

        public SettingViewHolder(StyledPlayerControlView styledPlayerControlView, View view) {
        }

        static /* synthetic */ TextView access$3700(SettingViewHolder settingViewHolder) {
        }

        static /* synthetic */ TextView access$3800(SettingViewHolder settingViewHolder) {
        }

        static /* synthetic */ ImageView access$3900(SettingViewHolder settingViewHolder) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(SettingViewHolder settingViewHolder, View view) {
        }

        private /* synthetic */ void lambda$new$0(View view) {
        }
    }

    private class SettingsAdapter extends RecyclerView.ddbbbeXHXx111ll<SettingViewHolder> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;
        final /* synthetic */ StyledPlayerControlView this$0;

        public SettingsAdapter(StyledPlayerControlView styledPlayerControlView, String[] strArr, Drawable[] drawableArr) {
        }

        private boolean shouldShowSetting(int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public long getItemId(int i) {
        }

        public boolean hasSettingsToShow() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(SettingViewHolder settingViewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        }

        public void setSubTextAtPosition(int i, String str) {
        }

        /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(SettingViewHolder settingViewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        /* renamed from: onCreateViewHolder, reason: avoid collision after fix types in other method */
        public SettingViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i) {
        }
    }

    private static class SubSettingViewHolder extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        final /* synthetic */ StyledPlayerControlView this$0;

        private TextTrackSelectionAdapter(StyledPlayerControlView styledPlayerControlView) {
        }

        public static /* synthetic */ void ddbbbeXHXx111ll(TextTrackSelectionAdapter textTrackSelectionAdapter, View view) {
        }

        private /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
        }

        /* synthetic */ TextTrackSelectionAdapter(StyledPlayerControlView styledPlayerControlView, C02111 c02111) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(SubSettingViewHolder subSettingViewHolder, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TrackInformation {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public TrackInformation(Tracks tracks, int i, int i2, String str) {
        }

        public boolean isSelected() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class TrackSelectionAdapter extends RecyclerView.ddbbbeXHXx111ll<SubSettingViewHolder> {
        final /* synthetic */ StyledPlayerControlView this$0;
        protected List<TrackInformation> tracks;

        protected TrackSelectionAdapter(StyledPlayerControlView styledPlayerControlView) {
        }

        public static /* synthetic */ void dqpqqqbqQyjyB11111l1(TrackSelectionAdapter trackSelectionAdapter, Player player, TrackGroup trackGroup, TrackInformation trackInformation, View view) {
        }

        private /* synthetic */ void lambda$onBindViewHolder$0(Player player, TrackGroup trackGroup, TrackInformation trackInformation, View view) {
        }

        protected void clear() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public int getItemCount() {
        }

        public abstract void init(List<TrackInformation> list);

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
        }

        protected abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        public /* bridge */ /* synthetic */ SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        }

        protected abstract void onTrackSelection(String str);

        /* JADX WARN: Can't rename method to resolve collision */
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
        /* renamed from: onCreateViewHolder, reason: avoid collision after fix types in other method */
        public SubSettingViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i) {
        }
    }

    @Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    public StyledPlayerControlView(Context context) {
    }

    static /* synthetic */ void access$1000(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ boolean access$1102(StyledPlayerControlView styledPlayerControlView, boolean z) {
    }

    static /* synthetic */ TextView access$1200(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ StringBuilder access$1300(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ Formatter access$1400(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ StyledPlayerControlViewLayoutManager access$1500(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ Player access$1600(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$1700(StyledPlayerControlView styledPlayerControlView, Player player, long j) {
    }

    static /* synthetic */ boolean access$1800(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ View access$1900(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ View access$2000(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ View access$2100(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ View access$2200(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ View access$2300(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$2400(StyledPlayerControlView styledPlayerControlView, Player player) {
    }

    static /* synthetic */ ImageView access$2500(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ int access$2600(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ ImageView access$2700(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ View access$2800(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ SettingsAdapter access$2900(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$300(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$3000(StyledPlayerControlView styledPlayerControlView, RecyclerView.ddbbbeXHXx111ll ddbbbexhxx111ll, View view) {
    }

    static /* synthetic */ View access$3100(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ PlaybackSpeedAdapter access$3200(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ View access$3300(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ AudioTrackSelectionAdapter access$3400(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ ImageView access$3500(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ TextTrackSelectionAdapter access$3600(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$400(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$4000(StyledPlayerControlView styledPlayerControlView, int i) {
    }

    static /* synthetic */ void access$4100(StyledPlayerControlView styledPlayerControlView, float f) {
    }

    static /* synthetic */ PopupWindow access$4200(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ Drawable access$4300(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ Drawable access$4400(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ String access$4500(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ String access$4600(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$500(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$600(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$700(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$800(StyledPlayerControlView styledPlayerControlView) {
    }

    static /* synthetic */ void access$900(StyledPlayerControlView styledPlayerControlView) {
    }

    private static boolean canShowMultiWindowTimeBar(Player player, Timeline.Window window) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(StyledPlayerControlView styledPlayerControlView, View view) {
    }

    private void dispatchPause(Player player) {
    }

    private void dispatchPlay(Player player) {
    }

    private void dispatchPlayPause(Player player) {
    }

    private void displaySettingsWindow(RecyclerView.ddbbbeXHXx111ll<?> ddbbbexhxx111ll, View view) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(StyledPlayerControlView styledPlayerControlView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    private ImmutableList<TrackInformation> gatherSupportedTrackInfosOfType(Tracks tracks, int i) {
    }

    private void initTrackSelectionAdapter() {
    }

    private static void initializeFullScreenButton(View view, View.OnClickListener onClickListener) {
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
    }

    private void onFullScreenButtonClicked(View view) {
    }

    private void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    private void onSettingViewClicked(int i) {
    }

    private void seekToTimeBarPosition(Player player, long j) {
    }

    private void setPlaybackSpeed(float f) {
    }

    private boolean shouldEnablePlayPauseButton() {
    }

    private boolean shouldShowPauseButton() {
    }

    private void updateButton(boolean z, View view) {
    }

    private void updateFastForwardButton() {
    }

    private void updateFullScreenButtonForState(ImageView imageView, boolean z) {
    }

    private static void updateFullScreenButtonVisibility(View view, boolean z) {
    }

    private void updateNavigation() {
    }

    private void updatePlayPauseButton() {
    }

    private void updatePlaybackSpeedList() {
    }

    private void updateProgress() {
    }

    private void updateRepeatModeButton() {
    }

    private void updateRewindButton() {
    }

    private void updateSettingsButton() {
    }

    private void updateSettingsWindowSize() {
    }

    private void updateShuffleButton() {
    }

    private void updateTimeline() {
    }

    private void updateTrackLists() {
    }

    @Deprecated
    public void addVisibilityListener(VisibilityListener visibilityListener) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
    }

    public Player getPlayer() {
    }

    public int getRepeatToggleModes() {
    }

    public boolean getShowShuffleButton() {
    }

    public boolean getShowSubtitleButton() {
    }

    public int getShowTimeoutMs() {
    }

    public boolean getShowVrButton() {
    }

    public void hide() {
    }

    public void hideImmediately() {
    }

    public boolean isAnimationEnabled() {
    }

    public boolean isFullyVisible() {
    }

    public boolean isVisible() {
    }

    void notifyOnVisibilityChange() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Deprecated
    public void removeVisibilityListener(VisibilityListener visibilityListener) {
    }

    void requestPlayPauseFocus() {
    }

    public void setAnimationEnabled(boolean z) {
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
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

    public void setShowSubtitleButton(boolean z) {
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

    void updateAll() {
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet) {
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i) {
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
    }
}
