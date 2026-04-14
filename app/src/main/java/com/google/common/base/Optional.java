package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

@DoNotMock("Use Optional.of(value) or Optional.absent()")
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.base.Optional$1 */
    class C06181 implements Iterable<T> {
        final /* synthetic */ Iterable val$optionals;

        /* renamed from: com.google.common.base.Optional$1$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<T> {
            private final Iterator<? extends Optional<? extends T>> iterator;
            final /* synthetic */ C06181 this$0;

            AnonymousClass1(C06181 c06181) {
            }

            @Override // com.google.common.base.AbstractIterator
            protected T computeNext() {
            }
        }

        C06181(Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    Optional() {
    }

    public static <T> Optional<T> absent() {
    }

    public static <T> Optional<T> fromNullable(T t) {
    }

    public static <T> Optional<T> of(T t) {
    }

    @Beta
    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    @Beta
    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
