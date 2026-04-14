package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = null;
    public static final Companion Companion = null;
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    public FormBody(List<String> list, List<String> list2) {
    }

    private final long writeOrCountBytes(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll, boolean z) {
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m926deprecated_size() {
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
    }

    public final String encodedName(int i) {
    }

    public final String encodedValue(int i) {
    }

    public final String name(int i) {
    }

    public final int size() {
    }

    public final String value(int i) {
    }

    @Override // okhttp3.RequestBody
    public void writeTo(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) throws IOException {
    }

    @xc0
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
        }

        public Builder(Charset charset) {
        }

        public final Builder add(String str, String str2) {
        }

        public final Builder addEncoded(String str, String str2) {
        }

        public final FormBody build() {
        }

        public /* synthetic */ Builder(Charset charset, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }
}
