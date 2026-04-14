package org.conscrypt;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DefaultSSLContextImpl extends OpenSSLContextImpl {
    private static KeyManager[] KEY_MANAGERS;
    private static TrustManager[] TRUST_MANAGERS;

    public static final class TLSv12 extends DefaultSSLContextImpl {
    }

    public static final class TLSv13 extends DefaultSSLContextImpl {
    }

    /* synthetic */ DefaultSSLContextImpl(String[] strArr, C18511 c18511) throws GeneralSecurityException, IOException {
    }

    @Override // org.conscrypt.OpenSSLContextImpl, javax.net.ssl.SSLContextSpi
    public void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) throws KeyManagementException {
    }

    KeyManager[] getKeyManagers() throws GeneralSecurityException, IOException {
    }

    TrustManager[] getTrustManagers() throws GeneralSecurityException, IOException {
    }

    private DefaultSSLContextImpl(String[] strArr) throws GeneralSecurityException, IOException {
    }
}
