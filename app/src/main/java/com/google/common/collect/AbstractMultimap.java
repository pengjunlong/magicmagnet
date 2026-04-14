package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractMultimap<K, V> implements Multimap<K, V> {

    @LazyInit
    private transient Map<K, Collection<V>> asMap;

    @LazyInit
    private transient Collection<Map.Entry<K, V>> entries;

    @LazyInit
    private transient Set<K> keySet;

    @LazyInit
    private transient Multiset<K> keys;

    @LazyInit
    private transient Collection<V> values;

    class Entries extends Multimaps.Entries<K, V> {
        final /* synthetic */ AbstractMultimap this$0;

        Entries(AbstractMultimap abstractMultimap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        Multimap<K, V> multimap() {
        }
    }

    class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        EntrySet(AbstractMultimap abstractMultimap) {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }
    }

    class Values extends AbstractCollection<V> {
        final /* synthetic */ AbstractMultimap this$0;

        Values(AbstractMultimap abstractMultimap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    AbstractMultimap() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
    }

    abstract Map<K, Collection<V>> createAsMap();

    abstract Collection<Map.Entry<K, V>> createEntries();

    abstract Set<K> createKeySet();

    abstract Multiset<K> createKeys();

    abstract Collection<V> createValues();

    @Override // com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
    }

    abstract Iterator<Map.Entry<K, V>> entryIterator();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(Object obj) {
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
    }

    @Override // com.google.common.collect.Multimap
    public Multiset<K> keys() {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(@ParametricNullness K k, Iterable<? extends V> iterable) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
    }

    public String toString() {
    }

    Iterator<V> valueIterator() {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
    }
}
