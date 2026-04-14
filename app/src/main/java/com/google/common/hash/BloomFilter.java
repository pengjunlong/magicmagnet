package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilterStrategies;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private final BloomFilterStrategies.LockFreeBitArray bits;
    private final Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final Strategy strategy;

    private static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final Funnel<? super T> funnel;
        final int numHashFunctions;
        final Strategy strategy;

        SerialForm(BloomFilter<T> bloomFilter) {
        }

        Object readResolve() {
        }
    }

    interface Strategy extends Serializable {
        <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);

        int ordinal();

        <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    /* synthetic */ BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i, Funnel funnel, Strategy strategy, C09131 c09131) {
    }

    static /* synthetic */ BloomFilterStrategies.LockFreeBitArray access$000(BloomFilter bloomFilter) {
    }

    static /* synthetic */ int access$100(BloomFilter bloomFilter) {
    }

    static /* synthetic */ Funnel access$200(BloomFilter bloomFilter) {
    }

    static /* synthetic */ Strategy access$300(BloomFilter bloomFilter) {
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i, double d) {
    }

    @VisibleForTesting
    static long optimalNumOfBits(long j, double d) {
    }

    @VisibleForTesting
    static int optimalNumOfHashFunctions(long j, long j2) {
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
    }

    private Object writeReplace() {
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(@ParametricNullness T t) {
    }

    public long approximateElementCount() {
    }

    @VisibleForTesting
    long bitSize() {
    }

    public BloomFilter<T> copy() {
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
    }

    public double expectedFpp() {
    }

    public int hashCode() {
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
    }

    public boolean mightContain(@ParametricNullness T t) {
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness T t) {
    }

    public void putAll(BloomFilter<T> bloomFilter) {
    }

    public void writeTo(OutputStream outputStream) throws IOException {
    }

    private BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i, Funnel<? super T> funnel, Strategy strategy) {
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j, double d) {
    }

    @VisibleForTesting
    static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j, double d, Strategy strategy) {
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i) {
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j) {
    }
}
