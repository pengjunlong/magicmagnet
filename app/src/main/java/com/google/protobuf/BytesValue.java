package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BytesValue extends GeneratedMessageLite<BytesValue, Builder> implements BytesValueOrBuilder {
    private static final BytesValue DEFAULT_INSTANCE = null;
    private static volatile Parser<BytesValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_;

    /* renamed from: com.google.protobuf.BytesValue$1 */
    static /* synthetic */ class C12841 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f141xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BytesValue, Builder> implements BytesValueOrBuilder {
        /* synthetic */ Builder(C12841 c12841) {
        }

        public Builder clearValue() {
        }

        @Override // com.google.protobuf.BytesValueOrBuilder
        public ByteString getValue() {
        }

        public Builder setValue(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private BytesValue() {
    }

    static /* synthetic */ BytesValue access$000() {
    }

    static /* synthetic */ void access$100(BytesValue bytesValue, ByteString byteString) {
    }

    static /* synthetic */ void access$200(BytesValue bytesValue) {
    }

    private void clearValue() {
    }

    public static BytesValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static BytesValue of(ByteString byteString) {
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<BytesValue> parser() {
    }

    private void setValue(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.BytesValueOrBuilder
    public ByteString getValue() {
    }

    public static Builder newBuilder(BytesValue bytesValue) {
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static BytesValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
