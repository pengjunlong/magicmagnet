package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true, serializable = true)
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = null;

    @RetainedWith
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;

    @RetainedWith
    @LazyInit
    private transient ImmutableSet<K> keySet;

    @LazyInit
    private transient ImmutableSetMultimap<K, V> multimapView;

    @RetainedWith
    @LazyInit
    private transient ImmutableCollection<V> values;

    /* renamed from: com.google.common.collect.ImmutableMap$1 */
    class C07071 extends UnmodifiableIterator<K> {
        final /* synthetic */ UnmodifiableIterator val$entryIterator;

        C07071(ImmutableMap immutableMap, UnmodifiableIterator unmodifiableIterator) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public K next() {
        }
    }

    @DoNotMock
    public static class Builder<K, V> {
        Object[] alternatingKeysAndValues;
        boolean entriesUsed;
        int size;
        Comparator<? super V> valueComparator;

        public Builder() {
        }

        private void ensureCapacity(int i) {
        }

        public ImmutableMap<K, V> build() {
        }

        public ImmutableMap<K, V> buildOrThrow() {
        }

        @CanIgnoreReturnValue
        Builder<K, V> combine(Builder<K, V> builder) {
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
        }

        void sortEntries() {
        }

        Builder(int i) {
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
        }
    }

    static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {

        /* renamed from: com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl, reason: invalid class name */
        class C1EntrySetImpl extends ImmutableMapEntrySet<K, V> {
            final /* synthetic */ IteratorBasedImmutableMap this$0;

            C1EntrySetImpl(IteratorBasedImmutableMap iteratorBasedImmutableMap) {
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public /* bridge */ /* synthetic */ Iterator iterator() {
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            ImmutableMap<K, V> map() {
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            }
        }

        IteratorBasedImmutableMap() {
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableCollection<V> createValues() {
        }

        abstract UnmodifiableIterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
        }
    }

    private final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        final /* synthetic */ ImmutableMap this$0;

        /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1 */
        class C07081 extends UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> {
            final /* synthetic */ Iterator val$backingIterator;

            /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1$1, reason: invalid class name */
            class AnonymousClass1 extends AbstractMapEntry<K, ImmutableSet<V>> {
                final /* synthetic */ Map.Entry val$backingEntry;

                AnonymousClass1(C07081 c07081, Map.Entry entry) {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public K getKey() {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public /* bridge */ /* synthetic */ Object getValue() {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public ImmutableSet<V> getValue() {
                }
            }

            C07081(MapViewOfValuesAsSingletonSets mapViewOfValuesAsSingletonSets, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public Map.Entry<K, ImmutableSet<V>> next() {
            }
        }

        private MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap) {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        ImmutableSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isHashCodeFast() {
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
        }

        @Override // java.util.Map
        public int size() {
        }

        /* synthetic */ MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap, C07071 c07071) {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public ImmutableSet<V> get(Object obj) {
        }
    }

    static class SerializedForm<K, V> implements Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        SerializedForm(ImmutableMap<K, V> immutableMap) {
        }

        final Object legacyReadResolve() {
        }

        Builder<K, V> makeBuilder(int i) {
        }

        final Object readResolve() {
        }
    }

    ImmutableMap() {
    }

    public static <K, V> Builder<K, V> builder() {
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i) {
    }

    static void checkNoConflict(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
    }

    static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
    }

    static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
    }

    public static <K, V> ImmutableMap<K, V> of() {
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
    }

    abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    abstract ImmutableSet<K> createKeySet();

    abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
    }

    @Override // java.util.Map
    public int hashCode() {
    }

    @Override // java.util.Map
    public boolean isEmpty() {
    }

    boolean isHashCodeFast() {
    }

    abstract boolean isPartialView();

    UnmodifiableIterator<K> keyIterator() {
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V put(K k, V v) {
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
    }

    public String toString() {
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ Collection values() {
    }

    Object writeReplace() {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v) {
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2) {
    }

    @Beta
    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
    }

    public static <K, V> ImmutableMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
    }
}
