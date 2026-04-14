package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeUnit;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Stopwatch {
    private long elapsedNanos;
    private boolean isRunning;
    private long startTick;
    private final Ticker ticker;

    /* renamed from: com.google.common.base.Stopwatch$1 */
    static /* synthetic */ class C06301 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit = null;
    }

    Stopwatch() {
    }

    private static String abbreviate(TimeUnit timeUnit) {
    }

    private static TimeUnit chooseUnit(long j) {
    }

    public static Stopwatch createStarted() {
    }

    public static Stopwatch createUnstarted() {
    }

    private long elapsedNanos() {
    }

    public long elapsed(TimeUnit timeUnit) {
    }

    public boolean isRunning() {
    }

    @CanIgnoreReturnValue
    public Stopwatch reset() {
    }

    @CanIgnoreReturnValue
    public Stopwatch start() {
    }

    @CanIgnoreReturnValue
    public Stopwatch stop() {
    }

    public String toString() {
    }

    public static Stopwatch createStarted(Ticker ticker) {
    }

    public static Stopwatch createUnstarted(Ticker ticker) {
    }

    Stopwatch(Ticker ticker) {
    }
}
