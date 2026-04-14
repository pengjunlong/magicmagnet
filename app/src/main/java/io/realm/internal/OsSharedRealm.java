package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.bpbbpOxqjGWQAsycX11ll1l1;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.bqqqpdJTCBoqSSVKIXl1111111l;
import p000.jg0;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class OsSharedRealm implements Closeable, jg0 {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = 0;
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = null;
    private static volatile File temporaryDirectory;
    public final bqqqpdJTCBoqSSVKIXl1111111l capabilities;
    public final dqqppqiKzJi1l1lll1l context;
    final List<WeakReference<OsResults.dbpqdHhmDSIHIJiwc1ll1l1>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<ppbdpwWWljzmXXdHNabfWhgjl111l11>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    @Keep
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    @Keep
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2);
    }

    @Keep
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    public static class dbpqdHhmDSIHIJiwc1ll1l1 implements Comparable<dbpqdHhmDSIHIJiwc1ll1l1> {
        public static final dbpqdHhmDSIHIJiwc1ll1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;
        public final long bpdqqiQNVROMLC1ll1l1l11;
        public final long dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(long j, long j2) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public int dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void detachIterators() {
    }

    private void executePendingRowQueries() {
    }

    public static OsSharedRealm getInstance(bpbbpOxqjGWQAsycX11ll1l1 bpbbpoxqjgwqasycx11ll1l1, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public static File getTemporaryDirectory() {
    }

    public static void initialize(File file) {
    }

    private static native void nativeBeginTransaction(long j);

    private static native void nativeCancelTransaction(long j);

    private static native void nativeCloseSharedRealm(long j);

    private static native void nativeCommitTransaction(long j);

    private static native boolean nativeCompact(long j);

    private static native long nativeCreateTable(long j, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j, String str, String str2, int i, boolean z);

    private static native long nativeFreeze(long j);

    private static native long nativeGetActiveSubscriptionSet(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetLatestSubscriptionSet(long j);

    private static native long nativeGetSchemaInfo(long j);

    private static native long nativeGetSharedRealm(long j, long j2, long j3, RealmNotifier realmNotifier);

    private static native long nativeGetTableRef(long j, String str);

    private static native String[] nativeGetTablesName(long j);

    private static native long[] nativeGetVersionID(long j);

    private static native boolean nativeHasTable(long j, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j);

    private static native boolean nativeIsClosed(long j);

    private static native boolean nativeIsEmpty(long j);

    private static native boolean nativeIsFrozen(long j);

    private static native boolean nativeIsInTransaction(long j);

    private static native long nativeNumberOfVersions(long j);

    private static native void nativeRefresh(long j);

    private static native void nativeRegisterSchemaChangedCallback(long j, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j, String str, String str2);

    private static native void nativeSetAutoRefresh(long j, boolean z);

    private static native long nativeSize(long j);

    private static native void nativeStopWaitForChange(long j);

    private static native boolean nativeWaitForChange(long j);

    private static native void nativeWriteCopy(long j, String str, byte[] bArr);

    private static void runInitializationCallback(long j, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
    }

    private static void runMigrationCallback(long j, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j2) {
    }

    void addIterator(OsResults.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    void addPendingRow(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    public void beginTransaction() {
    }

    public void cancelTransaction() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void commitTransaction() {
    }

    public boolean compact() {
    }

    public Table createTable(String str) {
    }

    public Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z) {
    }

    public OsSharedRealm freeze() {
    }

    public bpbbpOxqjGWQAsycX11ll1l1 getConfiguration() {
    }

    @Override // p000.jg0
    public long getNativeFinalizerPtr() {
    }

    @Override // p000.jg0
    public long getNativePtr() {
    }

    public long getNumberOfVersions() {
    }

    public String getPath() {
    }

    public OsSchemaInfo getSchemaInfo() {
    }

    public Table getTable(String str) {
    }

    public String[] getTablesNames() {
    }

    public dbpqdHhmDSIHIJiwc1ll1l1 getVersionID() {
    }

    public boolean hasTable(String str) {
    }

    void invalidateIterators() {
    }

    public boolean isAutoRefresh() {
    }

    public boolean isClosed() {
    }

    public boolean isEmpty() {
    }

    public boolean isFrozen() {
    }

    public boolean isInTransaction() {
    }

    public boolean isSyncRealm() {
    }

    public void refresh() {
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
    }

    void removePendingRow(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    public void renameTable(String str, String str2) {
    }

    public void setAutoRefresh(boolean z) {
    }

    public long size() {
    }

    public void stopWaitForChange() {
    }

    public boolean waitForChange() {
    }

    public void writeCopy(File file, byte[] bArr) {
    }

    public static OsSharedRealm getInstance(OsRealmConfig.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    OsSharedRealm(long j, OsRealmConfig osRealmConfig) {
    }

    OsSharedRealm(long j, OsRealmConfig osRealmConfig, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }
}
