package com.google.android.material.color.utilities;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Score {
    private static final double CUTOFF_CHROMA = 15.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final double CUTOFF_TONE = 10.0d;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    static class ScoredComparator implements Comparator<Map.Entry<Integer, Double>> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Map.Entry<Integer, Double> entry, Map.Entry<Integer, Double> entry2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Map.Entry<Integer, Double> entry, Map.Entry<Integer, Double> entry2) {
        }
    }

    private Score() {
    }

    private static List<Integer> filter(Map<Integer, Double> map, Map<Integer, Cam16> map2) {
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
    }
}
