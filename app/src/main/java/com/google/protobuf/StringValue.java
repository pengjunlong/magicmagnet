package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class StringValue extends GeneratedMessageLite<StringValue, Builder> implements StringValueOrBuilder {
    private static final StringValue DEFAULT_INSTANCE = null;
    private static volatile Parser<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_;

    /* renamed from: com.google.protobuf.StringValue$1 */
    static /* synthetic */ class C13311 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f158xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<StringValue, Builder> implements StringValueOrBuilder {
        /* synthetic */ Builder(C13311 c13311) {
        }

        public Builder clearValue() {
        }

        @Override // com.google.protobuf.StringValueOrBuilder
        public String getValue() {
        }

        @Override // com.google.protobuf.StringValueOrBuilder
        public ByteString getValueBytes() {
        }

        public Builder setValue(String str) {
        }

        public Builder setValueBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private StringValue() {
    }

    static /* synthetic */ StringValue access$000() {
    }

    static /* synthetic */ void access$100(StringValue stringValue, String str) {
    }

    static /* synthetic */ void access$200(StringValue stringValue) {
    }

    static /* synthetic */ void access$300(StringValue stringValue, ByteString byteString) {
    }

    private void clearValue() {
    }

    public static StringValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static StringValue of(String str) {
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<StringValue> parser() {
    }

    private void setValue(String str) {
    }

    private void setValueBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.StringValueOrBuilder
    public String getValue() {
    }

    @Override // com.google.protobuf.StringValueOrBuilder
    public ByteString getValueBytes() {
    }

    public static Builder newBuilder(StringValue stringValue) {
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static StringValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
