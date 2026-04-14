package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.conscrypt.OpenSSLCipher;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class OpenSSLEvpCipherDESEDE extends OpenSSLEvpCipher {
    private static final int DES_BLOCK_SIZE = 8;

    /* renamed from: org.conscrypt.OpenSSLEvpCipherDESEDE$1 */
    static /* synthetic */ class C18601 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Padding = null;
    }

    public static class CBC extends OpenSSLEvpCipherDESEDE {

        public static class NoPadding extends CBC {
        }

        public static class PKCS5Padding extends CBC {
        }

        CBC(OpenSSLCipher.Padding padding) {
        }
    }

    OpenSSLEvpCipherDESEDE(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedKeySize(int i) throws InvalidKeyException {
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
    }

    @Override // org.conscrypt.OpenSSLCipher
    String getBaseCipherName() {
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getCipherBlockSize() {
    }

    @Override // org.conscrypt.OpenSSLEvpCipher
    String getCipherName(int i, OpenSSLCipher.Mode mode) {
    }
}
