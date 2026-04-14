package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class BitMatrixParser {
    private final BitMatrix mappingBitMatrix;
    private final BitMatrix readMappingMatrix;
    private final Version version;

    BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
    }

    private BitMatrix extractDataRegion(BitMatrix bitMatrix) {
    }

    private int readCorner1(int i, int i2) {
    }

    private int readCorner2(int i, int i2) {
    }

    private int readCorner3(int i, int i2) {
    }

    private int readCorner4(int i, int i2) {
    }

    private boolean readModule(int i, int i2, int i3, int i4) {
    }

    private int readUtah(int i, int i2, int i3, int i4) {
    }

    private static Version readVersion(BitMatrix bitMatrix) throws FormatException {
    }

    Version getVersion() {
    }

    byte[] readCodewords() throws FormatException {
    }
}
