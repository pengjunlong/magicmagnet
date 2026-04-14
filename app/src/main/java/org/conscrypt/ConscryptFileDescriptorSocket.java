package org.conscrypt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509KeyManager;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.ExternalSession;
import org.conscrypt.NativeCrypto;
import org.conscrypt.SSLParametersImpl;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class ConscryptFileDescriptorSocket extends OpenSSLSocketImpl implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.PSKCallbacks, SSLParametersImpl.AliasChooser {
    private static final boolean DBG_STATE = false;
    private final ActiveSession activeSession;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession;
    private final Object guard;
    private int handshakeTimeoutMilliseconds;
    private SSLInputStream is;
    private SSLOutputStream os;
    private final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    private int state;
    private int writeTimeoutMilliseconds;

    /* renamed from: org.conscrypt.ConscryptFileDescriptorSocket$1 */
    class C18491 implements ExternalSession.Provider {
        final /* synthetic */ ConscryptFileDescriptorSocket this$0;

        C18491(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
        }

        @Override // org.conscrypt.ExternalSession.Provider
        public ConscryptSession provideSession() {
        }
    }

    /* renamed from: org.conscrypt.ConscryptFileDescriptorSocket$2 */
    class C18502 implements ExternalSession.Provider {
        final /* synthetic */ ConscryptFileDescriptorSocket this$0;

        C18502(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
        }

        @Override // org.conscrypt.ExternalSession.Provider
        public ConscryptSession provideSession() {
        }
    }

    private class SSLOutputStream extends OutputStream {
        final /* synthetic */ ConscryptFileDescriptorSocket this$0;
        private final Object writeLock;

        SSLOutputStream(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
        }

        void awaitPendingOps() {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    ConscryptFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static /* synthetic */ ConscryptSession access$000(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
    }

    static /* synthetic */ NativeSsl access$100(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
    }

    static /* synthetic */ int access$200(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
    }

    static /* synthetic */ int access$300(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
    }

    static /* synthetic */ ConscryptSession access$400(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
    }

    private void assertReadableOrWriteableState() {
    }

    private ClientSessionContext clientSessionContext() {
    }

    private void closeUnderlyingSocket() throws IOException {
    }

    private void free() {
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) throws SSLException {
    }

    private ConscryptSession provideAfterHandshakeSession() {
    }

    private ConscryptSession provideHandshakeSession() {
    }

    private ConscryptSession provideSession() {
    }

    private AbstractSessionContext sessionContext() {
    }

    private void shutdownAndFreeSslNative() throws IOException {
    }

    private void transitionTo(int i) {
    }

    private void waitForHandshake() throws IOException {
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) throws CertificateEncodingException, SSLException {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    byte[] exportKeyingMaterial(String str, byte[] bArr, int i) throws SSLException {
    }

    protected final void finalize() throws Throwable {
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final SSLSession getActiveSession() {
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getApplicationProtocol() {
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final String[] getApplicationProtocols() {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final byte[] getChannelId() throws SSLException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getHandshakeApplicationProtocol() {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final SSLSession getHandshakeSession() {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final InputStream getInputStream() throws IOException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final OutputStream getOutputStream() throws IOException {
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLParameters getSSLParameters() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final int getSoWriteTimeout() throws SocketException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    byte[] getTlsUnique() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void onNewSessionEstablished(long j) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void onSSLStateChange(int i, int i2) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int selectApplicationProtocol(byte[] bArr) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void serverCertificateRequested() throws IOException {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final long serverSessionRequested(byte[] bArr) {
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final void setApplicationProtocols(String[] strArr) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdEnabled(boolean z) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setHandshakeTimeout(int i) throws SocketException {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setHostname(String str) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setSSLParameters(SSLParameters sSLParameters) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setSoWriteTimeout(int i) throws SocketException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setUseSessionTickets(boolean z) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() throws IOException {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void verifyCertificateChain(byte[][] bArr, String str) throws CertificateException {
    }

    private class SSLInputStream extends InputStream {
        private final Object readLock;
        final /* synthetic */ ConscryptFileDescriptorSocket this$0;

        SSLInputStream(ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
        }

        @Override // java.io.InputStream
        public int available() {
        }

        void awaitPendingOps() {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
    }

    ConscryptFileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptFileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptFileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptFileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptFileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) throws IOException {
    }
}
