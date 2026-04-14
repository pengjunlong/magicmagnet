package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 1;
    private final transient AvlNode<E> header;
    private final transient GeneralRange<E> range;
    private final transient Reference<AvlNode<E>> rootReference;

    /* renamed from: com.google.common.collect.TreeMultiset$1 */
    class C08361 extends Multisets.AbstractEntry<E> {
        final /* synthetic */ TreeMultiset this$0;
        final /* synthetic */ AvlNode val$baseEntry;

        C08361(TreeMultiset treeMultiset, AvlNode avlNode) {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public E getElement() {
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$2 */
    class C08372 implements Iterator<Multiset.Entry<E>> {
        AvlNode<E> current;
        Multiset.Entry<E> prevEntry;
        final /* synthetic */ TreeMultiset this$0;

        C08372(TreeMultiset treeMultiset) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        public Multiset.Entry<E> next() {
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$3 */
    class C08383 implements Iterator<Multiset.Entry<E>> {
        AvlNode<E> current;
        Multiset.Entry<E> prevEntry;
        final /* synthetic */ TreeMultiset this$0;

        C08383(TreeMultiset treeMultiset) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        public Multiset.Entry<E> next() {
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$4 */
    static /* synthetic */ class C08394 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static abstract class Aggregate {
        private static final /* synthetic */ Aggregate[] $VALUES = null;
        public static final Aggregate DISTINCT = null;
        public static final Aggregate SIZE = null;

        /* renamed from: com.google.common.collect.TreeMultiset$Aggregate$1 */
        enum C08401 extends Aggregate {
            C08401(String str, int i) {
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int nodeAggregate(AvlNode<?> avlNode) {
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long treeAggregate(AvlNode<?> avlNode) {
            }
        }

        /* renamed from: com.google.common.collect.TreeMultiset$Aggregate$2 */
        enum C08412 extends Aggregate {
            C08412(String str, int i) {
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int nodeAggregate(AvlNode<?> avlNode) {
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long treeAggregate(AvlNode<?> avlNode) {
            }
        }

        private static /* synthetic */ Aggregate[] $values() {
        }

        private Aggregate(String str, int i) {
        }

        public static Aggregate valueOf(String str) {
        }

        public static Aggregate[] values() {
        }

        abstract int nodeAggregate(AvlNode<?> avlNode);

        abstract long treeAggregate(AvlNode<?> avlNode);

        /* synthetic */ Aggregate(String str, int i, C08361 c08361) {
        }
    }

    private static final class Reference<T> {
        private T value;

        private Reference() {
        }

        public void checkAndSet(T t, T t2) {
        }

        void clear() {
        }

        public T get() {
        }

        /* synthetic */ Reference(C08361 c08361) {
        }
    }

    TreeMultiset(Reference<AvlNode<E>> reference, GeneralRange<E> generalRange, AvlNode<E> avlNode) {
    }

    static /* synthetic */ AvlNode access$1300(TreeMultiset treeMultiset) {
    }

    static /* synthetic */ GeneralRange access$1400(TreeMultiset treeMultiset) {
    }

    static /* synthetic */ Multiset.Entry access$1500(TreeMultiset treeMultiset, AvlNode avlNode) {
    }

    static /* synthetic */ AvlNode access$1600(TreeMultiset treeMultiset) {
    }

    static /* synthetic */ AvlNode access$1700(TreeMultiset treeMultiset) {
    }

    static /* synthetic */ void access$1800(AvlNode avlNode, AvlNode avlNode2, AvlNode avlNode3) {
    }

    static /* synthetic */ void access$1900(AvlNode avlNode, AvlNode avlNode2) {
    }

    private long aggregateAboveRange(Aggregate aggregate, AvlNode<E> avlNode) {
    }

    private long aggregateBelowRange(Aggregate aggregate, AvlNode<E> avlNode) {
    }

    private long aggregateForEntries(Aggregate aggregate) {
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
    }

    private AvlNode<E> firstNode() {
    }

    private AvlNode<E> lastNode() {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private static <T> void successor(AvlNode<T> avlNode, AvlNode<T> avlNode2) {
    }

    private Multiset.Entry<E> wrapEntry(AvlNode<E> avlNode) {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(@ParametricNullness E e, int i) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Comparator comparator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    Iterator<Multiset.Entry<E>> descendingEntryIterator() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<E> elementIterator() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<Multiset.Entry<E>> entryIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@ParametricNullness E e, BoundType boundType) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E e, int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(@ParametricNullness Object obj, BoundType boundType, @ParametricNullness Object obj2, BoundType boundType2) {
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@ParametricNullness E e, BoundType boundType) {
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
    }

    static int distinctElements(AvlNode<?> avlNode) {
    }

    private static <T> void successor(AvlNode<T> avlNode, AvlNode<T> avlNode2, AvlNode<T> avlNode3) {
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
    }

    TreeMultiset(Comparator<? super E> comparator) {
    }

    private static final class AvlNode<E> {
        private int distinctElements;
        private final E elem;
        private int elemCount;
        private int height;
        private AvlNode<E> left;
        private AvlNode<E> pred;
        private AvlNode<E> right;
        private AvlNode<E> succ;
        private long totalCount;

        AvlNode(@ParametricNullness E e, int i) {
        }

        static /* synthetic */ AvlNode access$1000(AvlNode avlNode, Comparator comparator, Object obj) {
        }

        static /* synthetic */ AvlNode access$1100(AvlNode avlNode, Comparator comparator, Object obj) {
        }

        static /* synthetic */ AvlNode access$1200(AvlNode avlNode) {
        }

        static /* synthetic */ int access$200(AvlNode avlNode) {
        }

        static /* synthetic */ int access$202(AvlNode avlNode, int i) {
        }

        static /* synthetic */ long access$300(AvlNode avlNode) {
        }

        static /* synthetic */ int access$400(AvlNode avlNode) {
        }

        static /* synthetic */ AvlNode access$500(AvlNode avlNode) {
        }

        static /* synthetic */ AvlNode access$502(AvlNode avlNode, AvlNode avlNode2) {
        }

        static /* synthetic */ AvlNode access$600(AvlNode avlNode) {
        }

        static /* synthetic */ AvlNode access$602(AvlNode avlNode, AvlNode avlNode2) {
        }

        static /* synthetic */ AvlNode access$700(AvlNode avlNode) {
        }

        static /* synthetic */ AvlNode access$802(AvlNode avlNode, AvlNode avlNode2) {
        }

        static /* synthetic */ AvlNode access$902(AvlNode avlNode, AvlNode avlNode2) {
        }

        private AvlNode<E> addLeftChild(@ParametricNullness E e, int i) {
        }

        private AvlNode<E> addRightChild(@ParametricNullness E e, int i) {
        }

        private int balanceFactor() {
        }

        private AvlNode<E> ceiling(Comparator<? super E> comparator, @ParametricNullness E e) {
        }

        private AvlNode<E> deleteMe() {
        }

        private AvlNode<E> floor(Comparator<? super E> comparator, @ParametricNullness E e) {
        }

        private static int height(AvlNode<?> avlNode) {
        }

        private AvlNode<E> pred() {
        }

        private AvlNode<E> rebalance() {
        }

        private void recompute() {
        }

        private void recomputeHeight() {
        }

        private void recomputeMultiset() {
        }

        private AvlNode<E> removeMax(AvlNode<E> avlNode) {
        }

        private AvlNode<E> removeMin(AvlNode<E> avlNode) {
        }

        private AvlNode<E> rotateLeft() {
        }

        private AvlNode<E> rotateRight() {
        }

        private AvlNode<E> succ() {
        }

        private static long totalCount(AvlNode<?> avlNode) {
        }

        AvlNode<E> add(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
        }

        int count(Comparator<? super E> comparator, @ParametricNullness E e) {
        }

        int getCount() {
        }

        @ParametricNullness
        E getElement() {
        }

        AvlNode<E> remove(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
        }

        AvlNode<E> setCount(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
        }

        public String toString() {
        }

        AvlNode() {
        }

        AvlNode<E> setCount(Comparator<? super E> comparator, @ParametricNullness E e, int i, int i2, int[] iArr) {
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E e, int i, int i2) {
    }
}
