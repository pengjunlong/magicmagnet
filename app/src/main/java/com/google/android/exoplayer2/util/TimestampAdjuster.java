package com.google.android.exoplayer2.util;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long firstSampleTimestampUs;
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
    }

    public static long ptsToUs(long j) {
    }

    public static long usToNonWrappedPts(long j) {
    }

    public static long usToWrappedPts(long j) {
    }

    public synchronized long adjustSampleTimestamp(long j) {
    }

    public synchronized long adjustTsTimestamp(long j) {
    }

    public synchronized long getFirstSampleTimestampUs() {
    }

    public synchronized long getLastAdjustedTimestampUs() {
    }

    public synchronized long getTimestampOffsetUs() {
    }

    public synchronized void reset(long j) {
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j) throws InterruptedException {
    }
}
