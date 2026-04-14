package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Multiset;
import com.google.common.collect.Table;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Synchronized {

    private static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;
        transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;
        transient Collection<Collection<V>> asMapValues;

        SynchronizedAsMap(Map<K, Collection<V>> map, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public boolean containsValue(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<Collection<V>> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<V> get(Object obj) {
        }
    }

    private static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapValues$1 */
        class C08261 extends TransformedIterator<Collection<V>, Collection<V>> {
            final /* synthetic */ SynchronizedAsMapValues this$0;

            C08261(SynchronizedAsMapValues synchronizedAsMapValues, Iterator it) {
            }

            @Override // com.google.common.collect.TransformedIterator
            /* bridge */ /* synthetic */ Object transform(Object obj) {
            }

            Collection<V> transform(Collection<V> collection) {
            }
        }

        SynchronizedAsMapValues(Collection<Collection<V>> collection, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
        }
    }

    @VisibleForTesting
    static class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V> {
        private static final long serialVersionUID = 0;

        @RetainedWith
        private transient BiMap<V, K> inverse;
        private transient Set<V> valueSet;

        /* synthetic */ SynchronizedBiMap(BiMap biMap, Object obj, BiMap biMap2, C08241 c08241) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(K k, V v) {
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
        }

        private SynchronizedBiMap(BiMap<K, V> biMap, Object obj, BiMap<V, K> biMap2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<V> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        BiMap<K, V> delegate() {
        }
    }

    @VisibleForTesting
    static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        /* synthetic */ SynchronizedCollection(Collection collection, Object obj, C08241 c08241) {
        }

        @Override // java.util.Collection
        public boolean add(E e) {
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // java.util.Collection
        public void clear() {
        }

        public boolean contains(Object obj) {
        }

        public boolean containsAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
        }

        public Iterator<E> iterator() {
        }

        public boolean remove(Object obj) {
        }

        public boolean removeAll(Collection<?> collection) {
        }

        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public int size() {
        }

        public Object[] toArray() {
        }

        private SynchronizedCollection(Collection<E> collection, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        Collection<E> delegate() {
        }

        public <T> T[] toArray(T[] tArr) {
        }
    }

    private static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        SynchronizedDeque(Deque<E> deque, Object obj) {
        }

        @Override // java.util.Deque
        public void addFirst(E e) {
        }

        @Override // java.util.Deque
        public void addLast(E e) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
        }

        @Override // java.util.Deque
        public E getFirst() {
        }

        @Override // java.util.Deque
        public E getLast() {
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e) {
        }

        @Override // java.util.Deque
        public boolean offerLast(E e) {
        }

        @Override // java.util.Deque
        public E peekFirst() {
        }

        @Override // java.util.Deque
        public E peekLast() {
        }

        @Override // java.util.Deque
        public E pollFirst() {
        }

        @Override // java.util.Deque
        public E pollLast() {
        }

        @Override // java.util.Deque
        public E pop() {
        }

        @Override // java.util.Deque
        public void push(E e) {
        }

        @Override // java.util.Deque
        public E removeFirst() {
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(Object obj) {
        }

        @Override // java.util.Deque
        public E removeLast() {
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Queue delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        Deque<E> delegate() {
        }
    }

    @GwtIncompatible
    private static class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedEntry(Map.Entry<K, V> entry, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        @Override // java.util.Map.Entry
        public K getKey() {
        }

        @Override // java.util.Map.Entry
        public V getValue() {
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        Map.Entry<K, V> delegate() {
        }
    }

    private static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        SynchronizedList(List<E> list, Object obj) {
        }

        @Override // java.util.List
        public void add(int i, E e) {
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
        }

        @Override // java.util.List
        public E get(int i) {
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
        }

        @Override // java.util.List
        public E remove(int i) {
        }

        @Override // java.util.List
        public E set(int i, E e) {
        }

        @Override // java.util.List
        public List<E> subList(int i, int i2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        List<E> delegate() {
        }
    }

    private static class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedListMultimap(ListMultimap<K, V> listMultimap, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Multimap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> get(K k) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        ListMultimap<K, V> delegate() {
        }
    }

    private static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;
        transient Set<Map.Entry<K, V>> entrySet;
        transient Set<K> keySet;
        transient Collection<V> values;

        SynchronizedMap(Map<K, V> map, Object obj) {
        }

        @Override // java.util.Map
        public void clear() {
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
        }

        public boolean containsValue(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
        }

        public V get(Object obj) {
        }

        @Override // java.util.Map
        public int hashCode() {
        }

        @Override // java.util.Map
        public boolean isEmpty() {
        }

        @Override // java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.Map
        public V put(K k, V v) {
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // java.util.Map
        public V remove(Object obj) {
        }

        @Override // java.util.Map
        public int size() {
        }

        public Collection<V> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        Map<K, V> delegate() {
        }
    }

    private static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Map<K, Collection<V>> asMap;
        transient Collection<Map.Entry<K, V>> entries;
        transient Set<K> keySet;
        transient Multiset<K> keys;
        transient Collection<V> valuesCollection;

        SynchronizedMultimap(Multimap<K, V> multimap, Object obj) {
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Map<K, Collection<V>> asMap() {
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsEntry(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsValue(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Multimap
        public Collection<Map.Entry<K, V>> entries() {
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public boolean equals(Object obj) {
        }

        public Collection<V> get(K k) {
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
        public boolean put(K k, V v) {
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(K k, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
        }

        public Collection<V> removeAll(Object obj) {
        }

        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
        }

        @Override // com.google.common.collect.Multimap
        public Collection<V> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        Multimap<K, V> delegate() {
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        }
    }

    private static class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {
        private static final long serialVersionUID = 0;
        transient Set<E> elementSet;
        transient Set<Multiset.Entry<E>> entrySet;

        SynchronizedMultiset(Multiset<E> multiset, Object obj) {
        }

        @Override // com.google.common.collect.Multiset
        public int add(E e, int i) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Multiset
        public Set<E> elementSet() {
        }

        @Override // com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public boolean equals(Object obj) {
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public int hashCode() {
        }

        @Override // com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
        }

        @Override // com.google.common.collect.Multiset
        public int setCount(E e, int i) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        Multiset<E> delegate() {
        }

        @Override // com.google.common.collect.Multiset
        public boolean setCount(E e, int i, int i2) {
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    static class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;
        transient NavigableSet<K> descendingKeySet;
        transient NavigableMap<K, V> descendingMap;
        transient NavigableSet<K> navigableKeySet;

        SynchronizedNavigableMap(NavigableMap<K, V> navigableMap, Object obj) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ SortedMap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        NavigableMap<K, V> delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k, K k2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k) {
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;
        transient NavigableSet<E> descendingSet;

        SynchronizedNavigableSet(NavigableSet<E> navigableSet, Object obj) {
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ SortedSet delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        NavigableSet<E> delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e, E e2) {
        }
    }

    static class SynchronizedObject implements Serializable {

        @GwtIncompatible
        private static final long serialVersionUID = 0;
        final Object delegate;
        final Object mutex;

        SynchronizedObject(Object obj, Object obj2) {
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        }

        Object delegate() {
        }

        public String toString() {
        }
    }

    private static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        SynchronizedQueue(Queue<E> queue, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Queue
        public E element() {
        }

        @Override // java.util.Queue
        public boolean offer(E e) {
        }

        @Override // java.util.Queue
        public E peek() {
        }

        @Override // java.util.Queue
        public E poll() {
        }

        @Override // java.util.Queue
        public E remove() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        Queue<E> delegate() {
        }
    }

    private static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        SynchronizedRandomAccessList(List<E> list, Object obj) {
        }
    }

    static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSet(Set<E> set, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        public boolean equals(Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        Set<E> delegate() {
        }
    }

    private static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Set<Map.Entry<K, V>> entrySet;

        SynchronizedSetMultimap(SetMultimap<K, V> setMultimap, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Multimap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection entries() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> get(K k) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        SetMultimap<K, V> delegate() {
        }
    }

    static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedMap(SortedMap<K, V> sortedMap, Object obj) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.SortedMap
        public K firstKey() {
        }

        public SortedMap<K, V> headMap(K k) {
        }

        @Override // java.util.SortedMap
        public K lastKey() {
        }

        public SortedMap<K, V> subMap(K k, K k2) {
        }

        public SortedMap<K, V> tailMap(K k) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        SortedMap<K, V> delegate() {
        }
    }

    static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSet(SortedSet<E> sortedSet, Object obj) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.SortedSet
        public E first() {
        }

        public SortedSet<E> headSet(E e) {
        }

        @Override // java.util.SortedSet
        public E last() {
        }

        public SortedSet<E> subSet(E e, E e2) {
        }

        public SortedSet<E> tailSet(E e) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        SortedSet<E> delegate() {
        }
    }

    private static class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Multimap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ SetMultimap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Set get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> get(K k) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        SortedSetMultimap<K, V> delegate() {
        }
    }

    private static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedTable$1 */
        class C08271 implements Function<Map<C, V>, Map<C, V>> {
            final /* synthetic */ SynchronizedTable this$0;

            C08271(SynchronizedTable synchronizedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Map<C, V> apply(Map<C, V> map) {
            }
        }

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedTable$2 */
        class C08282 implements Function<Map<R, V>, Map<R, V>> {
            final /* synthetic */ SynchronizedTable this$0;

            C08282(SynchronizedTable synchronizedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Map<R, V> apply(Map<R, V> map) {
            }
        }

        SynchronizedTable(Table<R, C, V> table, Object obj) {
        }

        @Override // com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
        }

        @Override // com.google.common.collect.Table
        public void clear() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> column(C c) {
        }

        @Override // com.google.common.collect.Table
        public Set<C> columnKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
        }

        @Override // com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public boolean containsColumn(Object obj) {
        }

        @Override // com.google.common.collect.Table
        public boolean containsRow(Object obj) {
        }

        @Override // com.google.common.collect.Table
        public boolean containsValue(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Table
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.Table
        public V get(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public int hashCode() {
        }

        @Override // com.google.common.collect.Table
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Table
        public V put(R r, C c, V v) {
        }

        @Override // com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        }

        @Override // com.google.common.collect.Table
        public V remove(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> row(R r) {
        }

        @Override // com.google.common.collect.Table
        public Set<R> rowKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
        }

        @Override // com.google.common.collect.Table
        public int size() {
        }

        @Override // com.google.common.collect.Table
        public Collection<V> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        Table<R, C, V> delegate() {
        }
    }

    private Synchronized() {
    }

    static /* synthetic */ SortedSet access$100(SortedSet sortedSet, Object obj) {
    }

    static /* synthetic */ List access$200(List list, Object obj) {
    }

    static /* synthetic */ Set access$300(Set set, Object obj) {
    }

    static /* synthetic */ Collection access$400(Collection collection, Object obj) {
    }

    static /* synthetic */ Collection access$500(Collection collection, Object obj) {
    }

    static /* synthetic */ Map.Entry access$700(Map.Entry entry, Object obj) {
    }

    static <K, V> BiMap<K, V> biMap(BiMap<K, V> biMap, Object obj) {
    }

    private static <E> Collection<E> collection(Collection<E> collection, Object obj) {
    }

    static <E> Deque<E> deque(Deque<E> deque, Object obj) {
    }

    private static <E> List<E> list(List<E> list, Object obj) {
    }

    static <K, V> ListMultimap<K, V> listMultimap(ListMultimap<K, V> listMultimap, Object obj) {
    }

    @VisibleForTesting
    static <K, V> Map<K, V> map(Map<K, V> map, Object obj) {
    }

    static <K, V> Multimap<K, V> multimap(Multimap<K, V> multimap, Object obj) {
    }

    static <E> Multiset<E> multiset(Multiset<E> multiset, Object obj) {
    }

    @GwtIncompatible
    static <K, V> NavigableMap<K, V> navigableMap(NavigableMap<K, V> navigableMap) {
    }

    @GwtIncompatible
    static <E> NavigableSet<E> navigableSet(NavigableSet<E> navigableSet, Object obj) {
    }

    @GwtIncompatible
    private static <K, V> Map.Entry<K, V> nullableSynchronizedEntry(Map.Entry<K, V> entry, Object obj) {
    }

    static <E> Queue<E> queue(Queue<E> queue, Object obj) {
    }

    @VisibleForTesting
    static <E> Set<E> set(Set<E> set, Object obj) {
    }

    static <K, V> SetMultimap<K, V> setMultimap(SetMultimap<K, V> setMultimap, Object obj) {
    }

    static <K, V> SortedMap<K, V> sortedMap(SortedMap<K, V> sortedMap, Object obj) {
    }

    private static <E> SortedSet<E> sortedSet(SortedSet<E> sortedSet, Object obj) {
    }

    static <K, V> SortedSetMultimap<K, V> sortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap, Object obj) {
    }

    static <R, C, V> Table<R, C, V> table(Table<R, C, V> table, Object obj) {
    }

    private static <E> Collection<E> typePreservingCollection(Collection<E> collection, Object obj) {
    }

    private static <E> Set<E> typePreservingSet(Set<E> set, Object obj) {
    }

    @GwtIncompatible
    static <K, V> NavigableMap<K, V> navigableMap(NavigableMap<K, V> navigableMap, Object obj) {
    }

    @GwtIncompatible
    static <E> NavigableSet<E> navigableSet(NavigableSet<E> navigableSet) {
    }

    private static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapEntries$1 */
        class C08251 extends TransformedIterator<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {
            final /* synthetic */ SynchronizedAsMapEntries this$0;

            /* renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapEntries$1$1, reason: invalid class name */
            class AnonymousClass1 extends ForwardingMapEntry<K, Collection<V>> {
                final /* synthetic */ C08251 this$1;
                final /* synthetic */ Map.Entry val$entry;

                AnonymousClass1(C08251 c08251, Map.Entry entry) {
                }

                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                protected /* bridge */ /* synthetic */ Object delegate() {
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public /* bridge */ /* synthetic */ Object getValue() {
                }

                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                protected Map.Entry<K, Collection<V>> delegate() {
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public Collection<V> getValue() {
                }
            }

            C08251(SynchronizedAsMapEntries synchronizedAsMapEntries, Iterator it) {
            }

            @Override // com.google.common.collect.TransformedIterator
            /* bridge */ /* synthetic */ Object transform(Object obj) {
            }

            Map.Entry<K, Collection<V>> transform(Map.Entry<K, Collection<V>> entry) {
            }
        }

        SynchronizedAsMapEntries(Set<Map.Entry<K, Collection<V>>> set, Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }
    }
}
