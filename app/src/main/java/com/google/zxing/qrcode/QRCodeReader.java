package com.google.zxing.qrcode;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.Decoder;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class QRCodeReader implements Reader {
    private static final ResultPoint[] NO_POINTS = null;
    private final Decoder decoder;

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) throws NotFoundException {
    }

    private static float moduleSize(int[] iArr, BitMatrix bitMatrix) throws NotFoundException {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
    }

    protected final Decoder getDecoder() {
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public final Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
    }
}
