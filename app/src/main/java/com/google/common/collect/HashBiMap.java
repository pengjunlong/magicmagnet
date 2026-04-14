package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @RetainedWith
    @LazyInit
    private transient BiMap<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;

        @ParametricNullness
        final K key;
        final /* synthetic */ HashBiMap this$0;

        EntryForKey(HashBiMap hashBiMap, int i) {
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

        void updateIndex() {
        }
    }

    static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;

        @ParametricNullness
        final V value;

        EntryForValue(HashBiMap<K, V> hashBiMap, int i) {
        }

        private void updateIndex() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k) {
        }
    }

    final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        final /* synthetic */ HashBiMap this$0;

        EntrySet(HashBiMap hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        /* bridge */ /* synthetic */ Object forEntry(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        Map.Entry<K, V> forEntry(int i) {
        }
    }

    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        Inverse(HashBiMap<K, V> hashBiMap) {
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
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

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K forcePut(@ParametricNullness V v, @ParametricNullness K k) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K put(@ParametricNullness V v, @ParametricNullness K k) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        public K remove(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
        }
    }

    static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        InverseEntrySet(HashBiMap<K, V> hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        /* bridge */ /* synthetic */ Object forEntry(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        Map.Entry<V, K> forEntry(int i) {
        }
    }

    final class KeySet extends View<K, V, K> {
        final /* synthetic */ HashBiMap this$0;

        KeySet(HashBiMap hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        K forEntry(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }
    }

    final class ValueSet extends View<K, V, V> {
        final /* synthetic */ HashBiMap this$0;

        ValueSet(HashBiMap hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        V forEntry(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }
    }

    static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        /* renamed from: com.google.common.collect.HashBiMap$View$1 */
        class C07031 implements Iterator<T> {
            private int expectedModCount;
            private int index;
            private int indexToRemove;
            private int remaining;
            final /* synthetic */ View this$0;

            C07031(View view) {
            }

            private void checkForComodification() {
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

        View(HashBiMap<K, V> hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @ParametricNullness
        abstract T forEntry(int i);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    private HashBiMap(int i) {
    }

    static /* synthetic */ int access$000(HashBiMap hashBiMap) {
    }

    static /* synthetic */ int[] access$100(HashBiMap hashBiMap) {
    }

    static /* synthetic */ void access$200(HashBiMap hashBiMap, int i, Object obj, boolean z) {
    }

    static /* synthetic */ BiMap access$302(HashBiMap hashBiMap, BiMap biMap) {
    }

    static /* synthetic */ void access$400(HashBiMap hashBiMap, int i, Object obj, boolean z) {
    }

    private int bucket(int i) {
    }

    public static <K, V> HashBiMap<K, V> create() {
    }

    private static int[] createFilledWithAbsent(int i) {
    }

    private void deleteFromTableKToV(int i, int i2) {
    }

    private void deleteFromTableVToK(int i, int i2) {
    }

    private void ensureCapacity(int i) {
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i) {
    }

    private void insertIntoTableKToV(int i, int i2) {
    }

    private void insertIntoTableVToK(int i, int i2) {
    }

    private void moveEntryToIndex(int i, int i2) {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void replaceKeyInEntry(int i, @ParametricNullness K k, boolean z) {
    }

    private void replaceValueInEntry(int i, @ParametricNullness V v, boolean z) {
    }

    private void setSucceeds(int i, int i2) {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
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

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
    }

    int findEntryByKey(Object obj) {
    }

    int findEntryByValue(Object obj) {
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
    }

    K getInverse(Object obj) {
    }

    void init(int i) {
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
    }

    @CanIgnoreReturnValue
    K putInverse(@ParametricNullness V v, @ParametricNullness K k, boolean z) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
    }

    void removeEntry(int i) {
    }

    void removeEntryKeyHashKnown(int i, int i2) {
    }

    void removeEntryValueHashKnown(int i, int i2) {
    }

    K removeInverse(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ Collection values() {
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
    }

    private void removeEntry(int i, int i2, int i3) {
    }

    int findEntryByKey(Object obj, int i) {
    }

    int findEntryByValue(Object obj, int i) {
    }

    V put(@ParametricNullness K k, @ParametricNullness V v, boolean z) {
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
    }
}
