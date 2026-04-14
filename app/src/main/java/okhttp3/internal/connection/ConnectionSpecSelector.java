package okhttp3.internal.connection;

import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) throws IOException {
    }

    public final boolean connectionFailed(IOException iOException) {
    }
}
