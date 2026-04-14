package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {
    private static final RangeMap<Comparable<?>, Object> EMPTY_SUB_RANGE_MAP = null;
    private final NavigableMap<Cut<K>, RangeMapEntry<K, V>> entriesByLowerBound;

    /* renamed from: com.google.common.collect.TreeRangeMap$1 */
    class C08421 implements RangeMap<Comparable<?>, Object> {
        C08421() {
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<Comparable<?>>, Object> asDescendingMapOfRanges() {
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<Comparable<?>>, Object> asMapOfRanges() {
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        public Object get(Comparable<?> comparable) {
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry<Range<Comparable<?>>, Object> getEntry(Comparable<?> comparable) {
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range<Comparable<?>> range, Object obj) {
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap<Comparable<?>, Object> rangeMap) {
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range<Comparable<?>> range, Object obj) {
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range<Comparable<?>> range) {
        }

        @Override // com.google.common.collect.RangeMap
        public Range<Comparable<?>> span() {
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap<Comparable<?>, Object> subRangeMap(Range<Comparable<?>> range) {
        }
    }

    private final class AsMapOfRanges extends Maps.IteratorBasedAbstractMap<Range<K>, V> {
        final Iterable<Map.Entry<Range<K>, V>> entryIterable;
        final /* synthetic */ TreeRangeMap this$0;

        AsMapOfRanges(TreeRangeMap treeRangeMap, Iterable<RangeMapEntry<K, V>> iterable) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator<Map.Entry<Range<K>, V>> entryIterator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }
    }

    private static final class RangeMapEntry<K extends Comparable, V> extends AbstractMapEntry<Range<K>, V> {
        private final Range<K> range;
        private final V value;

        RangeMapEntry(Cut<K> cut, Cut<K> cut2, V v) {
        }

        public boolean contains(K k) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object getKey() {
        }

        Cut<K> getLowerBound() {
        }

        Cut<K> getUpperBound() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
        }

        RangeMapEntry(Range<K> range, V v) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Range<K> getKey() {
        }
    }

    private class SubRangeMap implements RangeMap<K, V> {
        private final Range<K> subRange;
        final /* synthetic */ TreeRangeMap this$0;

        /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$1 */
        class C08431 extends TreeRangeMap<K, V>.SubRangeMap.SubRangeMapAsMap {
            final /* synthetic */ SubRangeMap this$1;

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$1$1, reason: invalid class name */
            class AnonymousClass1 extends AbstractIterator<Map.Entry<Range<K>, V>> {
                final /* synthetic */ C08431 this$2;
                final /* synthetic */ Iterator val$backingItr;

                AnonymousClass1(C08431 c08431, Iterator it) {
                }

                @Override // com.google.common.collect.AbstractIterator
                protected /* bridge */ /* synthetic */ Object computeNext() {
                }

                @Override // com.google.common.collect.AbstractIterator
                protected Map.Entry<Range<K>, V> computeNext() {
                }
            }

            C08431(SubRangeMap subRangeMap) {
            }

            @Override // com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap
            Iterator<Map.Entry<Range<K>, V>> entryIterator() {
            }
        }

        class SubRangeMapAsMap extends AbstractMap<Range<K>, V> {
            final /* synthetic */ SubRangeMap this$1;

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$1 */
            class C08441 extends Maps.KeySet<Range<K>, V> {
                final /* synthetic */ SubRangeMapAsMap this$2;

                C08441(SubRangeMapAsMap subRangeMapAsMap, Map map) {
                }

                @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$2 */
            class C08452 extends Maps.EntrySet<Range<K>, V> {
                final /* synthetic */ SubRangeMapAsMap this$2;

                C08452(SubRangeMapAsMap subRangeMapAsMap) {
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<Range<K>, V>> iterator() {
                }

                @Override // com.google.common.collect.Maps.EntrySet
                Map<Range<K>, V> map() {
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$3 */
            class C08463 extends AbstractIterator<Map.Entry<Range<K>, V>> {
                final /* synthetic */ SubRangeMapAsMap this$2;
                final /* synthetic */ Iterator val$backingItr;

                C08463(SubRangeMapAsMap subRangeMapAsMap, Iterator it) {
                }

                @Override // com.google.common.collect.AbstractIterator
                protected /* bridge */ /* synthetic */ Object computeNext() {
                }

                @Override // com.google.common.collect.AbstractIterator
                protected Map.Entry<Range<K>, V> computeNext() {
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$4 */
            class C08474 extends Maps.Values<Range<K>, V> {
                final /* synthetic */ SubRangeMapAsMap this$2;

                C08474(SubRangeMapAsMap subRangeMapAsMap, Map map) {
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                }
            }

            SubRangeMapAsMap(SubRangeMap subRangeMap) {
            }

            static /* synthetic */ boolean access$400(SubRangeMapAsMap subRangeMapAsMap, Predicate predicate) {
            }

            private boolean removeEntryIf(Predicate<? super Map.Entry<Range<K>, V>> predicate) {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
            }

            Iterator<Map.Entry<Range<K>, V>> entryIterator() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<Range<K>, V>> entrySet() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V get(Object obj) {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Range<K>> keySet() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V remove(Object obj) {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
            }
        }

        SubRangeMap(TreeRangeMap treeRangeMap, Range<K> range) {
        }

        static /* synthetic */ Range access$300(SubRangeMap subRangeMap) {
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asDescendingMapOfRanges() {
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asMapOfRanges() {
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.RangeMap
        public V get(K k) {
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry<Range<K>, V> getEntry(K k) {
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range<K> range, V v) {
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap<K, V> rangeMap) {
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range<K> range, V v) {
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range<K> range) {
        }

        @Override // com.google.common.collect.RangeMap
        public Range<K> span() {
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap<K, V> subRangeMap(Range<K> range) {
        }

        @Override // com.google.common.collect.RangeMap
        public String toString() {
        }
    }

    private TreeRangeMap() {
    }

    static /* synthetic */ NavigableMap access$000(TreeRangeMap treeRangeMap) {
    }

    static /* synthetic */ Range access$100(TreeRangeMap treeRangeMap, Range range, Object obj) {
    }

    static /* synthetic */ RangeMap access$200(TreeRangeMap treeRangeMap) {
    }

    private static <K extends Comparable, V> Range<K> coalesce(Range<K> range, V v, Map.Entry<Cut<K>, RangeMapEntry<K, V>> entry) {
    }

    private Range<K> coalescedRange(Range<K> range, V v) {
    }

    public static <K extends Comparable, V> TreeRangeMap<K, V> create() {
    }

    private RangeMap<K, V> emptySubRangeMap() {
    }

    private void putRangeMapEntry(Cut<K> cut, Cut<K> cut2, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asDescendingMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(Object obj) {
    }

    @Override // com.google.common.collect.RangeMap
    public V get(K k) {
    }

    @Override // com.google.common.collect.RangeMap
    public Map.Entry<Range<K>, V> getEntry(K k) {
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
    }

    @Override // com.google.common.collect.RangeMap
    public void put(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(RangeMap<K, V> rangeMap) {
    }

    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    public void remove(Range<K> range) {
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
    }

    @Override // com.google.common.collect.RangeMap
    public RangeMap<K, V> subRangeMap(Range<K> range) {
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
    }
}
