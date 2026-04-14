package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {
    private ListenableFuture<V> delegateRef;
    private ScheduledFuture<?> timer;

    private static final class Fire<V> implements Runnable {
        TimeoutFuture<V> timeoutFutureRef;

        Fire(TimeoutFuture<V> timeoutFuture) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private static final class TimeoutFutureException extends TimeoutException {
        /* synthetic */ TimeoutFutureException(String str, C10771 c10771) {
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
        }

        private TimeoutFutureException(String str) {
        }
    }

    private TimeoutFuture(ListenableFuture<V> listenableFuture) {
    }

    static /* synthetic */ ListenableFuture access$000(TimeoutFuture timeoutFuture) {
    }

    static /* synthetic */ ScheduledFuture access$100(TimeoutFuture timeoutFuture) {
    }

    static /* synthetic */ ScheduledFuture access$102(TimeoutFuture timeoutFuture, ScheduledFuture scheduledFuture) {
    }

    static <V> ListenableFuture<V> create(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void afterDone() {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected String pendingToString() {
    }
}
