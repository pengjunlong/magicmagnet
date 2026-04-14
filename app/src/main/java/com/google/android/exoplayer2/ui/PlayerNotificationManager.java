package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.ppbdpwWWljzmXXdHNabfWhgjl111l11;
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
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;
import p000.yk0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;
    private ppbdpwWWljzmXXdHNabfWhgjl111l11.dpbdpqRKAscW1lll1l builder;
    private List<ppbdpwWWljzmXXdHNabfWhgjl111l11.dbpqdHhmDSIHIJiwc1ll1l1> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, ppbdpwWWljzmXXdHNabfWhgjl111l11.dbpqdHhmDSIHIJiwc1ll1l1> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private final NotificationListener notificationListener;
    private final yk0 notificationManager;
    private final Map<String, ppbdpwWWljzmXXdHNabfWhgjl111l11.dbpqdHhmDSIHIJiwc1ll1l1> playbackActions;
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public final class BitmapCallback {
        private final int notificationTag;
        final /* synthetic */ PlayerNotificationManager this$0;

        /* synthetic */ BitmapCallback(PlayerNotificationManager playerNotificationManager, int i, C02081 c02081) {
        }

        public void onBitmap(Bitmap bitmap) {
        }

        private BitmapCallback(PlayerNotificationManager playerNotificationManager, int i) {
        }
    }

    public interface CustomActionReceiver {
        Map<String, ppbdpwWWljzmXXdHNabfWhgjl111l11.dbpqdHhmDSIHIJiwc1ll1l1> createCustomActions(Context context, int i);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        CharSequence getCurrentSubText(Player player);
    }

    private class NotificationBroadcastReceiver extends BroadcastReceiver {
        final /* synthetic */ PlayerNotificationManager this$0;

        private NotificationBroadcastReceiver(PlayerNotificationManager playerNotificationManager) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        /* synthetic */ NotificationBroadcastReceiver(PlayerNotificationManager playerNotificationManager, C02081 c02081) {
        }
    }

    public interface NotificationListener {
        void onNotificationCancelled(int i, boolean z);

        void onNotificationPosted(int i, Notification notification, boolean z);
    }

    private class PlayerListener implements Player.Listener {
        final /* synthetic */ PlayerNotificationManager this$0;

        private PlayerListener(PlayerNotificationManager playerNotificationManager) {
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

        /* synthetic */ PlayerListener(PlayerNotificationManager playerNotificationManager, C02081 c02081) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    protected PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener, CustomActionReceiver customActionReceiver, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str2) {
    }

    static /* synthetic */ void access$000(PlayerNotificationManager playerNotificationManager, Bitmap bitmap, int i) {
    }

    static /* synthetic */ Map access$1000(PlayerNotificationManager playerNotificationManager) {
    }

    static /* synthetic */ void access$400(PlayerNotificationManager playerNotificationManager) {
    }

    static /* synthetic */ Player access$500(PlayerNotificationManager playerNotificationManager) {
    }

    static /* synthetic */ boolean access$600(PlayerNotificationManager playerNotificationManager) {
    }

    static /* synthetic */ int access$700(PlayerNotificationManager playerNotificationManager) {
    }

    static /* synthetic */ void access$800(PlayerNotificationManager playerNotificationManager, boolean z) {
    }

    static /* synthetic */ CustomActionReceiver access$900(PlayerNotificationManager playerNotificationManager) {
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i) {
    }

    private static Map<String, ppbdpwWWljzmXXdHNabfWhgjl111l11.dbpqdHhmDSIHIJiwc1ll1l1> createPlaybackActions(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(PlayerNotificationManager playerNotificationManager, Message message) {
    }

    private boolean handleMessage(Message message) {
    }

    private void postStartOrUpdateNotification() {
    }

    private void postUpdateNotificationBitmap(Bitmap bitmap, int i) {
    }

    private static void setLargeIcon(ppbdpwWWljzmXXdHNabfWhgjl111l11.dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Bitmap bitmap) {
    }

    private boolean shouldShowPauseButton(Player player) {
    }

    private void startOrUpdateNotification(Player player, Bitmap bitmap) {
    }

    private void stopNotification(boolean z) {
    }

    protected ppbdpwWWljzmXXdHNabfWhgjl111l11.dpbdpqRKAscW1lll1l createNotification(Player player, ppbdpwWWljzmXXdHNabfWhgjl111l11.dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, boolean z, Bitmap bitmap) {
    }

    protected int[] getActionIndicesForCompactView(List<String> list, Player player) {
    }

    protected List<String> getActions(Player player) {
    }

    protected boolean getOngoing(Player player) {
    }

    public final void invalidate() {
    }

    public final void setBadgeIconType(int i) {
    }

    public final void setColor(int i) {
    }

    public final void setColorized(boolean z) {
    }

    public final void setDefaults(int i) {
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
    }

    public final void setPlayer(Player player) {
    }

    public final void setPriority(int i) {
    }

    public final void setSmallIcon(int i) {
    }

    public final void setUseChronometer(boolean z) {
    }

    public final void setUseFastForwardAction(boolean z) {
    }

    public final void setUseFastForwardActionInCompactView(boolean z) {
    }

    public final void setUseNextAction(boolean z) {
    }

    public final void setUseNextActionInCompactView(boolean z) {
    }

    public final void setUsePlayPauseActions(boolean z) {
    }

    public final void setUsePreviousAction(boolean z) {
    }

    public final void setUsePreviousActionInCompactView(boolean z) {
    }

    public final void setUseRewindAction(boolean z) {
    }

    public final void setUseRewindActionInCompactView(boolean z) {
    }

    public final void setUseStopAction(boolean z) {
    }

    public final void setVisibility(int i) {
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final Context context;
        protected CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;
        protected String groupKey;
        protected MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;
        protected NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        @Deprecated
        public Builder(Context context, int i, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
        }

        public PlayerNotificationManager build() {
        }

        public Builder setChannelDescriptionResourceId(int i) {
        }

        public Builder setChannelImportance(int i) {
        }

        public Builder setChannelNameResourceId(int i) {
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
        }

        public Builder setFastForwardActionIconResourceId(int i) {
        }

        public Builder setGroup(String str) {
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
        }

        public Builder setNextActionIconResourceId(int i) {
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
        }

        public Builder setPauseActionIconResourceId(int i) {
        }

        public Builder setPlayActionIconResourceId(int i) {
        }

        public Builder setPreviousActionIconResourceId(int i) {
        }

        public Builder setRewindActionIconResourceId(int i) {
        }

        public Builder setSmallIconResourceId(int i) {
        }

        public Builder setStopActionIconResourceId(int i) {
        }

        public Builder(Context context, int i, String str) {
        }
    }
}
