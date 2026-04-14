package com.google.android.datatransport.runtime.retries;

import java.lang.Throwable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface Function<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput) throws Throwable;
}
