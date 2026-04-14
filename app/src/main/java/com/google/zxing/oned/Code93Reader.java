package com.google.zxing.oned;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Code93Reader extends OneDReader {
    private static final char[] ALPHABET = null;
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final int ASTERISK_ENCODING = 0;
    static final int[] CHARACTER_ENCODINGS = null;
    private final int[] counters;
    private final StringBuilder decodeRowResult;

    private static void checkChecksums(CharSequence charSequence) throws ChecksumException {
    }

    private static void checkOneChecksum(CharSequence charSequence, int i, int i2) throws ChecksumException {
    }

    private static String decodeExtended(CharSequence charSequence) throws FormatException {
    }

    private int[] findAsteriskPattern(BitArray bitArray) throws NotFoundException {
    }

    private static char patternToChar(int i) throws NotFoundException {
    }

    private static int toPattern(int[] iArr) {
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
    }
}
