package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class PairedStatsAccumulator {
    private double sumOfProductsOfDeltas;
    private final StatsAccumulator xStats;
    private final StatsAccumulator yStats;

    private static double ensureInUnitRange(double d) {
    }

    private double ensurePositive(double d) {
    }

    public void add(double d, double d2) {
    }

    public void addAll(PairedStats pairedStats) {
    }

    public long count() {
    }

    public final LinearTransformation leastSquaresFit() {
    }

    public final double pearsonsCorrelationCoefficient() {
    }

    public double populationCovariance() {
    }

    public final double sampleCovariance() {
    }

    public PairedStats snapshot() {
    }

    public Stats xStats() {
    }

    public Stats yStats() {
    }
}
