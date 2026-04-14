package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final MinMaxPriorityQueue<E>.Heap maxHeap;

    @VisibleForTesting
    final int maximumSize;
    private final MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private Object[] queue;
    private int size;

    @Beta
    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        /* synthetic */ Builder(Comparator comparator, C07691 c07691) {
        }

        static /* synthetic */ Ordering access$200(Builder builder) {
        }

        static /* synthetic */ int access$300(Builder builder) {
        }

        private <T extends B> Ordering<T> ordering() {
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i) {
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i) {
        }

        private Builder(Comparator<B> comparator) {
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
        }
    }

    private class Heap {
        final Ordering<E> ordering;

        @Weak
        MinMaxPriorityQueue<E>.Heap otherHeap;
        final /* synthetic */ MinMaxPriorityQueue this$0;

        Heap(MinMaxPriorityQueue minMaxPriorityQueue, Ordering<E> ordering) {
        }

        static /* synthetic */ boolean access$400(Heap heap, int i) {
        }

        private int getGrandparentIndex(int i) {
        }

        private int getLeftChildIndex(int i) {
        }

        private int getParentIndex(int i) {
        }

        private int getRightChildIndex(int i) {
        }

        private boolean verifyIndex(int i) {
        }

        void bubbleUp(int i, E e) {
        }

        @CanIgnoreReturnValue
        int bubbleUpAlternatingLevels(int i, E e) {
        }

        int compareElements(int i, int i2) {
        }

        int crossOver(int i, E e) {
        }

        int crossOverUp(int i, E e) {
        }

        int fillHoleAt(int i) {
        }

        int findMin(int i, int i2) {
        }

        int findMinChild(int i) {
        }

        int findMinGrandChild(int i) {
        }

        int swapWithConceptuallyLastElement(E e) {
        }

        MoveDesc<E> tryCrossOverAndBubbleUp(int i, int i2, E e) {
        }
    }

    static class MoveDesc<E> {
        final E replaced;
        final E toTrickle;

        MoveDesc(E e, E e2) {
        }
    }

    /* synthetic */ MinMaxPriorityQueue(Builder builder, int i, C07691 c07691) {
    }

    static /* synthetic */ Object[] access$500(MinMaxPriorityQueue minMaxPriorityQueue) {
    }

    static /* synthetic */ int access$600(MinMaxPriorityQueue minMaxPriorityQueue) {
    }

    static /* synthetic */ int access$700(MinMaxPriorityQueue minMaxPriorityQueue) {
    }

    private int calculateNewCapacity() {
    }

    private static int capAtMaximumSize(int i, int i2) {
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
    }

    public static Builder<Comparable> expectedSize(int i) {
    }

    private MoveDesc<E> fillHole(int i, E e) {
    }

    private int getMaxElementIndex() {
    }

    private void growIfNeeded() {
    }

    private MinMaxPriorityQueue<E>.Heap heapForIndex(int i) {
    }

    @VisibleForTesting
    static int initialQueueSize(int i, int i2, Iterable<?> iterable) {
    }

    @VisibleForTesting
    static boolean isEvenLevel(int i) {
    }

    public static Builder<Comparable> maximumSize(int i) {
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
    }

    private E removeAndGet(int i) {
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e) {
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
    }

    @VisibleForTesting
    int capacity() {
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    public Comparator<? super E> comparator() {
    }

    E elementData(int i) {
    }

    @VisibleForTesting
    boolean isIntact() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e) {
    }

    @Override // java.util.Queue
    public E peek() {
    }

    public E peekFirst() {
    }

    public E peekLast() {
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
    }

    @CanIgnoreReturnValue
    public E pollLast() {
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    MoveDesc<E> removeAt(int i) {
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
    }

    @CanIgnoreReturnValue
    public E removeLast() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i) {
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
    }

    private class QueueIterator implements Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;
        private Queue<E> forgetMeNot;
        private E lastFromForgetMeNot;
        private int nextCursor;
        private List<E> skipMe;
        final /* synthetic */ MinMaxPriorityQueue this$0;

        private QueueIterator(MinMaxPriorityQueue minMaxPriorityQueue) {
        }

        private void checkModCount() {
        }

        private boolean foundAndRemovedExactReference(Iterable<E> iterable, E e) {
        }

        private void nextNotInSkipMe(int i) {
        }

        private boolean removeExact(Object obj) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public E next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        /* synthetic */ QueueIterator(MinMaxPriorityQueue minMaxPriorityQueue, C07691 c07691) {
        }
    }
}
