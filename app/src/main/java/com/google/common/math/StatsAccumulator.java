package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class StatsAccumulator {
    private long count;
    private double max;
    private double mean;
    private double min;
    private double sumOfSquaresOfDeltas;

    static double calculateNewMeanNonFinite(double d, double d2) {
    }

    private void merge(long j, double d, double d2, double d3, double d4) {
    }

    public void add(double d) {
    }

    public void addAll(Iterable<? extends Number> iterable) {
    }

    public long count() {
    }

    public double max() {
    }

    public double mean() {
    }

    public double min() {
    }

    public final double populationStandardDeviation() {
    }

    public final double populationVariance() {
    }

    public final double sampleStandardDeviation() {
    }

    public final double sampleVariance() {
    }

    public Stats snapshot() {
    }

    public final double sum() {
    }

    double sumOfSquaresOfDeltas() {
    }

    public void addAll(Iterator<? extends Number> it) {
    }

    public void addAll(double... dArr) {
    }

    public void addAll(int... iArr) {
    }

    public void addAll(long... jArr) {
    }

    public void addAll(Stats stats) {
    }

    public void addAll(StatsAccumulator statsAccumulator) {
    }
}
