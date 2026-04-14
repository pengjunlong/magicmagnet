package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Predicates {

    private static class AndPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        /* synthetic */ AndPredicate(List list, C06201 c06201) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private AndPredicate(List<? extends Predicate<? super T>> list) {
        }
    }

    private static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        final Function<A, ? extends B> f100f;

        /* renamed from: p */
        final Predicate<B> f101p;

        /* synthetic */ CompositionPredicate(Predicate predicate, Function function, C06201 c06201) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness A a) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private CompositionPredicate(Predicate<B> predicate, Function<A, ? extends B> function) {
        }
    }

    @GwtIncompatible
    private static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        ContainsPatternFromStringPredicate(String str) {
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
        }
    }

    @GwtIncompatible
    private static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final CommonPattern pattern;

        ContainsPatternPredicate(CommonPattern commonPattern) {
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(CharSequence charSequence) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public boolean apply2(CharSequence charSequence) {
        }
    }

    private static class InPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        /* synthetic */ InPredicate(Collection collection, C06201 c06201) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private InPredicate(Collection<?> collection) {
        }
    }

    @GwtIncompatible
    private static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        /* synthetic */ InstanceOfPredicate(Class cls, C06201 c06201) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private InstanceOfPredicate(Class<?> cls) {
        }
    }

    private static class IsEqualToPredicate implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Object target;

        /* synthetic */ IsEqualToPredicate(Object obj, C06201 c06201) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        <T> Predicate<T> withNarrowedType() {
        }

        private IsEqualToPredicate(Object obj) {
        }
    }

    private static class NotPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Predicate<T> predicate;

        NotPredicate(Predicate<T> predicate) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static abstract class ObjectPredicate implements Predicate<Object> {
        private static final /* synthetic */ ObjectPredicate[] $VALUES = null;
        public static final ObjectPredicate ALWAYS_FALSE = null;
        public static final ObjectPredicate ALWAYS_TRUE = null;
        public static final ObjectPredicate IS_NULL = null;
        public static final ObjectPredicate NOT_NULL = null;

        /* renamed from: com.google.common.base.Predicates$ObjectPredicate$1 */
        enum C06211 extends ObjectPredicate {
            C06211(String str, int i) {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }
        }

        /* renamed from: com.google.common.base.Predicates$ObjectPredicate$2 */
        enum C06222 extends ObjectPredicate {
            C06222(String str, int i) {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }
        }

        /* renamed from: com.google.common.base.Predicates$ObjectPredicate$3 */
        enum C06233 extends ObjectPredicate {
            C06233(String str, int i) {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }
        }

        /* renamed from: com.google.common.base.Predicates$ObjectPredicate$4 */
        enum C06244 extends ObjectPredicate {
            C06244(String str, int i) {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }
        }

        private static /* synthetic */ ObjectPredicate[] $values() {
        }

        private ObjectPredicate(String str, int i) {
        }

        public static ObjectPredicate valueOf(String str) {
        }

        public static ObjectPredicate[] values() {
        }

        <T> Predicate<T> withNarrowedType() {
        }

        /* synthetic */ ObjectPredicate(String str, int i, C06201 c06201) {
        }
    }

    private static class OrPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        /* synthetic */ OrPredicate(List list, C06201 c06201) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private OrPredicate(List<? extends Predicate<? super T>> list) {
        }
    }

    @GwtIncompatible
    private static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        /* synthetic */ SubtypeOfPredicate(Class cls, C06201 c06201) {
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Class<?> cls) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private SubtypeOfPredicate(Class<?> cls) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public boolean apply2(Class<?> cls) {
        }
    }

    private Predicates() {
    }

    static /* synthetic */ String access$800(String str, Iterable iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysFalse() {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> alwaysTrue() {
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
    }

    @GwtIncompatible("java.util.regex.Pattern")
    public static Predicate<CharSequence> contains(Pattern pattern) {
    }

    @GwtIncompatible
    public static Predicate<CharSequence> containsPattern(String str) {
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
    }

    public static <T> Predicate<T> equalTo(@ParametricNullness T t) {
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
    }

    @GwtIncompatible
    public static <T> Predicate<T> instanceOf(Class<?> cls) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> isNull() {
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
    }

    @GwtCompatible(serializable = true)
    public static <T> Predicate<T> notNull() {
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
    }

    @Beta
    @GwtIncompatible
    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
    }

    private static String toStringHelper(String str, Iterable<?> iterable) {
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
    }
}
