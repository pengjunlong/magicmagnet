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
public final class GetOperationRequest extends GeneratedMessageLite<GetOperationRequest, Builder> implements GetOperationRequestOrBuilder {
    private static final GetOperationRequest DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GetOperationRequest> PARSER;
    private String name_;

    /* renamed from: com.google.longrunning.GetOperationRequest$1 */
    static /* synthetic */ class C12671 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f132xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<GetOperationRequest, Builder> implements GetOperationRequestOrBuilder {
        /* synthetic */ Builder(C12671 c12671) {
        }

        public Builder clearName() {
        }

        @Override // com.google.longrunning.GetOperationRequestOrBuilder
        public String getName() {
        }

        @Override // com.google.longrunning.GetOperationRequestOrBuilder
        public ByteString getNameBytes() {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private GetOperationRequest() {
    }

    static /* synthetic */ GetOperationRequest access$000() {
    }

    static /* synthetic */ void access$100(GetOperationRequest getOperationRequest, String str) {
    }

    static /* synthetic */ void access$200(GetOperationRequest getOperationRequest) {
    }

    static /* synthetic */ void access$300(GetOperationRequest getOperationRequest, ByteString byteString) {
    }

    private void clearName() {
    }

    public static GetOperationRequest getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static GetOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static GetOperationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<GetOperationRequest> parser() {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.longrunning.GetOperationRequestOrBuilder
    public String getName() {
    }

    @Override // com.google.longrunning.GetOperationRequestOrBuilder
    public ByteString getNameBytes() {
    }

    public static Builder newBuilder(GetOperationRequest getOperationRequest) {
    }

    public static GetOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static GetOperationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GetOperationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static GetOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GetOperationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static GetOperationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GetOperationRequest parseFrom(InputStream inputStream) throws IOException {
    }

    public static GetOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static GetOperationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static GetOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
