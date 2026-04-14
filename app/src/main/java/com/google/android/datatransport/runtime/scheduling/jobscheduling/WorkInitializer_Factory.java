package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final vx0<Executor> executorProvider;
    private final vx0<SynchronizationGuard> guardProvider;
    private final vx0<WorkScheduler> schedulerProvider;
    private final vx0<EventStore> storeProvider;

    public WorkInitializer_Factory(vx0<Executor> vx0Var, vx0<EventStore> vx0Var2, vx0<WorkScheduler> vx0Var3, vx0<SynchronizationGuard> vx0Var4) {
    }

    public static WorkInitializer_Factory create(vx0<Executor> vx0Var, vx0<EventStore> vx0Var2, vx0<WorkScheduler> vx0Var3, vx0<SynchronizationGuard> vx0Var4) {
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public WorkInitializer get() {
    }
}
