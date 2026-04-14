package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ErrorInfo extends GeneratedMessageLite<ErrorInfo, Builder> implements ErrorInfoOrBuilder {
    private static final ErrorInfo DEFAULT_INSTANCE = null;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<ErrorInfo> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private String domain_;
    private MapFieldLite<String, String> metadata_;
    private String reason_;

    /* renamed from: com.google.rpc.ErrorInfo$1 */
    static /* synthetic */ class C13551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f167xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ErrorInfo, Builder> implements ErrorInfoOrBuilder {
        /* synthetic */ Builder(C13551 c13551) {
        }

        public Builder clearDomain() {
        }

        public Builder clearMetadata() {
        }

        public Builder clearReason() {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public boolean containsMetadata(String str) {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public String getDomain() {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public ByteString getDomainBytes() {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        @Deprecated
        public Map<String, String> getMetadata() {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public int getMetadataCount() {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public Map<String, String> getMetadataMap() {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public String getMetadataOrDefault(String str, String str2) {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public String getMetadataOrThrow(String str) {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public String getReason() {
        }

        @Override // com.google.rpc.ErrorInfoOrBuilder
        public ByteString getReasonBytes() {
        }

        public Builder putAllMetadata(Map<String, String> map) {
        }

        public Builder putMetadata(String str, String str2) {
        }

        public Builder removeMetadata(String str) {
        }

        public Builder setDomain(String str) {
        }

        public Builder setDomainBytes(ByteString byteString) {
        }

        public Builder setReason(String str) {
        }

        public Builder setReasonBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private static final class MetadataDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry = null;

        private MetadataDefaultEntryHolder() {
        }
    }

    private ErrorInfo() {
    }

    static /* synthetic */ ErrorInfo access$000() {
    }

    static /* synthetic */ void access$100(ErrorInfo errorInfo, String str) {
    }

    static /* synthetic */ void access$200(ErrorInfo errorInfo) {
    }

    static /* synthetic */ void access$300(ErrorInfo errorInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$400(ErrorInfo errorInfo, String str) {
    }

    static /* synthetic */ void access$500(ErrorInfo errorInfo) {
    }

    static /* synthetic */ void access$600(ErrorInfo errorInfo, ByteString byteString) {
    }

    static /* synthetic */ Map access$700(ErrorInfo errorInfo) {
    }

    private void clearDomain() {
    }

    private void clearReason() {
    }

    public static ErrorInfo getDefaultInstance() {
    }

    private Map<String, String> getMutableMetadataMap() {
    }

    private MapFieldLite<String, String> internalGetMetadata() {
    }

    private MapFieldLite<String, String> internalGetMutableMetadata() {
    }

    public static Builder newBuilder() {
    }

    public static ErrorInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ErrorInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ErrorInfo> parser() {
    }

    private void setDomain(String str) {
    }

    private void setDomainBytes(ByteString byteString) {
    }

    private void setReason(String str) {
    }

    private void setReasonBytes(ByteString byteString) {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public boolean containsMetadata(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public String getDomain() {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public ByteString getDomainBytes() {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    @Deprecated
    public Map<String, String> getMetadata() {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public int getMetadataCount() {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public Map<String, String> getMetadataMap() {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public String getMetadataOrDefault(String str, String str2) {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public String getMetadataOrThrow(String str) {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public String getReason() {
    }

    @Override // com.google.rpc.ErrorInfoOrBuilder
    public ByteString getReasonBytes() {
    }

    public static Builder newBuilder(ErrorInfo errorInfo) {
    }

    public static ErrorInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ErrorInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ErrorInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static ErrorInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ErrorInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ErrorInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ErrorInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static ErrorInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ErrorInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ErrorInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
