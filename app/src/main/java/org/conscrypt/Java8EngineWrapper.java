package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class Java8EngineWrapper extends AbstractConscryptEngine {
    private final ConscryptEngine delegate;
    private BiFunction<SSLEngine, List<String>, String> selector;

    /* renamed from: org.conscrypt.Java8EngineWrapper$1 */
    class C18531 extends ApplicationProtocolSelector {
        final /* synthetic */ BiFunction val$selector;

        C18531(BiFunction biFunction) {
        }

        @Override // org.conscrypt.ApplicationProtocolSelector
        public String selectApplicationProtocol(SSLEngine sSLEngine, List<String> list) {
        }

        @Override // org.conscrypt.ApplicationProtocolSelector
        public String selectApplicationProtocol(SSLSocket sSLSocket, List<String> list) {
        }
    }

    Java8EngineWrapper(ConscryptEngine conscryptEngine) {
    }

    static SSLEngine getDelegate(SSLEngine sSLEngine) {
    }

    private static ApplicationProtocolSelector toApplicationProtocolSelector(BiFunction<SSLEngine, List<String>, String> biFunction) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void beginHandshake() throws SSLException {
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeInbound() throws SSLException {
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeOutbound() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    byte[] exportKeyingMaterial(String str, byte[] bArr, int i) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getApplicationProtocol() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    String[] getApplicationProtocols() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    byte[] getChannelId() throws SSLException {
    }

    @Override // javax.net.ssl.SSLEngine
    public Runnable getDelegatedTask() {
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getEnableSessionCreation() {
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledCipherSuites() {
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledProtocols() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getHandshakeApplicationProtocol() {
    }

    @Override // javax.net.ssl.SSLEngine
    public BiFunction<SSLEngine, List<String>, String> getHandshakeApplicationProtocolSelector() {
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    String getHostname() {
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getNeedClientAuth() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getPeerHost() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public int getPeerPort() {
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLParameters getSSLParameters() {
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLSession getSession() {
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedCipherSuites() {
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedProtocols() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    byte[] getTlsUnique() {
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getUseClientMode() {
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getWantClientAuth() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    SSLSession handshakeSession() {
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isInboundDone() {
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isOutboundDone() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    int maxSealOverhead() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    void setApplicationProtocols(String[] strArr) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    void setBufferAllocator(BufferAllocator bufferAllocator) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    void setChannelIdEnabled(boolean z) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    void setChannelIdPrivateKey(PrivateKey privateKey) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnableSessionCreation(boolean z) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledCipherSuites(String[] strArr) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledProtocols(String[] strArr) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void setHandshakeApplicationProtocolSelector(BiFunction<SSLEngine, List<String>, String> biFunction) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    void setHandshakeListener(HandshakeListener handshakeListener) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    void setHostname(String str) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void setNeedClientAuth(boolean z) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void setSSLParameters(SSLParameters sSLParameters) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void setUseClientMode(boolean z) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    void setUseSessionTickets(boolean z) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void setWantClientAuth(boolean z) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) throws SSLException {
    }
}
