package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractScheduledService implements Service {
    private static final Logger logger = null;
    private final AbstractService delegate;

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1 */
    class C10011 extends Service.Listener {
        final /* synthetic */ ScheduledExecutorService val$executor;

        C10011(AbstractScheduledService abstractScheduledService, ScheduledExecutorService scheduledExecutorService) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl, reason: invalid class name */
    class C1ThreadFactoryImpl implements ThreadFactory {
        final /* synthetic */ AbstractScheduledService this$0;

        C1ThreadFactoryImpl(AbstractScheduledService abstractScheduledService) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    interface Cancellable {
        void cancel(boolean z);

        boolean isCancelled();
    }

    public static abstract class CustomScheduler extends Scheduler {

        private final class ReschedulableCallable implements Callable<Void> {

            @GuardedBy("lock")
            private SupplantableFuture cancellationDelegate;
            private final ScheduledExecutorService executor;
            private final ReentrantLock lock;
            private final AbstractService service;
            final /* synthetic */ CustomScheduler this$0;
            private final Runnable wrappedRunnable;

            ReschedulableCallable(CustomScheduler customScheduler, AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            }

            @GuardedBy("lock")
            private Cancellable initializeOrUpdateCancellationDelegate(Schedule schedule) {
            }

            private ScheduledFuture<Void> submitToExecutor(Schedule schedule) {
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() throws Exception {
            }

            @CanIgnoreReturnValue
            public Cancellable reschedule() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: call, reason: avoid collision after fix types in other method */
            public Void call2() throws Exception {
            }
        }

        protected static final class Schedule {
            private final long delay;
            private final TimeUnit unit;

            public Schedule(long j, TimeUnit timeUnit) {
            }

            static /* synthetic */ TimeUnit access$1000(Schedule schedule) {
            }

            static /* synthetic */ long access$900(Schedule schedule) {
            }
        }

        private static final class SupplantableFuture implements Cancellable {

            @GuardedBy("lock")
            private Future<Void> currentFuture;
            private final ReentrantLock lock;

            SupplantableFuture(ReentrantLock reentrantLock, Future<Void> future) {
            }

            static /* synthetic */ Future access$800(SupplantableFuture supplantableFuture) {
            }

            static /* synthetic */ Future access$802(SupplantableFuture supplantableFuture, Future future) {
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public void cancel(boolean z) {
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public boolean isCancelled() {
            }
        }

        protected abstract Schedule getNextSchedule() throws Exception;

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        final Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        }
    }

    private static final class FutureAsCancellable implements Cancellable {
        private final Future<?> delegate;

        FutureAsCancellable(Future<?> future) {
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public void cancel(boolean z) {
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public boolean isCancelled() {
        }
    }

    public static abstract class Scheduler {

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1 */
        class C10021 extends Scheduler {
            final /* synthetic */ long val$delay;
            final /* synthetic */ long val$initialDelay;
            final /* synthetic */ TimeUnit val$unit;

            C10021(long j, long j2, TimeUnit timeUnit) {
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2 */
        class C10032 extends Scheduler {
            final /* synthetic */ long val$initialDelay;
            final /* synthetic */ long val$period;
            final /* synthetic */ TimeUnit val$unit;

            C10032(long j, long j2, TimeUnit timeUnit) {
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            }
        }

        /* synthetic */ Scheduler(C10011 c10011) {
        }

        public static Scheduler newFixedDelaySchedule(long j, long j2, TimeUnit timeUnit) {
        }

        public static Scheduler newFixedRateSchedule(long j, long j2, TimeUnit timeUnit) {
        }

        abstract Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        private Scheduler() {
        }
    }

    protected AbstractScheduledService() {
    }

    static /* synthetic */ Logger access$400() {
    }

    static /* synthetic */ AbstractService access$500(AbstractScheduledService abstractScheduledService) {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
    }

    protected ScheduledExecutorService executor() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
    }

    protected abstract void runOneIteration() throws Exception;

    protected abstract Scheduler scheduler();

    protected String serviceName() {
    }

    protected void shutDown() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
    }

    protected void startUp() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
    }

    public String toString() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
    }

    private final class ServiceDelegate extends AbstractService {
        private volatile ScheduledExecutorService executorService;
        private final ReentrantLock lock;
        private volatile Cancellable runningTask;
        private final Runnable task;
        final /* synthetic */ AbstractScheduledService this$0;

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1 */
        class C10041 implements Supplier<String> {
            final /* synthetic */ ServiceDelegate this$1;

            C10041(ServiceDelegate serviceDelegate) {
            }

            @Override // com.google.common.base.Supplier
            public /* bridge */ /* synthetic */ String get() {
            }

            @Override // com.google.common.base.Supplier
            /* renamed from: get, reason: avoid collision after fix types in other method */
            public String get2() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2 */
        class RunnableC10052 implements Runnable {
            final /* synthetic */ ServiceDelegate this$1;

            RunnableC10052(ServiceDelegate serviceDelegate) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$3 */
        class RunnableC10063 implements Runnable {
            final /* synthetic */ ServiceDelegate this$1;

            RunnableC10063(ServiceDelegate serviceDelegate) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        class Task implements Runnable {
            final /* synthetic */ ServiceDelegate this$1;

            Task(ServiceDelegate serviceDelegate) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private ServiceDelegate(AbstractScheduledService abstractScheduledService) {
        }

        static /* synthetic */ ReentrantLock access$200(ServiceDelegate serviceDelegate) {
        }

        static /* synthetic */ Cancellable access$300(ServiceDelegate serviceDelegate) {
        }

        static /* synthetic */ Cancellable access$302(ServiceDelegate serviceDelegate, Cancellable cancellable) {
        }

        static /* synthetic */ ScheduledExecutorService access$600(ServiceDelegate serviceDelegate) {
        }

        static /* synthetic */ Runnable access$700(ServiceDelegate serviceDelegate) {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
        }

        /* synthetic */ ServiceDelegate(AbstractScheduledService abstractScheduledService, C10011 c10011) {
        }
    }
}
