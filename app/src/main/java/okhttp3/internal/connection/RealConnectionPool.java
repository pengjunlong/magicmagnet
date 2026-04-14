package okhttp3.internal.connection;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class RealConnectionPool {
    public static final Companion Companion = null;
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
        }
    }

    public RealConnectionPool(TaskRunner taskRunner, int i, long j, TimeUnit timeUnit) {
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
    }

    public final boolean callAcquirePooledConnection(Address address, RealCall realCall, List<Route> list, boolean z) {
    }

    public final long cleanup(long j) {
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
    }

    public final int connectionCount() {
    }

    public final void evictAll() {
    }

    public final int idleConnectionCount() {
    }

    public final void put(RealConnection realConnection) {
    }
}
