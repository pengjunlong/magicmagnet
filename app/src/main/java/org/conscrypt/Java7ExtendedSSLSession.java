package org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class Java7ExtendedSSLSession extends ExtendedSSLSession implements ConscryptSession {
    private static final String[] LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS = null;
    private static final String[] PEER_SUPPORTED_SIGNATURE_ALGORITHMS = null;
    protected final ExternalSession delegate;

    Java7ExtendedSSLSession(ExternalSession externalSession) {
    }

    @Override // javax.net.ssl.SSLSession
    public final int getApplicationBufferSize() {
    }

    @Override // org.conscrypt.ConscryptSession
    public String getApplicationProtocol() {
    }

    @Override // javax.net.ssl.SSLSession
    public final String getCipherSuite() {
    }

    @Override // javax.net.ssl.SSLSession
    public final long getCreationTime() {
    }

    @Override // javax.net.ssl.SSLSession
    public final byte[] getId() {
    }

    @Override // javax.net.ssl.SSLSession
    public final long getLastAccessedTime() {
    }

    @Override // javax.net.ssl.SSLSession
    public final Certificate[] getLocalCertificates() {
    }

    @Override // javax.net.ssl.SSLSession
    public final Principal getLocalPrincipal() {
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final String[] getLocalSupportedSignatureAlgorithms() {
    }

    @Override // javax.net.ssl.SSLSession
    public final int getPacketBufferSize() {
    }

    @Override // javax.net.ssl.SSLSession
    public final X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
    }

    @Override // javax.net.ssl.SSLSession
    public /* bridge */ /* synthetic */ Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
    }

    @Override // javax.net.ssl.SSLSession
    public final String getPeerHost() {
    }

    @Override // javax.net.ssl.SSLSession
    public final int getPeerPort() {
    }

    @Override // javax.net.ssl.SSLSession
    public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
    }

    @Override // org.conscrypt.ConscryptSession
    public final byte[] getPeerSignedCertificateTimestamp() {
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final String[] getPeerSupportedSignatureAlgorithms() {
    }

    @Override // javax.net.ssl.SSLSession
    public final String getProtocol() {
    }

    @Override // org.conscrypt.ConscryptSession
    public final String getRequestedServerName() {
    }

    @Override // javax.net.ssl.SSLSession
    public final SSLSessionContext getSessionContext() {
    }

    @Override // org.conscrypt.ConscryptSession
    public final List<byte[]> getStatusResponses() {
    }

    @Override // javax.net.ssl.SSLSession
    public final Object getValue(String str) {
    }

    @Override // javax.net.ssl.SSLSession
    public final String[] getValueNames() {
    }

    @Override // javax.net.ssl.SSLSession
    public final void invalidate() {
    }

    @Override // javax.net.ssl.SSLSession
    public final boolean isValid() {
    }

    @Override // javax.net.ssl.SSLSession
    public final void putValue(String str, Object obj) {
    }

    @Override // javax.net.ssl.SSLSession
    public final void removeValue(String str) {
    }

    @Override // javax.net.ssl.SSLSession, org.conscrypt.ConscryptSession
    public java.security.cert.X509Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
    }
}
