package org.adblockplus.libadblockplus.sitekey;

import java.util.concurrent.atomic.AtomicBoolean;
import org.adblockplus.libadblockplus.HttpClient;
import org.adblockplus.libadblockplus.security.SignatureVerifier;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SiteKeysConfiguration {
    private AtomicBoolean forceChecks;
    private HttpClient httpClient;
    private PublicKeyHolder publicKeyHolder;
    private SignatureVerifier signatureVerifier;
    private SiteKeyVerifier siteKeyVerifier;

    public SiteKeysConfiguration(SignatureVerifier signatureVerifier, PublicKeyHolder publicKeyHolder, HttpClient httpClient, SiteKeyVerifier siteKeyVerifier) {
    }

    public boolean getForceChecks() {
    }

    public HttpClient getHttpClient() {
    }

    public PublicKeyHolder getPublicKeyHolder() {
    }

    public SignatureVerifier getSignatureVerifier() {
    }

    public SiteKeyVerifier getSiteKeyVerifier() {
    }

    public void setForceChecks(boolean z) {
    }
}
