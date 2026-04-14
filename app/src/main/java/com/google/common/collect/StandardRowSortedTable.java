package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    private class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        final /* synthetic */ StandardRowSortedTable this$0;

        private RowSortedMap(StandardRowSortedTable standardRowSortedTable) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* bridge */ /* synthetic */ Set createKeySet() {
        }

        @Override // java.util.SortedMap
        public R firstKey() {
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // java.util.SortedMap
        public R lastKey() {
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r) {
        }

        /* synthetic */ RowSortedMap(StandardRowSortedTable standardRowSortedTable, C08181 c08181) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        SortedSet<R> createKeySet() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<R> keySet() {
        }
    }

    StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, Supplier<? extends Map<C, V>> supplier) {
    }

    static /* synthetic */ SortedMap access$100(StandardRowSortedTable standardRowSortedTable) {
    }

    private SortedMap<R, Map<C, V>> sortedBackingMap() {
    }

    @Override // com.google.common.collect.StandardTable
    /* bridge */ /* synthetic */ Map createRowMap() {
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set rowKeySet() {
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map rowMap() {
    }

    @Override // com.google.common.collect.StandardTable
    SortedMap<R, Map<C, V>> createRowMap() {
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public SortedSet<R> rowKeySet() {
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<R, Map<C, V>> rowMap() {
    }
}
