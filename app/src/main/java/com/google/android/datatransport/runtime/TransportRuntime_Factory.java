package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final vx0<Clock> eventClockProvider;
    private final vx0<WorkInitializer> initializerProvider;
    private final vx0<Scheduler> schedulerProvider;
    private final vx0<Uploader> uploaderProvider;
    private final vx0<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(vx0<Clock> vx0Var, vx0<Clock> vx0Var2, vx0<Scheduler> vx0Var3, vx0<Uploader> vx0Var4, vx0<WorkInitializer> vx0Var5) {
    }

    public static TransportRuntime_Factory create(vx0<Clock> vx0Var, vx0<Clock> vx0Var2, vx0<Scheduler> vx0Var3, vx0<Uploader> vx0Var4, vx0<WorkInitializer> vx0Var5) {
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public TransportRuntime get() {
    }
}
