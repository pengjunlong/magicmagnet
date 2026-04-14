package com.google.android.exoplayer2.video;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class FixedFrameRateEstimator {
    public static final int CONSECUTIVE_MATCHING_FRAME_DURATIONS_FOR_SYNC = 15;
    static final long MAX_MATCHING_FRAME_DIFFERENCE_NS = 1000000;
    private Matcher candidateMatcher;
    private boolean candidateMatcherActive;
    private Matcher currentMatcher;
    private int framesWithoutSyncCount;
    private long lastFramePresentationTimeNs;
    private boolean switchToCandidateMatcherWhenSynced;

    private static final class Matcher {
        private long firstFrameDurationNs;
        private long firstFramePresentationTimeNs;
        private long frameCount;
        private long lastFramePresentationTimeNs;
        private long matchingFrameCount;
        private long matchingFrameDurationSumNs;
        private int recentFrameOutlierCount;
        private final boolean[] recentFrameOutlierFlags;

        private static int getRecentFrameOutlierIndex(long j) {
        }

        public long getFrameDurationNs() {
        }

        public long getMatchingFrameDurationSumNs() {
        }

        public boolean isLastFrameOutlier() {
        }

        public boolean isSynced() {
        }

        public void onNextFrame(long j) {
        }

        public void reset() {
        }
    }

    public long getFrameDurationNs() {
    }

    public float getFrameRate() {
    }

    public int getFramesWithoutSyncCount() {
    }

    public long getMatchingFrameDurationSumNs() {
    }

    public boolean isSynced() {
    }

    public void onNextFrame(long j) {
    }

    public void reset() {
    }
}
