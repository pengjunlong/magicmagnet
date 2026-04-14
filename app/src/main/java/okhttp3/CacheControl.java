package okhttp3;

import java.util.concurrent.TimeUnit;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class CacheControl {
    public static final Companion Companion = null;
    public static final CacheControl FORCE_CACHE = null;
    public static final CacheControl FORCE_NETWORK = null;
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    @xc0
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds;
        private int maxStaleSeconds;
        private int minFreshSeconds;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
        }

        public final CacheControl build() {
        }

        public final Builder immutable() {
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
        }

        public final Builder noCache() {
        }

        public final Builder noStore() {
        }

        public final Builder noTransform() {
        }

        public final Builder onlyIfCached() {
        }
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        private final int indexOfElement(String str, String str2, int i) {
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
        }

        public final CacheControl parse(Headers headers) {
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    public static final CacheControl parse(Headers headers) {
    }

    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m898deprecated_immutable() {
    }

    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m899deprecated_maxAgeSeconds() {
    }

    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m900deprecated_maxStaleSeconds() {
    }

    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m901deprecated_minFreshSeconds() {
    }

    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m902deprecated_mustRevalidate() {
    }

    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m903deprecated_noCache() {
    }

    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m904deprecated_noStore() {
    }

    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m905deprecated_noTransform() {
    }

    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m906deprecated_onlyIfCached() {
    }

    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m907deprecated_sMaxAgeSeconds() {
    }

    public final boolean immutable() {
    }

    public final boolean isPrivate() {
    }

    public final boolean isPublic() {
    }

    public final int maxAgeSeconds() {
    }

    public final int maxStaleSeconds() {
    }

    public final int minFreshSeconds() {
    }

    public final boolean mustRevalidate() {
    }

    public final boolean noCache() {
    }

    public final boolean noStore() {
    }

    public final boolean noTransform() {
    }

    public final boolean onlyIfCached() {
    }

    public final int sMaxAgeSeconds() {
    }

    public String toString() {
    }
}
