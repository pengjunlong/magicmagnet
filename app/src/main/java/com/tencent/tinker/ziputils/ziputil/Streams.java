package com.tencent.tinker.ziputils.ziputil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Streams {
    private static AtomicReference<byte[]> skipBuffer;

    private Streams() {
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static String readAsciiLine(InputStream inputStream) throws IOException {
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
    }

    public static byte[] readFullyNoClose(InputStream inputStream) throws IOException {
    }

    public static int readSingleByte(InputStream inputStream) throws IOException {
    }

    public static void skipAll(InputStream inputStream) throws IOException {
    }

    public static long skipByReading(InputStream inputStream, long j) throws IOException {
    }

    public static void writeSingleByte(OutputStream outputStream, int i) throws IOException {
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
    }

    public static byte[] readFully(InputStream inputStream) throws IOException {
    }

    public static String readFully(Reader reader) throws IOException {
    }
}
