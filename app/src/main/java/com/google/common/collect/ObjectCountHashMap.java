package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;

    @VisibleForTesting
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    class MapEntry extends Multisets.AbstractEntry<K> {

        @ParametricNullness
        final K key;
        int lastKnownIndex;
        final /* synthetic */ ObjectCountHashMap this$0;

        MapEntry(ObjectCountHashMap objectCountHashMap, int i) {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
        }

        @CanIgnoreReturnValue
        public int setCount(int i) {
        }

        void updateLastKnownIndex() {
        }
    }

    ObjectCountHashMap() {
    }

    static <K> ObjectCountHashMap<K> create() {
    }

    static <K> ObjectCountHashMap<K> createWithExpectedSize(int i) {
    }

    private static int getHash(long j) {
    }

    private static int getNext(long j) {
    }

    private int hashTableMask() {
    }

    private static long[] newEntries(int i) {
    }

    private static int[] newTable(int i) {
    }

    private void resizeMeMaybe(int i) {
    }

    private void resizeTable(int i) {
    }

    private static long swapNext(long j, int i) {
    }

    public void clear() {
    }

    public boolean containsKey(Object obj) {
    }

    void ensureCapacity(int i) {
    }

    int firstIndex() {
    }

    public int get(Object obj) {
    }

    Multiset.Entry<K> getEntry(int i) {
    }

    @ParametricNullness
    K getKey(int i) {
    }

    int getValue(int i) {
    }

    int indexOf(Object obj) {
    }

    void init(int i, float f) {
    }

    void insertEntry(int i, @ParametricNullness K k, int i2, int i3) {
    }

    void moveLastEntry(int i) {
    }

    int nextIndex(int i) {
    }

    int nextIndexAfterRemove(int i, int i2) {
    }

    @CanIgnoreReturnValue
    public int put(@ParametricNullness K k, int i) {
    }

    @CanIgnoreReturnValue
    public int remove(Object obj) {
    }

    @CanIgnoreReturnValue
    int removeEntry(int i) {
    }

    void resizeEntries(int i) {
    }

    void setValue(int i, int i2) {
    }

    int size() {
    }

    private int remove(Object obj, int i) {
    }

    ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
    }

    ObjectCountHashMap(int i) {
    }

    ObjectCountHashMap(int i, float f) {
    }
}
