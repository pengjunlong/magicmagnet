package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class HttpBody extends GeneratedMessageLite<HttpBody, Builder> implements HttpBodyOrBuilder {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final HttpBody DEFAULT_INSTANCE = null;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile Parser<HttpBody> PARSER;
    private String contentType_;
    private ByteString data_;
    private Internal.ProtobufList<Any> extensions_;

    /* renamed from: com.google.api.HttpBody$1 */
    static /* synthetic */ class C05661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f66xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HttpBody, Builder> implements HttpBodyOrBuilder {
        /* synthetic */ Builder(C05661 c05661) {
        }

        public Builder addAllExtensions(Iterable<? extends Any> iterable) {
        }

        public Builder addExtensions(Any any) {
        }

        public Builder clearContentType() {
        }

        public Builder clearData() {
        }

        public Builder clearExtensions() {
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public String getContentType() {
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public ByteString getContentTypeBytes() {
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public ByteString getData() {
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public Any getExtensions(int i) {
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public int getExtensionsCount() {
        }

        @Override // com.google.api.HttpBodyOrBuilder
        public List<Any> getExtensionsList() {
        }

        public Builder removeExtensions(int i) {
        }

        public Builder setContentType(String str) {
        }

        public Builder setContentTypeBytes(ByteString byteString) {
        }

        public Builder setData(ByteString byteString) {
        }

        public Builder setExtensions(int i, Any any) {
        }

        private Builder() {
        }

        public Builder addExtensions(int i, Any any) {
        }

        public Builder setExtensions(int i, Any.Builder builder) {
        }

        public Builder addExtensions(Any.Builder builder) {
        }

        public Builder addExtensions(int i, Any.Builder builder) {
        }
    }

    private HttpBody() {
    }

    static /* synthetic */ HttpBody access$000() {
    }

    static /* synthetic */ void access$100(HttpBody httpBody, String str) {
    }

    static /* synthetic */ void access$1000(HttpBody httpBody) {
    }

    static /* synthetic */ void access$1100(HttpBody httpBody, int i) {
    }

    static /* synthetic */ void access$200(HttpBody httpBody) {
    }

    static /* synthetic */ void access$300(HttpBody httpBody, ByteString byteString) {
    }

    static /* synthetic */ void access$400(HttpBody httpBody, ByteString byteString) {
    }

    static /* synthetic */ void access$500(HttpBody httpBody) {
    }

    static /* synthetic */ void access$600(HttpBody httpBody, int i, Any any) {
    }

    static /* synthetic */ void access$700(HttpBody httpBody, Any any) {
    }

    static /* synthetic */ void access$800(HttpBody httpBody, int i, Any any) {
    }

    static /* synthetic */ void access$900(HttpBody httpBody, Iterable iterable) {
    }

    private void addAllExtensions(Iterable<? extends Any> iterable) {
    }

    private void addExtensions(Any any) {
    }

    private void clearContentType() {
    }

    private void clearData() {
    }

    private void clearExtensions() {
    }

    private void ensureExtensionsIsMutable() {
    }

    public static HttpBody getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<HttpBody> parser() {
    }

    private void removeExtensions(int i) {
    }

    private void setContentType(String str) {
    }

    private void setContentTypeBytes(ByteString byteString) {
    }

    private void setData(ByteString byteString) {
    }

    private void setExtensions(int i, Any any) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public String getContentType() {
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public ByteString getContentTypeBytes() {
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public ByteString getData() {
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public Any getExtensions(int i) {
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public int getExtensionsCount() {
    }

    @Override // com.google.api.HttpBodyOrBuilder
    public List<Any> getExtensionsList() {
    }

    public AnyOrBuilder getExtensionsOrBuilder(int i) {
    }

    public List<? extends AnyOrBuilder> getExtensionsOrBuilderList() {
    }

    public static Builder newBuilder(HttpBody httpBody) {
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addExtensions(int i, Any any) {
    }

    public static HttpBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static HttpBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpBody parseFrom(InputStream inputStream) throws IOException {
    }

    public static HttpBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static HttpBody parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static HttpBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
