package com.google.android.datatransport.runtime.dagger.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, vx0<V>> contributingMap;

    public static abstract class Builder<K, V, V2> {
        final LinkedHashMap<K, vx0<V>> map;

        Builder(int i) {
        }

        Builder<K, V, V2> put(K k, vx0<V> vx0Var) {
        }

        Builder<K, V, V2> putAll(vx0<Map<K, V2>> vx0Var) {
        }
    }

    AbstractMapFactory(Map<K, vx0<V>> map) {
    }

    static /* synthetic */ Map access$000(AbstractMapFactory abstractMapFactory) {
    }

    final Map<K, vx0<V>> contributingMap() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public abstract /* synthetic */ Object get();
}
