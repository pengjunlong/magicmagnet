package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.MessageDigestSpi;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.NativeRef;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OpenSSLMessageDigestJDK extends MessageDigestSpi implements Cloneable {
    private final NativeRef.EVP_MD_CTX ctx;
    private boolean digestInitializedInContext;
    private final long evp_md;
    private final byte[] singleByte;
    private final int size;

    public static final class MD5 extends OpenSSLMessageDigestJDK {
    }

    public static final class SHA1 extends OpenSSLMessageDigestJDK {
    }

    public static final class SHA224 extends OpenSSLMessageDigestJDK {
    }

    public static final class SHA256 extends OpenSSLMessageDigestJDK {
    }

    public static final class SHA384 extends OpenSSLMessageDigestJDK {
    }

    public static final class SHA512 extends OpenSSLMessageDigestJDK {
    }

    /* synthetic */ OpenSSLMessageDigestJDK(long j, int i, C18621 c18621) throws NoSuchAlgorithmException {
    }

    private synchronized void ensureDigestInitializedInContext() {
    }

    @Override // java.security.MessageDigestSpi
    public Object clone() {
    }

    @Override // java.security.MessageDigestSpi
    protected synchronized byte[] engineDigest() {
    }

    @Override // java.security.MessageDigestSpi
    protected int engineGetDigestLength() {
    }

    @Override // java.security.MessageDigestSpi
    protected synchronized void engineReset() {
    }

    @Override // java.security.MessageDigestSpi
    protected synchronized void engineUpdate(byte b) {
    }

    private OpenSSLMessageDigestJDK(long j, int i) throws NoSuchAlgorithmException {
    }

    @Override // java.security.MessageDigestSpi
    protected synchronized void engineUpdate(byte[] bArr, int i, int i2) {
    }

    @Override // java.security.MessageDigestSpi
    protected synchronized void engineUpdate(ByteBuffer byteBuffer) {
    }

    private OpenSSLMessageDigestJDK(long j, int i, NativeRef.EVP_MD_CTX evp_md_ctx, boolean z) {
    }
}
