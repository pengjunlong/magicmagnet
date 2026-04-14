package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;

@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = null;
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    FarmHashFingerprint64() {
    }

    @VisibleForTesting
    static long fingerprint(byte[] bArr, int i, int i2) {
    }

    private static long hashLength0to16(byte[] bArr, int i, int i2) {
    }

    private static long hashLength16(long j, long j2, long j3) {
    }

    private static long hashLength17to32(byte[] bArr, int i, int i2) {
    }

    private static long hashLength33To64(byte[] bArr, int i, int i2) {
    }

    private static long hashLength65Plus(byte[] bArr, int i, int i2) {
    }

    private static long shiftMix(long j) {
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i, long j, long j2, long[] jArr) {
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
    }

    public String toString() {
    }
}
