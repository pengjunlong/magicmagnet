package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Lists {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Lists$1 */
    class C07461<E> extends RandomAccessListWrapper<E> {
        private static final long serialVersionUID = 0;

        C07461(List list) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Lists$2 */
    class C07472<E> extends AbstractListWrapper<E> {
        private static final long serialVersionUID = 0;

        C07472(List list) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
        }
    }

    private static class AbstractListWrapper<E> extends AbstractList<E> {
        final List<E> backingList;

        AbstractListWrapper(List<E> list) {
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, @ParametricNullness E e) {
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E remove(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E set(int i, @ParametricNullness E e) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    private static final class CharSequenceAsList extends AbstractList<Character> {
        private final CharSequence sequence;

        CharSequenceAsList(CharSequence charSequence) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i) {
        }
    }

    private static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final E first;
        final E[] rest;

        OnePlusArrayList(@ParametricNullness E e, E[] eArr) {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    private static class Partition<T> extends AbstractList<List<T>> {
        final List<T> list;
        final int size;

        Partition(List<T> list, int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i) {
        }
    }

    private static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
        RandomAccessListWrapper(List<E> list) {
        }
    }

    private static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        RandomAccessPartition(List<T> list, int i) {
        }
    }

    private static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        RandomAccessReverseList(List<T> list) {
        }
    }

    private static class ReverseList<T> extends AbstractList<T> {
        private final List<T> forwardList;

        /* renamed from: com.google.common.collect.Lists$ReverseList$1 */
        class C07481 implements ListIterator<T> {
            boolean canRemoveOrSet;
            final /* synthetic */ ReverseList this$0;
            final /* synthetic */ ListIterator val$forwardIterator;

            C07481(ReverseList reverseList, ListIterator listIterator) {
            }

            @Override // java.util.ListIterator
            public void add(@ParametricNullness T t) {
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
            }

            @Override // java.util.ListIterator, java.util.Iterator
            @ParametricNullness
            public T next() {
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
            }

            @Override // java.util.ListIterator
            @ParametricNullness
            public T previous() {
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
            }

            @Override // java.util.ListIterator
            public void set(@ParametricNullness T t) {
            }
        }

        ReverseList(List<T> list) {
        }

        static /* synthetic */ int access$000(ReverseList reverseList, int i) {
        }

        private int reverseIndex(int i) {
        }

        private int reversePosition(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, @ParametricNullness T t) {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i) {
        }

        List<T> getForwardList() {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T remove(int i) {
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T set(int i, @ParametricNullness T t) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i, int i2) {
        }
    }

    private static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        StringAsImmutableList(String str) {
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        }

        @Override // java.util.List
        public Character get(int i) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i, int i2) {
        }
    }

    private static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        /* renamed from: com.google.common.collect.Lists$TransformingRandomAccessList$1 */
        class C07491 extends TransformedListIterator<F, T> {
            final /* synthetic */ TransformingRandomAccessList this$0;

            C07491(TransformingRandomAccessList transformingRandomAccessList, ListIterator listIterator) {
            }

            @Override // com.google.common.collect.TransformedIterator
            T transform(F f) {
            }
        }

        TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function) {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    private static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        /* renamed from: com.google.common.collect.Lists$TransformingSequentialList$1 */
        class C07501 extends TransformedListIterator<F, T> {
            final /* synthetic */ TransformingSequentialList this$0;

            C07501(TransformingSequentialList transformingSequentialList, ListIterator listIterator) {
            }

            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            T transform(@ParametricNullness F f) {
            }
        }

        TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function) {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    private static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final E first;
        final E[] rest;

        @ParametricNullness
        final E second;

        TwoPlusArrayList(@ParametricNullness E e, @ParametricNullness E e2, E[] eArr) {
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    private Lists() {
    }

    static <E> boolean addAllImpl(List<E> list, int i, Iterable<? extends E> iterable) {
    }

    public static <E> List<E> asList(@ParametricNullness E e, E[] eArr) {
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
    }

    static <T> List<T> cast(Iterable<T> iterable) {
    }

    public static ImmutableList<Character> charactersOf(String str) {
    }

    @VisibleForTesting
    static int computeArrayListCapacity(int i) {
    }

    static boolean equalsImpl(List<?> list, Object obj) {
    }

    static int hashCodeImpl(List<?> list) {
    }

    static int indexOfImpl(List<?> list, Object obj) {
    }

    private static int indexOfRandomAccess(List<?> list, Object obj) {
    }

    static int lastIndexOfImpl(List<?> list, Object obj) {
    }

    private static int lastIndexOfRandomAccess(List<?> list, Object obj) {
    }

    static <E> ListIterator<E> listIteratorImpl(List<E> list, int i) {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int i) {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i) {
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
    }

    public static <T> List<List<T>> partition(List<T> list, int i) {
    }

    public static <T> List<T> reverse(List<T> list) {
    }

    static <E> List<E> subListImpl(List<E> list, int i, int i2) {
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
    }

    public static <E> List<E> asList(@ParametricNullness E e, @ParametricNullness E e2, E[] eArr) {
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
    }

    @Beta
    public static List<Character> charactersOf(CharSequence charSequence) {
    }

    @SafeVarargs
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... eArr) {
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
    }
}
