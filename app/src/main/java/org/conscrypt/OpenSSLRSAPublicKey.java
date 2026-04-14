package org.conscrypt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OpenSSLRSAPublicKey implements RSAPublicKey, OpenSSLKeyHolder {
    private static final long serialVersionUID = 123125005824688292L;
    private transient boolean fetchedParams;
    private transient OpenSSLKey key;
    private BigInteger modulus;
    private BigInteger publicExponent;

    OpenSSLRSAPublicKey(OpenSSLKey openSSLKey) {
    }

    private synchronized void ensureReadParams() {
    }

    static OpenSSLKey getInstance(RSAPublicKey rSAPublicKey) throws InvalidKeyException {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    public boolean equals(Object obj) {
    }

    @Override // java.security.Key
    public String getAlgorithm() {
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
    }

    @Override // java.security.Key
    public String getFormat() {
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
    }

    @Override // org.conscrypt.OpenSSLKeyHolder
    public OpenSSLKey getOpenSSLKey() {
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    OpenSSLRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) throws InvalidKeySpecException {
    }
}
