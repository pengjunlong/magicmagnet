package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* renamed from: com.google.protobuf.CodedOutputStreamWriter$1 */
    static /* synthetic */ class C12881 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
    }

    private <V> void writeDeterministicBooleanMapEntry(int i, boolean z, V v, MapEntryLite.Metadata<Boolean, V> metadata) throws IOException {
    }

    private <V> void writeDeterministicIntegerMap(int i, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) throws IOException {
    }

    private <V> void writeDeterministicLongMap(int i, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) throws IOException {
    }

    private <K, V> void writeDeterministicMap(int i, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
    }

    private <V> void writeDeterministicStringMap(int i, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) throws IOException {
    }

    private void writeLazyString(int i, Object obj) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
    }

    public int getTotalBytesWritten() {
    }

    @Override // com.google.protobuf.Writer
    public void writeBool(int i, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeBoolList(int i, List<Boolean> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeBytes(int i, ByteString byteString) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeBytesList(int i, List<ByteString> list) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeDouble(int i, double d) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeDoubleList(int i, List<Double> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeEndGroup(int i) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeEnum(int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeEnumList(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed32(int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed64(int i, long j) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed64List(int i, List<Long> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeFloat(int i, float f) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeFloatList(int i, List<Float> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeGroup(int i, Object obj) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeGroupList(int i, List<?> list) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32(int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeInt64(int i, long j) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeInt64List(int i, List<Long> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int i, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeMessage(int i, Object obj) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeMessageList(int i, List<?> list) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i, Object obj) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed32(int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed64(int i, long j) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed64List(int i, List<Long> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt32(int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt64(int i, long j) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt64List(int i, List<Long> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeStartGroup(int i) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeString(int i, String str) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeStringList(int i, List<String> list) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt32(int i, int i2) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt32List(int i, List<Integer> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt64(int i, long j) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt64List(int i, List<Long> list, boolean z) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeGroup(int i, Object obj, Schema schema) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeMessage(int i, Object obj, Schema schema) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeGroupList(int i, List<?> list, Schema schema) throws IOException {
    }

    @Override // com.google.protobuf.Writer
    public void writeMessageList(int i, List<?> list, Schema schema) throws IOException {
    }
}
