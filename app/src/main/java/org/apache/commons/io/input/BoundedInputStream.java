package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BoundedInputStream extends InputStream {
    private final InputStream in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream, long j) {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public boolean isPropagateClose() {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
    }

    public void setPropagateClose(boolean z) {
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
    }

    public String toString() {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }

    public BoundedInputStream(InputStream inputStream) {
    }
}
