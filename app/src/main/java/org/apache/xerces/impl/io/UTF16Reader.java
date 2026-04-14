package org.apache.xerces.impl.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Locale;
import org.apache.xerces.util.MessageFormatter;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class UTF16Reader extends Reader {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    protected final byte[] fBuffer;
    private final MessageFormatter fFormatter;
    protected final InputStream fInputStream;
    protected final boolean fIsBigEndian;
    private final Locale fLocale;

    public UTF16Reader(InputStream inputStream, boolean z) {
    }

    private void expectedTwoBytes() throws MalformedByteSequenceException {
    }

    private void processBE(char[] cArr, int i, int i2) {
    }

    private void processLE(char[] cArr, int i, int i2) {
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
    }

    @Override // java.io.Reader
    public boolean markSupported() {
    }

    @Override // java.io.Reader
    public int read() throws IOException {
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
    }

    public UTF16Reader(InputStream inputStream, boolean z, MessageFormatter messageFormatter, Locale locale) {
    }

    public UTF16Reader(InputStream inputStream, int i, boolean z, MessageFormatter messageFormatter, Locale locale) {
    }

    public UTF16Reader(InputStream inputStream, byte[] bArr, boolean z, MessageFormatter messageFormatter, Locale locale) {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
    }
}
