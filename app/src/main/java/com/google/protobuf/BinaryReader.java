package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class BinaryReader implements Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    /* renamed from: com.google.protobuf.BinaryReader$1 */
    static /* synthetic */ class C12781 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    /* synthetic */ BinaryReader(C12781 c12781) {
    }

    public static BinaryReader newInstance(ByteBuffer byteBuffer, boolean z) {
    }

    public abstract int getTotalBytesRead();

    @Override // com.google.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
    }

    private static final class SafeHeapReader extends BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(ByteBuffer byteBuffer, boolean z) {
        }

        private boolean isAtEnd() {
        }

        private byte readByte() throws IOException {
        }

        private Object readField(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        private int readLittleEndian32() throws IOException {
        }

        private int readLittleEndian32_NoCheck() {
        }

        private long readLittleEndian64() throws IOException {
        }

        private long readLittleEndian64_NoCheck() {
        }

        private int readVarint32() throws IOException {
        }

        private long readVarint64SlowPath() throws IOException {
        }

        private void requireBytes(int i) throws IOException {
        }

        private void requirePosition(int i) throws IOException {
        }

        private void requireWireType(int i) throws IOException {
        }

        private void skipBytes(int i) throws IOException {
        }

        private void skipGroup() throws IOException {
        }

        private void skipVarint() throws IOException {
        }

        private void skipVarintSlowPath() throws IOException {
        }

        private void verifyPackedFixed32Length(int i) throws IOException {
        }

        private void verifyPackedFixed64Length(int i) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public int getFieldNumber() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public int getTag() {
        }

        @Override // com.google.protobuf.BinaryReader
        public int getTotalBytesRead() {
        }

        @Override // com.google.protobuf.Reader
        public boolean readBool() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readBoolList(List<Boolean> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public ByteString readBytes() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readBytesList(List<ByteString> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public double readDouble() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readDoubleList(List<Double> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public int readEnum() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readEnumList(List<Integer> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public int readFixed32() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readFixed32List(List<Integer> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public long readFixed64() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readFixed64List(List<Long> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public float readFloat() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readFloatList(List<Float> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <T> T readGroupBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <T> void readGroupList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public int readInt32() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readInt32List(List<Integer> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public long readInt64() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readInt64List(List<Long> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <K, V> void readMap(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <T> T readMessageBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <T> void readMessageList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public int readSFixed32() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readSFixed32List(List<Integer> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public long readSFixed64() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readSFixed64List(List<Long> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public int readSInt32() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readSInt32List(List<Integer> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public long readSInt64() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readSInt64List(List<Long> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public String readString() throws IOException {
        }

        public String readStringInternal(boolean z) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readStringList(List<String> list) throws IOException {
        }

        public void readStringListInternal(List<String> list, boolean z) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readStringListRequireUtf8(List<String> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public String readStringRequireUtf8() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public int readUInt32() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readUInt32List(List<Integer> list) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public long readUInt64() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public void readUInt64List(List<Long> list) throws IOException {
        }

        public long readVarint64() throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public boolean skipField() throws IOException {
        }

        private <T> T readGroup(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        private <T> T readMessage(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        @Override // com.google.protobuf.Reader
        public <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    private BinaryReader() {
    }
}
