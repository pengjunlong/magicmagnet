package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.sh;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion Companion = null;
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = null;
    private static final List<Protocol> DEFAULT_PROTOCOLS = null;
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    @Metadata
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
        }

        /* renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m996addInterceptor(sh<? super Interceptor.Chain, Response> shVar) {
        }

        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m997addNetworkInterceptor(sh<? super Interceptor.Chain, Response> shVar) {
        }

        public final Builder addInterceptor(Interceptor interceptor) {
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
        }

        public final Builder authenticator(Authenticator authenticator) {
        }

        public final OkHttpClient build() {
        }

        public final Builder cache(Cache cache) {
        }

        public final Builder callTimeout(long j, TimeUnit timeUnit) {
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
        }

        public final Builder connectTimeout(long j, TimeUnit timeUnit) {
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
        }

        public final Builder cookieJar(CookieJar cookieJar) {
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
        }

        public final Builder dns(Dns dns) {
        }

        public final Builder eventListener(EventListener eventListener) {
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
        }

        public final Builder followRedirects(boolean z) {
        }

        public final Builder followSslRedirects(boolean z) {
        }

        public final Authenticator getAuthenticator$okhttp() {
        }

        public final Cache getCache$okhttp() {
        }

        public final int getCallTimeout$okhttp() {
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
        }

        public final int getConnectTimeout$okhttp() {
        }

        public final ConnectionPool getConnectionPool$okhttp() {
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
        }

        public final CookieJar getCookieJar$okhttp() {
        }

        public final Dispatcher getDispatcher$okhttp() {
        }

        public final Dns getDns$okhttp() {
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
        }

        public final boolean getFollowRedirects$okhttp() {
        }

        public final boolean getFollowSslRedirects$okhttp() {
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
        }

        public final List<Interceptor> getInterceptors$okhttp() {
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
        }

        public final int getPingInterval$okhttp() {
        }

        public final List<Protocol> getProtocols$okhttp() {
        }

        public final Proxy getProxy$okhttp() {
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
        }

        public final ProxySelector getProxySelector$okhttp() {
        }

        public final int getReadTimeout$okhttp() {
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
        }

        public final SocketFactory getSocketFactory$okhttp() {
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
        }

        public final int getWriteTimeout$okhttp() {
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
        }

        public final List<Interceptor> interceptors() {
        }

        public final Builder minWebSocketMessageToCompress(long j) {
        }

        public final List<Interceptor> networkInterceptors() {
        }

        public final Builder pingInterval(long j, TimeUnit timeUnit) {
        }

        public final Builder protocols(List<? extends Protocol> list) {
        }

        public final Builder proxy(Proxy proxy) {
        }

        public final Builder proxyAuthenticator(Authenticator authenticator) {
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
        }

        public final Builder readTimeout(long j, TimeUnit timeUnit) {
        }

        public final Builder retryOnConnectionFailure(boolean z) {
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
        }

        public final void setCache$okhttp(Cache cache) {
        }

        public final void setCallTimeout$okhttp(int i) {
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
        }

        public final void setConnectTimeout$okhttp(int i) {
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
        }

        public final void setDns$okhttp(Dns dns) {
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
        }

        public final void setFollowRedirects$okhttp(boolean z) {
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
        }

        public final void setPingInterval$okhttp(int i) {
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
        }

        public final void setProxy$okhttp(Proxy proxy) {
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
        }

        public final void setReadTimeout$okhttp(int i) {
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
        }

        public final void setWriteTimeout$okhttp(int i) {
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        }

        public final Builder writeTimeout(long j, TimeUnit timeUnit) {
        }

        @IgnoreJRERequirement
        public final Builder callTimeout(Duration duration) {
        }

        @IgnoreJRERequirement
        public final Builder connectTimeout(Duration duration) {
        }

        @IgnoreJRERequirement
        public final Builder pingInterval(Duration duration) {
        }

        @IgnoreJRERequirement
        public final Builder readTimeout(Duration duration) {
        }

        @IgnoreJRERequirement
        public final Builder writeTimeout(Duration duration) {
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        }

        public Builder(OkHttpClient okHttpClient) {
        }
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
        }
    }

    public OkHttpClient(Builder builder) {
    }

    public static final /* synthetic */ List access$getDEFAULT_CONNECTION_SPECS$cp() {
    }

    public static final /* synthetic */ List access$getDEFAULT_PROTOCOLS$cp() {
    }

    public static final /* synthetic */ SSLSocketFactory access$getSslSocketFactoryOrNull$p(OkHttpClient okHttpClient) {
    }

    private final void verifyClientState() {
    }

    /* renamed from: -deprecated_authenticator, reason: not valid java name */
    public final Authenticator m970deprecated_authenticator() {
    }

    /* renamed from: -deprecated_cache, reason: not valid java name */
    public final Cache m971deprecated_cache() {
    }

    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m972deprecated_callTimeoutMillis() {
    }

    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m973deprecated_certificatePinner() {
    }

    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m974deprecated_connectTimeoutMillis() {
    }

    /* renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final ConnectionPool m975deprecated_connectionPool() {
    }

    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m976deprecated_connectionSpecs() {
    }

    /* renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final CookieJar m977deprecated_cookieJar() {
    }

    /* renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final Dispatcher m978deprecated_dispatcher() {
    }

    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m979deprecated_dns() {
    }

    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final EventListener.Factory m980deprecated_eventListenerFactory() {
    }

    /* renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m981deprecated_followRedirects() {
    }

    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m982deprecated_followSslRedirects() {
    }

    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m983deprecated_hostnameVerifier() {
    }

    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m984deprecated_interceptors() {
    }

    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m985deprecated_networkInterceptors() {
    }

    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m986deprecated_pingIntervalMillis() {
    }

    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m987deprecated_protocols() {
    }

    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m988deprecated_proxy() {
    }

    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m989deprecated_proxyAuthenticator() {
    }

    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m990deprecated_proxySelector() {
    }

    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m991deprecated_readTimeoutMillis() {
    }

    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m992deprecated_retryOnConnectionFailure() {
    }

    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m993deprecated_socketFactory() {
    }

    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m994deprecated_sslSocketFactory() {
    }

    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m995deprecated_writeTimeoutMillis() {
    }

    public final Authenticator authenticator() {
    }

    public final Cache cache() {
    }

    public final int callTimeoutMillis() {
    }

    public final CertificateChainCleaner certificateChainCleaner() {
    }

    public final CertificatePinner certificatePinner() {
    }

    public Object clone() {
    }

    public final int connectTimeoutMillis() {
    }

    public final ConnectionPool connectionPool() {
    }

    public final List<ConnectionSpec> connectionSpecs() {
    }

    public final CookieJar cookieJar() {
    }

    public final Dispatcher dispatcher() {
    }

    public final Dns dns() {
    }

    public final EventListener.Factory eventListenerFactory() {
    }

    public final boolean followRedirects() {
    }

    public final boolean followSslRedirects() {
    }

    public final RouteDatabase getRouteDatabase() {
    }

    public final HostnameVerifier hostnameVerifier() {
    }

    public final List<Interceptor> interceptors() {
    }

    public final long minWebSocketMessageToCompress() {
    }

    public final List<Interceptor> networkInterceptors() {
    }

    public Builder newBuilder() {
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
    }

    public final int pingIntervalMillis() {
    }

    public final List<Protocol> protocols() {
    }

    public final Proxy proxy() {
    }

    public final Authenticator proxyAuthenticator() {
    }

    public final ProxySelector proxySelector() {
    }

    public final int readTimeoutMillis() {
    }

    public final boolean retryOnConnectionFailure() {
    }

    public final SocketFactory socketFactory() {
    }

    public final SSLSocketFactory sslSocketFactory() {
    }

    public final int writeTimeoutMillis() {
    }

    public final X509TrustManager x509TrustManager() {
    }

    public OkHttpClient() {
    }
}
