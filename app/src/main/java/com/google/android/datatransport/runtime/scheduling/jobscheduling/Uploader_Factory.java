package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Uploader_Factory implements Factory<Uploader> {
    private final vx0<BackendRegistry> backendRegistryProvider;
    private final vx0<Clock> clockProvider;
    private final vx0<Context> contextProvider;
    private final vx0<EventStore> eventStoreProvider;
    private final vx0<Executor> executorProvider;
    private final vx0<SynchronizationGuard> guardProvider;
    private final vx0<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(vx0<Context> vx0Var, vx0<BackendRegistry> vx0Var2, vx0<EventStore> vx0Var3, vx0<WorkScheduler> vx0Var4, vx0<Executor> vx0Var5, vx0<SynchronizationGuard> vx0Var6, vx0<Clock> vx0Var7) {
    }

    public static Uploader_Factory create(vx0<Context> vx0Var, vx0<BackendRegistry> vx0Var2, vx0<EventStore> vx0Var3, vx0<WorkScheduler> vx0Var4, vx0<Executor> vx0Var5, vx0<SynchronizationGuard> vx0Var6, vx0<Clock> vx0Var7) {
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public Uploader get() {
    }
}
