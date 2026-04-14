package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Any extends GeneratedMessageLite<Any, Builder> implements AnyOrBuilder {
    private static final Any DEFAULT_INSTANCE = null;
    private static volatile Parser<Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_;
    private ByteString value_;

    /* renamed from: com.google.protobuf.Any$1 */
    static /* synthetic */ class C12751 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f138xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Any, Builder> implements AnyOrBuilder {
        /* synthetic */ Builder(C12751 c12751) {
        }

        public Builder clearTypeUrl() {
        }

        public Builder clearValue() {
        }

        @Override // com.google.protobuf.AnyOrBuilder
        public String getTypeUrl() {
        }

        @Override // com.google.protobuf.AnyOrBuilder
        public ByteString getTypeUrlBytes() {
        }

        @Override // com.google.protobuf.AnyOrBuilder
        public ByteString getValue() {
        }

        public Builder setTypeUrl(String str) {
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
        }

        public Builder setValue(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private Any() {
    }

    static /* synthetic */ Any access$000() {
    }

    static /* synthetic */ void access$100(Any any, String str) {
    }

    static /* synthetic */ void access$200(Any any) {
    }

    static /* synthetic */ void access$300(Any any, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Any any, ByteString byteString) {
    }

    static /* synthetic */ void access$500(Any any) {
    }

    private void clearTypeUrl() {
    }

    private void clearValue() {
    }

    public static Any getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Any parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Any> parser() {
    }

    private void setTypeUrl(String str) {
    }

    private void setTypeUrlBytes(ByteString byteString) {
    }

    private void setValue(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.AnyOrBuilder
    public String getTypeUrl() {
    }

    @Override // com.google.protobuf.AnyOrBuilder
    public ByteString getTypeUrlBytes() {
    }

    @Override // com.google.protobuf.AnyOrBuilder
    public ByteString getValue() {
    }

    public static Builder newBuilder(Any any) {
    }

    public static Any parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Any parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
    }

    public static Any parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Any parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Any parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
