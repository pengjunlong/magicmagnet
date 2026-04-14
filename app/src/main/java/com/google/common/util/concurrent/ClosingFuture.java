package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.Futures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

@Beta
@ElementTypesAreNonnullByDefault
@DoNotMock("Use ClosingFuture.from(Futures.immediate*Future)")
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ClosingFuture<V> {
    private static final Logger logger = null;
    private final CloseableList closeables;
    private final FluentFuture<V> future;
    private final AtomicReference<State> state;

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$1 */
    class C10211 implements FutureCallback<Closeable> {
        final /* synthetic */ Executor val$closingExecutor;
        final /* synthetic */ ClosingFuture val$closingFuture;

        C10211(ClosingFuture closingFuture, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(Throwable th) {
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public /* bridge */ /* synthetic */ void onSuccess(Closeable closeable) {
        }

        /* renamed from: onSuccess, reason: avoid collision after fix types in other method */
        public void onSuccess2(Closeable closeable) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$10, reason: invalid class name */
    class AnonymousClass10 implements Runnable {
        final /* synthetic */ ClosingFuture this$0;
        final /* synthetic */ ValueAndCloserConsumer val$consumer;

        AnonymousClass10(ClosingFuture closingFuture, ValueAndCloserConsumer valueAndCloserConsumer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$11, reason: invalid class name */
    class AnonymousClass11 implements Runnable {
        final /* synthetic */ Closeable val$closeable;

        AnonymousClass11(Closeable closeable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$12, reason: invalid class name */
    static /* synthetic */ class AnonymousClass12 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State = null;
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$2 */
    class CallableC10222 implements Callable<V> {
        final /* synthetic */ ClosingFuture this$0;
        final /* synthetic */ ClosingCallable val$callable;

        CallableC10222(ClosingFuture closingFuture, ClosingCallable closingCallable) {
        }

        @Override // java.util.concurrent.Callable
        @ParametricNullness
        public V call() throws Exception {
        }

        public String toString() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$3 */
    class C10233 implements AsyncCallable<V> {
        final /* synthetic */ ClosingFuture this$0;
        final /* synthetic */ AsyncClosingCallable val$callable;

        C10233(ClosingFuture closingFuture, AsyncClosingCallable asyncClosingCallable) {
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<V> call() throws Exception {
        }

        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* renamed from: com.google.common.util.concurrent.ClosingFuture$4 */
    class C10244<U> implements AsyncFunction<V, U> {
        final /* synthetic */ ClosingFuture this$0;
        final /* synthetic */ ClosingFunction val$function;

        C10244(ClosingFuture closingFuture, ClosingFunction closingFunction) {
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture<U> apply(V v) throws Exception {
        }

        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* renamed from: com.google.common.util.concurrent.ClosingFuture$5 */
    class C10255<U> implements AsyncFunction<V, U> {
        final /* synthetic */ ClosingFuture this$0;
        final /* synthetic */ AsyncClosingFunction val$function;

        C10255(ClosingFuture closingFuture, AsyncClosingFunction asyncClosingFunction) {
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        public ListenableFuture<U> apply(V v) throws Exception {
        }

        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* renamed from: com.google.common.util.concurrent.ClosingFuture$6 */
    class C10266<U> implements AsyncClosingFunction<V, U> {
        final /* synthetic */ AsyncFunction val$function;

        C10266(AsyncFunction asyncFunction) {
        }

        @Override // com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction
        public ClosingFuture<U> apply(DeferredCloser deferredCloser, V v) throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* renamed from: com.google.common.util.concurrent.ClosingFuture$7 */
    class C10277<W, X> implements AsyncFunction<X, W> {
        final /* synthetic */ ClosingFuture this$0;
        final /* synthetic */ ClosingFunction val$fallback;

        C10277(ClosingFuture closingFuture, ClosingFunction closingFunction) {
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        public /* bridge */ /* synthetic */ ListenableFuture apply(Object obj) throws Exception {
        }

        public String toString() {
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
        public ListenableFuture apply(Throwable th) throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* renamed from: com.google.common.util.concurrent.ClosingFuture$8 */
    class C10288<W, X> implements AsyncFunction<X, W> {
        final /* synthetic */ ClosingFuture this$0;
        final /* synthetic */ AsyncClosingFunction val$fallback;

        C10288(ClosingFuture closingFuture, AsyncClosingFunction asyncClosingFunction) {
        }

        @Override // com.google.common.util.concurrent.AsyncFunction
        public /* bridge */ /* synthetic */ ListenableFuture apply(Object obj) throws Exception {
        }

        public String toString() {
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
        public ListenableFuture apply(Throwable th) throws Exception {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$9 */
    class RunnableC10299 implements Runnable {
        final /* synthetic */ ClosingFuture this$0;

        RunnableC10299(ClosingFuture closingFuture) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface AsyncClosingCallable<V> {
        ClosingFuture<V> call(DeferredCloser deferredCloser) throws Exception;
    }

    public interface AsyncClosingFunction<T, U> {
        ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness T t) throws Exception;
    }

    public interface ClosingCallable<V> {
        @ParametricNullness
        V call(DeferredCloser deferredCloser) throws Exception;
    }

    public interface ClosingFunction<T, U> {
        @ParametricNullness
        U apply(DeferredCloser deferredCloser, @ParametricNullness T t) throws Exception;
    }

    @DoNotMock("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class Combiner {
        private static final Function<ClosingFuture<?>, FluentFuture<?>> INNER_FUTURE = null;
        private final boolean allMustSucceed;
        private final CloseableList closeables;
        protected final ImmutableList<ClosingFuture<?>> inputs;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$1 */
        class CallableC10301 implements Callable<V> {
            final /* synthetic */ Combiner this$0;
            final /* synthetic */ CombiningCallable val$combiningCallable;

            CallableC10301(Combiner combiner, CombiningCallable combiningCallable) {
            }

            @Override // java.util.concurrent.Callable
            @ParametricNullness
            public V call() throws Exception {
            }

            public String toString() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$2 */
        class C10312 implements AsyncCallable<V> {
            final /* synthetic */ Combiner this$0;
            final /* synthetic */ AsyncCombiningCallable val$combiningCallable;

            C10312(Combiner combiner, AsyncCombiningCallable asyncCombiningCallable) {
            }

            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture<V> call() throws Exception {
            }

            public String toString() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$3 */
        class C10323 implements Function<ClosingFuture<?>, FluentFuture<?>> {
            C10323() {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ FluentFuture<?> apply(ClosingFuture<?> closingFuture) {
            }

            /* renamed from: apply, reason: avoid collision after fix types in other method */
            public FluentFuture<?> apply2(ClosingFuture<?> closingFuture) {
            }
        }

        public interface AsyncCombiningCallable<V> {
            ClosingFuture<V> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception;
        }

        public interface CombiningCallable<V> {
            @ParametricNullness
            V call(DeferredCloser deferredCloser, Peeker peeker) throws Exception;
        }

        /* synthetic */ Combiner(boolean z, Iterable iterable, C10211 c10211) {
        }

        static /* synthetic */ CloseableList access$1300(Combiner combiner) {
        }

        private Futures.FutureCombiner<Object> futureCombiner() {
        }

        private ImmutableList<FluentFuture<?>> inputFutures() {
        }

        public <V> ClosingFuture<V> call(CombiningCallable<V> combiningCallable, Executor executor) {
        }

        public <V> ClosingFuture<V> callAsync(AsyncCombiningCallable<V> asyncCombiningCallable, Executor executor) {
        }

        private Combiner(boolean z, Iterable<? extends ClosingFuture<?>> iterable) {
        }
    }

    public static final class Combiner2<V1, V2> extends Combiner {
        private final ClosingFuture<V1> future1;
        private final ClosingFuture<V2> future2;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$1 */
        class C10331<U> implements Combiner.CombiningCallable<U> {
            final /* synthetic */ Combiner2 this$0;
            final /* synthetic */ ClosingFunction2 val$function;

            C10331(Combiner2 combiner2, ClosingFunction2 closingFunction2) {
            }

            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            @ParametricNullness
            public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
            }

            public String toString() {
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$2 */
        class C10342<U> implements Combiner.AsyncCombiningCallable<U> {
            final /* synthetic */ Combiner2 this$0;
            final /* synthetic */ AsyncClosingFunction2 val$function;

            C10342(Combiner2 combiner2, AsyncClosingFunction2 asyncClosingFunction2) {
            }

            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture<U> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
            }

            public String toString() {
            }
        }

        public interface AsyncClosingFunction2<V1, V2, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2) throws Exception;
        }

        public interface ClosingFunction2<V1, V2, U> {
            @ParametricNullness
            U apply(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2) throws Exception;
        }

        /* synthetic */ Combiner2(ClosingFuture closingFuture, ClosingFuture closingFuture2, C10211 c10211) {
        }

        static /* synthetic */ ClosingFuture access$1800(Combiner2 combiner2) {
        }

        static /* synthetic */ ClosingFuture access$1900(Combiner2 combiner2) {
        }

        public <U> ClosingFuture<U> call(ClosingFunction2<V1, V2, U> closingFunction2, Executor executor) {
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction2<V1, V2, U> asyncClosingFunction2, Executor executor) {
        }

        private Combiner2(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2) {
        }
    }

    public static final class Combiner3<V1, V2, V3> extends Combiner {
        private final ClosingFuture<V1> future1;
        private final ClosingFuture<V2> future2;
        private final ClosingFuture<V3> future3;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$1 */
        class C10351<U> implements Combiner.CombiningCallable<U> {
            final /* synthetic */ Combiner3 this$0;
            final /* synthetic */ ClosingFunction3 val$function;

            C10351(Combiner3 combiner3, ClosingFunction3 closingFunction3) {
            }

            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            @ParametricNullness
            public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
            }

            public String toString() {
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$2 */
        class C10362<U> implements Combiner.AsyncCombiningCallable<U> {
            final /* synthetic */ Combiner3 this$0;
            final /* synthetic */ AsyncClosingFunction3 val$function;

            C10362(Combiner3 combiner3, AsyncClosingFunction3 asyncClosingFunction3) {
            }

            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture<U> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
            }

            public String toString() {
            }
        }

        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3) throws Exception;
        }

        public interface ClosingFunction3<V1, V2, V3, U> {
            @ParametricNullness
            U apply(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3) throws Exception;
        }

        /* synthetic */ Combiner3(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, C10211 c10211) {
        }

        static /* synthetic */ ClosingFuture access$2000(Combiner3 combiner3) {
        }

        static /* synthetic */ ClosingFuture access$2100(Combiner3 combiner3) {
        }

        static /* synthetic */ ClosingFuture access$2200(Combiner3 combiner3) {
        }

        public <U> ClosingFuture<U> call(ClosingFunction3<V1, V2, V3, U> closingFunction3, Executor executor) {
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction3<V1, V2, V3, U> asyncClosingFunction3, Executor executor) {
        }

        private Combiner3(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3) {
        }
    }

    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {
        private final ClosingFuture<V1> future1;
        private final ClosingFuture<V2> future2;
        private final ClosingFuture<V3> future3;
        private final ClosingFuture<V4> future4;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$1 */
        class C10371<U> implements Combiner.CombiningCallable<U> {
            final /* synthetic */ Combiner4 this$0;
            final /* synthetic */ ClosingFunction4 val$function;

            C10371(Combiner4 combiner4, ClosingFunction4 closingFunction4) {
            }

            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            @ParametricNullness
            public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
            }

            public String toString() {
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$2 */
        class C10382<U> implements Combiner.AsyncCombiningCallable<U> {
            final /* synthetic */ Combiner4 this$0;
            final /* synthetic */ AsyncClosingFunction4 val$function;

            C10382(Combiner4 combiner4, AsyncClosingFunction4 asyncClosingFunction4) {
            }

            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture<U> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
            }

            public String toString() {
            }
        }

        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4) throws Exception;
        }

        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            @ParametricNullness
            U apply(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4) throws Exception;
        }

        /* synthetic */ Combiner4(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, C10211 c10211) {
        }

        static /* synthetic */ ClosingFuture access$2300(Combiner4 combiner4) {
        }

        static /* synthetic */ ClosingFuture access$2400(Combiner4 combiner4) {
        }

        static /* synthetic */ ClosingFuture access$2500(Combiner4 combiner4) {
        }

        static /* synthetic */ ClosingFuture access$2600(Combiner4 combiner4) {
        }

        public <U> ClosingFuture<U> call(ClosingFunction4<V1, V2, V3, V4, U> closingFunction4, Executor executor) {
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction4<V1, V2, V3, V4, U> asyncClosingFunction4, Executor executor) {
        }

        private Combiner4(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4) {
        }
    }

    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {
        private final ClosingFuture<V1> future1;
        private final ClosingFuture<V2> future2;
        private final ClosingFuture<V3> future3;
        private final ClosingFuture<V4> future4;
        private final ClosingFuture<V5> future5;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$1 */
        class C10391<U> implements Combiner.CombiningCallable<U> {
            final /* synthetic */ Combiner5 this$0;
            final /* synthetic */ ClosingFunction5 val$function;

            C10391(Combiner5 combiner5, ClosingFunction5 closingFunction5) {
            }

            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
            @ParametricNullness
            public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
            }

            public String toString() {
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$2 */
        class C10402<U> implements Combiner.AsyncCombiningCallable<U> {
            final /* synthetic */ Combiner5 this$0;
            final /* synthetic */ AsyncClosingFunction5 val$function;

            C10402(Combiner5 combiner5, AsyncClosingFunction5 asyncClosingFunction5) {
            }

            @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
            public ClosingFuture<U> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
            }

            public String toString() {
            }
        }

        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4, @ParametricNullness V5 v5) throws Exception;
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            @ParametricNullness
            U apply(DeferredCloser deferredCloser, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4, @ParametricNullness V5 v5) throws Exception;
        }

        /* synthetic */ Combiner5(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5, C10211 c10211) {
        }

        static /* synthetic */ ClosingFuture access$2700(Combiner5 combiner5) {
        }

        static /* synthetic */ ClosingFuture access$2800(Combiner5 combiner5) {
        }

        static /* synthetic */ ClosingFuture access$2900(Combiner5 combiner5) {
        }

        static /* synthetic */ ClosingFuture access$3000(Combiner5 combiner5) {
        }

        static /* synthetic */ ClosingFuture access$3100(Combiner5 combiner5) {
        }

        public <U> ClosingFuture<U> call(ClosingFunction5<V1, V2, V3, V4, V5, U> closingFunction5, Executor executor) {
        }

        public <U> ClosingFuture<U> callAsync(AsyncClosingFunction5<V1, V2, V3, V4, V5, U> asyncClosingFunction5, Executor executor) {
        }

        private Combiner5(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4, ClosingFuture<V5> closingFuture5) {
        }
    }

    public static final class DeferredCloser {

        @RetainedWith
        private final CloseableList list;

        DeferredCloser(CloseableList closeableList) {
        }

        @CanIgnoreReturnValue
        @ParametricNullness
        public <C extends Closeable> C eventuallyClose(@ParametricNullness C c, Executor executor) {
        }
    }

    public static final class Peeker {
        private volatile boolean beingCalled;
        private final ImmutableList<ClosingFuture<?>> futures;

        /* synthetic */ Peeker(ImmutableList immutableList, C10211 c10211) {
        }

        static /* synthetic */ Object access$1500(Peeker peeker, Combiner.CombiningCallable combiningCallable, CloseableList closeableList) throws Exception {
        }

        static /* synthetic */ FluentFuture access$1700(Peeker peeker, Combiner.AsyncCombiningCallable asyncCombiningCallable, CloseableList closeableList) throws Exception {
        }

        @ParametricNullness
        private <V> V call(Combiner.CombiningCallable<V> combiningCallable, CloseableList closeableList) throws Exception {
        }

        private <V> FluentFuture<V> callAsync(Combiner.AsyncCombiningCallable<V> asyncCombiningCallable, CloseableList closeableList) throws Exception {
        }

        @ParametricNullness
        public final <D> D getDone(ClosingFuture<D> closingFuture) throws ExecutionException {
        }

        private Peeker(ImmutableList<ClosingFuture<?>> immutableList) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class State {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State CLOSED = null;
        public static final State CLOSING = null;
        public static final State OPEN = null;
        public static final State SUBSUMED = null;
        public static final State WILL_CLOSE = null;
        public static final State WILL_CREATE_VALUE_AND_CLOSER = null;

        private static /* synthetic */ State[] $values() {
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
        }

        public static State[] values() {
        }
    }

    public static final class ValueAndCloser<V> {
        private final ClosingFuture<? extends V> closingFuture;

        ValueAndCloser(ClosingFuture<? extends V> closingFuture) {
        }

        public void closeAsync() {
        }

        @ParametricNullness
        public V get() throws ExecutionException {
        }
    }

    public interface ValueAndCloserConsumer<V> {
        void accept(ValueAndCloser<V> valueAndCloser);
    }

    /* synthetic */ ClosingFuture(ListenableFuture listenableFuture, C10211 c10211) {
    }

    static /* synthetic */ FluentFuture access$000(ClosingFuture closingFuture) {
    }

    static /* synthetic */ void access$100(ClosingFuture closingFuture) {
    }

    static /* synthetic */ void access$1000(ClosingFuture closingFuture, CloseableList closeableList) {
    }

    static /* synthetic */ void access$1100(ClosingFuture closingFuture, State state, State state2) {
    }

    static /* synthetic */ void access$1200(ValueAndCloserConsumer valueAndCloserConsumer, ClosingFuture closingFuture) {
    }

    static /* synthetic */ CloseableList access$200(ClosingFuture closingFuture) {
    }

    static /* synthetic */ Logger access$3200() {
    }

    static /* synthetic */ void access$3300(Closeable closeable, Executor executor) {
    }

    private void becomeSubsumedInto(CloseableList closeableList) {
    }

    private <X extends Throwable, W extends V> ClosingFuture<V> catchingAsyncMoreGeneric(Class<X> cls, AsyncClosingFunction<? super X, W> asyncClosingFunction, Executor executor) {
    }

    private <X extends Throwable, W extends V> ClosingFuture<V> catchingMoreGeneric(Class<X> cls, ClosingFunction<? super X, W> closingFunction, Executor executor) {
    }

    private void checkAndUpdateState(State state, State state2) {
    }

    private void close() {
    }

    private static void closeQuietly(Closeable closeable, Executor executor) {
    }

    private boolean compareAndUpdateState(State state, State state2) {
    }

    private <U> ClosingFuture<U> derive(FluentFuture<U> fluentFuture) {
    }

    @Deprecated
    public static <C extends Closeable> ClosingFuture<C> eventuallyClosing(ListenableFuture<C> listenableFuture, Executor executor) {
    }

    public static <V> ClosingFuture<V> from(ListenableFuture<V> listenableFuture) {
    }

    private static <C, V extends C> void provideValueAndCloser(ValueAndCloserConsumer<C> valueAndCloserConsumer, ClosingFuture<V> closingFuture) {
    }

    public static <V> ClosingFuture<V> submit(ClosingCallable<V> closingCallable, Executor executor) {
    }

    public static <V> ClosingFuture<V> submitAsync(AsyncClosingCallable<V> asyncClosingCallable, Executor executor) {
    }

    public static Combiner whenAllComplete(Iterable<? extends ClosingFuture<?>> iterable) {
    }

    public static Combiner whenAllSucceed(Iterable<? extends ClosingFuture<?>> iterable) {
    }

    public static <V, U> AsyncClosingFunction<V, U> withoutCloser(AsyncFunction<V, U> asyncFunction) {
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
    }

    public <X extends Throwable> ClosingFuture<V> catching(Class<X> cls, ClosingFunction<? super X, ? extends V> closingFunction, Executor executor) {
    }

    public <X extends Throwable> ClosingFuture<V> catchingAsync(Class<X> cls, AsyncClosingFunction<? super X, ? extends V> asyncClosingFunction, Executor executor) {
    }

    protected void finalize() {
    }

    public FluentFuture<V> finishToFuture() {
    }

    public void finishToValueAndCloser(ValueAndCloserConsumer<? super V> valueAndCloserConsumer, Executor executor) {
    }

    public ListenableFuture<?> statusFuture() {
    }

    public String toString() {
    }

    public <U> ClosingFuture<U> transform(ClosingFunction<? super V, U> closingFunction, Executor executor) {
    }

    public <U> ClosingFuture<U> transformAsync(AsyncClosingFunction<? super V, U> asyncClosingFunction, Executor executor) {
    }

    @VisibleForTesting
    CountDownLatch whenClosedCountDown() {
    }

    private static final class CloseableList extends IdentityHashMap<Closeable, Executor> implements Closeable {
        private volatile boolean closed;
        private final DeferredCloser closer;
        private volatile CountDownLatch whenClosed;

        private CloseableList() {
        }

        static /* synthetic */ DeferredCloser access$300(CloseableList closeableList) {
        }

        void add(Closeable closeable, Executor executor) {
        }

        <V, U> FluentFuture<U> applyAsyncClosingFunction(AsyncClosingFunction<V, U> asyncClosingFunction, @ParametricNullness V v) throws Exception {
        }

        <V, U> ListenableFuture<U> applyClosingFunction(ClosingFunction<? super V, U> closingFunction, @ParametricNullness V v) throws Exception {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        CountDownLatch whenClosedCountDown() {
        }

        /* synthetic */ CloseableList(C10211 c10211) {
        }
    }

    private ClosingFuture(ListenableFuture<V> listenableFuture) {
    }

    public static Combiner whenAllComplete(ClosingFuture<?> closingFuture, ClosingFuture<?>... closingFutureArr) {
    }

    public static <V1, V2> Combiner2<V1, V2> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2) {
    }

    public static <V1, V2, V3> Combiner3<V1, V2, V3> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3) {
    }

    public static <V1, V2, V3, V4> Combiner4<V1, V2, V3, V4> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4) {
    }

    public static <V1, V2, V3, V4, V5> Combiner5<V1, V2, V3, V4, V5> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4, ClosingFuture<V5> closingFuture5) {
    }

    private ClosingFuture(ClosingCallable<V> closingCallable, Executor executor) {
    }

    public static Combiner whenAllSucceed(ClosingFuture<?> closingFuture, ClosingFuture<?> closingFuture2, ClosingFuture<?> closingFuture3, ClosingFuture<?> closingFuture4, ClosingFuture<?> closingFuture5, ClosingFuture<?> closingFuture6, ClosingFuture<?>... closingFutureArr) {
    }

    private ClosingFuture(AsyncClosingCallable<V> asyncClosingCallable, Executor executor) {
    }
}
