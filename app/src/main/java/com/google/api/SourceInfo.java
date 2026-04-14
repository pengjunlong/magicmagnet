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
public final class SourceInfo extends GeneratedMessageLite<SourceInfo, Builder> implements SourceInfoOrBuilder {
    private static final SourceInfo DEFAULT_INSTANCE = null;
    private static volatile Parser<SourceInfo> PARSER = null;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Any> sourceFiles_;

    /* renamed from: com.google.api.SourceInfo$1 */
    static /* synthetic */ class C05941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f88xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SourceInfo, Builder> implements SourceInfoOrBuilder {
        /* synthetic */ Builder(C05941 c05941) {
        }

        public Builder addAllSourceFiles(Iterable<? extends Any> iterable) {
        }

        public Builder addSourceFiles(Any any) {
        }

        public Builder clearSourceFiles() {
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public Any getSourceFiles(int i) {
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public int getSourceFilesCount() {
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public List<Any> getSourceFilesList() {
        }

        public Builder removeSourceFiles(int i) {
        }

        public Builder setSourceFiles(int i, Any any) {
        }

        private Builder() {
        }

        public Builder addSourceFiles(int i, Any any) {
        }

        public Builder setSourceFiles(int i, Any.Builder builder) {
        }

        public Builder addSourceFiles(Any.Builder builder) {
        }

        public Builder addSourceFiles(int i, Any.Builder builder) {
        }
    }

    private SourceInfo() {
    }

    static /* synthetic */ SourceInfo access$000() {
    }

    static /* synthetic */ void access$100(SourceInfo sourceInfo, int i, Any any) {
    }

    static /* synthetic */ void access$200(SourceInfo sourceInfo, Any any) {
    }

    static /* synthetic */ void access$300(SourceInfo sourceInfo, int i, Any any) {
    }

    static /* synthetic */ void access$400(SourceInfo sourceInfo, Iterable iterable) {
    }

    static /* synthetic */ void access$500(SourceInfo sourceInfo) {
    }

    static /* synthetic */ void access$600(SourceInfo sourceInfo, int i) {
    }

    private void addAllSourceFiles(Iterable<? extends Any> iterable) {
    }

    private void addSourceFiles(Any any) {
    }

    private void clearSourceFiles() {
    }

    private void ensureSourceFilesIsMutable() {
    }

    public static SourceInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<SourceInfo> parser() {
    }

    private void removeSourceFiles(int i) {
    }

    private void setSourceFiles(int i, Any any) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.SourceInfoOrBuilder
    public Any getSourceFiles(int i) {
    }

    @Override // com.google.api.SourceInfoOrBuilder
    public int getSourceFilesCount() {
    }

    @Override // com.google.api.SourceInfoOrBuilder
    public List<Any> getSourceFilesList() {
    }

    public AnyOrBuilder getSourceFilesOrBuilder(int i) {
    }

    public List<? extends AnyOrBuilder> getSourceFilesOrBuilderList() {
    }

    public static Builder newBuilder(SourceInfo sourceInfo) {
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addSourceFiles(int i, Any any) {
    }

    public static SourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SourceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static SourceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SourceInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static SourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
