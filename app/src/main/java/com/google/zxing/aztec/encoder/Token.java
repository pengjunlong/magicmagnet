package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class Token {
    static final Token EMPTY = null;
    private final Token previous;

    Token(Token token) {
    }

    final Token add(int i, int i2) {
    }

    final Token addBinaryShift(int i, int i2) {
    }

    abstract void appendTo(BitArray bitArray, byte[] bArr);

    final Token getPrevious() {
    }
}
