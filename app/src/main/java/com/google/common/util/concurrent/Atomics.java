package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Atomics {
    private Atomics() {
    }

    public static <V> AtomicReference<V> newReference() {
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(int i) {
    }

    public static <V> AtomicReference<V> newReference(@ParametricNullness V v) {
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(E[] eArr) {
    }
}
