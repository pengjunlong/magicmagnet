package com.google.zxing;

import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Result {
    private final BarcodeFormat format;
    private final int numBits;
    private final byte[] rawBytes;
    private Map<ResultMetadataType, Object> resultMetadata;
    private ResultPoint[] resultPoints;
    private final String text;
    private final long timestamp;

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat) {
    }

    public void addResultPoints(ResultPoint[] resultPointArr) {
    }

    public BarcodeFormat getBarcodeFormat() {
    }

    public int getNumBits() {
    }

    public byte[] getRawBytes() {
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
    }

    public ResultPoint[] getResultPoints() {
    }

    public String getText() {
    }

    public long getTimestamp() {
    }

    public void putAllMetadata(Map<ResultMetadataType, Object> map) {
    }

    public void putMetadata(ResultMetadataType resultMetadataType, Object obj) {
    }

    public String toString() {
    }

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j) {
    }

    public Result(String str, byte[] bArr, int i, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j) {
    }
}
