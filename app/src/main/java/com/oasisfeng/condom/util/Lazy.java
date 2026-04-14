package com.oasisfeng.condom.util;

import androidx.annotation.Keep;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class Lazy<T> {
    private T mInstance;

    protected abstract T create();

    public final T get() {
    }
}
