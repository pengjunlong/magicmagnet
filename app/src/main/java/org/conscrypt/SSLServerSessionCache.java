package org.conscrypt;

import javax.net.ssl.SSLSession;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
interface SSLServerSessionCache {
    byte[] getSessionData(byte[] bArr);

    void putSessionData(SSLSession sSLSession, byte[] bArr);
}
