package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final T lowerEndpoint;
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
    }

    static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
    }

    static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
    }

    static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
    }

    static <T> GeneralRange<T> range(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType, @ParametricNullness T t2, BoundType boundType2) {
    }

    static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
    }

    Comparator<? super T> comparator() {
    }

    boolean contains(@ParametricNullness T t) {
    }

    public boolean equals(Object obj) {
    }

    BoundType getLowerBoundType() {
    }

    T getLowerEndpoint() {
    }

    BoundType getUpperBoundType() {
    }

    T getUpperEndpoint() {
    }

    boolean hasLowerBound() {
    }

    boolean hasUpperBound() {
    }

    public int hashCode() {
    }

    GeneralRange<T> intersect(GeneralRange<T> generalRange) {
    }

    boolean isEmpty() {
    }

    GeneralRange<T> reverse() {
    }

    public String toString() {
    }

    boolean tooHigh(@ParametricNullness T t) {
    }

    boolean tooLow(@ParametricNullness T t) {
    }
}
