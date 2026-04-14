package com.google.zxing.pdf417.decoder;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class DetectionResult {
    private static final int ADJUST_ROW_NUMBER_SKIP = 2;
    private final int barcodeColumnCount;
    private final BarcodeMetadata barcodeMetadata;
    private BoundingBox boundingBox;
    private final DetectionResultColumn[] detectionResultColumns;

    DetectionResult(BarcodeMetadata barcodeMetadata, BoundingBox boundingBox) {
    }

    private void adjustIndicatorColumnRowNumbers(DetectionResultColumn detectionResultColumn) {
    }

    private static boolean adjustRowNumber(Codeword codeword, Codeword codeword2) {
    }

    private static int adjustRowNumberIfValid(int i, int i2, Codeword codeword) {
    }

    private int adjustRowNumbers() {
    }

    private int adjustRowNumbersByRow() {
    }

    private void adjustRowNumbersFromBothRI() {
    }

    private int adjustRowNumbersFromLRI() {
    }

    private int adjustRowNumbersFromRRI() {
    }

    int getBarcodeColumnCount() {
    }

    int getBarcodeECLevel() {
    }

    int getBarcodeRowCount() {
    }

    BoundingBox getBoundingBox() {
    }

    DetectionResultColumn getDetectionResultColumn(int i) {
    }

    DetectionResultColumn[] getDetectionResultColumns() {
    }

    public void setBoundingBox(BoundingBox boundingBox) {
    }

    void setDetectionResultColumn(int i, DetectionResultColumn detectionResultColumn) {
    }

    public String toString() {
    }

    private void adjustRowNumbers(int i, int i2, Codeword[] codewordArr) {
    }
}
