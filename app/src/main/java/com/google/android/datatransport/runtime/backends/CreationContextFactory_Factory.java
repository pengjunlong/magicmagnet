package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final vx0<Context> applicationContextProvider;
    private final vx0<Clock> monotonicClockProvider;
    private final vx0<Clock> wallClockProvider;

    public CreationContextFactory_Factory(vx0<Context> vx0Var, vx0<Clock> vx0Var2, vx0<Clock> vx0Var3) {
    }

    public static CreationContextFactory_Factory create(vx0<Context> vx0Var, vx0<Clock> vx0Var2, vx0<Clock> vx0Var3) {
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public CreationContextFactory get() {
    }
}
