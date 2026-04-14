package org.conscrypt;

import java.io.InputStream;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLX509CertPath extends CertPath {
    private static final List<String> ALL_ENCODINGS = null;
    private static final Encoding DEFAULT_ENCODING = null;
    private static final byte[] PKCS7_MARKER = null;
    private static final int PUSHBACK_SIZE = 64;
    private static final long serialVersionUID = -3249106005255170761L;
    private final List<? extends X509Certificate> mCertificates;

    /* renamed from: org.conscrypt.OpenSSLX509CertPath$1 */
    static /* synthetic */ class C18641 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLX509CertPath$Encoding = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class Encoding {
        private static final /* synthetic */ Encoding[] $VALUES = null;
        public static final Encoding PKCS7 = null;
        public static final Encoding PKI_PATH = null;
        private final String apiName;

        private Encoding(String str, int i, String str2) {
        }

        static /* synthetic */ String access$000(Encoding encoding) {
        }

        static Encoding findByApiName(String str) throws CertificateEncodingException {
        }

        public static Encoding valueOf(String str) {
        }

        public static Encoding[] values() {
        }
    }

    OpenSSLX509CertPath(List<? extends X509Certificate> list) {
    }

    private static CertPath fromEncoding(InputStream inputStream, Encoding encoding) throws CertificateException {
    }

    private static CertPath fromPkcs7Encoding(InputStream inputStream) throws CertificateException {
    }

    private static CertPath fromPkiPathEncoding(InputStream inputStream) throws CertificateException {
    }

    private byte[] getEncoded(Encoding encoding) throws CertificateEncodingException {
    }

    static Iterator<String> getEncodingsIterator() {
    }

    @Override // java.security.cert.CertPath
    public List<? extends Certificate> getCertificates() {
    }

    @Override // java.security.cert.CertPath
    public Iterator<String> getEncodings() {
    }

    static CertPath fromEncoding(InputStream inputStream, String str) throws CertificateException {
    }

    static CertPath fromEncoding(InputStream inputStream) throws CertificateException {
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws CertificateEncodingException {
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
    }
}
