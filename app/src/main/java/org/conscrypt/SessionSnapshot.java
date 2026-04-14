package org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SessionSnapshot implements ConscryptSession {
    private final String applicationProtocol;
    private final String cipherSuite;
    private final long creationTime;
    private final byte[] id;
    private final long lastAccessedTime;
    private final String peerHost;
    private final int peerPort;
    private final byte[] peerTlsSctData;
    private final String protocol;
    private final String requestedServerName;
    private final SSLSessionContext sessionContext;
    private final List<byte[]> statusResponses;

    SessionSnapshot(ConscryptSession conscryptSession) {
    }

    @Override // javax.net.ssl.SSLSession
    public int getApplicationBufferSize() {
    }

    @Override // org.conscrypt.ConscryptSession
    public String getApplicationProtocol() {
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
    }

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getLocalCertificates() {
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
    }

    @Override // javax.net.ssl.SSLSession
    public int getPacketBufferSize() {
    }

    @Override // javax.net.ssl.SSLSession
    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
    }

    @Override // javax.net.ssl.SSLSession
    public /* bridge */ /* synthetic */ Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
    }

    @Override // javax.net.ssl.SSLSession
    public String getPeerHost() {
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
    }

    @Override // org.conscrypt.ConscryptSession
    public byte[] getPeerSignedCertificateTimestamp() {
    }

    @Override // javax.net.ssl.SSLSession
    public String getProtocol() {
    }

    @Override // org.conscrypt.ConscryptSession
    public String getRequestedServerName() {
    }

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
    }

    @Override // org.conscrypt.ConscryptSession
    public List<byte[]> getStatusResponses() {
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
    }

    @Override // javax.net.ssl.SSLSession
    public String[] getValueNames() {
    }

    @Override // javax.net.ssl.SSLSession
    public void invalidate() {
    }

    @Override // javax.net.ssl.SSLSession
    public boolean isValid() {
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
    }

    @Override // org.conscrypt.ConscryptSession, javax.net.ssl.SSLSession
    public java.security.cert.X509Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
    }
}
