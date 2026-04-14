package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final Range<C> range;

    /* renamed from: com.google.common.collect.RegularContiguousSet$1 */
    class C07941 extends AbstractSequentialIterator<C> {
        final C last;
        final /* synthetic */ RegularContiguousSet this$0;

        C07941(RegularContiguousSet regularContiguousSet, Comparable comparable) {
        }

        @Override // com.google.common.collect.AbstractSequentialIterator
        protected /* bridge */ /* synthetic */ Object computeNext(Object obj) {
        }

        protected C computeNext(C c) {
        }
    }

    /* renamed from: com.google.common.collect.RegularContiguousSet$2 */
    class C07952 extends AbstractSequentialIterator<C> {
        final C first;
        final /* synthetic */ RegularContiguousSet this$0;

        C07952(RegularContiguousSet regularContiguousSet, Comparable comparable) {
        }

        @Override // com.google.common.collect.AbstractSequentialIterator
        protected /* bridge */ /* synthetic */ Object computeNext(Object obj) {
        }

        protected C computeNext(C c) {
        }
    }

    /* renamed from: com.google.common.collect.RegularContiguousSet$3 */
    class C07963 extends ImmutableAsList<C> {
        final /* synthetic */ RegularContiguousSet this$0;

        C07963(RegularContiguousSet regularContiguousSet) {
        }

        @Override // com.google.common.collect.ImmutableAsList
        /* bridge */ /* synthetic */ ImmutableCollection delegateCollection() {
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // com.google.common.collect.ImmutableAsList
        ImmutableSortedSet<C> delegateCollection() {
        }

        @Override // java.util.List
        public C get(int i) {
        }
    }

    @GwtIncompatible
    private static final class SerializedForm<C extends Comparable> implements Serializable {
        final DiscreteDomain<C> domain;
        final Range<C> range;

        /* synthetic */ SerializedForm(Range range, DiscreteDomain discreteDomain, C07941 c07941) {
        }

        private Object readResolve() {
        }

        private SerializedForm(Range<C> range, DiscreteDomain<C> discreteDomain) {
        }
    }

    RegularContiguousSet(Range<C> range, DiscreteDomain<C> discreteDomain) {
    }

    static /* synthetic */ boolean access$000(Comparable comparable, Comparable comparable2) {
    }

    private static boolean equalsOrThrow(Comparable<?> comparable, Comparable<?> comparable2) {
    }

    private ContiguousSet<C> intersectionInCurrentDomain(Range<C> range) {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
    }

    @Override // com.google.common.collect.ImmutableSet
    ImmutableList<C> createAsList() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ Iterator descendingIterator() {
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ Object first() {
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* bridge */ /* synthetic */ ImmutableSortedSet headSetImpl(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    int indexOf(Object obj) {
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ Object last() {
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* bridge */ /* synthetic */ ImmutableSortedSet subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* bridge */ /* synthetic */ ImmutableSortedSet tailSetImpl(Object obj, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    Object writeReplace() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public UnmodifiableIterator<C> descendingIterator() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
    }

    @Override // com.google.common.collect.ContiguousSet
    ContiguousSet<C> headSetImpl(C c, boolean z) {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<C> iterator() {
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range(BoundType boundType, BoundType boundType2) {
    }

    @Override // com.google.common.collect.ContiguousSet
    ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
    }

    @Override // com.google.common.collect.ContiguousSet
    ContiguousSet<C> tailSetImpl(C c, boolean z) {
    }
}
