package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.OpenSSLCipher;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OpenSSLAeadCipherChaCha20 extends OpenSSLAeadCipher {
    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedKeySize(int i) throws InvalidKeyException {
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
    }

    @Override // org.conscrypt.OpenSSLCipher
    String getBaseCipherName() {
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getCipherBlockSize() {
    }

    @Override // org.conscrypt.OpenSSLAeadCipher
    long getEVP_AEAD(int i) throws InvalidKeyException {
    }

    @Override // org.conscrypt.OpenSSLAeadCipher, org.conscrypt.OpenSSLCipher
    int getOutputSizeForFinal(int i) {
    }
}
