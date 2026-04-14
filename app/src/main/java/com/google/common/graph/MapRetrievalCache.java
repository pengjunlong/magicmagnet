package com.google.common.graph;

import java.util.Map;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {
    private volatile transient CacheEntry<K, V> cacheEntry1;
    private volatile transient CacheEntry<K, V> cacheEntry2;

    private static final class CacheEntry<K, V> {
        final K key;
        final V value;

        CacheEntry(K k, V v) {
        }
    }

    MapRetrievalCache(Map<K, V> map) {
    }

    private void addToCache(K k, V v) {
    }

    @Override // com.google.common.graph.MapIteratorCache
    void clearCache() {
    }

    @Override // com.google.common.graph.MapIteratorCache
    V get(Object obj) {
    }

    @Override // com.google.common.graph.MapIteratorCache
    V getIfCached(Object obj) {
    }

    private void addToCache(CacheEntry<K, V> cacheEntry) {
    }
}
