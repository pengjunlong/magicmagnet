package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BadRequest extends GeneratedMessageLite<BadRequest, Builder> implements BadRequestOrBuilder {
    private static final BadRequest DEFAULT_INSTANCE = null;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<BadRequest> PARSER;
    private Internal.ProtobufList<FieldViolation> fieldViolations_;

    /* renamed from: com.google.rpc.BadRequest$1 */
    static /* synthetic */ class C13521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f165xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BadRequest, Builder> implements BadRequestOrBuilder {
        /* synthetic */ Builder(C13521 c13521) {
        }

        public Builder addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
        }

        public Builder addFieldViolations(FieldViolation fieldViolation) {
        }

        public Builder clearFieldViolations() {
        }

        @Override // com.google.rpc.BadRequestOrBuilder
        public FieldViolation getFieldViolations(int i) {
        }

        @Override // com.google.rpc.BadRequestOrBuilder
        public int getFieldViolationsCount() {
        }

        @Override // com.google.rpc.BadRequestOrBuilder
        public List<FieldViolation> getFieldViolationsList() {
        }

        public Builder removeFieldViolations(int i) {
        }

        public Builder setFieldViolations(int i, FieldViolation fieldViolation) {
        }

        private Builder() {
        }

        public Builder addFieldViolations(int i, FieldViolation fieldViolation) {
        }

        public Builder setFieldViolations(int i, FieldViolation.Builder builder) {
        }

        public Builder addFieldViolations(FieldViolation.Builder builder) {
        }

        public Builder addFieldViolations(int i, FieldViolation.Builder builder) {
        }
    }

    public static final class FieldViolation extends GeneratedMessageLite<FieldViolation, Builder> implements FieldViolationOrBuilder {
        private static final FieldViolation DEFAULT_INSTANCE = null;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<FieldViolation> PARSER;
        private String description_;
        private String field_;

        public static final class Builder extends GeneratedMessageLite.Builder<FieldViolation, Builder> implements FieldViolationOrBuilder {
            /* synthetic */ Builder(C13521 c13521) {
            }

            public Builder clearDescription() {
            }

            public Builder clearField() {
            }

            @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
            public String getDescription() {
            }

            @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
            public ByteString getDescriptionBytes() {
            }

            @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
            public String getField() {
            }

            @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
            public ByteString getFieldBytes() {
            }

            public Builder setDescription(String str) {
            }

            public Builder setDescriptionBytes(ByteString byteString) {
            }

            public Builder setField(String str) {
            }

            public Builder setFieldBytes(ByteString byteString) {
            }

            private Builder() {
            }
        }

        private FieldViolation() {
        }

        static /* synthetic */ FieldViolation access$000() {
        }

        static /* synthetic */ void access$100(FieldViolation fieldViolation, String str) {
        }

        static /* synthetic */ void access$200(FieldViolation fieldViolation) {
        }

        static /* synthetic */ void access$300(FieldViolation fieldViolation, ByteString byteString) {
        }

        static /* synthetic */ void access$400(FieldViolation fieldViolation, String str) {
        }

        static /* synthetic */ void access$500(FieldViolation fieldViolation) {
        }

        static /* synthetic */ void access$600(FieldViolation fieldViolation, ByteString byteString) {
        }

        private void clearDescription() {
        }

        private void clearField() {
        }

        public static FieldViolation getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<FieldViolation> parser() {
        }

        private void setDescription(String str) {
        }

        private void setDescriptionBytes(ByteString byteString) {
        }

        private void setField(String str) {
        }

        private void setFieldBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
        public String getDescription() {
        }

        @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
        public String getField() {
        }

        @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
        public ByteString getFieldBytes() {
        }

        public static Builder newBuilder(FieldViolation fieldViolation) {
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldViolation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static FieldViolation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldViolation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static FieldViolation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldViolation parseFrom(InputStream inputStream) throws IOException {
        }

        public static FieldViolation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FieldViolation parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static FieldViolation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface FieldViolationOrBuilder extends MessageLiteOrBuilder {
        String getDescription();

        ByteString getDescriptionBytes();

        String getField();

        ByteString getFieldBytes();
    }

    private BadRequest() {
    }

    static /* synthetic */ void access$1000(BadRequest badRequest, FieldViolation fieldViolation) {
    }

    static /* synthetic */ void access$1100(BadRequest badRequest, int i, FieldViolation fieldViolation) {
    }

    static /* synthetic */ void access$1200(BadRequest badRequest, Iterable iterable) {
    }

    static /* synthetic */ void access$1300(BadRequest badRequest) {
    }

    static /* synthetic */ void access$1400(BadRequest badRequest, int i) {
    }

    static /* synthetic */ BadRequest access$800() {
    }

    static /* synthetic */ void access$900(BadRequest badRequest, int i, FieldViolation fieldViolation) {
    }

    private void addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
    }

    private void addFieldViolations(FieldViolation fieldViolation) {
    }

    private void clearFieldViolations() {
    }

    private void ensureFieldViolationsIsMutable() {
    }

    public static BadRequest getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<BadRequest> parser() {
    }

    private void removeFieldViolations(int i) {
    }

    private void setFieldViolations(int i, FieldViolation fieldViolation) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.BadRequestOrBuilder
    public FieldViolation getFieldViolations(int i) {
    }

    @Override // com.google.rpc.BadRequestOrBuilder
    public int getFieldViolationsCount() {
    }

    @Override // com.google.rpc.BadRequestOrBuilder
    public List<FieldViolation> getFieldViolationsList() {
    }

    public FieldViolationOrBuilder getFieldViolationsOrBuilder(int i) {
    }

    public List<? extends FieldViolationOrBuilder> getFieldViolationsOrBuilderList() {
    }

    public static Builder newBuilder(BadRequest badRequest) {
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BadRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addFieldViolations(int i, FieldViolation fieldViolation) {
    }

    public static BadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BadRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static BadRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BadRequest parseFrom(InputStream inputStream) throws IOException {
    }

    public static BadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
