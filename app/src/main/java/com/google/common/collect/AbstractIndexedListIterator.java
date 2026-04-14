package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {
    private int position;
    private final int size;

    protected AbstractIndexedListIterator(int i) {
    }

    @ParametricNullness
    protected abstract E get(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @ParametricNullness
    public final E next() {
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final E previous() {
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
    }

    protected AbstractIndexedListIterator(int i, int i2) {
    }
}
