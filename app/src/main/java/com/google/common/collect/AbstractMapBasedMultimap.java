package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> map;
    private transient int totalSize;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$1 */
    class C06691 extends AbstractMapBasedMultimap<K, V>.Itr<V> {
        C06691(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        @ParametricNullness
        V output(@ParametricNullness K k, @ParametricNullness V v) {
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$2 */
    class C06702 extends AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>> {
        C06702(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        /* bridge */ /* synthetic */ Object output(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        Map.Entry<K, V> output(@ParametricNullness K k, @ParametricNullness V v) {
        }
    }

    private class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        final transient Map<K, Collection<V>> submap;
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            final /* synthetic */ AsMap this$1;

            AsMapEntries(AsMap asMap) {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map<K, Collection<V>> map() {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }
        }

        class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {
            Collection<V> collection;
            final Iterator<Map.Entry<K, Collection<V>>> delegateIterator;
            final /* synthetic */ AsMap this$1;

            AsMapIterator(AsMap asMap) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            @Override // java.util.Iterator
            public Map.Entry<K, Collection<V>> next() {
            }
        }

        AsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, Map<K, Collection<V>> map) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, Collection<V>>> createEntrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object remove(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.AbstractMap
        public String toString() {
        }

        Map.Entry<K, Collection<V>> wrapEntry(Map.Entry<K, Collection<V>> entry) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
        }
    }

    private abstract class Itr<T> implements Iterator<T> {
        Collection<V> collection;
        K key;
        final Iterator<Map.Entry<K, Collection<V>>> keyIterator;
        final /* synthetic */ AbstractMapBasedMultimap this$0;
        Iterator<V> valueIterator;

        Itr(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        abstract T output(@ParametricNullness K k, @ParametricNullness V v);

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    private class KeySet extends Maps.KeySet<K, Collection<V>> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$KeySet$1 */
        class C06711 implements Iterator<K> {
            Map.Entry<K, Collection<V>> entry;
            final /* synthetic */ KeySet this$1;
            final /* synthetic */ Iterator val$entryIterator;

            C06711(KeySet keySet, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public K next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        KeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, Map<K, Collection<V>> map) {
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }
    }

    class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        NavigableAsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap<K, Collection<V>> navigableMap) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* bridge */ /* synthetic */ Set createKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(@ParametricNullness Object obj) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        Map.Entry<K, Collection<V>> pollAsMapEntry(Iterator<Map.Entry<K, Collection<V>>> it) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* bridge */ /* synthetic */ SortedMap sortedMap() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap subMap(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(@ParametricNullness Object obj) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* bridge */ /* synthetic */ SortedSet createKeySet() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ SortedSet keySet() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        NavigableMap<K, Collection<V>> sortedMap() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        NavigableSet<K> createKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k, boolean z) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public NavigableSet<K> keySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k, boolean z) {
        }
    }

    class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        NavigableKeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap<K, Collection<V>> navigableMap) {
        }

        @Override // java.util.NavigableSet
        public K ceiling(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public K floor(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet headSet(@ParametricNullness Object obj) {
        }

        @Override // java.util.NavigableSet
        public K higher(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableSet
        public K lower(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        /* bridge */ /* synthetic */ SortedMap sortedMap() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet subSet(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet tailSet(@ParametricNullness Object obj) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        NavigableMap<K, Collection<V>> sortedMap() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k, boolean z) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k, boolean z) {
        }
    }

    private class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
        RandomAccessWrappedList(@ParametricNullness AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }
    }

    private class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
        SortedSet<K> sortedKeySet;
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        SortedAsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap<K, Collection<V>> sortedMap) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* bridge */ /* synthetic */ Set createKeySet() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
        }

        public SortedMap<K, Collection<V>> headMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
        }

        SortedMap<K, Collection<V>> sortedMap() {
        }

        public SortedMap<K, Collection<V>> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        public SortedMap<K, Collection<V>> tailMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        SortedSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
        }
    }

    private class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        SortedKeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap<K, Collection<V>> sortedMap) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K first() {
        }

        public SortedSet<K> headSet(@ParametricNullness K k) {
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K last() {
        }

        SortedMap<K, Collection<V>> sortedMap() {
        }

        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        public SortedSet<K> tailSet(@ParametricNullness K k) {
        }
    }

    class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        WrappedNavigableSet(@ParametricNullness AbstractMapBasedMultimap abstractMapBasedMultimap, K k, NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }

        private NavigableSet<V> wrap(NavigableSet<V> navigableSet) {
        }

        @Override // java.util.NavigableSet
        public V ceiling(@ParametricNullness V v) {
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public V floor(@ParametricNullness V v) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        /* bridge */ /* synthetic */ SortedSet getSortedSetDelegate() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@ParametricNullness V v, boolean z) {
        }

        @Override // java.util.NavigableSet
        public V higher(@ParametricNullness V v) {
        }

        @Override // java.util.NavigableSet
        public V lower(@ParametricNullness V v) {
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@ParametricNullness V v, boolean z, @ParametricNullness V v2, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@ParametricNullness V v, boolean z) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        NavigableSet<V> getSortedSetDelegate() {
        }
    }

    class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        WrappedSet(@ParametricNullness AbstractMapBasedMultimap abstractMapBasedMultimap, K k, Set<V> set) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }
    }

    class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        WrappedSortedSet(@ParametricNullness AbstractMapBasedMultimap abstractMapBasedMultimap, K k, SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public V first() {
        }

        SortedSet<V> getSortedSetDelegate() {
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@ParametricNullness V v) {
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public V last() {
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@ParametricNullness V v, @ParametricNullness V v2) {
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@ParametricNullness V v) {
        }
    }

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
    }

    static /* synthetic */ Map access$000(AbstractMapBasedMultimap abstractMapBasedMultimap) {
    }

    static /* synthetic */ Iterator access$100(Collection collection) {
    }

    static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
    }

    static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
    }

    static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
    }

    static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
    }

    static /* synthetic */ void access$300(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj) {
    }

    private Collection<V> getOrCreateCollection(@ParametricNullness K k) {
    }

    private static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
    }

    private void removeValuesForKey(Object obj) {
    }

    Map<K, Collection<V>> backingMap() {
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map<K, Collection<V>> createAsMap() {
    }

    abstract Collection<V> createCollection();

    Collection<V> createCollection(@ParametricNullness K k) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection<Map.Entry<K, V>> createEntries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set<K> createKeySet() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Multiset<K> createKeys() {
    }

    final Map<K, Collection<V>> createMaybeNavigableAsMap() {
    }

    final Set<K> createMaybeNavigableKeySet() {
    }

    Collection<V> createUnmodifiableEmptyCollection() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection<V> createValues() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator<Map.Entry<K, V>> entryIterator() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(@ParametricNullness K k) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
    }

    final void setMap(Map<K, Collection<V>> map) {
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
    }

    <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator<V> valueIterator() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
    }

    Collection<V> wrapCollection(@ParametricNullness K k, Collection<V> collection) {
    }

    final List<V> wrapList(@ParametricNullness K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
    }

    class WrappedCollection extends AbstractCollection<V> {
        final AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor;
        final Collection<V> ancestorDelegate;
        Collection<V> delegate;

        @ParametricNullness
        final K key;
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        WrappedCollection(@ParametricNullness AbstractMapBasedMultimap abstractMapBasedMultimap, K k, Collection<V> collection, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@ParametricNullness V v) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
        }

        void addToMap() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
        }

        AbstractMapBasedMultimap<K, V>.WrappedCollection getAncestor() {
        }

        Collection<V> getDelegate() {
        }

        @ParametricNullness
        K getKey() {
        }

        @Override // java.util.Collection
        public int hashCode() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        void refreshIfEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        void removeIfEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        class WrappedIterator implements Iterator<V> {
            final Iterator<V> delegateIterator;
            final Collection<V> originalDelegate;
            final /* synthetic */ WrappedCollection this$1;

            WrappedIterator(WrappedCollection wrappedCollection) {
            }

            Iterator<V> getDelegateIterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public V next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            void validateIterator() {
            }

            WrappedIterator(WrappedCollection wrappedCollection, Iterator<V> it) {
            }
        }
    }

    class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {
        final /* synthetic */ AbstractMapBasedMultimap this$0;

        private class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            final /* synthetic */ WrappedList this$1;

            WrappedListIterator(WrappedList wrappedList) {
            }

            private ListIterator<V> getDelegateListIterator() {
            }

            @Override // java.util.ListIterator
            public void add(@ParametricNullness V v) {
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
            }

            @Override // java.util.ListIterator
            @ParametricNullness
            public V previous() {
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
            }

            @Override // java.util.ListIterator
            public void set(@ParametricNullness V v) {
            }

            public WrappedListIterator(WrappedList wrappedList, int i) {
            }
        }

        WrappedList(@ParametricNullness AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }

        @Override // java.util.List
        public void add(int i, @ParametricNullness V v) {
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
        }

        @Override // java.util.List
        @ParametricNullness
        public V get(int i) {
        }

        List<V> getListDelegate() {
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
        }

        @Override // java.util.List
        @ParametricNullness
        public V remove(int i) {
        }

        @Override // java.util.List
        @ParametricNullness
        public V set(int i, @ParametricNullness V v) {
        }

        @Override // java.util.List
        public List<V> subList(int i, int i2) {
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
        }
    }
}
