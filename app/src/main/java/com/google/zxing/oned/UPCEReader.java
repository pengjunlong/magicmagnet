package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class UPCEReader extends UPCEANReader {
    static final int[] CHECK_DIGIT_ENCODINGS = null;
    private static final int[] MIDDLE_END_PATTERN = null;
    private static final int[][] NUMSYS_AND_CHECK_DIGIT_PATTERNS = null;
    private final int[] decodeMiddleCounters;

    public static String convertUPCEtoUPCA(String str) {
    }

    private static void determineNumSysAndCheckDigit(StringBuilder sb, int i) throws NotFoundException {
    }

    @Override // com.google.zxing.oned.UPCEANReader
    protected boolean checkChecksum(String str) throws FormatException {
    }

    @Override // com.google.zxing.oned.UPCEANReader
    protected int[] decodeEnd(BitArray bitArray, int i) throws NotFoundException {
    }

    @Override // com.google.zxing.oned.UPCEANReader
    protected int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
    }

    @Override // com.google.zxing.oned.UPCEANReader
    BarcodeFormat getBarcodeFormat() {
    }
}
