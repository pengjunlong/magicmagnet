package com.google.zxing.oned.rss.expanded;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int[] EVEN_TOTAL_SUBSET = null;
    private static final int[][] FINDER_PATTERNS = null;
    private static final int[][] FINDER_PATTERN_SEQUENCES = null;
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int[] GSUM = null;
    private static final int MAX_PAIRS = 11;
    private static final int[] SYMBOL_WIDEST = null;
    private static final int[][] WEIGHTS = null;
    private final List<ExpandedPair> pairs;
    private final List<ExpandedRow> rows;
    private final int[] startEnd;
    private boolean startFromEven;

    private void adjustOddEvenCounts(int i) throws NotFoundException {
    }

    private boolean checkChecksum() {
    }

    private List<ExpandedPair> checkRows(boolean z) {
    }

    static Result constructResult(List<ExpandedPair> list) throws NotFoundException, FormatException {
    }

    private void findNextPair(BitArray bitArray, List<ExpandedPair> list, int i) throws NotFoundException {
    }

    private static int getNextSecondBar(BitArray bitArray, int i) {
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z, boolean z2) {
    }

    private static boolean isPartialRow(Iterable<ExpandedPair> iterable, Iterable<ExpandedRow> iterable2) {
    }

    private static boolean isValidSequence(List<ExpandedPair> list) {
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i, boolean z) {
    }

    private static void removePartialRows(List<ExpandedPair> list, List<ExpandedRow> list2) {
    }

    private static void reverseCounters(int[] iArr) {
    }

    private void storeRow(int i, boolean z) {
    }

    DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z, boolean z2) throws NotFoundException {
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
    }

    List<ExpandedPair> decodeRow2pairs(int i, BitArray bitArray) throws NotFoundException {
    }

    List<ExpandedRow> getRows() {
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
    }

    ExpandedPair retrieveNextPair(BitArray bitArray, List<ExpandedPair> list, int i) throws NotFoundException {
    }

    private List<ExpandedPair> checkRows(List<ExpandedRow> list, int i) throws NotFoundException {
    }
}
