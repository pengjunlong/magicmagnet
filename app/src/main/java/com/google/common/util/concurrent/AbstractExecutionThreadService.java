package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractExecutionThreadService implements Service {
    private static final Logger logger = null;
    private final Service delegate;

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1 */
    class C09931 extends AbstractService {
        final /* synthetic */ AbstractExecutionThreadService this$0;

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$1, reason: invalid class name */
        class AnonymousClass1 implements Supplier<String> {
            final /* synthetic */ C09931 this$1;

            AnonymousClass1(C09931 c09931) {
            }

            @Override // com.google.common.base.Supplier
            public /* bridge */ /* synthetic */ String get() {
            }

            @Override // com.google.common.base.Supplier
            /* renamed from: get, reason: avoid collision after fix types in other method */
            public String get2() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            final /* synthetic */ C09931 this$1;

            AnonymousClass2(C09931 c09931) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        C09931(AbstractExecutionThreadService abstractExecutionThreadService) {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStop() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$2 */
    class ExecutorC09942 implements Executor {
        final /* synthetic */ AbstractExecutionThreadService this$0;

        ExecutorC09942(AbstractExecutionThreadService abstractExecutionThreadService) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    protected AbstractExecutionThreadService() {
    }

    static /* synthetic */ Logger access$000() {
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

    protected abstract void run() throws Exception;

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

    @Beta
    protected void triggerShutdown() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
    }
}
