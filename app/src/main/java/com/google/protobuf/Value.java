package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE = null;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_;
    private Object kind_;

    /* renamed from: com.google.protobuf.Value$1 */
    static /* synthetic */ class C13431 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f164xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        /* synthetic */ Builder(C13431 c13431) {
        }

        public Builder clearBoolValue() {
        }

        public Builder clearKind() {
        }

        public Builder clearListValue() {
        }

        public Builder clearNullValue() {
        }

        public Builder clearNumberValue() {
        }

        public Builder clearStringValue() {
        }

        public Builder clearStructValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public KindCase getKindCase() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public ListValue getListValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public NullValue getNullValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public int getNullValueValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public double getNumberValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public String getStringValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public ByteString getStringValueBytes() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public Struct getStructValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasListValue() {
        }

        @Override // com.google.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
        }

        public Builder mergeListValue(ListValue listValue) {
        }

        public Builder mergeStructValue(Struct struct) {
        }

        public Builder setBoolValue(boolean z) {
        }

        public Builder setListValue(ListValue listValue) {
        }

        public Builder setNullValue(NullValue nullValue) {
        }

        public Builder setNullValueValue(int i) {
        }

        public Builder setNumberValue(double d) {
        }

        public Builder setStringValue(String str) {
        }

        public Builder setStringValueBytes(ByteString byteString) {
        }

        public Builder setStructValue(Struct struct) {
        }

        private Builder() {
        }

        public Builder setListValue(ListValue.Builder builder) {
        }

        public Builder setStructValue(Struct.Builder builder) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class KindCase {
        private static final /* synthetic */ KindCase[] $VALUES = null;
        public static final KindCase BOOL_VALUE = null;
        public static final KindCase KIND_NOT_SET = null;
        public static final KindCase LIST_VALUE = null;
        public static final KindCase NULL_VALUE = null;
        public static final KindCase NUMBER_VALUE = null;
        public static final KindCase STRING_VALUE = null;
        public static final KindCase STRUCT_VALUE = null;
        private final int value;

        private KindCase(String str, int i, int i2) {
        }

        public static KindCase forNumber(int i) {
        }

        public static KindCase valueOf(String str) {
        }

        public static KindCase[] values() {
        }

        public int getNumber() {
        }

        @Deprecated
        public static KindCase valueOf(int i) {
        }
    }

    private Value() {
    }

    static /* synthetic */ Value access$000() {
    }

    static /* synthetic */ void access$100(Value value) {
    }

    static /* synthetic */ void access$1000(Value value, boolean z) {
    }

    static /* synthetic */ void access$1100(Value value) {
    }

    static /* synthetic */ void access$1200(Value value, Struct struct) {
    }

    static /* synthetic */ void access$1300(Value value, Struct struct) {
    }

    static /* synthetic */ void access$1400(Value value) {
    }

    static /* synthetic */ void access$1500(Value value, ListValue listValue) {
    }

    static /* synthetic */ void access$1600(Value value, ListValue listValue) {
    }

    static /* synthetic */ void access$1700(Value value) {
    }

    static /* synthetic */ void access$200(Value value, int i) {
    }

    static /* synthetic */ void access$300(Value value, NullValue nullValue) {
    }

    static /* synthetic */ void access$400(Value value) {
    }

    static /* synthetic */ void access$500(Value value, double d) {
    }

    static /* synthetic */ void access$600(Value value) {
    }

    static /* synthetic */ void access$700(Value value, String str) {
    }

    static /* synthetic */ void access$800(Value value) {
    }

    static /* synthetic */ void access$900(Value value, ByteString byteString) {
    }

    private void clearBoolValue() {
    }

    private void clearKind() {
    }

    private void clearListValue() {
    }

    private void clearNullValue() {
    }

    private void clearNumberValue() {
    }

    private void clearStringValue() {
    }

    private void clearStructValue() {
    }

    public static Value getDefaultInstance() {
    }

    private void mergeListValue(ListValue listValue) {
    }

    private void mergeStructValue(Struct struct) {
    }

    public static Builder newBuilder() {
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Value> parser() {
    }

    private void setBoolValue(boolean z) {
    }

    private void setListValue(ListValue listValue) {
    }

    private void setNullValue(NullValue nullValue) {
    }

    private void setNullValueValue(int i) {
    }

    private void setNumberValue(double d) {
    }

    private void setStringValue(String str) {
    }

    private void setStringValueBytes(ByteString byteString) {
    }

    private void setStructValue(Struct struct) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public KindCase getKindCase() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public ListValue getListValue() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public NullValue getNullValue() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public int getNullValueValue() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public double getNumberValue() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public String getStringValue() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public ByteString getStringValueBytes() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public Struct getStructValue() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasListValue() {
    }

    @Override // com.google.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
    }

    public static Builder newBuilder(Value value) {
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
