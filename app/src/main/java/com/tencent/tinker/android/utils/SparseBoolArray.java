package com.tencent.tinker.android.utils;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SparseBoolArray implements Cloneable {
    private static final boolean[] EMPTY_BOOL_ARRAY = null;
    private static final int[] EMPTY_INT_ARRAY = null;
    private int[] mKeys;
    private int mSize;
    private boolean[] mValues;

    public static class KeyNotFoundException extends Exception {
        public KeyNotFoundException() {
        }

        public KeyNotFoundException(String str) {
        }
    }

    public SparseBoolArray() {
    }

    private boolean[] appendElementIntoBoolArray(boolean[] zArr, int i, boolean z) {
    }

    private int[] appendElementIntoIntArray(int[] iArr, int i, int i2) {
    }

    private int binarySearch(int[] iArr, int i, int i2) {
    }

    private static int growSize(int i) {
    }

    private boolean[] insertElementIntoBoolArray(boolean[] zArr, int i, int i2, boolean z) {
    }

    private int[] insertElementIntoIntArray(int[] iArr, int i, int i2, int i3) {
    }

    public void append(int i, boolean z) {
    }

    public void clear() {
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m882clone() throws CloneNotSupportedException {
    }

    public boolean containsKey(int i) {
    }

    public void delete(int i) {
    }

    public boolean get(int i) throws KeyNotFoundException {
    }

    public int indexOfKey(int i) {
    }

    public int indexOfValue(boolean z) {
    }

    public int keyAt(int i) {
    }

    public void put(int i, boolean z) {
    }

    public void removeAt(int i) {
    }

    public int size() {
    }

    public String toString() {
    }

    public boolean valueAt(int i) {
    }

    public SparseBoolArray(int i) {
    }

    public SparseBoolArray clone() {
    }
}
