package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @RetainedWith
    @LazyInit
    private transient Converter<B, A> reverse;

    /* renamed from: com.google.common.base.Converter$1 */
    class C06111 implements Iterable<B> {
        final /* synthetic */ Converter this$0;
        final /* synthetic */ Iterable val$fromIterable;

        /* renamed from: com.google.common.base.Converter$1$1, reason: invalid class name */
        class AnonymousClass1 implements Iterator<B> {
            private final Iterator<? extends A> fromIterator;
            final /* synthetic */ C06111 this$1;

            AnonymousClass1(C06111 c06111) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public B next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        C06111(Converter converter, Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
        }
    }

    private static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> first;
        final Converter<B, C> second;

        ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
        }

        @Override // com.google.common.base.Converter
        A correctedDoBackward(C c) {
        }

        @Override // com.google.common.base.Converter
        C correctedDoForward(A a) {
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(C c) {
        }

        @Override // com.google.common.base.Converter
        protected C doForward(A a) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super B, ? extends A> backwardFunction;
        private final Function<? super A, ? extends B> forwardFunction;

        /* synthetic */ FunctionBasedConverter(Function function, Function function2, C06111 c06111) {
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(B b) {
        }

        @Override // com.google.common.base.Converter
        protected B doForward(A a) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private FunctionBasedConverter(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        }
    }

    private static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        static final IdentityConverter<?> INSTANCE = null;
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
        }

        @Override // com.google.common.base.Converter
        protected T doBackward(T t) {
        }

        @Override // com.google.common.base.Converter
        protected T doForward(T t) {
        }

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ Converter reverse() {
        }

        public String toString() {
        }
    }

    private static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> original;

        ReverseConverter(Converter<A, B> converter) {
        }

        @Override // com.google.common.base.Converter
        B correctedDoBackward(A a) {
        }

        @Override // com.google.common.base.Converter
        A correctedDoForward(B b) {
        }

        @Override // com.google.common.base.Converter
        protected B doBackward(A a) {
        }

        @Override // com.google.common.base.Converter
        protected A doForward(B b) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
        }

        public String toString() {
        }
    }

    protected Converter() {
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
    }

    public static <T> Converter<T, T> identity() {
    }

    private A unsafeDoBackward(B b) {
    }

    private B unsafeDoForward(A a) {
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
    }

    @Override // com.google.common.base.Function
    @CanIgnoreReturnValue
    @Deprecated
    public final B apply(A a) {
    }

    @CanIgnoreReturnValue
    public final B convert(A a) {
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
    }

    A correctedDoBackward(B b) {
    }

    B correctedDoForward(A a) {
    }

    <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
    }

    @ForOverride
    protected abstract A doBackward(B b);

    @ForOverride
    protected abstract B doForward(A a);

    @Override // com.google.common.base.Function
    public boolean equals(Object obj) {
    }

    @CanIgnoreReturnValue
    public Converter<B, A> reverse() {
    }

    Converter(boolean z) {
    }
}
