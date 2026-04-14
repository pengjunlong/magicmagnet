package com.google.firebase.crashlytics.internal.log;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.logging.Logger;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class QueueFile implements Closeable {
    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = null;
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;

    /* renamed from: com.google.firebase.crashlytics.internal.log.QueueFile$1 */
    class C11181 implements ElementReader {
        boolean first;
        final /* synthetic */ QueueFile this$0;
        final /* synthetic */ StringBuilder val$builder;

        C11181(QueueFile queueFile, StringBuilder sb) {
        }

        @Override // com.google.firebase.crashlytics.internal.log.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) throws IOException {
        }
    }

    static class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = null;
        final int length;
        final int position;

        Element(int i, int i2) {
        }

        public String toString() {
        }
    }

    private final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;
        final /* synthetic */ QueueFile this$0;

        /* synthetic */ ElementInputStream(QueueFile queueFile, Element element, C11181 c11181) {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
        }

        private ElementInputStream(QueueFile queueFile, Element element) {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }
    }

    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    public QueueFile(File file) throws IOException {
    }

    static /* synthetic */ int access$100(QueueFile queueFile, int i) {
    }

    static /* synthetic */ Object access$200(Object obj, String str) {
    }

    static /* synthetic */ void access$300(QueueFile queueFile, int i, byte[] bArr, int i2, int i3) throws IOException {
    }

    static /* synthetic */ RandomAccessFile access$400(QueueFile queueFile) {
    }

    private void expandIfNecessary(int i) throws IOException {
    }

    private static void initialize(File file) throws IOException {
    }

    private static <T> T nonNull(T t, String str) {
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
    }

    private Element readElement(int i) throws IOException {
    }

    private void readHeader() throws IOException {
    }

    private static int readInt(byte[] bArr, int i) {
    }

    private int remainingBytes() {
    }

    private void ringRead(int i, byte[] bArr, int i2, int i3) throws IOException {
    }

    private void ringWrite(int i, byte[] bArr, int i2, int i3) throws IOException {
    }

    private void setLength(int i) throws IOException {
    }

    private int wrapPosition(int i) {
    }

    private void writeHeader(int i, int i2, int i3, int i4) throws IOException {
    }

    private static void writeInt(byte[] bArr, int i, int i2) {
    }

    private static void writeInts(byte[] bArr, int... iArr) {
    }

    public void add(byte[] bArr) throws IOException {
    }

    public synchronized void clear() throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    public synchronized void forEach(ElementReader elementReader) throws IOException {
    }

    public boolean hasSpaceFor(int i, int i2) {
    }

    public synchronized boolean isEmpty() {
    }

    public synchronized byte[] peek() throws IOException {
    }

    public synchronized void remove() throws IOException {
    }

    public synchronized int size() {
    }

    public String toString() {
    }

    public int usedBytes() {
    }

    public synchronized void add(byte[] bArr, int i, int i2) throws IOException {
    }

    QueueFile(RandomAccessFile randomAccessFile) throws IOException {
    }

    public synchronized void peek(ElementReader elementReader) throws IOException {
    }
}
