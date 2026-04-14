package okhttp3;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = null;
    private static final byte[] COLONSPACE = null;
    private static final byte[] CRLF = null;
    public static final Companion Companion = null;
    private static final byte[] DASHDASH = null;
    public static final MediaType DIGEST = null;
    public static final MediaType FORM = null;
    public static final MediaType MIXED = null;
    public static final MediaType PARALLEL = null;
    private final qqbddbbsOSPMeeOGlgesDt1l1l1 boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    @Metadata
    public static final class Builder {
        private final qqbddbbsOSPMeeOGlgesDt1l1l1 boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
        }

        public Builder(String str) {
        }

        public final Builder addFormDataPart(String str, String str2) {
        }

        public final Builder addPart(RequestBody requestBody) {
        }

        public final MultipartBody build() {
        }

        public final Builder setType(MediaType mediaType) {
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
        }

        public final Builder addPart(Part part) {
        }

        public /* synthetic */ Builder(String str, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
        }
    }

    @xc0
    public static final class Part {
        public static final Companion Companion = null;
        private final RequestBody body;
        private final Headers headers;

        @xc0
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
            }

            public final Part create(RequestBody requestBody) {
            }

            public final Part createFormData(String str, String str2) {
            }

            public final Part create(Headers headers, RequestBody requestBody) {
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
            }
        }

        private Part(Headers headers, RequestBody requestBody) {
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
        }

        public static final Part create(RequestBody requestBody) {
        }

        public static final Part createFormData(String str, String str2) {
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
        }

        /* renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m968deprecated_body() {
        }

        /* renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m969deprecated_headers() {
        }

        public final RequestBody body() {
        }

        public final Headers headers() {
        }
    }

    public MultipartBody(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1, MediaType mediaType, List<Part> list) {
    }

    private final long writeOrCountBytes(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll, boolean z) throws IOException {
    }

    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m964deprecated_boundary() {
    }

    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m965deprecated_parts() {
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m966deprecated_size() {
    }

    /* renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m967deprecated_type() {
    }

    public final String boundary() {
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
    }

    public final Part part(int i) {
    }

    public final List<Part> parts() {
    }

    public final int size() {
    }

    public final MediaType type() {
    }

    @Override // okhttp3.RequestBody
    public void writeTo(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) throws IOException {
    }
}
