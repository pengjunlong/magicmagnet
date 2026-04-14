package com.google.zxing;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class InvertedLuminanceSource extends LuminanceSource {
    private final LuminanceSource delegate;

    public InvertedLuminanceSource(LuminanceSource luminanceSource) {
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i, int i2, int i3, int i4) {
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i, byte[] bArr) {
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource invert() {
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isRotateSupported() {
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise() {
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise45() {
    }
}
