package org.conscrypt;

import java.security.AlgorithmConstraints;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SSLParametersImpl implements Cloneable {
    private static final String[] EMPTY_STRING_ARRAY = null;
    private static volatile SSLParametersImpl defaultParameters;
    private static volatile X509KeyManager defaultX509KeyManager;
    private static volatile X509TrustManager defaultX509TrustManager;
    private AlgorithmConstraints algorithmConstraints;
    ApplicationProtocolSelectorAdapter applicationProtocolSelector;
    byte[] applicationProtocols;
    boolean channelIdEnabled;
    private final ClientSessionContext clientSessionContext;
    private boolean client_mode;
    private boolean ctVerificationEnabled;
    private boolean enable_session_creation;
    String[] enabledCipherSuites;
    String[] enabledProtocols;
    private String endpointIdentificationAlgorithm;
    boolean isEnabledProtocolsFiltered;
    private boolean need_client_auth;
    byte[] ocspResponse;
    private final PSKKeyManager pskKeyManager;
    byte[] sctExtension;
    private final ServerSessionContext serverSessionContext;
    private Collection<SNIMatcher> sniMatchers;
    private boolean useCipherSuitesOrder;
    boolean useSessionTickets;
    private Boolean useSni;
    private boolean want_client_auth;
    private final X509KeyManager x509KeyManager;
    private final X509TrustManager x509TrustManager;

    interface AliasChooser {
        String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr);

        String chooseServerAlias(X509KeyManager x509KeyManager, String str);
    }

    interface PSKCallbacks {
        String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str);

        String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager);

        SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2);
    }

    SSLParametersImpl(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom, ClientSessionContext clientSessionContext, ServerSessionContext serverSessionContext, String[] strArr) throws KeyManagementException {
    }

    private static X509KeyManager createDefaultX509KeyManager() throws KeyManagementException {
    }

    private static X509TrustManager createDefaultX509TrustManager() throws KeyManagementException {
    }

    private static String[] filterFromCipherSuites(String[] strArr, Set<String> set) {
    }

    private static String[] filterFromProtocols(String[] strArr, String str) {
    }

    private static PSKKeyManager findFirstPSKKeyManager(KeyManager[] keyManagerArr) {
    }

    private static X509KeyManager findFirstX509KeyManager(KeyManager[] keyManagerArr) {
    }

    private static X509TrustManager findFirstX509TrustManager(TrustManager[] trustManagerArr) {
    }

    static SSLParametersImpl getDefault() throws KeyManagementException {
    }

    private static String[] getDefaultCipherSuites(boolean z, boolean z2) {
    }

    private static X509KeyManager getDefaultX509KeyManager() throws KeyManagementException {
    }

    static X509TrustManager getDefaultX509TrustManager() throws KeyManagementException {
    }

    private boolean isSniEnabledByDefault() {
    }

    protected Object clone() {
    }

    SSLParametersImpl cloneWithTrustManager(X509TrustManager x509TrustManager) {
    }

    AlgorithmConstraints getAlgorithmConstraints() {
    }

    ApplicationProtocolSelectorAdapter getApplicationProtocolSelector() {
    }

    String[] getApplicationProtocols() {
    }

    ClientSessionContext getClientSessionContext() {
    }

    boolean getEnableSessionCreation() {
    }

    String[] getEnabledCipherSuites() {
    }

    String[] getEnabledProtocols() {
    }

    String getEndpointIdentificationAlgorithm() {
    }

    boolean getNeedClientAuth() {
    }

    byte[] getOCSPResponse() {
    }

    PSKKeyManager getPSKKeyManager() {
    }

    Collection<SNIMatcher> getSNIMatchers() {
    }

    AbstractSessionContext getSessionContext() {
    }

    boolean getUseCipherSuitesOrder() {
    }

    boolean getUseClientMode() {
    }

    boolean getUseSni() {
    }

    boolean getWantClientAuth() {
    }

    X509KeyManager getX509KeyManager() {
    }

    X509TrustManager getX509TrustManager() {
    }

    boolean isCTVerificationEnabled(String str) {
    }

    void setAlgorithmConstraints(AlgorithmConstraints algorithmConstraints) {
    }

    void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
    }

    void setApplicationProtocols(String[] strArr) {
    }

    void setCTVerificationEnabled(boolean z) {
    }

    void setEnableSessionCreation(boolean z) {
    }

    void setEnabledCipherSuites(String[] strArr) {
    }

    void setEnabledProtocols(String[] strArr) {
    }

    void setEndpointIdentificationAlgorithm(String str) {
    }

    void setNeedClientAuth(boolean z) {
    }

    void setOCSPResponse(byte[] bArr) {
    }

    void setSCTExtension(byte[] bArr) {
    }

    void setSNIMatchers(Collection<SNIMatcher> collection) {
    }

    void setUseCipherSuitesOrder(boolean z) {
    }

    void setUseClientMode(boolean z) {
    }

    void setUseSessionTickets(boolean z) {
    }

    void setUseSni(boolean z) {
    }

    void setWantClientAuth(boolean z) {
    }

    private SSLParametersImpl(ClientSessionContext clientSessionContext, ServerSessionContext serverSessionContext, X509KeyManager x509KeyManager, PSKKeyManager pSKKeyManager, X509TrustManager x509TrustManager, SSLParametersImpl sSLParametersImpl) {
    }
}
