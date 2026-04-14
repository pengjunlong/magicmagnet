package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.io.FileSystem;
import p000.aj1;
import p000.cl1;
import p000.kg;
import p000.lg;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = null;
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    @Metadata
    private static final class CacheResponseBody extends ResponseBody {
        private final qbbbpbbbiFxIAmEwllll11 bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        @Metadata
        /* renamed from: okhttp3.Cache$CacheResponseBody$1 */
        public static final class C17311 extends lg {
            final /* synthetic */ cl1 $source;
            final /* synthetic */ CacheResponseBody this$0;

            C17311(cl1 cl1Var, CacheResponseBody cacheResponseBody) {
            }

            @Override // p000.lg, p000.cl1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
            public void close() throws IOException {
            }
        }

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
        }

        public final DiskLruCache.Snapshot getSnapshot() {
        }

        @Override // okhttp3.ResponseBody
        public qbbbpbbbiFxIAmEwllll11 source() {
        }
    }

    @Metadata
    private final class RealCacheRequest implements CacheRequest {
        private final aj1 body;
        private final aj1 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        @Metadata
        /* renamed from: okhttp3.Cache$RealCacheRequest$1 */
        public static final class C17321 extends kg {
            final /* synthetic */ Cache this$0;
            final /* synthetic */ RealCacheRequest this$1;

            C17321(Cache cache, RealCacheRequest realCacheRequest, aj1 aj1Var) {
            }

            @Override // p000.kg, p000.aj1, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }
        }

        public RealCacheRequest(Cache cache, DiskLruCache.Editor editor) {
        }

        public static final /* synthetic */ DiskLruCache.Editor access$getEditor$p(RealCacheRequest realCacheRequest) {
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public aj1 body() {
        }

        public final boolean getDone() {
        }

        public final void setDone(boolean z) {
        }
    }

    public Cache(File file, long j, FileSystem fileSystem) {
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
    }

    public static final String key(HttpUrl httpUrl) {
    }

    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m897deprecated_directory() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final void delete() throws IOException {
    }

    public final File directory() {
    }

    public final void evictAll() throws IOException {
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
    }

    public final Response get$okhttp(Request request) {
    }

    public final DiskLruCache getCache$okhttp() {
    }

    public final int getWriteAbortCount$okhttp() {
    }

    public final int getWriteSuccessCount$okhttp() {
    }

    public final synchronized int hitCount() {
    }

    public final void initialize() throws IOException {
    }

    public final boolean isClosed() {
    }

    public final long maxSize() {
    }

    public final synchronized int networkCount() {
    }

    public final CacheRequest put$okhttp(Response response) {
    }

    public final void remove$okhttp(Request request) throws IOException {
    }

    public final synchronized int requestCount() {
    }

    public final void setWriteAbortCount$okhttp(int i) {
    }

    public final void setWriteSuccessCount$okhttp(int i) {
    }

    public final long size() throws IOException {
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
    }

    public final void update$okhttp(Response response, Response response2) {
    }

    public final Iterator<String> urls() throws IOException {
    }

    public final synchronized int writeAbortCount() {
    }

    public final synchronized int writeSuccessCount() {
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        private final Set<String> varyFields(Headers headers) {
        }

        public final boolean hasVaryAll(Response response) {
        }

        public final String key(HttpUrl httpUrl) {
        }

        public final int readInt$okhttp(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) throws IOException {
        }

        public final Headers varyHeaders(Response response) {
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
        }
    }

    public Cache(File file, long j) {
    }

    @Metadata
    private static final class Entry {
        public static final Companion Companion = null;
        private static final String RECEIVED_MILLIS = null;
        private static final String SENT_MILLIS = null;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        @xc0
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
            }
        }

        public Entry(cl1 cl1Var) throws IOException {
        }

        private final boolean isHttps() {
        }

        private final List<Certificate> readCertificateList(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) throws IOException {
        }

        private final void writeCertList(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll, List<? extends Certificate> list) throws IOException {
        }

        public final boolean matches(Request request, Response response) {
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
        }

        public Entry(Response response) {
        }
    }
}
