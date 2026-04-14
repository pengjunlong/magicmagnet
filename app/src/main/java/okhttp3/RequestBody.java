package okhttp3;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class RequestBody {
    public static final Companion Companion = null;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
        }

        public final RequestBody create(String str, MediaType mediaType) {
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr) {
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        }

        public final RequestBody create(byte[] bArr) {
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, MediaType mediaType, int i, Object obj) {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
        }

        public final RequestBody create(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, MediaType mediaType) {
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        }

        public final RequestBody create(File file, MediaType mediaType) {
        }

        public final RequestBody create(MediaType mediaType, String str) {
        }

        public final RequestBody create(MediaType mediaType, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        }

        public final RequestBody create(MediaType mediaType, File file) {
        }
    }

    public static final RequestBody create(File file, MediaType mediaType) {
    }

    public static final RequestBody create(String str, MediaType mediaType) {
    }

    public static final RequestBody create(MediaType mediaType, File file) {
    }

    public static final RequestBody create(MediaType mediaType, String str) {
    }

    public static final RequestBody create(MediaType mediaType, qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) {
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
    }

    public static final RequestBody create(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, MediaType mediaType) {
    }

    public static final RequestBody create(byte[] bArr) {
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
    }

    public long contentLength() throws IOException {
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
    }

    public boolean isOneShot() {
    }

    public abstract void writeTo(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) throws IOException;
}
