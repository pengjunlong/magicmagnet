package org.conscrypt;

import java.security.SecureRandomSpi;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class OpenSSLRandom extends SecureRandomSpi {
    private static final long serialVersionUID = 8506210602917522861L;

    @Override // java.security.SecureRandomSpi
    protected byte[] engineGenerateSeed(int i) {
    }

    @Override // java.security.SecureRandomSpi
    protected void engineNextBytes(byte[] bArr) {
    }

    @Override // java.security.SecureRandomSpi
    protected void engineSetSeed(byte[] bArr) {
    }
}
