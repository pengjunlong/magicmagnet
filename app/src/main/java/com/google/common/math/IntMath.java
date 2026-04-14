package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class IntMath {

    @VisibleForTesting
    static final int FLOOR_SQRT_MAX_INT = 46340;

    @VisibleForTesting
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;

    @VisibleForTesting
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;

    @VisibleForTesting
    static int[] biggestBinomials;
    private static final int[] factorials = null;

    @VisibleForTesting
    static final int[] halfPowersOf10 = null;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = null;

    @VisibleForTesting
    static final int[] powersOf10 = null;

    /* renamed from: com.google.common.math.IntMath$1 */
    static /* synthetic */ class C09501 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;
    }

    private IntMath() {
    }

    public static int binomial(int i, int i2) {
    }

    @Beta
    public static int ceilingPowerOfTwo(int i) {
    }

    public static int checkedAdd(int i, int i2) {
    }

    public static int checkedMultiply(int i, int i2) {
    }

    public static int checkedPow(int i, int i2) {
    }

    public static int checkedSubtract(int i, int i2) {
    }

    public static int divide(int i, int i2, RoundingMode roundingMode) {
    }

    public static int factorial(int i) {
    }

    @Beta
    public static int floorPowerOfTwo(int i) {
    }

    public static int gcd(int i, int i2) {
    }

    public static boolean isPowerOfTwo(int i) {
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(int i) {
    }

    @VisibleForTesting
    static int lessThanBranchFree(int i, int i2) {
    }

    @GwtIncompatible
    public static int log10(int i, RoundingMode roundingMode) {
    }

    private static int log10Floor(int i) {
    }

    public static int log2(int i, RoundingMode roundingMode) {
    }

    public static int mean(int i, int i2) {
    }

    public static int mod(int i, int i2) {
    }

    @GwtIncompatible
    public static int pow(int i, int i2) {
    }

    @Beta
    public static int saturatedAdd(int i, int i2) {
    }

    @Beta
    public static int saturatedMultiply(int i, int i2) {
    }

    @Beta
    public static int saturatedPow(int i, int i2) {
    }

    @Beta
    public static int saturatedSubtract(int i, int i2) {
    }

    @GwtIncompatible
    public static int sqrt(int i, RoundingMode roundingMode) {
    }

    private static int sqrtFloor(int i) {
    }
}
