package com.google.firebase.perf.metrics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public @interface AddTrace {
    boolean enabled() default true;

    String name();
}
