package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class RateLimiter {
    private final ConfigResolver configResolver;
    private boolean isLogcatEnabled;
    private RateLimiterImpl networkLimiter;
    private final float samplingBucketId;
    private RateLimiterImpl traceLimiter;

    static class RateLimiterImpl {
        private static final long MICROS_IN_A_SECOND = 0;
        private static final AndroidLogger logger = null;
        private long backgroundCapacity;
        private Rate backgroundRate;
        private long capacity;
        private final Clock clock;
        private long foregroundCapacity;
        private Rate foregroundRate;
        private final boolean isLogcatEnabled;
        private Timer lastTimeTokenReplenished;
        private Rate rate;
        private long tokenCount;

        RateLimiterImpl(Rate rate, long j, Clock clock, ConfigResolver configResolver, @ResourceType String str, boolean z) {
        }

        private static long getBlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
        }

        private static long getBlimitSec(ConfigResolver configResolver, @ResourceType String str) {
        }

        private static long getFlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
        }

        private static long getFlimitSec(ConfigResolver configResolver, @ResourceType String str) {
        }

        private void setRateByReadingRemoteConfigValues(ConfigResolver configResolver, @ResourceType String str, boolean z) {
        }

        synchronized void changeRate(boolean z) {
        }

        synchronized boolean check(PerfMetric perfMetric) {
        }

        @VisibleForTesting
        long getBackgroundCapacity() {
        }

        @VisibleForTesting
        Rate getBackgroundRate() {
        }

        @VisibleForTesting
        long getForegroundCapacity() {
        }

        @VisibleForTesting
        Rate getForegroundRate() {
        }

        @VisibleForTesting
        Rate getRate() {
        }

        @VisibleForTesting
        void setRate(Rate rate) {
        }
    }

    public RateLimiter(Context context, Rate rate, long j) {
    }

    @VisibleForTesting
    static float getSamplingBucketId() {
    }

    private boolean hasVerboseSessions(List<PerfSession> list) {
    }

    private boolean isDeviceAllowedToSendNetworkEvents() {
    }

    private boolean isDeviceAllowedToSendTraces() {
    }

    void changeRate(boolean z) {
    }

    boolean check(PerfMetric perfMetric) {
    }

    @VisibleForTesting
    boolean getIsDeviceAllowedToSendNetworkEvents() {
    }

    @VisibleForTesting
    boolean getIsDeviceAllowedToSendTraces() {
    }

    boolean isRateLimited(PerfMetric perfMetric) {
    }

    RateLimiter(Rate rate, long j, Clock clock, float f, ConfigResolver configResolver) {
    }
}
