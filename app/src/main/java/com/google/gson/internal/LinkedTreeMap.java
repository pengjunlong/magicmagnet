package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = null;
    Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedTreeMap<K, V>.KeySet keySet;
    int modCount;
    Node<K, V> root;
    int size;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$1 */
    static class C12341 implements Comparator<Comparable> {
        C12341() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Comparable comparable, Comparable comparable2) {
        }
    }

    class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        final /* synthetic */ LinkedTreeMap this$0;

        /* renamed from: com.google.gson.internal.LinkedTreeMap$EntrySet$1 */
        class C12351 extends LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>> {
            final /* synthetic */ EntrySet this$1;

            C12351(EntrySet entrySet) {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
            }
        }

        EntrySet(LinkedTreeMap linkedTreeMap) {
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

    final class KeySet extends AbstractSet<K> {
        final /* synthetic */ LinkedTreeMap this$0;

        /* renamed from: com.google.gson.internal.LinkedTreeMap$KeySet$1 */
        class C12361 extends LinkedTreeMap<K, V>.LinkedTreeMapIterator<K> {
            final /* synthetic */ KeySet this$1;

            C12361(KeySet keySet) {
            }

            @Override // java.util.Iterator
            public K next() {
            }
        }

        KeySet(LinkedTreeMap linkedTreeMap) {
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

    private abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        int expectedModCount;
        Node<K, V> lastReturned;
        Node<K, V> next;
        final /* synthetic */ LinkedTreeMap this$0;

        LinkedTreeMapIterator(LinkedTreeMap linkedTreeMap) {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
        }

        final Node<K, V> nextNode() {
        }

        @Override // java.util.Iterator
        public final void remove() {
        }
    }

    public LinkedTreeMap() {
    }

    private boolean equal(Object obj, Object obj2) {
    }

    private void rebalance(Node<K, V> node, boolean z) {
    }

    private void replaceInParent(Node<K, V> node, Node<K, V> node2) {
    }

    private void rotateLeft(Node<K, V> node) {
    }

    private void rotateRight(Node<K, V> node) {
    }

    private Object writeReplace() throws ObjectStreamException {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    Node<K, V> find(K k, boolean z) {
    }

    Node<K, V> findByEntry(Map.Entry<?, ?> entry) {
    }

    Node<K, V> findByObject(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
    }

    void removeInternal(Node<K, V> node, boolean z) {
    }

    Node<K, V> removeInternalByKey(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
    }

    static final class Node<K, V> implements Map.Entry<K, V> {
        int height;
        final K key;
        Node<K, V> left;
        Node<K, V> next;
        Node<K, V> parent;
        Node<K, V> prev;
        Node<K, V> right;
        V value;

        Node() {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        public Node<K, V> first() {
        }

        @Override // java.util.Map.Entry
        public K getKey() {
        }

        @Override // java.util.Map.Entry
        public V getValue() {
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
        }

        public Node<K, V> last() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        public String toString() {
        }

        Node(Node<K, V> node, K k, Node<K, V> node2, Node<K, V> node3) {
        }
    }
}
