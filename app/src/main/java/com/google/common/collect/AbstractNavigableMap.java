package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractNavigableMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> implements NavigableMap<K, V> {

    private final class DescendingMap extends Maps.DescendingMap<K, V> {
        final /* synthetic */ AbstractNavigableMap this$0;

        private DescendingMap(AbstractNavigableMap abstractNavigableMap) {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        NavigableMap<K, V> forward() {
        }

        /* synthetic */ DescendingMap(AbstractNavigableMap abstractNavigableMap, C06741 c06741) {
        }
    }

    AbstractNavigableMap() {
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(@ParametricNullness K k) {
    }

    abstract Iterator<Map.Entry<K, V>> descendingEntryIterator();

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
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

    @Override // java.util.AbstractMap, java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(@ParametricNullness K k) {
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
    }

    @Override // java.util.NavigableMap
    public K higherKey(@ParametricNullness K k) {
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
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

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(@ParametricNullness K k) {
    }
}
