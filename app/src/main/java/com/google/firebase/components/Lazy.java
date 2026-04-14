package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = null;
    private volatile Object instance;
    private volatile Provider<T> provider;

    Lazy(T t) {
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
    }

    boolean isInitialized() {
    }

    public Lazy(Provider<T> provider) {
    }
}
