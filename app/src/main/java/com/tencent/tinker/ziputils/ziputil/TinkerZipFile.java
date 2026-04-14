package com.tencent.tinker.ziputils.ziputil;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerZipFile implements Closeable, ZipConstants {
    static final int GPBF_DATA_DESCRIPTOR_FLAG = 8;
    static final int GPBF_ENCRYPTED_FLAG = 1;
    static final int GPBF_UNSUPPORTED_MASK = 1;
    static final int GPBF_UTF8_FLAG = 2048;
    public static final int OPEN_DELETE = 4;
    public static final int OPEN_READ = 1;
    private String comment;
    private final LinkedHashMap<String, TinkerZipEntry> entries;
    private File fileToDeleteOnClose;
    private final String filename;
    private RandomAccessFile raf;

    /* renamed from: com.tencent.tinker.ziputils.ziputil.TinkerZipFile$1 */
    class C16591 implements Enumeration<TinkerZipEntry> {
        final /* synthetic */ TinkerZipFile this$0;
        final /* synthetic */ Iterator val$iterator;

        C16591(TinkerZipFile tinkerZipFile, Iterator it) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
        }

        @Override // java.util.Enumeration
        public /* bridge */ /* synthetic */ TinkerZipEntry nextElement() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Enumeration
        public TinkerZipEntry nextElement() {
        }
    }

    static class EocdRecord {
        final long centralDirOffset;
        final int commentLength;
        final long numEntries;

        EocdRecord(long j, long j2, int i) {
        }
    }

    public static class RAFStream extends InputStream {
        private long endOffset;
        private long offset;
        private final RandomAccessFile sharedRaf;

        public RAFStream(RandomAccessFile randomAccessFile, long j, long j2) {
        }

        static /* synthetic */ long access$102(RAFStream rAFStream, long j) {
        }

        static /* synthetic */ long access$200(RAFStream rAFStream) {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
        }

        public RAFStream(RandomAccessFile randomAccessFile, long j) throws IOException {
        }
    }

    public TinkerZipFile(File file) throws ZipException, IOException {
    }

    static /* synthetic */ void access$000(TinkerZipFile tinkerZipFile) {
    }

    private void checkNotClosed() {
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
    }

    public static boolean isEmpty(CharSequence charSequence) {
    }

    private static EocdRecord parseEocdRecord(RandomAccessFile randomAccessFile, long j, boolean z) throws IOException {
    }

    private void readCentralDir() throws IOException {
    }

    static void throwZipException(String str, long j, String str2, long j2, String str3, int i) throws ZipException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public Enumeration<? extends TinkerZipEntry> entries() {
    }

    public String getComment() {
    }

    public TinkerZipEntry getEntry(String str) {
    }

    public InputStream getInputStream(TinkerZipEntry tinkerZipEntry) throws IOException {
    }

    public String getName() {
    }

    public int size() {
    }

    public TinkerZipFile(String str) throws IOException {
    }

    public TinkerZipFile(File file, int i) throws IOException {
    }
}
