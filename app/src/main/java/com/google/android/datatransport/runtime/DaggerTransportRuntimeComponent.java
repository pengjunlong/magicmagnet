package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.concurrent.Executor;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class DaggerTransportRuntimeComponent extends TransportRuntimeComponent {
    private vx0<SchedulerConfig> configProvider;
    private vx0 creationContextFactoryProvider;
    private vx0<DefaultScheduler> defaultSchedulerProvider;
    private vx0<Executor> executorProvider;
    private vx0 metadataBackendRegistryProvider;
    private vx0<SQLiteEventStore> sQLiteEventStoreProvider;
    private vx0 schemaManagerProvider;
    private vx0<Context> setApplicationContextProvider;
    private vx0<TransportRuntime> transportRuntimeProvider;
    private vx0<Uploader> uploaderProvider;
    private vx0<WorkInitializer> workInitializerProvider;
    private vx0<WorkScheduler> workSchedulerProvider;

    private static final class Builder implements TransportRuntimeComponent.Builder {
        private Context setApplicationContext;

        private Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public TransportRuntimeComponent build() {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public /* bridge */ /* synthetic */ TransportRuntimeComponent.Builder setApplicationContext(Context context) {
        }

        /* synthetic */ Builder(C00601 c00601) {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public Builder setApplicationContext(Context context) {
        }
    }

    /* synthetic */ DaggerTransportRuntimeComponent(Context context, C00601 c00601) {
    }

    public static TransportRuntimeComponent.Builder builder() {
    }

    private void initialize(Context context) {
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    EventStore getEventStore() {
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    TransportRuntime getTransportRuntime() {
    }

    private DaggerTransportRuntimeComponent(Context context) {
    }
}
