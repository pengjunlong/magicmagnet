package org.conscrypt.ct;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SignedCertificateTimestamp {
    private final byte[] extensions;
    private final byte[] logId;
    private final Origin origin;
    private final DigitallySigned signature;
    private final long timestamp;
    private final Version version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Origin {
        private static final /* synthetic */ Origin[] $VALUES = null;
        public static final Origin EMBEDDED = null;
        public static final Origin OCSP_RESPONSE = null;
        public static final Origin TLS_EXTENSION = null;

        private Origin(String str, int i) {
        }

        public static Origin valueOf(String str) {
        }

        public static Origin[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class SignatureType {
        private static final /* synthetic */ SignatureType[] $VALUES = null;
        public static final SignatureType CERTIFICATE_TIMESTAMP = null;
        public static final SignatureType TREE_HASH = null;

        private SignatureType(String str, int i) {
        }

        public static SignatureType valueOf(String str) {
        }

        public static SignatureType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Version {
        private static final /* synthetic */ Version[] $VALUES = null;
        public static final Version V1 = null;

        private Version(String str, int i) {
        }

        public static Version valueOf(String str) {
        }

        public static Version[] values() {
        }
    }

    public SignedCertificateTimestamp(Version version, byte[] bArr, long j, byte[] bArr2, DigitallySigned digitallySigned, Origin origin) {
    }

    public static SignedCertificateTimestamp decode(InputStream inputStream, Origin origin) throws SerializationException {
    }

    public void encodeTBS(OutputStream outputStream, CertificateEntry certificateEntry) throws SerializationException {
    }

    public byte[] getExtensions() {
    }

    public byte[] getLogID() {
    }

    public Origin getOrigin() {
    }

    public DigitallySigned getSignature() {
    }

    public long getTimestamp() {
    }

    public Version getVersion() {
    }

    public byte[] encodeTBS(CertificateEntry certificateEntry) throws SerializationException {
    }

    public static SignedCertificateTimestamp decode(byte[] bArr, Origin origin) throws SerializationException {
    }
}
