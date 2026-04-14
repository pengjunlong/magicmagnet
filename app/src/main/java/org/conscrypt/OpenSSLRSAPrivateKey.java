package org.conscrypt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class OpenSSLRSAPrivateKey implements RSAPrivateKey, OpenSSLKeyHolder {
    private static final long serialVersionUID = 4872170254439578735L;
    transient boolean fetchedParams;
    transient OpenSSLKey key;
    BigInteger modulus;
    BigInteger privateExponent;

    OpenSSLRSAPrivateKey(OpenSSLKey openSSLKey) {
    }

    static OpenSSLRSAPrivateKey getInstance(OpenSSLKey openSSLKey) {
    }

    private static OpenSSLKey init(RSAPrivateKeySpec rSAPrivateKeySpec) throws InvalidKeySpecException {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    static OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) throws InvalidKeyException {
    }

    static OpenSSLKey wrapPlatformKey(RSAPrivateKey rSAPrivateKey) throws InvalidKeyException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    final synchronized void ensureReadParams() {
    }

    public boolean equals(Object obj) {
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
    }

    @Override // java.security.Key
    public final String getFormat() {
    }

    @Override // java.security.interfaces.RSAKey
    public final BigInteger getModulus() {
    }

    @Override // org.conscrypt.OpenSSLKeyHolder
    public OpenSSLKey getOpenSSLKey() {
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public final BigInteger getPrivateExponent() {
    }

    public int hashCode() {
    }

    void readParams(byte[][] bArr) {
    }

    public String toString() {
    }

    OpenSSLRSAPrivateKey(OpenSSLKey openSSLKey, byte[][] bArr) {
    }

    static OpenSSLKey getInstance(RSAPrivateKey rSAPrivateKey) throws InvalidKeyException {
    }

    public OpenSSLRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) throws InvalidKeySpecException {
    }
}
