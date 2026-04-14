package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Conscrypt {
    private static final Version VERSION = null;

    /* renamed from: org.conscrypt.Conscrypt$1 */
    class C18431 implements ConscryptHostnameVerifier {
        final /* synthetic */ HostnameVerifier val$verifier;

        C18431(HostnameVerifier hostnameVerifier) {
        }

        @Override // org.conscrypt.ConscryptHostnameVerifier
        public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
        }
    }

    public static class ProviderBuilder {
        private String defaultTlsProtocol;
        private String name;
        private boolean provideTrustManager;

        /* synthetic */ ProviderBuilder(C18431 c18431) {
        }

        public Provider build() {
        }

        public ProviderBuilder defaultTlsProtocol(String str) {
        }

        @Deprecated
        public ProviderBuilder provideTrustManager() {
        }

        public ProviderBuilder setName(String str) {
        }

        private ProviderBuilder() {
        }

        public ProviderBuilder provideTrustManager(boolean z) {
        }
    }

    public static class Version {
        private final int major;
        private final int minor;
        private final int patch;

        /* synthetic */ Version(int i, int i2, int i3, C18431 c18431) {
        }

        public int major() {
        }

        public int minor() {
        }

        public int patch() {
        }

        private Version(int i, int i2, int i3) {
        }
    }

    private Conscrypt() {
    }

    public static void checkAvailability() {
    }

    public static byte[] exportKeyingMaterial(SSLSocket sSLSocket, String str, byte[] bArr, int i) throws SSLException {
    }

    public static String getApplicationProtocol(SSLSocket sSLSocket) {
    }

    public static String[] getApplicationProtocols(SSLSocket sSLSocket) {
    }

    public static byte[] getChannelId(SSLSocket sSLSocket) throws SSLException {
    }

    public static synchronized ConscryptHostnameVerifier getDefaultHostnameVerifier(TrustManager trustManager) {
    }

    public static X509TrustManager getDefaultX509TrustManager() throws KeyManagementException {
    }

    public static String getHostname(SSLSocket sSLSocket) {
    }

    public static String getHostnameOrIP(SSLSocket sSLSocket) {
    }

    public static ConscryptHostnameVerifier getHostnameVerifier(TrustManager trustManager) {
    }

    public static byte[] getTlsUnique(SSLSocket sSLSocket) {
    }

    public static boolean isAvailable() {
    }

    public static boolean isConscrypt(Provider provider) {
    }

    public static int maxEncryptedPacketLength() {
    }

    public static int maxSealOverhead(SSLEngine sSLEngine) {
    }

    public static SSLContextSpi newPreferredSSLContextSpi() {
    }

    public static Provider newProvider() {
    }

    public static ProviderBuilder newProviderBuilder() {
    }

    public static void setApplicationProtocolSelector(SSLSocket sSLSocket, ApplicationProtocolSelector applicationProtocolSelector) {
    }

    public static void setApplicationProtocols(SSLSocket sSLSocket, String[] strArr) {
    }

    public static void setBufferAllocator(SSLEngine sSLEngine, BufferAllocator bufferAllocator) {
    }

    public static void setChannelIdEnabled(SSLSocket sSLSocket, boolean z) {
    }

    public static void setChannelIdPrivateKey(SSLSocket sSLSocket, PrivateKey privateKey) {
    }

    public static void setClientSessionCache(SSLContext sSLContext, SSLClientSessionCache sSLClientSessionCache) {
    }

    public static void setDefaultBufferAllocator(BufferAllocator bufferAllocator) {
    }

    public static synchronized void setDefaultHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
    }

    public static void setHandshakeListener(SSLEngine sSLEngine, HandshakeListener handshakeListener) {
    }

    public static void setHostname(SSLSocket sSLSocket, String str) {
    }

    public static void setHostnameVerifier(TrustManager trustManager, ConscryptHostnameVerifier conscryptHostnameVerifier) {
    }

    public static void setServerSessionCache(SSLContext sSLContext, SSLServerSessionCache sSLServerSessionCache) {
    }

    public static void setUseEngineSocket(SSLSocketFactory sSLSocketFactory, boolean z) {
    }

    public static void setUseEngineSocketByDefault(boolean z) {
    }

    public static void setUseSessionTickets(SSLSocket sSLSocket, boolean z) {
    }

    private static OpenSSLSocketFactoryImpl toConscrypt(SSLSocketFactory sSLSocketFactory) {
    }

    public static SSLEngineResult unwrap(SSLEngine sSLEngine, ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) throws SSLException {
    }

    public static Version version() {
    }

    public static ConscryptHostnameVerifier wrapHostnameVerifier(HostnameVerifier hostnameVerifier) {
    }

    public static byte[] exportKeyingMaterial(SSLEngine sSLEngine, String str, byte[] bArr, int i) throws SSLException {
    }

    public static String getApplicationProtocol(SSLEngine sSLEngine) {
    }

    public static String[] getApplicationProtocols(SSLEngine sSLEngine) {
    }

    public static byte[] getChannelId(SSLEngine sSLEngine) throws SSLException {
    }

    public static String getHostname(SSLEngine sSLEngine) {
    }

    public static byte[] getTlsUnique(SSLEngine sSLEngine) {
    }

    public static boolean isConscrypt(SSLContext sSLContext) {
    }

    public static void setApplicationProtocolSelector(SSLEngine sSLEngine, ApplicationProtocolSelector applicationProtocolSelector) {
    }

    public static void setApplicationProtocols(SSLEngine sSLEngine, String[] strArr) {
    }

    public static void setBufferAllocator(SSLSocket sSLSocket, BufferAllocator bufferAllocator) {
    }

    public static void setChannelIdEnabled(SSLEngine sSLEngine, boolean z) {
    }

    public static void setChannelIdPrivateKey(SSLEngine sSLEngine, PrivateKey privateKey) {
    }

    public static void setHostname(SSLEngine sSLEngine, String str) {
    }

    public static void setUseEngineSocket(SSLServerSocketFactory sSLServerSocketFactory, boolean z) {
    }

    public static void setUseSessionTickets(SSLEngine sSLEngine, boolean z) {
    }

    public static SSLEngineResult unwrap(SSLEngine sSLEngine, ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) throws SSLException {
    }

    public static boolean isConscrypt(SSLSocketFactory sSLSocketFactory) {
    }

    @Deprecated
    public static Provider newProvider(String str) {
    }

    public static boolean isConscrypt(SSLServerSocketFactory sSLServerSocketFactory) {
    }

    public static boolean isConscrypt(SSLSocket sSLSocket) {
    }

    private static OpenSSLServerSocketFactoryImpl toConscrypt(SSLServerSocketFactory sSLServerSocketFactory) {
    }

    public static boolean isConscrypt(SSLEngine sSLEngine) {
    }

    public static boolean isConscrypt(TrustManager trustManager) {
    }

    private static AbstractConscryptSocket toConscrypt(SSLSocket sSLSocket) {
    }

    private static AbstractConscryptEngine toConscrypt(SSLEngine sSLEngine) {
    }

    private static TrustManagerImpl toConscrypt(TrustManager trustManager) {
    }
}
