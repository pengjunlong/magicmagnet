package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory;
import java.util.Map;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, vx0<V>> implements Lazy<Map<K, vx0<V>>> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, vx0<V>> {
        /* synthetic */ Builder(int i, C00641 c00641) {
        }

        public MapProviderFactory<K, V> build() {
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ AbstractMapFactory.Builder put(Object obj, vx0 vx0Var) {
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ AbstractMapFactory.Builder putAll(vx0 vx0Var) {
        }

        private Builder(int i) {
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k, vx0<V> vx0Var) {
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(vx0<Map<K, vx0<V>>> vx0Var) {
        }
    }

    /* synthetic */ MapProviderFactory(Map map, C00641 c00641) {
    }

    public static <K, V> Builder<K, V> builder(int i) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory, com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public /* bridge */ /* synthetic */ Object get() {
    }

    private MapProviderFactory(Map<K, vx0<V>> map) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory, com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public Map<K, vx0<V>> get() {
    }
}
