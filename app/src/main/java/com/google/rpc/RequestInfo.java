package com.google.rpc;

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
public final class RequestInfo extends GeneratedMessageLite<RequestInfo, Builder> implements RequestInfoOrBuilder {
    private static final RequestInfo DEFAULT_INSTANCE = null;
    private static volatile Parser<RequestInfo> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_;
    private String servingData_;

    /* renamed from: com.google.rpc.RequestInfo$1 */
    static /* synthetic */ class C13601 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f172xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RequestInfo, Builder> implements RequestInfoOrBuilder {
        /* synthetic */ Builder(C13601 c13601) {
        }

        public Builder clearRequestId() {
        }

        public Builder clearServingData() {
        }

        @Override // com.google.rpc.RequestInfoOrBuilder
        public String getRequestId() {
        }

        @Override // com.google.rpc.RequestInfoOrBuilder
        public ByteString getRequestIdBytes() {
        }

        @Override // com.google.rpc.RequestInfoOrBuilder
        public String getServingData() {
        }

        @Override // com.google.rpc.RequestInfoOrBuilder
        public ByteString getServingDataBytes() {
        }

        public Builder setRequestId(String str) {
        }

        public Builder setRequestIdBytes(ByteString byteString) {
        }

        public Builder setServingData(String str) {
        }

        public Builder setServingDataBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private RequestInfo() {
    }

    static /* synthetic */ RequestInfo access$000() {
    }

    static /* synthetic */ void access$100(RequestInfo requestInfo, String str) {
    }

    static /* synthetic */ void access$200(RequestInfo requestInfo) {
    }

    static /* synthetic */ void access$300(RequestInfo requestInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$400(RequestInfo requestInfo, String str) {
    }

    static /* synthetic */ void access$500(RequestInfo requestInfo) {
    }

    static /* synthetic */ void access$600(RequestInfo requestInfo, ByteString byteString) {
    }

    private void clearRequestId() {
    }

    private void clearServingData() {
    }

    public static RequestInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static RequestInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<RequestInfo> parser() {
    }

    private void setRequestId(String str) {
    }

    private void setRequestIdBytes(ByteString byteString) {
    }

    private void setServingData(String str) {
    }

    private void setServingDataBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.RequestInfoOrBuilder
    public String getRequestId() {
    }

    @Override // com.google.rpc.RequestInfoOrBuilder
    public ByteString getRequestIdBytes() {
    }

    @Override // com.google.rpc.RequestInfoOrBuilder
    public String getServingData() {
    }

    @Override // com.google.rpc.RequestInfoOrBuilder
    public ByteString getServingDataBytes() {
    }

    public static Builder newBuilder(RequestInfo requestInfo) {
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static RequestInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RequestInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static RequestInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RequestInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static RequestInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RequestInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static RequestInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static RequestInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static RequestInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
