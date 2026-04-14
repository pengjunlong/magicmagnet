package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class MatrixUtil {
    private static final int[][] POSITION_ADJUSTMENT_PATTERN = null;
    private static final int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = null;
    private static final int[][] POSITION_DETECTION_PATTERN = null;
    private static final int[][] TYPE_INFO_COORDINATES = null;
    private static final int TYPE_INFO_MASK_PATTERN = 21522;
    private static final int TYPE_INFO_POLY = 1335;
    private static final int VERSION_INFO_POLY = 7973;

    private MatrixUtil() {
    }

    static void buildMatrix(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i, ByteMatrix byteMatrix) throws WriterException {
    }

    static int calculateBCHCode(int i, int i2) {
    }

    static void clearMatrix(ByteMatrix byteMatrix) {
    }

    static void embedBasicPatterns(Version version, ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedDarkDotAtLeftBottomCorner(ByteMatrix byteMatrix) throws WriterException {
    }

    static void embedDataBits(BitArray bitArray, int i, ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedHorizontalSeparationPattern(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedPositionAdjustmentPattern(int i, int i2, ByteMatrix byteMatrix) {
    }

    private static void embedPositionDetectionPattern(int i, int i2, ByteMatrix byteMatrix) {
    }

    private static void embedPositionDetectionPatternsAndSeparators(ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedTimingPatterns(ByteMatrix byteMatrix) {
    }

    static void embedTypeInfo(ErrorCorrectionLevel errorCorrectionLevel, int i, ByteMatrix byteMatrix) throws WriterException {
    }

    private static void embedVerticalSeparationPattern(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
    }

    static int findMSBSet(int i) {
    }

    private static boolean isEmpty(int i) {
    }

    static void makeTypeInfoBits(ErrorCorrectionLevel errorCorrectionLevel, int i, BitArray bitArray) throws WriterException {
    }

    static void makeVersionInfoBits(Version version, BitArray bitArray) throws WriterException {
    }

    private static void maybeEmbedPositionAdjustmentPatterns(Version version, ByteMatrix byteMatrix) {
    }

    static void maybeEmbedVersionInfo(Version version, ByteMatrix byteMatrix) throws WriterException {
    }
}
