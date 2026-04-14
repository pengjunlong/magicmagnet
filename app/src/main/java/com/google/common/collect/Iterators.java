package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Iterators {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$1 */
    class C07321<T> extends UnmodifiableIterator<T> {
        final /* synthetic */ Iterator val$iterator;

        C07321(Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$10, reason: invalid class name */
    class AnonymousClass10<T> extends UnmodifiableIterator<T> {
        final /* synthetic */ Enumeration val$enumeration;

        AnonymousClass10(Enumeration enumeration) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$11, reason: invalid class name */
    class AnonymousClass11<T> implements Enumeration<T> {
        final /* synthetic */ Iterator val$iterator;

        AnonymousClass11(Iterator it) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
        }

        @Override // java.util.Enumeration
        @ParametricNullness
        public T nextElement() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$2 */
    class C07332<T> implements Iterator<T> {
        Iterator<T> iterator;
        final /* synthetic */ Iterable val$iterable;

        C07332(Iterable iterable) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: com.google.common.collect.Iterators$3 */
    class C07343<I> extends UnmodifiableIterator<I> {
        int index;
        final /* synthetic */ Iterator[] val$elements;

        C07343(Iterator[] itArr) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        /* JADX WARN: Incorrect return type in method signature: ()TI; */
        @Override // java.util.Iterator
        public Iterator next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$4 */
    class C07354<T> extends UnmodifiableIterator<List<T>> {
        final /* synthetic */ Iterator val$iterator;
        final /* synthetic */ boolean val$pad;
        final /* synthetic */ int val$size;

        C07354(Iterator it, int i, boolean z) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public List<T> next() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$5 */
    class C07365<T> extends AbstractIterator<T> {
        final /* synthetic */ Predicate val$retainIfTrue;
        final /* synthetic */ Iterator val$unfiltered;

        C07365(Iterator it, Predicate predicate) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected T computeNext() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* renamed from: com.google.common.collect.Iterators$6 */
    class C07376<F, T> extends TransformedIterator<F, T> {
        final /* synthetic */ Function val$function;

        C07376(Iterator it, Function function) {
        }

        @Override // com.google.common.collect.TransformedIterator
        @ParametricNullness
        T transform(@ParametricNullness F f) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$7 */
    class C07387<T> implements Iterator<T> {
        private int count;
        final /* synthetic */ Iterator val$iterator;
        final /* synthetic */ int val$limitSize;

        C07387(int i, Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$8 */
    class C07398<T> extends UnmodifiableIterator<T> {
        final /* synthetic */ Iterator val$iterator;

        C07398(Iterator it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }

        public String toString() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterators$9 */
    class C07409<T> extends UnmodifiableIterator<T> {
        boolean done;
        final /* synthetic */ Object val$value;

        C07409(Object obj) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }
    }

    private static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        static final UnmodifiableListIterator<Object> EMPTY = null;
        private final T[] array;
        private final int offset;

        ArrayItr(T[] tArr, int i, int i2, int i3) {
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        @ParametricNullness
        protected T get(int i) {
        }
    }

    private static class ConcatenatedIterator<T> implements Iterator<T> {
        private Iterator<? extends T> iterator;
        private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;
        private Iterator<? extends T> toRemove;
        private Iterator<? extends Iterator<? extends T>> topMetaIterator;

        ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it) {
        }

        private Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class EmptyModifiableIterator implements Iterator<Object> {
        private static final /* synthetic */ EmptyModifiableIterator[] $VALUES = null;
        public static final EmptyModifiableIterator INSTANCE = null;

        private static /* synthetic */ EmptyModifiableIterator[] $values() {
        }

        private EmptyModifiableIterator(String str, int i) {
        }

        public static EmptyModifiableIterator valueOf(String str) {
        }

        public static EmptyModifiableIterator[] values() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    private static class MergingIterator<T> extends UnmodifiableIterator<T> {
        final Queue<PeekingIterator<T>> queue;

        /* renamed from: com.google.common.collect.Iterators$MergingIterator$1 */
        class C07411 implements Comparator<PeekingIterator<T>> {
            final /* synthetic */ Comparator val$itemComparator;

            C07411(MergingIterator mergingIterator, Comparator comparator) {
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            }

            public int compare(PeekingIterator<T> peekingIterator, PeekingIterator<T> peekingIterator2) {
            }
        }

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }
    }

    private static class PeekingImpl<E> implements PeekingIterator<E> {
        private boolean hasPeeked;
        private final Iterator<? extends E> iterator;
        private E peekedElement;

        public PeekingImpl(Iterator<? extends E> it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
        }

        @Override // com.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
        }
    }

    private Iterators() {
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> it, int i) {
    }

    public static <T> boolean all(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> boolean any(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> it) {
    }

    static <T> ListIterator<T> cast(Iterator<T> it) {
    }

    static void checkNonnegative(int i) {
    }

    static void clear(Iterator<?> it) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
    }

    static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... itArr) {
    }

    private static <I extends Iterator<?>> Iterator<I> consumingForArray(I... iArr) {
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> it) {
    }

    public static boolean contains(Iterator<?> it, Object obj) {
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
    }

    public static boolean elementsEqual(Iterator<?> it, Iterator<?> it2) {
    }

    static <T> UnmodifiableIterator<T> emptyIterator() {
    }

    static <T> UnmodifiableListIterator<T> emptyListIterator() {
    }

    static <T> Iterator<T> emptyModifiableIterator() {
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator<T> it, Predicate<? super T> predicate) {
    }

    @ParametricNullness
    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate) {
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(Enumeration<T> enumeration) {
    }

    public static int frequency(Iterator<?> it, Object obj) {
    }

    @ParametricNullness
    public static <T> T get(Iterator<T> it, int i) {
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<T> it) {
    }

    @ParametricNullness
    public static <T> T getNext(Iterator<? extends T> it, @ParametricNullness T t) {
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<T> it) {
    }

    public static <T> int indexOf(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> Iterator<T> limit(Iterator<T> it, int i) {
    }

    @Beta
    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it, int i) {
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it, int i) {
    }

    private static <T> UnmodifiableIterator<List<T>> partitionImpl(Iterator<T> it, int i, boolean z) {
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it) {
    }

    static <T> T pollNext(Iterator<T> it) {
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> it, Predicate<? super T> predicate) {
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@ParametricNullness T t) {
    }

    public static int size(Iterator<?> it) {
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
    }

    public static String toString(Iterator<?> it) {
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, Function<? super F, ? extends T> function) {
    }

    public static <T> Optional<T> tryFind(Iterator<T> it, Predicate<? super T> predicate) {
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(Iterator<? extends T> it) {
    }

    static <T> UnmodifiableListIterator<T> forArray(T[] tArr, int i, int i2, int i3) {
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<? extends T> it, @ParametricNullness T t) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it, Class<T> cls) {
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
    }

    @ParametricNullness
    public static <T> T get(Iterator<? extends T> it, int i, @ParametricNullness T t) {
    }

    public static <T> T find(Iterator<? extends T> it, Predicate<? super T> predicate, T t) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<? extends T> it, @ParametricNullness T t) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
    }
}
