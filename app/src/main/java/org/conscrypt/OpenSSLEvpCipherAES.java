package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.conscrypt.OpenSSLCipher;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class OpenSSLEvpCipherAES extends OpenSSLEvpCipher {
    private static final int AES_BLOCK_SIZE = 16;

    /* renamed from: org.conscrypt.OpenSSLEvpCipherAES$1 */
    static /* synthetic */ class C18591 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Mode = null;
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Padding = null;
    }

    public static class AES extends OpenSSLEvpCipherAES {

        public static class CBC extends AES {

            public static class NoPadding extends CBC {
            }

            public static class PKCS5Padding extends CBC {
            }

            CBC(OpenSSLCipher.Padding padding) {
            }
        }

        public static class CTR extends AES {
        }

        public static class ECB extends AES {

            public static class NoPadding extends ECB {
            }

            public static class PKCS5Padding extends ECB {
            }

            ECB(OpenSSLCipher.Padding padding) {
            }
        }

        AES(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        }

        @Override // org.conscrypt.OpenSSLCipher
        void checkSupportedKeySize(int i) throws InvalidKeyException {
        }
    }

    public static class AES_128 extends OpenSSLEvpCipherAES {

        public static class CBC extends AES_128 {

            public static class NoPadding extends CBC {
            }

            public static class PKCS5Padding extends CBC {
            }

            CBC(OpenSSLCipher.Padding padding) {
            }
        }

        public static class CTR extends AES_128 {
        }

        public static class ECB extends AES_128 {

            public static class NoPadding extends ECB {
            }

            public static class PKCS5Padding extends ECB {
            }

            ECB(OpenSSLCipher.Padding padding) {
            }
        }

        AES_128(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        }

        @Override // org.conscrypt.OpenSSLCipher
        void checkSupportedKeySize(int i) throws InvalidKeyException {
        }
    }

    public static class AES_256 extends OpenSSLEvpCipherAES {

        public static class CBC extends AES_256 {

            public static class NoPadding extends CBC {
            }

            public static class PKCS5Padding extends CBC {
            }

            CBC(OpenSSLCipher.Padding padding) {
            }
        }

        public static class CTR extends AES_256 {
        }

        public static class ECB extends AES_256 {

            public static class NoPadding extends ECB {
            }

            public static class PKCS5Padding extends ECB {
            }

            ECB(OpenSSLCipher.Padding padding) {
            }
        }

        AES_256(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        }

        @Override // org.conscrypt.OpenSSLCipher
        void checkSupportedKeySize(int i) throws InvalidKeyException {
        }
    }

    OpenSSLEvpCipherAES(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
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
