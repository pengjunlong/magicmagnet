package org.adblockplus.libadblockplus.security;

import java.security.PublicKey;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface SignatureVerifier {
    boolean verify(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws SignatureVerificationException;
}
