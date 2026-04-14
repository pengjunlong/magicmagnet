package okhttp3;

import java.util.List;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Cookie {
    public static final Companion Companion = null;
    private static final Pattern DAY_OF_MONTH_PATTERN = null;
    private static final Pattern MONTH_PATTERN = null;
    private static final Pattern TIME_PATTERN = null;
    private static final Pattern YEAR_PATTERN = null;
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    @xc0
    public static final class Builder {
        private String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private String path;
        private boolean persistent;
        private boolean secure;
        private String value;

        public final Cookie build() {
        }

        public final Builder domain(String str) {
        }

        public final Builder expiresAt(long j) {
        }

        public final Builder hostOnlyDomain(String str) {
        }

        public final Builder httpOnly() {
        }

        public final Builder name(String str) {
        }

        public final Builder path(String str) {
        }

        public final Builder secure() {
        }

        public final Builder value(String str) {
        }

        private final Builder domain(String str, boolean z) {
        }
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static final /* synthetic */ boolean access$domainMatch(Companion companion, String str, String str2) {
        }

        public static final /* synthetic */ boolean access$pathMatch(Companion companion, HttpUrl httpUrl, String str) {
        }

        private final int dateCharacterOffset(String str, int i, int i2, boolean z) {
        }

        private final boolean domainMatch(String str, String str2) {
        }

        private final String parseDomain(String str) {
        }

        private final long parseExpires(String str, int i, int i2) {
        }

        private final long parseMaxAge(String str) {
        }

        private final boolean pathMatch(HttpUrl httpUrl, String str) {
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
        }

        public final Cookie parse$okhttp(long j, HttpUrl httpUrl, String str) {
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        }
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    public static final /* synthetic */ Pattern access$getDAY_OF_MONTH_PATTERN$cp() {
    }

    public static final /* synthetic */ Pattern access$getMONTH_PATTERN$cp() {
    }

    public static final /* synthetic */ Pattern access$getTIME_PATTERN$cp() {
    }

    public static final /* synthetic */ Pattern access$getYEAR_PATTERN$cp() {
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
    }

    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m916deprecated_domain() {
    }

    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m917deprecated_expiresAt() {
    }

    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m918deprecated_hostOnly() {
    }

    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m919deprecated_httpOnly() {
    }

    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m920deprecated_name() {
    }

    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m921deprecated_path() {
    }

    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m922deprecated_persistent() {
    }

    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m923deprecated_secure() {
    }

    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m924deprecated_value() {
    }

    public final String domain() {
    }

    public boolean equals(Object obj) {
    }

    public final long expiresAt() {
    }

    @IgnoreJRERequirement
    public int hashCode() {
    }

    public final boolean hostOnly() {
    }

    public final boolean httpOnly() {
    }

    public final boolean matches(HttpUrl httpUrl) {
    }

    public final String name() {
    }

    public final String path() {
    }

    public final boolean persistent() {
    }

    public final boolean secure() {
    }

    public String toString() {
    }

    public final String toString$okhttp(boolean z) {
    }

    public final String value() {
    }
}
