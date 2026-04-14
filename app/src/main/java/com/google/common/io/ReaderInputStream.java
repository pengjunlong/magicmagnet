package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class ReaderInputStream extends InputStream {
    private ByteBuffer byteBuffer;
    private CharBuffer charBuffer;
    private boolean doneFlushing;
    private boolean draining;
    private final CharsetEncoder encoder;
    private boolean endOfInput;
    private final Reader reader;
    private final byte[] singleByte;

    ReaderInputStream(Reader reader, Charset charset, int i) {
    }

    private static int availableCapacity(Buffer buffer) {
    }

    private int drain(byte[] bArr, int i, int i2) {
    }

    private static CharBuffer grow(CharBuffer charBuffer) {
    }

    private void readMoreChars() throws IOException {
    }

    private void startDraining(boolean z) {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }

    ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i) {
    }
}
