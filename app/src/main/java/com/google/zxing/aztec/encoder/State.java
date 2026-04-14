package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class State {
    static final State INITIAL_STATE = null;
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int i, int i2, int i3) {
    }

    State addBinaryShiftChar(int i) {
    }

    State endBinaryShift(int i) {
    }

    int getBinaryShiftByteCount() {
    }

    int getBitCount() {
    }

    int getMode() {
    }

    Token getToken() {
    }

    boolean isBetterThanOrEqualTo(State state) {
    }

    State latchAndAppend(int i, int i2) {
    }

    State shiftAndAppend(int i, int i2) {
    }

    BitArray toBitArray(byte[] bArr) {
    }

    public String toString() {
    }
}
