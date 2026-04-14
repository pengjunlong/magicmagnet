package org.conscrypt;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class KitKatPlatformOpenSSLSocketImplAdapter extends com.android.org.conscrypt.OpenSSLSocketImpl {
    private final AbstractConscryptSocket delegate;

    public KitKatPlatformOpenSSLSocketImplAdapter(AbstractConscryptSocket abstractConscryptSocket) throws IOException {
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    public void bind(SocketAddress socketAddress) throws IOException {
    }

    public void clientCertificateRequested(byte[] bArr, byte[][] bArr2) throws CertificateEncodingException, SSLException {
    }

    public void close() throws IOException {
    }

    public void connect(SocketAddress socketAddress, int i) throws IOException {
    }

    public byte[] getAlpnSelectedProtocol() {
    }

    public SocketChannel getChannel() {
    }

    public byte[] getChannelId() throws SSLException {
    }

    public boolean getEnableSessionCreation() {
    }

    public String[] getEnabledCipherSuites() {
    }

    public String[] getEnabledProtocols() {
    }

    public FileDescriptor getFileDescriptor$() {
    }

    public InetAddress getInetAddress() {
    }

    public InputStream getInputStream() throws IOException {
    }

    public boolean getKeepAlive() throws SocketException {
    }

    public InetAddress getLocalAddress() {
    }

    public int getLocalPort() {
    }

    public SocketAddress getLocalSocketAddress() {
    }

    public boolean getNeedClientAuth() {
    }

    public byte[] getNpnSelectedProtocol() {
    }

    public boolean getOOBInline() throws SocketException {
    }

    public OutputStream getOutputStream() throws IOException {
    }

    public int getPort() {
    }

    public int getReceiveBufferSize() throws SocketException {
    }

    public SocketAddress getRemoteSocketAddress() {
    }

    public boolean getReuseAddress() throws SocketException {
    }

    public SSLParameters getSSLParameters() {
    }

    public int getSendBufferSize() throws SocketException {
    }

    public SSLSession getSession() {
    }

    public int getSoLinger() throws SocketException {
    }

    public int getSoTimeout() throws SocketException {
    }

    public int getSoWriteTimeout() throws SocketException {
    }

    public String[] getSupportedCipherSuites() {
    }

    public String[] getSupportedProtocols() {
    }

    public boolean getTcpNoDelay() throws SocketException {
    }

    public int getTrafficClass() throws SocketException {
    }

    public boolean getUseClientMode() {
    }

    public boolean getWantClientAuth() {
    }

    public void handshakeCompleted() {
    }

    public boolean isBound() {
    }

    public boolean isClosed() {
    }

    public boolean isConnected() {
    }

    public boolean isInputShutdown() {
    }

    public boolean isOutputShutdown() {
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    public void sendUrgentData(int i) throws IOException {
    }

    public void setAlpnProtocols(byte[] bArr) {
    }

    public void setChannelIdEnabled(boolean z) {
    }

    public void setChannelIdPrivateKey(PrivateKey privateKey) {
    }

    public void setEnableSessionCreation(boolean z) {
    }

    public void setEnabledCipherSuites(String[] strArr) {
    }

    public void setEnabledProtocols(String[] strArr) {
    }

    public void setHandshakeTimeout(int i) throws SocketException {
    }

    public void setHostname(String str) {
    }

    public void setKeepAlive(boolean z) throws SocketException {
    }

    public void setNeedClientAuth(boolean z) {
    }

    public void setNpnProtocols(byte[] bArr) {
    }

    public void setOOBInline(boolean z) throws SocketException {
    }

    public void setPerformancePreferences(int i, int i2, int i3) {
    }

    public void setReceiveBufferSize(int i) throws SocketException {
    }

    public void setReuseAddress(boolean z) throws SocketException {
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
    }

    public void setSendBufferSize(int i) throws SocketException {
    }

    public void setSoLinger(boolean z, int i) throws SocketException {
    }

    public void setSoTimeout(int i) throws SocketException {
    }

    public void setSoWriteTimeout(int i) throws SocketException {
    }

    public void setTcpNoDelay(boolean z) throws SocketException {
    }

    public void setTrafficClass(int i) throws SocketException {
    }

    public void setUseClientMode(boolean z) {
    }

    public void setUseSessionTickets(boolean z) {
    }

    public void setWantClientAuth(boolean z) {
    }

    public void shutdownInput() throws IOException {
    }

    public void shutdownOutput() throws IOException {
    }

    public void startHandshake() throws IOException {
    }

    public String toString() {
    }

    public void verifyCertificateChain(byte[][] bArr, String str) throws CertificateException {
    }

    public void connect(SocketAddress socketAddress) throws IOException {
    }
}
