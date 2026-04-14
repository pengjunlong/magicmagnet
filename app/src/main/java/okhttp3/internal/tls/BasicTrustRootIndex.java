package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {
    private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
    }

    public boolean equals(Object obj) {
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
    }

    public int hashCode() {
    }
}
