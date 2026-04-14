package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Platform {
    private Platform() {
    }

    static void checkGwtRpcEnabled() {
    }

    static <T> T[] copy(Object[] objArr, int i, int i2, T[] tArr) {
    }

    static <T> T[] newArray(T[] tArr, int i) {
    }

    static <K, V> Map<K, V> newHashMapWithExpectedSize(int i) {
    }

    static <E> Set<E> newHashSetWithExpectedSize(int i) {
    }

    static <K, V> Map<K, V> newLinkedHashMapWithExpectedSize(int i) {
    }

    static <E> Set<E> newLinkedHashSetWithExpectedSize(int i) {
    }

    static <E> Set<E> preservesInsertionOrderOnAddsSet() {
    }

    static <K, V> Map<K, V> preservesInsertionOrderOnPutsMap() {
    }

    static int reduceExponentIfGwt(int i) {
    }

    static int reduceIterationsIfGwt(int i) {
    }

    static MapMaker tryWeakKeys(MapMaker mapMaker) {
    }
}
