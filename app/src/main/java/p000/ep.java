package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.ResponseBody;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class ep<ResponseT, ReturnT> extends be1<ReturnT> {
    private final g61 dbpqdHhmDSIHIJiwc1ll1l1;
    private final Call.Factory dpbdbdpbLwkLpObyKsq1lll1;
    private final bqqbdOXVujXmciImAll11l<ResponseBody, ResponseT> dqqppqiKzJi1l1lll1l;

    static final class dbpqdHhmDSIHIJiwc1ll1l1<ResponseT, ReturnT> extends ep<ResponseT, ReturnT> {
        private final ppppbdbpqOmGSiPwaOJaKshZWll11ll<ResponseT, ReturnT> dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(g61 g61Var, Call.Factory factory, bqqbdOXVujXmciImAll11l<ResponseBody, ResponseT> bqqbdoxvujxmciimall11l, ppppbdbpqOmGSiPwaOJaKshZWll11ll<ResponseT, ReturnT> ppppbdbpqomgsipwaojakshzwll11ll) {
        }

        @Override // p000.ep
        protected ReturnT dqqppqiKzJi1l1lll1l(qdppdpqbdVePwS11lll11<ResponseT> qdppdpqbdvepws11lll11, Object[] objArr) {
        }
    }

    static final class dpbdbdpbLwkLpObyKsq1lll1<ResponseT> extends ep<ResponseT, Object> {
        private final boolean bpdqqiQNVROMLC1ll1l1l11;
        private final ppppbdbpqOmGSiPwaOJaKshZWll11ll<ResponseT, qdppdpqbdVePwS11lll11<ResponseT>> dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(g61 g61Var, Call.Factory factory, bqqbdOXVujXmciImAll11l<ResponseBody, ResponseT> bqqbdoxvujxmciimall11l, ppppbdbpqOmGSiPwaOJaKshZWll11ll<ResponseT, qdppdpqbdVePwS11lll11<ResponseT>> ppppbdbpqomgsipwaojakshzwll11ll, boolean z) {
        }

        @Override // p000.ep
        protected Object dqqppqiKzJi1l1lll1l(qdppdpqbdVePwS11lll11<ResponseT> qdppdpqbdvepws11lll11, Object[] objArr) {
        }
    }

    static final class dqqppqiKzJi1l1lll1l<ResponseT> extends ep<ResponseT, Object> {
        private final ppppbdbpqOmGSiPwaOJaKshZWll11ll<ResponseT, qdppdpqbdVePwS11lll11<ResponseT>> dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(g61 g61Var, Call.Factory factory, bqqbdOXVujXmciImAll11l<ResponseBody, ResponseT> bqqbdoxvujxmciimall11l, ppppbdbpqOmGSiPwaOJaKshZWll11ll<ResponseT, qdppdpqbdVePwS11lll11<ResponseT>> ppppbdbpqomgsipwaojakshzwll11ll) {
        }

        @Override // p000.ep
        protected Object dqqppqiKzJi1l1lll1l(qdppdpqbdVePwS11lll11<ResponseT> qdppdpqbdvepws11lll11, Object[] objArr) {
        }
    }

    ep(g61 g61Var, Call.Factory factory, bqqbdOXVujXmciImAll11l<ResponseBody, ResponseT> bqqbdoxvujxmciimall11l) {
    }

    private static <ResponseT> bqqbdOXVujXmciImAll11l<ResponseBody, ResponseT> bpdqqiQNVROMLC1ll1l1l11(y71 y71Var, Method method, Type type) {
    }

    private static <ResponseT, ReturnT> ppppbdbpqOmGSiPwaOJaKshZWll11ll<ResponseT, ReturnT> dpbdpqRKAscW1lll1l(y71 y71Var, Method method, Type type, Annotation[] annotationArr) {
    }

    static <ResponseT, ReturnT> ep<ResponseT, ReturnT> ppbdpwWWljzmXXdHNabfWhgjl111l11(y71 y71Var, Method method, g61 g61Var) {
    }

    @Override // p000.be1
    final ReturnT dbpqdHhmDSIHIJiwc1ll1l1(Object[] objArr) {
    }

    protected abstract ReturnT dqqppqiKzJi1l1lll1l(qdppdpqbdVePwS11lll11<ResponseT> qdppdpqbdvepws11lll11, Object[] objArr);
}
