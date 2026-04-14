package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Ordering<T> implements Comparator<T> {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    @VisibleForTesting
    static class ArbitraryOrdering extends Ordering<Object> {
        private final AtomicInteger counter;
        private final ConcurrentMap<Object, Integer> uids;

        ArbitraryOrdering() {
        }

        private Integer getUid(Object obj) {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
        }

        int identityHashCode(Object obj) {
        }

        public String toString() {
        }
    }

    private static class ArbitraryOrderingHolder {
        static final Ordering<Object> ARBITRARY_ORDERING = null;

        private ArbitraryOrderingHolder() {
        }
    }

    @VisibleForTesting
    static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
        final Object value;

        IncomparableValueException(Object obj) {
        }
    }

    protected Ordering() {
    }

    @GwtCompatible(serializable = true)
    public static Ordering<Object> allEqual() {
    }

    public static Ordering<Object> arbitrary() {
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> explicit(List<T> list) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> from(Comparator<T> comparator) {
    }

    @GwtCompatible(serializable = true)
    public static <C extends Comparable> Ordering<C> natural() {
    }

    @GwtCompatible(serializable = true)
    public static Ordering<Object> usingToString() {
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, @ParametricNullness T t) {
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@ParametricNullness T t, @ParametricNullness T t2);

    @GwtCompatible(serializable = true)
    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i) {
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<Iterable<S>> lexicographical() {
    }

    @ParametricNullness
    public <E extends T> E max(Iterator<E> it) {
    }

    @ParametricNullness
    public <E extends T> E min(Iterator<E> it) {
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> nullsFirst() {
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> nullsLast() {
    }

    <T2 extends T> Ordering<Map.Entry<T2, ?>> onKeys() {
    }

    @GwtCompatible(serializable = true)
    public <F> Ordering<F> onResultOf(Function<F, ? extends T> function) {
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> reverse() {
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> explicit(T t, T... tArr) {
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i) {
    }

    @GwtCompatible(serializable = true)
    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
    }

    @ParametricNullness
    public <E extends T> E max(Iterable<E> iterable) {
    }

    @ParametricNullness
    public <E extends T> E min(Iterable<E> iterable) {
    }

    @ParametricNullness
    public <E extends T> E max(@ParametricNullness E e, @ParametricNullness E e2) {
    }

    @ParametricNullness
    public <E extends T> E min(@ParametricNullness E e, @ParametricNullness E e2) {
    }

    @ParametricNullness
    public <E extends T> E max(@ParametricNullness E e, @ParametricNullness E e2, @ParametricNullness E e3, E... eArr) {
    }

    @ParametricNullness
    public <E extends T> E min(@ParametricNullness E e, @ParametricNullness E e2, @ParametricNullness E e3, E... eArr) {
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i) {
    }
}
