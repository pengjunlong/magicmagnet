package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient Node<K, V> head;
    private transient Map<K, KeyList<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;
    private transient Node<K, V> tail;

    /* renamed from: com.google.common.collect.LinkedListMultimap$1 */
    class C07441 extends AbstractSequentialList<V> {
        final /* synthetic */ LinkedListMultimap this$0;
        final /* synthetic */ Object val$key;

        C07441(LinkedListMultimap linkedListMultimap, Object obj) {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$1EntriesImpl, reason: invalid class name */
    class C1EntriesImpl extends AbstractSequentialList<Map.Entry<K, V>> {
        final /* synthetic */ LinkedListMultimap this$0;

        C1EntriesImpl(LinkedListMultimap linkedListMultimap) {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$1KeySetImpl, reason: invalid class name */
    class C1KeySetImpl extends Sets.ImprovedAbstractSet<K> {
        final /* synthetic */ LinkedListMultimap this$0;

        C1KeySetImpl(LinkedListMultimap linkedListMultimap) {
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

    /* renamed from: com.google.common.collect.LinkedListMultimap$1ValuesImpl, reason: invalid class name */
    class C1ValuesImpl extends AbstractSequentialList<V> {
        final /* synthetic */ LinkedListMultimap this$0;

        /* renamed from: com.google.common.collect.LinkedListMultimap$1ValuesImpl$1 */
        class C07451 extends TransformedListIterator<Map.Entry<K, V>, V> {
            final /* synthetic */ NodeIterator val$nodeItr;

            C07451(C1ValuesImpl c1ValuesImpl, ListIterator listIterator, NodeIterator nodeIterator) {
            }

            @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
            public void set(@ParametricNullness V v) {
            }

            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* bridge */ /* synthetic */ Object transform(Object obj) {
            }

            @ParametricNullness
            V transform(Map.Entry<K, V> entry) {
            }
        }

        C1ValuesImpl(LinkedListMultimap linkedListMultimap) {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    private static class KeyList<K, V> {
        int count;
        Node<K, V> head;
        Node<K, V> tail;

        KeyList(Node<K, V> node) {
        }
    }

    private static final class Node<K, V> extends AbstractMapEntry<K, V> {

        @ParametricNullness
        final K key;
        Node<K, V> next;
        Node<K, V> nextSibling;
        Node<K, V> previous;
        Node<K, V> previousSibling;

        @ParametricNullness
        V value;

        Node(@ParametricNullness K k, @ParametricNullness V v) {
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

    private class NodeIterator implements ListIterator<Map.Entry<K, V>> {
        Node<K, V> current;
        int expectedModCount;
        Node<K, V> next;
        int nextIndex;
        Node<K, V> previous;
        final /* synthetic */ LinkedListMultimap this$0;

        NodeIterator(LinkedListMultimap linkedListMultimap, int i) {
        }

        private void checkForConcurrentModification() {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ Object previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
        }

        void setValue(@ParametricNullness V v) {
        }

        public void add(Map.Entry<K, V> entry) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public Node<K, V> next() {
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public Node<K, V> previous() {
        }

        public void set(Map.Entry<K, V> entry) {
        }
    }

    LinkedListMultimap() {
    }

    static /* synthetic */ int access$000(LinkedListMultimap linkedListMultimap) {
    }

    static /* synthetic */ Node access$100(LinkedListMultimap linkedListMultimap) {
    }

    static /* synthetic */ Node access$200(LinkedListMultimap linkedListMultimap) {
    }

    static /* synthetic */ void access$300(LinkedListMultimap linkedListMultimap, Node node) {
    }

    static /* synthetic */ void access$400(LinkedListMultimap linkedListMultimap, Object obj) {
    }

    static /* synthetic */ Map access$500(LinkedListMultimap linkedListMultimap) {
    }

    static /* synthetic */ Node access$600(LinkedListMultimap linkedListMultimap, Object obj, Object obj2, Node node) {
    }

    static /* synthetic */ int access$800(LinkedListMultimap linkedListMultimap) {
    }

    @CanIgnoreReturnValue
    private Node<K, V> addNode(@ParametricNullness K k, @ParametricNullness V v, Node<K, V> node) {
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
    }

    private List<V> getCopy(@ParametricNullness K k) {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void removeAllNodes(@ParametricNullness K k) {
    }

    private void removeNode(Node<K, V> node) {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map<K, Collection<V>> createAsMap() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* bridge */ /* synthetic */ Collection createEntries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set<K> createKeySet() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Multiset<K> createKeys() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* bridge */ /* synthetic */ Collection createValues() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection entries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator<Map.Entry<K, V>> entryIterator() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection get(@ParametricNullness Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Set keySet() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection removeAll(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection values() {
    }

    private LinkedListMultimap(int i) {
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    List<Map.Entry<K, V>> createEntries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    List<V> createValues() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public List<Map.Entry<K, V>> entries() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> get(@ParametricNullness K k) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@ParametricNullness Object obj, Iterable iterable) {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public List<V> values() {
    }

    public static <K, V> LinkedListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
    }

    private class DistinctKeyIterator implements Iterator<K> {
        Node<K, V> current;
        int expectedModCount;
        Node<K, V> next;
        final Set<K> seenKeys;
        final /* synthetic */ LinkedListMultimap this$0;

        private DistinctKeyIterator(LinkedListMultimap linkedListMultimap) {
        }

        private void checkForConcurrentModification() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public K next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        /* synthetic */ DistinctKeyIterator(LinkedListMultimap linkedListMultimap, C07441 c07441) {
        }
    }

    private class ValueForKeyIterator implements ListIterator<V> {
        Node<K, V> current;

        @ParametricNullness
        final K key;
        Node<K, V> next;
        int nextIndex;
        Node<K, V> previous;
        final /* synthetic */ LinkedListMultimap this$0;

        ValueForKeyIterator(@ParametricNullness LinkedListMultimap linkedListMultimap, K k) {
        }

        @Override // java.util.ListIterator
        public void add(@ParametricNullness V v) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public V next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public V previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public void set(@ParametricNullness V v) {
        }

        public ValueForKeyIterator(@ParametricNullness LinkedListMultimap linkedListMultimap, K k, int i) {
        }
    }

    private LinkedListMultimap(Multimap<? extends K, ? extends V> multimap) {
    }
}
