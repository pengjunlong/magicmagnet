package org.conscrypt;

import java.util.List;
import javax.net.ssl.SNIServerName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    public Java8ExtendedSSLSession(ExternalSession externalSession) {
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final List<SNIServerName> getRequestedServerNames() {
    }
}
