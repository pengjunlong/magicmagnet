package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Platform {
    public static final Companion Companion = null;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger = null;
    private static volatile Platform platform;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static final /* synthetic */ Platform access$findPlatform(Companion companion) {
        }

        private final Platform findAndroidPlatform() {
        }

        private final Platform findJvmPlatform() {
        }

        private final Platform findPlatform() {
        }

        private final boolean isBouncyCastlePreferred() {
        }

        private final boolean isConscryptPreferred() {
        }

        private final boolean isOpenJSSEPreferred() {
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> list) {
        }

        public final byte[] concatLengthPrefixed(List<? extends Protocol> list) {
        }

        public final Platform get() {
        }

        public final boolean isAndroid() {
        }

        public final void resetForTests(Platform platform) {
        }
    }

    public static final /* synthetic */ Platform access$getPlatform$cp() {
    }

    public static final /* synthetic */ void access$setPlatform$cp(Platform platform2) {
    }

    public static final Platform get() {
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i, Throwable th, int i2, Object obj) {
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
    }

    public final String getPrefix() {
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
    }

    public Object getStackTraceForCloseable(String str) {
    }

    public boolean isCleartextTrafficPermitted(String str) {
    }

    public void log(String str, int i, Throwable th) {
    }

    public void logCloseableLeak(String str, Object obj) {
    }

    public SSLContext newSSLContext() {
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) {
    }

    public X509TrustManager platformTrustManager() {
    }

    public String toString() {
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
    }
}
