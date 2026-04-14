package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* renamed from: com.google.protobuf.BinaryWriter$1 */
    static /* synthetic */ class C12791 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    private static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(BufferAllocator bufferAllocator, int i) {
        }

        private int bytesWrittenToCurrentBuffer() {
        }

        private void nextBuffer() {
        }

        private int spaceLeft() {
        }

        private void writeVarint32FiveBytes(int i) {
        }

        private void writeVarint32FourBytes(int i) {
        }

        private void writeVarint32OneByte(int i) {
        }

        private void writeVarint32ThreeBytes(int i) {
        }

        private void writeVarint32TwoBytes(int i) {
        }

        private void writeVarint64EightBytes(long j) {
        }

        private void writeVarint64EightBytesWithSign(long j) {
        }

        private void writeVarint64FiveBytes(long j) {
        }

        private void writeVarint64FourBytes(long j) {
        }

        private void writeVarint64NineBytes(long j) {
        }

        private void writeVarint64OneByte(long j) {
        }

        private void writeVarint64SevenBytes(long j) {
        }

        private void writeVarint64SixBytes(long j) {
        }

        private void writeVarint64TenBytes(long j) {
        }

        private void writeVarint64ThreeBytes(long j) {
        }

        private void writeVarint64TwoBytes(long j) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b) {
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i, boolean z) {
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i, ByteString byteString) {
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int i) {
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i, long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i, Object obj) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i, Object obj) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i, long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int i) {
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i, String str) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i, long j) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j) {
        }

        private void nextBuffer(int i) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i, Object obj, Schema schema) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i, Object obj, Schema schema) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
        }
    }

    private static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(BufferAllocator bufferAllocator, int i) {
        }

        private void nextBuffer() {
        }

        private void writeVarint32FiveBytes(int i) {
        }

        private void writeVarint32FourBytes(int i) {
        }

        private void writeVarint32OneByte(int i) {
        }

        private void writeVarint32ThreeBytes(int i) {
        }

        private void writeVarint32TwoBytes(int i) {
        }

        private void writeVarint64EightBytes(long j) {
        }

        private void writeVarint64FiveBytes(long j) {
        }

        private void writeVarint64FourBytes(long j) {
        }

        private void writeVarint64NineBytes(long j) {
        }

        private void writeVarint64OneByte(long j) {
        }

        private void writeVarint64SevenBytes(long j) {
        }

        private void writeVarint64SixBytes(long j) {
        }

        private void writeVarint64TenBytes(long j) {
        }

        private void writeVarint64ThreeBytes(long j) {
        }

        private void writeVarint64TwoBytes(long j) {
        }

        int bytesWrittenToCurrentBuffer() {
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i) {
        }

        int spaceLeft() {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b) {
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i, boolean z) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i, ByteString byteString) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int i) {
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i, int i2) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i, long j) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i, Object obj) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i, int i2) throws IOException {
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i, Object obj) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i, int i2) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i, long j) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int i) {
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i, String str) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i, int i2) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i, long j) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j) {
        }

        private void nextBuffer(int i) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i, Object obj, Schema schema) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i, Object obj, Schema schema) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
        }
    }

    private static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(BufferAllocator bufferAllocator, int i) {
        }

        static /* synthetic */ boolean access$000() {
        }

        private int bufferPos() {
        }

        private int bytesWrittenToCurrentBuffer() {
        }

        private static boolean isSupported() {
        }

        private void nextBuffer() {
        }

        private int spaceLeft() {
        }

        private void writeVarint32FiveBytes(int i) {
        }

        private void writeVarint32FourBytes(int i) {
        }

        private void writeVarint32OneByte(int i) {
        }

        private void writeVarint32ThreeBytes(int i) {
        }

        private void writeVarint32TwoBytes(int i) {
        }

        private void writeVarint64EightBytes(long j) {
        }

        private void writeVarint64FiveBytes(long j) {
        }

        private void writeVarint64FourBytes(long j) {
        }

        private void writeVarint64NineBytes(long j) {
        }

        private void writeVarint64OneByte(long j) {
        }

        private void writeVarint64SevenBytes(long j) {
        }

        private void writeVarint64SixBytes(long j) {
        }

        private void writeVarint64TenBytes(long j) {
        }

        private void writeVarint64ThreeBytes(long j) {
        }

        private void writeVarint64TwoBytes(long j) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b) {
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i, boolean z) {
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i, ByteString byteString) {
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int i) {
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i, long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i, Object obj) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i, Object obj) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i, long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int i) {
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i, String str) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i, long j) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j) {
        }

        private void nextBuffer(int i) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i, Object obj, Schema schema) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i, Object obj, Schema schema) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
        }
    }

    private static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(BufferAllocator bufferAllocator, int i) {
        }

        private int arrayPos() {
        }

        static boolean isSupported() {
        }

        private void nextBuffer() {
        }

        private void writeVarint32FiveBytes(int i) {
        }

        private void writeVarint32FourBytes(int i) {
        }

        private void writeVarint32OneByte(int i) {
        }

        private void writeVarint32ThreeBytes(int i) {
        }

        private void writeVarint32TwoBytes(int i) {
        }

        private void writeVarint64EightBytes(long j) {
        }

        private void writeVarint64FiveBytes(long j) {
        }

        private void writeVarint64FourBytes(long j) {
        }

        private void writeVarint64NineBytes(long j) {
        }

        private void writeVarint64OneByte(long j) {
        }

        private void writeVarint64SevenBytes(long j) {
        }

        private void writeVarint64SixBytes(long j) {
        }

        private void writeVarint64TenBytes(long j) {
        }

        private void writeVarint64ThreeBytes(long j) {
        }

        private void writeVarint64TwoBytes(long j) {
        }

        int bytesWrittenToCurrentBuffer() {
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int i) {
        }

        int spaceLeft() {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte b) {
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i, boolean z) {
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int i, ByteString byteString) {
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int i) {
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int i, long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i, Object obj) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i, Object obj) throws IOException {
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int i, long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int i) {
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int i, String str) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int i, int i2) {
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int i, long j) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long j) {
        }

        private void nextBuffer(int i) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i, int i2) {
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int i, Object obj, Schema schema) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int i) {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long j) {
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int i, Object obj, Schema schema) throws IOException {
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(String str) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
        }
    }

    /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i, C12791 c12791) {
    }

    static /* synthetic */ byte access$200(long j) {
    }

    private static byte computeUInt64SizeNoTag(long j) {
    }

    static boolean isUnsafeDirectSupported() {
    }

    static boolean isUnsafeHeapSupported() {
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
    }

    static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int i) {
    }

    static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int i) {
    }

    static BinaryWriter newUnsafeDirectInstance(BufferAllocator bufferAllocator, int i) {
    }

    static BinaryWriter newUnsafeHeapInstance(BufferAllocator bufferAllocator, int i) {
    }

    private final void writeBoolList_Internal(int i, List<Boolean> list, boolean z) throws IOException {
    }

    private final void writeDoubleList_Internal(int i, List<Double> list, boolean z) throws IOException {
    }

    private final void writeFixed32List_Internal(int i, List<Integer> list, boolean z) throws IOException {
    }

    private final void writeFixed64List_Internal(int i, List<Long> list, boolean z) throws IOException {
    }

    private final void writeFloatList_Internal(int i, List<Float> list, boolean z) throws IOException {
    }

    private final void writeInt32List_Internal(int i, List<Integer> list, boolean z) throws IOException {
    }

    private void writeLazyString(int i, Object obj) throws IOException {
    }

    static final void writeMapEntryField(Writer writer, int i, WireFormat.FieldType fieldType, Object obj) throws IOException {
    }

    private final void writeSInt32List_Internal(int i, List<Integer> list, boolean z) throws IOException {
    }

    private final void writeSInt64List_Internal(int i, List<Long> list, boolean z) throws IOException {
    }

    private final void writeUInt32List_Internal(int i, List<Integer> list, boolean z) throws IOException {
    }

    private final void writeUInt64List_Internal(int i, List<Long> list, boolean z) throws IOException {
    }

    public final Queue<AllocatedBuffer> complete() {
    }

    @Override // com.google.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    final AllocatedBuffer newDirectBuffer() {
    }

    final AllocatedBuffer newHeapBuffer() {
    }

    abstract void requireSpace(int i);

    abstract void writeBool(boolean z);

    @Override // com.google.protobuf.Writer
    public final void writeBoolList(int i, List<Boolean> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeBytesList(int i, List<ByteString> list) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeDouble(int i, double d) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeDoubleList(int i, List<Double> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnum(int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnumList(int i, List<Integer> list, boolean z) throws IOException {
    }

    abstract void writeFixed32(int i);

    @Override // com.google.protobuf.Writer
    public final void writeFixed32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    abstract void writeFixed64(long j);

    @Override // com.google.protobuf.Writer
    public final void writeFixed64List(int i, List<Long> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloat(int i, float f) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloatList(int i, List<Float> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeGroupList(int i, List<?> list) throws IOException {
    }

    abstract void writeInt32(int i);

    @Override // com.google.protobuf.Writer
    public final void writeInt32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64(int i, long j) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64List(int i, List<Long> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int i, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int i, List<?> list) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i, Object obj) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32(int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64(int i, long j) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64List(int i, List<Long> list, boolean z) throws IOException {
    }

    abstract void writeSInt32(int i);

    @Override // com.google.protobuf.Writer
    public final void writeSInt32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    abstract void writeSInt64(long j);

    @Override // com.google.protobuf.Writer
    public final void writeSInt64List(int i, List<Long> list, boolean z) throws IOException {
    }

    abstract void writeString(String str);

    @Override // com.google.protobuf.Writer
    public final void writeStringList(int i, List<String> list) throws IOException {
    }

    abstract void writeTag(int i, int i2);

    @Override // com.google.protobuf.Writer
    public final void writeUInt32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt64List(int i, List<Long> list, boolean z) throws IOException {
    }

    abstract void writeVarint32(int i);

    abstract void writeVarint64(long j);

    private BinaryWriter(BufferAllocator bufferAllocator, int i) {
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator, int i) {
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator, int i) {
    }

    final AllocatedBuffer newDirectBuffer(int i) {
    }

    final AllocatedBuffer newHeapBuffer(int i) {
    }

    @Override // com.google.protobuf.Writer
    public final void writeGroupList(int i, List<?> list, Schema schema) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int i, List<?> list, Schema schema) throws IOException {
    }

    private final void writeBoolList_Internal(int i, BooleanArrayList booleanArrayList, boolean z) throws IOException {
    }

    private final void writeDoubleList_Internal(int i, DoubleArrayList doubleArrayList, boolean z) throws IOException {
    }

    private final void writeFixed32List_Internal(int i, IntArrayList intArrayList, boolean z) throws IOException {
    }

    private final void writeFixed64List_Internal(int i, LongArrayList longArrayList, boolean z) throws IOException {
    }

    private final void writeFloatList_Internal(int i, FloatArrayList floatArrayList, boolean z) throws IOException {
    }

    private final void writeInt32List_Internal(int i, IntArrayList intArrayList, boolean z) throws IOException {
    }

    private final void writeSInt32List_Internal(int i, IntArrayList intArrayList, boolean z) throws IOException {
    }

    private final void writeSInt64List_Internal(int i, LongArrayList longArrayList, boolean z) throws IOException {
    }

    private final void writeUInt32List_Internal(int i, IntArrayList intArrayList, boolean z) throws IOException {
    }

    private final void writeUInt64List_Internal(int i, LongArrayList longArrayList, boolean z) throws IOException {
    }
}
