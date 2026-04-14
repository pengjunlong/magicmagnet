package org.apache.commons.io.output;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FileWriterWithEncoding extends Writer {
    private final Writer out;

    public FileWriterWithEncoding(String str, String str2) throws IOException {
    }

    private static Writer initWriter(File file, Object obj, boolean z) throws IOException {
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

    public FileWriterWithEncoding(String str, String str2, boolean z) throws IOException {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
    }

    public FileWriterWithEncoding(String str, Charset charset) throws IOException {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
    }

    public FileWriterWithEncoding(String str, Charset charset, boolean z) throws IOException {
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) throws IOException {
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z) throws IOException {
    }

    public FileWriterWithEncoding(File file, String str) throws IOException {
    }

    public FileWriterWithEncoding(File file, String str, boolean z) throws IOException {
    }

    public FileWriterWithEncoding(File file, Charset charset) throws IOException {
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean z) throws IOException {
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) throws IOException {
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z) throws IOException {
    }
}
