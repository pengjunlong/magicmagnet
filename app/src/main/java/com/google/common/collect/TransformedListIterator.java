package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
    TransformedListIterator(ListIterator<? extends F> listIterator) {
    }

    private ListIterator<? extends F> backingIterator() {
    }

    @Override // java.util.ListIterator
    public void add(@ParametricNullness T t) {
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final T previous() {
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
    }

    public void set(@ParametricNullness T t) {
    }
}
