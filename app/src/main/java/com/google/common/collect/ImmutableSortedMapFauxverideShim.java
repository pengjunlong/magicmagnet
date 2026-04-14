package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableSortedMap;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Map;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class ImmutableSortedMapFauxverideShim<K, V> extends ImmutableMap<K, V> {
    ImmutableSortedMapFauxverideShim() {
    }

    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <K, V> ImmutableSortedMap.Builder<K, V> builder() {
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <K, V> ImmutableSortedMap.Builder<K, V> builderWithExpectedSize(int i) {
    }

    @DoNotCall("Pass a key of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v) {
    }

    @DoNotCall("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
    }
}
