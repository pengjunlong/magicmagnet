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
public final class ListOperationsRequest extends GeneratedMessageLite<ListOperationsRequest, Builder> implements ListOperationsRequestOrBuilder {
    private static final ListOperationsRequest DEFAULT_INSTANCE = null;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile Parser<ListOperationsRequest> PARSER;
    private String filter_;
    private String name_;
    private int pageSize_;
    private String pageToken_;

    /* renamed from: com.google.longrunning.ListOperationsRequest$1 */
    static /* synthetic */ class C12681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f133xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListOperationsRequest, Builder> implements ListOperationsRequestOrBuilder {
        /* synthetic */ Builder(C12681 c12681) {
        }

        public Builder clearFilter() {
        }

        public Builder clearName() {
        }

        public Builder clearPageSize() {
        }

        public Builder clearPageToken() {
        }

        @Override // com.google.longrunning.ListOperationsRequestOrBuilder
        public String getFilter() {
        }

        @Override // com.google.longrunning.ListOperationsRequestOrBuilder
        public ByteString getFilterBytes() {
        }

        @Override // com.google.longrunning.ListOperationsRequestOrBuilder
        public String getName() {
        }

        @Override // com.google.longrunning.ListOperationsRequestOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.longrunning.ListOperationsRequestOrBuilder
        public int getPageSize() {
        }

        @Override // com.google.longrunning.ListOperationsRequestOrBuilder
        public String getPageToken() {
        }

        @Override // com.google.longrunning.ListOperationsRequestOrBuilder
        public ByteString getPageTokenBytes() {
        }

        public Builder setFilter(String str) {
        }

        public Builder setFilterBytes(ByteString byteString) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setPageSize(int i) {
        }

        public Builder setPageToken(String str) {
        }

        public Builder setPageTokenBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private ListOperationsRequest() {
    }

    static /* synthetic */ ListOperationsRequest access$000() {
    }

    static /* synthetic */ void access$100(ListOperationsRequest listOperationsRequest, String str) {
    }

    static /* synthetic */ void access$1000(ListOperationsRequest listOperationsRequest) {
    }

    static /* synthetic */ void access$1100(ListOperationsRequest listOperationsRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$200(ListOperationsRequest listOperationsRequest) {
    }

    static /* synthetic */ void access$300(ListOperationsRequest listOperationsRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$400(ListOperationsRequest listOperationsRequest, String str) {
    }

    static /* synthetic */ void access$500(ListOperationsRequest listOperationsRequest) {
    }

    static /* synthetic */ void access$600(ListOperationsRequest listOperationsRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$700(ListOperationsRequest listOperationsRequest, int i) {
    }

    static /* synthetic */ void access$800(ListOperationsRequest listOperationsRequest) {
    }

    static /* synthetic */ void access$900(ListOperationsRequest listOperationsRequest, String str) {
    }

    private void clearFilter() {
    }

    private void clearName() {
    }

    private void clearPageSize() {
    }

    private void clearPageToken() {
    }

    public static ListOperationsRequest getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ListOperationsRequest> parser() {
    }

    private void setFilter(String str) {
    }

    private void setFilterBytes(ByteString byteString) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setPageSize(int i) {
    }

    private void setPageToken(String str) {
    }

    private void setPageTokenBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.longrunning.ListOperationsRequestOrBuilder
    public String getFilter() {
    }

    @Override // com.google.longrunning.ListOperationsRequestOrBuilder
    public ByteString getFilterBytes() {
    }

    @Override // com.google.longrunning.ListOperationsRequestOrBuilder
    public String getName() {
    }

    @Override // com.google.longrunning.ListOperationsRequestOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.longrunning.ListOperationsRequestOrBuilder
    public int getPageSize() {
    }

    @Override // com.google.longrunning.ListOperationsRequestOrBuilder
    public String getPageToken() {
    }

    @Override // com.google.longrunning.ListOperationsRequestOrBuilder
    public ByteString getPageTokenBytes() {
    }

    public static Builder newBuilder(ListOperationsRequest listOperationsRequest) {
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListOperationsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static ListOperationsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListOperationsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ListOperationsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream) throws IOException {
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ListOperationsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ListOperationsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
