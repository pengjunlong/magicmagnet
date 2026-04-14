package org.conscrypt;

import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Set;
import org.conscrypt.OpenSSLX509CertificateFactory;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLX509CRLEntry extends X509CRLEntry {
    private final long mContext;
    private final Date revocationDate;

    OpenSSLX509CRLEntry(long j) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
    }
}
