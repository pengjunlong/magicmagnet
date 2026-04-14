package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final Request request;
    private final int writeTimeoutMillis;

    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3, int i4, int i5, Object obj) {
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
    }

    @Override // okhttp3.Interceptor.Chain
    public Connection connection() {
    }

    public final RealInterceptorChain copy$okhttp(int i, Exchange exchange, Request request, int i2, int i3, int i4) {
    }

    public final RealCall getCall$okhttp() {
    }

    public final int getConnectTimeoutMillis$okhttp() {
    }

    public final Exchange getExchange$okhttp() {
    }

    public final int getReadTimeoutMillis$okhttp() {
    }

    public final Request getRequest$okhttp() {
    }

    public final int getWriteTimeoutMillis$okhttp() {
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i, TimeUnit timeUnit) {
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i, TimeUnit timeUnit) {
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i, TimeUnit timeUnit) {
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
    }
}
