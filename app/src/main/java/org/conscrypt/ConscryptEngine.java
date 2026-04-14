package org.conscrypt;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509KeyManager;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.ExternalSession;
import org.conscrypt.NativeCrypto;
import org.conscrypt.NativeSsl;
import org.conscrypt.SSLParametersImpl;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class ConscryptEngine extends AbstractConscryptEngine implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.AliasChooser, SSLParametersImpl.PSKCallbacks {
    private static final SSLEngineResult CLOSED_NOT_HANDSHAKING = null;
    private static final SSLEngineResult NEED_UNWRAP_CLOSED = null;
    private static final SSLEngineResult NEED_UNWRAP_OK = null;
    private static final SSLEngineResult NEED_WRAP_CLOSED = null;
    private static final SSLEngineResult NEED_WRAP_OK = null;
    private static BufferAllocator defaultBufferAllocator;
    private ActiveSession activeSession;
    private BufferAllocator bufferAllocator;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession;
    private boolean handshakeFinished;
    private HandshakeListener handshakeListener;
    private ByteBuffer lazyDirectBuffer;
    private int maxSealOverhead;
    private final NativeSsl.BioWrapper networkBio;
    private String peerHostname;
    private final PeerInfoProvider peerInfoProvider;
    private final ByteBuffer[] singleDstBuffer;
    private final ByteBuffer[] singleSrcBuffer;
    private final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    private int state;

    /* renamed from: org.conscrypt.ConscryptEngine$1 */
    class C18441 implements ExternalSession.Provider {
        final /* synthetic */ ConscryptEngine this$0;

        C18441(ConscryptEngine conscryptEngine) {
        }

        @Override // org.conscrypt.ExternalSession.Provider
        public ConscryptSession provideSession() {
        }
    }

    /* renamed from: org.conscrypt.ConscryptEngine$2 */
    class C18452 implements ExternalSession.Provider {
        final /* synthetic */ ConscryptEngine this$0;

        C18452(ConscryptEngine conscryptEngine) {
        }

        @Override // org.conscrypt.ExternalSession.Provider
        public ConscryptSession provideSession() {
        }
    }

    ConscryptEngine(SSLParametersImpl sSLParametersImpl) {
    }

    static /* synthetic */ ConscryptSession access$000(ConscryptEngine conscryptEngine) {
    }

    static /* synthetic */ ConscryptSession access$100(ConscryptEngine conscryptEngine) {
    }

    private void beginHandshakeInternal() throws SSLException {
    }

    private static int calcDstsLength(ByteBuffer[] byteBufferArr, int i, int i2) {
    }

    private static long calcSrcsLength(ByteBuffer[] byteBufferArr, int i, int i2) {
    }

    private ClientSessionContext clientSessionContext() {
    }

    private void closeAll() {
    }

    private void closeAndFreeResources() {
    }

    private SSLException convertException(Throwable th) {
    }

    private long directByteBufferAddress(ByteBuffer byteBuffer, int i) {
    }

    private void finishHandshake() throws SSLException {
    }

    private void freeIfDone() {
    }

    static BufferAllocator getDefaultBufferAllocator() {
    }

    private SSLEngineResult.Status getEngineStatus() {
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatusInternal() {
    }

    private ByteBuffer getOrCreateLazyDirectBuffer() {
    }

    private SSLEngineResult.HandshakeStatus handshake() throws SSLException {
    }

    private boolean isHandshakeStarted() {
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
    }

    private SSLEngineResult newResult(int i, int i2, SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine, SSLParametersImpl.AliasChooser aliasChooser) {
    }

    private SSLException newSslExceptionWithMessage(String str) {
    }

    private int pendingInboundCleartextBytes() {
    }

    private static SSLEngineResult.HandshakeStatus pendingStatus(int i) {
    }

    private ConscryptSession provideAfterHandshakeSession() {
    }

    private ConscryptSession provideHandshakeSession() {
    }

    private ConscryptSession provideSession() {
    }

    private int readEncryptedData(ByteBuffer byteBuffer, int i) throws SSLException {
    }

    private int readEncryptedDataDirect(ByteBuffer byteBuffer, int i, int i2) throws IOException {
    }

    private int readEncryptedDataHeap(ByteBuffer byteBuffer, int i) throws IOException {
    }

    private SSLEngineResult readPendingBytesFromBIO(ByteBuffer byteBuffer, int i, int i2, SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
    }

    private int readPlaintextData(ByteBuffer byteBuffer) throws IOException {
    }

    private int readPlaintextDataDirect(ByteBuffer byteBuffer, int i, int i2) throws IOException, CertificateException {
    }

    private int readPlaintextDataHeap(ByteBuffer byteBuffer, int i) throws IOException, CertificateException {
    }

    private void resetSingleDstBuffer() {
    }

    private void resetSingleSrcBuffer() {
    }

    private void sendSSLShutdown() {
    }

    private AbstractSessionContext sessionContext() {
    }

    static void setDefaultBufferAllocator(BufferAllocator bufferAllocator) {
    }

    private ByteBuffer[] singleDstBuffer(ByteBuffer byteBuffer) {
    }

    private ByteBuffer[] singleSrcBuffer(ByteBuffer byteBuffer) {
    }

    private void transitionTo(int i) {
    }

    private int writeEncryptedData(ByteBuffer byteBuffer, int i) throws SSLException {
    }

    private int writeEncryptedDataDirect(ByteBuffer byteBuffer, int i, int i2) throws IOException {
    }

    private int writeEncryptedDataHeap(ByteBuffer byteBuffer, int i, int i2) throws IOException {
    }

    private int writePlaintextData(ByteBuffer byteBuffer, int i) throws SSLException {
    }

    private int writePlaintextDataDirect(ByteBuffer byteBuffer, int i, int i2) throws IOException {
    }

    private int writePlaintextDataHeap(ByteBuffer byteBuffer, int i, int i2) throws IOException {
    }

    @Override // javax.net.ssl.SSLEngine
    public void beginHandshake() throws SSLException {
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) throws CertificateEncodingException, SSLException {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeInbound() {
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeOutbound() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    byte[] exportKeyingMaterial(String str, byte[] bArr, int i) throws SSLException {
    }

    protected void finalize() throws Throwable {
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
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    String getHostname() {
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getNeedClientAuth() {
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
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

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void onNewSessionEstablished(long j) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void onSSLStateChange(int i, int i2) {
    }

    int pendingOutboundEncryptedBytes() {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int selectApplicationProtocol(byte[] bArr) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void serverCertificateRequested() throws IOException {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public long serverSessionRequested(byte[] bArr) {
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

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void verifyCertificateChain(byte[][] bArr, String str) throws CertificateException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
    }

    void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatus(int i) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) throws SSLException {
    }

    ConscryptEngine(String str, int i, SSLParametersImpl sSLParametersImpl) {
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) throws SSLException {
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) throws SSLException {
    }

    ConscryptEngine(SSLParametersImpl sSLParametersImpl, PeerInfoProvider peerInfoProvider, SSLParametersImpl.AliasChooser aliasChooser) {
    }
}
