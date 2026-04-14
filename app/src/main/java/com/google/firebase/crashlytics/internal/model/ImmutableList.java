package com.google.firebase.crashlytics.internal.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ImmutableList<E> implements List<E>, RandomAccess {
    private final List<E> immutableList;

    private ImmutableList(List<E> list) {
    }

    public static <E> ImmutableList<E> from(E... eArr) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
    }

    @Override // java.util.List
    public E get(int i) {
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
    }

    @Override // java.util.List
    public E set(int i, E e) {
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
    }

    public static <E> ImmutableList<E> from(List<E> list) {
    }

    @Override // java.util.List
    public void add(int i, E e) {
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
    }

    @Override // java.util.List
    public E remove(int i) {
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
    }
}
