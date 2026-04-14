package org.conscrypt.ct;

import java.io.InputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DigitallySigned {
    private final HashAlgorithm hashAlgorithm;
    private final byte[] signature;
    private final SignatureAlgorithm signatureAlgorithm;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class HashAlgorithm {
        private static final /* synthetic */ HashAlgorithm[] $VALUES = null;
        public static final HashAlgorithm MD5 = null;
        public static final HashAlgorithm NONE = null;
        public static final HashAlgorithm SHA1 = null;
        public static final HashAlgorithm SHA224 = null;
        public static final HashAlgorithm SHA256 = null;
        public static final HashAlgorithm SHA384 = null;
        public static final HashAlgorithm SHA512 = null;
        private static HashAlgorithm[] values;

        private HashAlgorithm(String str, int i) {
        }

        public static HashAlgorithm valueOf(String str) {
        }

        public static HashAlgorithm[] values() {
        }

        public static HashAlgorithm valueOf(int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class SignatureAlgorithm {
        private static final /* synthetic */ SignatureAlgorithm[] $VALUES = null;
        public static final SignatureAlgorithm ANONYMOUS = null;
        public static final SignatureAlgorithm DSA = null;
        public static final SignatureAlgorithm ECDSA = null;
        public static final SignatureAlgorithm RSA = null;
        private static SignatureAlgorithm[] values;

        private SignatureAlgorithm(String str, int i) {
        }

        public static SignatureAlgorithm valueOf(String str) {
        }

        public static SignatureAlgorithm[] values() {
        }

        public static SignatureAlgorithm valueOf(int i) {
        }
    }

    public DigitallySigned(HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
    }

    public static DigitallySigned decode(InputStream inputStream) throws SerializationException {
    }

    public String getAlgorithm() {
    }

    public HashAlgorithm getHashAlgorithm() {
    }

    public byte[] getSignature() {
    }

    public SignatureAlgorithm getSignatureAlgorithm() {
    }

    public DigitallySigned(int i, int i2, byte[] bArr) {
    }

    public static DigitallySigned decode(byte[] bArr) throws SerializationException {
    }
}
