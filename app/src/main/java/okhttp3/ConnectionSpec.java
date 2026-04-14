package okhttp3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES = null;
    public static final ConnectionSpec CLEARTEXT = null;
    public static final ConnectionSpec COMPATIBLE_TLS = null;
    public static final Companion Companion = null;
    public static final ConnectionSpec MODERN_TLS = null;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES = null;
    public static final ConnectionSpec RESTRICTED_TLS = null;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
    }

    public static final /* synthetic */ String[] access$getCipherSuitesAsString$p(ConnectionSpec connectionSpec) {
    }

    public static final /* synthetic */ String[] access$getTlsVersionsAsString$p(ConnectionSpec connectionSpec) {
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z) {
    }

    /* renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final List<CipherSuite> m913deprecated_cipherSuites() {
    }

    /* renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m914deprecated_supportsTlsExtensions() {
    }

    /* renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final List<TlsVersion> m915deprecated_tlsVersions() {
    }

    public final void apply$okhttp(SSLSocket sSLSocket, boolean z) {
    }

    public final List<CipherSuite> cipherSuites() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public final boolean isCompatible(SSLSocket sSLSocket) {
    }

    public final boolean isTls() {
    }

    public final boolean supportsTlsExtensions() {
    }

    public final List<TlsVersion> tlsVersions() {
    }

    public String toString() {
    }

    @xc0
    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public Builder(boolean z) {
        }

        public final Builder allEnabledCipherSuites() {
        }

        public final Builder allEnabledTlsVersions() {
        }

        public final ConnectionSpec build() {
        }

        public final Builder cipherSuites(CipherSuite... cipherSuiteArr) {
        }

        public final String[] getCipherSuites$okhttp() {
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
        }

        public final boolean getTls$okhttp() {
        }

        public final String[] getTlsVersions$okhttp() {
        }

        public final void setCipherSuites$okhttp(String[] strArr) {
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
        }

        public final void setTls$okhttp(boolean z) {
        }

        public final void setTlsVersions$okhttp(String[] strArr) {
        }

        public final Builder supportsTlsExtensions(boolean z) {
        }

        public final Builder tlsVersions(TlsVersion... tlsVersionArr) {
        }

        public Builder(ConnectionSpec connectionSpec) {
        }

        public final Builder cipherSuites(String... strArr) {
        }

        public final Builder tlsVersions(String... strArr) {
        }
    }
}
