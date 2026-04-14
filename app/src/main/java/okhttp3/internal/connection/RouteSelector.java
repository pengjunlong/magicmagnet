package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RouteSelector {
    public static final Companion Companion = null;
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
        }
    }

    @xc0
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
        }

        public final List<Route> getRoutes() {
        }

        public final boolean hasNext() {
        }

        public final Route next() {
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
    }

    private final boolean hasNextProxy() {
    }

    private final Proxy nextProxy() throws IOException {
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
    }

    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
    }

    public final boolean hasNext() {
    }

    public final Selection next() throws IOException {
    }
}
