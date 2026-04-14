package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: com.google.common.collect.IndexedImmutableSet$1 */
    class C07211 extends ImmutableList<E> {
        final /* synthetic */ IndexedImmutableSet this$0;

        C07211(IndexedImmutableSet indexedImmutableSet) {
        }

        @Override // java.util.List
        public E get(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    IndexedImmutableSet() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    int copyIntoArray(Object[] objArr, int i) {
    }

    @Override // com.google.common.collect.ImmutableSet
    ImmutableList<E> createAsList() {
    }

    abstract E get(int i);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
    }
}
