package okhttp3.internal.http2;

import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import p000.aj1;
import p000.cl1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private static final String CONNECTION = "connection";
    public static final Companion Companion = null;
    private static final String ENCODING = "encoding";
    private static final String HOST = "host";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = null;
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = null;
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String UPGRADE = "upgrade";
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final List<Header> http2HeadersList(Request request) {
        }

        public final Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) {
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
    }

    public static final /* synthetic */ List access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp() {
    }

    public static final /* synthetic */ List access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public aj1 createRequestBody(Request request, long j) {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public cl1 openResponseBodySource(Response response) {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
    }
}
