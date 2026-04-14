package okhttp3.internal.platform;

import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;
import org.conscrypt.ConscryptHostnameVerifier;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ConscryptPlatform extends Platform {
    public static final Companion Companion = null;
    private static final boolean isSupported = false;
    private final Provider provider;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static /* synthetic */ boolean atLeastVersion$default(Companion companion, int i, int i2, int i3, int i4, Object obj) {
        }

        public final boolean atLeastVersion(int i, int i2, int i3) {
        }

        public final ConscryptPlatform buildIfSupported() {
        }

        public final boolean isSupported() {
        }
    }

    @xc0
    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {
        public static final DisabledHostnameVerifier INSTANCE = null;

        private DisabledHostnameVerifier() {
        }

        public final boolean verify(String str, SSLSession sSLSession) {
        }

        @Override // org.conscrypt.ConscryptHostnameVerifier
        public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
        }
    }

    private ConscryptPlatform() {
    }

    public /* synthetic */ ConscryptPlatform(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext newSSLContext() {
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) {
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager platformTrustManager() {
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
    }
}
