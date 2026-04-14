package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    Present(T t) {
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
    }

    @Override // com.google.common.base.Optional
    public T get() {
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
    }

    @Override // com.google.common.base.Optional
    public T or(T t) {
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
    }

    @Override // com.google.common.base.Optional
    public String toString() {
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
    }

    @Override // com.google.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
    }
}
