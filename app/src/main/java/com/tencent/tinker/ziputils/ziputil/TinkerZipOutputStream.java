package com.tencent.tinker.ziputils.ziputil;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerZipOutputStream extends FilterOutputStream implements ZipConstants {
    public static final byte[] BYTE = null;
    public static final int DEFLATED = 8;
    static final int MOD_DATE_CONST = 18698;
    public static final int STORED = 0;
    static final int TIME_CONST = 40691;
    private static final byte[] ZIP64_PLACEHOLDER_BYTES = null;
    private static final int ZIP_VERSION_2_0 = 20;
    private boolean archiveNeedsZip64EocdRecord;
    private ByteArrayOutputStream cDir;
    private byte[] commentBytes;
    private TinkerZipEntry currentEntry;
    private boolean currentEntryNeedsZip64;
    private int defaultCompressionMethod;
    private final HashSet<String> entries;
    private byte[] entryCommentBytes;
    private final boolean forceZip64;
    private byte[] nameBytes;
    private long offset;

    public TinkerZipOutputStream(OutputStream outputStream) {
    }

    private void checkOpen() throws IOException {
    }

    private void checkSizeIsWithinShort(String str, byte[] bArr) {
    }

    static int writeIntAsUint16(OutputStream outputStream, int i) throws IOException {
    }

    static long writeLongAsUint32(OutputStream outputStream, long j) throws IOException {
    }

    static long writeLongAsUint64(OutputStream outputStream, long j) throws IOException {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void closeEntry() throws IOException {
    }

    public void finish() throws IOException {
    }

    public void putNextEntry(TinkerZipEntry tinkerZipEntry) throws IOException {
    }

    public void setComment(String str) {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
    }

    public TinkerZipOutputStream(OutputStream outputStream, boolean z) {
    }
}
