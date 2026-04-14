package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractIdleService implements Service {
    private final Service delegate;
    private final Supplier<String> threadNameSupplier;

    /* renamed from: com.google.common.util.concurrent.AbstractIdleService$1 */
    class ExecutorC09981 implements Executor {
        final /* synthetic */ AbstractIdleService this$0;

        ExecutorC09981(AbstractIdleService abstractIdleService) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    private final class DelegateService extends AbstractService {
        final /* synthetic */ AbstractIdleService this$0;

        /* renamed from: com.google.common.util.concurrent.AbstractIdleService$DelegateService$1 */
        class RunnableC09991 implements Runnable {
            final /* synthetic */ DelegateService this$1;

            RunnableC09991(DelegateService delegateService) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractIdleService$DelegateService$2 */
        class RunnableC10002 implements Runnable {
            final /* synthetic */ DelegateService this$1;

            RunnableC10002(DelegateService delegateService) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private DelegateService(AbstractIdleService abstractIdleService) {
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

        /* synthetic */ DelegateService(AbstractIdleService abstractIdleService, ExecutorC09981 executorC09981) {
        }
    }

    private final class ThreadNameSupplier implements Supplier<String> {
        final /* synthetic */ AbstractIdleService this$0;

        private ThreadNameSupplier(AbstractIdleService abstractIdleService) {
        }

        @Override // com.google.common.base.Supplier
        public /* bridge */ /* synthetic */ String get() {
        }

        /* synthetic */ ThreadNameSupplier(AbstractIdleService abstractIdleService, ExecutorC09981 executorC09981) {
        }

        @Override // com.google.common.base.Supplier
        /* renamed from: get, reason: avoid collision after fix types in other method */
        public String get2() {
        }
    }

    protected AbstractIdleService() {
    }

    static /* synthetic */ Supplier access$200(AbstractIdleService abstractIdleService) {
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

    protected Executor executor() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
    }

    protected String serviceName() {
    }

    protected abstract void shutDown() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
    }

    protected abstract void startUp() throws Exception;

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
}
