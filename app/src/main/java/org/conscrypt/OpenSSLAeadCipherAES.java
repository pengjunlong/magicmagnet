package org.conscrypt;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import org.conscrypt.OpenSSLCipher;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class OpenSSLAeadCipherAES extends OpenSSLAeadCipher {
    private static final int AES_BLOCK_SIZE = 16;

    public static class GCM extends OpenSSLAeadCipherAES {

        public static class AES_128 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            void checkSupportedKeySize(int i) throws InvalidKeyException {
            }
        }

        public static class AES_256 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            void checkSupportedKeySize(int i) throws InvalidKeyException {
            }
        }

        @Override // org.conscrypt.OpenSSLCipher
        void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        long getEVP_AEAD(int i) throws InvalidKeyException {
        }
    }

    public static class GCM_SIV extends OpenSSLAeadCipherAES {

        public static class AES_128 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            void checkSupportedKeySize(int i) throws InvalidKeyException {
            }
        }

        public static class AES_256 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            void checkSupportedKeySize(int i) throws InvalidKeyException {
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        boolean allowsNonceReuse() {
        }

        @Override // org.conscrypt.OpenSSLCipher
        void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        void checkSupportedTagLength(int i) throws InvalidAlgorithmParameterException {
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        long getEVP_AEAD(int i) throws InvalidKeyException {
        }
    }

    OpenSSLAeadCipherAES(OpenSSLCipher.Mode mode) {
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedKeySize(int i) throws InvalidKeyException {
    }

    @Override // org.conscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
    }

    @Override // org.conscrypt.OpenSSLCipher
    String getBaseCipherName() {
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getCipherBlockSize() {
    }

    @Override // org.conscrypt.OpenSSLAeadCipher, org.conscrypt.OpenSSLCipher
    int getOutputSizeForFinal(int i) {
    }

    @Override // org.conscrypt.OpenSSLCipher
    protected AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
    }
}
