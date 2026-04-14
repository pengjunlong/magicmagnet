package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;
import p000.sh;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = null;
    private Reader reader;

    @Metadata
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final qbbbpbbbiFxIAmEwllll11 source;

        public BomAwareReader(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, Charset charset) {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
        }
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
        }

        public final ResponseBody create(String str, MediaType mediaType) {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, MediaType mediaType, int i, Object obj) {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, MediaType mediaType, long j, int i, Object obj) {
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
        }

        public final ResponseBody create(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, MediaType mediaType) {
        }

        public final ResponseBody create(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, MediaType mediaType, long j) {
        }

        public final ResponseBody create(MediaType mediaType, String str) {
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
        }

        public final ResponseBody create(MediaType mediaType, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
        }

        public final ResponseBody create(MediaType mediaType, long j, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) {
        }
    }

    private final Charset charset() {
    }

    private final <T> T consumeSource(sh<? super qbbbpbbbiFxIAmEwllll11, ? extends T> shVar, sh<? super T, Integer> shVar2) {
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
    }

    public static final ResponseBody create(MediaType mediaType, long j, qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11) {
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
    }

    public static final ResponseBody create(MediaType mediaType, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
    }

    public static final ResponseBody create(qbbbpbbbiFxIAmEwllll11 qbbbpbbbifxiamewllll11, MediaType mediaType, long j) {
    }

    public static final ResponseBody create(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, MediaType mediaType) {
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
    }

    public final InputStream byteStream() {
    }

    public final qqbddbbsOSPMeeOGlgesDt1l1l1 byteString() throws IOException {
    }

    public final byte[] bytes() throws IOException {
    }

    public final Reader charStream() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract qbbbpbbbiFxIAmEwllll11 source();

    public final String string() throws IOException {
    }
}
