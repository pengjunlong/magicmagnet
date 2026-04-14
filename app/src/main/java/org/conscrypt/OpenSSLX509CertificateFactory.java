package org.conscrypt;

import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OpenSSLX509CertificateFactory extends CertificateFactorySpi {
    private static final byte[] PKCS7_MARKER = null;
    private static final int PUSHBACK_SIZE = 64;
    private Parser<OpenSSLX509Certificate> certificateParser;
    private Parser<OpenSSLX509CRL> crlParser;

    /* renamed from: org.conscrypt.OpenSSLX509CertificateFactory$1 */
    class C18651 extends Parser<OpenSSLX509Certificate> {
        final /* synthetic */ OpenSSLX509CertificateFactory this$0;

        C18651(OpenSSLX509CertificateFactory openSSLX509CertificateFactory) {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List<? extends OpenSSLX509Certificate> fromPkcs7DerInputStream(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List<? extends OpenSSLX509Certificate> fromPkcs7PemInputStream(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public /* bridge */ /* synthetic */ OpenSSLX509Certificate fromX509DerInputStream(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public /* bridge */ /* synthetic */ OpenSSLX509Certificate fromX509PemInputStream(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        /* renamed from: fromX509DerInputStream, reason: avoid collision after fix types in other method */
        public OpenSSLX509Certificate fromX509DerInputStream2(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        /* renamed from: fromX509PemInputStream, reason: avoid collision after fix types in other method */
        public OpenSSLX509Certificate fromX509PemInputStream2(InputStream inputStream) throws ParsingException {
        }
    }

    /* renamed from: org.conscrypt.OpenSSLX509CertificateFactory$2 */
    class C18662 extends Parser<OpenSSLX509CRL> {
        final /* synthetic */ OpenSSLX509CertificateFactory this$0;

        C18662(OpenSSLX509CertificateFactory openSSLX509CertificateFactory) {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List<? extends OpenSSLX509CRL> fromPkcs7DerInputStream(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public List<? extends OpenSSLX509CRL> fromPkcs7PemInputStream(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public /* bridge */ /* synthetic */ OpenSSLX509CRL fromX509DerInputStream(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        public /* bridge */ /* synthetic */ OpenSSLX509CRL fromX509PemInputStream(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        /* renamed from: fromX509DerInputStream, reason: avoid collision after fix types in other method */
        public OpenSSLX509CRL fromX509DerInputStream2(InputStream inputStream) throws ParsingException {
        }

        @Override // org.conscrypt.OpenSSLX509CertificateFactory.Parser
        /* renamed from: fromX509PemInputStream, reason: avoid collision after fix types in other method */
        public OpenSSLX509CRL fromX509PemInputStream2(InputStream inputStream) throws ParsingException {
        }
    }

    private static abstract class Parser<T> {
        private Parser() {
        }

        protected abstract List<? extends T> fromPkcs7DerInputStream(InputStream inputStream) throws ParsingException;

        protected abstract List<? extends T> fromPkcs7PemInputStream(InputStream inputStream) throws ParsingException;

        protected abstract T fromX509DerInputStream(InputStream inputStream) throws ParsingException;

        protected abstract T fromX509PemInputStream(InputStream inputStream) throws ParsingException;

        T generateItem(InputStream inputStream) throws ParsingException {
        }

        Collection<? extends T> generateItems(InputStream inputStream) throws ParsingException {
        }

        /* synthetic */ Parser(C18651 c18651) {
        }
    }

    static class ParsingException extends Exception {
        private static final long serialVersionUID = 8390802697728301325L;

        ParsingException(String str) {
        }

        ParsingException(Exception exc) {
        }

        ParsingException(String str, Exception exc) {
        }
    }

    static /* synthetic */ byte[] access$000() {
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection<? extends CRL> engineGenerateCRLs(InputStream inputStream) throws CRLException {
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection<? extends Certificate> engineGenerateCertificates(InputStream inputStream) throws CertificateException {
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator<String> engineGetCertPathEncodings() {
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List<? extends Certificate> list) throws CertificateException {
    }
}
