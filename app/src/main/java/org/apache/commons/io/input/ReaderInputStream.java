package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ReaderInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private final CharsetEncoder encoder;
    private final CharBuffer encoderIn;
    private final ByteBuffer encoderOut;
    private boolean endOfInput;
    private CoderResult lastCoderResult;
    private final Reader reader;

    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder) {
    }

    private void fillBuffer() throws IOException {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }

    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i) {
    }

    public ReaderInputStream(Reader reader, Charset charset, int i) {
    }

    public ReaderInputStream(Reader reader, Charset charset) {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }

    public ReaderInputStream(Reader reader, String str, int i) {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    public ReaderInputStream(Reader reader, String str) {
    }

    public ReaderInputStream(Reader reader) {
    }
}
