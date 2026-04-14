package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Sets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$1 */
    class C08011<E> extends SetView<E> {
        final /* synthetic */ Set val$set1;
        final /* synthetic */ Set val$set2;

        /* renamed from: com.google.common.collect.Sets$1$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<E> {
            final Iterator<? extends E> itr1;
            final Iterator<? extends E> itr2;
            final /* synthetic */ C08011 this$0;

            AnonymousClass1(C08011 c08011) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected E computeNext() {
            }
        }

        C08011(Set set, Set set2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.Sets.SetView
        public <S extends Set<E>> S copyInto(S s) {
        }

        @Override // com.google.common.collect.Sets.SetView
        public ImmutableSet<E> immutableCopy() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$2 */
    class C08022<E> extends SetView<E> {
        final /* synthetic */ Set val$set1;
        final /* synthetic */ Set val$set2;

        /* renamed from: com.google.common.collect.Sets$2$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<E> {
            final Iterator<E> itr;
            final /* synthetic */ C08022 this$0;

            AnonymousClass1(C08022 c08022) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected E computeNext() {
            }
        }

        C08022(Set set, Set set2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$3 */
    class C08033<E> extends SetView<E> {
        final /* synthetic */ Set val$set1;
        final /* synthetic */ Set val$set2;

        /* renamed from: com.google.common.collect.Sets$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<E> {
            final Iterator<E> itr;
            final /* synthetic */ C08033 this$0;

            AnonymousClass1(C08033 c08033) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected E computeNext() {
            }
        }

        C08033(Set set, Set set2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$4 */
    class C08044<E> extends SetView<E> {
        final /* synthetic */ Set val$set1;
        final /* synthetic */ Set val$set2;

        /* renamed from: com.google.common.collect.Sets$4$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<E> {
            final /* synthetic */ C08044 this$0;
            final /* synthetic */ Iterator val$itr1;
            final /* synthetic */ Iterator val$itr2;

            AnonymousClass1(C08044 c08044, Iterator it, Iterator it2) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
            }
        }

        C08044(Set set, Set set2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$5 */
    class C08055<E> extends AbstractSet<Set<E>> {
        final /* synthetic */ ImmutableMap val$index;
        final /* synthetic */ int val$size;

        /* renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Set<E>> {
            final BitSet bits;
            final /* synthetic */ C08055 this$0;

            /* renamed from: com.google.common.collect.Sets$5$1$1, reason: invalid class name and collision with other inner class name */
            class C20051 extends AbstractSet<E> {
                final /* synthetic */ AnonymousClass1 this$1;
                final /* synthetic */ BitSet val$copy;

                /* renamed from: com.google.common.collect.Sets$5$1$1$1, reason: invalid class name and collision with other inner class name */
                class C20061 extends AbstractIterator<E> {

                    /* renamed from: i */
                    int f106i;
                    final /* synthetic */ C20051 this$2;

                    C20061(C20051 c20051) {
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                    }
                }

                C20051(AnonymousClass1 anonymousClass1, BitSet bitSet) {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                }
            }

            AnonymousClass1(C08055 c08055) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Set<E> computeNext() {
            }
        }

        C08055(int i, ImmutableMap immutableMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }
    }

    private static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {
        private final transient ImmutableList<ImmutableSet<E>> axes;
        private final transient CartesianList<E> delegate;

        /* renamed from: com.google.common.collect.Sets$CartesianSet$1 */
        class C08061 extends ImmutableList<List<E>> {
            final /* synthetic */ ImmutableList val$axes;

            C08061(ImmutableList immutableList) {
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
            public List<E> get(int i) {
            }
        }

        private CartesianSet(ImmutableList<ImmutableSet<E>> immutableList, CartesianList<E> cartesianList) {
        }

        static <E> Set<List<E>> create(List<? extends Set<? extends E>> list) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected Collection<List<E>> delegate() {
        }
    }

    @GwtIncompatible
    static class DescendingSet<E> extends ForwardingNavigableSet<E> {
        private final NavigableSet<E> forward;

        DescendingSet(NavigableSet<E> navigableSet) {
        }

        private static <T> Ordering<T> reverse(Comparator<T> comparator) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E ceiling(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<? super E> comparator() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E first() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E floor(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E higher(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E lower(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollFirst() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollLast() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ SortedSet delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected NavigableSet<E> delegate() {
        }
    }

    @GwtIncompatible
    private static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        FilteredNavigableSet(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e) {
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e) {
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
        }

        NavigableSet<E> unfiltered() {
        }
    }

    private static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        FilteredSet(Set<E> set, Predicate<? super E> predicate) {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }
    }

    private static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        FilteredSortedSet(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
        }

        @ParametricNullness
        public E last() {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
        }
    }

    static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        ImprovedAbstractSet() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }
    }

    private static final class PowerSet<E> extends AbstractSet<Set<E>> {
        final ImmutableMap<E, Integer> inputSet;

        /* renamed from: com.google.common.collect.Sets$PowerSet$1 */
        class C08071 extends AbstractIndexedListIterator<Set<E>> {
            final /* synthetic */ PowerSet this$0;

            C08071(PowerSet powerSet, int i) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            protected /* bridge */ /* synthetic */ Object get(int i) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            protected Set<E> get(int i) {
            }
        }

        PowerSet(Set<E> set) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        /* synthetic */ SetView(C08011 c08011) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(@ParametricNullness E e) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
        }

        @CanIgnoreReturnValue
        public <S extends Set<E>> S copyInto(S s) {
        }

        public ImmutableSet<E> immutableCopy() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
        }

        private SetView() {
        }
    }

    private static final class SubSet<E> extends AbstractSet<E> {
        private final ImmutableMap<E, Integer> inputSet;
        private final int mask;

        /* renamed from: com.google.common.collect.Sets$SubSet$1 */
        class C08081 extends UnmodifiableIterator<E> {
            final ImmutableList<E> elements;
            int remainingSetBits;
            final /* synthetic */ SubSet this$0;

            C08081(SubSet subSet) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public E next() {
            }
        }

        SubSet(ImmutableMap<E, Integer> immutableMap, int i) {
        }

        static /* synthetic */ ImmutableMap access$100(SubSet subSet) {
        }

        static /* synthetic */ int access$200(SubSet subSet) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        private final NavigableSet<E> delegate;
        private transient UnmodifiableNavigableSet<E> descendingSet;
        private final SortedSet<E> unmodifiableDelegate;

        UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e) {
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e) {
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected SortedSet<E> delegate() {
        }
    }

    private Sets() {
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
    }

    @Beta
    public static <E> Set<Set<E>> combinations(Set<E> set, int i) {
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
    }

    public static <E> SetView<E> difference(Set<E> set, Set<?> set2) {
    }

    static boolean equalsImpl(Set<?> set, Object obj) {
    }

    public static <E> Set<E> filter(Set<E> set, Predicate<? super E> predicate) {
    }

    static int hashCodeImpl(Set<?> set) {
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E e, E... eArr) {
    }

    public static <E> SetView<E> intersection(Set<E> set, Set<?> set2) {
    }

    private static <E extends Enum<E>> EnumSet<E> makeComplementByHand(Collection<E> collection, Class<E> cls) {
    }

    public static <E> Set<E> newConcurrentHashSet() {
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
    }

    public static <E> HashSet<E> newHashSet() {
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i) {
    }

    public static <E> Set<E> newIdentityHashSet() {
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
    }

    @GwtCompatible(serializable = false)
    public static <E> Set<Set<E>> powerSet(Set<E> set) {
    }

    static boolean removeAllImpl(Set<?> set, Iterator<?> it) {
    }

    @Beta
    @GwtIncompatible
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, Range<K> range) {
    }

    public static <E> SetView<E> symmetricDifference(Set<? extends E> set, Set<? extends E> set2) {
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
    }

    public static <E> SetView<E> union(Set<? extends E> set, Set<? extends E> set2) {
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> iterable) {
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
    }

    static boolean removeAllImpl(Set<?> set, Collection<?> collection) {
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
    }

    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
    }
}
