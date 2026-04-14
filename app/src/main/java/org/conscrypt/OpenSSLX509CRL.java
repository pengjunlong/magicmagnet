package org.conscrypt;

import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.OpenSSLX509CertificateFactory;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLX509CRL extends X509CRL {
    private final long mContext;
    private final Date nextUpdate;
    private final Date thisUpdate;

    private OpenSSLX509CRL(long j) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    static List<OpenSSLX509CRL> fromPkcs7DerInputStream(InputStream inputStream) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    static List<OpenSSLX509CRL> fromPkcs7PemInputStream(InputStream inputStream) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    static OpenSSLX509CRL fromX509DerInputStream(InputStream inputStream) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    static OpenSSLX509CRL fromX509PemInputStream(InputStream inputStream) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    static Date toDate(long j) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    private void verifyInternal(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
    }

    private void verifyOpenSSL(OpenSSLKey openSSLKey) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
    }

    protected void finalize() throws Throwable {
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
    }

    @Override // java.security.cert.X509CRL
    public Set<? extends X509CRLEntry> getRevokedCertificates() {
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
    }

    @Override // java.security.cert.CRL
    public String toString() {
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(X509Certificate x509Certificate) {
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
    }
}
