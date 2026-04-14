package org.conscrypt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.SSLParametersImpl;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class ConscryptEngineSocket extends OpenSSLSocketImpl implements SSLParametersImpl.AliasChooser {
    private static final ByteBuffer EMPTY_BUFFER = null;
    private BufferAllocator bufferAllocator;
    private final ConscryptEngine engine;
    private final Object handshakeLock;
    private SSLInputStream in;
    private SSLOutputStream out;
    private int state;
    private final Object stateLock;

    /* renamed from: org.conscrypt.ConscryptEngineSocket$1 */
    class C18461 extends HandshakeListener {
        final /* synthetic */ ConscryptEngineSocket val$socket;

        C18461(ConscryptEngineSocket conscryptEngineSocket) {
        }

        @Override // org.conscrypt.HandshakeListener
        public void onHandshakeFinished() {
        }
    }

    /* renamed from: org.conscrypt.ConscryptEngineSocket$2 */
    class C18472 extends X509ExtendedTrustManager {
        final /* synthetic */ X509ExtendedTrustManager val$extendedDelegate;
        final /* synthetic */ ConscryptEngineSocket val$socket;

        C18472(X509ExtendedTrustManager x509ExtendedTrustManager, ConscryptEngineSocket conscryptEngineSocket) {
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }
    }

    /* renamed from: org.conscrypt.ConscryptEngineSocket$3 */
    static /* synthetic */ class C18483 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = null;
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$Status = null;
    }

    ConscryptEngineSocket(SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static /* synthetic */ void access$000(ConscryptEngineSocket conscryptEngineSocket) {
    }

    static /* synthetic */ void access$1000(ConscryptEngineSocket conscryptEngineSocket) throws IOException {
    }

    static /* synthetic */ InputStream access$1100(ConscryptEngineSocket conscryptEngineSocket) throws IOException {
    }

    static /* synthetic */ ConscryptEngine access$400(ConscryptEngineSocket conscryptEngineSocket) {
    }

    static /* synthetic */ OutputStream access$500(ConscryptEngineSocket conscryptEngineSocket) throws IOException {
    }

    static /* synthetic */ BufferAllocator access$600(ConscryptEngineSocket conscryptEngineSocket) {
    }

    static /* synthetic */ Object access$700(ConscryptEngineSocket conscryptEngineSocket) {
    }

    static /* synthetic */ int access$800(ConscryptEngineSocket conscryptEngineSocket) {
    }

    static /* synthetic */ Object access$900(ConscryptEngineSocket conscryptEngineSocket) {
    }

    private void doHandshake() throws IOException {
    }

    private void drainOutgoingQueue() {
    }

    private static X509TrustManager getDelegatingTrustManager(X509TrustManager x509TrustManager, ConscryptEngineSocket conscryptEngineSocket) {
    }

    private InputStream getUnderlyingInputStream() throws IOException {
    }

    private OutputStream getUnderlyingOutputStream() throws IOException {
    }

    private static ConscryptEngine newEngine(SSLParametersImpl sSLParametersImpl, ConscryptEngineSocket conscryptEngineSocket) {
    }

    private void onHandshakeFinished() {
    }

    private void waitForHandshake() throws IOException {
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    byte[] exportKeyingMaterial(String str, byte[] bArr, int i) throws SSLException {
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

    @Override // javax.net.ssl.SSLSocket
    public final SSLParameters getSSLParameters() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
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

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final void setApplicationProtocols(String[] strArr) {
    }

    void setBufferAllocator(BufferAllocator bufferAllocator) {
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
    public void setHandshakeTimeout(int i) throws SocketException {
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

    @Override // org.conscrypt.AbstractConscryptSocket
    final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
    }

    private final class SSLOutputStream extends OutputStream {
        private OutputStream socketOutputStream;
        private final ByteBuffer target;
        private final int targetArrayOffset;
        final /* synthetic */ ConscryptEngineSocket this$0;
        private final Object writeLock;

        SSLOutputStream(ConscryptEngineSocket conscryptEngineSocket) {
        }

        static /* synthetic */ void access$200(SSLOutputStream sSLOutputStream, ByteBuffer byteBuffer) throws IOException {
        }

        static /* synthetic */ void access$300(SSLOutputStream sSLOutputStream) throws IOException {
        }

        private void flushInternal() throws IOException {
        }

        private void init() throws IOException {
        }

        private void writeInternal(ByteBuffer byteBuffer) throws IOException {
        }

        private void writeToSocket() throws IOException {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    private final class SSLInputStream extends InputStream {
        private final AllocatedBuffer allocatedBuffer;
        private final ByteBuffer fromEngine;
        private final ByteBuffer fromSocket;
        private final int fromSocketArrayOffset;
        private final Object readLock;
        private final byte[] singleByte;
        private InputStream socketInputStream;
        final /* synthetic */ ConscryptEngineSocket this$0;

        SSLInputStream(ConscryptEngineSocket conscryptEngineSocket) {
        }

        static /* synthetic */ int access$100(SSLInputStream sSLInputStream, byte[] bArr, int i, int i2) throws IOException {
        }

        private void init() throws IOException {
        }

        private boolean isHandshakeFinished() {
        }

        private boolean isHandshaking(SSLEngineResult.HandshakeStatus handshakeStatus) {
        }

        private int processDataFromSocket(byte[] bArr, int i, int i2) throws IOException {
        }

        private int readFromSocket() throws IOException {
        }

        private int readUntilDataAvailable(byte[] bArr, int i, int i2) throws IOException {
        }

        private void renegotiate() throws IOException {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        void release() {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    ConscryptEngineSocket(String str, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptEngineSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptEngineSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptEngineSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptEngineSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) throws IOException {
    }
}
