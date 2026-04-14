package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.js0;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public @interface xy {
    boolean alphabetic() default true;

    boolean asm() default true;

    Class<? extends js0.dbpqdHhmDSIHIJiwc1ll1l1> autoTypeCheckHandler() default js0.dbpqdHhmDSIHIJiwc1ll1l1.class;

    Class<?> builder() default Void.class;

    Class<?> deserializer() default Void.class;

    String[] ignores() default {};

    String[] includes() default {};

    Class<?> mappingTo() default Void.class;

    lx0 naming() default lx0.dqpdbEevAufTOvPphbjykClll1l11;

    String[] orders() default {};

    nc[] parseFeatures() default {};

    Class<?>[] seeAlso() default {};

    boolean serializeEnumAsJavaBean() default false;

    Class<?> serializer() default Void.class;

    vd1[] serialzeFeatures() default {};

    Class<? extends pd1>[] serialzeFilters() default {};

    String typeKey() default "";

    String typeName() default "";
}
