package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class BoundingBox {
    private ResultPoint bottomLeft;
    private ResultPoint bottomRight;
    private BitMatrix image;
    private int maxX;
    private int maxY;
    private int minX;
    private int minY;
    private ResultPoint topLeft;
    private ResultPoint topRight;

    BoundingBox(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
    }

    private void calculateMinMaxValues() {
    }

    private void init(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
    }

    static BoundingBox merge(BoundingBox boundingBox, BoundingBox boundingBox2) throws NotFoundException {
    }

    BoundingBox addMissingRows(int i, int i2, boolean z) throws NotFoundException {
    }

    ResultPoint getBottomLeft() {
    }

    ResultPoint getBottomRight() {
    }

    int getMaxX() {
    }

    int getMaxY() {
    }

    int getMinX() {
    }

    int getMinY() {
    }

    ResultPoint getTopLeft() {
    }

    ResultPoint getTopRight() {
    }

    BoundingBox(BoundingBox boundingBox) {
    }
}
