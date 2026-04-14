package org.conscrypt;

import java.security.NoSuchAlgorithmException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class EvpMdRef {
    static final String MGF1_ALGORITHM_NAME = "MGF1";
    static final String MGF1_OID = "1.2.840.113549.1.1.8";

    static final class MD5 {
        static final long EVP_MD = 0;
        static final String JCA_NAME = "MD5";
        static final String OID = "1.2.840.113549.2.5";
        static final int SIZE_BYTES = 0;

        private MD5() {
        }
    }

    static final class SHA1 {
        static final long EVP_MD = 0;
        static final String JCA_NAME = "SHA-1";
        static final String OID = "1.3.14.3.2.26";
        static final int SIZE_BYTES = 0;

        private SHA1() {
        }
    }

    static final class SHA224 {
        static final long EVP_MD = 0;
        static final String JCA_NAME = "SHA-224";
        static final String OID = "2.16.840.1.101.3.4.2.4";
        static final int SIZE_BYTES = 0;

        private SHA224() {
        }
    }

    static final class SHA256 {
        static final long EVP_MD = 0;
        static final String JCA_NAME = "SHA-256";
        static final String OID = "2.16.840.1.101.3.4.2.1";
        static final int SIZE_BYTES = 0;

        private SHA256() {
        }
    }

    static final class SHA384 {
        static final long EVP_MD = 0;
        static final String JCA_NAME = "SHA-384";
        static final String OID = "2.16.840.1.101.3.4.2.2";
        static final int SIZE_BYTES = 0;

        private SHA384() {
        }
    }

    static final class SHA512 {
        static final long EVP_MD = 0;
        static final String JCA_NAME = "SHA-512";
        static final String OID = "2.16.840.1.101.3.4.2.3";
        static final int SIZE_BYTES = 0;

        private SHA512() {
        }
    }

    private EvpMdRef() {
    }

    static int getDigestSizeBytesByJcaDigestAlgorithmStandardName(String str) throws NoSuchAlgorithmException {
    }

    static long getEVP_MDByJcaDigestAlgorithmStandardName(String str) throws NoSuchAlgorithmException {
    }

    static String getJcaDigestAlgorithmStandardName(String str) {
    }

    static String getJcaDigestAlgorithmStandardNameFromEVP_MD(long j) {
    }
}
