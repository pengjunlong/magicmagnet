package org.conscrypt;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Set;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SSLUtils {
    private static final String KEY_TYPE_EC = "EC";
    private static final String KEY_TYPE_RSA = "RSA";
    private static final int MAX_ENCRYPTION_OVERHEAD_DIFF = 2147483561;
    private static final int MAX_ENCRYPTION_OVERHEAD_LENGTH = 86;
    private static final int MAX_PROTOCOL_LENGTH = 255;
    static final boolean USE_ENGINE_SOCKET_BY_DEFAULT = false;
    private static final Charset US_ASCII = null;

    static final class EngineStates {
        static final int STATE_CLOSED = 8;
        static final int STATE_CLOSED_INBOUND = 6;
        static final int STATE_CLOSED_OUTBOUND = 7;
        static final int STATE_HANDSHAKE_COMPLETED = 3;
        static final int STATE_HANDSHAKE_STARTED = 2;
        static final int STATE_MODE_SET = 1;
        static final int STATE_NEW = 0;
        static final int STATE_READY = 5;
        static final int STATE_READY_HANDSHAKE_CUT_THROUGH = 4;

        private EngineStates() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class SessionType {
        private static final /* synthetic */ SessionType[] $VALUES = null;
        public static final SessionType OPEN_SSL = null;
        public static final SessionType OPEN_SSL_WITH_OCSP = null;
        public static final SessionType OPEN_SSL_WITH_TLS_SCT = null;
        final int value;

        private SessionType(String str, int i, int i2) {
        }

        static boolean isSupportedType(int i) {
        }

        public static SessionType valueOf(String str) {
        }

        public static SessionType[] values() {
        }
    }

    private SSLUtils() {
    }

    static int calculateOutNetBufSize(int i) {
    }

    static String[] concat(String[]... strArr) {
    }

    static String[] decodeProtocols(byte[] bArr) {
    }

    private static X509Certificate decodeX509Certificate(CertificateFactory certificateFactory, byte[] bArr) throws CertificateException {
    }

    static X509Certificate[] decodeX509CertificateChain(byte[][] bArr) throws CertificateException {
    }

    static byte[] encodeProtocols(String[] strArr) {
    }

    static byte[][] encodeSubjectX509Principals(X509Certificate[] x509CertificateArr) throws CertificateEncodingException {
    }

    private static CertificateFactory getCertificateFactory() {
    }

    static String getClientKeyType(byte b) {
    }

    static String getClientKeyTypeFromSignatureAlg(int i) {
    }

    static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i) {
    }

    static String getServerX509KeyType(long j) {
    }

    static Set<String> getSupportedClientKeyTypes(byte[] bArr, int[] iArr) {
    }

    static javax.security.cert.X509Certificate[] toCertificateChain(X509Certificate[] x509CertificateArr) throws SSLPeerUnverifiedException {
    }

    static byte[] toProtocolBytes(String str) {
    }

    static String toProtocolString(byte[] bArr) {
    }

    static SSLException toSSLException(Throwable th) {
    }

    static SSLHandshakeException toSSLHandshakeException(Throwable th) {
    }

    private static short unsignedByte(byte b) {
    }

    private static int unsignedShort(short s) {
    }

    private static int getEncryptedPacketLength(ByteBuffer byteBuffer) {
    }
}
