package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.internal.tls.CertificateChainCleaner;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class CertificatePinner {
    public static final Companion Companion = null;
    public static final CertificatePinner DEFAULT = null;
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    @xc0
    public static final class Builder {
        private final List<Pin> pins;

        public final Builder add(String str, String... strArr) {
        }

        public final CertificatePinner build() {
        }

        public final List<Pin> getPins() {
        }
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final String pin(Certificate certificate) {
        }

        public final qqbddbbsOSPMeeOGlgesDt1l1l1 sha1Hash(X509Certificate x509Certificate) {
        }

        public final qqbddbbsOSPMeeOGlgesDt1l1l1 sha256Hash(X509Certificate x509Certificate) {
        }
    }

    @Metadata
    public static final class Pin {
        private final qqbddbbsOSPMeeOGlgesDt1l1l1 hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
        }

        public boolean equals(Object obj) {
        }

        public final qqbddbbsOSPMeeOGlgesDt1l1l1 getHash() {
        }

        public final String getHashAlgorithm() {
        }

        public final String getPattern() {
        }

        public int hashCode() {
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
        }

        public final boolean matchesHostname(String str) {
        }

        public String toString() {
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
    }

    public static final String pin(Certificate certificate) {
    }

    public static final qqbddbbsOSPMeeOGlgesDt1l1l1 sha1Hash(X509Certificate x509Certificate) {
    }

    public static final qqbddbbsOSPMeeOGlgesDt1l1l1 sha256Hash(X509Certificate x509Certificate) {
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
    }

    public final void check$okhttp(String str, qh<? extends List<? extends X509Certificate>> qhVar) {
    }

    public boolean equals(Object obj) {
    }

    public final List<Pin> findMatchingPins(String str) {
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
    }

    public final Set<Pin> getPins() {
    }

    public int hashCode() {
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }
}
