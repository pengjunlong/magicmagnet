package org.conscrypt;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.security.PrivateKey;
import java.util.List;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class AbstractConscryptSocket extends SSLSocket {
    private final boolean autoClose;
    private final List<HandshakeCompletedListener> listeners;
    private String peerHostname;
    private final PeerInfoProvider peerInfoProvider;
    private final int peerPort;
    private int readTimeoutMilliseconds;
    final Socket socket;

    /* renamed from: org.conscrypt.AbstractConscryptSocket$1 */
    class C18381 extends PeerInfoProvider {
        final /* synthetic */ AbstractConscryptSocket this$0;

        C18381(AbstractConscryptSocket abstractConscryptSocket) {
        }

        @Override // org.conscrypt.PeerInfoProvider
        String getHostname() {
        }

        @Override // org.conscrypt.PeerInfoProvider
        String getHostnameOrIP() {
        }

        @Override // org.conscrypt.PeerInfoProvider
        int getPort() {
        }
    }

    AbstractConscryptSocket() throws IOException {
    }

    private boolean isDelegating() {
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
    }

    final void checkOpen() throws SocketException {
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
    }

    abstract byte[] exportKeyingMaterial(String str, byte[] bArr, int i) throws SSLException;

    abstract SSLSession getActiveSession();

    @Deprecated
    abstract byte[] getAlpnSelectedProtocol();

    @Override // javax.net.ssl.SSLSocket
    public abstract String getApplicationProtocol();

    abstract String[] getApplicationProtocols();

    @Override // java.net.Socket
    public SocketChannel getChannel() {
    }

    abstract byte[] getChannelId() throws SSLException;

    public FileDescriptor getFileDescriptor$() {
    }

    @Override // javax.net.ssl.SSLSocket
    public abstract String getHandshakeApplicationProtocol();

    @Override // javax.net.ssl.SSLSocket
    public abstract SSLSession getHandshakeSession();

    String getHostname() {
    }

    String getHostnameOrIP() {
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() throws SocketException {
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
    }

    @Override // java.net.Socket
    public int getLocalPort() {
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
    }

    @Deprecated
    byte[] getNpnSelectedProtocol() {
    }

    @Override // java.net.Socket
    public boolean getOOBInline() throws SocketException {
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
    }

    @Override // java.net.Socket
    public final int getPort() {
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() throws SocketException {
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() throws SocketException {
    }

    @Override // java.net.Socket
    public int getSendBufferSize() throws SocketException {
    }

    @Override // java.net.Socket
    public int getSoLinger() throws SocketException {
    }

    @Override // java.net.Socket
    public final int getSoTimeout() throws SocketException {
    }

    int getSoWriteTimeout() throws SocketException {
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() throws SocketException {
    }

    abstract byte[] getTlsUnique();

    @Override // java.net.Socket
    public int getTrafficClass() throws SocketException {
    }

    @Override // java.net.Socket
    public boolean isBound() {
    }

    @Override // java.net.Socket
    public boolean isClosed() {
    }

    @Override // java.net.Socket
    public boolean isConnected() {
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
    }

    final void notifyHandshakeCompletedListeners() {
    }

    final PeerInfoProvider peerInfoProvider() {
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) throws IOException {
    }

    @Deprecated
    abstract void setAlpnProtocols(byte[] bArr);

    @Deprecated
    abstract void setAlpnProtocols(String[] strArr);

    abstract void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector);

    abstract void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter);

    abstract void setApplicationProtocols(String[] strArr);

    abstract void setChannelIdEnabled(boolean z);

    abstract void setChannelIdPrivateKey(PrivateKey privateKey);

    void setHandshakeTimeout(int i) throws SocketException {
    }

    void setHostname(String str) {
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) throws SocketException {
    }

    @Deprecated
    void setNpnProtocols(byte[] bArr) {
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) throws SocketException {
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int i) throws SocketException {
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) throws SocketException {
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int i) throws SocketException {
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) throws SocketException {
    }

    @Override // java.net.Socket
    public final void setSoTimeout(int i) throws SocketException {
    }

    void setSoWriteTimeout(int i) throws SocketException {
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) throws SocketException {
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) throws SocketException {
    }

    abstract void setUseSessionTickets(boolean z);

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public String toString() {
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) throws IOException {
    }

    AbstractConscryptSocket(String str, int i) throws IOException {
    }

    AbstractConscryptSocket(InetAddress inetAddress, int i) throws IOException {
    }

    AbstractConscryptSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
    }

    AbstractConscryptSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
    }

    AbstractConscryptSocket(Socket socket, String str, int i, boolean z) throws IOException {
    }
}
