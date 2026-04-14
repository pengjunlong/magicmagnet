package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {
    private volatile InterruptibleTask<?> task;

    private final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {
        private final AsyncCallable<V> callable;
        final /* synthetic */ TrustedListenableFutureTask this$0;

        TrustedFutureInterruptibleAsyncTask(TrustedListenableFutureTask trustedListenableFutureTask, AsyncCallable<V> asyncCallable) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblyFailure(Throwable th) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* bridge */ /* synthetic */ void afterRanInterruptiblySuccess(Object obj) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* bridge */ /* synthetic */ Object runInterruptibly() throws Exception {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String toPendingString() {
        }

        void afterRanInterruptiblySuccess(ListenableFuture<V> listenableFuture) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        ListenableFuture<V> runInterruptibly() throws Exception {
        }
    }

    private final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;
        final /* synthetic */ TrustedListenableFutureTask this$0;

        TrustedFutureInterruptibleTask(TrustedListenableFutureTask trustedListenableFutureTask, Callable<V> callable) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblyFailure(Throwable th) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblySuccess(@ParametricNullness V v) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @ParametricNullness
        V runInterruptibly() throws Exception {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String toPendingString() {
        }
    }

    TrustedListenableFutureTask(Callable<V> callable) {
    }

    static <V> TrustedListenableFutureTask<V> create(AsyncCallable<V> asyncCallable) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void afterDone() {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected String pendingToString() {
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
    }

    static <V> TrustedListenableFutureTask<V> create(Callable<V> callable) {
    }

    TrustedListenableFutureTask(AsyncCallable<V> asyncCallable) {
    }

    static <V> TrustedListenableFutureTask<V> create(Runnable runnable, @ParametricNullness V v) {
    }
}
