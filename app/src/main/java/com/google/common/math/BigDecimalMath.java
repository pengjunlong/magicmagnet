package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import java.math.BigDecimal;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class BigDecimalMath {

    private static class BigDecimalToDoubleRounder extends ToDoubleRounder<BigDecimal> {
        static final BigDecimalToDoubleRounder INSTANCE = null;

        private BigDecimalToDoubleRounder() {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* bridge */ /* synthetic */ BigDecimal minus(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* bridge */ /* synthetic */ double roundToDoubleArbitrarily(BigDecimal bigDecimal) {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* bridge */ /* synthetic */ int sign(BigDecimal bigDecimal) {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* bridge */ /* synthetic */ BigDecimal toX(double d, RoundingMode roundingMode) {
        }

        /* renamed from: minus, reason: avoid collision after fix types in other method */
        BigDecimal minus2(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        }

        /* renamed from: roundToDoubleArbitrarily, reason: avoid collision after fix types in other method */
        double roundToDoubleArbitrarily2(BigDecimal bigDecimal) {
        }

        /* renamed from: sign, reason: avoid collision after fix types in other method */
        int sign2(BigDecimal bigDecimal) {
        }

        @Override // com.google.common.math.ToDoubleRounder
        /* renamed from: toX, reason: avoid collision after fix types in other method */
        BigDecimal toX2(double d, RoundingMode roundingMode) {
        }
    }

    private BigDecimalMath() {
    }

    public static double roundToDouble(BigDecimal bigDecimal, RoundingMode roundingMode) {
    }
}
