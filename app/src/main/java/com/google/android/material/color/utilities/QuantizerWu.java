package com.google.android.material.color.utilities;

import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1 */
    static /* synthetic */ class C03171 {

        /* renamed from: $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction */
        static final /* synthetic */ int[] f36x8739cebf = null;
    }

    private static final class CreateBoxesResult {
        int resultCount;

        CreateBoxesResult(int i, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class Direction {
        private static final /* synthetic */ Direction[] $VALUES = null;
        public static final Direction BLUE = null;
        public static final Direction GREEN = null;
        public static final Direction RED = null;

        private Direction(String str, int i) {
        }

        public static Direction valueOf(String str) {
        }

        public static Direction[] values() {
        }
    }

    private static final class MaximizeResult {
        int cutLocation;
        double maximum;

        MaximizeResult(int i, double d) {
        }
    }

    static int bottom(Box box, Direction direction, int[] iArr) {
    }

    static int getIndex(int i, int i2, int i3) {
    }

    static int top(Box box, Direction direction, int i, int[] iArr) {
    }

    static int volume(Box box, int[] iArr) {
    }

    void constructHistogram(Map<Integer, Integer> map) {
    }

    CreateBoxesResult createBoxes(int i) {
    }

    void createMoments() {
    }

    List<Integer> createResult(int i) {
    }

    Boolean cut(Box box, Box box2) {
    }

    MaximizeResult maximize(Box box, Direction direction, int i, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i) {
    }

    double variance(Box box) {
    }

    private static final class Box {
        int b0;
        int b1;
        int g0;
        int g1;
        int r0;
        int r1;
        int vol;

        private Box() {
        }

        /* synthetic */ Box(C03171 c03171) {
        }
    }
}
