package org.apache.commons.io.output;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class LockableFileWriter extends Writer {
    private static final String LCK = ".lck";
    private final File lockFile;
    private final Writer out;

    public LockableFileWriter(String str) throws IOException {
    }

    private void createLock() throws IOException {
    }

    private Writer initWriter(File file, Charset charset, boolean z) throws IOException {
    }

    private void testLockDir(File file) throws IOException {
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
    }

    public LockableFileWriter(String str, boolean z) throws IOException {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
    }

    public LockableFileWriter(String str, boolean z, String str2) throws IOException {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
    }

    public LockableFileWriter(File file) throws IOException {
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
    }

    public LockableFileWriter(File file, boolean z) throws IOException {
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
    }

    public LockableFileWriter(File file, boolean z, String str) throws IOException {
    }

    public LockableFileWriter(File file, Charset charset) throws IOException {
    }

    public LockableFileWriter(File file, String str) throws IOException {
    }

    public LockableFileWriter(File file, Charset charset, boolean z, String str) throws IOException {
    }

    public LockableFileWriter(File file, String str, boolean z, String str2) throws IOException {
    }
}
