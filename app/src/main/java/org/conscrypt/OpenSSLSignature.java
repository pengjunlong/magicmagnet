package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.conscrypt.NativeRef;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OpenSSLSignature extends SignatureSpi {
    private NativeRef.EVP_MD_CTX ctx;
    private final EngineType engineType;
    private final long evpMdRef;
    private long evpPkeyCtx;
    private OpenSSLKey key;
    private boolean signing;
    private final byte[] singleByte;

    /* renamed from: org.conscrypt.OpenSSLSignature$1 */
    static /* synthetic */ class C18631 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLSignature$EngineType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class EngineType {
        private static final /* synthetic */ EngineType[] $VALUES = null;
        public static final EngineType EC = null;
        public static final EngineType RSA = null;

        private EngineType(String str, int i) {
        }

        public static EngineType valueOf(String str) {
        }

        public static EngineType[] values() {
        }
    }

    public static final class MD5RSA extends RSAPKCS1Padding {
    }

    static abstract class RSAPKCS1Padding extends OpenSSLSignature {
        RSAPKCS1Padding(long j) {
        }

        @Override // org.conscrypt.OpenSSLSignature
        protected final void configureEVP_PKEY_CTX(long j) throws InvalidAlgorithmParameterException {
        }
    }

    static abstract class RSAPSSPadding extends OpenSSLSignature {
        private static final int TRAILER_FIELD_BC_ID = 1;
        private final String contentDigestAlgorithm;
        private String mgf1DigestAlgorithm;
        private long mgf1EvpMdRef;
        private int saltSizeBytes;

        RSAPSSPadding(long j, String str, int i) {
        }

        @Override // org.conscrypt.OpenSSLSignature
        protected final void configureEVP_PKEY_CTX(long j) throws InvalidAlgorithmParameterException {
        }

        @Override // java.security.SignatureSpi
        protected final AlgorithmParameters engineGetParameters() {
        }

        @Override // java.security.SignatureSpi
        protected final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        }
    }

    public static final class SHA1ECDSA extends OpenSSLSignature {
    }

    public static final class SHA1RSA extends RSAPKCS1Padding {
    }

    public static final class SHA1RSAPSS extends RSAPSSPadding {
    }

    public static final class SHA224ECDSA extends OpenSSLSignature {
    }

    public static final class SHA224RSA extends RSAPKCS1Padding {
    }

    public static final class SHA224RSAPSS extends RSAPSSPadding {
    }

    public static final class SHA256ECDSA extends OpenSSLSignature {
    }

    public static final class SHA256RSA extends RSAPKCS1Padding {
    }

    public static final class SHA256RSAPSS extends RSAPSSPadding {
    }

    public static final class SHA384ECDSA extends OpenSSLSignature {
    }

    public static final class SHA384RSA extends RSAPKCS1Padding {
    }

    public static final class SHA384RSAPSS extends RSAPSSPadding {
    }

    public static final class SHA512ECDSA extends OpenSSLSignature {
    }

    public static final class SHA512RSA extends RSAPKCS1Padding {
    }

    public static final class SHA512RSAPSS extends RSAPSSPadding {
    }

    /* synthetic */ OpenSSLSignature(long j, EngineType engineType, C18631 c18631) {
    }

    private void checkEngineType(OpenSSLKey openSSLKey) throws InvalidKeyException {
    }

    private void initInternal(OpenSSLKey openSSLKey, boolean z) throws InvalidKeyException {
    }

    private void resetContext() throws InvalidAlgorithmParameterException {
    }

    protected void configureEVP_PKEY_CTX(long j) throws InvalidAlgorithmParameterException {
    }

    @Override // java.security.SignatureSpi
    @Deprecated
    protected Object engineGetParameter(String str) throws InvalidParameterException {
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
    }

    @Override // java.security.SignatureSpi
    @Deprecated
    protected void engineSetParameter(String str, Object obj) throws InvalidParameterException {
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
    }

    protected final long getEVP_PKEY_CTX() {
    }

    private OpenSSLSignature(long j, EngineType engineType) {
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(ByteBuffer byteBuffer) {
    }
}
