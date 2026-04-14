package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Beta
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;
    private transient ArrayTable<R, C, V>.ColumnMap columnMap;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;
    private transient ArrayTable<R, C, V>.RowMap rowMap;

    /* renamed from: com.google.common.collect.ArrayTable$1 */
    class C06761 extends AbstractIndexedListIterator<Table.Cell<R, C, V>> {
        final /* synthetic */ ArrayTable this$0;

        C06761(ArrayTable arrayTable, int i) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected Table.Cell<R, C, V> get(int i) {
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$2 */
    class C06772 extends Tables.AbstractCell<R, C, V> {
        final int columnIndex;
        final int rowIndex;
        final /* synthetic */ ArrayTable this$0;
        final /* synthetic */ int val$index;

        C06772(ArrayTable arrayTable, int i) {
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$3 */
    class C06783 extends AbstractIndexedListIterator<V> {
        final /* synthetic */ ArrayTable this$0;

        C06783(ArrayTable arrayTable, int i) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected V get(int i) {
        }
    }

    private static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {
        private final ImmutableMap<K, Integer> keyIndex;

        /* renamed from: com.google.common.collect.ArrayTable$ArrayMap$1 */
        class C06791 extends AbstractMapEntry<K, V> {
            final /* synthetic */ ArrayMap this$0;
            final /* synthetic */ int val$index;

            C06791(ArrayMap arrayMap, int i) {
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            public K getKey() {
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public V getValue() {
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public V setValue(@ParametricNullness V v) {
            }
        }

        /* renamed from: com.google.common.collect.ArrayTable$ArrayMap$2 */
        class C06802 extends AbstractIndexedListIterator<Map.Entry<K, V>> {
            final /* synthetic */ ArrayMap this$0;

            C06802(ArrayMap arrayMap, int i) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            protected /* bridge */ /* synthetic */ Object get(int i) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            protected Map.Entry<K, V> get(int i) {
            }
        }

        /* synthetic */ ArrayMap(ImmutableMap immutableMap, C06761 c06761) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
        }

        Map.Entry<K, V> getEntry(int i) {
        }

        K getKey(int i) {
        }

        abstract String getKeyRole();

        @ParametricNullness
        abstract V getValue(int i);

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, @ParametricNullness V v) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
        }

        @ParametricNullness
        abstract V setValue(int i, @ParametricNullness V v);

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        private ArrayMap(ImmutableMap<K, Integer> immutableMap) {
        }
    }

    private class Column extends ArrayMap<R, V> {
        final int columnIndex;
        final /* synthetic */ ArrayTable this$0;

        Column(ArrayTable arrayTable, int i) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String getKeyRole() {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        V getValue(int i) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        V setValue(int i, V v) {
        }
    }

    private class ColumnMap extends ArrayMap<C, Map<R, V>> {
        final /* synthetic */ ArrayTable this$0;

        /* synthetic */ ColumnMap(ArrayTable arrayTable, C06761 c06761) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String getKeyRole() {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* bridge */ /* synthetic */ Object getValue(int i) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* bridge */ /* synthetic */ Object setValue(int i, Object obj) {
        }

        private ColumnMap(ArrayTable arrayTable) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        Map<R, V> getValue(int i) {
        }

        public Map<R, V> put(C c, Map<R, V> map) {
        }

        Map<R, V> setValue(int i, Map<R, V> map) {
        }
    }

    private class Row extends ArrayMap<C, V> {
        final int rowIndex;
        final /* synthetic */ ArrayTable this$0;

        Row(ArrayTable arrayTable, int i) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String getKeyRole() {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        V getValue(int i) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        V setValue(int i, V v) {
        }
    }

    private class RowMap extends ArrayMap<R, Map<C, V>> {
        final /* synthetic */ ArrayTable this$0;

        /* synthetic */ RowMap(ArrayTable arrayTable, C06761 c06761) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String getKeyRole() {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* bridge */ /* synthetic */ Object getValue(int i) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* bridge */ /* synthetic */ Object setValue(int i, Object obj) {
        }

        private RowMap(ArrayTable arrayTable) {
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        Map<C, V> getValue(int i) {
        }

        public Map<C, V> put(R r, Map<C, V> map) {
        }

        Map<C, V> setValue(int i, Map<C, V> map) {
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
    }

    static /* synthetic */ Table.Cell access$000(ArrayTable arrayTable, int i) {
    }

    static /* synthetic */ ImmutableList access$100(ArrayTable arrayTable) {
    }

    static /* synthetic */ ImmutableList access$200(ArrayTable arrayTable) {
    }

    static /* synthetic */ ImmutableMap access$300(ArrayTable arrayTable) {
    }

    static /* synthetic */ ImmutableMap access$600(ArrayTable arrayTable) {
    }

    static /* synthetic */ Object access$800(ArrayTable arrayTable, int i) {
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
    }

    private Table.Cell<R, C, V> getCell(int i) {
    }

    private V getValue(int i) {
    }

    public V at(int i, int i2) {
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator<Table.Cell<R, C, V>> cellIterator() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c) {
    }

    public ImmutableList<C> columnKeyList() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set columnKeySet() {
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

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
    }

    @CanIgnoreReturnValue
    public V erase(Object obj, Object obj2) {
    }

    public void eraseAll() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r, C c, V v) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public V remove(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
    }

    public ImmutableList<R> rowKeyList() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set rowKeySet() {
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
    }

    @CanIgnoreReturnValue
    public V set(int i, int i2, V v) {
    }

    @Override // com.google.common.collect.Table
    public int size() {
    }

    @GwtIncompatible
    public V[][] toArray(Class<V> cls) {
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator<V> valuesIterator() {
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Table<R, C, ? extends V> table) {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
    }

    private ArrayTable(Table<R, C, ? extends V> table) {
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
    }
}
