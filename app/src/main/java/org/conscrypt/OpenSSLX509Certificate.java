package org.conscrypt;

import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.OpenSSLX509CertificateFactory;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class OpenSSLX509Certificate extends X509Certificate {
    private static final long serialVersionUID = 1992239142393372128L;
    private final transient long mContext;
    private transient Integer mHashCode;
    private final Date notAfter;
    private final Date notBefore;

    OpenSSLX509Certificate(long j) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    private static Collection<List<?>> alternativeNameArrayToList(Object[][] objArr) {
    }

    public static OpenSSLX509Certificate fromCertificate(Certificate certificate) throws CertificateEncodingException {
    }

    public static List<OpenSSLX509Certificate> fromPkcs7DerInputStream(InputStream inputStream) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    public static List<OpenSSLX509Certificate> fromPkcs7PemInputStream(InputStream inputStream) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    public static OpenSSLX509Certificate fromX509Der(byte[] bArr) throws CertificateEncodingException {
    }

    public static OpenSSLX509Certificate fromX509DerInputStream(InputStream inputStream) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    public static OpenSSLX509Certificate fromX509PemInputStream(InputStream inputStream) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    private static Date toDate(long j) throws OpenSSLX509CertificateFactory.ParsingException {
    }

    private void verifyInternal(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
    }

    private void verifyOpenSSL(OpenSSLKey openSSLKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
    }

    protected void finalize() throws Throwable {
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
    }

    public long getContext() {
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
    }

    @Override // java.security.cert.X509Certificate
    public List<String> getExtendedKeyUsage() throws CertificateParsingException {
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
    }

    @Override // java.security.cert.X509Certificate
    public Collection<List<?>> getIssuerAlternativeNames() throws CertificateParsingException {
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
    }

    @Override // java.security.cert.X509Certificate
    public Collection<List<?>> getSubjectAlternativeNames() throws CertificateParsingException {
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
    }

    @Override // java.security.cert.Certificate
    public String toString() {
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
    }

    public OpenSSLX509Certificate withDeletedExtension(String str) {
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
    }

    private OpenSSLX509Certificate(long j, Date date, Date date2) {
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public void verify(PublicKey publicKey, Provider provider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
    }
}
