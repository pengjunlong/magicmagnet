package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import org.conscrypt.NativeRef;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class OpenSSLMac extends MacSpi {
    private NativeRef.HMAC_CTX ctx;
    private final long evp_md;
    private byte[] keyBytes;
    private final byte[] singleByte;
    private final int size;

    public static final class HmacMD5 extends OpenSSLMac {
    }

    public static final class HmacSHA1 extends OpenSSLMac {
    }

    public static final class HmacSHA224 extends OpenSSLMac {
    }

    public static final class HmacSHA256 extends OpenSSLMac {
    }

    public static final class HmacSHA384 extends OpenSSLMac {
    }

    public static final class HmacSHA512 extends OpenSSLMac {
    }

    /* synthetic */ OpenSSLMac(long j, int i, C18611 c18611) {
    }

    private final void resetContext() {
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b) {
    }

    private OpenSSLMac(long j, int i) {
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(ByteBuffer byteBuffer) {
    }
}
