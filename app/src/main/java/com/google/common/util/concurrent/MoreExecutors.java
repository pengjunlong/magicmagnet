package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MoreExecutors {

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$1 */
    class RunnableC10551 implements Runnable {
        final /* synthetic */ ListenableFuture val$future;
        final /* synthetic */ BlockingQueue val$queue;

        RunnableC10551(BlockingQueue blockingQueue, ListenableFuture listenableFuture) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$2 */
    class ExecutorC10562 implements Executor {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Supplier val$nameSupplier;

        ExecutorC10562(Executor executor, Supplier supplier) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$3 */
    class C10573 extends WrappingExecutorService {
        final /* synthetic */ Supplier val$nameSupplier;

        C10573(ExecutorService executorService, Supplier supplier) {
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected <T> Callable<T> wrapTask(Callable<T> callable) {
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected Runnable wrapTask(Runnable runnable) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$4 */
    class C10584 extends WrappingScheduledExecutorService {
        final /* synthetic */ Supplier val$nameSupplier;

        C10584(ScheduledExecutorService scheduledExecutorService, Supplier supplier) {
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected <T> Callable<T> wrapTask(Callable<T> callable) {
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        protected Runnable wrapTask(Runnable runnable) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$5 */
    class ExecutorC10595 implements Executor {
        final /* synthetic */ Executor val$delegate;
        final /* synthetic */ AbstractFuture val$future;

        ExecutorC10595(Executor executor, AbstractFuture abstractFuture) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    @GwtIncompatible
    private static class ListeningDecorator extends AbstractListeningExecutorService {
        private final ExecutorService delegate;

        ListeningDecorator(ExecutorService executorService) {
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
        }

        public final String toString() {
        }
    }

    @GwtIncompatible
    private static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {
        final ScheduledExecutorService delegate;

        private static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {
            private final ScheduledFuture<?> scheduledDelegate;

            public ListenableScheduledTask(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
            }

            /* renamed from: compareTo, reason: avoid collision after fix types in other method */
            public int compareTo2(Delayed delayed) {
            }
        }

        @GwtIncompatible
        private static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            private final Runnable delegate;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            protected String pendingToString() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        }
    }

    private MoreExecutors() {
    }

    static /* synthetic */ void access$000(ThreadPoolExecutor threadPoolExecutor) {
    }

    @Beta
    @GwtIncompatible
    public static void addDelayedShutdownHook(ExecutorService executorService, long j, TimeUnit timeUnit) {
    }

    public static Executor directExecutor() {
    }

    @Beta
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
    }

    @Beta
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
    }

    @ParametricNullness
    @GwtIncompatible
    static <T> T invokeAnyImpl(ListeningExecutorService listeningExecutorService, Collection<? extends Callable<T>> collection, boolean z, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }

    @GwtIncompatible
    private static boolean isAppEngineWithApiClasses() {
    }

    @GwtIncompatible
    public static ListeningExecutorService listeningDecorator(ExecutorService executorService) {
    }

    @GwtIncompatible
    public static ListeningExecutorService newDirectExecutorService() {
    }

    @Beta
    @GwtIncompatible
    public static Executor newSequentialExecutor(Executor executor) {
    }

    @GwtIncompatible
    static Thread newThread(String str, Runnable runnable) {
    }

    @Beta
    @GwtIncompatible
    public static ThreadFactory platformThreadFactory() {
    }

    static Executor rejectionPropagatingExecutor(Executor executor, AbstractFuture<?> abstractFuture) {
    }

    @GwtIncompatible
    static Executor renamingDecorator(Executor executor, Supplier<String> supplier) {
    }

    @CanIgnoreReturnValue
    @Beta
    @GwtIncompatible
    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j, TimeUnit timeUnit) {
    }

    @GwtIncompatible
    private static <T> ListenableFuture<T> submitAndAddQueueListener(ListeningExecutorService listeningExecutorService, Callable<T> callable, BlockingQueue<Future<T>> blockingQueue) {
    }

    @GwtIncompatible
    private static void useDaemonThreadFactory(ThreadPoolExecutor threadPoolExecutor) {
    }

    @Beta
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
    }

    @VisibleForTesting
    @GwtIncompatible
    static class Application {

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1 */
        class RunnableC10601 implements Runnable {
            final /* synthetic */ ExecutorService val$service;
            final /* synthetic */ long val$terminationTimeout;
            final /* synthetic */ TimeUnit val$timeUnit;

            RunnableC10601(Application application, ExecutorService executorService, long j, TimeUnit timeUnit) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        Application() {
        }

        final void addDelayedShutdownHook(ExecutorService executorService, long j, TimeUnit timeUnit) {
        }

        @VisibleForTesting
        void addShutdownHook(Thread thread) {
        }

        final ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
        }

        final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
        }

        final ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        }

        final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        }
    }

    @Beta
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
    }

    @GwtIncompatible
    private static final class DirectExecutorService extends AbstractListeningExecutorService {
        private final Object lock;

        @GuardedBy("lock")
        private int runningTasks;

        @GuardedBy("lock")
        private boolean shutdown;

        private DirectExecutorService() {
        }

        private void endTask() {
        }

        private void startTask() {
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
        }

        /* synthetic */ DirectExecutorService(RunnableC10551 runnableC10551) {
        }
    }

    @GwtIncompatible
    static ExecutorService renamingDecorator(ExecutorService executorService, Supplier<String> supplier) {
    }

    @GwtIncompatible
    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
    }

    @GwtIncompatible
    static ScheduledExecutorService renamingDecorator(ScheduledExecutorService scheduledExecutorService, Supplier<String> supplier) {
    }
}
