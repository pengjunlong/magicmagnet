package org.conscrypt;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ChainStrengthAnalyzer {
    private static final int MIN_DSA_P_LEN_BITS = 1024;
    private static final int MIN_DSA_Q_LEN_BITS = 160;
    private static final int MIN_EC_FIELD_SIZE_BITS = 160;
    private static final int MIN_RSA_MODULUS_LEN_BITS = 1024;
    private static final String[] SIGNATURE_ALGORITHM_OID_BLACKLIST = null;

    public static final void check(X509Certificate[] x509CertificateArr) throws CertificateException {
    }

    public static final void checkCert(X509Certificate x509Certificate) throws CertificateException {
    }

    private static void checkKeyLength(X509Certificate x509Certificate) throws CertificateException {
    }

    private static void checkSignatureAlgorithm(X509Certificate x509Certificate) throws CertificateException {
    }

    public static final void check(List<X509Certificate> list) throws CertificateException {
    }
}
