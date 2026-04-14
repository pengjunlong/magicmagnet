package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;

    @VisibleForTesting
    transient Object[] elements;
    private transient int[] entries;
    private transient int metadata;
    private transient int size;
    private transient Object table;

    /* renamed from: com.google.common.collect.CompactHashSet$1 */
    class C06851 implements Iterator<E> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;
        final /* synthetic */ CompactHashSet this$0;

        C06851(CompactHashSet compactHashSet) {
        }

        private void checkForConcurrentModification() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        void incrementExpectedModCount() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public E next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    CompactHashSet() {
    }

    static /* synthetic */ int access$000(CompactHashSet compactHashSet) {
    }

    static /* synthetic */ Object access$100(CompactHashSet compactHashSet, int i) {
    }

    public static <E> CompactHashSet<E> create() {
    }

    private Set<E> createHashFloodingResistantDelegate(int i) {
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i) {
    }

    private E element(int i) {
    }

    private int entry(int i) {
    }

    private int hashTableMask() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private Object[] requireElements() {
    }

    private int[] requireEntries() {
    }

    private Object requireTable() {
    }

    private void resizeMeMaybe(int i) {
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i, int i2, int i3, int i4) {
    }

    private void setElement(int i, E e) {
    }

    private void setEntry(int i, int i2) {
    }

    private void setHashTableMask(int i) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e) {
    }

    int adjustAfterRemove(int i, int i2) {
    }

    @CanIgnoreReturnValue
    int allocArrays() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    Set<E> convertToHashFloodingResistantImplementation() {
    }

    @VisibleForTesting
    Set<E> delegateOrNull() {
    }

    int firstEntryIndex() {
    }

    int getSuccessor(int i) {
    }

    void incrementModCount() {
    }

    void init(int i) {
    }

    void insertEntry(int i, @ParametricNullness E e, int i2, int i3) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
    }

    @VisibleForTesting
    boolean isUsingHashFloodingResistance() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
    }

    void moveLastEntry(int i, int i2) {
    }

    @VisibleForTesting
    boolean needsAllocArrays() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
    }

    void resizeEntries(int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
    }

    public void trimToSize() {
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
    }

    CompactHashSet(int i) {
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
    }
}
