package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final vx0<Clock> clockProvider;
    private final vx0<EventStoreConfig> configProvider;
    private final vx0<SchemaManager> schemaManagerProvider;
    private final vx0<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(vx0<Clock> vx0Var, vx0<Clock> vx0Var2, vx0<EventStoreConfig> vx0Var3, vx0<SchemaManager> vx0Var4) {
    }

    public static SQLiteEventStore_Factory create(vx0<Clock> vx0Var, vx0<Clock> vx0Var2, vx0<EventStoreConfig> vx0Var3, vx0<SchemaManager> vx0Var4) {
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public SQLiteEventStore get() {
    }
}
