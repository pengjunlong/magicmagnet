package com.google.android.exoplayer2.util;

import java.lang.Exception;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {
    private final Object cancelLock;
    private boolean canceled;
    private Exception exception;
    private final ConditionVariable finished;
    private R result;
    private final ConditionVariable started;
    private Thread workThread;

    protected RunnableFutureTask() {
    }

    @UnknownNull
    private R getResult() throws ExecutionException {
    }

    public final void blockUntilFinished() {
    }

    public final void blockUntilStarted() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
    }

    protected void cancelWork() {
    }

    @UnknownNull
    protected abstract R doWork() throws Exception;

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get() throws ExecutionException, InterruptedException {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
    }
}
