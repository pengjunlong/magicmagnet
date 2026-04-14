package com.google.zxing.maxicode.decoder;

import com.google.zxing.common.DecoderResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class DecodedBitStreamParser {
    private static final char ECI = 65530;
    private static final char FS = 28;
    private static final char GS = 29;
    private static final char LATCHA = 65527;
    private static final char LATCHB = 65528;
    private static final char LOCK = 65529;
    private static final char NS = 65531;
    private static final char PAD = 65532;
    private static final char RS = 30;
    private static final String[] SETS = null;
    private static final char SHIFTA = 65520;
    private static final char SHIFTB = 65521;
    private static final char SHIFTC = 65522;
    private static final char SHIFTD = 65523;
    private static final char SHIFTE = 65524;
    private static final char THREESHIFTA = 65526;
    private static final char TWOSHIFTA = 65525;

    private DecodedBitStreamParser() {
    }

    static DecoderResult decode(byte[] bArr, int i) {
    }

    private static int getBit(int i, byte[] bArr) {
    }

    private static int getCountry(byte[] bArr) {
    }

    private static int getInt(byte[] bArr, byte[] bArr2) {
    }

    private static String getMessage(byte[] bArr, int i, int i2) {
    }

    private static int getPostCode2(byte[] bArr) {
    }

    private static int getPostCode2Length(byte[] bArr) {
    }

    private static String getPostCode3(byte[] bArr) {
    }

    private static int getServiceClass(byte[] bArr) {
    }
}
