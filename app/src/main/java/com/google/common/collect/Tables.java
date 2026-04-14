package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Tables {
    private static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> UNMODIFIABLE_WRAPPER = null;

    /* renamed from: com.google.common.collect.Tables$1 */
    class C08291 implements Function<Map<Object, Object>, Map<Object, Object>> {
        C08291() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Map<Object, Object> apply(Map<Object, Object> map) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public Map<Object, Object> apply2(Map<Object, Object> map) {
        }
    }

    static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        AbstractCell() {
        }

        @Override // com.google.common.collect.Table.Cell
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
        }

        public String toString() {
        }
    }

    static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        private final C columnKey;

        @ParametricNullness
        private final R rowKey;

        @ParametricNullness
        private final V value;

        ImmutableCell(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v) {
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public C getColumnKey() {
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public R getRowKey() {
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public V getValue() {
        }
    }

    private static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {
        final Table<R, C, V1> fromTable;
        final Function<? super V1, V2> function;

        /* renamed from: com.google.common.collect.Tables$TransformedTable$1 */
        class C08301 implements Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>> {
            final /* synthetic */ TransformedTable this$0;

            C08301(TransformedTable transformedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Table.Cell<R, C, V2> apply(Table.Cell<R, C, V1> cell) {
            }
        }

        /* renamed from: com.google.common.collect.Tables$TransformedTable$2 */
        class C08312 implements Function<Map<C, V1>, Map<C, V2>> {
            final /* synthetic */ TransformedTable this$0;

            C08312(TransformedTable transformedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Map<C, V2> apply(Map<C, V1> map) {
            }
        }

        /* renamed from: com.google.common.collect.Tables$TransformedTable$3 */
        class C08323 implements Function<Map<R, V1>, Map<R, V2>> {
            final /* synthetic */ TransformedTable this$0;

            C08323(TransformedTable transformedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Map<R, V2> apply(Map<R, V1> map) {
            }
        }

        TransformedTable(Table<R, C, V1> table, Function<? super V1, V2> function) {
        }

        Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>> cellFunction() {
        }

        @Override // com.google.common.collect.AbstractTable
        Iterator<Table.Cell<R, C, V2>> cellIterator() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, V2> column(@ParametricNullness C c) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V2>> columnMap() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.AbstractTable
        Collection<V2> createValues() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 get(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 put(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V2 v2) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V2> table) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 remove(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public Map<C, V2> row(@ParametricNullness R r) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V2>> rowMap() {
        }

        @Override // com.google.common.collect.Table
        public int size() {
        }
    }

    private static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {
        private static final Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>> TRANSPOSE_CELL = null;
        final Table<R, C, V> original;

        /* renamed from: com.google.common.collect.Tables$TransposeTable$1 */
        class C08331 implements Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>> {
            C08331() {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Table.Cell<?, ?, ?> apply(Table.Cell<?, ?, ?> cell) {
            }

            /* renamed from: apply, reason: avoid collision after fix types in other method */
            public Table.Cell<?, ?, ?> apply2(Table.Cell<?, ?, ?> cell) {
            }
        }

        TransposeTable(Table<R, C, V> table) {
        }

        @Override // com.google.common.collect.AbstractTable
        Iterator<Table.Cell<C, R, V>> cellIterator() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> column(@ParametricNullness R r) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> columnKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> columnMap() {
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
        public V get(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V put(@ParametricNullness C c, @ParametricNullness R r, @ParametricNullness V v) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends C, ? extends R, ? extends V> table) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V remove(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> row(@ParametricNullness C c) {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> rowKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> rowMap() {
        }

        @Override // com.google.common.collect.Table
        public int size() {
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Collection<V> values() {
        }
    }

    static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Table delegate() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public /* bridge */ /* synthetic */ Set rowKeySet() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public /* bridge */ /* synthetic */ Map rowMap() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedSet<R> rowKeySet() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedMap<R, Map<C, V>> rowMap() {
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected RowSortedTable<R, C, V> delegate() {
        }
    }

    private static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final Table<? extends R, ? extends C, ? extends V> delegate;

        UnmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, V> column(@ParametricNullness C c) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V put(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V remove(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, V> row(@ParametricNullness R r) {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Collection<V> values() {
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        protected Table<R, C, V> delegate() {
        }
    }

    private Tables() {
    }

    static /* synthetic */ Function access$000() {
    }

    static boolean equalsImpl(Table<?, ?, ?> table, Object obj) {
    }

    public static <R, C, V> Table.Cell<R, C, V> immutableCell(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v) {
    }

    @Beta
    public static <R, C, V> Table<R, C, V> newCustomTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
    }

    public static <R, C, V> Table<R, C, V> synchronizedTable(Table<R, C, V> table) {
    }

    @Beta
    public static <R, C, V1, V2> Table<R, C, V2> transformValues(Table<R, C, V1> table, Function<? super V1, V2> function) {
    }

    public static <R, C, V> Table<C, R, V> transpose(Table<R, C, V> table) {
    }

    @Beta
    public static <R, C, V> RowSortedTable<R, C, V> unmodifiableRowSortedTable(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
    }

    public static <R, C, V> Table<R, C, V> unmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
    }

    private static <K, V> Function<Map<K, V>, Map<K, V>> unmodifiableWrapper() {
    }
}
