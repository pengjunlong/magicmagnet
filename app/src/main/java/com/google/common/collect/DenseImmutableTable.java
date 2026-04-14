package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;

@Immutable(containerOf = {"R", "C", "V"})
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    private final int[] columnCounts;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final int[] rowCounts;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;
    private final V[][] values;

    private final class Column extends ImmutableArrayMap<R, V> {
        private final int columnIndex;
        final /* synthetic */ DenseImmutableTable this$0;

        Column(DenseImmutableTable denseImmutableTable, int i) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        V getValue(int i) {
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<R, Integer> keyToIndex() {
        }
    }

    private final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        final /* synthetic */ DenseImmutableTable this$0;

        /* synthetic */ ColumnMap(DenseImmutableTable denseImmutableTable, C06911 c06911) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* bridge */ /* synthetic */ Object getValue(int i) {
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<C, Integer> keyToIndex() {
        }

        private ColumnMap(DenseImmutableTable denseImmutableTable) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<R, V> getValue(int i) {
        }
    }

    private static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        /* renamed from: com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$1 */
        class C06921 extends AbstractIterator<Map.Entry<K, V>> {
            private int index;
            private final int maxIndex;
            final /* synthetic */ ImmutableArrayMap this$0;

            C06921(ImmutableArrayMap immutableArrayMap) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Map.Entry<K, V> computeNext() {
            }
        }

        ImmutableArrayMap(int i) {
        }

        private boolean isFull() {
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        ImmutableSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        UnmodifiableIterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(Object obj) {
        }

        K getKey(int i) {
        }

        abstract V getValue(int i);

        abstract ImmutableMap<K, Integer> keyToIndex();

        @Override // java.util.Map
        public int size() {
        }
    }

    private final class Row extends ImmutableArrayMap<C, V> {
        private final int rowIndex;
        final /* synthetic */ DenseImmutableTable this$0;

        Row(DenseImmutableTable denseImmutableTable, int i) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        V getValue(int i) {
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<C, Integer> keyToIndex() {
        }
    }

    private final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        final /* synthetic */ DenseImmutableTable this$0;

        /* synthetic */ RowMap(DenseImmutableTable denseImmutableTable, C06911 c06911) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* bridge */ /* synthetic */ Object getValue(int i) {
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<R, Integer> keyToIndex() {
        }

        private RowMap(DenseImmutableTable denseImmutableTable) {
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<C, V> getValue(int i) {
        }
    }

    DenseImmutableTable(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
    }

    static /* synthetic */ int[] access$200(DenseImmutableTable denseImmutableTable) {
    }

    static /* synthetic */ ImmutableMap access$300(DenseImmutableTable denseImmutableTable) {
    }

    static /* synthetic */ Object[][] access$400(DenseImmutableTable denseImmutableTable) {
    }

    static /* synthetic */ int[] access$500(DenseImmutableTable denseImmutableTable) {
    }

    static /* synthetic */ ImmutableMap access$600(DenseImmutableTable denseImmutableTable) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map columnMap() {
    }

    @Override // com.google.common.collect.ImmutableTable
    ImmutableTable.SerializedForm createSerializedForm() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.RegularImmutableTable
    Table.Cell<R, C, V> getCell(int i) {
    }

    @Override // com.google.common.collect.RegularImmutableTable
    V getValue(int i) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map rowMap() {
    }

    @Override // com.google.common.collect.Table
    public int size() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
    }
}
