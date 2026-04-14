package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion = null;
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
    }

    private final Request buildRedirectRequest(Response response, String str) {
    }

    private final Request followUpRequest(Response response, Exchange exchange) throws IOException {
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request, boolean z) {
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
    }

    private final int retryAfter(Response response, int i) {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
    }
}
