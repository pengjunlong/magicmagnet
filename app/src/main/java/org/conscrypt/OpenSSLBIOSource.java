package org.conscrypt;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class OpenSSLBIOSource {
    private OpenSSLBIOInputStream source;

    private OpenSSLBIOSource(OpenSSLBIOInputStream openSSLBIOInputStream) {
    }

    private synchronized void release() {
    }

    static OpenSSLBIOSource wrap(ByteBuffer byteBuffer) {
    }

    protected void finalize() throws Throwable {
    }

    long getContext() {
    }

    private static class ByteBufferInputStream extends InputStream {
        private final ByteBuffer source;

        ByteBufferInputStream(ByteBuffer byteBuffer) {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
        }
    }
}
