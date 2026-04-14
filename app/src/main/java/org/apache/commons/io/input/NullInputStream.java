package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NullInputStream extends InputStream {
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullInputStream(long j) {
    }

    private int doEndOfFile() throws EOFException {
    }

    @Override // java.io.InputStream
    public int available() {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public long getPosition() {
    }

    public long getSize() {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
    }

    protected int processByte() {
    }

    protected void processBytes(byte[] bArr, int i, int i2) {
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

    public NullInputStream(long j, boolean z, boolean z2) {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }
}
