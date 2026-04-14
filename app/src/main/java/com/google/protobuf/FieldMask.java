package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FieldMask extends GeneratedMessageLite<FieldMask, Builder> implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE = null;
    private static volatile Parser<FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> paths_;

    /* renamed from: com.google.protobuf.FieldMask$1 */
    static /* synthetic */ class C13061 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f149xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<FieldMask, Builder> implements FieldMaskOrBuilder {
        /* synthetic */ Builder(C13061 c13061) {
        }

        public Builder addAllPaths(Iterable<String> iterable) {
        }

        public Builder addPaths(String str) {
        }

        public Builder addPathsBytes(ByteString byteString) {
        }

        public Builder clearPaths() {
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public String getPaths(int i) {
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public ByteString getPathsBytes(int i) {
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
        }

        @Override // com.google.protobuf.FieldMaskOrBuilder
        public List<String> getPathsList() {
        }

        public Builder setPaths(int i, String str) {
        }

        private Builder() {
        }
    }

    private FieldMask() {
    }

    static /* synthetic */ FieldMask access$000() {
    }

    static /* synthetic */ void access$100(FieldMask fieldMask, int i, String str) {
    }

    static /* synthetic */ void access$200(FieldMask fieldMask, String str) {
    }

    static /* synthetic */ void access$300(FieldMask fieldMask, Iterable iterable) {
    }

    static /* synthetic */ void access$400(FieldMask fieldMask) {
    }

    static /* synthetic */ void access$500(FieldMask fieldMask, ByteString byteString) {
    }

    private void addAllPaths(Iterable<String> iterable) {
    }

    private void addPaths(String str) {
    }

    private void addPathsBytes(ByteString byteString) {
    }

    private void clearPaths() {
    }

    private void ensurePathsIsMutable() {
    }

    public static FieldMask getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<FieldMask> parser() {
    }

    private void setPaths(int i, String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public String getPaths(int i) {
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public ByteString getPathsBytes(int i) {
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
    }

    @Override // com.google.protobuf.FieldMaskOrBuilder
    public List<String> getPathsList() {
    }

    public static Builder newBuilder(FieldMask fieldMask) {
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
    }

    public static FieldMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
