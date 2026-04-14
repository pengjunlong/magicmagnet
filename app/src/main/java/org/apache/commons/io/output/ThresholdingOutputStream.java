package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ThresholdingOutputStream extends OutputStream {
    private final int threshold;
    private boolean thresholdExceeded;
    private long written;

    public ThresholdingOutputStream(int i) {
    }

    protected void checkThreshold(int i) throws IOException {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    public long getByteCount() {
    }

    protected abstract OutputStream getStream() throws IOException;

    public int getThreshold() {
    }

    public boolean isThresholdExceeded() {
    }

    protected void resetByteCount() {
    }

    protected abstract void thresholdReached() throws IOException;

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
