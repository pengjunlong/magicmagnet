package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.util.ByteInput;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class EncodedValueReader {
    public static final int ENCODED_ANNOTATION = 29;
    public static final int ENCODED_ARRAY = 28;
    public static final int ENCODED_BOOLEAN = 31;
    public static final int ENCODED_BYTE = 0;
    public static final int ENCODED_CHAR = 3;
    public static final int ENCODED_DOUBLE = 17;
    public static final int ENCODED_ENUM = 27;
    public static final int ENCODED_FIELD = 25;
    public static final int ENCODED_FLOAT = 16;
    public static final int ENCODED_INT = 4;
    public static final int ENCODED_LONG = 6;
    public static final int ENCODED_METHOD = 26;
    public static final int ENCODED_NULL = 30;
    public static final int ENCODED_SHORT = 2;
    public static final int ENCODED_STRING = 23;
    public static final int ENCODED_TYPE = 24;
    private static final int MUST_READ = -1;
    private int annotationType;
    private int arg;
    protected final ByteInput in;
    private int type;

    public EncodedValueReader(ByteInput byteInput) {
    }

    private void checkType(int i) {
    }

    public int getAnnotationType() {
    }

    public int peek() {
    }

    public int readAnnotation() {
    }

    public int readAnnotationName() {
    }

    public int readArray() {
    }

    public boolean readBoolean() {
    }

    public byte readByte() {
    }

    public char readChar() {
    }

    public double readDouble() {
    }

    public int readEnum() {
    }

    public int readField() {
    }

    public float readFloat() {
    }

    public int readInt() {
    }

    public long readLong() {
    }

    public int readMethod() {
    }

    public void readNull() {
    }

    public short readShort() {
    }

    public int readString() {
    }

    public int readType() {
    }

    public void skipValue() {
    }

    public EncodedValueReader(EncodedValue encodedValue) {
    }

    public EncodedValueReader(ByteInput byteInput, int i) {
    }

    public EncodedValueReader(EncodedValue encodedValue, int i) {
    }
}
