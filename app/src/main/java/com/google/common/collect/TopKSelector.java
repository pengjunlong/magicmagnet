package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final Comparator<? super T> comparator;

    /* renamed from: k */
    private final int f107k;
    private T threshold;

    private TopKSelector(Comparator<? super T> comparator, int i) {
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i) {
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i) {
    }

    private int partition(int i, int i2, int i3) {
    }

    private void swap(int i, int i2) {
    }

    private void trim() {
    }

    public void offer(@ParametricNullness T t) {
    }

    public void offerAll(Iterable<? extends T> iterable) {
    }

    public List<T> topK() {
    }

    public static <T> TopKSelector<T> greatest(int i, Comparator<? super T> comparator) {
    }

    public static <T> TopKSelector<T> least(int i, Comparator<? super T> comparator) {
    }

    public void offerAll(Iterator<? extends T> it) {
    }
}
