package com.google.firebase.perf;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FirebasePerformance_Factory implements vx0 {
    private final vx0<ConfigResolver> configResolverProvider;
    private final vx0<FirebaseApp> firebaseAppProvider;
    private final vx0<FirebaseInstallationsApi> firebaseInstallationsApiProvider;
    private final vx0<Provider<RemoteConfigComponent>> firebaseRemoteConfigProvider;
    private final vx0<GaugeManager> gaugeManagerProvider;
    private final vx0<RemoteConfigManager> remoteConfigManagerProvider;
    private final vx0<Provider<TransportFactory>> transportFactoryProvider;

    public FirebasePerformance_Factory(vx0<FirebaseApp> vx0Var, vx0<Provider<RemoteConfigComponent>> vx0Var2, vx0<FirebaseInstallationsApi> vx0Var3, vx0<Provider<TransportFactory>> vx0Var4, vx0<RemoteConfigManager> vx0Var5, vx0<ConfigResolver> vx0Var6, vx0<GaugeManager> vx0Var7) {
    }

    public static FirebasePerformance_Factory create(vx0<FirebaseApp> vx0Var, vx0<Provider<RemoteConfigComponent>> vx0Var2, vx0<FirebaseInstallationsApi> vx0Var3, vx0<Provider<TransportFactory>> vx0Var4, vx0<RemoteConfigManager> vx0Var5, vx0<ConfigResolver> vx0Var6, vx0<GaugeManager> vx0Var7) {
    }

    public static FirebasePerformance newInstance(FirebaseApp firebaseApp, Provider<RemoteConfigComponent> provider, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, GaugeManager gaugeManager) {
    }

    @Override // p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // p000.vx0
    public FirebasePerformance get() {
    }
}
