package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class KeyGeneratorImpl extends KeyGeneratorSpi {
    private final String algorithm;
    private int keySizeBits;
    protected SecureRandom secureRandom;

    public static final class AES extends KeyGeneratorImpl {
        @Override // org.conscrypt.KeyGeneratorImpl
        protected void checkKeySize(int i) {
        }
    }

    public static final class ARC4 extends KeyGeneratorImpl {
        @Override // org.conscrypt.KeyGeneratorImpl
        protected void checkKeySize(int i) {
        }
    }

    public static final class ChaCha20 extends KeyGeneratorImpl {
        @Override // org.conscrypt.KeyGeneratorImpl
        protected void checkKeySize(int i) {
        }
    }

    public static final class DESEDE extends KeyGeneratorImpl {
        @Override // org.conscrypt.KeyGeneratorImpl
        protected void checkKeySize(int i) {
        }

        @Override // org.conscrypt.KeyGeneratorImpl
        protected byte[] doKeyGeneration(int i) {
        }
    }

    public static final class HmacMD5 extends KeyGeneratorImpl {
    }

    public static final class HmacSHA1 extends KeyGeneratorImpl {
    }

    public static final class HmacSHA224 extends KeyGeneratorImpl {
    }

    public static final class HmacSHA256 extends KeyGeneratorImpl {
    }

    public static final class HmacSHA384 extends KeyGeneratorImpl {
    }

    public static final class HmacSHA512 extends KeyGeneratorImpl {
    }

    /* synthetic */ KeyGeneratorImpl(String str, int i, C18551 c18551) {
    }

    protected void checkKeySize(int i) {
    }

    protected byte[] doKeyGeneration(int i) {
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected SecretKey engineGenerateKey() {
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(SecureRandom secureRandom) {
    }

    private KeyGeneratorImpl(String str, int i) {
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
    }
}
