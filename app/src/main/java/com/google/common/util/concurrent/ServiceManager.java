package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.SetMultimap;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ServiceManager implements ServiceManagerBridge {
    private static final ListenerCallQueue.Event<Listener> HEALTHY_EVENT = null;
    private static final ListenerCallQueue.Event<Listener> STOPPED_EVENT = null;
    private static final Logger logger = null;
    private final ImmutableList<Service> services;
    private final ServiceManagerState state;

    /* renamed from: com.google.common.util.concurrent.ServiceManager$1 */
    class C10641 implements ListenerCallQueue.Event<Listener> {
        C10641() {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(Listener listener) {
        }
    }

    /* renamed from: com.google.common.util.concurrent.ServiceManager$2 */
    class C10652 implements ListenerCallQueue.Event<Listener> {
        C10652() {
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public /* bridge */ /* synthetic */ void call(Listener listener) {
        }

        public String toString() {
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public void call2(Listener listener) {
        }
    }

    private static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }

        /* synthetic */ EmptyServiceManagerWarning(C10641 c10641) {
        }
    }

    public static abstract class Listener {
        public void failure(Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    private static final class NoOpService extends AbstractService {
        private NoOpService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStart() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStop() {
        }

        /* synthetic */ NoOpService(C10641 c10641) {
        }
    }

    private static final class ServiceListener extends Service.Listener {
        final Service service;
        final WeakReference<ServiceManagerState> state;

        ServiceListener(Service service, WeakReference<ServiceManagerState> weakReference) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(Service.State state) {
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
        }
    }

    public ServiceManager(Iterable<? extends Service> iterable) {
    }

    static /* synthetic */ Logger access$200() {
    }

    static /* synthetic */ ListenerCallQueue.Event access$300() {
    }

    static /* synthetic */ ListenerCallQueue.Event access$400() {
    }

    public void addListener(Listener listener, Executor executor) {
    }

    public void awaitHealthy() {
    }

    public void awaitStopped() {
    }

    public boolean isHealthy() {
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    public /* bridge */ /* synthetic */ ImmutableMultimap servicesByState() {
    }

    @CanIgnoreReturnValue
    public ServiceManager startAsync() {
    }

    public ImmutableMap<Service, Long> startupTimes() {
    }

    @CanIgnoreReturnValue
    public ServiceManager stopAsync() {
    }

    public String toString() {
    }

    private static final class ServiceManagerState {
        final Monitor.Guard awaitHealthGuard;
        final ListenerCallQueue<Listener> listeners;
        final Monitor monitor;
        final int numberOfServices;

        @GuardedBy("monitor")
        boolean ready;

        @GuardedBy("monitor")
        final SetMultimap<Service.State, Service> servicesByState;

        @GuardedBy("monitor")
        final Map<Service, Stopwatch> startupTimers;

        @GuardedBy("monitor")
        final Multiset<Service.State> states;
        final Monitor.Guard stoppedGuard;

        @GuardedBy("monitor")
        boolean transitioned;

        /* renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1 */
        class C10661 implements Function<Map.Entry<Service, Long>, Long> {
            C10661(ServiceManagerState serviceManagerState) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Long apply(Map.Entry<Service, Long> entry) {
            }

            /* renamed from: apply, reason: avoid collision after fix types in other method */
            public Long apply2(Map.Entry<Service, Long> entry) {
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2 */
        class C10672 implements ListenerCallQueue.Event<Listener> {
            final /* synthetic */ Service val$service;

            C10672(ServiceManagerState serviceManagerState, Service service) {
            }

            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            public /* bridge */ /* synthetic */ void call(Listener listener) {
            }

            public String toString() {
            }

            /* renamed from: call, reason: avoid collision after fix types in other method */
            public void call2(Listener listener) {
            }
        }

        final class AwaitHealthGuard extends Monitor.Guard {
            final /* synthetic */ ServiceManagerState this$0;

            AwaitHealthGuard(ServiceManagerState serviceManagerState) {
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
            }
        }

        final class StoppedGuard extends Monitor.Guard {
            final /* synthetic */ ServiceManagerState this$0;

            StoppedGuard(ServiceManagerState serviceManagerState) {
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
            }
        }

        ServiceManagerState(ImmutableCollection<Service> immutableCollection) {
        }

        void addListener(Listener listener, Executor executor) {
        }

        void awaitHealthy() {
        }

        void awaitStopped() {
        }

        @GuardedBy("monitor")
        void checkHealthy() {
        }

        void dispatchListenerEvents() {
        }

        void enqueueFailedEvent(Service service) {
        }

        void enqueueHealthyEvent() {
        }

        void enqueueStoppedEvent() {
        }

        void markReady() {
        }

        ImmutableSetMultimap<Service.State, Service> servicesByState() {
        }

        ImmutableMap<Service, Long> startupTimes() {
        }

        void transitionService(Service service, Service.State state, Service.State state2) {
        }

        void tryStartTiming(Service service) {
        }

        void awaitStopped(long j, TimeUnit timeUnit) throws TimeoutException {
        }

        void awaitHealthy(long j, TimeUnit timeUnit) throws TimeoutException {
        }
    }

    public void awaitHealthy(long j, TimeUnit timeUnit) throws TimeoutException {
    }

    public void awaitStopped(long j, TimeUnit timeUnit) throws TimeoutException {
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    public ImmutableSetMultimap<Service.State, Service> servicesByState() {
    }
}
