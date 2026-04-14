package okhttp3.internal.cache;

import java.util.Date;
import okhttp3.Request;
import okhttp3.Response;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class CacheStrategy {
    public static final Companion Companion = null;
    private final Response cacheResponse;
    private final Request networkRequest;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final boolean isCacheable(Response response, Request request) {
        }
    }

    @xc0
    public static final class Factory {
        private int ageSeconds;
        private final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public Factory(long j, Request request, Response response) {
        }

        private final long cacheResponseAge() {
        }

        private final CacheStrategy computeCandidate() {
        }

        private final long computeFreshnessLifetime() {
        }

        private final boolean hasConditions(Request request) {
        }

        private final boolean isFreshnessLifetimeHeuristic() {
        }

        public final CacheStrategy compute() {
        }

        public final Request getRequest$okhttp() {
        }
    }

    public CacheStrategy(Request request, Response response) {
    }

    public final Response getCacheResponse() {
    }

    public final Request getNetworkRequest() {
    }
}
