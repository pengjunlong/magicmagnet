package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    @Beta
    protected class StandardElementSet extends Multisets.ElementSet<E> {
        final /* synthetic */ ForwardingMultiset this$0;

        public StandardElementSet(ForwardingMultiset forwardingMultiset) {
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        Multiset<E> multiset() {
        }
    }

    protected ForwardingMultiset() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(@ParametricNullness E e, int i) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract Multiset<E> delegate();

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Object delegate() {
    }

    public Set<E> elementSet() {
    }

    public Set<Multiset.Entry<E>> entrySet() {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(Object obj) {
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i) {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E e, int i) {
    }

    protected boolean standardAdd(@ParametricNullness E e) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    @Beta
    protected boolean standardAddAll(Collection<? extends E> collection) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected void standardClear() {
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardContains(Object obj) {
    }

    @Beta
    protected int standardCount(Object obj) {
    }

    protected boolean standardEquals(Object obj) {
    }

    protected int standardHashCode() {
    }

    protected Iterator<E> standardIterator() {
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemove(Object obj) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(Collection<?> collection) {
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRetainAll(Collection<?> collection) {
    }

    protected int standardSetCount(@ParametricNullness E e, int i) {
    }

    protected int standardSize() {
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected String standardToString() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E e, int i, int i2) {
    }

    protected boolean standardSetCount(@ParametricNullness E e, int i, int i2) {
    }
}
