package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class SortedIterables {
    private SortedIterables() {
    }

    public static <E> Comparator<? super E> comparator(SortedSet<E> sortedSet) {
    }

    public static boolean hasSameComparator(Comparator<?> comparator, Iterable<?> iterable) {
    }
}
