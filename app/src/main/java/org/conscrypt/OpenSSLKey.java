package org.conscrypt;

import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.conscrypt.NativeRef;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLKey {
    private final NativeRef.EVP_PKEY ctx;
    private final boolean hardwareBacked;
    private final boolean wrapped;

    OpenSSLKey(long j) {
    }

    static OpenSSLKey fromECPrivateKeyForTLSStackOnly(PrivateKey privateKey, ECParameterSpec eCParameterSpec) throws InvalidKeyException {
    }

    private static OpenSSLKey fromKeyMaterial(PrivateKey privateKey) throws InvalidKeyException {
    }

    static OpenSSLKey fromPrivateKey(PrivateKey privateKey) throws InvalidKeyException {
    }

    static OpenSSLKey fromPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) throws InvalidKeyException {
    }

    static OpenSSLKey fromPrivateKeyPemInputStream(InputStream inputStream) throws InvalidKeyException {
    }

    static OpenSSLKey fromPublicKey(PublicKey publicKey) throws InvalidKeyException {
    }

    static OpenSSLKey fromPublicKeyPemInputStream(InputStream inputStream) throws InvalidKeyException {
    }

    private static OpenSSLKey getOpenSSLKey(PrivateKey privateKey) {
    }

    private static OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) throws InvalidKeyException {
    }

    private static OpenSSLKey wrapPrivateKey(PrivateKey privateKey) throws InvalidKeyException {
    }

    public boolean equals(Object obj) {
    }

    NativeRef.EVP_PKEY getNativeRef() {
    }

    PrivateKey getPrivateKey() throws NoSuchAlgorithmException {
    }

    PublicKey getPublicKey() throws NoSuchAlgorithmException {
    }

    public int hashCode() {
    }

    boolean isHardwareBacked() {
    }

    boolean isWrapped() {
    }

    OpenSSLKey(long j, boolean z) {
    }

    OpenSSLKey(long j, boolean z, boolean z2) {
    }

    static PrivateKey getPrivateKey(PKCS8EncodedKeySpec pKCS8EncodedKeySpec, int i) throws InvalidKeySpecException {
    }

    static PublicKey getPublicKey(X509EncodedKeySpec x509EncodedKeySpec, int i) throws InvalidKeySpecException {
    }
}
