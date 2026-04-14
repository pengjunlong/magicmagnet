package com.google.longrunning;

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
public final class OperationInfo extends GeneratedMessageLite<OperationInfo, Builder> implements OperationInfoOrBuilder {
    private static final OperationInfo DEFAULT_INSTANCE = null;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<OperationInfo> PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String metadataType_;
    private String responseType_;

    /* renamed from: com.google.longrunning.OperationInfo$1 */
    static /* synthetic */ class C12711 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f136xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<OperationInfo, Builder> implements OperationInfoOrBuilder {
        /* synthetic */ Builder(C12711 c12711) {
        }

        public Builder clearMetadataType() {
        }

        public Builder clearResponseType() {
        }

        @Override // com.google.longrunning.OperationInfoOrBuilder
        public String getMetadataType() {
        }

        @Override // com.google.longrunning.OperationInfoOrBuilder
        public ByteString getMetadataTypeBytes() {
        }

        @Override // com.google.longrunning.OperationInfoOrBuilder
        public String getResponseType() {
        }

        @Override // com.google.longrunning.OperationInfoOrBuilder
        public ByteString getResponseTypeBytes() {
        }

        public Builder setMetadataType(String str) {
        }

        public Builder setMetadataTypeBytes(ByteString byteString) {
        }

        public Builder setResponseType(String str) {
        }

        public Builder setResponseTypeBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private OperationInfo() {
    }

    static /* synthetic */ OperationInfo access$000() {
    }

    static /* synthetic */ void access$100(OperationInfo operationInfo, String str) {
    }

    static /* synthetic */ void access$200(OperationInfo operationInfo) {
    }

    static /* synthetic */ void access$300(OperationInfo operationInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$400(OperationInfo operationInfo, String str) {
    }

    static /* synthetic */ void access$500(OperationInfo operationInfo) {
    }

    static /* synthetic */ void access$600(OperationInfo operationInfo, ByteString byteString) {
    }

    private void clearMetadataType() {
    }

    private void clearResponseType() {
    }

    public static OperationInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<OperationInfo> parser() {
    }

    private void setMetadataType(String str) {
    }

    private void setMetadataTypeBytes(ByteString byteString) {
    }

    private void setResponseType(String str) {
    }

    private void setResponseTypeBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.longrunning.OperationInfoOrBuilder
    public String getMetadataType() {
    }

    @Override // com.google.longrunning.OperationInfoOrBuilder
    public ByteString getMetadataTypeBytes() {
    }

    @Override // com.google.longrunning.OperationInfoOrBuilder
    public String getResponseType() {
    }

    @Override // com.google.longrunning.OperationInfoOrBuilder
    public ByteString getResponseTypeBytes() {
    }

    public static Builder newBuilder(OperationInfo operationInfo) {
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static OperationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static OperationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static OperationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static OperationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static OperationInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static OperationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static OperationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static OperationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
