package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Maps {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$1 */
    class C07541<K, V> extends TransformedIterator<Map.Entry<K, V>, K> {
        C07541(Iterator it) {
        }

        @Override // com.google.common.collect.TransformedIterator
        @ParametricNullness
        /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        @ParametricNullness
        K transform(Map.Entry<K, V> entry) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    /* renamed from: com.google.common.collect.Maps$10, reason: invalid class name */
    class AnonymousClass10<V1, V2> implements Function<V1, V2> {
        final /* synthetic */ Object val$key;
        final /* synthetic */ EntryTransformer val$transformer;

        AnonymousClass10(EntryTransformer entryTransformer, Object obj) {
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V2 apply(@ParametricNullness V1 v1) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: com.google.common.collect.Maps$11, reason: invalid class name */
    class AnonymousClass11<K, V1, V2> implements Function<Map.Entry<K, V1>, V2> {
        final /* synthetic */ EntryTransformer val$transformer;

        AnonymousClass11(EntryTransformer entryTransformer) {
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        @ParametricNullness
        public V2 apply(Map.Entry<K, V1> entry) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* renamed from: com.google.common.collect.Maps$12, reason: invalid class name */
    class AnonymousClass12<K, V2> extends AbstractMapEntry<K, V2> {
        final /* synthetic */ Map.Entry val$entry;
        final /* synthetic */ EntryTransformer val$transformer;

        AnonymousClass12(Map.Entry entry, EntryTransformer entryTransformer) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V2 getValue() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: com.google.common.collect.Maps$13, reason: invalid class name */
    class AnonymousClass13<K, V1, V2> implements Function<Map.Entry<K, V1>, Map.Entry<K, V2>> {
        final /* synthetic */ EntryTransformer val$transformer;

        AnonymousClass13(EntryTransformer entryTransformer) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$2 */
    class C07552<K, V> extends TransformedIterator<Map.Entry<K, V>, V> {
        C07552(Iterator it) {
        }

        @Override // com.google.common.collect.TransformedIterator
        @ParametricNullness
        /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        @ParametricNullness
        V transform(Map.Entry<K, V> entry) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$3 */
    class C07563<K, V> extends TransformedIterator<K, Map.Entry<K, V>> {
        final /* synthetic */ Function val$function;

        C07563(Iterator it, Function function) {
        }

        @Override // com.google.common.collect.TransformedIterator
        /* bridge */ /* synthetic */ Object transform(@ParametricNullness Object obj) {
        }

        @Override // com.google.common.collect.TransformedIterator
        Map.Entry<K, V> transform(@ParametricNullness K k) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Maps$4 */
    class C07574<E> extends ForwardingSet<E> {
        final /* synthetic */ Set val$set;

        C07574(Set set) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected Set<E> delegate() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Maps$5 */
    class C07585<E> extends ForwardingSortedSet<E> {
        final /* synthetic */ SortedSet val$set;

        C07585(SortedSet sortedSet) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected SortedSet<E> delegate() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Maps$6 */
    class C07596<E> extends ForwardingNavigableSet<E> {
        final /* synthetic */ NavigableSet val$set;

        C07596(NavigableSet navigableSet) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ SortedSet delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected NavigableSet<E> delegate() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$7 */
    class C07607<K, V> extends AbstractMapEntry<K, V> {
        final /* synthetic */ Map.Entry val$entry;

        C07607(Map.Entry entry) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.Maps$8 */
    class C07618<K, V> extends UnmodifiableIterator<Map.Entry<K, V>> {
        final /* synthetic */ Iterator val$entryIterator;

        C07618(Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* renamed from: com.google.common.collect.Maps$9 */
    class C07629<K, V1, V2> implements EntryTransformer<K, V1, V2> {
        final /* synthetic */ Function val$function;

        C07629(Function function) {
        }

        @Override // com.google.common.collect.Maps.EntryTransformer
        @ParametricNullness
        public V2 transformEntry(@ParametricNullness K k, @ParametricNullness V1 v1) {
        }
    }

    private static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {
        final Predicate<? super Map.Entry<K, V>> predicate;
        final Map<K, V> unfiltered;

        AbstractFilteredMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        boolean apply(Object obj, @ParametricNullness V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<V> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(@ParametricNullness K k, @ParametricNullness V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }
    }

    private static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {
        final Function<? super K, V> function;
        private final Set<K> set;

        /* renamed from: com.google.common.collect.Maps$AsMapView$1EntrySetImpl, reason: invalid class name */
        class C1EntrySetImpl extends EntrySet<K, V> {
            final /* synthetic */ AsMapView this$0;

            C1EntrySetImpl(AsMapView asMapView) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map<K, V> map() {
            }
        }

        AsMapView(Set<K> set, Function<? super K, V> function) {
        }

        Set<K> backingSet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<V> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
        }
    }

    private static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final BiMap<A, B> bimap;

        BiMapConverter(BiMap<A, B> biMap) {
        }

        private static <X, Y> Y convert(BiMap<X, Y> biMap, X x) {
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(B b) {
        }

        @Override // com.google.common.base.Converter
        protected B doForward(A a) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    @GwtIncompatible
    static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {
        private transient Comparator<? super K> comparator;
        private transient Set<Map.Entry<K, V>> entrySet;
        private transient NavigableSet<K> navigableKeySet;

        /* renamed from: com.google.common.collect.Maps$DescendingMap$1EntrySetImpl, reason: invalid class name */
        class C1EntrySetImpl extends EntrySet<K, V> {
            final /* synthetic */ DescendingMap this$0;

            C1EntrySetImpl(DescendingMap descendingMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map<K, V> map() {
            }
        }

        DescendingMap() {
        }

        private static <T> Ordering<T> reverse(Comparator<T> comparator) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        Set<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        abstract Iterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k) {
        }

        abstract NavigableMap<K, V> forward();

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k) {
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
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<V> values() {
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected final Map<K, V> delegate() {
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static abstract class EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        private static final /* synthetic */ EntryFunction[] $VALUES = null;
        public static final EntryFunction KEY = null;
        public static final EntryFunction VALUE = null;

        /* renamed from: com.google.common.collect.Maps$EntryFunction$1 */
        enum C07631 extends EntryFunction {
            C07631(String str, int i) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Map.Entry<?, ?> entry) {
            }

            /* renamed from: apply, reason: avoid collision after fix types in other method */
            public Object apply2(Map.Entry<?, ?> entry) {
            }
        }

        /* renamed from: com.google.common.collect.Maps$EntryFunction$2 */
        enum C07642 extends EntryFunction {
            C07642(String str, int i) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Map.Entry<?, ?> entry) {
            }

            /* renamed from: apply, reason: avoid collision after fix types in other method */
            public Object apply2(Map.Entry<?, ?> entry) {
            }
        }

        private static /* synthetic */ EntryFunction[] $values() {
        }

        private EntryFunction(String str, int i) {
        }

        public static EntryFunction valueOf(String str) {
        }

        public static EntryFunction[] values() {
        }

        /* synthetic */ EntryFunction(String str, int i, C07541 c07541) {
        }
    }

    static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        abstract Map<K, V> map();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
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

    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(@ParametricNullness K k, @ParametricNullness V1 v1);
    }

    static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {

        @RetainedWith
        private final BiMap<V, K> inverse;

        /* renamed from: com.google.common.collect.Maps$FilteredEntryBiMap$1 */
        class C07651 implements Predicate<Map.Entry<V, K>> {
            final /* synthetic */ Predicate val$forwardPredicate;

            C07651(Predicate predicate) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            }

            public boolean apply(Map.Entry<V, K> entry) {
            }
        }

        FilteredEntryBiMap(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        private static <K, V> Predicate<Map.Entry<V, K>> inversePredicate(Predicate<? super Map.Entry<K, V>> predicate) {
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
        }

        BiMap<K, V> unfiltered() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<V> values() {
        }

        private FilteredEntryBiMap(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate, BiMap<V, K> biMap2) {
        }
    }

    static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {
        final Set<Map.Entry<K, V>> filteredEntrySet;

        private class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            final /* synthetic */ FilteredEntryMap this$0;

            /* renamed from: com.google.common.collect.Maps$FilteredEntryMap$EntrySet$1 */
            class C07661 extends TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>> {
                final /* synthetic */ EntrySet this$1;

                /* renamed from: com.google.common.collect.Maps$FilteredEntryMap$EntrySet$1$1, reason: invalid class name */
                class AnonymousClass1 extends ForwardingMapEntry<K, V> {
                    final /* synthetic */ C07661 this$2;
                    final /* synthetic */ Map.Entry val$entry;

                    AnonymousClass1(C07661 c07661, Map.Entry entry) {
                    }

                    @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                    protected /* bridge */ /* synthetic */ Object delegate() {
                    }

                    @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                    @ParametricNullness
                    public V setValue(@ParametricNullness V v) {
                    }

                    @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                    protected Map.Entry<K, V> delegate() {
                    }
                }

                C07661(EntrySet entrySet, Iterator it) {
                }

                @Override // com.google.common.collect.TransformedIterator
                /* bridge */ /* synthetic */ Object transform(Object obj) {
                }

                Map.Entry<K, V> transform(Map.Entry<K, V> entry) {
                }
            }

            private EntrySet(FilteredEntryMap filteredEntryMap) {
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            protected /* bridge */ /* synthetic */ Object delegate() {
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            /* synthetic */ EntrySet(FilteredEntryMap filteredEntryMap, C07541 c07541) {
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            protected /* bridge */ /* synthetic */ Collection delegate() {
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            protected Set<Map.Entry<K, V>> delegate() {
            }
        }

        class KeySet extends KeySet<K, V> {
            final /* synthetic */ FilteredEntryMap this$0;

            KeySet(FilteredEntryMap filteredEntryMap) {
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

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
            }
        }

        FilteredEntryMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        static <K, V> boolean removeAllKeys(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
        }

        static <K, V> boolean retainAllKeys(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<K> createKeySet() {
        }
    }

    @GwtIncompatible
    private static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {
        private final Predicate<? super Map.Entry<K, V>> entryPredicate;
        private final Map<K, V> filteredDelegate;
        private final NavigableMap<K, V> unfiltered;

        /* renamed from: com.google.common.collect.Maps$FilteredEntryNavigableMap$1 */
        class C07671 extends NavigableKeySet<K, V> {
            final /* synthetic */ FilteredEntryNavigableMap this$0;

            C07671(FilteredEntryNavigableMap filteredEntryNavigableMap, NavigableMap navigableMap) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }
        }

        FilteredEntryNavigableMap(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        static /* synthetic */ Predicate access$500(FilteredEntryNavigableMap filteredEntryNavigableMap) {
        }

        static /* synthetic */ NavigableMap access$600(FilteredEntryNavigableMap filteredEntryNavigableMap) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator<Map.Entry<K, V>> descendingEntryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(@ParametricNullness K k, @ParametricNullness V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
        }
    }

    private static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            final /* synthetic */ FilteredEntrySortedMap this$0;

            SortedKeySet(FilteredEntrySortedMap filteredEntrySortedMap) {
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
            }

            @Override // java.util.SortedSet
            @ParametricNullness
            public K first() {
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@ParametricNullness K k) {
            }

            @Override // java.util.SortedSet
            @ParametricNullness
            public K last() {
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@ParametricNullness K k) {
            }
        }

        FilteredEntrySortedMap(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* bridge */ /* synthetic */ Set createKeySet() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
        }

        SortedMap<K, V> sortedMap() {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        SortedSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
        }
    }

    private static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        final Predicate<? super K> keyPredicate;

        FilteredKeyMap(Map<K, V> map, Predicate<? super K> predicate, Predicate<? super Map.Entry<K, V>> predicate2) {
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<K, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<K> createKeySet() {
        }
    }

    private static final class FilteredMapValues<K, V> extends Values<K, V> {
        final Predicate<? super Map.Entry<K, V>> predicate;
        final Map<K, V> unfiltered;

        FilteredMapValues(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate) {
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

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {

        /* renamed from: com.google.common.collect.Maps$IteratorBasedAbstractMap$1 */
        class C07681 extends EntrySet<K, V> {
            final /* synthetic */ IteratorBasedAbstractMap this$0;

            C07681(IteratorBasedAbstractMap iteratorBasedAbstractMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map<K, V> map() {
            }
        }

        IteratorBasedAbstractMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        abstract Iterator<Map.Entry<K, V>> entryIterator();

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {

        @Weak
        final Map<K, V> map;

        KeySet(Map<K, V> map) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        Map<K, V> map() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {
        final Map<K, MapDifference.ValueDifference<V>> differences;
        final Map<K, V> onBoth;
        final Map<K, V> onlyOnLeft;
        final Map<K, V> onlyOnRight;

        MapDifferenceImpl(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, MapDifference.ValueDifference<V>> map4) {
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, MapDifference.ValueDifference<V>> entriesDiffering() {
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesInCommon() {
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnLeft() {
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnRight() {
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
        }

        public String toString() {
        }
    }

    @GwtIncompatible
    private static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {
        private final Function<? super K, V> function;
        private final NavigableSet<K> set;

        NavigableAsMapView(NavigableSet<K> navigableSet, Function<? super K, V> function) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator<Map.Entry<K, V>> descendingEntryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
        }
    }

    @GwtIncompatible
    static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        NavigableKeySet(NavigableMap<K, V> navigableMap) {
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

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k, boolean z) {
        }

        @Override // java.util.NavigableSet
        public K higher(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableSet
        public K lower(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        /* bridge */ /* synthetic */ Map map() {
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k, boolean z) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        /* bridge */ /* synthetic */ SortedMap map() {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        NavigableMap<K, V> map() {
        }
    }

    private static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        SortedAsMapView(SortedSet<K> sortedSet, Function<? super K, V> function) {
        }

        @Override // com.google.common.collect.Maps.AsMapView
        /* bridge */ /* synthetic */ Set backingSet() {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.AsMapView
        SortedSet<K> backingSet() {
        }
    }

    static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        SortedKeySet(SortedMap<K, V> sortedMap) {
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

        @Override // com.google.common.collect.Maps.KeySet
        /* bridge */ /* synthetic */ Map map() {
        }

        public SortedSet<K> subSet(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        public SortedSet<K> tailSet(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.KeySet
        SortedMap<K, V> map() {
        }
    }

    static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        SortedMapDifferenceImpl(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, MapDifference.ValueDifference<V>> sortedMap4) {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ Map entriesDiffering() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ Map entriesInCommon() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ Map entriesOnlyOnLeft() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public /* bridge */ /* synthetic */ Map entriesOnlyOnRight() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesInCommon() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnLeft() {
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnRight() {
        }
    }

    static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {
        final Map<K, V1> fromMap;
        final EntryTransformer<? super K, ? super V1, V2> transformer;

        TransformedEntriesMap(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator<Map.Entry<K, V2>> entryIterator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
        }
    }

    @GwtIncompatible
    private static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        TransformedEntriesNavigableMap(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        }

        private Map.Entry<K, V2> transformEntry(Map.Entry<K, V1> entry) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        protected /* bridge */ /* synthetic */ SortedMap fromMap() {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(@ParametricNullness Object obj) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap subMap(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(@ParametricNullness Object obj) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        protected NavigableMap<K, V1> fromMap() {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@ParametricNullness K k, boolean z) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@ParametricNullness K k, boolean z) {
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        }
    }

    static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        TransformedEntriesSortedMap(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
        }

        protected SortedMap<K, V1> fromMap() {
        }

        public SortedMap<K, V2> headMap(@ParametricNullness K k) {
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
        }

        public SortedMap<K, V2> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        public SortedMap<K, V2> tailMap(@ParametricNullness K k) {
        }
    }

    private static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final BiMap<? extends K, ? extends V> delegate;

        @RetainedWith
        BiMap<V, K> inverse;
        final Map<K, V> unmodifiableMap;
        transient Set<V> values;

        UnmodifiableBiMap(BiMap<? extends K, ? extends V> biMap, BiMap<V, K> biMap2) {
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected Map<K, V> delegate() {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Set<V> values() {
        }
    }

    static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
        private final Collection<Map.Entry<K, V>> entries;

        UnmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected Collection<Map.Entry<K, V>> delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }
    }

    static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        UnmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }
    }

    @GwtIncompatible
    static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
        private final NavigableMap<K, ? extends V> delegate;
        private transient UnmodifiableNavigableMap<K, V> descendingMap;

        UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
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
        public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
        }

        UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected SortedMap<K, V> delegate() {
        }
    }

    static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {

        @ParametricNullness
        private final V left;

        @ParametricNullness
        private final V right;

        private ValueDifferenceImpl(@ParametricNullness V v, @ParametricNullness V v2) {
        }

        static <V> MapDifference.ValueDifference<V> create(@ParametricNullness V v, @ParametricNullness V v2) {
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @ParametricNullness
        public V leftValue() {
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @ParametricNullness
        public V rightValue() {
        }

        public String toString() {
        }
    }

    static class Values<K, V> extends AbstractCollection<V> {

        @Weak
        final Map<K, V> map;

        Values(Map<K, V> map) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        final Map<K, V> map() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    @GwtCompatible
    static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {
        private transient Set<Map.Entry<K, V>> entrySet;
        private transient Set<K> keySet;
        private transient Collection<V> values;

        ViewCachingAbstractMap() {
        }

        abstract Set<Map.Entry<K, V>> createEntrySet();

        Set<K> createKeySet() {
        }

        Collection<V> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<V> values() {
        }
    }

    private Maps() {
    }

    static /* synthetic */ Map access$100(Map map) {
    }

    static /* synthetic */ Set access$200(Set set) {
    }

    static /* synthetic */ SortedSet access$300(SortedSet sortedSet) {
    }

    static /* synthetic */ NavigableSet access$400(NavigableSet navigableSet) {
    }

    static /* synthetic */ Map.Entry access$800(Map.Entry entry) {
    }

    public static <A, B> Converter<A, B> asConverter(BiMap<A, B> biMap) {
    }

    static <K, V1, V2> Function<Map.Entry<K, V1>, Map.Entry<K, V2>> asEntryToEntryFunction(EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    static <K, V1, V2> Function<Map.Entry<K, V1>, V2> asEntryToValueFunction(EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    static <K, V1, V2> EntryTransformer<K, V1, V2> asEntryTransformer(Function<? super V1, V2> function) {
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, Function<? super K, V> function) {
    }

    static <K, V> Iterator<Map.Entry<K, V>> asMapEntryIterator(Set<K> set, Function<? super K, V> function) {
    }

    static <K, V1, V2> Function<V1, V2> asValueToValueFunction(EntryTransformer<? super K, V1, V2> entryTransformer, @ParametricNullness K k) {
    }

    static int capacity(int i) {
    }

    static <K, V> boolean containsEntryImpl(Collection<Map.Entry<K, V>> collection, Object obj) {
    }

    static boolean containsKeyImpl(Map<?, ?> map, Object obj) {
    }

    static boolean containsValueImpl(Map<?, ?> map, Object obj) {
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
    }

    private static <K, V> void doDifference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, MapDifference.ValueDifference<V>> map6) {
    }

    static boolean equalsImpl(Map<?, ?> map, Object obj) {
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    private static <K, V> Map<K, V> filterFiltered(AbstractFilteredMap<K, V> abstractFilteredMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, Predicate<? super K> predicate) {
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, Predicate<? super V> predicate) {
    }

    @GwtIncompatible
    public static ImmutableMap<String, String> fromProperties(Properties properties) {
    }

    @GwtCompatible(serializable = true)
    public static <K, V> Map.Entry<K, V> immutableEntry(@ParametricNullness K k, @ParametricNullness V v) {
    }

    @GwtCompatible(serializable = true)
    public static <K extends Enum<K>, V> ImmutableMap<K, V> immutableEnumMap(Map<K, ? extends V> map) {
    }

    static <E> ImmutableMap<E, Integer> indexMap(Collection<E> collection) {
    }

    static <K> Function<Map.Entry<K, ?>, K> keyFunction() {
    }

    static <K, V> Iterator<K> keyIterator(Iterator<Map.Entry<K, V>> it) {
    }

    static <K> K keyOrNull(Map.Entry<K, ?> entry) {
    }

    static <K> Predicate<Map.Entry<K, ?>> keyPredicateOnEntries(Predicate<? super K> predicate) {
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
    }

    public static <K, V> HashMap<K, V> newHashMap() {
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
    }

    static <E> Comparator<? super E> orNaturalOrder(Comparator<? super E> comparator) {
    }

    static <K, V> void putAllImpl(Map<K, V> map, Map<? extends K, ? extends V> map2) {
    }

    static <K, V> boolean removeEntryImpl(Collection<Map.Entry<K, V>> collection, Object obj) {
    }

    @GwtIncompatible
    private static <E> NavigableSet<E> removeOnlyNavigableSet(NavigableSet<E> navigableSet) {
    }

    private static <E> Set<E> removeOnlySet(Set<E> set) {
    }

    private static <E> SortedSet<E> removeOnlySortedSet(SortedSet<E> sortedSet) {
    }

    static boolean safeContainsKey(Map<?, ?> map, Object obj) {
    }

    static <V> V safeGet(Map<?, V> map, Object obj) {
    }

    static <V> V safeRemove(Map<?, V> map, Object obj) {
    }

    @Beta
    @GwtIncompatible
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, Range<K> range) {
    }

    public static <K, V> BiMap<K, V> synchronizedBiMap(BiMap<K, V> biMap) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterable<K> iterable, Function<? super K, V> function) {
    }

    static String toStringImpl(Map<?, ?> map) {
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    static <V2, K, V1> Map.Entry<K, V2> transformEntry(EntryTransformer<? super K, ? super V1, V2> entryTransformer, Map.Entry<K, V1> entry) {
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, Function<? super V1, V2> function) {
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterable<V> iterable, Function<? super V, K> function) {
    }

    public static <K, V> BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> biMap) {
    }

    static <K, V> Map.Entry<K, V> unmodifiableEntry(Map.Entry<? extends K, ? extends V> entry) {
    }

    static <K, V> UnmodifiableIterator<Map.Entry<K, V>> unmodifiableEntryIterator(Iterator<Map.Entry<K, V>> it) {
    }

    static <K, V> Set<Map.Entry<K, V>> unmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
    }

    private static <K, V> Map<K, V> unmodifiableMap(Map<K, ? extends V> map) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
    }

    private static <K, V> Map.Entry<K, V> unmodifiableOrNull(Map.Entry<K, ? extends V> entry) {
    }

    static <V> Function<Map.Entry<?, V>, V> valueFunction() {
    }

    static <K, V> Iterator<V> valueIterator(Iterator<Map.Entry<K, V>> it) {
    }

    static <V> V valueOrNull(Map.Entry<?, V> entry) {
    }

    static <V> Predicate<Map.Entry<?, V>> valuePredicateOnEntries(Predicate<? super V> predicate) {
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, Function<? super K, V> function) {
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, Predicate<? super V> predicate) {
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterator<K> it, Function<? super K, V> function) {
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, Function<? super V1, V2> function) {
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterator<V> it, Function<? super V, K> function) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, Function<? super K, V> function) {
    }

    private static <K, V> SortedMap<K, V> filterFiltered(FilteredEntrySortedMap<K, V> filteredEntrySortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, Predicate<? super V> predicate) {
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(Comparator<C> comparator) {
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, Function<? super V1, V2> function) {
    }

    public static <K, V> BiMap<K, V> filterValues(BiMap<K, V> biMap, Predicate<? super V> predicate) {
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence) {
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    @GwtIncompatible
    private static <K, V> NavigableMap<K, V> filterFiltered(FilteredEntryNavigableMap<K, V> filteredEntryNavigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, Predicate<? super K> predicate) {
    }

    private static <K, V> BiMap<K, V> filterFiltered(FilteredEntryBiMap<K, V> filteredEntryBiMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, Predicate<? super K> predicate) {
    }

    public static <K, V> BiMap<K, V> filterKeys(BiMap<K, V> biMap, Predicate<? super K> predicate) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }

    public static <K, V> SortedMapDifference<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
    }

    public static <K, V> BiMap<K, V> filterEntries(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
    }
}
