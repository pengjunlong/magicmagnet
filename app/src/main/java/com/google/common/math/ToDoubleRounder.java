package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class ToDoubleRounder<X extends Number & Comparable<X>> {

    /* renamed from: com.google.common.math.ToDoubleRounder$1 */
    static /* synthetic */ class C09561 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;
    }

    ToDoubleRounder() {
    }

    abstract X minus(X x, X x2);

    final double roundToDouble(X x, RoundingMode roundingMode) {
    }

    abstract double roundToDoubleArbitrarily(X x);

    abstract int sign(X x);

    abstract X toX(double d, RoundingMode roundingMode);
}
