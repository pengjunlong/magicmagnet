package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.Collection;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Quantiles {

    public static final class Scale {
        private final int scale;

        /* synthetic */ Scale(int i, C09551 c09551) {
        }

        public ScaleAndIndex index(int i) {
        }

        public ScaleAndIndexes indexes(int... iArr) {
        }

        private Scale(int i) {
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
        }
    }

    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        /* synthetic */ ScaleAndIndex(int i, int i2, C09551 c09551) {
        }

        public double compute(Collection<? extends Number> collection) {
        }

        public double computeInPlace(double... dArr) {
        }

        private ScaleAndIndex(int i, int i2) {
        }

        public double compute(double... dArr) {
        }

        public double compute(long... jArr) {
        }

        public double compute(int... iArr) {
        }
    }

    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        /* synthetic */ ScaleAndIndexes(int i, int[] iArr, C09551 c09551) {
        }

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
        }

        private ScaleAndIndexes(int i, int[] iArr) {
        }

        public Map<Integer, Double> compute(double... dArr) {
        }

        public Map<Integer, Double> compute(long... jArr) {
        }

        public Map<Integer, Double> compute(int... iArr) {
        }
    }

    static /* synthetic */ void access$300(int i, int i2) {
    }

    static /* synthetic */ double[] access$400(long[] jArr) {
    }

    static /* synthetic */ double[] access$500(int[] iArr) {
    }

    static /* synthetic */ boolean access$600(double[] dArr) {
    }

    static /* synthetic */ void access$700(int i, double[] dArr, int i2, int i3) {
    }

    static /* synthetic */ double access$800(double d, double d2, double d3, double d4) {
    }

    static /* synthetic */ void access$900(int[] iArr, int i, int i2, double[] dArr, int i3, int i4) {
    }

    private static void checkIndex(int i, int i2) {
    }

    private static int chooseNextSelection(int[] iArr, int i, int i2, int i3, int i4) {
    }

    private static boolean containsNaN(double... dArr) {
    }

    private static double interpolate(double d, double d2, double d3, double d4) {
    }

    private static double[] intsToDoubles(int[] iArr) {
    }

    private static double[] longsToDoubles(long[] jArr) {
    }

    public static ScaleAndIndex median() {
    }

    private static void movePivotToStartOfSlice(double[] dArr, int i, int i2) {
    }

    private static int partition(double[] dArr, int i, int i2) {
    }

    public static Scale percentiles() {
    }

    public static Scale quartiles() {
    }

    public static Scale scale(int i) {
    }

    private static void selectAllInPlace(int[] iArr, int i, int i2, double[] dArr, int i3, int i4) {
    }

    private static void selectInPlace(int i, double[] dArr, int i2, int i3) {
    }

    private static void swap(double[] dArr, int i, int i2) {
    }
}
