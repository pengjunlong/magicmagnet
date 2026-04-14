package com.google.firebase.perf.injection.components;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DaggerFirebasePerformanceComponent implements FirebasePerformanceComponent {
    private vx0<FirebasePerformance> firebasePerformanceProvider;
    private vx0<ConfigResolver> providesConfigResolverProvider;
    private vx0<FirebaseApp> providesFirebaseAppProvider;
    private vx0<FirebaseInstallationsApi> providesFirebaseInstallationsProvider;
    private vx0<GaugeManager> providesGaugeManagerProvider;
    private vx0<Provider<RemoteConfigComponent>> providesRemoteConfigComponentProvider;
    private vx0<RemoteConfigManager> providesRemoteConfigManagerProvider;
    private vx0<Provider<TransportFactory>> providesTransportFactoryProvider;

    public static final class Builder {
        private FirebasePerformanceModule firebasePerformanceModule;

        /* synthetic */ Builder(C11671 c11671) {
        }

        public FirebasePerformanceComponent build() {
        }

        public Builder firebasePerformanceModule(FirebasePerformanceModule firebasePerformanceModule) {
        }

        private Builder() {
        }
    }

    /* synthetic */ DaggerFirebasePerformanceComponent(FirebasePerformanceModule firebasePerformanceModule, C11671 c11671) {
    }

    public static Builder builder() {
    }

    private void initialize(FirebasePerformanceModule firebasePerformanceModule) {
    }

    @Override // com.google.firebase.perf.injection.components.FirebasePerformanceComponent
    public FirebasePerformance getFirebasePerformance() {
    }

    private DaggerFirebasePerformanceComponent(FirebasePerformanceModule firebasePerformanceModule) {
    }
}
