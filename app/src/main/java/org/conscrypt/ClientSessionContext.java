package org.conscrypt;

import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ClientSessionContext extends AbstractSessionContext {
    private SSLClientSessionCache persistentCache;
    private final Map<HostAndPort, List<NativeSslSession>> sessionsByHostAndPort;

    private static final class HostAndPort {
        final String host;
        final int port;

        HostAndPort(String str, int i) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    ClientSessionContext() {
    }

    private NativeSslSession getSession(String str, int i) {
    }

    private void putSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
    }

    private void removeSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
    }

    synchronized NativeSslSession getCachedSession(String str, int i, SSLParametersImpl sSLParametersImpl) {
    }

    @Override // org.conscrypt.AbstractSessionContext
    NativeSslSession getSessionFromPersistentCache(byte[] bArr) {
    }

    @Override // org.conscrypt.AbstractSessionContext
    void onBeforeAddSession(NativeSslSession nativeSslSession) {
    }

    @Override // org.conscrypt.AbstractSessionContext
    void onBeforeRemoveSession(NativeSslSession nativeSslSession) {
    }

    public void setPersistentCache(SSLClientSessionCache sSLClientSessionCache) {
    }

    int size() {
    }
}
