package io.realm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.t41;

@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public @interface RealmModule {
    boolean allClasses() default false;

    t41 classNamingPolicy() default t41.dpbdpqRKAscW1lll1l;

    Class<?>[] classes() default {};

    t41 fieldNamingPolicy() default t41.dpbdpqRKAscW1lll1l;

    boolean library() default false;
}
