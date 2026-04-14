package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BigIntegerMath {
    private static final double LN_10 = 0.0d;
    private static final double LN_2 = 0.0d;

    @VisibleForTesting
    static final BigInteger SQRT2_PRECOMPUTED_BITS = null;

    @VisibleForTesting
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;

    /* renamed from: com.google.common.math.BigIntegerMath$1 */
    static /* synthetic */ class C09481 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;
    }

    @GwtIncompatible
    private static class BigIntegerToDoubleRounder extends ToDoubleRounder<BigInteger> {
        static final BigIntegerToDoubleRounder INSTANCE = null;

        private BigIntegerToDoubleRounder() {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* bridge */ /* synthetic */ BigInteger minus(BigInteger bigInteger, BigInteger bigInteger2) {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* bridge */ /* synthetic */ double roundToDoubleArbitrarily(BigInteger bigInteger) {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* bridge */ /* synthetic */ int sign(BigInteger bigInteger) {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* bridge */ /* synthetic */ BigInteger toX(double d, RoundingMode roundingMode) {
        }

        /* renamed from: minus, reason: avoid collision after fix types in other method */
        BigInteger minus2(BigInteger bigInteger, BigInteger bigInteger2) {
        }

        /* renamed from: roundToDoubleArbitrarily, reason: avoid collision after fix types in other method */
        double roundToDoubleArbitrarily2(BigInteger bigInteger) {
        }

        /* renamed from: sign, reason: avoid collision after fix types in other method */
        int sign2(BigInteger bigInteger) {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: toX, reason: avoid collision after fix types in other method */
        BigInteger toX2(double d, RoundingMode roundingMode) {
        }
    }

    private BigIntegerMath() {
    }

    public static BigInteger binomial(int i, int i2) {
    }

    @Beta
    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
    }

    @GwtIncompatible
    public static BigInteger divide(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
    }

    public static BigInteger factorial(int i) {
    }

    @GwtIncompatible
    static boolean fitsInLong(BigInteger bigInteger) {
    }

    @Beta
    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
    }

    static BigInteger listProduct(List<BigInteger> list) {
    }

    @GwtIncompatible
    public static int log10(BigInteger bigInteger, RoundingMode roundingMode) {
    }

    public static int log2(BigInteger bigInteger, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static double roundToDouble(BigInteger bigInteger, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    public static BigInteger sqrt(BigInteger bigInteger, RoundingMode roundingMode) {
    }

    @GwtIncompatible
    private static BigInteger sqrtApproxWithDoubles(BigInteger bigInteger) {
    }

    @GwtIncompatible
    private static BigInteger sqrtFloor(BigInteger bigInteger) {
    }

    static BigInteger listProduct(List<BigInteger> list, int i, int i2) {
    }
}
