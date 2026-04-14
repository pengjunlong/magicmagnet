package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DoubleCheck<T> implements vx0<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = null;
    private volatile Object instance;
    private volatile vx0<T> provider;

    private DoubleCheck(vx0<T> vx0Var) {
    }

    public static <P extends vx0<T>, T> Lazy<T> lazy(P p) {
    }

    public static <P extends vx0<T>, T> vx0<T> provider(P p) {
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
    }

    @Override // p000.vx0
    public T get() {
    }
}
