package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class AlignmentPatternFinder {
    private final int[] crossCheckStateCount;
    private final int height;
    private final BitMatrix image;
    private final float moduleSize;
    private final List<AlignmentPattern> possibleCenters;
    private final ResultPointCallback resultPointCallback;
    private final int startX;
    private final int startY;
    private final int width;

    AlignmentPatternFinder(BitMatrix bitMatrix, int i, int i2, int i3, int i4, float f, ResultPointCallback resultPointCallback) {
    }

    private static float centerFromEnd(int[] iArr, int i) {
    }

    private float crossCheckVertical(int i, int i2, int i3, int i4) {
    }

    private boolean foundPatternCross(int[] iArr) {
    }

    private AlignmentPattern handlePossibleCenter(int[] iArr, int i, int i2) {
    }

    AlignmentPattern find() throws NotFoundException {
    }
}
