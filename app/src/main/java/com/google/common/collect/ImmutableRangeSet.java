package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {
    private static final ImmutableRangeSet<Comparable<?>> ALL = null;
    private static final ImmutableRangeSet<Comparable<?>> EMPTY = null;

    @LazyInit
    private transient ImmutableRangeSet<C> complement;
    private final transient ImmutableList<Range<C>> ranges;

    /* renamed from: com.google.common.collect.ImmutableRangeSet$1 */
    class C07161 extends ImmutableList<Range<C>> {
        final /* synthetic */ ImmutableRangeSet this$0;
        final /* synthetic */ int val$fromIndex;
        final /* synthetic */ int val$length;
        final /* synthetic */ Range val$range;

        C07161(ImmutableRangeSet immutableRangeSet, int i, int i2, Range range) {
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.List
        public Range<C> get(int i) {
        }
    }

    private final class AsSet extends ImmutableSortedSet<C> {
        private final DiscreteDomain<C> domain;
        private transient Integer size;
        final /* synthetic */ ImmutableRangeSet this$0;

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$1 */
        class C07171 extends AbstractIterator<C> {
            Iterator<C> elemItr;
            final Iterator<Range<C>> rangeItr;
            final /* synthetic */ AsSet this$1;

            C07171(AsSet asSet) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected C computeNext() {
            }
        }

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$2 */
        class C07182 extends AbstractIterator<C> {
            Iterator<C> elemItr;
            final Iterator<Range<C>> rangeItr;
            final /* synthetic */ AsSet this$1;

            C07182(AsSet asSet) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected C computeNext() {
            }
        }

        AsSet(ImmutableRangeSet immutableRangeSet, DiscreteDomain<C> discreteDomain) {
        }

        static /* synthetic */ DiscreteDomain access$100(AsSet asSet) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        ImmutableSortedSet<C> createDescendingSet() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @GwtIncompatible("NavigableSet")
        public /* bridge */ /* synthetic */ Iterator descendingIterator() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* bridge */ /* synthetic */ ImmutableSortedSet headSetImpl(Object obj, boolean z) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        int indexOf(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        ImmutableSortedSet<C> subSet(Range<C> range) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* bridge */ /* synthetic */ ImmutableSortedSet subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* bridge */ /* synthetic */ ImmutableSortedSet tailSetImpl(Object obj, boolean z) {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        Object writeReplace() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @GwtIncompatible("NavigableSet")
        public UnmodifiableIterator<C> descendingIterator() {
        }

        ImmutableSortedSet<C> headSetImpl(C c, boolean z) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<C> iterator() {
        }

        ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        }

        ImmutableSortedSet<C> tailSetImpl(C c, boolean z) {
        }
    }

    private static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        private final DiscreteDomain<C> domain;
        private final ImmutableList<Range<C>> ranges;

        AsSetSerializedForm(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
        }

        Object readResolve() {
        }
    }

    public static class Builder<C extends Comparable<?>> {
        private final List<Range<C>> ranges;

        @CanIgnoreReturnValue
        public Builder<C> add(Range<C> range) {
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(RangeSet<C> rangeSet) {
        }

        public ImmutableRangeSet<C> build() {
        }

        @CanIgnoreReturnValue
        Builder<C> combine(Builder<C> builder) {
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(Iterable<Range<C>> iterable) {
        }
    }

    private final class ComplementRanges extends ImmutableList<Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;
        final /* synthetic */ ImmutableRangeSet this$0;

        ComplementRanges(ImmutableRangeSet immutableRangeSet) {
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.List
        public Range<C> get(int i) {
        }
    }

    private static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        SerializedForm(ImmutableList<Range<C>> immutableList) {
        }

        Object readResolve() {
        }
    }

    ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
    }

    static /* synthetic */ ImmutableList access$000(ImmutableRangeSet immutableRangeSet) {
    }

    static <C extends Comparable> ImmutableRangeSet<C> all() {
    }

    public static <C extends Comparable<?>> Builder<C> builder() {
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(RangeSet<C> rangeSet) {
    }

    private ImmutableList<Range<C>> intersectRanges(Range<C> range) {
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of() {
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void add(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ Set asDescendingSetOfRanges() {
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ Set asRanges() {
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ RangeSet complement() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
    }

    public ImmutableRangeSet<C> difference(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
    }

    public ImmutableRangeSet<C> intersection(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean isEmpty() {
    }

    boolean isPartialView() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public Range<C> rangeContaining(C c) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void remove(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ RangeSet subRangeSet(Range range) {
    }

    public ImmutableRangeSet<C> union(RangeSet<C> rangeSet) {
    }

    Object writeReplace() {
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asDescendingSetOfRanges() {
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asRanges() {
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> complement() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
    }
}
