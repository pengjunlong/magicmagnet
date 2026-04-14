package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class AudioTimestampPoller {
    private static final int ERROR_POLL_INTERVAL_US = 500000;
    private static final int FAST_POLL_INTERVAL_US = 10000;
    private static final int INITIALIZING_DURATION_US = 500000;
    private static final int SLOW_POLL_INTERVAL_US = 10000000;
    private static final int STATE_ERROR = 4;
    private static final int STATE_INITIALIZING = 0;
    private static final int STATE_NO_TIMESTAMP = 3;
    private static final int STATE_TIMESTAMP = 1;
    private static final int STATE_TIMESTAMP_ADVANCING = 2;
    private final AudioTimestampV19 audioTimestamp;
    private long initialTimestampPositionFrames;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private int state;

    private static final class AudioTimestampV19 {
        private final AudioTimestamp audioTimestamp;
        private final AudioTrack audioTrack;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public AudioTimestampV19(AudioTrack audioTrack) {
        }

        public long getTimestampPositionFrames() {
        }

        public long getTimestampSystemTimeUs() {
        }

        public boolean maybeUpdateTimestamp() {
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
    }

    private void updateState(int i) {
    }

    public void acceptTimestamp() {
    }

    @TargetApi(19)
    public long getTimestampPositionFrames() {
    }

    @TargetApi(19)
    public long getTimestampSystemTimeUs() {
    }

    public boolean hasAdvancingTimestamp() {
    }

    public boolean hasTimestamp() {
    }

    @TargetApi(19)
    public boolean maybePollTimestamp(long j) {
    }

    public void rejectTimestamp() {
    }

    public void reset() {
    }
}
