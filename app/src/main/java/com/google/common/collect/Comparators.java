package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Comparators {
    private Comparators() {
    }

    public static <T> boolean isInOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
    }

    public static <T> boolean isInStrictOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
    }

    public static <T, S extends T> Comparator<Iterable<S>> lexicographical(Comparator<T> comparator) {
    }

    @Beta
    public static <T extends Comparable<? super T>> T max(T t, T t2) {
    }

    @Beta
    public static <T extends Comparable<? super T>> T min(T t, T t2) {
    }

    @ParametricNullness
    @Beta
    public static <T> T max(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator) {
    }

    @ParametricNullness
    @Beta
    public static <T> T min(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator) {
    }
}
