package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class RtspSessionTiming {
    public static final RtspSessionTiming DEFAULT = null;
    private static final long LIVE_START_TIME = 0;
    private static final Pattern NPT_RANGE_PATTERN = null;
    private static final String START_TIMING_NTP_FORMAT = "npt=%.3f-";
    public final long startTimeMs;
    public final long stopTimeMs;

    private RtspSessionTiming(long j, long j2) {
    }

    public static String getOffsetStartTimeTiming(long j) {
    }

    public static RtspSessionTiming parseTiming(String str) throws ParserException {
    }

    public long getDurationMs() {
    }

    public boolean isLive() {
    }
}
