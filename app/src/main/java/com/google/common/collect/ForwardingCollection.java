package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    protected ForwardingCollection() {
    }

    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e) {
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
    }

    public void clear() {
    }

    public boolean contains(Object obj) {
    }

    public boolean containsAll(Collection<?> collection) {
    }

    @Override // com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
    }

    public Iterator<E> iterator() {
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
    }

    @Override // java.util.Collection
    public int size() {
    }

    protected boolean standardAddAll(Collection<? extends E> collection) {
    }

    protected void standardClear() {
    }

    protected boolean standardContains(Object obj) {
    }

    protected boolean standardContainsAll(Collection<?> collection) {
    }

    protected boolean standardIsEmpty() {
    }

    protected boolean standardRemove(Object obj) {
    }

    protected boolean standardRemoveAll(Collection<?> collection) {
    }

    protected boolean standardRetainAll(Collection<?> collection) {
    }

    protected Object[] standardToArray() {
    }

    protected String standardToString() {
    }

    public Object[] toArray() {
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
    }

    protected <T> T[] standardToArray(T[] tArr) {
    }
}
