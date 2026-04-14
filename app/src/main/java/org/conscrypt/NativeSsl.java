package org.conscrypt;

import java.io.FileDescriptor;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import org.conscrypt.NativeCrypto;
import org.conscrypt.SSLParametersImpl;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class NativeSsl {
    private final SSLParametersImpl.AliasChooser aliasChooser;
    private final NativeCrypto.SSLHandshakeCallbacks handshakeCallbacks;
    private X509Certificate[] localCertificates;
    private final ReadWriteLock lock;
    private final SSLParametersImpl parameters;
    private final SSLParametersImpl.PSKCallbacks pskCallbacks;
    private volatile long ssl;

    final class BioWrapper {
        private volatile long bio;
        final /* synthetic */ NativeSsl this$0;

        /* synthetic */ BioWrapper(NativeSsl nativeSsl, C18561 c18561) throws SSLException {
        }

        void close() {
        }

        int getPendingWrittenBytes() {
        }

        int readDirectByteBuffer(long j, int i) throws IOException {
        }

        int writeDirectByteBuffer(long j, int i) throws IOException {
        }

        private BioWrapper(NativeSsl nativeSsl) throws SSLException {
        }
    }

    private NativeSsl(long j, SSLParametersImpl sSLParametersImpl, NativeCrypto.SSLHandshakeCallbacks sSLHandshakeCallbacks, SSLParametersImpl.AliasChooser aliasChooser, SSLParametersImpl.PSKCallbacks pSKCallbacks) {
    }

    static /* synthetic */ long access$100(NativeSsl nativeSsl) {
    }

    static /* synthetic */ ReadWriteLock access$200(NativeSsl nativeSsl) {
    }

    static /* synthetic */ NativeCrypto.SSLHandshakeCallbacks access$300(NativeSsl nativeSsl) {
    }

    private void enablePSKKeyManagerIfRequested() throws SSLException {
    }

    private Set<String> getCipherKeyTypes() {
    }

    private boolean isClient() {
    }

    static NativeSsl newInstance(SSLParametersImpl sSLParametersImpl, NativeCrypto.SSLHandshakeCallbacks sSLHandshakeCallbacks, SSLParametersImpl.AliasChooser aliasChooser, SSLParametersImpl.PSKCallbacks pSKCallbacks) throws SSLException {
    }

    private void setCertificate(String str) throws CertificateEncodingException, SSLException {
    }

    private void setCertificateValidation() throws SSLException {
    }

    private void setTlsChannelId(OpenSSLKey openSSLKey) throws SSLException {
    }

    private void verifyWithSniMatchers(String str) throws SSLHandshakeException {
    }

    void chooseClientCertificate(byte[] bArr, int[] iArr, byte[][] bArr2) throws SSLException, CertificateEncodingException {
    }

    int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
    }

    void close() {
    }

    void configureServerCertificate() throws IOException {
    }

    void doHandshake(FileDescriptor fileDescriptor, int i) throws CertificateException, IOException {
    }

    byte[] exportKeyingMaterial(String str, byte[] bArr, int i) throws SSLException {
    }

    protected final void finalize() throws Throwable {
    }

    void forceRead() throws IOException {
    }

    byte[] getApplicationProtocol() {
    }

    String getCipherSuite() {
    }

    int getError(int i) {
    }

    X509Certificate[] getLocalCertificates() {
    }

    int getMaxSealOverhead() {
    }

    byte[] getPeerCertificateOcspData() {
    }

    X509Certificate[] getPeerCertificates() throws CertificateException {
    }

    byte[] getPeerTlsSctData() {
    }

    int getPendingReadableBytes() {
    }

    String getRequestedServerName() {
    }

    byte[] getSessionId() {
    }

    long getTime() {
    }

    long getTimeout() {
    }

    byte[] getTlsChannelId() throws SSLException {
    }

    byte[] getTlsUnique() {
    }

    String getVersion() {
    }

    void initialize(String str, OpenSSLKey openSSLKey) throws IOException {
    }

    void interrupt() {
    }

    boolean isClosed() {
    }

    BioWrapper newBio() {
    }

    void offerToResumeSession(long j) throws SSLException {
    }

    int read(FileDescriptor fileDescriptor, byte[] bArr, int i, int i2, int i3) throws IOException {
    }

    int readDirectByteBuffer(long j, int i) throws IOException, CertificateException {
    }

    int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
    }

    void setTimeout(long j) {
    }

    void shutdown(FileDescriptor fileDescriptor) throws IOException {
    }

    boolean wasShutdownReceived() {
    }

    boolean wasShutdownSent() {
    }

    void write(FileDescriptor fileDescriptor, byte[] bArr, int i, int i2, int i3) throws IOException {
    }

    int writeDirectByteBuffer(long j, int i) throws IOException {
    }

    void shutdown() throws IOException {
    }

    int doHandshake() throws IOException {
    }
}
