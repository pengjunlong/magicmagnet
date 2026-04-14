package org.conscrypt.ct;

import java.io.OutputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import org.conscrypt.OpenSSLX509Certificate;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CertificateEntry {
    private final byte[] certificate;
    private final LogEntryType entryType;
    private final byte[] issuerKeyHash;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class LogEntryType {
        private static final /* synthetic */ LogEntryType[] $VALUES = null;
        public static final LogEntryType PRECERT_ENTRY = null;
        public static final LogEntryType X509_ENTRY = null;

        private LogEntryType(String str, int i) {
        }

        public static LogEntryType valueOf(String str) {
        }

        public static LogEntryType[] values() {
        }
    }

    private CertificateEntry(LogEntryType logEntryType, byte[] bArr, byte[] bArr2) {
    }

    public static CertificateEntry createForPrecertificate(byte[] bArr, byte[] bArr2) {
    }

    public static CertificateEntry createForX509Certificate(byte[] bArr) {
    }

    public void encode(OutputStream outputStream) throws SerializationException {
    }

    public byte[] getCertificate() {
    }

    public LogEntryType getEntryType() {
    }

    public byte[] getIssuerKeyHash() {
    }

    public static CertificateEntry createForPrecertificate(OpenSSLX509Certificate openSSLX509Certificate, OpenSSLX509Certificate openSSLX509Certificate2) throws CertificateException {
    }

    public static CertificateEntry createForX509Certificate(X509Certificate x509Certificate) throws CertificateEncodingException {
    }
}
