package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class HighLevelEncoder {
    static final int ASCII_ENCODATION = 0;
    static final int BASE256_ENCODATION = 5;
    static final int C40_ENCODATION = 1;
    static final char C40_UNLATCH = 254;
    static final int EDIFACT_ENCODATION = 4;
    static final char LATCH_TO_ANSIX12 = 238;
    static final char LATCH_TO_BASE256 = 231;
    static final char LATCH_TO_C40 = 230;
    static final char LATCH_TO_EDIFACT = 240;
    static final char LATCH_TO_TEXT = 239;
    private static final char MACRO_05 = 236;
    private static final String MACRO_05_HEADER = "[)>\u001e05\u001d";
    private static final char MACRO_06 = 237;
    private static final String MACRO_06_HEADER = "[)>\u001e06\u001d";
    private static final String MACRO_TRAILER = "\u001e\u0004";
    private static final char PAD = 129;
    static final int TEXT_ENCODATION = 2;
    static final char UPPER_SHIFT = 235;
    static final int X12_ENCODATION = 3;
    static final char X12_UNLATCH = 254;

    private HighLevelEncoder() {
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i) {
    }

    public static String encodeHighLevel(String str) {
    }

    private static int findMinimums(float[] fArr, int[] iArr, int i, byte[] bArr) {
    }

    private static int getMinimumCount(byte[] bArr) {
    }

    static void illegalCharacter(char c) {
    }

    static boolean isDigit(char c) {
    }

    static boolean isExtendedASCII(char c) {
    }

    private static boolean isNativeC40(char c) {
    }

    private static boolean isNativeEDIFACT(char c) {
    }

    private static boolean isNativeText(char c) {
    }

    private static boolean isNativeX12(char c) {
    }

    private static boolean isSpecialB256(char c) {
    }

    private static boolean isX12TermSep(char c) {
    }

    static int lookAheadTest(CharSequence charSequence, int i, int i2) {
    }

    private static char randomize253State(char c, int i) {
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
    }
}
