package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NullReader extends Reader {
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullReader(long j) {
    }

    private int doEndOfFile() throws EOFException {
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public long getPosition() {
    }

    public long getSize() {
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) {
    }

    @Override // java.io.Reader
    public boolean markSupported() {
    }

    protected int processChar() {
    }

    protected void processChars(char[] cArr, int i, int i2) {
    }

    @Override // java.io.Reader
    public int read() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
    }

    public NullReader(long j, boolean z, boolean z2) {
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
    }
}
