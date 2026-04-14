package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class CharSequenceReader extends Reader {
    private int mark;
    private int pos;
    private CharSequence seq;

    public CharSequenceReader(CharSequence charSequence) {
    }

    private void checkOpen() throws IOException {
    }

    private boolean hasRemaining() {
    }

    private int remaining() {
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) throws IOException {
    }

    @Override // java.io.Reader
    public boolean markSupported() {
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized long skip(long j) throws IOException {
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i, int i2) throws IOException {
    }
}
