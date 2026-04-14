package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$1 */
    class C06871 extends ForwardingSet<E> {
        final /* synthetic */ Set val$delegate;

        C06871(ConcurrentHashMultiset concurrentHashMultiset, Set set) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        protected Set<E> delegate() {
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$2 */
    class C06882 extends AbstractIterator<Multiset.Entry<E>> {
        private final Iterator<Map.Entry<E, AtomicInteger>> mapEntries;
        final /* synthetic */ ConcurrentHashMultiset this$0;

        C06882(ConcurrentHashMultiset concurrentHashMultiset) {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected /* bridge */ /* synthetic */ Object computeNext() {
        }

        @Override // com.google.common.collect.AbstractIterator
        protected Multiset.Entry<E> computeNext() {
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$3 */
    class C06893 extends ForwardingIterator<Multiset.Entry<E>> {
        private Multiset.Entry<E> last;
        final /* synthetic */ ConcurrentHashMultiset this$0;
        final /* synthetic */ Iterator val$readOnlyIterator;

        C06893(ConcurrentHashMultiset concurrentHashMultiset, Iterator it) {
        }

        @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public void remove() {
        }

        @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
        protected Iterator<Multiset.Entry<E>> delegate() {
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public Multiset.Entry<E> next() {
        }
    }

    private class EntrySet extends AbstractMultiset<E>.EntrySet {
        final /* synthetic */ ConcurrentHashMultiset this$0;

        private EntrySet(ConcurrentHashMultiset concurrentHashMultiset) {
        }

        private List<Multiset.Entry<E>> snapshot() {
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        /* bridge */ /* synthetic */ Multiset multiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        /* synthetic */ EntrySet(ConcurrentHashMultiset concurrentHashMultiset, C06871 c06871) {
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        ConcurrentHashMultiset<E> multiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }
    }

    private static class FieldSettersHolder {
        static final Serialization.FieldSetter<ConcurrentHashMultiset> COUNT_MAP_FIELD_SETTER = null;

        private FieldSettersHolder() {
        }
    }

    @VisibleForTesting
    ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
    }

    static /* synthetic */ ConcurrentMap access$100(ConcurrentHashMultiset concurrentHashMultiset) {
    }

    public static <E> ConcurrentHashMultiset<E> create() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private List<E> snapshot() {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e, int i) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultiset
    Set<E> createElementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    @Deprecated
    public Set<Multiset.Entry<E>> createEntrySet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<E> elementIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator<Multiset.Entry<E>> entryIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i) {
    }

    @CanIgnoreReturnValue
    public boolean removeExactly(Object obj, int i) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e, int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
    }

    @Beta
    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(E e, int i, int i2) {
    }
}
