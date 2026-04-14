package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Route;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.RealWebSocket;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = null;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll sink;
    private Socket socket;
    private qbbbpbbbiFxIAmEwllll11 source;
    private int successCount;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j) {
        }
    }

    @xc0
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
    }

    public static final /* synthetic */ Handshake access$getHandshake$p(RealConnection realConnection) {
    }

    public static final /* synthetic */ void access$setSocket$p(RealConnection realConnection, Socket socket) {
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
    }

    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws IOException {
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
    }

    private final Request createTunnelRequest() throws IOException {
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
    }

    private final boolean routeMatchesAny(List<Route> list) {
    }

    private final void startHttp2(int i) throws IOException {
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
    }

    public final void cancel() {
    }

    public final void connect(int i, int i2, int i3, int i4, boolean z, Call call, EventListener eventListener) {
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
    }

    public final List<Reference<RealCall>> getCalls() {
    }

    public final RealConnectionPool getConnectionPool() {
    }

    public final long getIdleAtNs$okhttp() {
    }

    public final boolean getNoNewExchanges() {
    }

    public final int getRouteFailureCount$okhttp() {
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
    }

    public final synchronized void incrementSuccessCount$okhttp() {
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
    }

    public final boolean isHealthy(boolean z) {
    }

    public final boolean isMultiplexed$okhttp() {
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(Exchange exchange) throws SocketException {
    }

    public final synchronized void noCoalescedConnections$okhttp() {
    }

    public final synchronized void noNewExchanges$okhttp() {
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(Http2Connection http2Connection, Settings settings) {
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) throws IOException {
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
    }

    @Override // okhttp3.Connection
    public Route route() {
    }

    public final void setIdleAtNs$okhttp(long j) {
    }

    public final void setNoNewExchanges(boolean z) {
    }

    public final void setRouteFailureCount$okhttp(int i) {
    }

    @Override // okhttp3.Connection
    public Socket socket() {
    }

    public String toString() {
    }

    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
    }
}
