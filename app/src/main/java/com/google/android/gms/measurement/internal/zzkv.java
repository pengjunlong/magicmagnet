package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class zzkv extends SSLSocket {
    private final SSLSocket zza;

    zzkv(zzkw zzkwVar, SSLSocket sSLSocket) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) throws IOException {
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
    }

    public final boolean equals(Object obj) {
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
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

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() throws IOException {
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() throws SocketException {
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() throws SocketException {
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() throws IOException {
    }

    @Override // java.net.Socket
    public final int getPort() {
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() throws SocketException {
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() throws SocketException {
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() throws SocketException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
    }

    @Override // java.net.Socket
    public final int getSoLinger() throws SocketException {
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() throws SocketException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() throws SocketException {
    }

    @Override // java.net.Socket
    public final int getTrafficClass() throws SocketException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
    }

    @Override // java.net.Socket
    public final boolean isBound() {
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) throws IOException {
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

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) throws SocketException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z) {
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) throws SocketException {
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) throws SocketException {
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i) throws SocketException {
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) throws SocketException {
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i) throws SocketException {
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) throws SocketException {
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) throws SocketException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z) {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z) {
    }

    @Override // java.net.Socket
    public final void shutdownInput() throws IOException {
    }

    @Override // java.net.Socket
    public final void shutdownOutput() throws IOException {
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() throws IOException {
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public final String toString() {
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) throws IOException {
    }
}
