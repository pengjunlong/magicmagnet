package com.google.android.exoplayer2.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    private final Map<E, Integer> elementCounts;
    private Set<E> elementSet;
    private List<E> elements;
    private final Object lock;

    public void add(E e) {
    }

    public int count(E e) {
    }

    public Set<E> elementSet() {
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
    }

    public void remove(E e) {
    }
}
