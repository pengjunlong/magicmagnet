package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion Companion = null;
    private static final DeferredSocketAdapter.Factory playProviderFactory = null;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static final /* synthetic */ AndroidSocketAdapter access$build(Companion companion, Class cls) {
        }

        private final AndroidSocketAdapter build(Class<? super SSLSocket> cls) {
        }

        public final DeferredSocketAdapter.Factory factory(String str) {
        }

        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
        }
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) {
    }

    public static final /* synthetic */ DeferredSocketAdapter.Factory access$getPlayProviderFactory$cp() {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sSLSocket) {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sSLSocket) {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
    }
}
