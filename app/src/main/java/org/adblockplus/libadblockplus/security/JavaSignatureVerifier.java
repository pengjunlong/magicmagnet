package org.adblockplus.libadblockplus.security;

import java.security.PublicKey;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class JavaSignatureVerifier implements SignatureVerifier {
    public static final String KEY_ALGORITHM = "RSA";
    public static final String SIGNATURE_ALGORITHM = "SHA1withRSA";
    private String signatureAlgorithm;

    public JavaSignatureVerifier(String str) {
    }

    public static PublicKey publicKeyFromDer(String str, byte[] bArr) throws SignatureVerificationException {
    }

    @Override // org.adblockplus.libadblockplus.security.SignatureVerifier
    public boolean verify(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws SignatureVerificationException {
    }

    public JavaSignatureVerifier() {
    }
}
