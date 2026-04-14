package com.google.zxing.common;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BitMatrix implements Cloneable {
    private final int[] bits;
    private final int height;
    private final int rowSize;
    private final int width;

    public BitMatrix(int i) {
    }

    private String buildToString(String str, String str2, String str3) {
    }

    public static BitMatrix parse(String str, String str2, String str3) {
    }

    public void clear() {
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m877clone() throws CloneNotSupportedException {
    }

    public boolean equals(Object obj) {
    }

    public void flip(int i, int i2) {
    }

    public boolean get(int i, int i2) {
    }

    public int[] getBottomRightOnBit() {
    }

    public int[] getEnclosingRectangle() {
    }

    public int getHeight() {
    }

    public BitArray getRow(int i, BitArray bitArray) {
    }

    public int getRowSize() {
    }

    public int[] getTopLeftOnBit() {
    }

    public int getWidth() {
    }

    public int hashCode() {
    }

    public void rotate180() {
    }

    public void set(int i, int i2) {
    }

    public void setRegion(int i, int i2, int i3, int i4) {
    }

    public void setRow(int i, BitArray bitArray) {
    }

    public String toString() {
    }

    public void unset(int i, int i2) {
    }

    public void xor(BitMatrix bitMatrix) {
    }

    public BitMatrix(int i, int i2) {
    }

    public BitMatrix clone() {
    }

    public String toString(String str, String str2) {
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
    }

    private BitMatrix(int i, int i2, int i3, int[] iArr) {
    }
}
