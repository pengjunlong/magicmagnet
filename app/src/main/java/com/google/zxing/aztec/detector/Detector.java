package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Detector {
    private static final int[] EXPECTED_CORNER_BITS = null;
    private boolean compact;
    private final BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    static final class Point {

        /* renamed from: x */
        private final int f190x;

        /* renamed from: y */
        private final int f191y;

        Point(int i, int i2) {
        }

        int getX() {
        }

        int getY() {
        }

        ResultPoint toResultPoint() {
        }

        public String toString() {
        }
    }

    public Detector(BitMatrix bitMatrix) {
    }

    private static float distance(Point point, Point point2) {
    }

    private static ResultPoint[] expandSquare(ResultPoint[] resultPointArr, float f, float f2) {
    }

    private void extractParameters(ResultPoint[] resultPointArr) throws NotFoundException {
    }

    private ResultPoint[] getBullsEyeCorners(Point point) throws NotFoundException {
    }

    private int getColor(Point point, Point point2) {
    }

    private static int getCorrectedParameterData(long j, boolean z) throws NotFoundException {
    }

    private int getDimension() {
    }

    private Point getFirstDifferent(Point point, boolean z, int i, int i2) {
    }

    private Point getMatrixCenter() {
    }

    private ResultPoint[] getMatrixCornerPoints(ResultPoint[] resultPointArr) {
    }

    private static int getRotation(int[] iArr, int i) throws NotFoundException {
    }

    private boolean isValid(int i, int i2) {
    }

    private boolean isWhiteOrBlackRectangle(Point point, Point point2, Point point3, Point point4) {
    }

    private BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
    }

    private int sampleLine(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
    }

    public AztecDetectorResult detect() throws NotFoundException {
    }

    private static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
    }

    private boolean isValid(ResultPoint resultPoint) {
    }

    public AztecDetectorResult detect(boolean z) throws NotFoundException {
    }
}
