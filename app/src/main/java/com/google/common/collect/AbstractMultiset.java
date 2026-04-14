package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {

    @LazyInit
    private transient Set<E> elementSet;

    @LazyInit
    private transient Set<Multiset.Entry<E>> entrySet;

    class ElementSet extends Multisets.ElementSet<E> {
        final /* synthetic */ AbstractMultiset this$0;

        ElementSet(AbstractMultiset abstractMultiset) {
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        Multiset<E> multiset() {
        }
    }

    class EntrySet extends Multisets.EntrySet<E> {
        final /* synthetic */ AbstractMultiset this$0;

        EntrySet(AbstractMultiset abstractMultiset) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Multiset.Entry<E>> iterator() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        Multiset<E> multiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    AbstractMultiset() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean add(@ParametricNullness E e) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(Object obj) {
    }

    Set<E> createElementSet() {
    }

    Set<Multiset.Entry<E>> createEntrySet() {
    }

    abstract int distinctElements();

    abstract Iterator<E> elementIterator();

    @Override // com.google.common.collect.Multiset
    public Set<E> elementSet() {
    }

    abstract Iterator<Multiset.Entry<E>> entryIterator();

    @Override // com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean remove(Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E e, int i) {
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final String toString() {
    }

    @CanIgnoreReturnValue
    public int add(@ParametricNullness E e, int i) {
    }

    @CanIgnoreReturnValue
    public int remove(Object obj, int i) {
    }

    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E e, int i, int i2) {
    }
}
