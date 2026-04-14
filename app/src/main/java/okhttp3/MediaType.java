package okhttp3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class MediaType {
    public static final Companion Companion = null;
    private static final Pattern PARAMETER = null;
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final Pattern TYPE_SUBTYPE = null;
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m962deprecated_get(String str) {
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m963deprecated_parse(String str) {
        }

        public final MediaType get(String str) {
        }

        public final MediaType parse(String str) {
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    public static final /* synthetic */ Pattern access$getPARAMETER$cp() {
    }

    public static final /* synthetic */ Pattern access$getTYPE_SUBTYPE$cp() {
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
    }

    public static final MediaType get(String str) {
    }

    public static final MediaType parse(String str) {
    }

    /* renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m960deprecated_subtype() {
    }

    /* renamed from: -deprecated_type, reason: not valid java name */
    public final String m961deprecated_type() {
    }

    public final Charset charset() {
    }

    public final Charset charset(Charset charset) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public final String parameter(String str) {
    }

    public final String subtype() {
    }

    public String toString() {
    }

    public final String type() {
    }
}
