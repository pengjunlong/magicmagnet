package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class LazySet<T> implements Provider<Set<T>> {
    private volatile Set<T> actualSet;
    private volatile Set<Provider<T>> providers;

    LazySet(Collection<Provider<T>> collection) {
    }

    static LazySet<?> fromCollection(Collection<Provider<?>> collection) {
    }

    private synchronized void updateSet() {
    }

    synchronized void add(Provider<T> provider) {
    }

    @Override // com.google.firebase.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
    }

    @Override // com.google.firebase.inject.Provider
    public Set<T> get() {
    }
}
