package org.apache.commons.io.output;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DeferredFileOutputStream extends ThresholdingOutputStream {
    private boolean closed;
    private OutputStream currentOutputStream;
    private final File directory;
    private ByteArrayOutputStream memoryOutputStream;
    private File outputFile;
    private final String prefix;
    private final String suffix;

    public DeferredFileOutputStream(int i, File file) {
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public byte[] getData() {
    }

    public File getFile() {
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    protected OutputStream getStream() throws IOException {
    }

    public boolean isInMemory() {
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    protected void thresholdReached() throws IOException {
    }

    public void writeTo(OutputStream outputStream) throws IOException {
    }

    public DeferredFileOutputStream(int i, String str, String str2, File file) {
    }

    private DeferredFileOutputStream(int i, File file, String str, String str2, File file2) {
    }
}
