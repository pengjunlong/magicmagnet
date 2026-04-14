package com.google.cloud.audit;

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
public final class RequestMetadata extends GeneratedMessageLite<RequestMetadata, Builder> implements RequestMetadataOrBuilder {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final RequestMetadata DEFAULT_INSTANCE = null;
    private static volatile Parser<RequestMetadata> PARSER;
    private String callerIp_;
    private String callerSuppliedUserAgent_;

    /* renamed from: com.google.cloud.audit.RequestMetadata$1 */
    static /* synthetic */ class C06031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f97xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RequestMetadata, Builder> implements RequestMetadataOrBuilder {
        /* synthetic */ Builder(C06031 c06031) {
        }

        public Builder clearCallerIp() {
        }

        public Builder clearCallerSuppliedUserAgent() {
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public String getCallerIp() {
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public ByteString getCallerIpBytes() {
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public String getCallerSuppliedUserAgent() {
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public ByteString getCallerSuppliedUserAgentBytes() {
        }

        public Builder setCallerIp(String str) {
        }

        public Builder setCallerIpBytes(ByteString byteString) {
        }

        public Builder setCallerSuppliedUserAgent(String str) {
        }

        public Builder setCallerSuppliedUserAgentBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private RequestMetadata() {
    }

    static /* synthetic */ RequestMetadata access$000() {
    }

    static /* synthetic */ void access$100(RequestMetadata requestMetadata, String str) {
    }

    static /* synthetic */ void access$200(RequestMetadata requestMetadata) {
    }

    static /* synthetic */ void access$300(RequestMetadata requestMetadata, ByteString byteString) {
    }

    static /* synthetic */ void access$400(RequestMetadata requestMetadata, String str) {
    }

    static /* synthetic */ void access$500(RequestMetadata requestMetadata) {
    }

    static /* synthetic */ void access$600(RequestMetadata requestMetadata, ByteString byteString) {
    }

    private void clearCallerIp() {
    }

    private void clearCallerSuppliedUserAgent() {
    }

    public static RequestMetadata getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<RequestMetadata> parser() {
    }

    private void setCallerIp(String str) {
    }

    private void setCallerIpBytes(ByteString byteString) {
    }

    private void setCallerSuppliedUserAgent(String str) {
    }

    private void setCallerSuppliedUserAgentBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public String getCallerIp() {
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public ByteString getCallerIpBytes() {
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public String getCallerSuppliedUserAgent() {
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public ByteString getCallerSuppliedUserAgentBytes() {
    }

    public static Builder newBuilder(RequestMetadata requestMetadata) {
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RequestMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static RequestMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RequestMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static RequestMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RequestMetadata parseFrom(InputStream inputStream) throws IOException {
    }

    public static RequestMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
