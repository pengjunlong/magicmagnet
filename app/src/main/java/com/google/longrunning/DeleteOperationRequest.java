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
public final class DeleteOperationRequest extends GeneratedMessageLite<DeleteOperationRequest, Builder> implements DeleteOperationRequestOrBuilder {
    private static final DeleteOperationRequest DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<DeleteOperationRequest> PARSER;
    private String name_;

    /* renamed from: com.google.longrunning.DeleteOperationRequest$1 */
    static /* synthetic */ class C12661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f131xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DeleteOperationRequest, Builder> implements DeleteOperationRequestOrBuilder {
        /* synthetic */ Builder(C12661 c12661) {
        }

        public Builder clearName() {
        }

        @Override // com.google.longrunning.DeleteOperationRequestOrBuilder
        public String getName() {
        }

        @Override // com.google.longrunning.DeleteOperationRequestOrBuilder
        public ByteString getNameBytes() {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private DeleteOperationRequest() {
    }

    static /* synthetic */ DeleteOperationRequest access$000() {
    }

    static /* synthetic */ void access$100(DeleteOperationRequest deleteOperationRequest, String str) {
    }

    static /* synthetic */ void access$200(DeleteOperationRequest deleteOperationRequest) {
    }

    static /* synthetic */ void access$300(DeleteOperationRequest deleteOperationRequest, ByteString byteString) {
    }

    private void clearName() {
    }

    public static DeleteOperationRequest getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static DeleteOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static DeleteOperationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<DeleteOperationRequest> parser() {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.longrunning.DeleteOperationRequestOrBuilder
    public String getName() {
    }

    @Override // com.google.longrunning.DeleteOperationRequestOrBuilder
    public ByteString getNameBytes() {
    }

    public static Builder newBuilder(DeleteOperationRequest deleteOperationRequest) {
    }

    public static DeleteOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DeleteOperationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DeleteOperationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static DeleteOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DeleteOperationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static DeleteOperationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DeleteOperationRequest parseFrom(InputStream inputStream) throws IOException {
    }

    public static DeleteOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DeleteOperationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static DeleteOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
