package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    public RouteException(IOException iOException) {
    }

    public final void addConnectException(IOException iOException) {
    }

    public final IOException getFirstConnectException() {
    }

    public final IOException getLastConnectException() {
    }
}
