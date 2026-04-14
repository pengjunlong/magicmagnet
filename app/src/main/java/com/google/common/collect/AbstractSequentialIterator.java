package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    private T nextOrNull;

    protected AbstractSequentialIterator(T t) {
    }

    protected abstract T computeNext(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
    }

    @Override // java.util.Iterator
    public final T next() {
    }
}
