package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SQLiteEventStore implements EventStore, SynchronizationGuard {
    private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
    private static final String LOG_TAG = "SQLiteEventStore";
    static final int MAX_RETRIES = 16;
    private static final Encoding PROTOBUF_ENCODING = null;
    private final EventStoreConfig config;
    private final Clock monotonicClock;
    private final SchemaManager schemaManager;
    private final Clock wallClock;

    interface Function<T, U> {
        U apply(T t);
    }

    private static class Metadata {
        final String key;
        final String value;

        /* synthetic */ Metadata(String str, String str2, C00681 c00681) {
        }

        private Metadata(String str, String str2) {
        }
    }

    interface Producer<T> {
        T produce();
    }

    SQLiteEventStore(@WallTime Clock clock, @Monotonic Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager) {
    }

    public static /* synthetic */ Object bdddqmITkkeGpsxVXHR1l1llll(SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ Long bpbbpOxqjGWQAsycX11ll1l1(Cursor cursor) {
    }

    public static /* synthetic */ Object bpqbbqTOKdRXac1ll1l1lll(SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ List bpqdqbqpviKiORjqgp1l111l11(SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ Boolean dbbpdqqpdVUhpQ1ll11(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ Long dbppbdqpeLmcbs11l11(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, EventInternal eventInternal, SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ Long dddbpbpNqzZZJmSG1111l(Cursor cursor) {
    }

    public static /* synthetic */ Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(String str, SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ SQLiteDatabase dpbdbdpbLwkLpObyKsq1lll1(Throwable th) {
    }

    public static /* synthetic */ byte[] dpbdpqRKAscW1lll1l(Cursor cursor) {
    }

    public static /* synthetic */ Object dqdqbpQposEBDyDxIyyz1ll11(long j, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ Object dqpqqqbqQyjyB11111l1(Throwable th) {
    }

    private void ensureBeginTransaction(SQLiteDatabase sQLiteDatabase) {
    }

    private long ensureTransportContext(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
    }

    private long getPageCount() {
    }

    private long getPageSize() {
    }

    private Long getTransportContextId(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
    }

    private boolean isStorageAtLimit() {
    }

    private List<PersistedEvent> join(List<PersistedEvent> list, Map<Long, Set<Metadata>> map) {
    }

    private static /* synthetic */ Integer lambda$cleanUp$10(long j, SQLiteDatabase sQLiteDatabase) {
    }

    private static /* synthetic */ Object lambda$clearDb$11(SQLiteDatabase sQLiteDatabase) {
    }

    private static /* synthetic */ Object lambda$ensureBeginTransaction$15(SQLiteDatabase sQLiteDatabase) {
    }

    private static /* synthetic */ Object lambda$ensureBeginTransaction$16(Throwable th) {
    }

    private static /* synthetic */ SQLiteDatabase lambda$getDb$0(Throwable th) {
    }

    private static /* synthetic */ Long lambda$getNextCallTime$4(Cursor cursor) {
    }

    private static /* synthetic */ Long lambda$getTransportContextId$2(Cursor cursor) {
    }

    private /* synthetic */ Boolean lambda$hasPendingEventsFor$5(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
    }

    private static /* synthetic */ List lambda$loadActiveContexts$8(Cursor cursor) {
    }

    private static /* synthetic */ List lambda$loadActiveContexts$9(SQLiteDatabase sQLiteDatabase) {
    }

    private /* synthetic */ List lambda$loadBatch$7(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
    }

    private /* synthetic */ Object lambda$loadEvents$12(List list, TransportContext transportContext, Cursor cursor) {
    }

    private static /* synthetic */ Object lambda$loadMetadata$14(Map map, Cursor cursor) {
    }

    private /* synthetic */ Long lambda$persist$1(TransportContext transportContext, EventInternal eventInternal, SQLiteDatabase sQLiteDatabase) {
    }

    private static /* synthetic */ byte[] lambda$readPayload$13(Cursor cursor) {
    }

    private static /* synthetic */ Object lambda$recordFailure$3(String str, SQLiteDatabase sQLiteDatabase) {
    }

    private static /* synthetic */ Object lambda$recordNextCallTime$6(long j, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
    }

    private List<PersistedEvent> loadEvents(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
    }

    private Map<Long, Set<Metadata>> loadMetadata(SQLiteDatabase sQLiteDatabase, List<PersistedEvent> list) {
    }

    private static byte[] maybeBase64Decode(String str) {
    }

    public static /* synthetic */ Object pdpqbmApOBCmNMwnn1ll111(SQLiteEventStore sQLiteEventStore, List list, TransportContext transportContext, Cursor cursor) {
    }

    public static /* synthetic */ Integer ppbdpwWWljzmXXdHNabfWhgjl111l11(long j, SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ List qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(Cursor cursor) {
    }

    public static /* synthetic */ List qdqdpyALEmZFGGaahRTIU1ll11(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
    }

    public static /* synthetic */ Object qppqdpppIauLKaAtRkB11111l(Map map, Cursor cursor) {
    }

    private byte[] readPayload(long j) {
    }

    private <T> T retryIfDbLocked(Producer<T> producer, Function<Throwable, T> function) {
    }

    private static Encoding toEncoding(String str) {
    }

    private static String toIdList(Iterable<PersistedEvent> iterable) {
    }

    static <T> T tryWithCursor(Cursor cursor, Function<Cursor, T> function) {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
    }

    public void clearDb() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    long getByteSize() {
    }

    SQLiteDatabase getDb() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(TransportContext transportContext) {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(TransportContext transportContext) {
    }

    <T> T inTransaction(Function<SQLiteDatabase, T> function) {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<TransportContext> loadActiveContexts() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<PersistedEvent> loadBatch(TransportContext transportContext) {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public PersistedEvent persist(TransportContext transportContext, EventInternal eventInternal) {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(Iterable<PersistedEvent> iterable) {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(TransportContext transportContext, long j) {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(Iterable<PersistedEvent> iterable) {
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(SynchronizationGuard.CriticalSection<T> criticalSection) {
    }
}
