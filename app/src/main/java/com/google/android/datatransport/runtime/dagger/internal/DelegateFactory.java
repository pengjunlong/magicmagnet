package com.google.android.datatransport.runtime.dagger.internal;

import p000.vx0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private vx0<T> delegate;

    public static <T> void setDelegate(vx0<T> vx0Var, vx0<T> vx0Var2) {
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p000.vx0
    public T get() {
    }

    vx0<T> getDelegate() {
    }

    @Deprecated
    public void setDelegatedProvider(vx0<T> vx0Var) {
    }
}
