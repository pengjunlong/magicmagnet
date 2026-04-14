package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class WaitOperationRequest extends GeneratedMessageLite<WaitOperationRequest, Builder> implements WaitOperationRequestOrBuilder {
    private static final WaitOperationRequest DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<WaitOperationRequest> PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private String name_;
    private Duration timeout_;

    /* renamed from: com.google.longrunning.WaitOperationRequest$1 */
    static /* synthetic */ class C12721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f137xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WaitOperationRequest, Builder> implements WaitOperationRequestOrBuilder {
        /* synthetic */ Builder(C12721 c12721) {
        }

        public Builder clearName() {
        }

        public Builder clearTimeout() {
        }

        @Override // com.google.longrunning.WaitOperationRequestOrBuilder
        public String getName() {
        }

        @Override // com.google.longrunning.WaitOperationRequestOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.longrunning.WaitOperationRequestOrBuilder
        public Duration getTimeout() {
        }

        @Override // com.google.longrunning.WaitOperationRequestOrBuilder
        public boolean hasTimeout() {
        }

        public Builder mergeTimeout(Duration duration) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setTimeout(Duration duration) {
        }

        private Builder() {
        }

        public Builder setTimeout(Duration.Builder builder) {
        }
    }

    private WaitOperationRequest() {
    }

    static /* synthetic */ WaitOperationRequest access$000() {
    }

    static /* synthetic */ void access$100(WaitOperationRequest waitOperationRequest, String str) {
    }

    static /* synthetic */ void access$200(WaitOperationRequest waitOperationRequest) {
    }

    static /* synthetic */ void access$300(WaitOperationRequest waitOperationRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$400(WaitOperationRequest waitOperationRequest, Duration duration) {
    }

    static /* synthetic */ void access$500(WaitOperationRequest waitOperationRequest, Duration duration) {
    }

    static /* synthetic */ void access$600(WaitOperationRequest waitOperationRequest) {
    }

    private void clearName() {
    }

    private void clearTimeout() {
    }

    public static WaitOperationRequest getDefaultInstance() {
    }

    private void mergeTimeout(Duration duration) {
    }

    public static Builder newBuilder() {
    }

    public static WaitOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static WaitOperationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<WaitOperationRequest> parser() {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setTimeout(Duration duration) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.longrunning.WaitOperationRequestOrBuilder
    public String getName() {
    }

    @Override // com.google.longrunning.WaitOperationRequestOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.longrunning.WaitOperationRequestOrBuilder
    public Duration getTimeout() {
    }

    @Override // com.google.longrunning.WaitOperationRequestOrBuilder
    public boolean hasTimeout() {
    }

    public static Builder newBuilder(WaitOperationRequest waitOperationRequest) {
    }

    public static WaitOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static WaitOperationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static WaitOperationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static WaitOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static WaitOperationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static WaitOperationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static WaitOperationRequest parseFrom(InputStream inputStream) throws IOException {
    }

    public static WaitOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static WaitOperationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static WaitOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
