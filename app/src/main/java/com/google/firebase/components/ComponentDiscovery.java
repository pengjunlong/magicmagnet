package com.google.firebase.components;

import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.inject.Provider;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ComponentDiscovery<T> {
    private static final String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    static final String TAG = "ComponentDiscovery";
    private final T context;
    private final RegistrarNameRetriever<T> retriever;

    private static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {
        private final Class<? extends Service> discoveryService;

        /* synthetic */ MetadataRegistrarNameRetriever(Class cls, C10871 c10871) {
        }

        private Bundle getMetadata(Context context) {
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public /* bridge */ /* synthetic */ List retrieve(Context context) {
        }

        private MetadataRegistrarNameRetriever(Class<? extends Service> cls) {
        }

        /* renamed from: retrieve, reason: avoid collision after fix types in other method */
        public List<String> retrieve2(Context context) {
        }
    }

    interface RegistrarNameRetriever<T> {
        List<String> retrieve(T t);
    }

    ComponentDiscovery(T t, RegistrarNameRetriever<T> registrarNameRetriever) {
    }

    public static /* synthetic */ ComponentRegistrar dbpqdHhmDSIHIJiwc1ll1l1(String str) {
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
    }

    private static ComponentRegistrar instantiate(String str) {
    }

    private static /* synthetic */ ComponentRegistrar lambda$discoverLazy$0(String str) {
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
    }

    public List<Provider<ComponentRegistrar>> discoverLazy() {
    }
}
