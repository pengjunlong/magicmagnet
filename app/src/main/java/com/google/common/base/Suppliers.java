package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Suppliers {

    @VisibleForTesting
    static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        volatile transient T value;

        ExpiringMemoizingSupplier(Supplier<T> supplier, long j, TimeUnit timeUnit) {
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
        }

        public String toString() {
        }
    }

    @VisibleForTesting
    static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        volatile transient boolean initialized;
        transient T value;

        MemoizingSupplier(Supplier<T> supplier) {
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
        }

        public String toString() {
        }
    }

    @VisibleForTesting
    static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
        volatile Supplier<T> delegate;
        volatile boolean initialized;
        T value;

        NonSerializableMemoizingSupplier(Supplier<T> supplier) {
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
        }

        public String toString() {
        }
    }

    private static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<? super F, T> function;
        final Supplier<F> supplier;

        SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
        }

        public boolean equals(Object obj) {
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class SupplierFunctionImpl implements SupplierFunction<Object> {
        private static final /* synthetic */ SupplierFunctionImpl[] $VALUES = null;
        public static final SupplierFunctionImpl INSTANCE = null;

        private static /* synthetic */ SupplierFunctionImpl[] $values() {
        }

        private SupplierFunctionImpl(String str, int i) {
        }

        public static SupplierFunctionImpl valueOf(String str) {
        }

        public static SupplierFunctionImpl[] values() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        public Object apply(Supplier<Object> supplier) {
        }
    }

    private static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final T instance;

        SupplierOfInstance(@ParametricNullness T t) {
        }

        public boolean equals(Object obj) {
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;

        ThreadSafeSupplier(Supplier<T> supplier) {
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
        }

        public String toString() {
        }
    }

    private Suppliers() {
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j, TimeUnit timeUnit) {
    }

    public static <T> Supplier<T> ofInstance(@ParametricNullness T t) {
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
    }

    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
    }
}
