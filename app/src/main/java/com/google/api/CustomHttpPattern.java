package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CustomHttpPattern extends GeneratedMessageLite<CustomHttpPattern, Builder> implements CustomHttpPatternOrBuilder {
    private static final CustomHttpPattern DEFAULT_INSTANCE = null;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile Parser<CustomHttpPattern> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_;
    private String path_;

    /* renamed from: com.google.api.CustomHttpPattern$1 */
    static /* synthetic */ class C05591 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f60xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CustomHttpPattern, Builder> implements CustomHttpPatternOrBuilder {
        /* synthetic */ Builder(C05591 c05591) {
        }

        public Builder clearKind() {
        }

        public Builder clearPath() {
        }

        @Override // com.google.api.CustomHttpPatternOrBuilder
        public String getKind() {
        }

        @Override // com.google.api.CustomHttpPatternOrBuilder
        public ByteString getKindBytes() {
        }

        @Override // com.google.api.CustomHttpPatternOrBuilder
        public String getPath() {
        }

        @Override // com.google.api.CustomHttpPatternOrBuilder
        public ByteString getPathBytes() {
        }

        public Builder setKind(String str) {
        }

        public Builder setKindBytes(ByteString byteString) {
        }

        public Builder setPath(String str) {
        }

        public Builder setPathBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private CustomHttpPattern() {
    }

    static /* synthetic */ CustomHttpPattern access$000() {
    }

    static /* synthetic */ void access$100(CustomHttpPattern customHttpPattern, String str) {
    }

    static /* synthetic */ void access$200(CustomHttpPattern customHttpPattern) {
    }

    static /* synthetic */ void access$300(CustomHttpPattern customHttpPattern, ByteString byteString) {
    }

    static /* synthetic */ void access$400(CustomHttpPattern customHttpPattern, String str) {
    }

    static /* synthetic */ void access$500(CustomHttpPattern customHttpPattern) {
    }

    static /* synthetic */ void access$600(CustomHttpPattern customHttpPattern, ByteString byteString) {
    }

    private void clearKind() {
    }

    private void clearPath() {
    }

    public static CustomHttpPattern getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<CustomHttpPattern> parser() {
    }

    private void setKind(String str) {
    }

    private void setKindBytes(ByteString byteString) {
    }

    private void setPath(String str) {
    }

    private void setPathBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.CustomHttpPatternOrBuilder
    public String getKind() {
    }

    @Override // com.google.api.CustomHttpPatternOrBuilder
    public ByteString getKindBytes() {
    }

    @Override // com.google.api.CustomHttpPatternOrBuilder
    public String getPath() {
    }

    @Override // com.google.api.CustomHttpPatternOrBuilder
    public ByteString getPathBytes() {
    }

    public static Builder newBuilder(CustomHttpPattern customHttpPattern) {
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CustomHttpPattern parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static CustomHttpPattern parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CustomHttpPattern parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static CustomHttpPattern parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream) throws IOException {
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static CustomHttpPattern parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static CustomHttpPattern parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
