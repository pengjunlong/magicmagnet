package org.conscrypt;

import java.net.Socket;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLEngine;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class DuckTypedPSKKeyManager implements PSKKeyManager {
    private final Object mDelegate;

    private DuckTypedPSKKeyManager(Object obj) {
    }

    static DuckTypedPSKKeyManager getInstance(Object obj) throws NoSuchMethodException {
    }

    @Override // org.conscrypt.PSKKeyManager
    public String chooseClientKeyIdentity(String str, Socket socket) {
    }

    @Override // org.conscrypt.PSKKeyManager
    public String chooseServerKeyIdentityHint(Socket socket) {
    }

    @Override // org.conscrypt.PSKKeyManager
    public SecretKey getKey(String str, String str2, Socket socket) {
    }

    @Override // org.conscrypt.PSKKeyManager
    public String chooseClientKeyIdentity(String str, SSLEngine sSLEngine) {
    }

    @Override // org.conscrypt.PSKKeyManager
    public String chooseServerKeyIdentityHint(SSLEngine sSLEngine) {
    }

    @Override // org.conscrypt.PSKKeyManager
    public SecretKey getKey(String str, String str2, SSLEngine sSLEngine) {
    }
}
