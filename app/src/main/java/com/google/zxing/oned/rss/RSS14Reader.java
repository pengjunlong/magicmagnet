package com.google.zxing.oned.rss;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class RSS14Reader extends AbstractRSSReader {
    private static final int[][] FINDER_PATTERNS = null;
    private static final int[] INSIDE_GSUM = null;
    private static final int[] INSIDE_ODD_TOTAL_SUBSET = null;
    private static final int[] INSIDE_ODD_WIDEST = null;
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET = null;
    private static final int[] OUTSIDE_GSUM = null;
    private static final int[] OUTSIDE_ODD_WIDEST = null;
    private final List<Pair> possibleLeftPairs;
    private final List<Pair> possibleRightPairs;

    private static void addOrTally(Collection<Pair> collection, Pair pair) {
    }

    private void adjustOddEvenCounts(boolean z, int i) throws NotFoundException {
    }

    private static boolean checkChecksum(Pair pair, Pair pair2) {
    }

    private static Result constructResult(Pair pair, Pair pair2) {
    }

    private DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z) throws NotFoundException {
    }

    private Pair decodePair(BitArray bitArray, boolean z, int i, Map<DecodeHintType, ?> map) {
    }

    private int[] findFinderPattern(BitArray bitArray, int i, boolean z) throws NotFoundException {
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i, boolean z, int[] iArr) throws NotFoundException {
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
    }
}
