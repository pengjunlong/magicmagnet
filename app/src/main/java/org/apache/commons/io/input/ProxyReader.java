package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ProxyReader extends FilterReader {
    public ProxyReader(Reader reader) {
    }

    protected void afterRead(int i) throws IOException {
    }

    protected void beforeRead(int i) throws IOException {
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    protected void handleIOException(IOException iOException) throws IOException {
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void mark(int i) throws IOException {
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean markSupported() {
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws IOException {
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j) throws IOException {
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
    }
}
