package org.apache.commons.io.input;

import java.io.Reader;
import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CharSequenceReader extends Reader implements Serializable {
    private final CharSequence charSequence;
    private int idx;
    private int mark;

    public CharSequenceReader(CharSequence charSequence) {
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Reader
    public void mark(int i) {
    }

    @Override // java.io.Reader
    public boolean markSupported() {
    }

    @Override // java.io.Reader
    public int read() {
    }

    @Override // java.io.Reader
    public void reset() {
    }

    @Override // java.io.Reader
    public long skip(long j) {
    }

    public String toString() {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
    }
}
