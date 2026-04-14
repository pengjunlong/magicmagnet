package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = null;

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int i, int i2) {
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i, int i2) {
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z, int i, BitArray bitArray) {
    }

    public static AztecCode encode(byte[] bArr) {
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i, int i2) {
    }

    static BitArray generateModeMessage(boolean z, int i, int i2) {
    }

    private static GenericGF getGF(int i) {
    }

    static BitArray stuffBits(BitArray bitArray, int i) {
    }

    private static int totalBitsInLayer(int i, boolean z) {
    }

    public static AztecCode encode(byte[] bArr, int i, int i2) {
    }
}
