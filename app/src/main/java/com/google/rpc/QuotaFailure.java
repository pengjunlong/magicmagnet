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
public final class QuotaFailure extends GeneratedMessageLite<QuotaFailure, Builder> implements QuotaFailureOrBuilder {
    private static final QuotaFailure DEFAULT_INSTANCE = null;
    private static volatile Parser<QuotaFailure> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Violation> violations_;

    /* renamed from: com.google.rpc.QuotaFailure$1 */
    static /* synthetic */ class C13591 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f171xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<QuotaFailure, Builder> implements QuotaFailureOrBuilder {
        /* synthetic */ Builder(C13591 c13591) {
        }

        public Builder addAllViolations(Iterable<? extends Violation> iterable) {
        }

        public Builder addViolations(Violation violation) {
        }

        public Builder clearViolations() {
        }

        @Override // com.google.rpc.QuotaFailureOrBuilder
        public Violation getViolations(int i) {
        }

        @Override // com.google.rpc.QuotaFailureOrBuilder
        public int getViolationsCount() {
        }

        @Override // com.google.rpc.QuotaFailureOrBuilder
        public List<Violation> getViolationsList() {
        }

        public Builder removeViolations(int i) {
        }

        public Builder setViolations(int i, Violation violation) {
        }

        private Builder() {
        }

        public Builder addViolations(int i, Violation violation) {
        }

        public Builder setViolations(int i, Violation.Builder builder) {
        }

        public Builder addViolations(Violation.Builder builder) {
        }

        public Builder addViolations(int i, Violation.Builder builder) {
        }
    }

    public static final class Violation extends GeneratedMessageLite<Violation, Builder> implements ViolationOrBuilder {
        private static final Violation DEFAULT_INSTANCE = null;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile Parser<Violation> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 1;
        private String description_;
        private String subject_;

        public static final class Builder extends GeneratedMessageLite.Builder<Violation, Builder> implements ViolationOrBuilder {
            /* synthetic */ Builder(C13591 c13591) {
            }

            public Builder clearDescription() {
            }

            public Builder clearSubject() {
            }

            @Override // com.google.rpc.QuotaFailure.ViolationOrBuilder
            public String getDescription() {
            }

            @Override // com.google.rpc.QuotaFailure.ViolationOrBuilder
            public ByteString getDescriptionBytes() {
            }

            @Override // com.google.rpc.QuotaFailure.ViolationOrBuilder
            public String getSubject() {
            }

            @Override // com.google.rpc.QuotaFailure.ViolationOrBuilder
            public ByteString getSubjectBytes() {
            }

            public Builder setDescription(String str) {
            }

            public Builder setDescriptionBytes(ByteString byteString) {
            }

            public Builder setSubject(String str) {
            }

            public Builder setSubjectBytes(ByteString byteString) {
            }

            private Builder() {
            }
        }

        private Violation() {
        }

        static /* synthetic */ Violation access$000() {
        }

        static /* synthetic */ void access$100(Violation violation, String str) {
        }

        static /* synthetic */ void access$200(Violation violation) {
        }

        static /* synthetic */ void access$300(Violation violation, ByteString byteString) {
        }

        static /* synthetic */ void access$400(Violation violation, String str) {
        }

        static /* synthetic */ void access$500(Violation violation) {
        }

        static /* synthetic */ void access$600(Violation violation, ByteString byteString) {
        }

        private void clearDescription() {
        }

        private void clearSubject() {
        }

        public static Violation getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static Violation parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Violation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Violation> parser() {
        }

        private void setDescription(String str) {
        }

        private void setDescriptionBytes(ByteString byteString) {
        }

        private void setSubject(String str) {
        }

        private void setSubjectBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.QuotaFailure.ViolationOrBuilder
        public String getDescription() {
        }

        @Override // com.google.rpc.QuotaFailure.ViolationOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.rpc.QuotaFailure.ViolationOrBuilder
        public String getSubject() {
        }

        @Override // com.google.rpc.QuotaFailure.ViolationOrBuilder
        public ByteString getSubjectBytes() {
        }

        public static Builder newBuilder(Violation violation) {
        }

        public static Violation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Violation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Violation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Violation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Violation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Violation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Violation parseFrom(InputStream inputStream) throws IOException {
        }

        public static Violation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Violation parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Violation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface ViolationOrBuilder extends MessageLiteOrBuilder {
        String getDescription();

        ByteString getDescriptionBytes();

        String getSubject();

        ByteString getSubjectBytes();
    }

    private QuotaFailure() {
    }

    static /* synthetic */ void access$1000(QuotaFailure quotaFailure, Violation violation) {
    }

    static /* synthetic */ void access$1100(QuotaFailure quotaFailure, int i, Violation violation) {
    }

    static /* synthetic */ void access$1200(QuotaFailure quotaFailure, Iterable iterable) {
    }

    static /* synthetic */ void access$1300(QuotaFailure quotaFailure) {
    }

    static /* synthetic */ void access$1400(QuotaFailure quotaFailure, int i) {
    }

    static /* synthetic */ QuotaFailure access$800() {
    }

    static /* synthetic */ void access$900(QuotaFailure quotaFailure, int i, Violation violation) {
    }

    private void addAllViolations(Iterable<? extends Violation> iterable) {
    }

    private void addViolations(Violation violation) {
    }

    private void clearViolations() {
    }

    private void ensureViolationsIsMutable() {
    }

    public static QuotaFailure getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static QuotaFailure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<QuotaFailure> parser() {
    }

    private void removeViolations(int i) {
    }

    private void setViolations(int i, Violation violation) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.QuotaFailureOrBuilder
    public Violation getViolations(int i) {
    }

    @Override // com.google.rpc.QuotaFailureOrBuilder
    public int getViolationsCount() {
    }

    @Override // com.google.rpc.QuotaFailureOrBuilder
    public List<Violation> getViolationsList() {
    }

    public ViolationOrBuilder getViolationsOrBuilder(int i) {
    }

    public List<? extends ViolationOrBuilder> getViolationsOrBuilderList() {
    }

    public static Builder newBuilder(QuotaFailure quotaFailure) {
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static QuotaFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static QuotaFailure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addViolations(int i, Violation violation) {
    }

    public static QuotaFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static QuotaFailure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static QuotaFailure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static QuotaFailure parseFrom(InputStream inputStream) throws IOException {
    }

    public static QuotaFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static QuotaFailure parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static QuotaFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
