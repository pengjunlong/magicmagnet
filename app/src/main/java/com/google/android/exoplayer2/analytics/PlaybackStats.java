package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = null;
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, Format format) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    PlaybackStats(int i, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j4, long j5, long j6, long j7, long j8, long j9, int i12, int i13, int i14, long j10, int i15, long j11, long j12, long j13, long j14, long j15, int i16, int i17, int i18, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
    }

    public float getAbandonedBeforeReadyRatio() {
    }

    public float getAudioUnderrunRate() {
    }

    public float getDroppedFramesRate() {
    }

    public float getEndedRatio() {
    }

    public float getFatalErrorRate() {
    }

    public float getFatalErrorRatio() {
    }

    public float getJoinTimeRatio() {
    }

    public int getMeanAudioFormatBitrate() {
    }

    public int getMeanBandwidth() {
    }

    public long getMeanElapsedTimeMs() {
    }

    public int getMeanInitialAudioFormatBitrate() {
    }

    public int getMeanInitialVideoFormatBitrate() {
    }

    public int getMeanInitialVideoFormatHeight() {
    }

    public long getMeanJoinTimeMs() {
    }

    public float getMeanNonFatalErrorCount() {
    }

    public float getMeanPauseBufferCount() {
    }

    public float getMeanPauseCount() {
    }

    public long getMeanPausedTimeMs() {
    }

    public long getMeanPlayAndWaitTimeMs() {
    }

    public long getMeanPlayTimeMs() {
    }

    public float getMeanRebufferCount() {
    }

    public long getMeanRebufferTimeMs() {
    }

    public float getMeanSeekCount() {
    }

    public long getMeanSeekTimeMs() {
    }

    public long getMeanSingleRebufferTimeMs() {
    }

    public long getMeanSingleSeekTimeMs() {
    }

    public float getMeanTimeBetweenFatalErrors() {
    }

    public float getMeanTimeBetweenNonFatalErrors() {
    }

    public float getMeanTimeBetweenRebuffers() {
    }

    public int getMeanVideoFormatBitrate() {
    }

    public int getMeanVideoFormatHeight() {
    }

    public long getMeanWaitTimeMs() {
    }

    public long getMediaTimeMsAtRealtimeMs(long j) {
    }

    public float getNonFatalErrorRate() {
    }

    public int getPlaybackStateAtTime(long j) {
    }

    public long getPlaybackStateDurationMs(int i) {
    }

    public float getRebufferRate() {
    }

    public float getRebufferTimeRatio() {
    }

    public float getSeekTimeRatio() {
    }

    public long getTotalElapsedTimeMs() {
    }

    public long getTotalJoinTimeMs() {
    }

    public long getTotalPausedTimeMs() {
    }

    public long getTotalPlayAndWaitTimeMs() {
    }

    public long getTotalPlayTimeMs() {
    }

    public long getTotalRebufferTimeMs() {
    }

    public long getTotalSeekTimeMs() {
    }

    public long getTotalWaitTimeMs() {
    }

    public float getWaitTimeRatio() {
    }
}
