package com.google.android.material.color.utilities;

import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    private static final class Distance implements Comparable<Distance> {
        double distance;
        int index;

        Distance() {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Distance distance) {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Distance distance) {
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i) {
    }
}
