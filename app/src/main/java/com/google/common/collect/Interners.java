package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.MapMaker;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Interners {

    public static class InternerBuilder {
        private final MapMaker mapMaker;
        private boolean strong;

        /* synthetic */ InternerBuilder(C07221 c07221) {
        }

        public <E> Interner<E> build() {
        }

        public InternerBuilder concurrencyLevel(int i) {
        }

        public InternerBuilder strong() {
        }

        @GwtIncompatible("java.lang.ref.WeakReference")
        public InternerBuilder weak() {
        }

        private InternerBuilder() {
        }
    }

    private static class InternerFunction<E> implements Function<E, E> {
        private final Interner<E> interner;

        public InternerFunction(Interner<E> interner) {
        }

        @Override // com.google.common.base.Function
        public E apply(E e) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    @VisibleForTesting
    static final class InternerImpl<E> implements Interner<E> {

        @VisibleForTesting
        final MapMakerInternalMap<E, MapMaker.Dummy, ?, ?> map;

        /* synthetic */ InternerImpl(MapMaker mapMaker, C07221 c07221) {
        }

        @Override // com.google.common.collect.Interner
        public E intern(E e) {
        }

        private InternerImpl(MapMaker mapMaker) {
        }
    }

    private Interners() {
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
    }

    public static InternerBuilder newBuilder() {
    }

    public static <E> Interner<E> newStrongInterner() {
    }

    @GwtIncompatible("java.lang.ref.WeakReference")
    public static <E> Interner<E> newWeakInterner() {
    }
}
