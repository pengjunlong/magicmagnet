package okhttp3;

import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class HttpUrl {
    public static final Companion Companion = null;
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = null;
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    @Metadata
    public static final class Builder {
        public static final Companion Companion = null;
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private String encodedPassword;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String encodedUsername;
        private String host;
        private int port;
        private String scheme;

        @xc0
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
            }

            public static final /* synthetic */ int access$parsePort(Companion companion, String str, int i, int i2) {
            }

            public static final /* synthetic */ int access$portColonOffset(Companion companion, String str, int i, int i2) {
            }

            public static final /* synthetic */ int access$schemeDelimiterOffset(Companion companion, String str, int i, int i2) {
            }

            public static final /* synthetic */ int access$slashCount(Companion companion, String str, int i, int i2) {
            }

            private final int parsePort(String str, int i, int i2) {
            }

            private final int portColonOffset(String str, int i, int i2) {
            }

            private final int schemeDelimiterOffset(String str, int i, int i2) {
            }

            private final int slashCount(String str, int i, int i2) {
            }
        }

        private final int effectivePort() {
        }

        private final boolean isDot(String str) {
        }

        private final boolean isDotDot(String str) {
        }

        private final void pop() {
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
        }

        private final void removeAllCanonicalQueryParameters(String str) {
        }

        private final void resolvePath(String str, int i, int i2) {
        }

        public final Builder addEncodedPathSegment(String str) {
        }

        public final Builder addEncodedPathSegments(String str) {
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
        }

        public final Builder addPathSegment(String str) {
        }

        public final Builder addPathSegments(String str) {
        }

        public final Builder addQueryParameter(String str, String str2) {
        }

        public final HttpUrl build() {
        }

        public final Builder encodedFragment(String str) {
        }

        public final Builder encodedPassword(String str) {
        }

        public final Builder encodedPath(String str) {
        }

        public final Builder encodedQuery(String str) {
        }

        public final Builder encodedUsername(String str) {
        }

        public final Builder fragment(String str) {
        }

        public final String getEncodedFragment$okhttp() {
        }

        public final String getEncodedPassword$okhttp() {
        }

        public final List<String> getEncodedPathSegments$okhttp() {
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
        }

        public final String getEncodedUsername$okhttp() {
        }

        public final String getHost$okhttp() {
        }

        public final int getPort$okhttp() {
        }

        public final String getScheme$okhttp() {
        }

        public final Builder host(String str) {
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
        }

        public final Builder password(String str) {
        }

        public final Builder port(int i) {
        }

        public final Builder query(String str) {
        }

        public final Builder reencodeForUri$okhttp() {
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
        }

        public final Builder removeAllQueryParameters(String str) {
        }

        public final Builder removePathSegment(int i) {
        }

        public final Builder scheme(String str) {
        }

        public final void setEncodedFragment$okhttp(String str) {
        }

        public final void setEncodedPassword$okhttp(String str) {
        }

        public final Builder setEncodedPathSegment(int i, String str) {
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
        }

        public final void setEncodedUsername$okhttp(String str) {
        }

        public final void setHost$okhttp(String str) {
        }

        public final Builder setPathSegment(int i, String str) {
        }

        public final void setPort$okhttp(int i) {
        }

        public final Builder setQueryParameter(String str, String str2) {
        }

        public final void setScheme$okhttp(String str) {
        }

        public String toString() {
        }

        public final Builder username(String str) {
        }

        private final Builder addPathSegments(String str, boolean z) {
        }
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
        }

        private final void writeCanonicalized(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        }

        private final void writePercentDecoded(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, String str, int i, int i2, boolean z) {
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m956deprecated_get(String str) {
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m959deprecated_parse(String str) {
        }

        public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        }

        public final int defaultPort(String str) {
        }

        public final HttpUrl get(String str) {
        }

        public final HttpUrl parse(String str) {
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m958deprecated_get(URL url) {
        }

        public final HttpUrl get(URL url) {
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m957deprecated_get(URI uri) {
        }

        public final HttpUrl get(URI uri) {
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
    }

    public static final /* synthetic */ char[] access$getHEX_DIGITS$cp() {
    }

    public static final int defaultPort(String str) {
    }

    public static final HttpUrl get(String str) {
    }

    public static final HttpUrl get(URI uri) {
    }

    public static final HttpUrl get(URL url) {
    }

    public static final HttpUrl parse(String str) {
    }

    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m937deprecated_encodedFragment() {
    }

    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m938deprecated_encodedPassword() {
    }

    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m939deprecated_encodedPath() {
    }

    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m940deprecated_encodedPathSegments() {
    }

    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m941deprecated_encodedQuery() {
    }

    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m942deprecated_encodedUsername() {
    }

    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m943deprecated_fragment() {
    }

    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m944deprecated_host() {
    }

    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m945deprecated_password() {
    }

    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m946deprecated_pathSegments() {
    }

    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m947deprecated_pathSize() {
    }

    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m948deprecated_port() {
    }

    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m949deprecated_query() {
    }

    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m950deprecated_queryParameterNames() {
    }

    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m951deprecated_querySize() {
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m952deprecated_scheme() {
    }

    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m953deprecated_uri() {
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m954deprecated_url() {
    }

    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m955deprecated_username() {
    }

    public final String encodedFragment() {
    }

    public final String encodedPassword() {
    }

    public final String encodedPath() {
    }

    public final List<String> encodedPathSegments() {
    }

    public final String encodedQuery() {
    }

    public final String encodedUsername() {
    }

    public boolean equals(Object obj) {
    }

    public final String fragment() {
    }

    public int hashCode() {
    }

    public final String host() {
    }

    public final boolean isHttps() {
    }

    public final Builder newBuilder() {
    }

    public final String password() {
    }

    public final List<String> pathSegments() {
    }

    public final int pathSize() {
    }

    public final int port() {
    }

    public final String query() {
    }

    public final String queryParameter(String str) {
    }

    public final String queryParameterName(int i) {
    }

    public final Set<String> queryParameterNames() {
    }

    public final String queryParameterValue(int i) {
    }

    public final List<String> queryParameterValues(String str) {
    }

    public final int querySize() {
    }

    public final String redact() {
    }

    public final HttpUrl resolve(String str) {
    }

    public final String scheme() {
    }

    public String toString() {
    }

    public final String topPrivateDomain() {
    }

    public final URI uri() {
    }

    public final URL url() {
    }

    public final String username() {
    }

    public final Builder newBuilder(String str) {
    }
}
