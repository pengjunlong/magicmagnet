package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DefaultScheduler implements Scheduler {
    private static final Logger LOGGER = null;
    private final BackendRegistry backendRegistry;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
    }

    public static /* synthetic */ Object dpbdbdpbLwkLpObyKsq1lll1(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
    }

    private /* synthetic */ Object lambda$schedule$0(TransportContext transportContext, EventInternal eventInternal) {
    }

    private /* synthetic */ void lambda$schedule$1(TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
    }
}
