package org.adblockplus.libadblockplus.android;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ConnectionInputStream extends InputStream {
    private static final int CACHE_SIZE = 4096;
    private final BufferedInputStream bufferedInputStream;
    private boolean closed;
    private final HttpURLConnection httpURLConnection;

    public ConnectionInputStream(InputStream inputStream, HttpURLConnection httpURLConnection) {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    protected void finalize() throws Throwable {
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

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }
}
