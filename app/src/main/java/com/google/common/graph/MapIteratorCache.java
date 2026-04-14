package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class MapIteratorCache<K, V> {
    private final Map<K, V> backingMap;
    private volatile transient Map.Entry<K, V> cacheEntry;

    /* renamed from: com.google.common.graph.MapIteratorCache$1 */
    class C08951 extends AbstractSet<K> {
        final /* synthetic */ MapIteratorCache this$0;

        /* renamed from: com.google.common.graph.MapIteratorCache$1$1, reason: invalid class name */
        class AnonymousClass1 extends UnmodifiableIterator<K> {
            final /* synthetic */ C08951 this$1;
            final /* synthetic */ Iterator val$entryIterator;

            AnonymousClass1(C08951 c08951, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public K next() {
            }
        }

        C08951(MapIteratorCache mapIteratorCache) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<K> iterator() {
        }
    }

    MapIteratorCache(Map<K, V> map) {
    }

    static /* synthetic */ Map access$000(MapIteratorCache mapIteratorCache) {
    }

    static /* synthetic */ Map.Entry access$102(MapIteratorCache mapIteratorCache, Map.Entry entry) {
    }

    final void clear() {
    }

    void clearCache() {
    }

    final boolean containsKey(Object obj) {
    }

    V get(Object obj) {
    }

    V getIfCached(Object obj) {
    }

    final V getWithoutCaching(Object obj) {
    }

    @CanIgnoreReturnValue
    final V put(K k, V v) {
    }

    @CanIgnoreReturnValue
    final V remove(Object obj) {
    }

    final Set<K> unmodifiableKeySet() {
    }
}
