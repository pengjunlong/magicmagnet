package p000;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class tm0<T> implements qdppdpqbdVePwS11lll11<T> {
    private final Object[] bpdqqiQNVROMLC1ll1l1l11;
    private Throwable dbppbdqpeLmcbs11l11;
    private volatile boolean ddbbbeXHXx111ll;
    private final g61 dpbdpqRKAscW1lll1l;
    private Call dqpdbEevAufTOvPphbjykClll1l11;
    private final bqqbdOXVujXmciImAll11l<ResponseBody, T> dqpqqqbqQyjyB11111l1;
    private boolean pbppbpqbamJRy11l1l1;
    private final Call.Factory ppbdpwWWljzmXXdHNabfWhgjl111l11;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Callback {
        final /* synthetic */ qpbqqqqGuDQlFFgXLWrBLQll1l11 dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ tm0 dpbdbdpbLwkLpObyKsq1lll1;

        dbpqdHhmDSIHIJiwc1ll1l1(tm0 tm0Var, qpbqqqqGuDQlFFgXLWrBLQll1l11 qpbqqqqgudqlffgxlwrblqll1l11) {
        }

        private void dbpqdHhmDSIHIJiwc1ll1l1(Throwable th) {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
        }
    }

    static final class dpbdbdpbLwkLpObyKsq1lll1 extends ResponseBody {
        private final qbbbpbbbiFxIAmEwllll11 bpdqqiQNVROMLC1ll1l1l11;
        private final ResponseBody dpbdpqRKAscW1lll1l;
        IOException ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 extends lg {
            final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, cl1 cl1Var) {
            }

            @Override // p000.lg, p000.cl1
            public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) throws IOException {
            }
        }

        dpbdbdpbLwkLpObyKsq1lll1(ResponseBody responseBody) {
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
        }

        void dpbdbdpbLwkLpObyKsq1lll1() throws IOException {
        }

        @Override // okhttp3.ResponseBody
        public qbbbpbbbiFxIAmEwllll11 source() {
        }
    }

    static final class dqqppqiKzJi1l1lll1l extends ResponseBody {
        private final long bpdqqiQNVROMLC1ll1l1l11;
        private final MediaType dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(MediaType mediaType, long j) {
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
        }

        @Override // okhttp3.ResponseBody
        public qbbbpbbbiFxIAmEwllll11 source() {
        }
    }

    tm0(g61 g61Var, Object[] objArr, Call.Factory factory, bqqbdOXVujXmciImAll11l<ResponseBody, T> bqqbdoxvujxmciimall11l) {
    }

    private Call dpbdbdpbLwkLpObyKsq1lll1() throws IOException {
    }

    private Call dqqppqiKzJi1l1lll1l() throws IOException {
    }

    p71<T> bpdqqiQNVROMLC1ll1l1l11(Response response) throws IOException {
    }

    @Override // p000.qdppdpqbdVePwS11lll11
    public void cancel() {
    }

    @Override // p000.qdppdpqbdVePwS11lll11
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ qdppdpqbdVePwS11lll11 mo1023clone() {
    }

    public tm0<T> dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    @Override // p000.qdppdpqbdVePwS11lll11
    public void dpbdpqRKAscW1lll1l(qpbqqqqGuDQlFFgXLWrBLQll1l11<T> qpbqqqqgudqlffgxlwrblqll1l11) {
    }

    @Override // p000.qdppdpqbdVePwS11lll11
    public p71<T> execute() throws IOException {
    }

    @Override // p000.qdppdpqbdVePwS11lll11
    public boolean isCanceled() {
    }

    @Override // p000.qdppdpqbdVePwS11lll11
    public synchronized Request request() {
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
    }
}
