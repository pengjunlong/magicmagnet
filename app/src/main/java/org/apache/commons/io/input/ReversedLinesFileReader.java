package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ReversedLinesFileReader implements Closeable {
    private final int avoidNewlineSplitBufferSize;
    private final int blockSize;
    private final int byteDecrement;
    private FilePart currentFilePart;
    private final Charset encoding;
    private final byte[][] newLineSequences;
    private final RandomAccessFile randomAccessFile;
    private final long totalBlockCount;
    private final long totalByteLength;
    private boolean trailingNewlineOfFileSkipped;

    private class FilePart {
        private int currentLastBytePos;
        private final byte[] data;
        private byte[] leftOver;
        private final long no;
        final /* synthetic */ ReversedLinesFileReader this$0;

        /* synthetic */ FilePart(ReversedLinesFileReader reversedLinesFileReader, long j, int i, byte[] bArr, C17701 c17701) throws IOException {
        }

        static /* synthetic */ String access$100(FilePart filePart) throws IOException {
        }

        static /* synthetic */ FilePart access$200(FilePart filePart) throws IOException {
        }

        private void createLeftOver() {
        }

        private int getNewLineMatchByteCount(byte[] bArr, int i) {
        }

        private String readLine() throws IOException {
        }

        private FilePart rollOver() throws IOException {
        }

        private FilePart(ReversedLinesFileReader reversedLinesFileReader, long j, int i, byte[] bArr) throws IOException {
        }
    }

    public ReversedLinesFileReader(File file) throws IOException {
    }

    static /* synthetic */ int access$300(ReversedLinesFileReader reversedLinesFileReader) {
    }

    static /* synthetic */ RandomAccessFile access$400(ReversedLinesFileReader reversedLinesFileReader) {
    }

    static /* synthetic */ Charset access$500(ReversedLinesFileReader reversedLinesFileReader) {
    }

    static /* synthetic */ int access$600(ReversedLinesFileReader reversedLinesFileReader) {
    }

    static /* synthetic */ int access$700(ReversedLinesFileReader reversedLinesFileReader) {
    }

    static /* synthetic */ byte[][] access$800(ReversedLinesFileReader reversedLinesFileReader) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public String readLine() throws IOException {
    }

    public ReversedLinesFileReader(File file, int i, Charset charset) throws IOException {
    }

    public ReversedLinesFileReader(File file, int i, String str) throws IOException {
    }
}
