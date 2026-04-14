package com.tencent.tinker.ziputils.ziputil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.CRC32;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.ZipEntry;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AlignedZipOutputStream extends DeflaterOutputStream {
    private static final long CENSIG = 33639248;
    public static final int DEFLATED = 8;
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final long ENDSIG = 101010256;
    private static final int EXTHDR = 16;
    private static final long EXTSIG = 134695760;
    private static final int GPBF_DATA_DESCRIPTOR_FLAG = 8;
    private static final int GPBF_UTF8_FLAG = 2048;
    private static final int LOCHDR = 30;
    private static final long LOCSIG = 67324752;
    private static final int MOD_DATE_CONST = 33;
    private static final byte[] ONE_ELEM_BYTE_ARRAY = null;
    public static final int STORED = 0;
    private static final int TIME_CONST = 0;
    private static final int ZIPLocalHeaderVersionNeeded = 20;
    private final int alignBytes;
    private ByteArrayOutputStream cDir;
    private boolean closed;
    private byte[] commentBytes;
    private int compressionLevel;
    private final CRC32 crc;
    private long crcDataSize;
    private ZipEntry currentEntry;
    private int defaultCompressionMethod;
    private final HashSet<String> entries;
    private boolean finished;
    private byte[] nameBytes;
    private int nameLength;
    private int offset;
    private int padding;

    public AlignedZipOutputStream(OutputStream outputStream) {
    }

    private void checkOffsetAndCount(int i, int i2, int i3) {
    }

    private void checkOpen() throws IOException {
    }

    private int getPaddingByteCount(ZipEntry zipEntry, int i) {
    }

    private void makePaddingToStream(OutputStream outputStream, int i) throws IOException {
    }

    private long writeLong(OutputStream outputStream, long j) throws IOException {
    }

    private int writeShort(OutputStream outputStream, int i) throws IOException {
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void closeEntry() throws IOException {
    }

    @Override // java.util.zip.DeflaterOutputStream
    public void finish() throws IOException {
    }

    public void putNextEntry(ZipEntry zipEntry) throws IOException {
    }

    public void setComment(String str) {
    }

    public void setLevel(int i) {
    }

    public void setMethod(int i) {
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
    }

    public AlignedZipOutputStream(OutputStream outputStream, int i) {
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }
}
