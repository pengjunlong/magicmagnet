package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    transient ObjectCountHashMap<E> backingMap;
    transient long size;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$1 */
    class C06721 extends AbstractMapBasedMultiset<E>.Itr<E> {
        final /* synthetic */ AbstractMapBasedMultiset this$0;

        C06721(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
        @ParametricNullness
        E result(int i) {
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$2 */
    class C06732 extends AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>> {
        final /* synthetic */ AbstractMapBasedMultiset this$0;

        C06732(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
        /* bridge */ /* synthetic */ Object result(int i) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
        Multiset.Entry<E> result(int i) {
        }
    }

    abstract class Itr<T> implements Iterator<T> {
        int entryIndex;
        int expectedModCount;
        final /* synthetic */ AbstractMapBasedMultiset this$0;
        int toRemove;

        Itr(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        }

        private void checkForConcurrentModification() {
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

        @ParametricNullness
        abstract T result(int i);
    }

    AbstractMapBasedMultiset(int i) {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@ParametricNullness E e, int i) {
    }

    void addTo(Multiset<? super E> multiset) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // com.google.common.collect.Multiset
    public final int count(Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultiset
    final int distinctElements() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    final Iterator<E> elementIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    final Iterator<Multiset.Entry<E>> entryIterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
    }

    abstract ObjectCountHashMap<E> newBackingMap(int i);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(Object obj, int i) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@ParametricNullness E e, int i) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E e, int i, int i2) {
    }
}
