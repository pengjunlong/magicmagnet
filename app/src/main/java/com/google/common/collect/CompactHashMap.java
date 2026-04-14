package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND = null;

    @VisibleForTesting
    transient int[] entries;
    private transient Set<Map.Entry<K, V>> entrySetView;
    private transient Set<K> keySetView;

    @VisibleForTesting
    transient Object[] keys;
    private transient int metadata;
    private transient int size;
    private transient Object table;

    @VisibleForTesting
    transient Object[] values;
    private transient Collection<V> valuesView;

    /* renamed from: com.google.common.collect.CompactHashMap$1 */
    class C06821 extends CompactHashMap<K, V>.Itr<K> {
        final /* synthetic */ CompactHashMap this$0;

        C06821(CompactHashMap compactHashMap) {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        @ParametricNullness
        K getOutput(int i) {
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$2 */
    class C06832 extends CompactHashMap<K, V>.Itr<Map.Entry<K, V>> {
        final /* synthetic */ CompactHashMap this$0;

        C06832(CompactHashMap compactHashMap) {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        /* bridge */ /* synthetic */ Object getOutput(int i) {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        Map.Entry<K, V> getOutput(int i) {
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$3 */
    class C06843 extends CompactHashMap<K, V>.Itr<V> {
        final /* synthetic */ CompactHashMap this$0;

        C06843(CompactHashMap compactHashMap) {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        @ParametricNullness
        V getOutput(int i) {
        }
    }

    class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        final /* synthetic */ CompactHashMap this$0;

        EntrySetView(CompactHashMap compactHashMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    class KeySetView extends AbstractSet<K> {
        final /* synthetic */ CompactHashMap this$0;

        KeySetView(CompactHashMap compactHashMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    final class MapEntry extends AbstractMapEntry<K, V> {

        @ParametricNullness
        private final K key;
        private int lastKnownIndex;
        final /* synthetic */ CompactHashMap this$0;

        MapEntry(CompactHashMap compactHashMap, int i) {
        }

        private void updateLastKnownIndex() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
        }
    }

    class ValuesView extends AbstractCollection<V> {
        final /* synthetic */ CompactHashMap this$0;

        ValuesView(CompactHashMap compactHashMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    CompactHashMap() {
    }

    static /* synthetic */ int access$000(CompactHashMap compactHashMap) {
    }

    static /* synthetic */ Object access$100(CompactHashMap compactHashMap, int i) {
    }

    static /* synthetic */ Object[] access$1000(CompactHashMap compactHashMap) {
    }

    static /* synthetic */ Object[] access$1100(CompactHashMap compactHashMap) {
    }

    static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
    }

    static /* synthetic */ void access$1300(CompactHashMap compactHashMap, int i, Object obj) {
    }

    static /* synthetic */ Object access$200(CompactHashMap compactHashMap, Object obj) {
    }

    static /* synthetic */ Object access$300() {
    }

    static /* synthetic */ int access$500(CompactHashMap compactHashMap, Object obj) {
    }

    static /* synthetic */ Object access$600(CompactHashMap compactHashMap, int i) {
    }

    static /* synthetic */ int access$700(CompactHashMap compactHashMap) {
    }

    static /* synthetic */ Object access$800(CompactHashMap compactHashMap) {
    }

    static /* synthetic */ int[] access$900(CompactHashMap compactHashMap) {
    }

    public static <K, V> CompactHashMap<K, V> create() {
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
    }

    private int entry(int i) {
    }

    private int hashTableMask() {
    }

    private int indexOf(Object obj) {
    }

    private K key(int i) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private Object removeHelper(Object obj) {
    }

    private int[] requireEntries() {
    }

    private Object[] requireKeys() {
    }

    private Object requireTable() {
    }

    private Object[] requireValues() {
    }

    private void resizeMeMaybe(int i) {
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i, int i2, int i3, int i4) {
    }

    private void setEntry(int i, int i2) {
    }

    private void setHashTableMask(int i) {
    }

    private void setKey(int i, K k) {
    }

    private void setValue(int i, V v) {
    }

    private V value(int i) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    void accessEntry(int i) {
    }

    int adjustAfterRemove(int i, int i2) {
    }

    @CanIgnoreReturnValue
    int allocArrays() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    Map<K, V> convertToHashFloodingResistantImplementation() {
    }

    Set<Map.Entry<K, V>> createEntrySet() {
    }

    Map<K, V> createHashFloodingResistantDelegate(int i) {
    }

    Set<K> createKeySet() {
    }

    Collection<V> createValues() {
    }

    @VisibleForTesting
    Map<K, V> delegateOrNull() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    Iterator<Map.Entry<K, V>> entrySetIterator() {
    }

    int firstEntryIndex() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
    }

    int getSuccessor(int i) {
    }

    void incrementModCount() {
    }

    void init(int i) {
    }

    void insertEntry(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    Iterator<K> keySetIterator() {
    }

    void moveLastEntry(int i, int i2) {
    }

    @VisibleForTesting
    boolean needsAllocArrays() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
    }

    void resizeEntries(int i) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    public void trimToSize() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
    }

    Iterator<V> valuesIterator() {
    }

    CompactHashMap(int i) {
    }

    private abstract class Itr<T> implements Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;
        final /* synthetic */ CompactHashMap this$0;

        private Itr(CompactHashMap compactHashMap) {
        }

        private void checkForConcurrentModification() {
        }

        @ParametricNullness
        abstract T getOutput(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        void incrementExpectedModCount() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        /* synthetic */ Itr(CompactHashMap compactHashMap, C06821 c06821) {
        }
    }
}
