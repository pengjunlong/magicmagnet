package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final vx0<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(vx0<Clock> vx0Var) {
    }

    public static SchedulerConfig config(Clock clock) {
    }

    public static SchedulingConfigModule_ConfigFactory create(vx0<Clock> vx0Var) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public SchedulerConfig get() {
    }
}
