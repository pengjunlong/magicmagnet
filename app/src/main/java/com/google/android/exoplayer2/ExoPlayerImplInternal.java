package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.DefaultMediaClock;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private static final int ACTIVE_INTERVAL_MS = 10;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_OFFLOAD_SCHEDULING_ENABLED = 24;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private ExoPlaybackException pendingRecoverableRendererError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private long playbackMaybeBecameStuckAtMs;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private final Set<Renderer> renderersToReset;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;

    /* renamed from: com.google.android.exoplayer2.ExoPlayerImplInternal$1 */
    class C00721 implements Renderer.WakeupListener {
        final /* synthetic */ ExoPlayerImplInternal this$0;

        C00721(ExoPlayerImplInternal exoPlayerImplInternal) {
        }

        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
        public void onSleep() {
        }

        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
        public void onWakeup() {
        }
    }

    private static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        /* synthetic */ MediaSourceListUpdateMessage(List list, ShuffleOrder shuffleOrder, int i, long j, C00721 c00721) {
        }

        static /* synthetic */ int access$200(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        }

        static /* synthetic */ List access$300(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        }

        static /* synthetic */ ShuffleOrder access$400(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        }

        static /* synthetic */ long access$500(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        }

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i, long j) {
        }
    }

    private static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
        }
    }

    private static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(PendingMessageInfo pendingMessageInfo) {
        }

        public void setResolvedPosition(int i, long j, Object obj) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(PendingMessageInfo pendingMessageInfo) {
        }
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
        }

        static /* synthetic */ boolean access$100(PlaybackInfoUpdate playbackInfoUpdate) {
        }

        public void incrementPendingOperationAcks(int i) {
        }

        public void setPlayWhenReadyChangeReason(int i) {
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
        }

        public void setPositionDiscontinuity(int i) {
        }
    }

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    private static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3) {
        }
    }

    private static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i, long j) {
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i, boolean z, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j, boolean z2, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId, Looper looper2) {
    }

    static /* synthetic */ boolean access$602(ExoPlayerImplInternal exoPlayerImplInternal, boolean z) {
    }

    static /* synthetic */ HandlerWrapper access$700(ExoPlayerImplInternal exoPlayerImplInternal) {
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) throws ExoPlaybackException {
    }

    private void attemptRendererErrorRecovery() throws ExoPlaybackException {
    }

    public static /* synthetic */ Boolean dbpqdHhmDSIHIJiwc1ll1l1(ExoPlayerImplInternal exoPlayerImplInternal) {
    }

    private void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
    }

    private void disableRenderer(Renderer renderer) throws ExoPlaybackException {
    }

    private void doSomeWork() throws ExoPlaybackException, IOException {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(ExoPlayerImplInternal exoPlayerImplInternal, PlayerMessage playerMessage) {
    }

    private void enableRenderer(int i, boolean z) throws ExoPlaybackException {
    }

    private void enableRenderers() throws ExoPlaybackException {
    }

    private void ensureStopped(Renderer renderer) {
    }

    private ImmutableList<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
    }

    private long getCurrentLiveOffsetUs() {
    }

    private static Format[] getFormats(ExoTrackSelection exoTrackSelection) {
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j) {
    }

    private long getMaxRendererReadPositionUs() {
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPositionUs(Timeline timeline) {
    }

    private long getTotalBufferedDurationUs() {
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
    }

    private void handleIoException(IOException iOException, int i) {
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
    }

    private void handleMediaSourceListInfoRefreshed(Timeline timeline, boolean z) throws ExoPlaybackException {
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z) throws ExoPlaybackException {
    }

    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z, int i) {
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
    }

    private boolean hasReadingPeriodFinishedReading() {
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z, MediaSource.MediaPeriodId mediaPeriodId, long j, MediaSource.MediaPeriodId mediaPeriodId2, Timeline.Period period, long j2) {
    }

    private boolean isLoadingPossible() {
    }

    private static boolean isRendererEnabled(Renderer renderer) {
    }

    private boolean isTimelineReady() {
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, Timeline.Period period) {
    }

    private /* synthetic */ Boolean lambda$release$0() {
    }

    private /* synthetic */ void lambda$sendMessageToTargetThread$1(PlayerMessage playerMessage) {
    }

    private void maybeContinueLoading() {
    }

    private void maybeNotifyPlaybackInfoChanged() {
    }

    private void maybeTriggerPendingMessages(long j, long j2) throws ExoPlaybackException {
    }

    private void maybeUpdateLoadingPeriod() throws ExoPlaybackException {
    }

    private void maybeUpdatePlayingPeriod() throws ExoPlaybackException {
    }

    private void maybeUpdateReadingPeriod() throws ExoPlaybackException {
    }

    private void maybeUpdateReadingRenderers() throws ExoPlaybackException {
    }

    private void mediaSourceListUpdateRequestedInternal() throws ExoPlaybackException {
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws ExoPlaybackException {
    }

    private void notifyTrackSelectionDiscontinuity() {
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
    }

    private void notifyTrackSelectionRebuffer() {
    }

    private void prepareInternal() {
    }

    private void releaseInternal() {
    }

    private void removeMediaItemsInternal(int i, int i2, ShuffleOrder shuffleOrder) throws ExoPlaybackException {
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws ExoPlaybackException {
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
    }

    private void resetInternal(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    private void resetPendingPauseAtEndOfPeriod() {
    }

    private void resetRendererPosition(long j) throws ExoPlaybackException {
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window, Timeline.Period period) {
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i, boolean z, Timeline.Window window, Timeline.Period period) {
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
    }

    private static PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(Timeline timeline, PlaybackInfo playbackInfo, SeekPosition seekPosition, MediaPeriodQueue mediaPeriodQueue, int i, boolean z, Timeline.Window window, Timeline.Period period) {
    }

    private static Pair<Object, Long> resolveSeekPositionUs(Timeline timeline, SeekPosition seekPosition, boolean z, int i, boolean z2, Timeline.Window window, Timeline.Period period) {
    }

    static Object resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
    }

    private void scheduleNextWork(long j, long j2) {
    }

    private void seekToCurrentPosition(boolean z) throws ExoPlaybackException {
    }

    private void seekToInternal(SeekPosition seekPosition) throws ExoPlaybackException {
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) throws ExoPlaybackException {
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
    }

    private void sendMessageToTargetThread(PlayerMessage playerMessage) {
    }

    private void setAllRendererStreamsFinal(long j) {
    }

    private void setCurrentStreamFinal(Renderer renderer, long j) {
    }

    private void setForegroundModeInternal(boolean z, AtomicBoolean atomicBoolean) {
    }

    private void setMediaClockPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws ExoPlaybackException {
    }

    private void setOffloadSchedulingEnabledInternal(boolean z) {
    }

    private void setPauseAtEndOfWindowInternal(boolean z) throws ExoPlaybackException {
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) throws ExoPlaybackException {
    }

    private void setRepeatModeInternal(int i) throws ExoPlaybackException {
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
    }

    private void setShuffleModeEnabledInternal(boolean z) throws ExoPlaybackException {
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws ExoPlaybackException {
    }

    private void setState(int i) {
    }

    private boolean shouldAdvancePlayingPeriod() {
    }

    private boolean shouldContinueLoading() {
    }

    private boolean shouldPlayWhenReady() {
    }

    private boolean shouldTransitionToReadyState(boolean z) {
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    private void startRenderers() throws ExoPlaybackException {
    }

    private void stopInternal(boolean z, boolean z2) {
    }

    private void stopRenderers() throws ExoPlaybackException {
    }

    private void updateIsLoading() {
    }

    private void updateLoadControlTrackSelection(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
    }

    private void updatePeriods() throws ExoPlaybackException {
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j) throws ExoPlaybackException {
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
    }

    private synchronized void waitUninterruptibly(Supplier<Boolean> supplier, long j) {
    }

    public void addMediaSources(int i, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
    }

    public Looper getPlaybackLooper() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    public void moveMediaSources(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
    }

    public void prepare() {
    }

    public synchronized boolean release() {
    }

    public void removeMediaSources(int i, int i2, ShuffleOrder shuffleOrder) {
    }

    public void seekTo(Timeline timeline, int i, long j) {
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
    }

    public synchronized boolean setForegroundMode(boolean z) {
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i, long j, ShuffleOrder shuffleOrder) {
    }

    public void setPauseAtEndOfWindow(boolean z) {
    }

    public void setPlayWhenReady(boolean z, int i) {
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    public void setRepeatMode(int i) {
    }

    public void setSeekParameters(SeekParameters seekParameters) {
    }

    public void setShuffleModeEnabled(boolean z) {
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
    }

    public void stop() {
    }

    private void enableRenderers(boolean[] zArr) throws ExoPlaybackException {
    }

    private long getTotalBufferedDurationUs(long j) {
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) throws ExoPlaybackException {
    }

    /* renamed from: onContinueLoadingRequested, reason: avoid collision after fix types in other method */
    public void onContinueLoadingRequested2(MediaPeriod mediaPeriod) {
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z, boolean z2) throws ExoPlaybackException {
    }
}
