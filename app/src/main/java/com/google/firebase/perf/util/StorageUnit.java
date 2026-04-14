package com.google.firebase.perf.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class StorageUnit {
    private static final /* synthetic */ StorageUnit[] $VALUES = null;
    public static final StorageUnit BYTES = null;
    public static final StorageUnit GIGABYTES = null;
    public static final StorageUnit KILOBYTES = null;
    public static final StorageUnit MEGABYTES = null;
    public static final StorageUnit TERABYTES = null;
    long numBytes;

    /* renamed from: com.google.firebase.perf.util.StorageUnit$1 */
    enum C11751 extends StorageUnit {
        C11751(String str, int i, long j) {
        }

        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j, StorageUnit storageUnit) {
        }
    }

    /* renamed from: com.google.firebase.perf.util.StorageUnit$2 */
    enum C11762 extends StorageUnit {
        C11762(String str, int i, long j) {
        }

        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j, StorageUnit storageUnit) {
        }
    }

    /* renamed from: com.google.firebase.perf.util.StorageUnit$3 */
    enum C11773 extends StorageUnit {
        C11773(String str, int i, long j) {
        }

        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j, StorageUnit storageUnit) {
        }
    }

    /* renamed from: com.google.firebase.perf.util.StorageUnit$4 */
    enum C11784 extends StorageUnit {
        C11784(String str, int i, long j) {
        }

        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j, StorageUnit storageUnit) {
        }
    }

    /* renamed from: com.google.firebase.perf.util.StorageUnit$5 */
    enum C11795 extends StorageUnit {
        C11795(String str, int i, long j) {
        }

        @Override // com.google.firebase.perf.util.StorageUnit
        public long convert(long j, StorageUnit storageUnit) {
        }
    }

    /* synthetic */ StorageUnit(String str, int i, long j, C11751 c11751) {
    }

    public static StorageUnit valueOf(String str) {
    }

    public static StorageUnit[] values() {
    }

    public abstract long convert(long j, StorageUnit storageUnit);

    public long toBytes(long j) {
    }

    public long toGigabytes(long j) {
    }

    public long toKilobytes(long j) {
    }

    public long toMegabytes(long j) {
    }

    public long toTerabytes(long j) {
    }

    private StorageUnit(String str, int i, long j) {
    }
}
