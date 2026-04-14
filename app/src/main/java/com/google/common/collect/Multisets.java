package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Multisets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$1 */
    class C07851<E> extends ViewMultiset<E> {
        final /* synthetic */ Multiset val$multiset1;
        final /* synthetic */ Multiset val$multiset2;

        /* renamed from: com.google.common.collect.Multisets$1$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
            final /* synthetic */ C07851 this$0;
            final /* synthetic */ Iterator val$iterator1;
            final /* synthetic */ Iterator val$iterator2;

            AnonymousClass1(C07851 c07851, Iterator it, Iterator it2) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Multiset.Entry<E> computeNext() {
            }
        }

        C07851(Multiset multiset, Multiset multiset2) {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<Multiset.Entry<E>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$2 */
    class C07862<E> extends ViewMultiset<E> {
        final /* synthetic */ Multiset val$multiset1;
        final /* synthetic */ Multiset val$multiset2;

        /* renamed from: com.google.common.collect.Multisets$2$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
            final /* synthetic */ C07862 this$0;
            final /* synthetic */ Iterator val$iterator1;

            AnonymousClass1(C07862 c07862, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Multiset.Entry<E> computeNext() {
            }
        }

        C07862(Multiset multiset, Multiset multiset2) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<Multiset.Entry<E>> entryIterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$3 */
    class C07873<E> extends ViewMultiset<E> {
        final /* synthetic */ Multiset val$multiset1;
        final /* synthetic */ Multiset val$multiset2;

        /* renamed from: com.google.common.collect.Multisets$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
            final /* synthetic */ C07873 this$0;
            final /* synthetic */ Iterator val$iterator1;
            final /* synthetic */ Iterator val$iterator2;

            AnonymousClass1(C07873 c07873, Iterator it, Iterator it2) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Multiset.Entry<E> computeNext() {
            }
        }

        C07873(Multiset multiset, Multiset multiset2) {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<Multiset.Entry<E>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$4 */
    class C07884<E> extends ViewMultiset<E> {
        final /* synthetic */ Multiset val$multiset1;
        final /* synthetic */ Multiset val$multiset2;

        /* renamed from: com.google.common.collect.Multisets$4$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<E> {
            final /* synthetic */ C07884 this$0;
            final /* synthetic */ Iterator val$iterator1;

            AnonymousClass1(C07884 c07884, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected E computeNext() {
            }
        }

        /* renamed from: com.google.common.collect.Multisets$4$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Multiset.Entry<E>> {
            final /* synthetic */ C07884 this$0;
            final /* synthetic */ Iterator val$iterator1;

            AnonymousClass2(C07884 c07884, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Multiset.Entry<E> computeNext() {
            }
        }

        C07884(Multiset multiset, Multiset multiset2) {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
        int distinctElements() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<Multiset.Entry<E>> entryIterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$5 */
    class C07895<E> extends TransformedIterator<Multiset.Entry<E>, E> {
        C07895(Iterator it) {
        }

        @Override // com.google.common.collect.TransformedIterator
        @ParametricNullness
        /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        @ParametricNullness
        E transform(Multiset.Entry<E> entry) {
        }
    }

    static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        AbstractEntry() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public String toString() {
        }
    }

    private static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {
        static final DecreasingCount INSTANCE = null;

        private DecreasingCount() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
        }
    }

    static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        ElementSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
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

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        abstract Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        abstract Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }
    }

    private static final class FilteredMultiset<E> extends ViewMultiset<E> {
        final Predicate<? super E> predicate;
        final Multiset<E> unfiltered;

        /* renamed from: com.google.common.collect.Multisets$FilteredMultiset$1 */
        class C07901 implements Predicate<Multiset.Entry<E>> {
            final /* synthetic */ FilteredMultiset this$0;

            C07901(FilteredMultiset filteredMultiset) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            }

            public boolean apply(Multiset.Entry<E> entry) {
            }
        }

        FilteredMultiset(Multiset<E> multiset, Predicate<? super E> predicate) {
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int add(@ParametricNullness E e, int i) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set<Multiset.Entry<E>> createEntrySet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator<Multiset.Entry<E>> entryIterator() {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public UnmodifiableIterator<E> iterator() {
        }
    }

    static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;

        @ParametricNullness
        private final E element;

        ImmutableEntry(@ParametricNullness E e, int i) {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public final E getElement() {
        }

        public ImmutableEntry<E> nextInBucket() {
        }
    }

    static final class MultisetIteratorImpl<E> implements Iterator<E> {
        private boolean canRemove;
        private Multiset.Entry<E> currentEntry;
        private final Iterator<Multiset.Entry<E>> entryIterator;
        private int laterCount;
        private final Multiset<E> multiset;
        private int totalCount;

        MultisetIteratorImpl(Multiset<E> multiset, Iterator<Multiset.Entry<E>> it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public E next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Multiset<? extends E> delegate;
        transient Set<E> elementSet;
        transient Set<Multiset.Entry<E>> entrySet;

        UnmodifiableMultiset(Multiset<? extends E> multiset) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness E e) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<E> elementSet() {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(@ParametricNullness E e, int i) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(@ParametricNullness E e, int i) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(@ParametricNullness E e, int i, int i2) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected Multiset<E> delegate() {
        }
    }

    private static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        private ViewMultiset() {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        int distinctElements() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
        }

        /* synthetic */ ViewMultiset(C07851 c07851) {
        }
    }

    private Multisets() {
    }

    static <E> boolean addAllImpl(Multiset<E> multiset, Collection<? extends E> collection) {
    }

    static <T> Multiset<T> cast(Iterable<T> iterable) {
    }

    @CanIgnoreReturnValue
    public static boolean containsOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
    }

    @Beta
    public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
    }

    @Beta
    public static <E> Multiset<E> difference(Multiset<E> multiset, Multiset<?> multiset2) {
    }

    static <E> Iterator<E> elementIterator(Iterator<Multiset.Entry<E>> it) {
    }

    static boolean equalsImpl(Multiset<?> multiset, Object obj) {
    }

    @Beta
    public static <E> Multiset<E> filter(Multiset<E> multiset, Predicate<? super E> predicate) {
    }

    public static <E> Multiset.Entry<E> immutableEntry(@ParametricNullness E e, int i) {
    }

    static int inferDistinctElements(Iterable<?> iterable) {
    }

    public static <E> Multiset<E> intersection(Multiset<E> multiset, Multiset<?> multiset2) {
    }

    static <E> Iterator<E> iteratorImpl(Multiset<E> multiset) {
    }

    static int linearTimeSizeImpl(Multiset<?> multiset) {
    }

    static boolean removeAllImpl(Multiset<?> multiset, Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Iterable<?> iterable) {
    }

    static boolean retainAllImpl(Multiset<?> multiset, Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public static boolean retainOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
    }

    private static <E> boolean retainOccurrencesImpl(Multiset<E> multiset, Multiset<?> multiset2) {
    }

    static <E> int setCountImpl(Multiset<E> multiset, @ParametricNullness E e, int i) {
    }

    @Beta
    public static <E> Multiset<E> sum(Multiset<? extends E> multiset, Multiset<? extends E> multiset2) {
    }

    @Beta
    public static <E> Multiset<E> union(Multiset<? extends E> multiset, Multiset<? extends E> multiset2) {
    }

    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
    }

    @Beta
    public static <E> SortedMultiset<E> unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
    }

    @Deprecated
    public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> immutableMultiset) {
    }

    static <E> boolean setCountImpl(Multiset<E> multiset, @ParametricNullness E e, int i, int i2) {
    }

    private static <E> boolean addAllImpl(Multiset<E> multiset, Multiset<? extends E> multiset2) {
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
    }

    private static <E> boolean addAllImpl(Multiset<E> multiset, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
    }
}
