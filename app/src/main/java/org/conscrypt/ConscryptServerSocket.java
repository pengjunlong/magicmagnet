package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class ConscryptServerSocket extends SSLServerSocket {
    private boolean channelIdEnabled;
    private final SSLParametersImpl sslParameters;
    private boolean useEngineSocket;

    ConscryptServerSocket(SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    @Override // java.net.ServerSocket
    public Socket accept() throws IOException {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getEnableSessionCreation() {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getEnabledCipherSuites() {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getEnabledProtocols() {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getNeedClientAuth() {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedCipherSuites() {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedProtocols() {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getUseClientMode() {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getWantClientAuth() {
    }

    boolean isChannelIdEnabled() {
    }

    void setChannelIdEnabled(boolean z) {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnableSessionCreation(boolean z) {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnabledCipherSuites(String[] strArr) {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnabledProtocols(String[] strArr) {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setNeedClientAuth(boolean z) {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setUseClientMode(boolean z) {
    }

    ConscryptServerSocket setUseEngineSocket(boolean z) {
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setWantClientAuth(boolean z) {
    }

    ConscryptServerSocket(int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptServerSocket(int i, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    ConscryptServerSocket(int i, int i2, InetAddress inetAddress, SSLParametersImpl sSLParametersImpl) throws IOException {
    }
}
