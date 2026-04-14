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
public final class PreconditionFailure extends GeneratedMessageLite<PreconditionFailure, Builder> implements PreconditionFailureOrBuilder {
    private static final PreconditionFailure DEFAULT_INSTANCE = null;
    private static volatile Parser<PreconditionFailure> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Violation> violations_;

    /* renamed from: com.google.rpc.PreconditionFailure$1 */
    static /* synthetic */ class C13581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f170xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PreconditionFailure, Builder> implements PreconditionFailureOrBuilder {
        /* synthetic */ Builder(C13581 c13581) {
        }

        public Builder addAllViolations(Iterable<? extends Violation> iterable) {
        }

        public Builder addViolations(Violation violation) {
        }

        public Builder clearViolations() {
        }

        @Override // com.google.rpc.PreconditionFailureOrBuilder
        public Violation getViolations(int i) {
        }

        @Override // com.google.rpc.PreconditionFailureOrBuilder
        public int getViolationsCount() {
        }

        @Override // com.google.rpc.PreconditionFailureOrBuilder
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
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile Parser<Violation> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String description_;
        private String subject_;
        private String type_;

        public static final class Builder extends GeneratedMessageLite.Builder<Violation, Builder> implements ViolationOrBuilder {
            /* synthetic */ Builder(C13581 c13581) {
            }

            public Builder clearDescription() {
            }

            public Builder clearSubject() {
            }

            public Builder clearType() {
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public String getDescription() {
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public ByteString getDescriptionBytes() {
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public String getSubject() {
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public ByteString getSubjectBytes() {
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public String getType() {
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public ByteString getTypeBytes() {
            }

            public Builder setDescription(String str) {
            }

            public Builder setDescriptionBytes(ByteString byteString) {
            }

            public Builder setSubject(String str) {
            }

            public Builder setSubjectBytes(ByteString byteString) {
            }

            public Builder setType(String str) {
            }

            public Builder setTypeBytes(ByteString byteString) {
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

        static /* synthetic */ void access$700(Violation violation, String str) {
        }

        static /* synthetic */ void access$800(Violation violation) {
        }

        static /* synthetic */ void access$900(Violation violation, ByteString byteString) {
        }

        private void clearDescription() {
        }

        private void clearSubject() {
        }

        private void clearType() {
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

        private void setType(String str) {
        }

        private void setTypeBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public String getDescription() {
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public String getSubject() {
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public ByteString getSubjectBytes() {
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public String getType() {
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public ByteString getTypeBytes() {
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

        String getType();

        ByteString getTypeBytes();
    }

    private PreconditionFailure() {
    }

    static /* synthetic */ PreconditionFailure access$1100() {
    }

    static /* synthetic */ void access$1200(PreconditionFailure preconditionFailure, int i, Violation violation) {
    }

    static /* synthetic */ void access$1300(PreconditionFailure preconditionFailure, Violation violation) {
    }

    static /* synthetic */ void access$1400(PreconditionFailure preconditionFailure, int i, Violation violation) {
    }

    static /* synthetic */ void access$1500(PreconditionFailure preconditionFailure, Iterable iterable) {
    }

    static /* synthetic */ void access$1600(PreconditionFailure preconditionFailure) {
    }

    static /* synthetic */ void access$1700(PreconditionFailure preconditionFailure, int i) {
    }

    private void addAllViolations(Iterable<? extends Violation> iterable) {
    }

    private void addViolations(Violation violation) {
    }

    private void clearViolations() {
    }

    private void ensureViolationsIsMutable() {
    }

    public static PreconditionFailure getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<PreconditionFailure> parser() {
    }

    private void removeViolations(int i) {
    }

    private void setViolations(int i, Violation violation) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.PreconditionFailureOrBuilder
    public Violation getViolations(int i) {
    }

    @Override // com.google.rpc.PreconditionFailureOrBuilder
    public int getViolationsCount() {
    }

    @Override // com.google.rpc.PreconditionFailureOrBuilder
    public List<Violation> getViolationsList() {
    }

    public ViolationOrBuilder getViolationsOrBuilder(int i) {
    }

    public List<? extends ViolationOrBuilder> getViolationsOrBuilderList() {
    }

    public static Builder newBuilder(PreconditionFailure preconditionFailure) {
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PreconditionFailure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addViolations(int i, Violation violation) {
    }

    public static PreconditionFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PreconditionFailure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static PreconditionFailure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PreconditionFailure parseFrom(InputStream inputStream) throws IOException {
    }

    public static PreconditionFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static PreconditionFailure parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static PreconditionFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
