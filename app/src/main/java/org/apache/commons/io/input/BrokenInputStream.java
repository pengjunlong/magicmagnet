package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BrokenInputStream extends InputStream {
    private final IOException exception;

    public BrokenInputStream(IOException iOException) {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
    }

    public BrokenInputStream() {
    }
}
