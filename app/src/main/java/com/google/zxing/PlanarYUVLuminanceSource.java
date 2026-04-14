package com.google.zxing;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {
    private static final int THUMBNAIL_SCALE_FACTOR = 2;
    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final int top;
    private final byte[] yuvData;

    public PlanarYUVLuminanceSource(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
    }

    private void reverseHorizontal(int i, int i2) {
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

    public int getThumbnailHeight() {
    }

    public int getThumbnailWidth() {
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
    }

    public int[] renderThumbnail() {
    }
}
