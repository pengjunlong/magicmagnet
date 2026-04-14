package com.google.android.exoplayer2.util;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] bArr, int i, int i2) {
    }

    private void assertValidOffset() {
    }

    private int readExpGolombCodeNum() {
    }

    private boolean shouldSkipByte(int i) {
    }

    public boolean canReadBits(int i) {
    }

    public boolean canReadExpGolombCodedNum() {
    }

    public boolean readBit() {
    }

    public int readBits(int i) {
    }

    public int readSignedExpGolombCodedInt() {
    }

    public int readUnsignedExpGolombCodedInt() {
    }

    public void reset(byte[] bArr, int i, int i2) {
    }

    public void skipBit() {
    }

    public void skipBits(int i) {
    }
}
