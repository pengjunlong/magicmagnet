package com.tencent.tinker.android.dx.instruction;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class InstructionCodec {
    public static final int INDEX_TYPE_FIELD_REF = 5;
    public static final int INDEX_TYPE_METHOD_REF = 4;
    public static final int INDEX_TYPE_NONE = 1;
    public static final int INDEX_TYPE_STRING_REF = 3;
    public static final int INDEX_TYPE_TYPE_REF = 2;
    public static final int INDEX_TYPE_UNKNOWN = 0;
    public static final int INSN_FORMAT_00X = 1;
    public static final int INSN_FORMAT_10T = 2;
    public static final int INSN_FORMAT_10X = 3;
    public static final int INSN_FORMAT_11N = 4;
    public static final int INSN_FORMAT_11X = 5;
    public static final int INSN_FORMAT_12X = 6;
    public static final int INSN_FORMAT_20T = 7;
    public static final int INSN_FORMAT_21C = 8;
    public static final int INSN_FORMAT_21H = 9;
    public static final int INSN_FORMAT_21S = 10;
    public static final int INSN_FORMAT_21T = 11;
    public static final int INSN_FORMAT_22B = 12;
    public static final int INSN_FORMAT_22C = 13;
    public static final int INSN_FORMAT_22S = 14;
    public static final int INSN_FORMAT_22T = 15;
    public static final int INSN_FORMAT_22X = 16;
    public static final int INSN_FORMAT_23X = 17;
    public static final int INSN_FORMAT_30T = 18;
    public static final int INSN_FORMAT_31C = 19;
    public static final int INSN_FORMAT_31I = 20;
    public static final int INSN_FORMAT_31T = 21;
    public static final int INSN_FORMAT_32X = 22;
    public static final int INSN_FORMAT_35C = 23;
    public static final int INSN_FORMAT_3RC = 24;
    public static final int INSN_FORMAT_51L = 25;
    public static final int INSN_FORMAT_FILL_ARRAY_DATA_PAYLOAD = 26;
    public static final int INSN_FORMAT_PACKED_SWITCH_PAYLOAD = 27;
    public static final int INSN_FORMAT_SPARSE_SWITCH_PAYLOAD = 28;
    public static final int INSN_FORMAT_UNKNOWN = 0;

    private InstructionCodec() {
    }

    public static short asUnsignedUnit(int i) {
    }

    public static int byte0(int i) {
    }

    public static int byte1(int i) {
    }

    public static short codeUnit(int i, int i2) {
    }

    public static short getAUnit(int i) {
    }

    public static short getBUnit(int i) {
    }

    public static int getInstructionFormat(int i) {
    }

    public static int getInstructionIndexType(int i) {
    }

    public static int getLiteralByte(long j) {
    }

    public static int getLiteralInt(long j) {
    }

    public static int getLiteralNibble(long j) {
    }

    public static short getLiteralUnit(long j) {
    }

    public static int getTarget(int i, int i2) {
    }

    public static int getTargetByte(int i, int i2) {
    }

    public static short getTargetUnit(int i, int i2) {
    }

    public static int makeByte(int i, int i2) {
    }

    public static int nibble0(int i) {
    }

    public static int nibble1(int i) {
    }

    public static int nibble2(int i) {
    }

    public static int nibble3(int i) {
    }

    public static short unit0(int i) {
    }

    public static short unit0(long j) {
    }

    public static short unit1(int i) {
    }

    public static short unit1(long j) {
    }

    public static short unit2(long j) {
    }

    public static short unit3(long j) {
    }

    public static short codeUnit(int i, int i2, int i3, int i4) {
    }
}
