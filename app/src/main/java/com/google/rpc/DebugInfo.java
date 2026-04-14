package com.google.rpc;

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
public final class DebugInfo extends GeneratedMessageLite<DebugInfo, Builder> implements DebugInfoOrBuilder {
    private static final DebugInfo DEFAULT_INSTANCE = null;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile Parser<DebugInfo> PARSER = null;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private String detail_;
    private Internal.ProtobufList<String> stackEntries_;

    /* renamed from: com.google.rpc.DebugInfo$1 */
    static /* synthetic */ class C13541 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f166xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DebugInfo, Builder> implements DebugInfoOrBuilder {
        /* synthetic */ Builder(C13541 c13541) {
        }

        public Builder addAllStackEntries(Iterable<String> iterable) {
        }

        public Builder addStackEntries(String str) {
        }

        public Builder addStackEntriesBytes(ByteString byteString) {
        }

        public Builder clearDetail() {
        }

        public Builder clearStackEntries() {
        }

        @Override // com.google.rpc.DebugInfoOrBuilder
        public String getDetail() {
        }

        @Override // com.google.rpc.DebugInfoOrBuilder
        public ByteString getDetailBytes() {
        }

        @Override // com.google.rpc.DebugInfoOrBuilder
        public String getStackEntries(int i) {
        }

        @Override // com.google.rpc.DebugInfoOrBuilder
        public ByteString getStackEntriesBytes(int i) {
        }

        @Override // com.google.rpc.DebugInfoOrBuilder
        public int getStackEntriesCount() {
        }

        @Override // com.google.rpc.DebugInfoOrBuilder
        public List<String> getStackEntriesList() {
        }

        public Builder setDetail(String str) {
        }

        public Builder setDetailBytes(ByteString byteString) {
        }

        public Builder setStackEntries(int i, String str) {
        }

        private Builder() {
        }
    }

    private DebugInfo() {
    }

    static /* synthetic */ DebugInfo access$000() {
    }

    static /* synthetic */ void access$100(DebugInfo debugInfo, int i, String str) {
    }

    static /* synthetic */ void access$200(DebugInfo debugInfo, String str) {
    }

    static /* synthetic */ void access$300(DebugInfo debugInfo, Iterable iterable) {
    }

    static /* synthetic */ void access$400(DebugInfo debugInfo) {
    }

    static /* synthetic */ void access$500(DebugInfo debugInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$600(DebugInfo debugInfo, String str) {
    }

    static /* synthetic */ void access$700(DebugInfo debugInfo) {
    }

    static /* synthetic */ void access$800(DebugInfo debugInfo, ByteString byteString) {
    }

    private void addAllStackEntries(Iterable<String> iterable) {
    }

    private void addStackEntries(String str) {
    }

    private void addStackEntriesBytes(ByteString byteString) {
    }

    private void clearDetail() {
    }

    private void clearStackEntries() {
    }

    private void ensureStackEntriesIsMutable() {
    }

    public static DebugInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static DebugInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<DebugInfo> parser() {
    }

    private void setDetail(String str) {
    }

    private void setDetailBytes(ByteString byteString) {
    }

    private void setStackEntries(int i, String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.DebugInfoOrBuilder
    public String getDetail() {
    }

    @Override // com.google.rpc.DebugInfoOrBuilder
    public ByteString getDetailBytes() {
    }

    @Override // com.google.rpc.DebugInfoOrBuilder
    public String getStackEntries(int i) {
    }

    @Override // com.google.rpc.DebugInfoOrBuilder
    public ByteString getStackEntriesBytes(int i) {
    }

    @Override // com.google.rpc.DebugInfoOrBuilder
    public int getStackEntriesCount() {
    }

    @Override // com.google.rpc.DebugInfoOrBuilder
    public List<String> getStackEntriesList() {
    }

    public static Builder newBuilder(DebugInfo debugInfo) {
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DebugInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DebugInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static DebugInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DebugInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static DebugInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DebugInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static DebugInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DebugInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static DebugInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
