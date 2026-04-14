package okhttp3.internal.connection;

import java.io.IOException;
import java.net.SocketException;
import kotlin.Metadata;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.ws.RealWebSocket;
import p000.aj1;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.kg;
import p000.lg;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean isDuplex;

    @Metadata
    private final class RequestBodySink extends kg {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        public RequestBodySink(Exchange exchange, aj1 aj1Var, long j) {
        }

        private final <E extends IOException> E complete(E e) {
        }

        @Override // p000.kg, p000.aj1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p000.kg, p000.aj1, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // p000.kg, p000.aj1
        public void write(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) throws IOException {
        }
    }

    @Metadata
    public final class ResponseBodySource extends lg {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        public ResponseBodySource(Exchange exchange, cl1 cl1Var, long j) {
        }

        @Override // p000.lg, p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
        }

        public final <E extends IOException> E complete(E e) {
        }

        @Override // p000.lg, p000.cl1
        public long read(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, long j) throws IOException {
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
    }

    private final void trackFailure(IOException iOException) {
    }

    public final <E extends IOException> E bodyComplete(long j, boolean z, boolean z2, E e) {
    }

    public final void cancel() {
    }

    public final aj1 createRequestBody(Request request, boolean z) throws IOException {
    }

    public final void detachWithViolence() {
    }

    public final void finishRequest() throws IOException {
    }

    public final void flushRequest() throws IOException {
    }

    public final RealCall getCall$okhttp() {
    }

    public final RealConnection getConnection$okhttp() {
    }

    public final EventListener getEventListener$okhttp() {
    }

    public final ExchangeFinder getFinder$okhttp() {
    }

    public final boolean isCoalescedConnection$okhttp() {
    }

    public final boolean isDuplex$okhttp() {
    }

    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
    }

    public final void noNewExchangesOnConnection() {
    }

    public final void noRequestBody() {
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
    }

    public final Response.Builder readResponseHeaders(boolean z) throws IOException {
    }

    public final void responseHeadersEnd(Response response) {
    }

    public final void responseHeadersStart() {
    }

    public final Headers trailers() throws IOException {
    }

    public final void webSocketUpgradeFailed() {
    }

    public final void writeRequestHeaders(Request request) throws IOException {
    }
}
