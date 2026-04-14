package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    public static final Companion Companion = null;
    private static final int MAX_SIGNERS = 9;
    private final TrustRootIndex trustRootIndex;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
    }

    private final boolean verifySignature(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public List<Certificate> clean(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }
}
