package com.google.longrunning;

import com.google.longrunning.Operation;
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
public final class ListOperationsResponse extends GeneratedMessageLite<ListOperationsResponse, Builder> implements ListOperationsResponseOrBuilder {
    private static final ListOperationsResponse DEFAULT_INSTANCE = null;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<ListOperationsResponse> PARSER;
    private String nextPageToken_;
    private Internal.ProtobufList<Operation> operations_;

    /* renamed from: com.google.longrunning.ListOperationsResponse$1 */
    static /* synthetic */ class C12691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f134xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListOperationsResponse, Builder> implements ListOperationsResponseOrBuilder {
        /* synthetic */ Builder(C12691 c12691) {
        }

        public Builder addAllOperations(Iterable<? extends Operation> iterable) {
        }

        public Builder addOperations(Operation operation) {
        }

        public Builder clearNextPageToken() {
        }

        public Builder clearOperations() {
        }

        @Override // com.google.longrunning.ListOperationsResponseOrBuilder
        public String getNextPageToken() {
        }

        @Override // com.google.longrunning.ListOperationsResponseOrBuilder
        public ByteString getNextPageTokenBytes() {
        }

        @Override // com.google.longrunning.ListOperationsResponseOrBuilder
        public Operation getOperations(int i) {
        }

        @Override // com.google.longrunning.ListOperationsResponseOrBuilder
        public int getOperationsCount() {
        }

        @Override // com.google.longrunning.ListOperationsResponseOrBuilder
        public List<Operation> getOperationsList() {
        }

        public Builder removeOperations(int i) {
        }

        public Builder setNextPageToken(String str) {
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
        }

        public Builder setOperations(int i, Operation operation) {
        }

        private Builder() {
        }

        public Builder addOperations(int i, Operation operation) {
        }

        public Builder setOperations(int i, Operation.Builder builder) {
        }

        public Builder addOperations(Operation.Builder builder) {
        }

        public Builder addOperations(int i, Operation.Builder builder) {
        }
    }

    private ListOperationsResponse() {
    }

    static /* synthetic */ ListOperationsResponse access$000() {
    }

    static /* synthetic */ void access$100(ListOperationsResponse listOperationsResponse, int i, Operation operation) {
    }

    static /* synthetic */ void access$200(ListOperationsResponse listOperationsResponse, Operation operation) {
    }

    static /* synthetic */ void access$300(ListOperationsResponse listOperationsResponse, int i, Operation operation) {
    }

    static /* synthetic */ void access$400(ListOperationsResponse listOperationsResponse, Iterable iterable) {
    }

    static /* synthetic */ void access$500(ListOperationsResponse listOperationsResponse) {
    }

    static /* synthetic */ void access$600(ListOperationsResponse listOperationsResponse, int i) {
    }

    static /* synthetic */ void access$700(ListOperationsResponse listOperationsResponse, String str) {
    }

    static /* synthetic */ void access$800(ListOperationsResponse listOperationsResponse) {
    }

    static /* synthetic */ void access$900(ListOperationsResponse listOperationsResponse, ByteString byteString) {
    }

    private void addAllOperations(Iterable<? extends Operation> iterable) {
    }

    private void addOperations(Operation operation) {
    }

    private void clearNextPageToken() {
    }

    private void clearOperations() {
    }

    private void ensureOperationsIsMutable() {
    }

    public static ListOperationsResponse getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ListOperationsResponse> parser() {
    }

    private void removeOperations(int i) {
    }

    private void setNextPageToken(String str) {
    }

    private void setNextPageTokenBytes(ByteString byteString) {
    }

    private void setOperations(int i, Operation operation) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.longrunning.ListOperationsResponseOrBuilder
    public String getNextPageToken() {
    }

    @Override // com.google.longrunning.ListOperationsResponseOrBuilder
    public ByteString getNextPageTokenBytes() {
    }

    @Override // com.google.longrunning.ListOperationsResponseOrBuilder
    public Operation getOperations(int i) {
    }

    @Override // com.google.longrunning.ListOperationsResponseOrBuilder
    public int getOperationsCount() {
    }

    @Override // com.google.longrunning.ListOperationsResponseOrBuilder
    public List<Operation> getOperationsList() {
    }

    public OperationOrBuilder getOperationsOrBuilder(int i) {
    }

    public List<? extends OperationOrBuilder> getOperationsOrBuilderList() {
    }

    public static Builder newBuilder(ListOperationsResponse listOperationsResponse) {
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListOperationsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addOperations(int i, Operation operation) {
    }

    public static ListOperationsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListOperationsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ListOperationsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream) throws IOException {
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ListOperationsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ListOperationsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
