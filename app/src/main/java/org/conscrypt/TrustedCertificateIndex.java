package org.conscrypt;

import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class TrustedCertificateIndex {
    private final Map<X500Principal, List<TrustAnchor>> subjectToTrustAnchors;

    public TrustedCertificateIndex() {
    }

    private void index(Set<TrustAnchor> set) {
    }

    public Set<TrustAnchor> findAllByIssuerAndSignature(X509Certificate x509Certificate) {
    }

    public TrustAnchor findByIssuerAndSignature(X509Certificate x509Certificate) {
    }

    public TrustAnchor findBySubjectAndPublicKey(X509Certificate x509Certificate) {
    }

    public void reset() {
    }

    public TrustedCertificateIndex(Set<TrustAnchor> set) {
    }

    public TrustAnchor index(X509Certificate x509Certificate) {
    }

    public void reset(Set<TrustAnchor> set) {
    }

    public void index(TrustAnchor trustAnchor) {
    }

    private static TrustAnchor findBySubjectAndPublicKey(X509Certificate x509Certificate, Collection<TrustAnchor> collection) {
    }
}
