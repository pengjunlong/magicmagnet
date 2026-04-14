package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class MetadataBackendRegistry implements BackendRegistry {
    private static final String BACKEND_KEY_PREFIX = "backend:";
    private static final String TAG = "BackendRegistry";
    private final BackendFactoryProvider backendFactoryProvider;
    private final Map<String, TransportBackend> backends;
    private final CreationContextFactory creationContextFactory;

    static class BackendFactoryProvider {
        private final Context applicationContext;
        private Map<String, String> backendProviders;

        BackendFactoryProvider(Context context) {
        }

        private Map<String, String> discover(Context context) {
        }

        private Map<String, String> getBackendProviders() {
        }

        private static Bundle getMetadata(Context context) {
        }

        BackendFactory get(String str) {
        }
    }

    MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public synchronized TransportBackend get(String str) {
    }

    MetadataBackendRegistry(BackendFactoryProvider backendFactoryProvider, CreationContextFactory creationContextFactory) {
    }
}
