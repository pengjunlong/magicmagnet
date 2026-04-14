package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final vx0<BackendRegistry> backendRegistryProvider;
    private final vx0<EventStore> eventStoreProvider;
    private final vx0<Executor> executorProvider;
    private final vx0<SynchronizationGuard> guardProvider;
    private final vx0<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(vx0<Executor> vx0Var, vx0<BackendRegistry> vx0Var2, vx0<WorkScheduler> vx0Var3, vx0<EventStore> vx0Var4, vx0<SynchronizationGuard> vx0Var5) {
    }

    public static DefaultScheduler_Factory create(vx0<Executor> vx0Var, vx0<BackendRegistry> vx0Var2, vx0<WorkScheduler> vx0Var3, vx0<EventStore> vx0Var4, vx0<SynchronizationGuard> vx0Var5) {
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public DefaultScheduler get() {
    }
}
