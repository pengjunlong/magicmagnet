package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class CombinedFuture<V> extends AggregateFuture<Object, V> {
    private CombinedFuture<V>.CombinedFutureInterruptibleTask<?> task;

    private final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {
        private final AsyncCallable<V> callable;
        final /* synthetic */ CombinedFuture this$0;

        AsyncCallableInterruptibleTask(CombinedFuture combinedFuture, AsyncCallable<V> asyncCallable, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* bridge */ /* synthetic */ Object runInterruptibly() throws Exception {
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        /* bridge */ /* synthetic */ void setValue(Object obj) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String toPendingString() {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        ListenableFuture<V> runInterruptibly() throws Exception {
        }

        void setValue(ListenableFuture<V> listenableFuture) {
        }
    }

    private final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final Callable<V> callable;
        final /* synthetic */ CombinedFuture this$0;

        CallableInterruptibleTask(CombinedFuture combinedFuture, Callable<V> callable, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @ParametricNullness
        V runInterruptibly() throws Exception {
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        void setValue(@ParametricNullness V v) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String toPendingString() {
        }
    }

    private abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;
        final /* synthetic */ CombinedFuture this$0;

        CombinedFutureInterruptibleTask(CombinedFuture combinedFuture, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblyFailure(Throwable th) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblySuccess(@ParametricNullness T t) {
        }

        final void execute() {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
        }

        abstract void setValue(@ParametricNullness T t);
    }

    CombinedFuture(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, Executor executor, AsyncCallable<V> asyncCallable) {
    }

    static /* synthetic */ CombinedFutureInterruptibleTask access$002(CombinedFuture combinedFuture, CombinedFutureInterruptibleTask combinedFutureInterruptibleTask) {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void collectOneValue(int i, Object obj) {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void handleAllCompleted() {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void interruptTask() {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void releaseResources(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
    }

    CombinedFuture(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, Executor executor, Callable<V> callable) {
    }
}
