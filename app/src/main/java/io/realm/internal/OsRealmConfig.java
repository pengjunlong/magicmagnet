package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.bpbbpOxqjGWQAsycX11ll1l1;
import io.realm.internal.OsSharedRealm;
import java.io.File;
import java.net.URI;
import p000.jg0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OsRealmConfig implements jg0 {
    private static final long pbppbpqbamJRy11l1l1 = 0;
    private final URI bpdqqiQNVROMLC1ll1l1l11;
    private final OsSharedRealm.InitializationCallback dbppbdqpeLmcbs11l11;
    private final CompactOnLaunchCallback ddbbbeXHXx111ll;
    private final bpbbpOxqjGWQAsycX11ll1l1 dpbdpqRKAscW1lll1l;
    private final OsSharedRealm.MigrationCallback dqpdbEevAufTOvPphbjykClll1l11;
    private final io.realm.internal.dqqppqiKzJi1l1lll1l dqpqqqbqQyjyB11111l1;
    private final long ppbdpwWWljzmXXdHNabfWhgjl111l11;

    static /* synthetic */ class dbpqdHhmDSIHIJiwc1ll1l1 {
        static final /* synthetic */ int[] dbpqdHhmDSIHIJiwc1ll1l1 = null;
    }

    public static class dpbdbdpbLwkLpObyKsq1lll1 {
        private boolean bpdqqiQNVROMLC1ll1l1l11;
        private bpbbpOxqjGWQAsycX11ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;
        private OsSchemaInfo dpbdbdpbLwkLpObyKsq1lll1;
        private OsSharedRealm.InitializationCallback dpbdpqRKAscW1lll1l;
        private OsSharedRealm.MigrationCallback dqqppqiKzJi1l1lll1l;
        private String ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dpbdbdpbLwkLpObyKsq1lll1(bpbbpOxqjGWQAsycX11ll1l1 bpbbpoxqjgwqasycx11ll1l1) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1 bpdqqiQNVROMLC1ll1l1l11(OsSharedRealm.MigrationCallback migrationCallback) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1 dbpqdHhmDSIHIJiwc1ll1l1(boolean z) {
        }

        public OsRealmConfig dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l(OsSharedRealm.InitializationCallback initializationCallback) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1 dqqppqiKzJi1l1lll1l(File file) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1 ppbdpwWWljzmXXdHNabfWhgjl111l11(OsSchemaInfo osSchemaInfo) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class dpbdpqRKAscW1lll1l {
        public static final dpbdpqRKAscW1lll1l bpdqqiQNVROMLC1ll1l1l11 = null;
        public static final dpbdpqRKAscW1lll1l dbppbdqpeLmcbs11l11 = null;
        public static final dpbdpqRKAscW1lll1l ddbbbeXHXx111ll = null;
        public static final dpbdpqRKAscW1lll1l dqpdbEevAufTOvPphbjykClll1l11 = null;
        public static final dpbdpqRKAscW1lll1l dqpqqqbqQyjyB11111l1 = null;
        private static final /* synthetic */ dpbdpqRKAscW1lll1l[] pbppbpqbamJRy11l1l1 = null;
        public static final dpbdpqRKAscW1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;
        final byte dpbdpqRKAscW1lll1l;

        private dpbdpqRKAscW1lll1l(String str, int i, byte b) {
        }

        public static dpbdpqRKAscW1lll1l valueOf(String str) {
        }

        public static dpbdpqRKAscW1lll1l[] values() {
        }

        public byte dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class dqqppqiKzJi1l1lll1l {
        public static final dqqppqiKzJi1l1lll1l bpdqqiQNVROMLC1ll1l1l11 = null;
        private static final /* synthetic */ dqqppqiKzJi1l1lll1l[] dqpqqqbqQyjyB11111l1 = null;
        public static final dqqppqiKzJi1l1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;
        final int dpbdpqRKAscW1lll1l;

        private dqqppqiKzJi1l1lll1l(String str, int i, int i2) {
        }

        public static dqqppqiKzJi1l1lll1l valueOf(String str) {
        }

        public static dqqppqiKzJi1l1lll1l[] values() {
        }
    }

    /* synthetic */ OsRealmConfig(bpbbpOxqjGWQAsycX11ll1l1 bpbbpoxqjgwqasycx11ll1l1, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private static native long nativeCreate(String str, String str2, boolean z, long j);

    private native String nativeCreateAndSetSyncConfig(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, byte b, String str7, String str8, String[] strArr, byte b2, Object obj, Object obj2, String str9, Object obj3);

    private static native void nativeEnableChangeNotification(long j, boolean z);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j, byte[] bArr);

    private static native void nativeSetInMemory(long j, boolean z);

    private native void nativeSetInitializationCallback(long j, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j, byte b, long j2, long j3, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j, byte b, String str, int i);

    io.realm.internal.dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    public bpbbpOxqjGWQAsycX11ll1l1 dpbdbdpbLwkLpObyKsq1lll1() {
    }

    public URI dqqppqiKzJi1l1lll1l() {
    }

    @Override // p000.jg0
    public long getNativeFinalizerPtr() {
    }

    @Override // p000.jg0
    public long getNativePtr() {
    }

    private OsRealmConfig(bpbbpOxqjGWQAsycX11ll1l1 bpbbpoxqjgwqasycx11ll1l1, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback) {
    }
}
