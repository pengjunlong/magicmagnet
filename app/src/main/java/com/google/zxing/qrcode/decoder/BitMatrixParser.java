package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class BitMatrixParser {
    private final BitMatrix bitMatrix;
    private boolean mirror;
    private FormatInformation parsedFormatInfo;
    private Version parsedVersion;

    BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
    }

    private int copyBit(int i, int i2, int i3) {
    }

    void mirror() {
    }

    byte[] readCodewords() throws FormatException {
    }

    FormatInformation readFormatInformation() throws FormatException {
    }

    Version readVersion() throws FormatException {
    }

    void remask() {
    }

    void setMirror(boolean z) {
    }
}
