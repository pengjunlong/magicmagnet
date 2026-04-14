package org.conscrypt.ct;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Serialization {
    private static final int DER_LENGTH_LONG_FORM_FLAG = 128;
    private static final int DER_TAG_MASK = 63;
    private static final int DER_TAG_OCTET_STRING = 4;

    private Serialization() {
    }

    public static byte readByte(InputStream inputStream) throws SerializationException {
    }

    public static byte[] readDEROctetString(byte[] bArr) throws SerializationException {
    }

    public static byte[] readFixedBytes(InputStream inputStream, int i) throws SerializationException {
    }

    public static byte[][] readList(byte[] bArr, int i, int i2) throws SerializationException {
    }

    public static long readLong(InputStream inputStream, int i) throws SerializationException {
    }

    public static int readNumber(InputStream inputStream, int i) throws SerializationException {
    }

    public static byte[] readVariableBytes(InputStream inputStream, int i) throws SerializationException {
    }

    public static void writeFixedBytes(OutputStream outputStream, byte[] bArr) throws SerializationException {
    }

    public static void writeNumber(OutputStream outputStream, long j, int i) throws SerializationException {
    }

    public static void writeVariableBytes(OutputStream outputStream, byte[] bArr, int i) throws SerializationException {
    }

    public static byte[] readDEROctetString(InputStream inputStream) throws SerializationException {
    }

    public static byte[][] readList(InputStream inputStream, int i, int i2) throws SerializationException {
    }
}
