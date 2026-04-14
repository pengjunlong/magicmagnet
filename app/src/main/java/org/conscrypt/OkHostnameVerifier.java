package org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSession;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class OkHostnameVerifier implements ConscryptHostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = null;
    private static final Pattern VERIFY_AS_IP_ADDRESS = null;
    private final boolean strictWildcardMode;

    private OkHostnameVerifier(boolean z) {
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) {
    }

    private static List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
    }

    public static OkHostnameVerifier strictInstance() {
    }

    static boolean verifyAsIpAddress(String str) {
    }

    private boolean verifyHostName(String str, X509Certificate x509Certificate) {
    }

    private boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
    }

    @Override // org.conscrypt.ConscryptHostnameVerifier
    public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
    }

    private boolean verifyHostName(String str, String str2) {
    }

    public boolean verify(String str, X509Certificate x509Certificate) {
    }
}
