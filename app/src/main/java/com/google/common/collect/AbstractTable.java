package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractTable<R, C, V> implements Table<R, C, V> {

    @LazyInit
    private transient Set<Table.Cell<R, C, V>> cellSet;

    @LazyInit
    private transient Collection<V> values;

    /* renamed from: com.google.common.collect.AbstractTable$1 */
    class C06751 extends TransformedIterator<Table.Cell<R, C, V>, V> {
        C06751(AbstractTable abstractTable, Iterator it) {
        }

        @Override // com.google.common.collect.TransformedIterator
        @ParametricNullness
        /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        @ParametricNullness
        V transform(Table.Cell<R, C, V> cell) {
        }
    }

    class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        final /* synthetic */ AbstractTable this$0;

        CellSet(AbstractTable abstractTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Table.Cell<R, C, V>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    class Values extends AbstractCollection<V> {
        final /* synthetic */ AbstractTable this$0;

        Values(AbstractTable abstractTable) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    AbstractTable() {
    }

    abstract Iterator<Table.Cell<R, C, V>> cellIterator();

    @Override // com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
    }

    @Override // com.google.common.collect.Table
    public void clear() {
    }

    @Override // com.google.common.collect.Table
    public Set<C> columnKeySet() {
    }

    @Override // com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(Object obj) {
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(Object obj) {
    }

    Set<Table.Cell<R, C, V>> createCellSet() {
    }

    Collection<V> createValues() {
    }

    @Override // com.google.common.collect.Table
    public boolean equals(Object obj) {
    }

    @Override // com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v) {
    }

    @Override // com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V remove(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Table
    public Set<R> rowKeySet() {
    }

    public String toString() {
    }

    @Override // com.google.common.collect.Table
    public Collection<V> values() {
    }

    Iterator<V> valuesIterator() {
    }
}
