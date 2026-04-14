package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final vx0<Clock> clockProvider;
    private final vx0<SchedulerConfig> configProvider;
    private final vx0<Context> contextProvider;
    private final vx0<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(vx0<Context> vx0Var, vx0<EventStore> vx0Var2, vx0<SchedulerConfig> vx0Var3, vx0<Clock> vx0Var4) {
    }

    public static SchedulingModule_WorkSchedulerFactory create(vx0<Context> vx0Var, vx0<EventStore> vx0Var2, vx0<SchedulerConfig> vx0Var3, vx0<Clock> vx0Var4) {
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public WorkScheduler get() {
    }
}
