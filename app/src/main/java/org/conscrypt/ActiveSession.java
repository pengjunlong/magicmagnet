package org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class ActiveSession implements ConscryptSession {
    private String applicationProtocol;
    private long creationTime;
    private byte[] id;
    private long lastAccessedTime;
    private X509Certificate[] localCertificates;
    private volatile javax.security.cert.X509Certificate[] peerCertificateChain;
    private byte[] peerCertificateOcspData;
    private X509Certificate[] peerCertificates;
    private String peerHost;
    private int peerPort;
    private byte[] peerTlsSctData;
    private String protocol;
    private AbstractSessionContext sessionContext;
    private final NativeSsl ssl;

    ActiveSession(NativeSsl nativeSsl, AbstractSessionContext abstractSessionContext) {
    }

    private void checkPeerCertificatesPresent() throws SSLPeerUnverifiedException {
    }

    private void configurePeer(String str, int i, X509Certificate[] x509CertificateArr) {
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
    public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
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

    void onPeerCertificateAvailable(String str, int i) throws CertificateException {
    }

    void onPeerCertificatesReceived(String str, int i, X509Certificate[] x509CertificateArr) {
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
    }

    void setLastAccessedTime(long j) {
    }

    @Override // org.conscrypt.ConscryptSession, javax.net.ssl.SSLSession
    public X509Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
    }
}
