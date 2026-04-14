package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: com.google.common.collect.RegularImmutableTable$1 */
    class C07991 implements Comparator<Table.Cell<R, C, V>> {
        final /* synthetic */ Comparator val$columnComparator;
        final /* synthetic */ Comparator val$rowComparator;

        C07991(Comparator comparator, Comparator comparator2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        }

        public int compare(Table.Cell<R, C, V> cell, Table.Cell<R, C, V> cell2) {
        }
    }

    private final class CellSet extends IndexedImmutableSet<Table.Cell<R, C, V>> {
        final /* synthetic */ RegularImmutableTable this$0;

        private CellSet(RegularImmutableTable regularImmutableTable) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        /* synthetic */ CellSet(RegularImmutableTable regularImmutableTable, C07991 c07991) {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        Table.Cell<R, C, V> get(int i) {
        }
    }

    private final class Values extends ImmutableList<V> {
        final /* synthetic */ RegularImmutableTable this$0;

        private Values(RegularImmutableTable regularImmutableTable) {
        }

        @Override // java.util.List
        public V get(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ Values(RegularImmutableTable regularImmutableTable, C07991 c07991) {
        }
    }

    RegularImmutableTable() {
    }

    static <R, C, V> RegularImmutableTable<R, C, V> forCells(List<Table.Cell<R, C, V>> list, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
    }

    private static <R, C, V> RegularImmutableTable<R, C, V> forCellsInternal(Iterable<Table.Cell<R, C, V>> iterable, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
    }

    static <R, C, V> RegularImmutableTable<R, C, V> forOrderedComponents(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
    }

    final void checkNoDuplicate(R r, C c, V v, V v2) {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* bridge */ /* synthetic */ Set createCellSet() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* bridge */ /* synthetic */ Collection createValues() {
    }

    abstract Table.Cell<R, C, V> getCell(int i);

    abstract V getValue(int i);

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    final ImmutableSet<Table.Cell<R, C, V>> createCellSet() {
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    final ImmutableCollection<V> createValues() {
    }

    static <R, C, V> RegularImmutableTable<R, C, V> forCells(Iterable<Table.Cell<R, C, V>> iterable) {
    }
}
