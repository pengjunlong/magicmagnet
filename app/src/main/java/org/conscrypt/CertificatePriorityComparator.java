package org.conscrypt;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Comparator;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class CertificatePriorityComparator implements Comparator<X509Certificate> {
    private static final Map<String, Integer> ALGORITHM_OID_PRIORITY_MAP = null;
    private static final Integer PRIORITY_MD5 = null;
    private static final Integer PRIORITY_SHA1 = null;
    private static final Integer PRIORITY_SHA224 = null;
    private static final Integer PRIORITY_SHA256 = null;
    private static final Integer PRIORITY_SHA384 = null;
    private static final Integer PRIORITY_SHA512 = null;
    private static final Integer PRIORITY_UNKNOWN = null;

    private int compareKeyAlgorithm(PublicKey publicKey, PublicKey publicKey2) {
    }

    private int compareKeySize(PublicKey publicKey, PublicKey publicKey2) {
    }

    private int compareSignatureAlgorithm(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
    }

    private int compareStrength(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
    }

    private int getKeySize(PublicKey publicKey) {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
    }
}
