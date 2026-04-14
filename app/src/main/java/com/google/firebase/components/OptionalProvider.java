package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    private static final Provider<Object> EMPTY_PROVIDER = null;
    private static final Deferred.DeferredHandler<Object> NOOP_HANDLER = null;
    private volatile Provider<T> delegate;
    private Deferred.DeferredHandler<T> handler;

    private OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
    }

    public static /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(Provider provider) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
    }

    static <T> OptionalProvider<T> empty() {
    }

    private static /* synthetic */ void lambda$static$0(Provider provider) {
    }

    private static /* synthetic */ Object lambda$static$1() {
    }

    private static /* synthetic */ void lambda$whenAvailable$2(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
    }

    static <T> OptionalProvider<T> of(Provider<T> provider) {
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
    }

    void set(Provider<T> provider) {
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(Deferred.DeferredHandler<T> deferredHandler) {
    }
}
