package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ListValue extends GeneratedMessageLite<ListValue, Builder> implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE = null;
    private static volatile Parser<ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_;

    /* renamed from: com.google.protobuf.ListValue$1 */
    static /* synthetic */ class C13161 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f153xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListValue, Builder> implements ListValueOrBuilder {
        /* synthetic */ Builder(C13161 c13161) {
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
        }

        public Builder addValues(Value value) {
        }

        public Builder clearValues() {
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public Value getValues(int i) {
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public int getValuesCount() {
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public List<Value> getValuesList() {
        }

        public Builder removeValues(int i) {
        }

        public Builder setValues(int i, Value value) {
        }

        private Builder() {
        }

        public Builder addValues(int i, Value value) {
        }

        public Builder setValues(int i, Value.Builder builder) {
        }

        public Builder addValues(Value.Builder builder) {
        }

        public Builder addValues(int i, Value.Builder builder) {
        }
    }

    private ListValue() {
    }

    static /* synthetic */ ListValue access$000() {
    }

    static /* synthetic */ void access$100(ListValue listValue, int i, Value value) {
    }

    static /* synthetic */ void access$200(ListValue listValue, Value value) {
    }

    static /* synthetic */ void access$300(ListValue listValue, int i, Value value) {
    }

    static /* synthetic */ void access$400(ListValue listValue, Iterable iterable) {
    }

    static /* synthetic */ void access$500(ListValue listValue) {
    }

    static /* synthetic */ void access$600(ListValue listValue, int i) {
    }

    private void addAllValues(Iterable<? extends Value> iterable) {
    }

    private void addValues(Value value) {
    }

    private void clearValues() {
    }

    private void ensureValuesIsMutable() {
    }

    public static ListValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ListValue> parser() {
    }

    private void removeValues(int i) {
    }

    private void setValues(int i, Value value) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public Value getValues(int i) {
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public int getValuesCount() {
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public List<Value> getValuesList() {
    }

    public ValueOrBuilder getValuesOrBuilder(int i) {
    }

    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
    }

    public static Builder newBuilder(ListValue listValue) {
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addValues(int i, Value value) {
    }

    public static ListValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ListValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static ListValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
