package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class MathPreconditions {
    private MathPreconditions() {
    }

    static void checkInRangeForRoundingInputs(boolean z, double d, RoundingMode roundingMode) {
    }

    static void checkNoOverflow(boolean z, String str, int i, int i2) {
    }

    static int checkNonNegative(String str, int i) {
    }

    static int checkPositive(String str, int i) {
    }

    static void checkRoundingUnnecessary(boolean z) {
    }

    static void checkNoOverflow(boolean z, String str, long j, long j2) {
    }

    static long checkNonNegative(String str, long j) {
    }

    static long checkPositive(String str, long j) {
    }

    static BigInteger checkNonNegative(String str, BigInteger bigInteger) {
    }

    static BigInteger checkPositive(String str, BigInteger bigInteger) {
    }

    static double checkNonNegative(String str, double d) {
    }
}
