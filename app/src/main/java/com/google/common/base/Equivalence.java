package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Equivalence<T> {

    static final class Equals extends Equivalence<Object> implements Serializable {
        static final Equals INSTANCE = null;
        private static final long serialVersionUID = 1;

        Equals() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
        }

        @Override // com.google.common.base.Equivalence
        protected int doHash(Object obj) {
        }
    }

    private static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        private final T target;

        EquivalentToPredicate(Equivalence<T> equivalence, T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    static final class Identity extends Equivalence<Object> implements Serializable {
        static final Identity INSTANCE = null;
        private static final long serialVersionUID = 1;

        Identity() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
        }

        @Override // com.google.common.base.Equivalence
        protected int doHash(Object obj) {
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @ParametricNullness
        private final T reference;

        /* synthetic */ Wrapper(Equivalence equivalence, Object obj, C06121 c06121) {
        }

        public boolean equals(Object obj) {
        }

        @ParametricNullness
        public T get() {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private Wrapper(Equivalence<? super T> equivalence, @ParametricNullness T t) {
        }
    }

    protected Equivalence() {
    }

    public static Equivalence<Object> equals() {
    }

    public static Equivalence<Object> identity() {
    }

    @ForOverride
    protected abstract boolean doEquivalent(T t, T t2);

    @ForOverride
    protected abstract int doHash(T t);

    public final boolean equivalent(T t, T t2) {
    }

    public final Predicate<T> equivalentTo(T t) {
    }

    public final int hash(T t) {
    }

    public final <F> Equivalence<F> onResultOf(Function<? super F, ? extends T> function) {
    }

    @GwtCompatible(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
    }

    public final <S extends T> Wrapper<S> wrap(@ParametricNullness S s) {
    }
}
