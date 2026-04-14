package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.Partially;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* renamed from: com.google.common.util.concurrent.Futures$1 */
    class RunnableC10481 implements Runnable {
        final /* synthetic */ Future val$scheduled;

        RunnableC10481(Future future) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* renamed from: com.google.common.util.concurrent.Futures$2 */
    class FutureC10492<O> implements Future<O> {
        final /* synthetic */ Function val$function;
        final /* synthetic */ Future val$input;

        FutureC10492(Future future, Function function) {
        }

        private O applyTransformation(I i) throws ExecutionException {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
        }

        @Override // java.util.concurrent.Future
        public O get() throws InterruptedException, ExecutionException {
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
        }

        @Override // java.util.concurrent.Future
        public O get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$3 */
    class RunnableC10503 implements Runnable {
        final /* synthetic */ ImmutableList val$delegates;
        final /* synthetic */ int val$localI;
        final /* synthetic */ InCompletionOrderState val$state;

        RunnableC10503(InCompletionOrderState inCompletionOrderState, ImmutableList immutableList, int i) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> callback;
        final Future<V> future;

        CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
        }
    }

    @Beta
    @GwtCompatible
    @CanIgnoreReturnValue
    public static final class FutureCombiner<V> {
        private final boolean allMustSucceed;
        private final ImmutableList<ListenableFuture<? extends V>> futures;

        /* renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1 */
        class CallableC10511 implements Callable<Void> {
            final /* synthetic */ Runnable val$combiner;

            CallableC10511(FutureCombiner futureCombiner, Runnable runnable) {
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() throws Exception {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: call, reason: avoid collision after fix types in other method */
            public Void call2() throws Exception {
            }
        }

        /* synthetic */ FutureCombiner(boolean z, ImmutableList immutableList, RunnableC10481 runnableC10481) {
        }

        @CanIgnoreReturnValue
        public <C> ListenableFuture<C> call(Callable<C> callable, Executor executor) {
        }

        public <C> ListenableFuture<C> callAsync(AsyncCallable<C> asyncCallable, Executor executor) {
        }

        public ListenableFuture<?> run(Runnable runnable, Executor executor) {
        }

        private FutureCombiner(boolean z, ImmutableList<ListenableFuture<? extends V>> immutableList) {
        }
    }

    private static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {
        private InCompletionOrderState<T> state;

        /* synthetic */ InCompletionOrderFuture(InCompletionOrderState inCompletionOrderState, RunnableC10481 runnableC10481) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void afterDone() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected String pendingToString() {
        }

        private InCompletionOrderFuture(InCompletionOrderState<T> inCompletionOrderState) {
        }
    }

    private static final class InCompletionOrderState<T> {
        private volatile int delegateIndex;
        private final AtomicInteger incompleteOutputCount;
        private final ListenableFuture<? extends T>[] inputFutures;
        private boolean shouldInterrupt;
        private boolean wasCancelled;

        /* synthetic */ InCompletionOrderState(ListenableFuture[] listenableFutureArr, RunnableC10481 runnableC10481) {
        }

        static /* synthetic */ void access$300(InCompletionOrderState inCompletionOrderState, ImmutableList immutableList, int i) {
        }

        static /* synthetic */ void access$400(InCompletionOrderState inCompletionOrderState, boolean z) {
        }

        static /* synthetic */ ListenableFuture[] access$500(InCompletionOrderState inCompletionOrderState) {
        }

        static /* synthetic */ AtomicInteger access$600(InCompletionOrderState inCompletionOrderState) {
        }

        private void recordCompletion() {
        }

        private void recordInputCompletion(ImmutableList<AbstractFuture<T>> immutableList, int i) {
        }

        private void recordOutputCancellation(boolean z) {
        }

        private InCompletionOrderState(ListenableFuture<? extends T>[] listenableFutureArr) {
        }
    }

    private static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {
        private ListenableFuture<V> delegate;

        NonCancellationPropagatingFuture(ListenableFuture<V> listenableFuture) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void afterDone() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected String pendingToString() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
    }

    @SafeVarargs
    @Beta
    public static <V> ListenableFuture<List<V>> allAsList(ListenableFuture<? extends V>... listenableFutureArr) {
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @Beta
    public static <V, X extends Throwable> ListenableFuture<V> catching(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @Beta
    public static <V, X extends Throwable> ListenableFuture<V> catchingAsync(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
    }

    @Beta
    @GwtIncompatible
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getDone(Future<V> future) throws ExecutionException {
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getUnchecked(Future<V> future) {
    }

    private static <T> ListenableFuture<? extends T>[] gwtCompatibleToArray(Iterable<? extends ListenableFuture<? extends T>> iterable) {
    }

    public static <V> ListenableFuture<V> immediateCancelledFuture() {
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th) {
    }

    public static <V> ListenableFuture<V> immediateFuture(@ParametricNullness V v) {
    }

    public static ListenableFuture<Void> immediateVoidFuture() {
    }

    @Beta
    public static <T> ImmutableList<ListenableFuture<T>> inCompletionOrder(Iterable<? extends ListenableFuture<? extends T>> iterable) {
    }

    @Beta
    @GwtIncompatible
    public static <I, O> Future<O> lazyTransform(Future<I> future, Function<? super I, ? extends O> function) {
    }

    @Beta
    public static <V> ListenableFuture<V> nonCancellationPropagating(ListenableFuture<V> listenableFuture) {
    }

    @Beta
    @GwtIncompatible
    public static <O> ListenableFuture<O> scheduleAsync(AsyncCallable<O> asyncCallable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
    }

    @Beta
    public static <O> ListenableFuture<O> submit(Callable<O> callable, Executor executor) {
    }

    @Beta
    public static <O> ListenableFuture<O> submitAsync(AsyncCallable<O> asyncCallable, Executor executor) {
    }

    @SafeVarargs
    @Beta
    public static <V> ListenableFuture<List<V>> successfulAsList(ListenableFuture<? extends V>... listenableFutureArr) {
    }

    @Beta
    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
    }

    @Beta
    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
    }

    @SafeVarargs
    @Beta
    public static <V> FutureCombiner<V> whenAllComplete(ListenableFuture<? extends V>... listenableFutureArr) {
    }

    @SafeVarargs
    @Beta
    public static <V> FutureCombiner<V> whenAllSucceed(ListenableFuture<? extends V>... listenableFutureArr) {
    }

    @Beta
    @GwtIncompatible
    public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
    }

    private static void wrapAndThrowUnchecked(Throwable th) {
    }

    @Beta
    @GwtIncompatible
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
    }

    @Beta
    public static <V> ListenableFuture<List<V>> successfulAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
    }

    @Beta
    public static <V> FutureCombiner<V> whenAllComplete(Iterable<? extends ListenableFuture<? extends V>> iterable) {
    }

    @Beta
    public static <V> FutureCombiner<V> whenAllSucceed(Iterable<? extends ListenableFuture<? extends V>> iterable) {
    }

    @Beta
    public static <V> ListenableFuture<List<V>> allAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
    }

    @Beta
    public static ListenableFuture<Void> submit(Runnable runnable, Executor executor) {
    }
}
