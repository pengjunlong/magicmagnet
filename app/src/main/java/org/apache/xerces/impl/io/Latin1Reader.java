package org.apache.xerces.impl.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Latin1Reader extends Reader {
    public static final int DEFAULT_BUFFER_SIZE = 2048;
    protected final byte[] fBuffer;
    protected final InputStream fInputStream;

    public Latin1Reader(InputStream inputStream) {
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
    }

    @Override // java.io.Reader
    public boolean markSupported() {
    }

    @Override // java.io.Reader
    public int read() throws IOException {
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
    }

    public Latin1Reader(InputStream inputStream, int i) {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
    }

    public Latin1Reader(InputStream inputStream, byte[] bArr) {
    }
}
