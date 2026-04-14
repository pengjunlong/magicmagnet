package org.conscrypt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.InvalidKeySpecException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLECPrivateKey implements ECPrivateKey, OpenSSLKeyHolder {
    private static final String ALGORITHM = "EC";
    private static final long serialVersionUID = -4036633595001083922L;
    protected transient OpenSSLECGroupContext group;
    protected transient OpenSSLKey key;

    OpenSSLECPrivateKey(OpenSSLECGroupContext openSSLECGroupContext, OpenSSLKey openSSLKey) {
    }

    static OpenSSLKey getInstance(ECPrivateKey eCPrivateKey) throws InvalidKeyException {
    }

    private BigInteger getPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    static OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) throws InvalidKeyException {
    }

    static OpenSSLKey wrapPlatformKey(ECPrivateKey eCPrivateKey) throws InvalidKeyException {
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

    @Override // org.conscrypt.OpenSSLKeyHolder
    public OpenSSLKey getOpenSSLKey() {
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    OpenSSLECPrivateKey(OpenSSLKey openSSLKey) {
    }

    private static OpenSSLKey wrapPlatformKey(ECPrivateKey eCPrivateKey, OpenSSLECGroupContext openSSLECGroupContext) throws InvalidKeyException {
    }

    static OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(PrivateKey privateKey, ECParameterSpec eCParameterSpec) throws InvalidKeyException {
    }

    OpenSSLECPrivateKey(ECPrivateKeySpec eCPrivateKeySpec) throws InvalidKeySpecException {
    }
}
