package org.conscrypt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidKeyException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLECPublicKey implements ECPublicKey, OpenSSLKeyHolder {
    private static final String ALGORITHM = "EC";
    private static final long serialVersionUID = 3215842926808298020L;
    protected transient OpenSSLECGroupContext group;
    protected transient OpenSSLKey key;

    OpenSSLECPublicKey(OpenSSLECGroupContext openSSLECGroupContext, OpenSSLKey openSSLKey) {
    }

    static OpenSSLKey getInstance(ECPublicKey eCPublicKey) throws InvalidKeyException {
    }

    private ECPoint getPublicKey() {
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

    @Override // org.conscrypt.OpenSSLKeyHolder
    public OpenSSLKey getOpenSSLKey() {
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    OpenSSLECPublicKey(OpenSSLKey openSSLKey) {
    }

    OpenSSLECPublicKey(ECPublicKeySpec eCPublicKeySpec) throws InvalidKeySpecException {
    }
}
