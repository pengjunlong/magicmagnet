package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    protected ForwardingQueue() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract Queue<E> delegate();

    @Override // java.util.Queue
    @ParametricNullness
    public E element() {
    }

    @CanIgnoreReturnValue
    public boolean offer(@ParametricNullness E e) {
    }

    @Override // java.util.Queue
    public E peek() {
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
    }

    @Override // java.util.Queue
    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove() {
    }

    protected boolean standardOffer(@ParametricNullness E e) {
    }

    protected E standardPeek() {
    }

    protected E standardPoll() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Collection delegate() {
    }
}
