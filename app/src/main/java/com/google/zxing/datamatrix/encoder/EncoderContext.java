package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class EncoderContext {
    private final StringBuilder codewords;
    private Dimension maxSize;
    private Dimension minSize;
    private final String msg;
    private int newEncoding;
    int pos;
    private SymbolShapeHint shape;
    private int skipAtEnd;
    private SymbolInfo symbolInfo;

    EncoderContext(String str) {
    }

    private int getTotalMessageCharCount() {
    }

    public int getCodewordCount() {
    }

    public StringBuilder getCodewords() {
    }

    public char getCurrent() {
    }

    public char getCurrentChar() {
    }

    public String getMessage() {
    }

    public int getNewEncoding() {
    }

    public int getRemainingCharacters() {
    }

    public SymbolInfo getSymbolInfo() {
    }

    public boolean hasMoreCharacters() {
    }

    public void resetEncoderSignal() {
    }

    public void resetSymbolInfo() {
    }

    public void setSizeConstraints(Dimension dimension, Dimension dimension2) {
    }

    public void setSkipAtEnd(int i) {
    }

    public void setSymbolShape(SymbolShapeHint symbolShapeHint) {
    }

    public void signalEncoderChange(int i) {
    }

    public void updateSymbolInfo() {
    }

    public void writeCodeword(char c) {
    }

    public void writeCodewords(String str) {
    }

    public void updateSymbolInfo(int i) {
    }
}
