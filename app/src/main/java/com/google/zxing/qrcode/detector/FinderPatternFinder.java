package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    protected static final int MAX_MODULES = 57;
    protected static final int MIN_SKIP = 3;
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List<FinderPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;

    private static final class CenterComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        /* synthetic */ CenterComparator(float f, C13971 c13971) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
        }

        private CenterComparator(float f) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(FinderPattern finderPattern, FinderPattern finderPattern2) {
        }
    }

    private static final class FurthestFromAverageComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        /* synthetic */ FurthestFromAverageComparator(float f, C13971 c13971) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
        }

        private FurthestFromAverageComparator(float f) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(FinderPattern finderPattern, FinderPattern finderPattern2) {
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
    }

    private static float centerFromEnd(int[] iArr, int i) {
    }

    private boolean crossCheckDiagonal(int i, int i2, int i3, int i4) {
    }

    private float crossCheckHorizontal(int i, int i2, int i3, int i4) {
    }

    private float crossCheckVertical(int i, int i2, int i3, int i4) {
    }

    private int findRowSkip() {
    }

    protected static boolean foundPatternCross(int[] iArr) {
    }

    private int[] getCrossCheckStateCount() {
    }

    private boolean haveMultiplyConfirmedCenters() {
    }

    private FinderPattern[] selectBestPatterns() throws NotFoundException {
    }

    final FinderPatternInfo find(Map<DecodeHintType, ?> map) throws NotFoundException {
    }

    protected final BitMatrix getImage() {
    }

    protected final List<FinderPattern> getPossibleCenters() {
    }

    protected final boolean handlePossibleCenter(int[] iArr, int i, int i2, boolean z) {
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
    }
}
