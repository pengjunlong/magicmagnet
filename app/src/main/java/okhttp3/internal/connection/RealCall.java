package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import okio.dbpqdHhmDSIHIJiwc1ll1l1;
import okio.dpbdbdpbLwkLpObyKsq1lll1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RealCall implements Call {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private volatile RealConnection connectionToCancel;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    @Metadata
    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
        }

        public final void executeOn(ExecutorService executorService) {
        }

        public final RealCall getCall() {
        }

        public final AtomicInteger getCallsPerHost() {
        }

        public final String getHost() {
        }

        public final Request getRequest() {
        }

        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @xc0
    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        public CallReference(RealCall realCall, Object obj) {
        }

        public final Object getCallStackTrace() {
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
    }

    public static final /* synthetic */ RealCall$timeout$1 access$getTimeout$p(RealCall realCall) {
    }

    public static final /* synthetic */ String access$toLoggableString(RealCall realCall) {
    }

    private final <E extends IOException> E callDone(E e) {
    }

    private final void callStart() {
    }

    private final Address createAddress(HttpUrl httpUrl) {
    }

    private final <E extends IOException> E timeoutExit(E e) {
    }

    private final String toLoggableString() {
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
    }

    @Override // okhttp3.Call
    public void cancel() {
    }

    public /* bridge */ /* synthetic */ Object clone() {
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean z) {
    }

    @Override // okhttp3.Call
    public Response execute() {
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
    }

    public final OkHttpClient getClient() {
    }

    public final RealConnection getConnection() {
    }

    public final RealConnection getConnectionToCancel() {
    }

    public final EventListener getEventListener$okhttp() {
    }

    public final boolean getForWebSocket() {
    }

    public final Exchange getInterceptorScopedExchange$okhttp() {
    }

    public final Request getOriginalRequest() {
    }

    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain realInterceptorChain) {
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
    }

    public final <E extends IOException> E messageDone$okhttp(Exchange exchange, boolean z, boolean z2, E e) {
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
    }

    public final String redactedUrl$okhttp() {
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
    }

    @Override // okhttp3.Call
    public Request request() {
    }

    public final boolean retryAfterFailure() {
    }

    public final void setConnectionToCancel(RealConnection realConnection) {
    }

    @Override // okhttp3.Call
    public /* bridge */ /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 timeout() {
    }

    public final void timeoutEarlyExit() {
    }

    @Override // okhttp3.Call
    public /* bridge */ /* synthetic */ Call clone() {
    }

    @Override // okhttp3.Call
    public dbpqdHhmDSIHIJiwc1ll1l1 timeout() {
    }

    @Override // okhttp3.Call
    public RealCall clone() {
    }
}
