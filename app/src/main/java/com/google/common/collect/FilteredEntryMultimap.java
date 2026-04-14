package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {
    final Predicate<? super Map.Entry<K, V>> predicate;
    final Multimap<K, V> unfiltered;

    class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        final /* synthetic */ FilteredEntryMultimap this$0;

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl, reason: invalid class name */
        class C1EntrySetImpl extends Maps.EntrySet<K, Collection<V>> {
            final /* synthetic */ AsMap this$1;

            /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1EntrySetImpl$1 */
            class C06971 extends AbstractIterator<Map.Entry<K, Collection<V>>> {
                final Iterator<Map.Entry<K, Collection<V>>> backingIterator;
                final /* synthetic */ C1EntrySetImpl this$2;

                C06971(C1EntrySetImpl c1EntrySetImpl) {
                }

                @Override // com.google.common.collect.AbstractIterator
                protected /* bridge */ /* synthetic */ Object computeNext() {
                }

                @Override // com.google.common.collect.AbstractIterator
                protected Map.Entry<K, Collection<V>> computeNext() {
                }
            }

            C1EntrySetImpl(AsMap asMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map<K, Collection<V>> map() {
            }

            @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1KeySetImpl, reason: invalid class name */
        class C1KeySetImpl extends Maps.KeySet<K, Collection<V>> {
            final /* synthetic */ AsMap this$1;

            C1KeySetImpl(AsMap asMap) {
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }
        }

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$AsMap$1ValuesImpl, reason: invalid class name */
        class C1ValuesImpl extends Maps.Values<K, Collection<V>> {
            final /* synthetic */ AsMap this$1;

            C1ValuesImpl(AsMap asMap) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
            }
        }

        AsMap(FilteredEntryMultimap filteredEntryMultimap) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<Map.Entry<K, Collection<V>>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<K> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<Collection<V>> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object remove(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
        }
    }

    class Keys extends Multimaps.Keys<K, V> {
        final /* synthetic */ FilteredEntryMultimap this$0;

        /* renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1 */
        class C06981 extends Multisets.EntrySet<K> {
            final /* synthetic */ Keys this$1;

            /* renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1$1, reason: invalid class name */
            class AnonymousClass1 implements Predicate<Map.Entry<K, Collection<V>>> {
                final /* synthetic */ Predicate val$predicate;

                AnonymousClass1(C06981 c06981, Predicate predicate) {
                }

                @Override // com.google.common.base.Predicate
                public /* bridge */ /* synthetic */ boolean apply(Object obj) {
                }

                public boolean apply(Map.Entry<K, Collection<V>> entry) {
                }
            }

            C06981(Keys keys) {
            }

            private boolean removeEntriesIf(Predicate<? super Multiset.Entry<K>> predicate) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Multiset.Entry<K>> iterator() {
            }

            @Override // com.google.common.collect.Multisets.EntrySet
            Multiset<K> multiset() {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        Keys(FilteredEntryMultimap filteredEntryMultimap) {
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<K>> entrySet() {
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
        }
    }

    final class ValuePredicate implements Predicate<V> {

        @ParametricNullness
        private final K key;
        final /* synthetic */ FilteredEntryMultimap this$0;

        ValuePredicate(@ParametricNullness FilteredEntryMultimap filteredEntryMultimap, K k) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness V v) {
        }
    }

    FilteredEntryMultimap(Multimap<K, V> multimap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    static /* synthetic */ boolean access$000(FilteredEntryMultimap filteredEntryMultimap, Object obj, Object obj2) {
    }

    static <E> Collection<E> filterCollection(Collection<E> collection, Predicate<? super E> predicate) {
    }

    private boolean satisfies(@ParametricNullness K k, @ParametricNullness V v) {
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

    @Override // com.google.common.collect.AbstractMultimap
    Collection<Map.Entry<K, V>> createEntries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set<K> createKeySet() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Multiset<K> createKeys() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection<V> createValues() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator<Map.Entry<K, V>> entryIterator() {
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Predicate<? super Map.Entry<K, V>> entryPredicate() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(@ParametricNullness K k) {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(Object obj) {
    }

    boolean removeEntriesIf(Predicate<? super Map.Entry<K, Collection<V>>> predicate) {
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Multimap<K, V> unfiltered() {
    }

    Collection<V> unmodifiableEmptyCollection() {
    }
}
