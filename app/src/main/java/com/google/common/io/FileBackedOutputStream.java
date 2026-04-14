package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FileBackedOutputStream extends OutputStream {

    @GuardedBy("this")
    private File file;
    private final int fileThreshold;

    @GuardedBy("this")
    private MemoryOutput memory;

    @GuardedBy("this")
    private OutputStream out;
    private final File parentDirectory;
    private final boolean resetOnFinalize;
    private final ByteSource source;

    /* renamed from: com.google.common.io.FileBackedOutputStream$1 */
    class C09401 extends ByteSource {
        final /* synthetic */ FileBackedOutputStream this$0;

        C09401(FileBackedOutputStream fileBackedOutputStream) {
        }

        protected void finalize() {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$2 */
    class C09412 extends ByteSource {
        final /* synthetic */ FileBackedOutputStream this$0;

        C09412(FileBackedOutputStream fileBackedOutputStream) {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }
    }

    private static class MemoryOutput extends ByteArrayOutputStream {
        private MemoryOutput() {
        }

        byte[] getBuffer() {
        }

        int getCount() {
        }

        /* synthetic */ MemoryOutput(C09401 c09401) {
        }
    }

    public FileBackedOutputStream(int i) {
    }

    static /* synthetic */ InputStream access$100(FileBackedOutputStream fileBackedOutputStream) throws IOException {
    }

    private synchronized InputStream openInputStream() throws IOException {
    }

    @GuardedBy("this")
    private void update(int i) throws IOException {
    }

    public ByteSource asByteSource() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
    }

    @VisibleForTesting
    synchronized File getFile() {
    }

    public synchronized void reset() throws IOException {
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) throws IOException {
    }

    public FileBackedOutputStream(int i, boolean z) {
    }

    private FileBackedOutputStream(int i, boolean z, File file) {
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
