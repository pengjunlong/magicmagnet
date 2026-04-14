package org.conscrypt;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import org.conscrypt.NativeRef;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class NativeSslSession {
    private static final Logger logger = null;

    private static final class Impl extends NativeSslSession {
        private final String cipherSuite;
        private final AbstractSessionContext context;
        private final String host;
        private final X509Certificate[] peerCertificates;
        private final byte[] peerOcspStapledResponse;
        private final byte[] peerSignedCertificateTimestamp;
        private final int port;
        private final String protocol;
        private final NativeRef.SSL_SESSION ref;

        /* renamed from: org.conscrypt.NativeSslSession$Impl$1 */
        class C18581 implements SSLSession {
            final /* synthetic */ Impl this$0;

            C18581(Impl impl) {
            }

            @Override // javax.net.ssl.SSLSession
            public int getApplicationBufferSize() {
            }

            @Override // javax.net.ssl.SSLSession
            public String getCipherSuite() {
            }

            @Override // javax.net.ssl.SSLSession
            public long getCreationTime() {
            }

            @Override // javax.net.ssl.SSLSession
            public byte[] getId() {
            }

            @Override // javax.net.ssl.SSLSession
            public long getLastAccessedTime() {
            }

            @Override // javax.net.ssl.SSLSession
            public Certificate[] getLocalCertificates() {
            }

            @Override // javax.net.ssl.SSLSession
            public Principal getLocalPrincipal() {
            }

            @Override // javax.net.ssl.SSLSession
            public int getPacketBufferSize() {
            }

            @Override // javax.net.ssl.SSLSession
            public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
            }

            @Override // javax.net.ssl.SSLSession
            public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
            }

            @Override // javax.net.ssl.SSLSession
            public String getPeerHost() {
            }

            @Override // javax.net.ssl.SSLSession
            public int getPeerPort() {
            }

            @Override // javax.net.ssl.SSLSession
            public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
            }

            @Override // javax.net.ssl.SSLSession
            public String getProtocol() {
            }

            @Override // javax.net.ssl.SSLSession
            public SSLSessionContext getSessionContext() {
            }

            @Override // javax.net.ssl.SSLSession
            public Object getValue(String str) {
            }

            @Override // javax.net.ssl.SSLSession
            public String[] getValueNames() {
            }

            @Override // javax.net.ssl.SSLSession
            public void invalidate() {
            }

            @Override // javax.net.ssl.SSLSession
            public boolean isValid() {
            }

            @Override // javax.net.ssl.SSLSession
            public void putValue(String str, Object obj) {
            }

            @Override // javax.net.ssl.SSLSession
            public void removeValue(String str) {
            }
        }

        /* synthetic */ Impl(AbstractSessionContext abstractSessionContext, NativeRef.SSL_SESSION ssl_session, String str, int i, X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, C18571 c18571) {
        }

        static /* synthetic */ long access$300(Impl impl) {
        }

        private long getCreationTime() {
        }

        @Override // org.conscrypt.NativeSslSession
        String getCipherSuite() {
        }

        @Override // org.conscrypt.NativeSslSession
        byte[] getId() {
        }

        @Override // org.conscrypt.NativeSslSession
        String getPeerHost() {
        }

        @Override // org.conscrypt.NativeSslSession
        byte[] getPeerOcspStapledResponse() {
        }

        @Override // org.conscrypt.NativeSslSession
        int getPeerPort() {
        }

        @Override // org.conscrypt.NativeSslSession
        byte[] getPeerSignedCertificateTimestamp() {
        }

        @Override // org.conscrypt.NativeSslSession
        String getProtocol() {
        }

        @Override // org.conscrypt.NativeSslSession
        boolean isSingleUse() {
        }

        @Override // org.conscrypt.NativeSslSession
        boolean isValid() {
        }

        @Override // org.conscrypt.NativeSslSession
        void offerToResume(NativeSsl nativeSsl) throws SSLException {
        }

        @Override // org.conscrypt.NativeSslSession
        byte[] toBytes() {
        }

        @Override // org.conscrypt.NativeSslSession
        SSLSession toSSLSession() {
        }

        private Impl(AbstractSessionContext abstractSessionContext, NativeRef.SSL_SESSION ssl_session, String str, int i, X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2) {
        }
    }

    NativeSslSession() {
    }

    static /* synthetic */ Logger access$100() {
    }

    static /* synthetic */ void access$200(Throwable th) {
    }

    private static void checkRemaining(ByteBuffer byteBuffer, int i) throws IOException {
    }

    private static byte[] getOcspResponse(ConscryptSession conscryptSession) {
    }

    private static void log(Throwable th) {
    }

    static NativeSslSession newInstance(NativeRef.SSL_SESSION ssl_session, ConscryptSession conscryptSession) throws SSLPeerUnverifiedException {
    }

    abstract String getCipherSuite();

    abstract byte[] getId();

    abstract String getPeerHost();

    abstract byte[] getPeerOcspStapledResponse();

    abstract int getPeerPort();

    abstract byte[] getPeerSignedCertificateTimestamp();

    abstract String getProtocol();

    abstract boolean isSingleUse();

    abstract boolean isValid();

    abstract void offerToResume(NativeSsl nativeSsl) throws SSLException;

    abstract byte[] toBytes();

    abstract SSLSession toSSLSession();

    static NativeSslSession newInstance(AbstractSessionContext abstractSessionContext, byte[] bArr, String str, int i) {
    }
}
