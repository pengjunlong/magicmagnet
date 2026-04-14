package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SlidingPercentile {
    private static final Comparator<Sample> INDEX_COMPARATOR = null;
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private static final Comparator<Sample> VALUE_COMPARATOR = null;
    private int currentSortOrder;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private final Sample[] recycledSamples;
    private final ArrayList<Sample> samples;
    private int totalWeight;

    private static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }

        /* synthetic */ Sample(C02291 c02291) {
        }
    }

    public SlidingPercentile(int i) {
    }

    public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(Sample sample, Sample sample2) {
    }

    public static /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1(Sample sample, Sample sample2) {
    }

    private void ensureSortedByIndex() {
    }

    private void ensureSortedByValue() {
    }

    private static /* synthetic */ int lambda$static$0(Sample sample, Sample sample2) {
    }

    private static /* synthetic */ int lambda$static$1(Sample sample, Sample sample2) {
    }

    public void addSample(int i, float f) {
    }

    public float getPercentile(float f) {
    }

    public void reset() {
    }
}
