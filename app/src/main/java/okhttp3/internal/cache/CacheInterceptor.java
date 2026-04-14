package okhttp3.internal.cache;

import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Response;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = null;
    private final Cache cache;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static final /* synthetic */ Headers access$combine(Companion companion, Headers headers, Headers headers2) {
        }

        public static final /* synthetic */ Response access$stripBody(Companion companion, Response response) {
        }

        private final Headers combine(Headers headers, Headers headers2) {
        }

        private final boolean isContentSpecificHeader(String str) {
        }

        private final boolean isEndToEnd(String str) {
        }

        private final Response stripBody(Response response) {
        }
    }

    public CacheInterceptor(Cache cache) {
    }

    private final Response cacheWritingResponse(CacheRequest cacheRequest, Response response) throws IOException {
    }

    public final Cache getCache$okhttp() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
    }
}
