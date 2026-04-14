package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECParameterSpec;
import java.util.Map;
import org.conscrypt.NativeRef;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLECGroupContext {
    private static final Map<String, String> ALIASES = null;
    private final NativeRef.EC_GROUP groupCtx;

    OpenSSLECGroupContext(NativeRef.EC_GROUP ec_group) {
    }

    static OpenSSLECGroupContext getCurveByName(String str) {
    }

    static OpenSSLECGroupContext getInstance(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
    }

    public boolean equals(Object obj) {
    }

    String getCurveName() {
    }

    ECParameterSpec getECParameterSpec() {
    }

    NativeRef.EC_GROUP getNativeRef() {
    }

    public int hashCode() {
    }
}
