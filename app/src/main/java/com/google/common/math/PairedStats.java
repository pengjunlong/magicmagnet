package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class PairedStats implements Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    PairedStats(Stats stats, Stats stats2, double d) {
    }

    private static double ensureInUnitRange(double d) {
    }

    private static double ensurePositive(double d) {
    }

    public static PairedStats fromByteArray(byte[] bArr) {
    }

    public long count() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public LinearTransformation leastSquaresFit() {
    }

    public double pearsonsCorrelationCoefficient() {
    }

    public double populationCovariance() {
    }

    public double sampleCovariance() {
    }

    double sumOfProductsOfDeltas() {
    }

    public byte[] toByteArray() {
    }

    public String toString() {
    }

    public Stats xStats() {
    }

    public Stats yStats() {
    }
}
