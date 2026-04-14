package com.google.common.hash;

import com.google.common.hash.BloomFilter;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class BloomFilterStrategies implements BloomFilter.Strategy {
    private static final /* synthetic */ BloomFilterStrategies[] $VALUES = null;
    public static final BloomFilterStrategies MURMUR128_MITZ_32 = null;
    public static final BloomFilterStrategies MURMUR128_MITZ_64 = null;

    /* renamed from: com.google.common.hash.BloomFilterStrategies$1 */
    enum C09141 extends BloomFilterStrategies {
        C09141(String str, int i) {
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
        }
    }

    /* renamed from: com.google.common.hash.BloomFilterStrategies$2 */
    enum C09152 extends BloomFilterStrategies {
        C09152(String str, int i) {
        }

        private long lowerEight(byte[] bArr) {
        }

        private long upperEight(byte[] bArr) {
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
        }
    }

    private static /* synthetic */ BloomFilterStrategies[] $values() {
    }

    private BloomFilterStrategies(String str, int i) {
    }

    public static BloomFilterStrategies valueOf(String str) {
    }

    public static BloomFilterStrategies[] values() {
    }

    /* synthetic */ BloomFilterStrategies(String str, int i, C09141 c09141) {
    }

    static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final LongAddable bitCount;
        final AtomicLongArray data;

        LockFreeBitArray(long j) {
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
        }

        long bitCount() {
        }

        long bitSize() {
        }

        LockFreeBitArray copy() {
        }

        public boolean equals(Object obj) {
        }

        boolean get(long j) {
        }

        public int hashCode() {
        }

        void putAll(LockFreeBitArray lockFreeBitArray) {
        }

        boolean set(long j) {
        }

        LockFreeBitArray(long[] jArr) {
        }
    }
}
