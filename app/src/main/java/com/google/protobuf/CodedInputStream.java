package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_RECURSION_LIMIT = 100;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

    private static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        /* synthetic */ ArrayDecoder(byte[] bArr, int i, int i2, boolean z, C12851 c12851) {
        }

        private void recomputeBufferSizeAfterLimit() {
        }

        private void skipRawVarint() throws IOException {
        }

        private void skipRawVarintFastPath() throws IOException {
        }

        private void skipRawVarintSlowPath() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) throws IOException {
        }

        private ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        }
    }

    private static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private boolean immutable;
        private Iterable<ByteBuffer> input;
        private Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        /* synthetic */ IterableDirectByteBufferDecoder(Iterable iterable, int i, boolean z, C12851 c12851) {
        }

        private long currentRemaining() {
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
        }

        private void readRawBytesTo(byte[] bArr, int i, int i2) throws IOException {
        }

        private void recomputeBufferSizeAfterLimit() {
        }

        private int remaining() {
        }

        private void skipRawVarint() throws IOException {
        }

        private ByteBuffer slice(int i, int i2) throws IOException {
        }

        private void tryGetNextByteBuffer() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) throws IOException {
        }

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> iterable, int i, boolean z) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        }
    }

    private static final class StreamDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        private class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos;
            final /* synthetic */ StreamDecoder this$0;

            private SkippedDataSink(StreamDecoder streamDecoder) {
            }

            ByteBuffer getSkippedData() {
            }

            @Override // com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
            }
        }

        /* synthetic */ StreamDecoder(InputStream inputStream, int i, C12851 c12851) {
        }

        static /* synthetic */ int access$500(StreamDecoder streamDecoder) {
        }

        static /* synthetic */ byte[] access$600(StreamDecoder streamDecoder) {
        }

        private ByteString readBytesSlowPath(int i) throws IOException {
        }

        private byte[] readRawBytesSlowPath(int i, boolean z) throws IOException {
        }

        private byte[] readRawBytesSlowPathOneChunk(int i) throws IOException {
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i) throws IOException {
        }

        private void recomputeBufferSizeAfterLimit() {
        }

        private void refillBuffer(int i) throws IOException {
        }

        private void skipRawBytesSlowPath(int i) throws IOException {
        }

        private void skipRawVarint() throws IOException {
        }

        private void skipRawVarintFastPath() throws IOException {
        }

        private void skipRawVarintSlowPath() throws IOException {
        }

        private boolean tryRefillBuffer(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) throws IOException {
        }

        private StreamDecoder(InputStream inputStream, int i) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        }
    }

    private static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        /* synthetic */ UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z, C12851 c12851) {
        }

        private int bufferPos(long j) {
        }

        static boolean isSupported() {
        }

        private void recomputeBufferSizeAfterLimit() {
        }

        private int remaining() {
        }

        private void skipRawVarint() throws IOException {
        }

        private void skipRawVarintFastPath() throws IOException {
        }

        private void skipRawVarintSlowPath() throws IOException {
        }

        private ByteBuffer slice(long j, long j2) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i) throws InvalidProtocolBufferException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i) throws IOException {
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        }
    }

    /* synthetic */ CodedInputStream(C12851 c12851) {
    }

    public static int decodeZigZag32(int i) {
    }

    public static long decodeZigZag64(long j) {
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
    }

    public abstract void checkLastTagWas(int i) throws InvalidProtocolBufferException;

    final void discardUnknownFields() {
    }

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i) {
    }

    public final int setSizeLimit(int i) {
    }

    final boolean shouldDiscardUnknownFields() {
    }

    public abstract boolean skipField(int i) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipRawBytes(int i) throws IOException;

    final void unsetDiscardUnknownFields() {
    }

    private CodedInputStream() {
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i) {
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
    }

    static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z) {
    }

    public static CodedInputStream newInstance(byte[] bArr) {
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
    }

    static CodedInputStream newInstance(byte[] bArr, int i, int i2, boolean z) {
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
    }

    static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z) {
    }
}
