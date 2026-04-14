package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractService implements Service {
    private static final ListenerCallQueue.Event<Service.Listener> RUNNING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> STARTING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> STOPPING_FROM_RUNNING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> STOPPING_FROM_STARTING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_NEW_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_RUNNING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_STARTING_EVENT = null;
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_STOPPING_EVENT = null;
    private final Monitor.Guard hasReachedRunning;
    private final Monitor.Guard isStartable;
    private final Monitor.Guard isStoppable;
    private final Monitor.Guard isStopped;
    private final ListenerCallQueue<Service.Listener> listeners;
    private final Monitor monitor;
    private volatile StateSnapshot snapshot;

    /* renamed from: com.google.common.util.concurrent.AbstractService$1 */
    class C10071 implements ListenerCallQueue.Event<Service.Listener> {
        C10071() {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$2 */
    class C10082 implements ListenerCallQueue.Event<Service.Listener> {
        C10082() {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$3 */
    class C10093 implements ListenerCallQueue.Event<Service.Listener> {
        final /* synthetic */ Service.State val$from;

        C10093(Service.State state) {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$4 */
    class C10104 implements ListenerCallQueue.Event<Service.Listener> {
        final /* synthetic */ Service.State val$from;

        C10104(Service.State state) {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$5 */
    class C10115 implements ListenerCallQueue.Event<Service.Listener> {
        final /* synthetic */ Throwable val$cause;
        final /* synthetic */ Service.State val$from;

        C10115(AbstractService abstractService, Service.State state, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Service.Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(Service.Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractService$6 */
    static /* synthetic */ class C10126 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$Service$State = null;
    }

    private final class HasReachedRunningGuard extends Monitor.Guard {
        final /* synthetic */ AbstractService this$0;

        HasReachedRunningGuard(AbstractService abstractService) {
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
        }
    }

    private final class IsStartableGuard extends Monitor.Guard {
        final /* synthetic */ AbstractService this$0;

        IsStartableGuard(AbstractService abstractService) {
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
        }
    }

    private final class IsStoppableGuard extends Monitor.Guard {
        final /* synthetic */ AbstractService this$0;

        IsStoppableGuard(AbstractService abstractService) {
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
        }
    }

    private final class IsStoppedGuard extends Monitor.Guard {
        final /* synthetic */ AbstractService this$0;

        IsStoppedGuard(AbstractService abstractService) {
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
        }
    }

    private static final class StateSnapshot {
        final Throwable failure;
        final boolean shutdownWhenStartupFinishes;
        final Service.State state;

        StateSnapshot(Service.State state) {
        }

        Service.State externalState() {
        }

        Throwable failureCause() {
        }

        StateSnapshot(Service.State state, boolean z, Throwable th) {
        }
    }

    protected AbstractService() {
    }

    static /* synthetic */ Monitor access$000(AbstractService abstractService) {
    }

    @GuardedBy("monitor")
    private void checkCurrentState(Service.State state) {
    }

    private void dispatchListenerEvents() {
    }

    private void enqueueFailedEvent(Service.State state, Throwable th) {
    }

    private void enqueueRunningEvent() {
    }

    private void enqueueStartingEvent() {
    }

    private void enqueueStoppingEvent(Service.State state) {
    }

    private void enqueueTerminatedEvent(Service.State state) {
    }

    private static ListenerCallQueue.Event<Service.Listener> stoppingEvent(Service.State state) {
    }

    private static ListenerCallQueue.Event<Service.Listener> terminatedEvent(Service.State state) {
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

    @Beta
    @ForOverride
    protected void doCancelStart() {
    }

    @ForOverride
    protected abstract void doStart();

    @ForOverride
    protected abstract void doStop();

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
    }

    protected final void notifyFailed(Throwable th) {
    }

    protected final void notifyStarted() {
    }

    protected final void notifyStopped() {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
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
}
