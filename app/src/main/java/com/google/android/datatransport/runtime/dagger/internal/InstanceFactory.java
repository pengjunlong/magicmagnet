package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {
    private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = null;
    private final T instance;

    private InstanceFactory(T t) {
    }

    public static <T> Factory<T> create(T t) {
    }

    public static <T> Factory<T> createNullable(T t) {
    }

    private static <T> InstanceFactory<T> nullInstanceFactory() {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public T get() {
    }
}
