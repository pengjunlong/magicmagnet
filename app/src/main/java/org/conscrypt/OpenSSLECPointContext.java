package org.conscrypt;

import java.security.spec.ECPoint;
import org.conscrypt.NativeRef;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLECPointContext {
    private final OpenSSLECGroupContext group;
    private final NativeRef.EC_POINT pointCtx;

    OpenSSLECPointContext(OpenSSLECGroupContext openSSLECGroupContext, NativeRef.EC_POINT ec_point) {
    }

    static OpenSSLECPointContext getInstance(OpenSSLECGroupContext openSSLECGroupContext, ECPoint eCPoint) {
    }

    public boolean equals(Object obj) {
    }

    ECPoint getECPoint() {
    }

    NativeRef.EC_POINT getNativeRef() {
    }

    public int hashCode() {
    }
}
