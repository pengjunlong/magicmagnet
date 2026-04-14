package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FirebasePerformanceModule {
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider<RemoteConfigComponent> remoteConfigComponentProvider;
    private final Provider<TransportFactory> transportFactoryProvider;

    public FirebasePerformanceModule(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<RemoteConfigComponent> provider, Provider<TransportFactory> provider2) {
    }

    ConfigResolver providesConfigResolver() {
    }

    FirebaseApp providesFirebaseApp() {
    }

    FirebaseInstallationsApi providesFirebaseInstallations() {
    }

    GaugeManager providesGaugeManager() {
    }

    Provider<RemoteConfigComponent> providesRemoteConfigComponent() {
    }

    RemoteConfigManager providesRemoteConfigManager() {
    }

    Provider<TransportFactory> providesTransportFactoryProvider() {
    }
}
