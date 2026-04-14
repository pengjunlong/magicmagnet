package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Functions {

    private static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        private final E value;

        public ConstantFunction(@ParametricNullness E e) {
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public E apply(Object obj) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final V defaultValue;
        final Map<K, ? extends V> map;

        ForMapWithDefault(Map<K, ? extends V> map, @ParametricNullness V v) {
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        private final Function<A, ? extends B> f98f;

        /* renamed from: g */
        private final Function<B, C> f99g;

        public FunctionComposition(Function<B, C> function, Function<A, ? extends B> function2) {
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public C apply(@ParametricNullness A a) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final Map<K, V> map;

        FunctionForMapNoDefault(Map<K, V> map) {
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class IdentityFunction implements Function<Object, Object> {
        private static final /* synthetic */ IdentityFunction[] $VALUES = null;
        public static final IdentityFunction INSTANCE = null;

        private static /* synthetic */ IdentityFunction[] $values() {
        }

        private IdentityFunction(String str, int i) {
        }

        public static IdentityFunction valueOf(String str) {
        }

        public static IdentityFunction[] values() {
        }

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }
    }

    private static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        private final Predicate<T> predicate;

        /* synthetic */ PredicateFunction(Predicate predicate, C06131 c06131) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Boolean apply(@ParametricNullness Object obj) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private PredicateFunction(Predicate<T> predicate) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public Boolean apply(@ParametricNullness T t) {
        }
    }

    private static class SupplierFunction<F, T> implements Function<F, T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<T> supplier;

        /* synthetic */ SupplierFunction(Supplier supplier, C06131 c06131) {
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public T apply(@ParametricNullness F f) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private SupplierFunction(Supplier<T> supplier) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class ToStringFunction implements Function<Object, String> {
        private static final /* synthetic */ ToStringFunction[] $VALUES = null;
        public static final ToStringFunction INSTANCE = null;

        private static /* synthetic */ ToStringFunction[] $values() {
        }

        private ToStringFunction(String str, int i) {
        }

        public static ToStringFunction valueOf(String str) {
        }

        public static ToStringFunction[] values() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ String apply(Object obj) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        @Override // com.google.common.base.Function
        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public String apply2(Object obj) {
        }
    }

    private Functions() {
    }

    public static <A, B, C> Function<A, C> compose(Function<B, C> function, Function<A, ? extends B> function2) {
    }

    public static <E> Function<Object, E> constant(@ParametricNullness E e) {
    }

    public static <K, V> Function<K, V> forMap(Map<K, V> map) {
    }

    public static <T> Function<T, Boolean> forPredicate(Predicate<T> predicate) {
    }

    public static <F, T> Function<F, T> forSupplier(Supplier<T> supplier) {
    }

    public static <E> Function<E, E> identity() {
    }

    public static Function<Object, String> toStringFunction() {
    }

    public static <K, V> Function<K, V> forMap(Map<K, ? extends V> map, @ParametricNullness V v) {
    }
}
