package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface bqqbdOXVujXmciImAll11l<F, T> {

    public static abstract class dbpqdHhmDSIHIJiwc1ll1l1 {
        protected static Type dbpqdHhmDSIHIJiwc1ll1l1(int i, ParameterizedType parameterizedType) {
        }

        protected static Class<?> dpbdbdpbLwkLpObyKsq1lll1(Type type) {
        }

        public bqqbdOXVujXmciImAll11l<?, String> bpdqqiQNVROMLC1ll1l1l11(Type type, Annotation[] annotationArr, y71 y71Var) {
        }

        public bqqbdOXVujXmciImAll11l<ResponseBody, ?> dpbdpqRKAscW1lll1l(Type type, Annotation[] annotationArr, y71 y71Var) {
        }

        public bqqbdOXVujXmciImAll11l<?, RequestBody> dqqppqiKzJi1l1lll1l(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y71 y71Var) {
        }
    }

    T convert(F f) throws IOException;
}
