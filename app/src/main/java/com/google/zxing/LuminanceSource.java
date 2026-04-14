package com.google.zxing;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class LuminanceSource {
    private final int height;
    private final int width;

    protected LuminanceSource(int i, int i2) {
    }

    public LuminanceSource crop(int i, int i2, int i3, int i4) {
    }

    public final int getHeight() {
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i, byte[] bArr);

    public final int getWidth() {
    }

    public LuminanceSource invert() {
    }

    public boolean isCropSupported() {
    }

    public boolean isRotateSupported() {
    }

    public LuminanceSource rotateCounterClockwise() {
    }

    public LuminanceSource rotateCounterClockwise45() {
    }

    public final String toString() {
    }
}
