package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LongMath {

    @VisibleForTesting
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;

    @VisibleForTesting
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;

    @VisibleForTesting
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;
    static final int[] biggestBinomials = null;

    @VisibleForTesting
    static final int[] biggestSimpleBinomials = null;
    static final long[] factorials = null;

    @VisibleForTesting
    @GwtIncompatible
    static final long[] halfPowersOf10 = null;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = null;
    private static final long[][] millerRabinBaseSets = null;

    @VisibleForTesting
    @GwtIncompatible
    static final long[] powersOf10 = null;

    /* renamed from: com.google.common.math.LongMath$1 */
    static /* synthetic */ class C09521 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static abstract class MillerRabinTester {
        private static final /* synthetic */ MillerRabinTester[] $VALUES = null;
        public static final MillerRabinTester LARGE = null;
        public static final MillerRabinTester SMALL = null;

        /* renamed from: com.google.common.math.LongMath$MillerRabinTester$1 */
        enum C09531 extends MillerRabinTester {
            C09531(String str, int i) {
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long j, long j2, long j3) {
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long j, long j2) {
            }
        }

        /* renamed from: com.google.common.math.LongMath$MillerRabinTester$2 */
        enum C09542 extends MillerRabinTester {
            C09542(String str, int i) {
            }

            private long plusMod(long j, long j2, long j3) {
            }

            private long times2ToThe32Mod(long j, long j2) {
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long j, long j2, long j3) {
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long j, long j2) {
            }
        }

        private static /* synthetic */ MillerRabinTester[] $values() {
        }

        private MillerRabinTester(String str, int i) {
        }

        private long powMod(long j, long j2, long j3) {
        }

        static boolean test(long j, long j2) {
        }

        private boolean testWitness(long j, long j2) {
        }

        public static MillerRabinTester valueOf(String str) {
        }

        public static MillerRabinTester[] values() {
        }

        abstract long mulMod(long j, long j2, long j3);

        abstract long squareMod(long j, long j2);

        /* synthetic */ MillerRabinTester(String str, int i, C09521 c09521) {
        }
    }

    private LongMath() {
    }

    public static long binomial(int i, int i2) {
    }

    @Beta
    public static long ceilingPowerOfTwo(long j) {
    }

    @GwtIncompatible
    public static long checkedAdd(long j, long j2) {
    }

    public static long checkedMultiply(long j, long j2) {
    }

    @GwtIncompatible
    public static long checkedPow(long j, int i) {
    }

    @GwtIncompatible
    public static long checkedSubtract(long j, long j2) {
    }

    @GwtIncompatible
    public static long divide(long j, long j2, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static long factorial(int i) {
    }

    static boolean fitsInInt(long j) {
    }

    @Beta
    public static long floorPowerOfTwo(long j) {
    }

    public static long gcd(long j, long j2) {
    }

    public static boolean isPowerOfTwo(long j) {
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(long j) {
    }

    @VisibleForTesting
    static int lessThanBranchFree(long j, long j2) {
    }

    @GwtIncompatible
    public static int log10(long j, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    static int log10Floor(long j) {
    }

    public static int log2(long j, RoundingMode roundingMode) {
    }

    public static long mean(long j, long j2) {
    }

    @GwtIncompatible
    public static int mod(long j, int i) {
    }

    static long multiplyFraction(long j, long j2, long j3) {
    }

    @GwtIncompatible
    public static long pow(long j, int i) {
    }

    @GwtIncompatible
    public static double roundToDouble(long j, RoundingMode roundingMode) {
    }

    @Beta
    public static long saturatedAdd(long j, long j2) {
    }

    @Beta
    public static long saturatedMultiply(long j, long j2) {
    }

    @Beta
    public static long saturatedPow(long j, int i) {
    }

    @Beta
    public static long saturatedSubtract(long j, long j2) {
    }

    @GwtIncompatible
    public static long sqrt(long j, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static long mod(long j, long j2) {
    }
}
