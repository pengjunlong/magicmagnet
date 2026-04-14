package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {
    private static final Logger logger = null;
    private final boolean allMustSucceed;
    private final boolean collectsValues;
    private ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures;

    /* renamed from: com.google.common.util.concurrent.AggregateFuture$1 */
    class RunnableC10131 implements Runnable {
        final /* synthetic */ AggregateFuture this$0;
        final /* synthetic */ ListenableFuture val$future;
        final /* synthetic */ int val$index;

        RunnableC10131(AggregateFuture aggregateFuture, ListenableFuture listenableFuture, int i) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AggregateFuture$2 */
    class RunnableC10142 implements Runnable {
        final /* synthetic */ AggregateFuture this$0;
        final /* synthetic */ ImmutableCollection val$localFutures;

        RunnableC10142(AggregateFuture aggregateFuture, ImmutableCollection immutableCollection) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class ReleaseResourcesReason {
        private static final /* synthetic */ ReleaseResourcesReason[] $VALUES = null;
        public static final ReleaseResourcesReason ALL_INPUT_FUTURES_PROCESSED = null;
        public static final ReleaseResourcesReason OUTPUT_FUTURE_DONE = null;

        private static /* synthetic */ ReleaseResourcesReason[] $values() {
        }

        private ReleaseResourcesReason(String str, int i) {
        }

        public static ReleaseResourcesReason valueOf(String str) {
        }

        public static ReleaseResourcesReason[] values() {
        }
    }

    AggregateFuture(ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection, boolean z, boolean z2) {
    }

    static /* synthetic */ ImmutableCollection access$002(AggregateFuture aggregateFuture, ImmutableCollection immutableCollection) {
    }

    static /* synthetic */ void access$100(AggregateFuture aggregateFuture, int i, Future future) {
    }

    static /* synthetic */ void access$200(AggregateFuture aggregateFuture, ImmutableCollection immutableCollection) {
    }

    private static boolean addCausalChain(Set<Throwable> set, Throwable th) {
    }

    private void collectValueFromNonCancelledFuture(int i, Future<? extends InputT> future) {
    }

    private void decrementCountAndMaybeComplete(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
    }

    private void handleException(Throwable th) {
    }

    private static void log(Throwable th) {
    }

    private void processCompleted(ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    final void addInitialException(Set<Throwable> set) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
    }

    abstract void collectOneValue(int i, @ParametricNullness InputT inputt);

    abstract void handleAllCompleted();

    final void init() {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final String pendingToString() {
    }

    @ForOverride
    @OverridingMethodsMustInvokeSuper
    void releaseResources(ReleaseResourcesReason releaseResourcesReason) {
    }
}
