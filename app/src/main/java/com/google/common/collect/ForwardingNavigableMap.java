package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    @Beta
    protected class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        final /* synthetic */ ForwardingNavigableMap this$0;

        /* renamed from: com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1 */
        class C07021 implements Iterator<Map.Entry<K, V>> {
            private Map.Entry<K, V> nextOrNull;
            final /* synthetic */ StandardDescendingMap this$1;
            private Map.Entry<K, V> toRemove;

            C07021(StandardDescendingMap standardDescendingMap) {
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
            public Map.Entry<K, V> next() {
            }
        }

        public StandardDescendingMap(ForwardingNavigableMap forwardingNavigableMap) {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        protected Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        NavigableMap<K, V> forward() {
        }
    }

    @Beta
    protected class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
        public StandardNavigableKeySet(ForwardingNavigableMap forwardingNavigableMap) {
        }
    }

    protected ForwardingNavigableMap() {
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

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected abstract NavigableMap<K, V> delegate();

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

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
    }

    @Override // java.util.NavigableMap
    public K higherKey(@ParametricNullness K k) {
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
    public Map.Entry<K, V> pollFirstEntry() {
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
    }

    protected Map.Entry<K, V> standardCeilingEntry(@ParametricNullness K k) {
    }

    protected K standardCeilingKey(@ParametricNullness K k) {
    }

    @Beta
    protected NavigableSet<K> standardDescendingKeySet() {
    }

    protected Map.Entry<K, V> standardFirstEntry() {
    }

    protected K standardFirstKey() {
    }

    protected Map.Entry<K, V> standardFloorEntry(@ParametricNullness K k) {
    }

    protected K standardFloorKey(@ParametricNullness K k) {
    }

    protected SortedMap<K, V> standardHeadMap(@ParametricNullness K k) {
    }

    protected Map.Entry<K, V> standardHigherEntry(@ParametricNullness K k) {
    }

    protected K standardHigherKey(@ParametricNullness K k) {
    }

    protected Map.Entry<K, V> standardLastEntry() {
    }

    protected K standardLastKey() {
    }

    protected Map.Entry<K, V> standardLowerEntry(@ParametricNullness K k) {
    }

    protected K standardLowerKey(@ParametricNullness K k) {
    }

    protected Map.Entry<K, V> standardPollFirstEntry() {
    }

    protected Map.Entry<K, V> standardPollLastEntry() {
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    protected SortedMap<K, V> standardSubMap(@ParametricNullness K k, @ParametricNullness K k2) {
    }

    protected SortedMap<K, V> standardTailMap(@ParametricNullness K k) {
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Map delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ SortedMap delegate() {
    }
}
