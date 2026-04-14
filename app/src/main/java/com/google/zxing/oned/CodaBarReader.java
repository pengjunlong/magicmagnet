package com.google.zxing.oned;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CodaBarReader extends OneDReader {
    static final char[] ALPHABET = null;
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCD";
    static final int[] CHARACTER_ENCODINGS = null;
    private static final float MAX_ACCEPTABLE = 2.0f;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final float PADDING = 1.5f;
    private static final char[] STARTEND_ENCODING = null;
    private int counterLength;
    private int[] counters;
    private final StringBuilder decodeRowResult;

    static boolean arrayContains(char[] cArr, char c) {
    }

    private void counterAppend(int i) {
    }

    private int findStartPattern() throws NotFoundException {
    }

    private void setCounters(BitArray bitArray) throws NotFoundException {
    }

    private int toNarrowWidePattern(int i) {
    }

    private void validatePattern(int i) throws NotFoundException {
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
    }
}
