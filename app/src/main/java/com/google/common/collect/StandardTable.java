package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    @GwtTransient
    final Map<R, Map<C, V>> backingMap;
    private transient Set<C> columnKeySet;
    private transient StandardTable<R, C, V>.ColumnMap columnMap;

    @GwtTransient
    final Supplier<? extends Map<C, V>> factory;
    private transient Map<R, Map<C, V>> rowMap;

    private class CellIterator implements Iterator<Table.Cell<R, C, V>> {
        Iterator<Map.Entry<C, V>> columnIterator;
        Map.Entry<R, Map<C, V>> rowEntry;
        final Iterator<Map.Entry<R, Map<C, V>>> rowIterator;
        final /* synthetic */ StandardTable this$0;

        private CellIterator(StandardTable standardTable) {
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
        public Table.Cell<R, C, V> next() {
        }

        /* synthetic */ CellIterator(StandardTable standardTable, C08191 c08191) {
        }
    }

    private class Column extends Maps.ViewCachingAbstractMap<R, V> {
        final C columnKey;
        final /* synthetic */ StandardTable this$0;

        private class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            final /* synthetic */ Column this$1;

            private EntrySet(Column column) {
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
            public Iterator<Map.Entry<R, V>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }

            /* synthetic */ EntrySet(Column column, C08191 c08191) {
            }
        }

        private class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {
            final Iterator<Map.Entry<R, Map<C, V>>> iterator;
            final /* synthetic */ Column this$1;

            /* renamed from: com.google.common.collect.StandardTable$Column$EntrySetIterator$1EntryImpl, reason: invalid class name */
            class C1EntryImpl extends AbstractMapEntry<R, V> {
                final /* synthetic */ EntrySetIterator this$2;
                final /* synthetic */ Map.Entry val$entry;

                C1EntryImpl(EntrySetIterator entrySetIterator, Map.Entry entry) {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public R getKey() {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public V getValue() {
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public V setValue(V v) {
                }
            }

            private EntrySetIterator(Column column) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Map.Entry<R, V> computeNext() {
            }

            /* synthetic */ EntrySetIterator(Column column, C08191 c08191) {
            }
        }

        private class KeySet extends Maps.KeySet<R, V> {
            final /* synthetic */ Column this$1;

            KeySet(Column column) {
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
            }
        }

        private class Values extends Maps.Values<R, V> {
            final /* synthetic */ Column this$1;

            Values(Column column) {
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

        Column(StandardTable standardTable, C c) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<Map.Entry<R, V>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<R> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<V> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r, V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }

        @CanIgnoreReturnValue
        boolean removeFromColumnIf(Predicate<? super Map.Entry<R, V>> predicate) {
        }
    }

    private class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        final /* synthetic */ StandardTable this$0;

        private ColumnKeySet(StandardTable standardTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
        }

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

        /* synthetic */ ColumnKeySet(StandardTable standardTable, C08191 c08191) {
        }
    }

    private class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {
        final /* synthetic */ StandardTable this$0;

        class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            final /* synthetic */ ColumnMap this$1;

            /* renamed from: com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet$1 */
            class C08201 implements Function<C, Map<R, V>> {
                final /* synthetic */ ColumnMapEntrySet this$2;

                C08201(ColumnMapEntrySet columnMapEntrySet) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public Map<R, V> apply(C c) {
                }
            }

            ColumnMapEntrySet(ColumnMap columnMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
            }

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

        private class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            final /* synthetic */ ColumnMap this$1;

            ColumnMapValues(ColumnMap columnMap) {
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

        private ColumnMap(StandardTable standardTable) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<C, Map<R, V>>> createEntrySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<Map<R, V>> createValues() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<C> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object remove(Object obj) {
        }

        /* synthetic */ ColumnMap(StandardTable standardTable, C08191 c08191) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<R, V> get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<R, V> remove(Object obj) {
        }
    }

    class Row extends Maps.IteratorBasedAbstractMap<C, V> {
        Map<C, V> backingRowMap;
        final R rowKey;
        final /* synthetic */ StandardTable this$0;

        /* renamed from: com.google.common.collect.StandardTable$Row$1 */
        class C08211 implements Iterator<Map.Entry<C, V>> {
            final /* synthetic */ Row this$1;
            final /* synthetic */ Iterator val$iterator;

            C08211(Row row, Iterator it) {
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
            public Map.Entry<C, V> next() {
            }
        }

        /* renamed from: com.google.common.collect.StandardTable$Row$2 */
        class C08222 extends ForwardingMapEntry<C, V> {
            final /* synthetic */ Map.Entry val$entry;

            C08222(Row row, Map.Entry entry) {
            }

            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
            protected /* bridge */ /* synthetic */ Object delegate() {
            }

            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            public boolean equals(Object obj) {
            }

            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            public V setValue(V v) {
            }

            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
            protected Map.Entry<C, V> delegate() {
            }
        }

        Row(StandardTable standardTable, R r) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        Map<C, V> computeBackingRowMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator<Map.Entry<C, V>> entryIterator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        void maintainEmptyInvariant() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        final void updateBackingRowMapField() {
        }

        Map.Entry<C, V> wrapEntry(Map.Entry<C, V> entry) {
        }
    }

    class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {
        final /* synthetic */ StandardTable this$0;

        class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            final /* synthetic */ RowMap this$1;

            /* renamed from: com.google.common.collect.StandardTable$RowMap$EntrySet$1 */
            class C08231 implements Function<R, Map<C, V>> {
                final /* synthetic */ EntrySet this$2;

                C08231(EntrySet entrySet) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public Map<C, V> apply(R r) {
                }
            }

            EntrySet(RowMap rowMap) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        RowMap(StandardTable standardTable) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<R, Map<C, V>>> createEntrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object remove(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<C, V> get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<C, V> remove(Object obj) {
        }
    }

    private abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        final /* synthetic */ StandardTable this$0;

        private TableSet(StandardTable standardTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        /* synthetic */ TableSet(StandardTable standardTable, C08191 c08191) {
        }
    }

    StandardTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
    }

    static /* synthetic */ boolean access$300(StandardTable standardTable, Object obj, Object obj2, Object obj3) {
    }

    static /* synthetic */ boolean access$400(StandardTable standardTable, Object obj, Object obj2, Object obj3) {
    }

    static /* synthetic */ Map access$900(StandardTable standardTable, Object obj) {
    }

    private boolean containsMapping(Object obj, Object obj2, Object obj3) {
    }

    private Map<C, V> getOrCreate(R r) {
    }

    @CanIgnoreReturnValue
    private Map<R, V> removeColumn(Object obj) {
    }

    private boolean removeMapping(Object obj, Object obj2, Object obj3) {
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator<Table.Cell<R, C, V>> cellIterator() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void clear() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<C> columnKeySet() {
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(Object obj) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(Object obj) {
    }

    Iterator<C> createColumnKeyIterator() {
    }

    Map<R, Map<C, V>> createRowMap() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r, C c, V v) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V remove(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<R> rowKeySet() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
    }

    @Override // com.google.common.collect.Table
    public int size() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
    }

    private class ColumnKeyIterator extends AbstractIterator<C> {
        Iterator<Map.Entry<C, V>> entryIterator;
        final Iterator<Map<C, V>> mapIterator;
        final Map<C, V> seen;
        final /* synthetic */ StandardTable this$0;

        private ColumnKeyIterator(StandardTable standardTable) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected C computeNext() {
        }

        /* synthetic */ ColumnKeyIterator(StandardTable standardTable, C08191 c08191) {
        }
    }
}
