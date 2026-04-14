package org.conscrypt;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import dalvik.system.CloseGuard;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.AlgorithmParameters;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.ct.CTLogStore;
import org.conscrypt.ct.CTPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class Platform {
    private static final String TAG = "Conscrypt";
    private static Method m_getCurveName;

    private Platform() {
    }

    public static void blockGuardOnNetwork() {
    }

    @SuppressLint({"NewApi"})
    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) throws CertificateException {
    }

    @SuppressLint({"NewApi"})
    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) throws CertificateException {
    }

    private static boolean checkTrusted(String str, X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str2, Class<?> cls, Object obj) throws CertificateException {
    }

    public static void closeGuardClose(Object obj) {
    }

    public static CloseGuard closeGuardGet() {
    }

    public static void closeGuardOpen(Object obj, String str) {
    }

    public static void closeGuardWarnIfOpen(Object obj) {
    }

    static ConscryptEngineSocket createEngineSocket(SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    public static GCMParameters fromGCMParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
    }

    static AlgorithmParameterSpec fromGCMParameters(AlgorithmParameters algorithmParameters) {
    }

    private static Class<?> getClass(String... strArr) {
    }

    public static String getCurveName(ECParameterSpec eCParameterSpec) {
    }

    static KeyStore getDefaultCertKeyStore() throws KeyStoreException {
    }

    public static ConscryptHostnameVerifier getDefaultHostnameVerifier() {
    }

    public static String getDefaultProviderName() {
    }

    public static String getEndpointIdentificationAlgorithm(SSLParameters sSLParameters) {
    }

    public static FileDescriptor getFileDescriptor(Socket socket) {
    }

    public static FileDescriptor getFileDescriptorFromSSLSocket(AbstractConscryptSocket abstractConscryptSocket) {
    }

    public static String getHostStringFromInetSocketAddress(InetSocketAddress inetSocketAddress) {
    }

    public static String getOriginalHostNameFromInetAddress(InetAddress inetAddress) {
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
    }

    private static void getSSLParametersFromImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    }

    @TargetApi(24)
    private static String getSniHostnameFromParams(SSLParameters sSLParameters) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    }

    public static boolean isCTVerificationRequired(String str) {
    }

    public static void logEvent(String str) {
    }

    private static void logStackTraceSnippet(String str, Throwable th) {
    }

    static CertBlocklist newDefaultBlocklist() {
    }

    static ConscryptCertStore newDefaultCertStore() {
    }

    static CTLogStore newDefaultLogStore() {
    }

    static CTPolicy newDefaultPolicy(CTLogStore cTLogStore) {
    }

    public static String oidToAlgorithmName(String str) {
    }

    static boolean provideTrustManagerByDefault() {
    }

    static boolean serverNamePermitted(SSLParametersImpl sSLParametersImpl, String str) {
    }

    @TargetApi(24)
    private static boolean serverNamePermittedInternal(SSLParametersImpl sSLParametersImpl, String str) {
    }

    public static void setCurveName(ECParameterSpec eCParameterSpec, String str) {
    }

    public static void setEndpointIdentificationAlgorithm(SSLParameters sSLParameters, String str) {
    }

    @TargetApi(24)
    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
    }

    private static void setSSLParametersOnImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    }

    public static void setSocketWriteTimeout(Socket socket, long j) throws SocketException {
    }

    public static void setup() {
    }

    static boolean supportsConscryptCertStore() {
    }

    static boolean supportsX509ExtendedTrustManager() {
    }

    public static AlgorithmParameterSpec toGCMParameterSpec(int i, byte[] bArr) {
    }

    static SSLEngine unwrapEngine(SSLEngine sSLEngine) {
    }

    static SSLEngine wrapEngine(ConscryptEngine conscryptEngine) {
    }

    public static OpenSSLKey wrapRsaKey(PrivateKey privateKey) {
    }

    public static SSLSession wrapSSLSession(ExternalSession externalSession) {
    }

    public static SSLSocketFactory wrapSocketFactoryIfNeeded(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    @SuppressLint({"NewApi"})
    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) throws CertificateException {
    }

    @SuppressLint({"NewApi"})
    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) throws CertificateException {
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    @TargetApi(24)
    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static ConscryptEngineSocket createEngineSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) throws IOException {
    }
}
