package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final Supplier<String> DEFAULT_SESSION_ID_GENERATOR = null;
    private static final Random RANDOM = null;
    private static final int SESSION_ID_LENGTH = 12;
    private String currentSessionId;
    private Timeline currentTimeline;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final Supplier<String> sessionIdGenerator;
    private final HashMap<String, SessionDescriptor> sessions;
    private final Timeline.Window window;

    private final class SessionDescriptor {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        final /* synthetic */ DefaultPlaybackSessionManager this$0;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(DefaultPlaybackSessionManager defaultPlaybackSessionManager, String str, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        static /* synthetic */ String access$000(SessionDescriptor sessionDescriptor) {
        }

        static /* synthetic */ long access$100(SessionDescriptor sessionDescriptor) {
        }

        static /* synthetic */ int access$200(SessionDescriptor sessionDescriptor) {
        }

        static /* synthetic */ boolean access$300(SessionDescriptor sessionDescriptor) {
        }

        static /* synthetic */ boolean access$302(SessionDescriptor sessionDescriptor, boolean z) {
        }

        static /* synthetic */ boolean access$400(SessionDescriptor sessionDescriptor) {
        }

        static /* synthetic */ boolean access$402(SessionDescriptor sessionDescriptor, boolean z) {
        }

        static /* synthetic */ MediaSource.MediaPeriodId access$500(SessionDescriptor sessionDescriptor) {
        }

        private int resolveWindowIndexToNewTimeline(Timeline timeline, Timeline timeline2, int i) {
        }

        public boolean belongsToSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
        }

        public void maybeSetWindowSequenceNumber(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public boolean tryResolvingToNewTimeline(Timeline timeline, Timeline timeline2) {
        }
    }

    public DefaultPlaybackSessionManager() {
    }

    static /* synthetic */ Timeline.Window access$600(DefaultPlaybackSessionManager defaultPlaybackSessionManager) {
    }

    static /* synthetic */ Timeline.Period access$700(DefaultPlaybackSessionManager defaultPlaybackSessionManager) {
    }

    public static /* synthetic */ String dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    private static String generateDefaultSessionId() {
    }

    private SessionDescriptor getOrAddSession(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getActiveSessionId() {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
    }

    public DefaultPlaybackSessionManager(Supplier<String> supplier) {
    }
}
