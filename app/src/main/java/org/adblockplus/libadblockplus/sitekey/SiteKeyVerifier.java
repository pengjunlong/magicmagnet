package org.adblockplus.libadblockplus.sitekey;

import java.util.Map;
import org.adblockplus.libadblockplus.security.SignatureVerifier;
import org.adblockplus.libadblockplus.util.Base64Processor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SiteKeyVerifier {
    private static final byte ZERO_BYTE = 0;
    private final Base64Processor base64Processor;
    private final PublicKeyHolder publicKeyHolder;
    private final SignatureVerifier signatureVerifier;

    public SiteKeyVerifier(SignatureVerifier signatureVerifier, PublicKeyHolder publicKeyHolder, Base64Processor base64Processor) {
    }

    private byte[] decodeBase64(String str) throws SiteKeyException {
    }

    protected byte[] buildData(String str, String str2) throws SiteKeyException {
    }

    public boolean verify(String str, String str2, String str3) throws SiteKeyException {
    }

    public void verifyInHeaders(String str, Map<String, String> map, Map<String, String> map2) {
    }
}
