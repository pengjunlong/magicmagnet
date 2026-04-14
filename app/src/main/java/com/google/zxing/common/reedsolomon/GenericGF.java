package com.google.zxing.common.reedsolomon;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class GenericGF {
    public static final GenericGF AZTEC_DATA_10 = null;
    public static final GenericGF AZTEC_DATA_12 = null;
    public static final GenericGF AZTEC_DATA_6 = null;
    public static final GenericGF AZTEC_DATA_8 = null;
    public static final GenericGF AZTEC_PARAM = null;
    public static final GenericGF DATA_MATRIX_FIELD_256 = null;
    public static final GenericGF MAXICODE_FIELD_64 = null;
    public static final GenericGF QR_CODE_FIELD_256 = null;
    private final int[] expTable;
    private final int generatorBase;
    private final int[] logTable;
    private final GenericGFPoly one;
    private final int primitive;
    private final int size;
    private final GenericGFPoly zero;

    public GenericGF(int i, int i2, int i3) {
    }

    static int addOrSubtract(int i, int i2) {
    }

    GenericGFPoly buildMonomial(int i, int i2) {
    }

    int exp(int i) {
    }

    public int getGeneratorBase() {
    }

    GenericGFPoly getOne() {
    }

    public int getSize() {
    }

    GenericGFPoly getZero() {
    }

    int inverse(int i) {
    }

    int log(int i) {
    }

    int multiply(int i, int i2) {
    }

    public String toString() {
    }
}
