package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.oned.OneDReader;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AbstractRSSReader extends OneDReader {
    private static final float MAX_AVG_VARIANCE = 0.2f;
    private static final float MAX_FINDER_PATTERN_RATIO = 0.89285713f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.45f;
    private static final float MIN_FINDER_PATTERN_RATIO = 0.7916667f;
    private final int[] dataCharacterCounters;
    private final int[] decodeFinderCounters;
    private final int[] evenCounts;
    private final float[] evenRoundingErrors;
    private final int[] oddCounts;
    private final float[] oddRoundingErrors;

    protected AbstractRSSReader() {
    }

    @Deprecated
    protected static int count(int[] iArr) {
    }

    protected static void decrement(int[] iArr, float[] fArr) {
    }

    protected static void increment(int[] iArr, float[] fArr) {
    }

    protected static boolean isFinderPattern(int[] iArr) {
    }

    protected static int parseFinderValue(int[] iArr, int[][] iArr2) throws NotFoundException {
    }

    protected final int[] getDataCharacterCounters() {
    }

    protected final int[] getDecodeFinderCounters() {
    }

    protected final int[] getEvenCounts() {
    }

    protected final float[] getEvenRoundingErrors() {
    }

    protected final int[] getOddCounts() {
    }

    protected final float[] getOddRoundingErrors() {
    }
}
