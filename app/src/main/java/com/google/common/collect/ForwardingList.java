package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    protected ForwardingList() {
    }

    public void add(int i, @ParametricNullness E e) {
    }

    @CanIgnoreReturnValue
    public boolean addAll(int i, Collection<? extends E> collection) {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract List<E> delegate();

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
    }

    @Override // java.util.List
    @ParametricNullness
    public E get(int i) {
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
    }

    @Override // java.util.List
    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove(int i) {
    }

    @Override // java.util.List
    @ParametricNullness
    @CanIgnoreReturnValue
    public E set(int i, @ParametricNullness E e) {
    }

    protected boolean standardAdd(@ParametricNullness E e) {
    }

    protected boolean standardAddAll(int i, Iterable<? extends E> iterable) {
    }

    @Beta
    protected boolean standardEquals(Object obj) {
    }

    @Beta
    protected int standardHashCode() {
    }

    protected int standardIndexOf(Object obj) {
    }

    protected Iterator<E> standardIterator() {
    }

    protected int standardLastIndexOf(Object obj) {
    }

    protected ListIterator<E> standardListIterator() {
    }

    @Beta
    protected List<E> standardSubList(int i, int i2) {
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ Collection delegate() {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
    }

    @Beta
    protected ListIterator<E> standardListIterator(int i) {
    }
}
