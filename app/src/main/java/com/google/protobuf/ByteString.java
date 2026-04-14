package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = null;
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = null;
    private static final ByteArrayCopier byteArrayCopier = null;
    private int hash;

    /* renamed from: com.google.protobuf.ByteString$1 */
    class C12821 extends AbstractByteIterator {
        private final int limit;
        private int position;
        final /* synthetic */ ByteString this$0;

        C12821(ByteString byteString) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
        }
    }

    /* renamed from: com.google.protobuf.ByteString$2 */
    static class C12832 implements Comparator<ByteString> {
        C12832() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ByteString byteString, ByteString byteString2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(ByteString byteString, ByteString byteString2) {
        }
    }

    static abstract class AbstractByteIterator implements ByteIterator {
        AbstractByteIterator() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Byte next() {
        }

        @Override // java.util.Iterator
        public final void remove() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
        }
    }

    private static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i, int i2) {
        }

        /* synthetic */ ArraysByteArrayCopier(C12821 c12821) {
        }
    }

    private static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bArr, int i, int i2) {
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte byteAt(int i) {
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        protected int getOffsetIntoBytes() {
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        byte internalByteAt(int i) {
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public int size() {
        }

        Object writeReplace() {
        }
    }

    private interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        /* synthetic */ CodedBuilder(int i, C12821 c12821) {
        }

        public ByteString build() {
        }

        public CodedOutputStream getCodedOutput() {
        }

        private CodedBuilder(int i) {
        }
    }

    static abstract class LeafByteString extends ByteString {
        LeafByteString() {
        }

        abstract boolean equalsRange(ByteString byteString, int i, int i2);

        @Override // com.google.protobuf.ByteString
        protected final int getTreeDepth() {
        }

        @Override // com.google.protobuf.ByteString
        protected final boolean isBalanced() {
        }

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        }

        @Override // com.google.protobuf.ByteString
        void writeToReverse(ByteOutput byteOutput) throws IOException {
        }
    }

    private static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] bArr) {
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
        }

        @Override // com.google.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i) {
        }

        @Override // com.google.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        final boolean equalsRange(ByteString byteString, int i, int i2) {
        }

        protected int getOffsetIntoBytes() {
        }

        @Override // com.google.protobuf.ByteString
        byte internalByteAt(int i) {
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
        }

        @Override // com.google.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
        }

        @Override // com.google.protobuf.ByteString
        public final InputStream newInput() {
        }

        @Override // com.google.protobuf.ByteString
        protected final int partialHash(int i, int i2, int i3) {
        }

        @Override // com.google.protobuf.ByteString
        protected final int partialIsValidUtf8(int i, int i2, int i3) {
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString substring(int i, int i2) {
        }

        @Override // com.google.protobuf.ByteString
        protected final String toStringInternal(Charset charset) {
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
        }

        @Override // com.google.protobuf.ByteString
        final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        }

        @Override // com.google.protobuf.ByteString
        final void writeTo(ByteOutput byteOutput) throws IOException {
        }
    }

    private static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i, int i2) {
        }

        /* synthetic */ SystemByteArrayCopier(C12821 c12821) {
        }
    }

    ByteString() {
    }

    static /* synthetic */ int access$200(byte b) {
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
    }

    static void checkIndex(int i, int i2) {
    }

    static int checkRange(int i, int i2, int i3) {
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
    }

    public static ByteString copyFromUtf8(String str) {
    }

    static CodedBuilder newCodedBuilder(int i) {
    }

    public static Output newOutput(int i) {
    }

    private static ByteString readChunk(InputStream inputStream, int i) throws IOException {
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
    }

    private static int toInt(byte b) {
    }

    private String truncateAndEscapeForDisplay() {
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
    }

    static ByteString wrap(ByteBuffer byteBuffer) {
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
    }

    protected abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
    }

    public abstract boolean equals(Object obj);

    protected abstract int getTreeDepth();

    public final int hashCode() {
    }

    abstract byte internalByteAt(int i);

    protected abstract boolean isBalanced();

    public final boolean isEmpty() {
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator2() {
    }

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    protected abstract int partialHash(int i, int i2, int i3);

    protected abstract int partialIsValidUtf8(int i, int i2, int i3);

    protected final int peekCachedHashCode() {
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
    }

    public final ByteString substring(int i) {
    }

    public abstract ByteString substring(int i, int i2);

    public final byte[] toByteArray() {
    }

    public final String toString(String str) throws UnsupportedEncodingException {
    }

    protected abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
    }

    abstract void writeTo(ByteOutput byteOutput) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
    }

    abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    abstract void writeToReverse(ByteOutput byteOutput) throws IOException;

    public static Output newOutput() {
    }

    public static ByteString readFrom(InputStream inputStream, int i) throws IOException {
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
    }

    public static ByteString copyFrom(byte[] bArr) {
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
    }

    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = null;
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int i) {
        }

        private byte[] copyArray(byte[] bArr, int i) {
        }

        private void flushFullBuffer(int i) {
        }

        private void flushLastBuffer() {
        }

        public synchronized void reset() {
        }

        public synchronized int size() {
        }

        public synchronized ByteString toByteString() {
        }

        public String toString() {
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
        }

        public void writeTo(OutputStream outputStream) throws IOException {
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
    }

    static ByteString wrap(byte[] bArr) {
    }

    public final String toString(Charset charset) {
    }

    static ByteString wrap(byte[] bArr, int i, int i2) {
    }

    public final String toString() {
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
    }

    public static ByteString copyFrom(String str, Charset charset) {
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
    }
}
