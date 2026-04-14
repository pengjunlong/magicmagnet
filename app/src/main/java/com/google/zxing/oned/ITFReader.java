package com.google.zxing.oned;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ITFReader extends OneDReader {
    private static final int[] DEFAULT_ALLOWED_LENGTHS = null;
    private static final int[] END_PATTERN_REVERSED = null;
    private static final float MAX_AVG_VARIANCE = 0.38f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.78f;

    /* renamed from: N */
    private static final int f193N = 1;
    static final int[][] PATTERNS = null;
    private static final int[] START_PATTERN = null;

    /* renamed from: W */
    private static final int f194W = 3;
    private int narrowLineWidth;

    private static int decodeDigit(int[] iArr) throws NotFoundException {
    }

    private int[] decodeEnd(BitArray bitArray) throws NotFoundException {
    }

    private static void decodeMiddle(BitArray bitArray, int i, int i2, StringBuilder sb) throws NotFoundException {
    }

    private int[] decodeStart(BitArray bitArray) throws NotFoundException {
    }

    private static int[] findGuardPattern(BitArray bitArray, int i, int[] iArr) throws NotFoundException {
    }

    private static int skipWhiteSpace(BitArray bitArray) throws NotFoundException {
    }

    private void validateQuietZone(BitArray bitArray, int i) throws NotFoundException {
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws FormatException, NotFoundException {
    }
}
