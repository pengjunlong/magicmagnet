package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<Struct> PARSER;
    private MapFieldLite<String, Value> fields_;

    /* renamed from: com.google.protobuf.Struct$1 */
    static /* synthetic */ class C13321 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f159xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements StructOrBuilder {
        /* synthetic */ Builder(C13321 c13321) {
        }

        public Builder clearFields() {
        }

        @Override // com.google.protobuf.StructOrBuilder
        public boolean containsFields(String str) {
        }

        @Override // com.google.protobuf.StructOrBuilder
        @Deprecated
        public Map<String, Value> getFields() {
        }

        @Override // com.google.protobuf.StructOrBuilder
        public int getFieldsCount() {
        }

        @Override // com.google.protobuf.StructOrBuilder
        public Map<String, Value> getFieldsMap() {
        }

        @Override // com.google.protobuf.StructOrBuilder
        public Value getFieldsOrDefault(String str, Value value) {
        }

        @Override // com.google.protobuf.StructOrBuilder
        public Value getFieldsOrThrow(String str) {
        }

        public Builder putAllFields(Map<String, Value> map) {
        }

        public Builder putFields(String str, Value value) {
        }

        public Builder removeFields(String str) {
        }

        private Builder() {
        }
    }

    private static final class FieldsDefaultEntryHolder {
        static final MapEntryLite<String, Value> defaultEntry = null;

        private FieldsDefaultEntryHolder() {
        }
    }

    private Struct() {
    }

    static /* synthetic */ Struct access$000() {
    }

    static /* synthetic */ Map access$100(Struct struct) {
    }

    public static Struct getDefaultInstance() {
    }

    private Map<String, Value> getMutableFieldsMap() {
    }

    private MapFieldLite<String, Value> internalGetFields() {
    }

    private MapFieldLite<String, Value> internalGetMutableFields() {
    }

    public static Builder newBuilder() {
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Struct> parser() {
    }

    @Override // com.google.protobuf.StructOrBuilder
    public boolean containsFields(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.StructOrBuilder
    @Deprecated
    public Map<String, Value> getFields() {
    }

    @Override // com.google.protobuf.StructOrBuilder
    public int getFieldsCount() {
    }

    @Override // com.google.protobuf.StructOrBuilder
    public Map<String, Value> getFieldsMap() {
    }

    @Override // com.google.protobuf.StructOrBuilder
    public Value getFieldsOrDefault(String str, Value value) {
    }

    @Override // com.google.protobuf.StructOrBuilder
    public Value getFieldsOrThrow(String str) {
    }

    public static Builder newBuilder(Struct struct) {
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
    }

    public static Struct parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Struct parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Struct parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
