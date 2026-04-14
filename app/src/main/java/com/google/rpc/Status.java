package com.google.rpc;

import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
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
public final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE = null;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Status> PARSER;
    private int code_;
    private Internal.ProtobufList<Any> details_;
    private String message_;

    /* renamed from: com.google.rpc.Status$1 */
    static /* synthetic */ class C13631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f175xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Status, Builder> implements StatusOrBuilder {
        /* synthetic */ Builder(C13631 c13631) {
        }

        public Builder addAllDetails(Iterable<? extends Any> iterable) {
        }

        public Builder addDetails(Any any) {
        }

        public Builder clearCode() {
        }

        public Builder clearDetails() {
        }

        public Builder clearMessage() {
        }

        @Override // com.google.rpc.StatusOrBuilder
        public int getCode() {
        }

        @Override // com.google.rpc.StatusOrBuilder
        public Any getDetails(int i) {
        }

        @Override // com.google.rpc.StatusOrBuilder
        public int getDetailsCount() {
        }

        @Override // com.google.rpc.StatusOrBuilder
        public List<Any> getDetailsList() {
        }

        @Override // com.google.rpc.StatusOrBuilder
        public String getMessage() {
        }

        @Override // com.google.rpc.StatusOrBuilder
        public ByteString getMessageBytes() {
        }

        public Builder removeDetails(int i) {
        }

        public Builder setCode(int i) {
        }

        public Builder setDetails(int i, Any any) {
        }

        public Builder setMessage(String str) {
        }

        public Builder setMessageBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addDetails(int i, Any any) {
        }

        public Builder setDetails(int i, Any.Builder builder) {
        }

        public Builder addDetails(Any.Builder builder) {
        }

        public Builder addDetails(int i, Any.Builder builder) {
        }
    }

    private Status() {
    }

    static /* synthetic */ Status access$000() {
    }

    static /* synthetic */ void access$100(Status status, int i) {
    }

    static /* synthetic */ void access$1000(Status status) {
    }

    static /* synthetic */ void access$1100(Status status, int i) {
    }

    static /* synthetic */ void access$200(Status status) {
    }

    static /* synthetic */ void access$300(Status status, String str) {
    }

    static /* synthetic */ void access$400(Status status) {
    }

    static /* synthetic */ void access$500(Status status, ByteString byteString) {
    }

    static /* synthetic */ void access$600(Status status, int i, Any any) {
    }

    static /* synthetic */ void access$700(Status status, Any any) {
    }

    static /* synthetic */ void access$800(Status status, int i, Any any) {
    }

    static /* synthetic */ void access$900(Status status, Iterable iterable) {
    }

    private void addAllDetails(Iterable<? extends Any> iterable) {
    }

    private void addDetails(Any any) {
    }

    private void clearCode() {
    }

    private void clearDetails() {
    }

    private void clearMessage() {
    }

    private void ensureDetailsIsMutable() {
    }

    public static Status getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Status> parser() {
    }

    private void removeDetails(int i) {
    }

    private void setCode(int i) {
    }

    private void setDetails(int i, Any any) {
    }

    private void setMessage(String str) {
    }

    private void setMessageBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.StatusOrBuilder
    public int getCode() {
    }

    @Override // com.google.rpc.StatusOrBuilder
    public Any getDetails(int i) {
    }

    @Override // com.google.rpc.StatusOrBuilder
    public int getDetailsCount() {
    }

    @Override // com.google.rpc.StatusOrBuilder
    public List<Any> getDetailsList() {
    }

    public AnyOrBuilder getDetailsOrBuilder(int i) {
    }

    public List<? extends AnyOrBuilder> getDetailsOrBuilderList() {
    }

    @Override // com.google.rpc.StatusOrBuilder
    public String getMessage() {
    }

    @Override // com.google.rpc.StatusOrBuilder
    public ByteString getMessageBytes() {
    }

    public static Builder newBuilder(Status status) {
    }

    public static Status parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Status parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addDetails(int i, Any any) {
    }

    public static Status parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Status parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
    }

    public static Status parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Status parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Status parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
