package okhttp3.logging;

import java.io.IOException;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Response;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @xc0
    public static final class Level {
        private static final /* synthetic */ Level[] $VALUES = null;
        public static final Level BASIC = null;
        public static final Level BODY = null;
        public static final Level HEADERS = null;
        public static final Level NONE = null;

        private static final /* synthetic */ Level[] $values() {
        }

        private Level(String str, int i) {
        }

        public static Level valueOf(String str) {
        }

        public static Level[] values() {
        }
    }

    @Metadata
    public interface Logger {
        public static final Companion Companion = null;
        public static final Logger DEFAULT = null;

        @xc0
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;

            @Metadata
            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String str) {
                }
            }

            private Companion() {
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
    }

    public HttpLoggingInterceptor(Logger logger) {
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
    }

    private final void logHeader(Headers headers, int i) {
    }

    /* renamed from: -deprecated_level, reason: not valid java name */
    public final Level m1022deprecated_level() {
    }

    public final Level getLevel() {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
    }

    public final void level(Level level) {
    }

    public final void redactHeader(String str) {
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }
}
