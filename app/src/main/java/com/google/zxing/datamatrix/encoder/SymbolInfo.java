package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class SymbolInfo {
    static final SymbolInfo[] PROD_SYMBOLS = null;
    private static SymbolInfo[] symbols;
    private final int dataCapacity;
    private final int dataRegions;
    private final int errorCodewords;
    public final int matrixHeight;
    public final int matrixWidth;
    private final boolean rectangular;
    private final int rsBlockData;
    private final int rsBlockError;

    public SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5) {
    }

    private int getHorizontalDataRegions() {
    }

    private int getVerticalDataRegions() {
    }

    public static SymbolInfo lookup(int i) {
    }

    public static void overrideSymbolSet(SymbolInfo[] symbolInfoArr) {
    }

    public int getCodewordCount() {
    }

    public final int getDataCapacity() {
    }

    public int getDataLengthForInterleavedBlock(int i) {
    }

    public final int getErrorCodewords() {
    }

    public final int getErrorLengthForInterleavedBlock(int i) {
    }

    public int getInterleavedBlockCount() {
    }

    public final int getSymbolDataHeight() {
    }

    public final int getSymbolDataWidth() {
    }

    public final int getSymbolHeight() {
    }

    public final int getSymbolWidth() {
    }

    public final String toString() {
    }

    SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolShapeHint) {
    }

    public static SymbolInfo lookup(int i, boolean z, boolean z2) {
    }

    private static SymbolInfo lookup(int i, SymbolShapeHint symbolShapeHint, boolean z) {
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z) {
    }
}
