package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    private final void logWithTime(String str) {
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response response) {
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl httpUrl) {
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j) {
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException iOException) {
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j) {
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException iOException) {
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
    }

    @xc0
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        public Factory() {
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }
}
