package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.ByteOrderMark;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BOMInputStream extends ProxyInputStream {
    private static final Comparator<ByteOrderMark> ByteOrderMarkLengthComparator = null;
    private final List<ByteOrderMark> boms;
    private ByteOrderMark byteOrderMark;
    private int fbIndex;
    private int fbLength;
    private int[] firstBytes;
    private final boolean include;
    private int markFbIndex;
    private boolean markedAtStart;

    /* renamed from: org.apache.commons.io.input.BOMInputStream$1 */
    static class C17691 implements Comparator<ByteOrderMark> {
        C17691() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ByteOrderMark byteOrderMark, ByteOrderMark byteOrderMark2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(ByteOrderMark byteOrderMark, ByteOrderMark byteOrderMark2) {
        }
    }

    public BOMInputStream(InputStream inputStream) {
    }

    private ByteOrderMark find() {
    }

    private boolean matches(ByteOrderMark byteOrderMark) {
    }

    private int readFirstBytes() throws IOException {
    }

    public ByteOrderMark getBOM() throws IOException {
    }

    public String getBOMCharsetName() throws IOException {
    }

    public boolean hasBOM() throws IOException {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
    }

    public BOMInputStream(InputStream inputStream, boolean z) {
    }

    public boolean hasBOM(ByteOrderMark byteOrderMark) throws IOException {
    }

    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }

    public BOMInputStream(InputStream inputStream, boolean z, ByteOrderMark... byteOrderMarkArr) {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }
}
