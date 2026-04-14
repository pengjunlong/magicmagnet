package com.google.android.datatransport.runtime.dagger.internal;

import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SingleCheck<T> implements vx0<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = null;
    private volatile Object instance;
    private volatile vx0<T> provider;

    private SingleCheck(vx0<T> vx0Var) {
    }

    public static <P extends vx0<T>, T> vx0<T> provider(P p) {
    }

    @Override // p000.vx0
    public T get() {
    }
}
