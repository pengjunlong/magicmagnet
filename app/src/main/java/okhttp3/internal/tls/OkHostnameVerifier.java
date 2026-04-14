package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = null;

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
    }

    private final boolean isAscii(String str) {
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
    }

    private final boolean verifyHostname(String str, String str2) {
    }
}
