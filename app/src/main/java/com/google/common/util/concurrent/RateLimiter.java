package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Stopwatch;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeUnit;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class RateLimiter {
    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    static abstract class SleepingStopwatch {

        /* renamed from: com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1 */
        class C10611 extends SleepingStopwatch {
            final Stopwatch stopwatch;

            C10611() {
            }

            @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
            protected long readMicros() {
            }

            @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
            protected void sleepMicrosUninterruptibly(long j) {
            }
        }

        protected SleepingStopwatch() {
        }

        public static SleepingStopwatch createFromSystemTimer() {
        }

        protected abstract long readMicros();

        protected abstract void sleepMicrosUninterruptibly(long j);
    }

    RateLimiter(SleepingStopwatch sleepingStopwatch) {
    }

    private boolean canAcquire(long j, long j2) {
    }

    private static void checkPermits(int i) {
    }

    public static RateLimiter create(double d) {
    }

    private Object mutex() {
    }

    @CanIgnoreReturnValue
    public double acquire() {
    }

    abstract double doGetRate();

    abstract void doSetRate(double d, long j);

    public final double getRate() {
    }

    abstract long queryEarliestAvailable(long j);

    final long reserve(int i) {
    }

    final long reserveAndGetWaitLength(int i, long j) {
    }

    abstract long reserveEarliestAvailable(int i, long j);

    public final void setRate(double d) {
    }

    public String toString() {
    }

    public boolean tryAcquire(long j, TimeUnit timeUnit) {
    }

    @VisibleForTesting
    static RateLimiter create(double d, SleepingStopwatch sleepingStopwatch) {
    }

    @CanIgnoreReturnValue
    public double acquire(int i) {
    }

    public boolean tryAcquire(int i) {
    }

    public boolean tryAcquire() {
    }

    public static RateLimiter create(double d, long j, TimeUnit timeUnit) {
    }

    public boolean tryAcquire(int i, long j, TimeUnit timeUnit) {
    }

    @VisibleForTesting
    static RateLimiter create(double d, long j, TimeUnit timeUnit, double d2, SleepingStopwatch sleepingStopwatch) {
    }
}
