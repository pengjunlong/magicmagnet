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
public final class CancelOperationRequest extends GeneratedMessageLite<CancelOperationRequest, Builder> implements CancelOperationRequestOrBuilder {
    private static final CancelOperationRequest DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<CancelOperationRequest> PARSER;
    private String name_;

    /* renamed from: com.google.longrunning.CancelOperationRequest$1 */
    static /* synthetic */ class C12651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f130xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CancelOperationRequest, Builder> implements CancelOperationRequestOrBuilder {
        /* synthetic */ Builder(C12651 c12651) {
        }

        public Builder clearName() {
        }

        @Override // com.google.longrunning.CancelOperationRequestOrBuilder
        public String getName() {
        }

        @Override // com.google.longrunning.CancelOperationRequestOrBuilder
        public ByteString getNameBytes() {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private CancelOperationRequest() {
    }

    static /* synthetic */ CancelOperationRequest access$000() {
    }

    static /* synthetic */ void access$100(CancelOperationRequest cancelOperationRequest, String str) {
    }

    static /* synthetic */ void access$200(CancelOperationRequest cancelOperationRequest) {
    }

    static /* synthetic */ void access$300(CancelOperationRequest cancelOperationRequest, ByteString byteString) {
    }

    private void clearName() {
    }

    public static CancelOperationRequest getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static CancelOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static CancelOperationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<CancelOperationRequest> parser() {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.longrunning.CancelOperationRequestOrBuilder
    public String getName() {
    }

    @Override // com.google.longrunning.CancelOperationRequestOrBuilder
    public ByteString getNameBytes() {
    }

    public static Builder newBuilder(CancelOperationRequest cancelOperationRequest) {
    }

    public static CancelOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static CancelOperationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CancelOperationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static CancelOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CancelOperationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static CancelOperationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CancelOperationRequest parseFrom(InputStream inputStream) throws IOException {
    }

    public static CancelOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static CancelOperationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static CancelOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
