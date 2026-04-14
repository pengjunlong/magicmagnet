package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = null;
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* renamed from: com.google.protobuf.RopeByteString$1 */
    class C13261 extends ByteString.AbstractByteIterator {
        ByteString.ByteIterator current;
        final PieceIterator pieces;
        final /* synthetic */ RopeByteString this$0;

        C13261(RopeByteString ropeByteString) {
        }

        private ByteString.ByteIterator nextPiece() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
        }
    }

    private static final class PieceIterator implements Iterator<ByteString.LeafByteString> {
        private final ArrayDeque<RopeByteString> breadCrumbs;
        private ByteString.LeafByteString next;

        /* synthetic */ PieceIterator(ByteString byteString, C13261 c13261) {
        }

        private ByteString.LeafByteString getLeafByLeft(ByteString byteString) {
        }

        private ByteString.LeafByteString getNextNonEmptyLeaf() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ByteString.LeafByteString next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        private PieceIterator(ByteString byteString) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public ByteString.LeafByteString next() {
        }
    }

    /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, C13261 c13261) {
    }

    static /* synthetic */ ByteString access$400(RopeByteString ropeByteString) {
    }

    static /* synthetic */ ByteString access$500(RopeByteString ropeByteString) {
    }

    static ByteString concatenate(ByteString byteString, ByteString byteString2) {
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
    }

    private boolean equalsFragments(ByteString byteString) {
    }

    static int minLength(int i) {
    }

    static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
    }

    @Override // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
    }

    @Override // com.google.protobuf.ByteString
    protected int getTreeDepth() {
    }

    @Override // com.google.protobuf.ByteString
    byte internalByteAt(int i) {
    }

    @Override // com.google.protobuf.ByteString
    protected boolean isBalanced() {
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator2() {
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
    }

    @Override // com.google.protobuf.ByteString
    protected int partialHash(int i, int i2, int i3) {
    }

    @Override // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int i, int i2, int i3) {
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i2) {
    }

    @Override // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
    }

    Object writeReplace() {
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
    }

    @Override // com.google.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.ByteString
    void writeToReverse(ByteOutput byteOutput) throws IOException {
    }

    private static class Balancer {
        private final ArrayDeque<ByteString> prefixesStack;

        private Balancer() {
        }

        static /* synthetic */ ByteString access$100(Balancer balancer, ByteString byteString, ByteString byteString2) {
        }

        private ByteString balance(ByteString byteString, ByteString byteString2) {
        }

        private void doBalance(ByteString byteString) {
        }

        private int getDepthBinForLength(int i) {
        }

        private void insert(ByteString byteString) {
        }

        /* synthetic */ Balancer(C13261 c13261) {
        }
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
    }

    @Override // com.google.protobuf.ByteString
    void writeTo(ByteOutput byteOutput) throws IOException {
    }

    private class RopeInputStream extends InputStream {
        private ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private PieceIterator pieceIterator;
        final /* synthetic */ RopeByteString this$0;

        public RopeInputStream(RopeByteString ropeByteString) {
        }

        private void advanceIfCurrentPieceFullyRead() {
        }

        private int availableInternal() {
        }

        private void initialize() {
        }

        private int readSkipInternal(byte[] bArr, int i, int i2) {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream
        public void mark(int i) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
        }

        @Override // java.io.InputStream
        public long skip(long j) {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }
    }
}
