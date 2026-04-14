package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Decoder {
    private static final int ALL = 0;
    private static final int EVEN = 1;
    private static final int ODD = 2;
    private final ReedSolomonDecoder rsDecoder;

    private void correctErrors(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
    }
}
