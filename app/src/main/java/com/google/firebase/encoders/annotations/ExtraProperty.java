package com.google.firebase.encoders.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public @interface ExtraProperty {
    Class<?>[] allowedTypes() default {};
}
