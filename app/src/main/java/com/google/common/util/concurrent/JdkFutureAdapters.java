package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class JdkFutureAdapters {

    private static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
        private static final Executor defaultAdapterExecutor = null;
        private static final ThreadFactory threadFactory = null;
        private final Executor adapterExecutor;
        private final Future<V> delegate;
        private final ExecutionList executionList;
        private final AtomicBoolean hasListeners;

        /* renamed from: com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter$1 */
        class RunnableC10541 implements Runnable {
            final /* synthetic */ ListenableFutureAdapter this$0;

            RunnableC10541(ListenableFutureAdapter listenableFutureAdapter) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        ListenableFutureAdapter(Future<V> future) {
        }

        static /* synthetic */ Future access$000(ListenableFutureAdapter listenableFutureAdapter) {
        }

        static /* synthetic */ ExecutionList access$100(ListenableFutureAdapter listenableFutureAdapter) {
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        ListenableFutureAdapter(Future<V> future, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected Future<V> delegate() {
        }
    }

    private JdkFutureAdapters() {
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future) {
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future, Executor executor) {
    }
}
