package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.util.concurrent.FluentFuture;
import com.google.errorprone.annotations.ForOverride;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {
    F function;
    ListenableFuture<? extends I> inputFuture;

    private static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        AsyncTransformFuture(ListenableFuture<? extends I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction) {
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* bridge */ /* synthetic */ Object doTransform(Object obj, @ParametricNullness Object obj2) throws Exception {
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* bridge */ /* synthetic */ void setResult(Object obj) {
        }

        ListenableFuture<? extends O> doTransform(AsyncFunction<? super I, ? extends O> asyncFunction, @ParametricNullness I i) throws Exception {
        }

        void setResult(ListenableFuture<? extends O> listenableFuture) {
        }
    }

    private static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        TransformFuture(ListenableFuture<? extends I> listenableFuture, Function<? super I, ? extends O> function) {
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @ParametricNullness
        /* bridge */ /* synthetic */ Object doTransform(Object obj, @ParametricNullness Object obj2) throws Exception {
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        void setResult(@ParametricNullness O o) {
        }

        @ParametricNullness
        O doTransform(Function<? super I, ? extends O> function, @ParametricNullness I i) {
        }
    }

    AbstractTransformFuture(ListenableFuture<? extends I> listenableFuture, F f) {
    }

    static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
    }

    @ParametricNullness
    @ForOverride
    abstract T doTransform(F f, @ParametricNullness I i) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected String pendingToString() {
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    @ForOverride
    abstract void setResult(@ParametricNullness T t);

    static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
    }
}
