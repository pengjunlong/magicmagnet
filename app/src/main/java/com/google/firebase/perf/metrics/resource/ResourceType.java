package com.google.firebase.perf.metrics.resource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public @interface ResourceType {
    public static final String NETWORK = "Network";
    public static final String TRACE = "Trace";
}
