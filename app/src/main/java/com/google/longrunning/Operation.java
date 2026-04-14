package com.google.longrunning;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Operation extends GeneratedMessageLite<Operation, Builder> implements OperationOrBuilder {
    private static final Operation DEFAULT_INSTANCE = null;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Operation> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private String name_;
    private int resultCase_;
    private Object result_;

    /* renamed from: com.google.longrunning.Operation$1 */
    static /* synthetic */ class C12701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f135xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Operation, Builder> implements OperationOrBuilder {
        /* synthetic */ Builder(C12701 c12701) {
        }

        public Builder clearDone() {
        }

        public Builder clearError() {
        }

        public Builder clearMetadata() {
        }

        public Builder clearName() {
        }

        public Builder clearResponse() {
        }

        public Builder clearResult() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public boolean getDone() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public Status getError() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public Any getMetadata() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public String getName() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public Any getResponse() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public ResultCase getResultCase() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public boolean hasError() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public boolean hasMetadata() {
        }

        @Override // com.google.longrunning.OperationOrBuilder
        public boolean hasResponse() {
        }

        public Builder mergeError(Status status) {
        }

        public Builder mergeMetadata(Any any) {
        }

        public Builder mergeResponse(Any any) {
        }

        public Builder setDone(boolean z) {
        }

        public Builder setError(Status status) {
        }

        public Builder setMetadata(Any any) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setResponse(Any any) {
        }

        private Builder() {
        }

        public Builder setError(Status.Builder builder) {
        }

        public Builder setMetadata(Any.Builder builder) {
        }

        public Builder setResponse(Any.Builder builder) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class ResultCase {
        private static final /* synthetic */ ResultCase[] $VALUES = null;
        public static final ResultCase ERROR = null;
        public static final ResultCase RESPONSE = null;
        public static final ResultCase RESULT_NOT_SET = null;
        private final int value;

        private ResultCase(String str, int i, int i2) {
        }

        public static ResultCase forNumber(int i) {
        }

        public static ResultCase valueOf(String str) {
        }

        public static ResultCase[] values() {
        }

        public int getNumber() {
        }

        @Deprecated
        public static ResultCase valueOf(int i) {
        }
    }

    private Operation() {
    }

    static /* synthetic */ Operation access$000() {
    }

    static /* synthetic */ void access$100(Operation operation) {
    }

    static /* synthetic */ void access$1000(Operation operation, Status status) {
    }

    static /* synthetic */ void access$1100(Operation operation, Status status) {
    }

    static /* synthetic */ void access$1200(Operation operation) {
    }

    static /* synthetic */ void access$1300(Operation operation, Any any) {
    }

    static /* synthetic */ void access$1400(Operation operation, Any any) {
    }

    static /* synthetic */ void access$1500(Operation operation) {
    }

    static /* synthetic */ void access$200(Operation operation, String str) {
    }

    static /* synthetic */ void access$300(Operation operation) {
    }

    static /* synthetic */ void access$400(Operation operation, ByteString byteString) {
    }

    static /* synthetic */ void access$500(Operation operation, Any any) {
    }

    static /* synthetic */ void access$600(Operation operation, Any any) {
    }

    static /* synthetic */ void access$700(Operation operation) {
    }

    static /* synthetic */ void access$800(Operation operation, boolean z) {
    }

    static /* synthetic */ void access$900(Operation operation) {
    }

    private void clearDone() {
    }

    private void clearError() {
    }

    private void clearMetadata() {
    }

    private void clearName() {
    }

    private void clearResponse() {
    }

    private void clearResult() {
    }

    public static Operation getDefaultInstance() {
    }

    private void mergeError(Status status) {
    }

    private void mergeMetadata(Any any) {
    }

    private void mergeResponse(Any any) {
    }

    public static Builder newBuilder() {
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Operation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Operation> parser() {
    }

    private void setDone(boolean z) {
    }

    private void setError(Status status) {
    }

    private void setMetadata(Any any) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setResponse(Any any) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public boolean getDone() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public Status getError() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public Any getMetadata() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public String getName() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public Any getResponse() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public ResultCase getResultCase() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public boolean hasError() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public boolean hasMetadata() {
    }

    @Override // com.google.longrunning.OperationOrBuilder
    public boolean hasResponse() {
    }

    public static Builder newBuilder(Operation operation) {
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Operation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Operation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Operation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Operation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Operation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Operation parseFrom(InputStream inputStream) throws IOException {
    }

    public static Operation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Operation parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Operation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
