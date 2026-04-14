package p000;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class qs1 extends SSLSocketFactory {
    public static final dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpbLwkLpObyKsq1lll1 = null;
    private static final y40<X509TrustManager> dqqppqiKzJi1l1lll1l = null;
    private final SSLSocketFactory dbpqdHhmDSIHIJiwc1ll1l1;

    @Metadata
    static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<X509TrustManager> {
        public static final dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l = null;

        dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final X509TrustManager dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ X509TrustManager invoke() {
        }
    }

    @Metadata
    public static final class dpbdbdpbLwkLpObyKsq1lll1 {
        private dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        private final X509TrustManager dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final OkHttpClient.Builder dbpqdHhmDSIHIJiwc1ll1l1(OkHttpClient.Builder builder) {
        }
    }

    public qs1(SSLSocketFactory sSLSocketFactory) {
    }

    public static final /* synthetic */ y40 dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    private final Socket dpbdbdpbLwkLpObyKsq1lll1(Socket socket) {
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
    }
}
