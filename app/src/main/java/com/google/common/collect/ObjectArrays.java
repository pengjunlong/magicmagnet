package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ObjectArrays {
    private ObjectArrays() {
    }

    @CanIgnoreReturnValue
    static Object checkElementNotNull(Object obj, int i) {
    }

    @CanIgnoreReturnValue
    static Object[] checkElementsNotNull(Object... objArr) {
    }

    @GwtIncompatible
    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
    }

    static Object[] copyAsObjectArray(Object[] objArr, int i, int i2) {
    }

    @CanIgnoreReturnValue
    private static Object[] fillArray(Iterable<?> iterable, Object[] objArr) {
    }

    @GwtIncompatible
    public static <T> T[] newArray(Class<T> cls, int i) {
    }

    static void swap(Object[] objArr, int i, int i2) {
    }

    static <T> T[] toArrayImpl(Collection<?> collection, T[] tArr) {
    }

    @CanIgnoreReturnValue
    static Object[] checkElementsNotNull(Object[] objArr, int i) {
    }

    public static <T> T[] newArray(T[] tArr, int i) {
    }

    public static <T> T[] concat(@ParametricNullness T t, T[] tArr) {
    }

    public static <T> T[] concat(T[] tArr, @ParametricNullness T t) {
    }

    static <T> T[] toArrayImpl(Object[] objArr, int i, int i2, T[] tArr) {
    }

    static Object[] toArrayImpl(Collection<?> collection) {
    }
}
