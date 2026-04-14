package okhttp3.internal.http1;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okio.dpbdbdpbLwkLpObyKsq1lll1;
import p000.aj1;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.mg;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = null;
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll sink;
    private final qbbbpbbbiFxIAmEwllll11 source;
    private int state;
    private Headers trailers;

    @Metadata
    private abstract class AbstractSource implements cl1 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final mg timeout;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
        }

        @Override // p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public abstract /* synthetic */ void close() throws IOException;

        protected final boolean getClosed() {
        }

        protected final mg getTimeout() {
        }

        @Override // p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }

        public final void responseBodyComplete() {
        }

        protected final void setClosed(boolean z) {
        }

        @Override // p000.cl1
        public dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }
    }

    @Metadata
    private final class ChunkedSink implements aj1 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final mg timeout;

        public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
        }

        @Override // p000.aj1, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
        }

        @Override // p000.aj1, java.io.Flushable
        public synchronized void flush() {
        }

        @Override // p000.aj1
        public dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }

        @Override // p000.aj1
        public void write(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }
    }

    @Metadata
    private final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
        }

        private final void readChunkSize() {
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    @Metadata
    private final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long j) {
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }
    }

    @Metadata
    private final class KnownLengthSink implements aj1 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final mg timeout;

        public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
        }

        @Override // p000.aj1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p000.aj1, java.io.Flushable
        public void flush() {
        }

        @Override // p000.aj1
        public dpbdbdpbLwkLpObyKsq1lll1 timeout() {
        }

        @Override // p000.aj1
        public void write(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }
    }

    @Metadata
    private final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) {
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) {
    }

    public static final /* synthetic */ void access$detachTimeout(Http1ExchangeCodec http1ExchangeCodec, mg mgVar) {
    }

    public static final /* synthetic */ OkHttpClient access$getClient$p(Http1ExchangeCodec http1ExchangeCodec) {
    }

    public static final /* synthetic */ HeadersReader access$getHeadersReader$p(Http1ExchangeCodec http1ExchangeCodec) {
    }

    public static final /* synthetic */ qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll access$getSink$p(Http1ExchangeCodec http1ExchangeCodec) {
    }

    public static final /* synthetic */ qbbbpbbbiFxIAmEwllll11 access$getSource$p(Http1ExchangeCodec http1ExchangeCodec) {
    }

    public static final /* synthetic */ int access$getState$p(Http1ExchangeCodec http1ExchangeCodec) {
    }

    public static final /* synthetic */ Headers access$getTrailers$p(Http1ExchangeCodec http1ExchangeCodec) {
    }

    public static final /* synthetic */ void access$setState$p(Http1ExchangeCodec http1ExchangeCodec, int i) {
    }

    public static final /* synthetic */ void access$setTrailers$p(Http1ExchangeCodec http1ExchangeCodec, Headers headers) {
    }

    private final void detachTimeout(mg mgVar) {
    }

    private final boolean isChunked(Response response) {
    }

    private final aj1 newChunkedSink() {
    }

    private final cl1 newChunkedSource(HttpUrl httpUrl) {
    }

    private final cl1 newFixedLengthSource(long j) {
    }

    private final aj1 newKnownLengthSink() {
    }

    private final cl1 newUnknownLengthSource() {
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

    public final boolean isClosed() {
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

    public final void skipConnectBody(Response response) {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
    }

    public final void writeRequest(Headers headers, String str) {
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
    }

    private final boolean isChunked(Request request) {
    }
}
