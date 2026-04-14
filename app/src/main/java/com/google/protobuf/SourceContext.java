package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class SourceContext extends GeneratedMessageLite<SourceContext, Builder> implements SourceContextOrBuilder {
    private static final SourceContext DEFAULT_INSTANCE = null;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<SourceContext> PARSER;
    private String fileName_;

    /* renamed from: com.google.protobuf.SourceContext$1 */
    static /* synthetic */ class C13301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f157xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SourceContext, Builder> implements SourceContextOrBuilder {
        /* synthetic */ Builder(C13301 c13301) {
        }

        public Builder clearFileName() {
        }

        @Override // com.google.protobuf.SourceContextOrBuilder
        public String getFileName() {
        }

        @Override // com.google.protobuf.SourceContextOrBuilder
        public ByteString getFileNameBytes() {
        }

        public Builder setFileName(String str) {
        }

        public Builder setFileNameBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private SourceContext() {
    }

    static /* synthetic */ SourceContext access$000() {
    }

    static /* synthetic */ void access$100(SourceContext sourceContext, String str) {
    }

    static /* synthetic */ void access$200(SourceContext sourceContext) {
    }

    static /* synthetic */ void access$300(SourceContext sourceContext, ByteString byteString) {
    }

    private void clearFileName() {
    }

    public static SourceContext getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<SourceContext> parser() {
    }

    private void setFileName(String str) {
    }

    private void setFileNameBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.SourceContextOrBuilder
    public String getFileName() {
    }

    @Override // com.google.protobuf.SourceContextOrBuilder
    public ByteString getFileNameBytes() {
    }

    public static Builder newBuilder(SourceContext sourceContext) {
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SourceContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static SourceContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SourceContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static SourceContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SourceContext parseFrom(InputStream inputStream) throws IOException {
    }

    public static SourceContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SourceContext parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static SourceContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
