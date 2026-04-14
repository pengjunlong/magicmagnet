package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    @Beta
    protected class StandardDescendingSet extends Sets.DescendingSet<E> {
        public StandardDescendingSet(ForwardingNavigableSet forwardingNavigableSet) {
        }
    }

    protected ForwardingNavigableSet() {
    }

    @Override // java.util.NavigableSet
    public E ceiling(@ParametricNullness E e) {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract NavigableSet<E> delegate();

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
    }

    @Override // java.util.NavigableSet
    public E floor(@ParametricNullness E e) {
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
    }

    @Override // java.util.NavigableSet
    public E higher(@ParametricNullness E e) {
    }

    @Override // java.util.NavigableSet
    public E lower(@ParametricNullness E e) {
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
    }

    protected E standardCeiling(@ParametricNullness E e) {
    }

    @ParametricNullness
    protected E standardFirst() {
    }

    protected E standardFloor(@ParametricNullness E e) {
    }

    protected SortedSet<E> standardHeadSet(@ParametricNullness E e) {
    }

    protected E standardHigher(@ParametricNullness E e) {
    }

    @ParametricNullness
    protected E standardLast() {
    }

    protected E standardLower(@ParametricNullness E e) {
    }

    protected E standardPollFirst() {
    }

    protected E standardPollLast() {
    }

    @Beta
    protected NavigableSet<E> standardSubSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
    }

    protected SortedSet<E> standardTailSet(@ParametricNullness E e) {
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    protected SortedSet<E> standardSubSet(@ParametricNullness E e, @ParametricNullness E e2) {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Set delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ SortedSet delegate() {
    }
}
