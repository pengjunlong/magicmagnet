package okhttp3.internal.connection;

import java.util.Set;
import kotlin.Metadata;
import okhttp3.Route;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes;

    public final synchronized void connected(Route route) {
    }

    public final synchronized void failed(Route route) {
    }

    public final synchronized boolean shouldPostpone(Route route) {
    }
}
