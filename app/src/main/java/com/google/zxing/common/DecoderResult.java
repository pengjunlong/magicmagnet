package com.google.zxing.common;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DecoderResult {
    private final List<byte[]> byteSegments;
    private final String ecLevel;
    private Integer erasures;
    private Integer errorsCorrected;
    private int numBits;
    private Object other;
    private final byte[] rawBytes;
    private final int structuredAppendParity;
    private final int structuredAppendSequenceNumber;
    private final String text;

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2) {
    }

    public List<byte[]> getByteSegments() {
    }

    public String getECLevel() {
    }

    public Integer getErasures() {
    }

    public Integer getErrorsCorrected() {
    }

    public int getNumBits() {
    }

    public Object getOther() {
    }

    public byte[] getRawBytes() {
    }

    public int getStructuredAppendParity() {
    }

    public int getStructuredAppendSequenceNumber() {
    }

    public String getText() {
    }

    public boolean hasStructuredAppend() {
    }

    public void setErasures(Integer num) {
    }

    public void setErrorsCorrected(Integer num) {
    }

    public void setNumBits(int i) {
    }

    public void setOther(Object obj) {
    }

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
    }
}
