package org.apache.commons.io.output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ByteArrayOutputStream extends OutputStream {
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private final List<byte[]> buffers;
    private int count;
    private byte[] currentBuffer;
    private int currentBufferIndex;
    private int filledBufferSum;

    public ByteArrayOutputStream() {
    }

    private void needNewBuffer(int i) {
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public synchronized void reset() {
    }

    public synchronized int size() {
    }

    public synchronized byte[] toByteArray() {
    }

    public String toString() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
    }

    public synchronized void writeTo(OutputStream outputStream) throws IOException {
    }

    public ByteArrayOutputStream(int i) {
    }

    public String toString(String str) throws UnsupportedEncodingException {
    }

    private InputStream toBufferedInputStream() {
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
    }

    public synchronized int write(InputStream inputStream) throws IOException {
    }
}
