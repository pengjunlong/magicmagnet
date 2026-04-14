package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DescriptorProtos {

    /* renamed from: com.google.protobuf.DescriptorProtos$1 */
    static /* synthetic */ class C12891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f142xa1df5c61 = null;
    }

    public static final class DescriptorProto extends GeneratedMessageLite<DescriptorProto, Builder> implements DescriptorProtoOrBuilder {
        private static final DescriptorProto DEFAULT_INSTANCE = null;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile Parser<DescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private Internal.ProtobufList<EnumDescriptorProto> enumType_;
        private Internal.ProtobufList<ExtensionRange> extensionRange_;
        private Internal.ProtobufList<FieldDescriptorProto> extension_;
        private Internal.ProtobufList<FieldDescriptorProto> field_;
        private byte memoizedIsInitialized;
        private String name_;
        private Internal.ProtobufList<DescriptorProto> nestedType_;
        private Internal.ProtobufList<OneofDescriptorProto> oneofDecl_;
        private MessageOptions options_;
        private Internal.ProtobufList<String> reservedName_;
        private Internal.ProtobufList<ReservedRange> reservedRange_;

        public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProto, Builder> implements DescriptorProtoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            }

            public Builder addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            }

            public Builder addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            }

            public Builder addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
            }

            public Builder addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
            }

            public Builder addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
            }

            public Builder addAllReservedName(Iterable<String> iterable) {
            }

            public Builder addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            }

            public Builder addEnumType(EnumDescriptorProto enumDescriptorProto) {
            }

            public Builder addExtension(FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder addExtensionRange(ExtensionRange extensionRange) {
            }

            public Builder addField(FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder addNestedType(DescriptorProto descriptorProto) {
            }

            public Builder addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
            }

            public Builder addReservedName(String str) {
            }

            public Builder addReservedNameBytes(ByteString byteString) {
            }

            public Builder addReservedRange(ReservedRange reservedRange) {
            }

            public Builder clearEnumType() {
            }

            public Builder clearExtension() {
            }

            public Builder clearExtensionRange() {
            }

            public Builder clearField() {
            }

            public Builder clearName() {
            }

            public Builder clearNestedType() {
            }

            public Builder clearOneofDecl() {
            }

            public Builder clearOptions() {
            }

            public Builder clearReservedName() {
            }

            public Builder clearReservedRange() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public EnumDescriptorProto getEnumType(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getEnumTypeCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<EnumDescriptorProto> getEnumTypeList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public FieldDescriptorProto getExtension(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getExtensionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getExtensionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ExtensionRange getExtensionRange(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getExtensionRangeCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<ExtensionRange> getExtensionRangeList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public FieldDescriptorProto getField(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getFieldCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getFieldList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public String getName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public DescriptorProto getNestedType(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getNestedTypeCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<DescriptorProto> getNestedTypeList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public OneofDescriptorProto getOneofDecl(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getOneofDeclCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<OneofDescriptorProto> getOneofDeclList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public MessageOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public String getReservedName(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ByteString getReservedNameBytes(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getReservedNameCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<String> getReservedNameList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ReservedRange getReservedRange(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getReservedRangeCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<ReservedRange> getReservedRangeList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public boolean hasName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public boolean hasOptions() {
            }

            public Builder mergeOptions(MessageOptions messageOptions) {
            }

            public Builder removeEnumType(int i) {
            }

            public Builder removeExtension(int i) {
            }

            public Builder removeExtensionRange(int i) {
            }

            public Builder removeField(int i) {
            }

            public Builder removeNestedType(int i) {
            }

            public Builder removeOneofDecl(int i) {
            }

            public Builder removeReservedRange(int i) {
            }

            public Builder setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            }

            public Builder setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder setExtensionRange(int i, ExtensionRange extensionRange) {
            }

            public Builder setField(int i, FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setNestedType(int i, DescriptorProto descriptorProto) {
            }

            public Builder setOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
            }

            public Builder setOptions(MessageOptions messageOptions) {
            }

            public Builder setReservedName(int i, String str) {
            }

            public Builder setReservedRange(int i, ReservedRange reservedRange) {
            }

            private Builder() {
            }

            public Builder addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            }

            public Builder addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder addExtensionRange(int i, ExtensionRange extensionRange) {
            }

            public Builder addField(int i, FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder addNestedType(int i, DescriptorProto descriptorProto) {
            }

            public Builder addOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
            }

            public Builder addReservedRange(int i, ReservedRange reservedRange) {
            }

            public Builder setEnumType(int i, EnumDescriptorProto.Builder builder) {
            }

            public Builder setExtension(int i, FieldDescriptorProto.Builder builder) {
            }

            public Builder setExtensionRange(int i, ExtensionRange.Builder builder) {
            }

            public Builder setField(int i, FieldDescriptorProto.Builder builder) {
            }

            public Builder setNestedType(int i, Builder builder) {
            }

            public Builder setOneofDecl(int i, OneofDescriptorProto.Builder builder) {
            }

            public Builder setOptions(MessageOptions.Builder builder) {
            }

            public Builder setReservedRange(int i, ReservedRange.Builder builder) {
            }

            public Builder addEnumType(EnumDescriptorProto.Builder builder) {
            }

            public Builder addExtension(FieldDescriptorProto.Builder builder) {
            }

            public Builder addExtensionRange(ExtensionRange.Builder builder) {
            }

            public Builder addField(FieldDescriptorProto.Builder builder) {
            }

            public Builder addNestedType(Builder builder) {
            }

            public Builder addOneofDecl(OneofDescriptorProto.Builder builder) {
            }

            public Builder addReservedRange(ReservedRange.Builder builder) {
            }

            public Builder addEnumType(int i, EnumDescriptorProto.Builder builder) {
            }

            public Builder addExtension(int i, FieldDescriptorProto.Builder builder) {
            }

            public Builder addExtensionRange(int i, ExtensionRange.Builder builder) {
            }

            public Builder addField(int i, FieldDescriptorProto.Builder builder) {
            }

            public Builder addNestedType(int i, Builder builder) {
            }

            public Builder addOneofDecl(int i, OneofDescriptorProto.Builder builder) {
            }

            public Builder addReservedRange(int i, ReservedRange.Builder builder) {
            }
        }

        public static final class ExtensionRange extends GeneratedMessageLite<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
            private static final ExtensionRange DEFAULT_INSTANCE = null;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile Parser<ExtensionRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private ExtensionRangeOptions options_;
            private int start_;

            public static final class Builder extends GeneratedMessageLite.Builder<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
                /* synthetic */ Builder(C12891 c12891) {
                }

                public Builder clearEnd() {
                }

                public Builder clearOptions() {
                }

                public Builder clearStart() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public int getEnd() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public ExtensionRangeOptions getOptions() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public int getStart() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasEnd() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasOptions() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasStart() {
                }

                public Builder mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
                }

                public Builder setEnd(int i) {
                }

                public Builder setOptions(ExtensionRangeOptions extensionRangeOptions) {
                }

                public Builder setStart(int i) {
                }

                private Builder() {
                }

                public Builder setOptions(ExtensionRangeOptions.Builder builder) {
                }
            }

            private ExtensionRange() {
            }

            static /* synthetic */ ExtensionRange access$6200() {
            }

            static /* synthetic */ void access$6300(ExtensionRange extensionRange, int i) {
            }

            static /* synthetic */ void access$6400(ExtensionRange extensionRange) {
            }

            static /* synthetic */ void access$6500(ExtensionRange extensionRange, int i) {
            }

            static /* synthetic */ void access$6600(ExtensionRange extensionRange) {
            }

            static /* synthetic */ void access$6700(ExtensionRange extensionRange, ExtensionRangeOptions extensionRangeOptions) {
            }

            static /* synthetic */ void access$6800(ExtensionRange extensionRange, ExtensionRangeOptions extensionRangeOptions) {
            }

            static /* synthetic */ void access$6900(ExtensionRange extensionRange) {
            }

            private void clearEnd() {
            }

            private void clearOptions() {
            }

            private void clearStart() {
            }

            public static ExtensionRange getDefaultInstance() {
            }

            private void mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
            }

            public static Builder newBuilder() {
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<ExtensionRange> parser() {
            }

            private void setEnd(int i) {
            }

            private void setOptions(ExtensionRangeOptions extensionRangeOptions) {
            }

            private void setStart(int i) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public int getEnd() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public ExtensionRangeOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public int getStart() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasEnd() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasStart() {
            }

            public static Builder newBuilder(ExtensionRange extensionRange) {
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static ExtensionRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static ExtensionRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static ExtensionRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static ExtensionRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static ExtensionRange parseFrom(InputStream inputStream) throws IOException {
            }

            public static ExtensionRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface ExtensionRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            ExtensionRangeOptions getOptions();

            int getStart();

            boolean hasEnd();

            boolean hasOptions();

            boolean hasStart();
        }

        public static final class ReservedRange extends GeneratedMessageLite<ReservedRange, Builder> implements ReservedRangeOrBuilder {
            private static final ReservedRange DEFAULT_INSTANCE = null;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser<ReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            public static final class Builder extends GeneratedMessageLite.Builder<ReservedRange, Builder> implements ReservedRangeOrBuilder {
                /* synthetic */ Builder(C12891 c12891) {
                }

                public Builder clearEnd() {
                }

                public Builder clearStart() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public int getEnd() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public int getStart() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public boolean hasEnd() {
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public boolean hasStart() {
                }

                public Builder setEnd(int i) {
                }

                public Builder setStart(int i) {
                }

                private Builder() {
                }
            }

            private ReservedRange() {
            }

            static /* synthetic */ ReservedRange access$7100() {
            }

            static /* synthetic */ void access$7200(ReservedRange reservedRange, int i) {
            }

            static /* synthetic */ void access$7300(ReservedRange reservedRange) {
            }

            static /* synthetic */ void access$7400(ReservedRange reservedRange, int i) {
            }

            static /* synthetic */ void access$7500(ReservedRange reservedRange) {
            }

            private void clearEnd() {
            }

            private void clearStart() {
            }

            public static ReservedRange getDefaultInstance() {
            }

            public static Builder newBuilder() {
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<ReservedRange> parser() {
            }

            private void setEnd(int i) {
            }

            private void setStart(int i) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public int getEnd() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public int getStart() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public boolean hasEnd() {
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public boolean hasStart() {
            }

            public static Builder newBuilder(ReservedRange reservedRange) {
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static ReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static ReservedRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static ReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static ReservedRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static ReservedRange parseFrom(InputStream inputStream) throws IOException {
            }

            public static ReservedRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static ReservedRange parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static ReservedRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface ReservedRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        private DescriptorProto() {
        }

        static /* synthetic */ void access$10000(DescriptorProto descriptorProto, EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$10100(DescriptorProto descriptorProto, int i, EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$10200(DescriptorProto descriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$10300(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$10400(DescriptorProto descriptorProto, int i) {
        }

        static /* synthetic */ void access$10500(DescriptorProto descriptorProto, int i, ExtensionRange extensionRange) {
        }

        static /* synthetic */ void access$10600(DescriptorProto descriptorProto, ExtensionRange extensionRange) {
        }

        static /* synthetic */ void access$10700(DescriptorProto descriptorProto, int i, ExtensionRange extensionRange) {
        }

        static /* synthetic */ void access$10800(DescriptorProto descriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$10900(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$11000(DescriptorProto descriptorProto, int i) {
        }

        static /* synthetic */ void access$11100(DescriptorProto descriptorProto, int i, OneofDescriptorProto oneofDescriptorProto) {
        }

        static /* synthetic */ void access$11200(DescriptorProto descriptorProto, OneofDescriptorProto oneofDescriptorProto) {
        }

        static /* synthetic */ void access$11300(DescriptorProto descriptorProto, int i, OneofDescriptorProto oneofDescriptorProto) {
        }

        static /* synthetic */ void access$11400(DescriptorProto descriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$11500(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$11600(DescriptorProto descriptorProto, int i) {
        }

        static /* synthetic */ void access$11700(DescriptorProto descriptorProto, MessageOptions messageOptions) {
        }

        static /* synthetic */ void access$11800(DescriptorProto descriptorProto, MessageOptions messageOptions) {
        }

        static /* synthetic */ void access$11900(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$12000(DescriptorProto descriptorProto, int i, ReservedRange reservedRange) {
        }

        static /* synthetic */ void access$12100(DescriptorProto descriptorProto, ReservedRange reservedRange) {
        }

        static /* synthetic */ void access$12200(DescriptorProto descriptorProto, int i, ReservedRange reservedRange) {
        }

        static /* synthetic */ void access$12300(DescriptorProto descriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$12400(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$12500(DescriptorProto descriptorProto, int i) {
        }

        static /* synthetic */ void access$12600(DescriptorProto descriptorProto, int i, String str) {
        }

        static /* synthetic */ void access$12700(DescriptorProto descriptorProto, String str) {
        }

        static /* synthetic */ void access$12800(DescriptorProto descriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$12900(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$13000(DescriptorProto descriptorProto, ByteString byteString) {
        }

        static /* synthetic */ DescriptorProto access$7700() {
        }

        static /* synthetic */ void access$7800(DescriptorProto descriptorProto, String str) {
        }

        static /* synthetic */ void access$7900(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$8000(DescriptorProto descriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$8100(DescriptorProto descriptorProto, int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$8200(DescriptorProto descriptorProto, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$8300(DescriptorProto descriptorProto, int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$8400(DescriptorProto descriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$8500(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$8600(DescriptorProto descriptorProto, int i) {
        }

        static /* synthetic */ void access$8700(DescriptorProto descriptorProto, int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$8800(DescriptorProto descriptorProto, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$8900(DescriptorProto descriptorProto, int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$9000(DescriptorProto descriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$9100(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$9200(DescriptorProto descriptorProto, int i) {
        }

        static /* synthetic */ void access$9300(DescriptorProto descriptorProto, int i, DescriptorProto descriptorProto2) {
        }

        static /* synthetic */ void access$9400(DescriptorProto descriptorProto, DescriptorProto descriptorProto2) {
        }

        static /* synthetic */ void access$9500(DescriptorProto descriptorProto, int i, DescriptorProto descriptorProto2) {
        }

        static /* synthetic */ void access$9600(DescriptorProto descriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$9700(DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$9800(DescriptorProto descriptorProto, int i) {
        }

        static /* synthetic */ void access$9900(DescriptorProto descriptorProto, int i, EnumDescriptorProto enumDescriptorProto) {
        }

        private void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
        }

        private void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
        }

        private void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
        }

        private void addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
        }

        private void addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
        }

        private void addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
        }

        private void addAllReservedName(Iterable<String> iterable) {
        }

        private void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
        }

        private void addEnumType(EnumDescriptorProto enumDescriptorProto) {
        }

        private void addExtension(FieldDescriptorProto fieldDescriptorProto) {
        }

        private void addExtensionRange(ExtensionRange extensionRange) {
        }

        private void addField(FieldDescriptorProto fieldDescriptorProto) {
        }

        private void addNestedType(DescriptorProto descriptorProto) {
        }

        private void addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
        }

        private void addReservedName(String str) {
        }

        private void addReservedNameBytes(ByteString byteString) {
        }

        private void addReservedRange(ReservedRange reservedRange) {
        }

        private void clearEnumType() {
        }

        private void clearExtension() {
        }

        private void clearExtensionRange() {
        }

        private void clearField() {
        }

        private void clearName() {
        }

        private void clearNestedType() {
        }

        private void clearOneofDecl() {
        }

        private void clearOptions() {
        }

        private void clearReservedName() {
        }

        private void clearReservedRange() {
        }

        private void ensureEnumTypeIsMutable() {
        }

        private void ensureExtensionIsMutable() {
        }

        private void ensureExtensionRangeIsMutable() {
        }

        private void ensureFieldIsMutable() {
        }

        private void ensureNestedTypeIsMutable() {
        }

        private void ensureOneofDeclIsMutable() {
        }

        private void ensureReservedNameIsMutable() {
        }

        private void ensureReservedRangeIsMutable() {
        }

        public static DescriptorProto getDefaultInstance() {
        }

        private void mergeOptions(MessageOptions messageOptions) {
        }

        public static Builder newBuilder() {
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<DescriptorProto> parser() {
        }

        private void removeEnumType(int i) {
        }

        private void removeExtension(int i) {
        }

        private void removeExtensionRange(int i) {
        }

        private void removeField(int i) {
        }

        private void removeNestedType(int i) {
        }

        private void removeOneofDecl(int i) {
        }

        private void removeReservedRange(int i) {
        }

        private void setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
        }

        private void setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        private void setExtensionRange(int i, ExtensionRange extensionRange) {
        }

        private void setField(int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setNestedType(int i, DescriptorProto descriptorProto) {
        }

        private void setOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
        }

        private void setOptions(MessageOptions messageOptions) {
        }

        private void setReservedName(int i, String str) {
        }

        private void setReservedRange(int i, ReservedRange reservedRange) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public EnumDescriptorProto getEnumType(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getEnumTypeCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<EnumDescriptorProto> getEnumTypeList() {
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i) {
        }

        public List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public FieldDescriptorProto getExtension(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getExtensionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getExtensionList() {
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i) {
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ExtensionRange getExtensionRange(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getExtensionRangeCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<ExtensionRange> getExtensionRangeList() {
        }

        public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i) {
        }

        public List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public FieldDescriptorProto getField(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getFieldCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getFieldList() {
        }

        public FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i) {
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getFieldOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public DescriptorProto getNestedType(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getNestedTypeCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<DescriptorProto> getNestedTypeList() {
        }

        public DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i) {
        }

        public List<? extends DescriptorProtoOrBuilder> getNestedTypeOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public OneofDescriptorProto getOneofDecl(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getOneofDeclCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<OneofDescriptorProto> getOneofDeclList() {
        }

        public OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i) {
        }

        public List<? extends OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public MessageOptions getOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public String getReservedName(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getReservedNameCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ReservedRange getReservedRange(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getReservedRangeCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<ReservedRange> getReservedRangeList() {
        }

        public ReservedRangeOrBuilder getReservedRangeOrBuilder(int i) {
        }

        public List<? extends ReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public boolean hasName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public boolean hasOptions() {
        }

        public static Builder newBuilder(DescriptorProto descriptorProto) {
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static DescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
        }

        private void addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        private void addExtensionRange(int i, ExtensionRange extensionRange) {
        }

        private void addField(int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        private void addNestedType(int i, DescriptorProto descriptorProto) {
        }

        private void addOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
        }

        private void addReservedRange(int i, ReservedRange reservedRange) {
        }

        public static DescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static DescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static DescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static DescriptorProto parseFrom(InputStream inputStream) throws IOException {
        }

        public static DescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface DescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        EnumDescriptorProto getEnumType(int i);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        FieldDescriptorProto getExtension(int i);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        DescriptorProto.ExtensionRange getExtensionRange(int i);

        int getExtensionRangeCount();

        List<DescriptorProto.ExtensionRange> getExtensionRangeList();

        FieldDescriptorProto getField(int i);

        int getFieldCount();

        List<FieldDescriptorProto> getFieldList();

        String getName();

        ByteString getNameBytes();

        DescriptorProto getNestedType(int i);

        int getNestedTypeCount();

        List<DescriptorProto> getNestedTypeList();

        OneofDescriptorProto getOneofDecl(int i);

        int getOneofDeclCount();

        List<OneofDescriptorProto> getOneofDeclList();

        MessageOptions getOptions();

        String getReservedName(int i);

        ByteString getReservedNameBytes(int i);

        int getReservedNameCount();

        List<String> getReservedNameList();

        DescriptorProto.ReservedRange getReservedRange(int i);

        int getReservedRangeCount();

        List<DescriptorProto.ReservedRange> getReservedRangeList();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class EnumDescriptorProto extends GeneratedMessageLite<EnumDescriptorProto, Builder> implements EnumDescriptorProtoOrBuilder {
        private static final EnumDescriptorProto DEFAULT_INSTANCE = null;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<EnumDescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private String name_;
        private EnumOptions options_;
        private Internal.ProtobufList<String> reservedName_;
        private Internal.ProtobufList<EnumReservedRange> reservedRange_;
        private Internal.ProtobufList<EnumValueDescriptorProto> value_;

        public static final class Builder extends GeneratedMessageLite.Builder<EnumDescriptorProto, Builder> implements EnumDescriptorProtoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllReservedName(Iterable<String> iterable) {
            }

            public Builder addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            }

            public Builder addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
            }

            public Builder addReservedName(String str) {
            }

            public Builder addReservedNameBytes(ByteString byteString) {
            }

            public Builder addReservedRange(EnumReservedRange enumReservedRange) {
            }

            public Builder addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
            }

            public Builder clearName() {
            }

            public Builder clearOptions() {
            }

            public Builder clearReservedName() {
            }

            public Builder clearReservedRange() {
            }

            public Builder clearValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public String getName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public String getReservedName(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public ByteString getReservedNameBytes(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getReservedNameCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<String> getReservedNameList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumReservedRange getReservedRange(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getReservedRangeCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<EnumReservedRange> getReservedRangeList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumValueDescriptorProto getValue(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getValueCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<EnumValueDescriptorProto> getValueList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public boolean hasName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public boolean hasOptions() {
            }

            public Builder mergeOptions(EnumOptions enumOptions) {
            }

            public Builder removeReservedRange(int i) {
            }

            public Builder removeValue(int i) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setOptions(EnumOptions enumOptions) {
            }

            public Builder setReservedName(int i, String str) {
            }

            public Builder setReservedRange(int i, EnumReservedRange enumReservedRange) {
            }

            public Builder setValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
            }

            private Builder() {
            }

            public Builder addReservedRange(int i, EnumReservedRange enumReservedRange) {
            }

            public Builder addValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
            }

            public Builder setOptions(EnumOptions.Builder builder) {
            }

            public Builder setReservedRange(int i, EnumReservedRange.Builder builder) {
            }

            public Builder setValue(int i, EnumValueDescriptorProto.Builder builder) {
            }

            public Builder addReservedRange(EnumReservedRange.Builder builder) {
            }

            public Builder addValue(EnumValueDescriptorProto.Builder builder) {
            }

            public Builder addReservedRange(int i, EnumReservedRange.Builder builder) {
            }

            public Builder addValue(int i, EnumValueDescriptorProto.Builder builder) {
            }
        }

        public static final class EnumReservedRange extends GeneratedMessageLite<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
            private static final EnumReservedRange DEFAULT_INSTANCE = null;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser<EnumReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            public static final class Builder extends GeneratedMessageLite.Builder<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
                /* synthetic */ Builder(C12891 c12891) {
                }

                public Builder clearEnd() {
                }

                public Builder clearStart() {
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public int getEnd() {
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public int getStart() {
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public boolean hasEnd() {
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public boolean hasStart() {
                }

                public Builder setEnd(int i) {
                }

                public Builder setStart(int i) {
                }

                private Builder() {
                }
            }

            private EnumReservedRange() {
            }

            static /* synthetic */ EnumReservedRange access$17800() {
            }

            static /* synthetic */ void access$17900(EnumReservedRange enumReservedRange, int i) {
            }

            static /* synthetic */ void access$18000(EnumReservedRange enumReservedRange) {
            }

            static /* synthetic */ void access$18100(EnumReservedRange enumReservedRange, int i) {
            }

            static /* synthetic */ void access$18200(EnumReservedRange enumReservedRange) {
            }

            private void clearEnd() {
            }

            private void clearStart() {
            }

            public static EnumReservedRange getDefaultInstance() {
            }

            public static Builder newBuilder() {
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<EnumReservedRange> parser() {
            }

            private void setEnd(int i) {
            }

            private void setStart(int i) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getEnd() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getStart() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasEnd() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasStart() {
            }

            public static Builder newBuilder(EnumReservedRange enumReservedRange) {
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static EnumReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static EnumReservedRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static EnumReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static EnumReservedRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static EnumReservedRange parseFrom(InputStream inputStream) throws IOException {
            }

            public static EnumReservedRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static EnumReservedRange parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static EnumReservedRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface EnumReservedRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        private EnumDescriptorProto() {
        }

        static /* synthetic */ EnumDescriptorProto access$18400() {
        }

        static /* synthetic */ void access$18500(EnumDescriptorProto enumDescriptorProto, String str) {
        }

        static /* synthetic */ void access$18600(EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$18700(EnumDescriptorProto enumDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$18800(EnumDescriptorProto enumDescriptorProto, int i, EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        static /* synthetic */ void access$18900(EnumDescriptorProto enumDescriptorProto, EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        static /* synthetic */ void access$19000(EnumDescriptorProto enumDescriptorProto, int i, EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        static /* synthetic */ void access$19100(EnumDescriptorProto enumDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$19200(EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$19300(EnumDescriptorProto enumDescriptorProto, int i) {
        }

        static /* synthetic */ void access$19400(EnumDescriptorProto enumDescriptorProto, EnumOptions enumOptions) {
        }

        static /* synthetic */ void access$19500(EnumDescriptorProto enumDescriptorProto, EnumOptions enumOptions) {
        }

        static /* synthetic */ void access$19600(EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$19700(EnumDescriptorProto enumDescriptorProto, int i, EnumReservedRange enumReservedRange) {
        }

        static /* synthetic */ void access$19800(EnumDescriptorProto enumDescriptorProto, EnumReservedRange enumReservedRange) {
        }

        static /* synthetic */ void access$19900(EnumDescriptorProto enumDescriptorProto, int i, EnumReservedRange enumReservedRange) {
        }

        static /* synthetic */ void access$20000(EnumDescriptorProto enumDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$20100(EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$20200(EnumDescriptorProto enumDescriptorProto, int i) {
        }

        static /* synthetic */ void access$20300(EnumDescriptorProto enumDescriptorProto, int i, String str) {
        }

        static /* synthetic */ void access$20400(EnumDescriptorProto enumDescriptorProto, String str) {
        }

        static /* synthetic */ void access$20500(EnumDescriptorProto enumDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$20600(EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$20700(EnumDescriptorProto enumDescriptorProto, ByteString byteString) {
        }

        private void addAllReservedName(Iterable<String> iterable) {
        }

        private void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
        }

        private void addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
        }

        private void addReservedName(String str) {
        }

        private void addReservedNameBytes(ByteString byteString) {
        }

        private void addReservedRange(EnumReservedRange enumReservedRange) {
        }

        private void addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        private void clearName() {
        }

        private void clearOptions() {
        }

        private void clearReservedName() {
        }

        private void clearReservedRange() {
        }

        private void clearValue() {
        }

        private void ensureReservedNameIsMutable() {
        }

        private void ensureReservedRangeIsMutable() {
        }

        private void ensureValueIsMutable() {
        }

        public static EnumDescriptorProto getDefaultInstance() {
        }

        private void mergeOptions(EnumOptions enumOptions) {
        }

        public static Builder newBuilder() {
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<EnumDescriptorProto> parser() {
        }

        private void removeReservedRange(int i) {
        }

        private void removeValue(int i) {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setOptions(EnumOptions enumOptions) {
        }

        private void setReservedName(int i, String str) {
        }

        private void setReservedRange(int i, EnumReservedRange enumReservedRange) {
        }

        private void setValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumOptions getOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public String getReservedName(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getReservedNameCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumReservedRange getReservedRange(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getReservedRangeCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<EnumReservedRange> getReservedRangeList() {
        }

        public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int i) {
        }

        public List<? extends EnumReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumValueDescriptorProto getValue(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getValueCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<EnumValueDescriptorProto> getValueList() {
        }

        public EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i) {
        }

        public List<? extends EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public boolean hasName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public boolean hasOptions() {
        }

        public static Builder newBuilder(EnumDescriptorProto enumDescriptorProto) {
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addReservedRange(int i, EnumReservedRange enumReservedRange) {
        }

        private void addValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface EnumDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        EnumOptions getOptions();

        String getReservedName(int i);

        ByteString getReservedNameBytes(int i);

        int getReservedNameCount();

        List<String> getReservedNameList();

        EnumDescriptorProto.EnumReservedRange getReservedRange(int i);

        int getReservedRangeCount();

        List<EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

        EnumValueDescriptorProto getValue(int i);

        int getValueCount();

        List<EnumValueDescriptorProto> getValueList();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class EnumOptions extends GeneratedMessageLite.ExtendableMessage<EnumOptions, Builder> implements EnumOptionsOrBuilder {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final EnumOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private static volatile Parser<EnumOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumOptions, Builder> implements EnumOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearAllowAlias() {
            }

            public Builder clearDeprecated() {
            }

            public Builder clearUninterpretedOption() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean getAllowAlias() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean getDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean hasAllowAlias() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean hasDeprecated() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setAllowAlias(boolean z) {
            }

            public Builder setDeprecated(boolean z) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        private EnumOptions() {
        }

        static /* synthetic */ EnumOptions access$35300() {
        }

        static /* synthetic */ void access$35400(EnumOptions enumOptions, boolean z) {
        }

        static /* synthetic */ void access$35500(EnumOptions enumOptions) {
        }

        static /* synthetic */ void access$35600(EnumOptions enumOptions, boolean z) {
        }

        static /* synthetic */ void access$35700(EnumOptions enumOptions) {
        }

        static /* synthetic */ void access$35800(EnumOptions enumOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$35900(EnumOptions enumOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$36000(EnumOptions enumOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$36100(EnumOptions enumOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$36200(EnumOptions enumOptions) {
        }

        static /* synthetic */ void access$36300(EnumOptions enumOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearAllowAlias() {
        }

        private void clearDeprecated() {
        }

        private void clearUninterpretedOption() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static EnumOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<EnumOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setAllowAlias(boolean z) {
        }

        private void setDeprecated(boolean z) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean getAllowAlias() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean getDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean hasAllowAlias() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean hasDeprecated() {
        }

        public static Builder newBuilder(EnumOptions enumOptions) {
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static EnumOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static EnumOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static EnumOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface EnumOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumOptions, EnumOptions.Builder> {
        boolean getAllowAlias();

        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasAllowAlias();

        boolean hasDeprecated();
    }

    public static final class EnumValueDescriptorProto extends GeneratedMessageLite<EnumValueDescriptorProto, Builder> implements EnumValueDescriptorProtoOrBuilder {
        private static final EnumValueDescriptorProto DEFAULT_INSTANCE = null;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<EnumValueDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private String name_;
        private int number_;
        private EnumValueOptions options_;

        public static final class Builder extends GeneratedMessageLite.Builder<EnumValueDescriptorProto, Builder> implements EnumValueDescriptorProtoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder clearName() {
            }

            public Builder clearNumber() {
            }

            public Builder clearOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public String getName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public int getNumber() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public EnumValueOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasNumber() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasOptions() {
            }

            public Builder mergeOptions(EnumValueOptions enumValueOptions) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setNumber(int i) {
            }

            public Builder setOptions(EnumValueOptions enumValueOptions) {
            }

            private Builder() {
            }

            public Builder setOptions(EnumValueOptions.Builder builder) {
            }
        }

        private EnumValueDescriptorProto() {
        }

        static /* synthetic */ EnumValueDescriptorProto access$20900() {
        }

        static /* synthetic */ void access$21000(EnumValueDescriptorProto enumValueDescriptorProto, String str) {
        }

        static /* synthetic */ void access$21100(EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        static /* synthetic */ void access$21200(EnumValueDescriptorProto enumValueDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$21300(EnumValueDescriptorProto enumValueDescriptorProto, int i) {
        }

        static /* synthetic */ void access$21400(EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        static /* synthetic */ void access$21500(EnumValueDescriptorProto enumValueDescriptorProto, EnumValueOptions enumValueOptions) {
        }

        static /* synthetic */ void access$21600(EnumValueDescriptorProto enumValueDescriptorProto, EnumValueOptions enumValueOptions) {
        }

        static /* synthetic */ void access$21700(EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        private void clearName() {
        }

        private void clearNumber() {
        }

        private void clearOptions() {
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
        }

        private void mergeOptions(EnumValueOptions enumValueOptions) {
        }

        public static Builder newBuilder() {
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<EnumValueDescriptorProto> parser() {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setNumber(int i) {
        }

        private void setOptions(EnumValueOptions enumValueOptions) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public int getNumber() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public EnumValueOptions getOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasNumber() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasOptions() {
        }

        public static Builder newBuilder(EnumValueDescriptorProto enumValueDescriptorProto) {
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface EnumValueDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        int getNumber();

        EnumValueOptions getOptions();

        boolean hasName();

        boolean hasNumber();

        boolean hasOptions();
    }

    public static final class EnumValueOptions extends GeneratedMessageLite.ExtendableMessage<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
        private static final EnumValueOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private static volatile Parser<EnumValueOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearDeprecated() {
            }

            public Builder clearUninterpretedOption() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean getDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean hasDeprecated() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setDeprecated(boolean z) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        private EnumValueOptions() {
        }

        static /* synthetic */ EnumValueOptions access$36500() {
        }

        static /* synthetic */ void access$36600(EnumValueOptions enumValueOptions, boolean z) {
        }

        static /* synthetic */ void access$36700(EnumValueOptions enumValueOptions) {
        }

        static /* synthetic */ void access$36800(EnumValueOptions enumValueOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$36900(EnumValueOptions enumValueOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$37000(EnumValueOptions enumValueOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$37100(EnumValueOptions enumValueOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$37200(EnumValueOptions enumValueOptions) {
        }

        static /* synthetic */ void access$37300(EnumValueOptions enumValueOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearDeprecated() {
        }

        private void clearUninterpretedOption() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static EnumValueOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<EnumValueOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setDeprecated(boolean z) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean getDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean hasDeprecated() {
        }

        public static Builder newBuilder(EnumValueOptions enumValueOptions) {
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumValueOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static EnumValueOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumValueOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static EnumValueOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static EnumValueOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static EnumValueOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface EnumValueOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumValueOptions, EnumValueOptions.Builder> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    public static final class ExtensionRangeOptions extends GeneratedMessageLite.ExtendableMessage<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
        private static final ExtensionRangeOptions DEFAULT_INSTANCE = null;
        private static volatile Parser<ExtensionRangeOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearUninterpretedOption() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        private ExtensionRangeOptions() {
        }

        static /* synthetic */ ExtensionRangeOptions access$13200() {
        }

        static /* synthetic */ void access$13300(ExtensionRangeOptions extensionRangeOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$13400(ExtensionRangeOptions extensionRangeOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$13500(ExtensionRangeOptions extensionRangeOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$13600(ExtensionRangeOptions extensionRangeOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$13700(ExtensionRangeOptions extensionRangeOptions) {
        }

        static /* synthetic */ void access$13800(ExtensionRangeOptions extensionRangeOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearUninterpretedOption() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static ExtensionRangeOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<ExtensionRangeOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        public static Builder newBuilder(ExtensionRangeOptions extensionRangeOptions) {
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface ExtensionRangeOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<ExtensionRangeOptions, ExtensionRangeOptions.Builder> {
        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();
    }

    public static final class FieldDescriptorProto extends GeneratedMessageLite<FieldDescriptorProto, Builder> implements FieldDescriptorProtoOrBuilder {
        private static final FieldDescriptorProto DEFAULT_INSTANCE = null;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile Parser<FieldDescriptorProto> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private String defaultValue_;
        private String extendee_;
        private String jsonName_;
        private int label_;
        private byte memoizedIsInitialized;
        private String name_;
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private String typeName_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<FieldDescriptorProto, Builder> implements FieldDescriptorProtoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder clearDefaultValue() {
            }

            public Builder clearExtendee() {
            }

            public Builder clearJsonName() {
            }

            public Builder clearLabel() {
            }

            public Builder clearName() {
            }

            public Builder clearNumber() {
            }

            public Builder clearOneofIndex() {
            }

            public Builder clearOptions() {
            }

            public Builder clearProto3Optional() {
            }

            public Builder clearType() {
            }

            public Builder clearTypeName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getDefaultValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getDefaultValueBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getExtendee() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getExtendeeBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getJsonName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getJsonNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public Label getLabel() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public int getNumber() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public int getOneofIndex() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public FieldOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean getProto3Optional() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public Type getType() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getTypeName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getTypeNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasDefaultValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasExtendee() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasJsonName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasLabel() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasNumber() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasOneofIndex() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasProto3Optional() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasType() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasTypeName() {
            }

            public Builder mergeOptions(FieldOptions fieldOptions) {
            }

            public Builder setDefaultValue(String str) {
            }

            public Builder setDefaultValueBytes(ByteString byteString) {
            }

            public Builder setExtendee(String str) {
            }

            public Builder setExtendeeBytes(ByteString byteString) {
            }

            public Builder setJsonName(String str) {
            }

            public Builder setJsonNameBytes(ByteString byteString) {
            }

            public Builder setLabel(Label label) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setNumber(int i) {
            }

            public Builder setOneofIndex(int i) {
            }

            public Builder setOptions(FieldOptions fieldOptions) {
            }

            public Builder setProto3Optional(boolean z) {
            }

            public Builder setType(Type type) {
            }

            public Builder setTypeName(String str) {
            }

            public Builder setTypeNameBytes(ByteString byteString) {
            }

            private Builder() {
            }

            public Builder setOptions(FieldOptions.Builder builder) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class Label implements Internal.EnumLite {
            private static final /* synthetic */ Label[] $VALUES = null;
            public static final Label LABEL_OPTIONAL = null;
            public static final int LABEL_OPTIONAL_VALUE = 1;
            public static final Label LABEL_REPEATED = null;
            public static final int LABEL_REPEATED_VALUE = 3;
            public static final Label LABEL_REQUIRED = null;
            public static final int LABEL_REQUIRED_VALUE = 2;
            private static final Internal.EnumLiteMap<Label> internalValueMap = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$1 */
            class C12901 implements Internal.EnumLiteMap<Label> {
                C12901() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                public /* bridge */ /* synthetic */ Label findValueByNumber(int i) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Label findValueByNumber(int i) {
                }
            }

            private static final class LabelVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = null;

                private LabelVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                }
            }

            private Label(String str, int i, int i2) {
            }

            public static Label forNumber(int i) {
            }

            public static Internal.EnumLiteMap<Label> internalGetValueMap() {
            }

            public static Internal.EnumVerifier internalGetVerifier() {
            }

            public static Label valueOf(String str) {
            }

            public static Label[] values() {
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
            }

            @Deprecated
            public static Label valueOf(int i) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class Type implements Internal.EnumLite {
            private static final /* synthetic */ Type[] $VALUES = null;
            public static final Type TYPE_BOOL = null;
            public static final int TYPE_BOOL_VALUE = 8;
            public static final Type TYPE_BYTES = null;
            public static final int TYPE_BYTES_VALUE = 12;
            public static final Type TYPE_DOUBLE = null;
            public static final int TYPE_DOUBLE_VALUE = 1;
            public static final Type TYPE_ENUM = null;
            public static final int TYPE_ENUM_VALUE = 14;
            public static final Type TYPE_FIXED32 = null;
            public static final int TYPE_FIXED32_VALUE = 7;
            public static final Type TYPE_FIXED64 = null;
            public static final int TYPE_FIXED64_VALUE = 6;
            public static final Type TYPE_FLOAT = null;
            public static final int TYPE_FLOAT_VALUE = 2;
            public static final Type TYPE_GROUP = null;
            public static final int TYPE_GROUP_VALUE = 10;
            public static final Type TYPE_INT32 = null;
            public static final int TYPE_INT32_VALUE = 5;
            public static final Type TYPE_INT64 = null;
            public static final int TYPE_INT64_VALUE = 3;
            public static final Type TYPE_MESSAGE = null;
            public static final int TYPE_MESSAGE_VALUE = 11;
            public static final Type TYPE_SFIXED32 = null;
            public static final int TYPE_SFIXED32_VALUE = 15;
            public static final Type TYPE_SFIXED64 = null;
            public static final int TYPE_SFIXED64_VALUE = 16;
            public static final Type TYPE_SINT32 = null;
            public static final int TYPE_SINT32_VALUE = 17;
            public static final Type TYPE_SINT64 = null;
            public static final int TYPE_SINT64_VALUE = 18;
            public static final Type TYPE_STRING = null;
            public static final int TYPE_STRING_VALUE = 9;
            public static final Type TYPE_UINT32 = null;
            public static final int TYPE_UINT32_VALUE = 13;
            public static final Type TYPE_UINT64 = null;
            public static final int TYPE_UINT64_VALUE = 4;
            private static final Internal.EnumLiteMap<Type> internalValueMap = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type$1 */
            class C12911 implements Internal.EnumLiteMap<Type> {
                C12911() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                public /* bridge */ /* synthetic */ Type findValueByNumber(int i) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i) {
                }
            }

            private static final class TypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = null;

                private TypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                }
            }

            private Type(String str, int i, int i2) {
            }

            public static Type forNumber(int i) {
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            }

            public static Internal.EnumVerifier internalGetVerifier() {
            }

            public static Type valueOf(String str) {
            }

            public static Type[] values() {
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
            }

            @Deprecated
            public static Type valueOf(int i) {
            }
        }

        private FieldDescriptorProto() {
        }

        static /* synthetic */ FieldDescriptorProto access$14000() {
        }

        static /* synthetic */ void access$14100(FieldDescriptorProto fieldDescriptorProto, String str) {
        }

        static /* synthetic */ void access$14200(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$14300(FieldDescriptorProto fieldDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$14400(FieldDescriptorProto fieldDescriptorProto, int i) {
        }

        static /* synthetic */ void access$14500(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$14600(FieldDescriptorProto fieldDescriptorProto, Label label) {
        }

        static /* synthetic */ void access$14700(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$14800(FieldDescriptorProto fieldDescriptorProto, Type type) {
        }

        static /* synthetic */ void access$14900(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$15000(FieldDescriptorProto fieldDescriptorProto, String str) {
        }

        static /* synthetic */ void access$15100(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$15200(FieldDescriptorProto fieldDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$15300(FieldDescriptorProto fieldDescriptorProto, String str) {
        }

        static /* synthetic */ void access$15400(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$15500(FieldDescriptorProto fieldDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$15600(FieldDescriptorProto fieldDescriptorProto, String str) {
        }

        static /* synthetic */ void access$15700(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$15800(FieldDescriptorProto fieldDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$15900(FieldDescriptorProto fieldDescriptorProto, int i) {
        }

        static /* synthetic */ void access$16000(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$16100(FieldDescriptorProto fieldDescriptorProto, String str) {
        }

        static /* synthetic */ void access$16200(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$16300(FieldDescriptorProto fieldDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$16400(FieldDescriptorProto fieldDescriptorProto, FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$16500(FieldDescriptorProto fieldDescriptorProto, FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$16600(FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$16700(FieldDescriptorProto fieldDescriptorProto, boolean z) {
        }

        static /* synthetic */ void access$16800(FieldDescriptorProto fieldDescriptorProto) {
        }

        private void clearDefaultValue() {
        }

        private void clearExtendee() {
        }

        private void clearJsonName() {
        }

        private void clearLabel() {
        }

        private void clearName() {
        }

        private void clearNumber() {
        }

        private void clearOneofIndex() {
        }

        private void clearOptions() {
        }

        private void clearProto3Optional() {
        }

        private void clearType() {
        }

        private void clearTypeName() {
        }

        public static FieldDescriptorProto getDefaultInstance() {
        }

        private void mergeOptions(FieldOptions fieldOptions) {
        }

        public static Builder newBuilder() {
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<FieldDescriptorProto> parser() {
        }

        private void setDefaultValue(String str) {
        }

        private void setDefaultValueBytes(ByteString byteString) {
        }

        private void setExtendee(String str) {
        }

        private void setExtendeeBytes(ByteString byteString) {
        }

        private void setJsonName(String str) {
        }

        private void setJsonNameBytes(ByteString byteString) {
        }

        private void setLabel(Label label) {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setNumber(int i) {
        }

        private void setOneofIndex(int i) {
        }

        private void setOptions(FieldOptions fieldOptions) {
        }

        private void setProto3Optional(boolean z) {
        }

        private void setType(Type type) {
        }

        private void setTypeName(String str) {
        }

        private void setTypeNameBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getDefaultValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getDefaultValueBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getExtendee() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getExtendeeBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getJsonName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getJsonNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public Label getLabel() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public int getNumber() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public int getOneofIndex() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public FieldOptions getOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean getProto3Optional() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public Type getType() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getTypeName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getTypeNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasDefaultValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasExtendee() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasJsonName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasLabel() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasNumber() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasOneofIndex() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasProto3Optional() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasType() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasTypeName() {
        }

        public static Builder newBuilder(FieldDescriptorProto fieldDescriptorProto) {
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface FieldDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getDefaultValue();

        ByteString getDefaultValueBytes();

        String getExtendee();

        ByteString getExtendeeBytes();

        String getJsonName();

        ByteString getJsonNameBytes();

        FieldDescriptorProto.Label getLabel();

        String getName();

        ByteString getNameBytes();

        int getNumber();

        int getOneofIndex();

        FieldOptions getOptions();

        boolean getProto3Optional();

        FieldDescriptorProto.Type getType();

        String getTypeName();

        ByteString getTypeNameBytes();

        boolean hasDefaultValue();

        boolean hasExtendee();

        boolean hasJsonName();

        boolean hasLabel();

        boolean hasName();

        boolean hasNumber();

        boolean hasOneofIndex();

        boolean hasOptions();

        boolean hasProto3Optional();

        boolean hasType();

        boolean hasTypeName();
    }

    public static final class FieldOptions extends GeneratedMessageLite.ExtendableMessage<FieldOptions, Builder> implements FieldOptionsOrBuilder {
        public static final int CTYPE_FIELD_NUMBER = 1;
        private static final FieldOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile Parser<FieldOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private byte memoizedIsInitialized;
        private boolean packed_;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;
        private boolean weak_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FieldOptions, Builder> implements FieldOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearCtype() {
            }

            public Builder clearDeprecated() {
            }

            public Builder clearJstype() {
            }

            public Builder clearLazy() {
            }

            public Builder clearPacked() {
            }

            public Builder clearUninterpretedOption() {
            }

            public Builder clearWeak() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public CType getCtype() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public JSType getJstype() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getLazy() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getPacked() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getWeak() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasCtype() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasJstype() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasLazy() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasPacked() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasWeak() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setCtype(CType cType) {
            }

            public Builder setDeprecated(boolean z) {
            }

            public Builder setJstype(JSType jSType) {
            }

            public Builder setLazy(boolean z) {
            }

            public Builder setPacked(boolean z) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setWeak(boolean z) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class CType implements Internal.EnumLite {
            private static final /* synthetic */ CType[] $VALUES = null;
            public static final CType CORD = null;
            public static final int CORD_VALUE = 1;
            public static final CType STRING = null;
            public static final CType STRING_PIECE = null;
            public static final int STRING_PIECE_VALUE = 2;
            public static final int STRING_VALUE = 0;
            private static final Internal.EnumLiteMap<CType> internalValueMap = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$CType$1 */
            class C12921 implements Internal.EnumLiteMap<CType> {
                C12921() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                public /* bridge */ /* synthetic */ CType findValueByNumber(int i) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CType findValueByNumber(int i) {
                }
            }

            private static final class CTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = null;

                private CTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                }
            }

            private CType(String str, int i, int i2) {
            }

            public static CType forNumber(int i) {
            }

            public static Internal.EnumLiteMap<CType> internalGetValueMap() {
            }

            public static Internal.EnumVerifier internalGetVerifier() {
            }

            public static CType valueOf(String str) {
            }

            public static CType[] values() {
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
            }

            @Deprecated
            public static CType valueOf(int i) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class JSType implements Internal.EnumLite {
            private static final /* synthetic */ JSType[] $VALUES = null;
            public static final JSType JS_NORMAL = null;
            public static final int JS_NORMAL_VALUE = 0;
            public static final JSType JS_NUMBER = null;
            public static final int JS_NUMBER_VALUE = 2;
            public static final JSType JS_STRING = null;
            public static final int JS_STRING_VALUE = 1;
            private static final Internal.EnumLiteMap<JSType> internalValueMap = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$JSType$1 */
            class C12931 implements Internal.EnumLiteMap<JSType> {
                C12931() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                public /* bridge */ /* synthetic */ JSType findValueByNumber(int i) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public JSType findValueByNumber(int i) {
                }
            }

            private static final class JSTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = null;

                private JSTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                }
            }

            private JSType(String str, int i, int i2) {
            }

            public static JSType forNumber(int i) {
            }

            public static Internal.EnumLiteMap<JSType> internalGetValueMap() {
            }

            public static Internal.EnumVerifier internalGetVerifier() {
            }

            public static JSType valueOf(String str) {
            }

            public static JSType[] values() {
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
            }

            @Deprecated
            public static JSType valueOf(int i) {
            }
        }

        private FieldOptions() {
        }

        static /* synthetic */ FieldOptions access$32500() {
        }

        static /* synthetic */ void access$32600(FieldOptions fieldOptions, CType cType) {
        }

        static /* synthetic */ void access$32700(FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$32800(FieldOptions fieldOptions, boolean z) {
        }

        static /* synthetic */ void access$32900(FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$33000(FieldOptions fieldOptions, JSType jSType) {
        }

        static /* synthetic */ void access$33100(FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$33200(FieldOptions fieldOptions, boolean z) {
        }

        static /* synthetic */ void access$33300(FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$33400(FieldOptions fieldOptions, boolean z) {
        }

        static /* synthetic */ void access$33500(FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$33600(FieldOptions fieldOptions, boolean z) {
        }

        static /* synthetic */ void access$33700(FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$33800(FieldOptions fieldOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$33900(FieldOptions fieldOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$34000(FieldOptions fieldOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$34100(FieldOptions fieldOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$34200(FieldOptions fieldOptions) {
        }

        static /* synthetic */ void access$34300(FieldOptions fieldOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearCtype() {
        }

        private void clearDeprecated() {
        }

        private void clearJstype() {
        }

        private void clearLazy() {
        }

        private void clearPacked() {
        }

        private void clearUninterpretedOption() {
        }

        private void clearWeak() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static FieldOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<FieldOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setCtype(CType cType) {
        }

        private void setDeprecated(boolean z) {
        }

        private void setJstype(JSType jSType) {
        }

        private void setLazy(boolean z) {
        }

        private void setPacked(boolean z) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        private void setWeak(boolean z) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public CType getCtype() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public JSType getJstype() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getLazy() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getPacked() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getWeak() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasCtype() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasJstype() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasLazy() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasPacked() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasWeak() {
        }

        public static Builder newBuilder(FieldOptions fieldOptions) {
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static FieldOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static FieldOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FieldOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static FieldOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface FieldOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FieldOptions, FieldOptions.Builder> {
        FieldOptions.CType getCtype();

        boolean getDeprecated();

        FieldOptions.JSType getJstype();

        boolean getLazy();

        boolean getPacked();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean getWeak();

        boolean hasCtype();

        boolean hasDeprecated();

        boolean hasJstype();

        boolean hasLazy();

        boolean hasPacked();

        boolean hasWeak();
    }

    public static final class FileDescriptorProto extends GeneratedMessageLite<FileDescriptorProto, Builder> implements FileDescriptorProtoOrBuilder {
        private static final FileDescriptorProto DEFAULT_INSTANCE = null;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile Parser<FileDescriptorProto> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private Internal.ProtobufList<String> dependency_;
        private Internal.ProtobufList<EnumDescriptorProto> enumType_;
        private Internal.ProtobufList<FieldDescriptorProto> extension_;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<DescriptorProto> messageType_;
        private String name_;
        private FileOptions options_;
        private String package_;
        private Internal.IntList publicDependency_;
        private Internal.ProtobufList<ServiceDescriptorProto> service_;
        private SourceCodeInfo sourceCodeInfo_;
        private String syntax_;
        private Internal.IntList weakDependency_;

        public static final class Builder extends GeneratedMessageLite.Builder<FileDescriptorProto, Builder> implements FileDescriptorProtoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllDependency(Iterable<String> iterable) {
            }

            public Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            }

            public Builder addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            }

            public Builder addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
            }

            public Builder addAllPublicDependency(Iterable<? extends Integer> iterable) {
            }

            public Builder addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
            }

            public Builder addAllWeakDependency(Iterable<? extends Integer> iterable) {
            }

            public Builder addDependency(String str) {
            }

            public Builder addDependencyBytes(ByteString byteString) {
            }

            public Builder addEnumType(EnumDescriptorProto enumDescriptorProto) {
            }

            public Builder addExtension(FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder addMessageType(DescriptorProto descriptorProto) {
            }

            public Builder addPublicDependency(int i) {
            }

            public Builder addService(ServiceDescriptorProto serviceDescriptorProto) {
            }

            public Builder addWeakDependency(int i) {
            }

            public Builder clearDependency() {
            }

            public Builder clearEnumType() {
            }

            public Builder clearExtension() {
            }

            public Builder clearMessageType() {
            }

            public Builder clearName() {
            }

            public Builder clearOptions() {
            }

            public Builder clearPackage() {
            }

            public Builder clearPublicDependency() {
            }

            public Builder clearService() {
            }

            public Builder clearSourceCodeInfo() {
            }

            public Builder clearSyntax() {
            }

            public Builder clearWeakDependency() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getDependency(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getDependencyBytes(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getDependencyCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<String> getDependencyList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public EnumDescriptorProto getEnumType(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getEnumTypeCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<EnumDescriptorProto> getEnumTypeList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public FieldDescriptorProto getExtension(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getExtensionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getExtensionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public DescriptorProto getMessageType(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getMessageTypeCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<DescriptorProto> getMessageTypeList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public FileOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getPackage() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getPackageBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getPublicDependency(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getPublicDependencyCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<Integer> getPublicDependencyList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ServiceDescriptorProto getService(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getServiceCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<ServiceDescriptorProto> getServiceList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public SourceCodeInfo getSourceCodeInfo() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getSyntax() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getSyntaxBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getWeakDependency(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getWeakDependencyCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<Integer> getWeakDependencyList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasPackage() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasSourceCodeInfo() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasSyntax() {
            }

            public Builder mergeOptions(FileOptions fileOptions) {
            }

            public Builder mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            }

            public Builder removeEnumType(int i) {
            }

            public Builder removeExtension(int i) {
            }

            public Builder removeMessageType(int i) {
            }

            public Builder removeService(int i) {
            }

            public Builder setDependency(int i, String str) {
            }

            public Builder setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            }

            public Builder setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder setMessageType(int i, DescriptorProto descriptorProto) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setOptions(FileOptions fileOptions) {
            }

            public Builder setPackage(String str) {
            }

            public Builder setPackageBytes(ByteString byteString) {
            }

            public Builder setPublicDependency(int i, int i2) {
            }

            public Builder setService(int i, ServiceDescriptorProto serviceDescriptorProto) {
            }

            public Builder setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            }

            public Builder setSyntax(String str) {
            }

            public Builder setSyntaxBytes(ByteString byteString) {
            }

            public Builder setWeakDependency(int i, int i2) {
            }

            private Builder() {
            }

            public Builder addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            }

            public Builder addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            }

            public Builder addMessageType(int i, DescriptorProto descriptorProto) {
            }

            public Builder addService(int i, ServiceDescriptorProto serviceDescriptorProto) {
            }

            public Builder setEnumType(int i, EnumDescriptorProto.Builder builder) {
            }

            public Builder setExtension(int i, FieldDescriptorProto.Builder builder) {
            }

            public Builder setMessageType(int i, DescriptorProto.Builder builder) {
            }

            public Builder setOptions(FileOptions.Builder builder) {
            }

            public Builder setService(int i, ServiceDescriptorProto.Builder builder) {
            }

            public Builder setSourceCodeInfo(SourceCodeInfo.Builder builder) {
            }

            public Builder addEnumType(EnumDescriptorProto.Builder builder) {
            }

            public Builder addExtension(FieldDescriptorProto.Builder builder) {
            }

            public Builder addMessageType(DescriptorProto.Builder builder) {
            }

            public Builder addService(ServiceDescriptorProto.Builder builder) {
            }

            public Builder addEnumType(int i, EnumDescriptorProto.Builder builder) {
            }

            public Builder addExtension(int i, FieldDescriptorProto.Builder builder) {
            }

            public Builder addMessageType(int i, DescriptorProto.Builder builder) {
            }

            public Builder addService(int i, ServiceDescriptorProto.Builder builder) {
            }
        }

        private FileDescriptorProto() {
        }

        static /* synthetic */ void access$1000(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$1100(FileDescriptorProto fileDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$1200(FileDescriptorProto fileDescriptorProto, String str) {
        }

        static /* synthetic */ void access$1300(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$1400(FileDescriptorProto fileDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$1500(FileDescriptorProto fileDescriptorProto, int i, String str) {
        }

        static /* synthetic */ void access$1600(FileDescriptorProto fileDescriptorProto, String str) {
        }

        static /* synthetic */ void access$1700(FileDescriptorProto fileDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$1800(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$1900(FileDescriptorProto fileDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$2000(FileDescriptorProto fileDescriptorProto, int i, int i2) {
        }

        static /* synthetic */ void access$2100(FileDescriptorProto fileDescriptorProto, int i) {
        }

        static /* synthetic */ void access$2200(FileDescriptorProto fileDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$2300(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$2400(FileDescriptorProto fileDescriptorProto, int i, int i2) {
        }

        static /* synthetic */ void access$2500(FileDescriptorProto fileDescriptorProto, int i) {
        }

        static /* synthetic */ void access$2600(FileDescriptorProto fileDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$2700(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$2800(FileDescriptorProto fileDescriptorProto, int i, DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$2900(FileDescriptorProto fileDescriptorProto, DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$3000(FileDescriptorProto fileDescriptorProto, int i, DescriptorProto descriptorProto) {
        }

        static /* synthetic */ void access$3100(FileDescriptorProto fileDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$3200(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$3300(FileDescriptorProto fileDescriptorProto, int i) {
        }

        static /* synthetic */ void access$3400(FileDescriptorProto fileDescriptorProto, int i, EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$3500(FileDescriptorProto fileDescriptorProto, EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$3600(FileDescriptorProto fileDescriptorProto, int i, EnumDescriptorProto enumDescriptorProto) {
        }

        static /* synthetic */ void access$3700(FileDescriptorProto fileDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$3800(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$3900(FileDescriptorProto fileDescriptorProto, int i) {
        }

        static /* synthetic */ void access$4000(FileDescriptorProto fileDescriptorProto, int i, ServiceDescriptorProto serviceDescriptorProto) {
        }

        static /* synthetic */ void access$4100(FileDescriptorProto fileDescriptorProto, ServiceDescriptorProto serviceDescriptorProto) {
        }

        static /* synthetic */ void access$4200(FileDescriptorProto fileDescriptorProto, int i, ServiceDescriptorProto serviceDescriptorProto) {
        }

        static /* synthetic */ void access$4300(FileDescriptorProto fileDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$4400(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$4500(FileDescriptorProto fileDescriptorProto, int i) {
        }

        static /* synthetic */ void access$4600(FileDescriptorProto fileDescriptorProto, int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$4700(FileDescriptorProto fileDescriptorProto, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$4800(FileDescriptorProto fileDescriptorProto, int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        static /* synthetic */ void access$4900(FileDescriptorProto fileDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$5000(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$5100(FileDescriptorProto fileDescriptorProto, int i) {
        }

        static /* synthetic */ void access$5200(FileDescriptorProto fileDescriptorProto, FileOptions fileOptions) {
        }

        static /* synthetic */ void access$5300(FileDescriptorProto fileDescriptorProto, FileOptions fileOptions) {
        }

        static /* synthetic */ void access$5400(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$5500(FileDescriptorProto fileDescriptorProto, SourceCodeInfo sourceCodeInfo) {
        }

        static /* synthetic */ void access$5600(FileDescriptorProto fileDescriptorProto, SourceCodeInfo sourceCodeInfo) {
        }

        static /* synthetic */ void access$5700(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$5800(FileDescriptorProto fileDescriptorProto, String str) {
        }

        static /* synthetic */ void access$5900(FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$6000(FileDescriptorProto fileDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ FileDescriptorProto access$800() {
        }

        static /* synthetic */ void access$900(FileDescriptorProto fileDescriptorProto, String str) {
        }

        private void addAllDependency(Iterable<String> iterable) {
        }

        private void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
        }

        private void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
        }

        private void addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
        }

        private void addAllPublicDependency(Iterable<? extends Integer> iterable) {
        }

        private void addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
        }

        private void addAllWeakDependency(Iterable<? extends Integer> iterable) {
        }

        private void addDependency(String str) {
        }

        private void addDependencyBytes(ByteString byteString) {
        }

        private void addEnumType(EnumDescriptorProto enumDescriptorProto) {
        }

        private void addExtension(FieldDescriptorProto fieldDescriptorProto) {
        }

        private void addMessageType(DescriptorProto descriptorProto) {
        }

        private void addPublicDependency(int i) {
        }

        private void addService(ServiceDescriptorProto serviceDescriptorProto) {
        }

        private void addWeakDependency(int i) {
        }

        private void clearDependency() {
        }

        private void clearEnumType() {
        }

        private void clearExtension() {
        }

        private void clearMessageType() {
        }

        private void clearName() {
        }

        private void clearOptions() {
        }

        private void clearPackage() {
        }

        private void clearPublicDependency() {
        }

        private void clearService() {
        }

        private void clearSourceCodeInfo() {
        }

        private void clearSyntax() {
        }

        private void clearWeakDependency() {
        }

        private void ensureDependencyIsMutable() {
        }

        private void ensureEnumTypeIsMutable() {
        }

        private void ensureExtensionIsMutable() {
        }

        private void ensureMessageTypeIsMutable() {
        }

        private void ensurePublicDependencyIsMutable() {
        }

        private void ensureServiceIsMutable() {
        }

        private void ensureWeakDependencyIsMutable() {
        }

        public static FileDescriptorProto getDefaultInstance() {
        }

        private void mergeOptions(FileOptions fileOptions) {
        }

        private void mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
        }

        public static Builder newBuilder() {
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<FileDescriptorProto> parser() {
        }

        private void removeEnumType(int i) {
        }

        private void removeExtension(int i) {
        }

        private void removeMessageType(int i) {
        }

        private void removeService(int i) {
        }

        private void setDependency(int i, String str) {
        }

        private void setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
        }

        private void setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        private void setMessageType(int i, DescriptorProto descriptorProto) {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setOptions(FileOptions fileOptions) {
        }

        private void setPackage(String str) {
        }

        private void setPackageBytes(ByteString byteString) {
        }

        private void setPublicDependency(int i, int i2) {
        }

        private void setService(int i, ServiceDescriptorProto serviceDescriptorProto) {
        }

        private void setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
        }

        private void setSyntax(String str) {
        }

        private void setSyntaxBytes(ByteString byteString) {
        }

        private void setWeakDependency(int i, int i2) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getDependency(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getDependencyBytes(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getDependencyCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<String> getDependencyList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public EnumDescriptorProto getEnumType(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getEnumTypeCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<EnumDescriptorProto> getEnumTypeList() {
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i) {
        }

        public List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public FieldDescriptorProto getExtension(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getExtensionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getExtensionList() {
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i) {
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public DescriptorProto getMessageType(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getMessageTypeCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<DescriptorProto> getMessageTypeList() {
        }

        public DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i) {
        }

        public List<? extends DescriptorProtoOrBuilder> getMessageTypeOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public FileOptions getOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getPackage() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getPackageBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getPublicDependency(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getPublicDependencyCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<Integer> getPublicDependencyList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ServiceDescriptorProto getService(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getServiceCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<ServiceDescriptorProto> getServiceList() {
        }

        public ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i) {
        }

        public List<? extends ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public SourceCodeInfo getSourceCodeInfo() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getSyntax() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getSyntaxBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getWeakDependency(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getWeakDependencyCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<Integer> getWeakDependencyList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasPackage() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasSourceCodeInfo() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasSyntax() {
        }

        public static Builder newBuilder(FileDescriptorProto fileDescriptorProto) {
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
        }

        private void addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
        }

        private void addMessageType(int i, DescriptorProto descriptorProto) {
        }

        private void addService(int i, ServiceDescriptorProto serviceDescriptorProto) {
        }

        public static FileDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static FileDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface FileDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getDependency(int i);

        ByteString getDependencyBytes(int i);

        int getDependencyCount();

        List<String> getDependencyList();

        EnumDescriptorProto getEnumType(int i);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        FieldDescriptorProto getExtension(int i);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        DescriptorProto getMessageType(int i);

        int getMessageTypeCount();

        List<DescriptorProto> getMessageTypeList();

        String getName();

        ByteString getNameBytes();

        FileOptions getOptions();

        String getPackage();

        ByteString getPackageBytes();

        int getPublicDependency(int i);

        int getPublicDependencyCount();

        List<Integer> getPublicDependencyList();

        ServiceDescriptorProto getService(int i);

        int getServiceCount();

        List<ServiceDescriptorProto> getServiceList();

        SourceCodeInfo getSourceCodeInfo();

        String getSyntax();

        ByteString getSyntaxBytes();

        int getWeakDependency(int i);

        int getWeakDependencyCount();

        List<Integer> getWeakDependencyList();

        boolean hasName();

        boolean hasOptions();

        boolean hasPackage();

        boolean hasSourceCodeInfo();

        boolean hasSyntax();
    }

    public static final class FileDescriptorSet extends GeneratedMessageLite<FileDescriptorSet, Builder> implements FileDescriptorSetOrBuilder {
        private static final FileDescriptorSet DEFAULT_INSTANCE = null;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile Parser<FileDescriptorSet> PARSER;
        private Internal.ProtobufList<FileDescriptorProto> file_;
        private byte memoizedIsInitialized;

        public static final class Builder extends GeneratedMessageLite.Builder<FileDescriptorSet, Builder> implements FileDescriptorSetOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
            }

            public Builder addFile(FileDescriptorProto fileDescriptorProto) {
            }

            public Builder clearFile() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public FileDescriptorProto getFile(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public int getFileCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public List<FileDescriptorProto> getFileList() {
            }

            public Builder removeFile(int i) {
            }

            public Builder setFile(int i, FileDescriptorProto fileDescriptorProto) {
            }

            private Builder() {
            }

            public Builder addFile(int i, FileDescriptorProto fileDescriptorProto) {
            }

            public Builder setFile(int i, FileDescriptorProto.Builder builder) {
            }

            public Builder addFile(FileDescriptorProto.Builder builder) {
            }

            public Builder addFile(int i, FileDescriptorProto.Builder builder) {
            }
        }

        private FileDescriptorSet() {
        }

        static /* synthetic */ FileDescriptorSet access$000() {
        }

        static /* synthetic */ void access$100(FileDescriptorSet fileDescriptorSet, int i, FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$200(FileDescriptorSet fileDescriptorSet, FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$300(FileDescriptorSet fileDescriptorSet, int i, FileDescriptorProto fileDescriptorProto) {
        }

        static /* synthetic */ void access$400(FileDescriptorSet fileDescriptorSet, Iterable iterable) {
        }

        static /* synthetic */ void access$500(FileDescriptorSet fileDescriptorSet) {
        }

        static /* synthetic */ void access$600(FileDescriptorSet fileDescriptorSet, int i) {
        }

        private void addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
        }

        private void addFile(FileDescriptorProto fileDescriptorProto) {
        }

        private void clearFile() {
        }

        private void ensureFileIsMutable() {
        }

        public static FileDescriptorSet getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<FileDescriptorSet> parser() {
        }

        private void removeFile(int i) {
        }

        private void setFile(int i, FileDescriptorProto fileDescriptorProto) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public FileDescriptorProto getFile(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public int getFileCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public List<FileDescriptorProto> getFileList() {
        }

        public FileDescriptorProtoOrBuilder getFileOrBuilder(int i) {
        }

        public List<? extends FileDescriptorProtoOrBuilder> getFileOrBuilderList() {
        }

        public static Builder newBuilder(FileDescriptorSet fileDescriptorSet) {
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileDescriptorSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addFile(int i, FileDescriptorProto fileDescriptorProto) {
        }

        public static FileDescriptorSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileDescriptorSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static FileDescriptorSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream) throws IOException {
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface FileDescriptorSetOrBuilder extends MessageLiteOrBuilder {
        FileDescriptorProto getFile(int i);

        int getFileCount();

        List<FileDescriptorProto> getFileList();
    }

    public static final class FileOptions extends GeneratedMessageLite.ExtendableMessage<FileOptions, Builder> implements FileOptionsOrBuilder {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final FileOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile Parser<FileOptions> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccEnableArenas_;
        private boolean ccGenericServices_;
        private String csharpNamespace_;
        private boolean deprecated_;
        private String goPackage_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private String javaOuterClassname_;
        private String javaPackage_;
        private boolean javaStringCheckUtf8_;
        private byte memoizedIsInitialized;
        private String objcClassPrefix_;
        private int optimizeFor_;
        private String phpClassPrefix_;
        private boolean phpGenericServices_;
        private String phpMetadataNamespace_;
        private String phpNamespace_;
        private boolean pyGenericServices_;
        private String rubyPackage_;
        private String swiftPrefix_;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FileOptions, Builder> implements FileOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearCcEnableArenas() {
            }

            public Builder clearCcGenericServices() {
            }

            public Builder clearCsharpNamespace() {
            }

            public Builder clearDeprecated() {
            }

            public Builder clearGoPackage() {
            }

            @Deprecated
            public Builder clearJavaGenerateEqualsAndHash() {
            }

            public Builder clearJavaGenericServices() {
            }

            public Builder clearJavaMultipleFiles() {
            }

            public Builder clearJavaOuterClassname() {
            }

            public Builder clearJavaPackage() {
            }

            public Builder clearJavaStringCheckUtf8() {
            }

            public Builder clearObjcClassPrefix() {
            }

            public Builder clearOptimizeFor() {
            }

            public Builder clearPhpClassPrefix() {
            }

            public Builder clearPhpGenericServices() {
            }

            public Builder clearPhpMetadataNamespace() {
            }

            public Builder clearPhpNamespace() {
            }

            public Builder clearPyGenericServices() {
            }

            public Builder clearRubyPackage() {
            }

            public Builder clearSwiftPrefix() {
            }

            public Builder clearUninterpretedOption() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getCcEnableArenas() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getCcGenericServices() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getCsharpNamespace() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getCsharpNamespaceBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getGoPackage() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getGoPackageBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            @Deprecated
            public boolean getJavaGenerateEqualsAndHash() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaGenericServices() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaMultipleFiles() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getJavaOuterClassname() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getJavaOuterClassnameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getJavaPackage() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getJavaPackageBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaStringCheckUtf8() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getObjcClassPrefix() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getObjcClassPrefixBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public OptimizeMode getOptimizeFor() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpClassPrefix() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpClassPrefixBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getPhpGenericServices() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpMetadataNamespace() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpMetadataNamespaceBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpNamespace() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpNamespaceBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getPyGenericServices() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getRubyPackage() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getRubyPackageBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getSwiftPrefix() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getSwiftPrefixBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCcEnableArenas() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCcGenericServices() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCsharpNamespace() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasGoPackage() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            @Deprecated
            public boolean hasJavaGenerateEqualsAndHash() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaGenericServices() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaMultipleFiles() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaOuterClassname() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaPackage() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaStringCheckUtf8() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasObjcClassPrefix() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasOptimizeFor() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpClassPrefix() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpGenericServices() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpMetadataNamespace() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpNamespace() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPyGenericServices() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasRubyPackage() {
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasSwiftPrefix() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setCcEnableArenas(boolean z) {
            }

            public Builder setCcGenericServices(boolean z) {
            }

            public Builder setCsharpNamespace(String str) {
            }

            public Builder setCsharpNamespaceBytes(ByteString byteString) {
            }

            public Builder setDeprecated(boolean z) {
            }

            public Builder setGoPackage(String str) {
            }

            public Builder setGoPackageBytes(ByteString byteString) {
            }

            @Deprecated
            public Builder setJavaGenerateEqualsAndHash(boolean z) {
            }

            public Builder setJavaGenericServices(boolean z) {
            }

            public Builder setJavaMultipleFiles(boolean z) {
            }

            public Builder setJavaOuterClassname(String str) {
            }

            public Builder setJavaOuterClassnameBytes(ByteString byteString) {
            }

            public Builder setJavaPackage(String str) {
            }

            public Builder setJavaPackageBytes(ByteString byteString) {
            }

            public Builder setJavaStringCheckUtf8(boolean z) {
            }

            public Builder setObjcClassPrefix(String str) {
            }

            public Builder setObjcClassPrefixBytes(ByteString byteString) {
            }

            public Builder setOptimizeFor(OptimizeMode optimizeMode) {
            }

            public Builder setPhpClassPrefix(String str) {
            }

            public Builder setPhpClassPrefixBytes(ByteString byteString) {
            }

            public Builder setPhpGenericServices(boolean z) {
            }

            public Builder setPhpMetadataNamespace(String str) {
            }

            public Builder setPhpMetadataNamespaceBytes(ByteString byteString) {
            }

            public Builder setPhpNamespace(String str) {
            }

            public Builder setPhpNamespaceBytes(ByteString byteString) {
            }

            public Builder setPyGenericServices(boolean z) {
            }

            public Builder setRubyPackage(String str) {
            }

            public Builder setRubyPackageBytes(ByteString byteString) {
            }

            public Builder setSwiftPrefix(String str) {
            }

            public Builder setSwiftPrefixBytes(ByteString byteString) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class OptimizeMode implements Internal.EnumLite {
            private static final /* synthetic */ OptimizeMode[] $VALUES = null;
            public static final OptimizeMode CODE_SIZE = null;
            public static final int CODE_SIZE_VALUE = 2;
            public static final OptimizeMode LITE_RUNTIME = null;
            public static final int LITE_RUNTIME_VALUE = 3;
            public static final OptimizeMode SPEED = null;
            public static final int SPEED_VALUE = 1;
            private static final Internal.EnumLiteMap<OptimizeMode> internalValueMap = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$1 */
            class C12941 implements Internal.EnumLiteMap<OptimizeMode> {
                C12941() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                public /* bridge */ /* synthetic */ OptimizeMode findValueByNumber(int i) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OptimizeMode findValueByNumber(int i) {
                }
            }

            private static final class OptimizeModeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = null;

                private OptimizeModeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                }
            }

            private OptimizeMode(String str, int i, int i2) {
            }

            public static OptimizeMode forNumber(int i) {
            }

            public static Internal.EnumLiteMap<OptimizeMode> internalGetValueMap() {
            }

            public static Internal.EnumVerifier internalGetVerifier() {
            }

            public static OptimizeMode valueOf(String str) {
            }

            public static OptimizeMode[] values() {
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
            }

            @Deprecated
            public static OptimizeMode valueOf(int i) {
            }
        }

        private FileOptions() {
        }

        static /* synthetic */ FileOptions access$25100() {
        }

        static /* synthetic */ void access$25200(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$25300(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$25400(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$25500(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$25600(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$25700(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$25800(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$25900(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$26000(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$26100(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$26200(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$26300(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$26400(FileOptions fileOptions, OptimizeMode optimizeMode) {
        }

        static /* synthetic */ void access$26500(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$26600(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$26700(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$26800(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$26900(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$27000(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$27100(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$27200(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$27300(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$27400(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$27500(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$27600(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$27700(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$27800(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$27900(FileOptions fileOptions, boolean z) {
        }

        static /* synthetic */ void access$28000(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$28100(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$28200(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$28300(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$28400(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$28500(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$28600(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$28700(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$28800(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$28900(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$29000(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$29100(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$29200(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$29300(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$29400(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$29500(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$29600(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$29700(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$29800(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$29900(FileOptions fileOptions, String str) {
        }

        static /* synthetic */ void access$30000(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$30100(FileOptions fileOptions, ByteString byteString) {
        }

        static /* synthetic */ void access$30200(FileOptions fileOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$30300(FileOptions fileOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$30400(FileOptions fileOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$30500(FileOptions fileOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$30600(FileOptions fileOptions) {
        }

        static /* synthetic */ void access$30700(FileOptions fileOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearCcEnableArenas() {
        }

        private void clearCcGenericServices() {
        }

        private void clearCsharpNamespace() {
        }

        private void clearDeprecated() {
        }

        private void clearGoPackage() {
        }

        private void clearJavaGenerateEqualsAndHash() {
        }

        private void clearJavaGenericServices() {
        }

        private void clearJavaMultipleFiles() {
        }

        private void clearJavaOuterClassname() {
        }

        private void clearJavaPackage() {
        }

        private void clearJavaStringCheckUtf8() {
        }

        private void clearObjcClassPrefix() {
        }

        private void clearOptimizeFor() {
        }

        private void clearPhpClassPrefix() {
        }

        private void clearPhpGenericServices() {
        }

        private void clearPhpMetadataNamespace() {
        }

        private void clearPhpNamespace() {
        }

        private void clearPyGenericServices() {
        }

        private void clearRubyPackage() {
        }

        private void clearSwiftPrefix() {
        }

        private void clearUninterpretedOption() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static FileOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<FileOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setCcEnableArenas(boolean z) {
        }

        private void setCcGenericServices(boolean z) {
        }

        private void setCsharpNamespace(String str) {
        }

        private void setCsharpNamespaceBytes(ByteString byteString) {
        }

        private void setDeprecated(boolean z) {
        }

        private void setGoPackage(String str) {
        }

        private void setGoPackageBytes(ByteString byteString) {
        }

        private void setJavaGenerateEqualsAndHash(boolean z) {
        }

        private void setJavaGenericServices(boolean z) {
        }

        private void setJavaMultipleFiles(boolean z) {
        }

        private void setJavaOuterClassname(String str) {
        }

        private void setJavaOuterClassnameBytes(ByteString byteString) {
        }

        private void setJavaPackage(String str) {
        }

        private void setJavaPackageBytes(ByteString byteString) {
        }

        private void setJavaStringCheckUtf8(boolean z) {
        }

        private void setObjcClassPrefix(String str) {
        }

        private void setObjcClassPrefixBytes(ByteString byteString) {
        }

        private void setOptimizeFor(OptimizeMode optimizeMode) {
        }

        private void setPhpClassPrefix(String str) {
        }

        private void setPhpClassPrefixBytes(ByteString byteString) {
        }

        private void setPhpGenericServices(boolean z) {
        }

        private void setPhpMetadataNamespace(String str) {
        }

        private void setPhpMetadataNamespaceBytes(ByteString byteString) {
        }

        private void setPhpNamespace(String str) {
        }

        private void setPhpNamespaceBytes(ByteString byteString) {
        }

        private void setPyGenericServices(boolean z) {
        }

        private void setRubyPackage(String str) {
        }

        private void setRubyPackageBytes(ByteString byteString) {
        }

        private void setSwiftPrefix(String str) {
        }

        private void setSwiftPrefixBytes(ByteString byteString) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getCcEnableArenas() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getCcGenericServices() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getCsharpNamespace() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getCsharpNamespaceBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getGoPackage() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getGoPackageBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaGenericServices() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaMultipleFiles() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getJavaOuterClassname() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getJavaOuterClassnameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getJavaPackage() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getJavaPackageBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaStringCheckUtf8() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getObjcClassPrefix() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getObjcClassPrefixBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public OptimizeMode getOptimizeFor() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpClassPrefix() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpClassPrefixBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getPhpGenericServices() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpMetadataNamespace() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpMetadataNamespaceBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpNamespace() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpNamespaceBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getPyGenericServices() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getRubyPackage() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getRubyPackageBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getSwiftPrefix() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getSwiftPrefixBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCcEnableArenas() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCcGenericServices() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCsharpNamespace() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasGoPackage() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaGenericServices() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaMultipleFiles() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaOuterClassname() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaPackage() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaStringCheckUtf8() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasObjcClassPrefix() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasOptimizeFor() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpClassPrefix() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpGenericServices() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpMetadataNamespace() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpNamespace() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPyGenericServices() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasRubyPackage() {
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasSwiftPrefix() {
        }

        public static Builder newBuilder(FileOptions fileOptions) {
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static FileOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static FileOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static FileOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static FileOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface FileOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FileOptions, FileOptions.Builder> {
        boolean getCcEnableArenas();

        boolean getCcGenericServices();

        String getCsharpNamespace();

        ByteString getCsharpNamespaceBytes();

        boolean getDeprecated();

        String getGoPackage();

        ByteString getGoPackageBytes();

        @Deprecated
        boolean getJavaGenerateEqualsAndHash();

        boolean getJavaGenericServices();

        boolean getJavaMultipleFiles();

        String getJavaOuterClassname();

        ByteString getJavaOuterClassnameBytes();

        String getJavaPackage();

        ByteString getJavaPackageBytes();

        boolean getJavaStringCheckUtf8();

        String getObjcClassPrefix();

        ByteString getObjcClassPrefixBytes();

        FileOptions.OptimizeMode getOptimizeFor();

        String getPhpClassPrefix();

        ByteString getPhpClassPrefixBytes();

        boolean getPhpGenericServices();

        String getPhpMetadataNamespace();

        ByteString getPhpMetadataNamespaceBytes();

        String getPhpNamespace();

        ByteString getPhpNamespaceBytes();

        boolean getPyGenericServices();

        String getRubyPackage();

        ByteString getRubyPackageBytes();

        String getSwiftPrefix();

        ByteString getSwiftPrefixBytes();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasCcEnableArenas();

        boolean hasCcGenericServices();

        boolean hasCsharpNamespace();

        boolean hasDeprecated();

        boolean hasGoPackage();

        @Deprecated
        boolean hasJavaGenerateEqualsAndHash();

        boolean hasJavaGenericServices();

        boolean hasJavaMultipleFiles();

        boolean hasJavaOuterClassname();

        boolean hasJavaPackage();

        boolean hasJavaStringCheckUtf8();

        boolean hasObjcClassPrefix();

        boolean hasOptimizeFor();

        boolean hasPhpClassPrefix();

        boolean hasPhpGenericServices();

        boolean hasPhpMetadataNamespace();

        boolean hasPhpNamespace();

        boolean hasPyGenericServices();

        boolean hasRubyPackage();

        boolean hasSwiftPrefix();
    }

    public static final class GeneratedCodeInfo extends GeneratedMessageLite<GeneratedCodeInfo, Builder> implements GeneratedCodeInfoOrBuilder {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final GeneratedCodeInfo DEFAULT_INSTANCE = null;
        private static volatile Parser<GeneratedCodeInfo> PARSER;
        private Internal.ProtobufList<Annotation> annotation_;

        public static final class Annotation extends GeneratedMessageLite<Annotation, Builder> implements AnnotationOrBuilder {
            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final Annotation DEFAULT_INSTANCE = null;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile Parser<Annotation> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int pathMemoizedSerializedSize;
            private Internal.IntList path_;
            private String sourceFile_;

            public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
                /* synthetic */ Builder(C12891 c12891) {
                }

                public Builder addAllPath(Iterable<? extends Integer> iterable) {
                }

                public Builder addPath(int i) {
                }

                public Builder clearBegin() {
                }

                public Builder clearEnd() {
                }

                public Builder clearPath() {
                }

                public Builder clearSourceFile() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getBegin() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getEnd() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getPath(int i) {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getPathCount() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public List<Integer> getPathList() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public String getSourceFile() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public ByteString getSourceFileBytes() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasBegin() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasEnd() {
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasSourceFile() {
                }

                public Builder setBegin(int i) {
                }

                public Builder setEnd(int i) {
                }

                public Builder setPath(int i, int i2) {
                }

                public Builder setSourceFile(String str) {
                }

                public Builder setSourceFileBytes(ByteString byteString) {
                }

                private Builder() {
                }
            }

            private Annotation() {
            }

            static /* synthetic */ Annotation access$45500() {
            }

            static /* synthetic */ void access$45600(Annotation annotation, int i, int i2) {
            }

            static /* synthetic */ void access$45700(Annotation annotation, int i) {
            }

            static /* synthetic */ void access$45800(Annotation annotation, Iterable iterable) {
            }

            static /* synthetic */ void access$45900(Annotation annotation) {
            }

            static /* synthetic */ void access$46000(Annotation annotation, String str) {
            }

            static /* synthetic */ void access$46100(Annotation annotation) {
            }

            static /* synthetic */ void access$46200(Annotation annotation, ByteString byteString) {
            }

            static /* synthetic */ void access$46300(Annotation annotation, int i) {
            }

            static /* synthetic */ void access$46400(Annotation annotation) {
            }

            static /* synthetic */ void access$46500(Annotation annotation, int i) {
            }

            static /* synthetic */ void access$46600(Annotation annotation) {
            }

            private void addAllPath(Iterable<? extends Integer> iterable) {
            }

            private void addPath(int i) {
            }

            private void clearBegin() {
            }

            private void clearEnd() {
            }

            private void clearPath() {
            }

            private void clearSourceFile() {
            }

            private void ensurePathIsMutable() {
            }

            public static Annotation getDefaultInstance() {
            }

            public static Builder newBuilder() {
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<Annotation> parser() {
            }

            private void setBegin(int i) {
            }

            private void setEnd(int i) {
            }

            private void setPath(int i, int i2) {
            }

            private void setSourceFile(String str) {
            }

            private void setSourceFileBytes(ByteString byteString) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getBegin() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getEnd() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getPath(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getPathCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public List<Integer> getPathList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public String getSourceFile() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public ByteString getSourceFileBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasBegin() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasEnd() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasSourceFile() {
            }

            public static Builder newBuilder(Annotation annotation) {
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Annotation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static Annotation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Annotation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static Annotation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Annotation parseFrom(InputStream inputStream) throws IOException {
            }

            public static Annotation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Annotation parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static Annotation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
            int getBegin();

            int getEnd();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            String getSourceFile();

            ByteString getSourceFileBytes();

            boolean hasBegin();

            boolean hasEnd();

            boolean hasSourceFile();
        }

        public static final class Builder extends GeneratedMessageLite.Builder<GeneratedCodeInfo, Builder> implements GeneratedCodeInfoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
            }

            public Builder addAnnotation(Annotation annotation) {
            }

            public Builder clearAnnotation() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public Annotation getAnnotation(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public int getAnnotationCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public List<Annotation> getAnnotationList() {
            }

            public Builder removeAnnotation(int i) {
            }

            public Builder setAnnotation(int i, Annotation annotation) {
            }

            private Builder() {
            }

            public Builder addAnnotation(int i, Annotation annotation) {
            }

            public Builder setAnnotation(int i, Annotation.Builder builder) {
            }

            public Builder addAnnotation(Annotation.Builder builder) {
            }

            public Builder addAnnotation(int i, Annotation.Builder builder) {
            }
        }

        private GeneratedCodeInfo() {
        }

        static /* synthetic */ GeneratedCodeInfo access$46800() {
        }

        static /* synthetic */ void access$46900(GeneratedCodeInfo generatedCodeInfo, int i, Annotation annotation) {
        }

        static /* synthetic */ void access$47000(GeneratedCodeInfo generatedCodeInfo, Annotation annotation) {
        }

        static /* synthetic */ void access$47100(GeneratedCodeInfo generatedCodeInfo, int i, Annotation annotation) {
        }

        static /* synthetic */ void access$47200(GeneratedCodeInfo generatedCodeInfo, Iterable iterable) {
        }

        static /* synthetic */ void access$47300(GeneratedCodeInfo generatedCodeInfo) {
        }

        static /* synthetic */ void access$47400(GeneratedCodeInfo generatedCodeInfo, int i) {
        }

        private void addAllAnnotation(Iterable<? extends Annotation> iterable) {
        }

        private void addAnnotation(Annotation annotation) {
        }

        private void clearAnnotation() {
        }

        private void ensureAnnotationIsMutable() {
        }

        public static GeneratedCodeInfo getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<GeneratedCodeInfo> parser() {
        }

        private void removeAnnotation(int i) {
        }

        private void setAnnotation(int i, Annotation annotation) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public Annotation getAnnotation(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public int getAnnotationCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public List<Annotation> getAnnotationList() {
        }

        public AnnotationOrBuilder getAnnotationOrBuilder(int i) {
        }

        public List<? extends AnnotationOrBuilder> getAnnotationOrBuilderList() {
        }

        public static Builder newBuilder(GeneratedCodeInfo generatedCodeInfo) {
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addAnnotation(int i, Annotation annotation) {
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream) throws IOException {
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface GeneratedCodeInfoOrBuilder extends MessageLiteOrBuilder {
        GeneratedCodeInfo.Annotation getAnnotation(int i);

        int getAnnotationCount();

        List<GeneratedCodeInfo.Annotation> getAnnotationList();
    }

    public static final class MessageOptions extends GeneratedMessageLite.ExtendableMessage<MessageOptions, Builder> implements MessageOptionsOrBuilder {
        private static final MessageOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile Parser<MessageOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private byte memoizedIsInitialized;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MessageOptions, Builder> implements MessageOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearDeprecated() {
            }

            public Builder clearMapEntry() {
            }

            public Builder clearMessageSetWireFormat() {
            }

            public Builder clearNoStandardDescriptorAccessor() {
            }

            public Builder clearUninterpretedOption() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getMapEntry() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getMessageSetWireFormat() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getNoStandardDescriptorAccessor() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasMapEntry() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasMessageSetWireFormat() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasNoStandardDescriptorAccessor() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setDeprecated(boolean z) {
            }

            public Builder setMapEntry(boolean z) {
            }

            public Builder setMessageSetWireFormat(boolean z) {
            }

            public Builder setNoStandardDescriptorAccessor(boolean z) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        private MessageOptions() {
        }

        static /* synthetic */ MessageOptions access$30900() {
        }

        static /* synthetic */ void access$31000(MessageOptions messageOptions, boolean z) {
        }

        static /* synthetic */ void access$31100(MessageOptions messageOptions) {
        }

        static /* synthetic */ void access$31200(MessageOptions messageOptions, boolean z) {
        }

        static /* synthetic */ void access$31300(MessageOptions messageOptions) {
        }

        static /* synthetic */ void access$31400(MessageOptions messageOptions, boolean z) {
        }

        static /* synthetic */ void access$31500(MessageOptions messageOptions) {
        }

        static /* synthetic */ void access$31600(MessageOptions messageOptions, boolean z) {
        }

        static /* synthetic */ void access$31700(MessageOptions messageOptions) {
        }

        static /* synthetic */ void access$31800(MessageOptions messageOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$31900(MessageOptions messageOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$32000(MessageOptions messageOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$32100(MessageOptions messageOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$32200(MessageOptions messageOptions) {
        }

        static /* synthetic */ void access$32300(MessageOptions messageOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearDeprecated() {
        }

        private void clearMapEntry() {
        }

        private void clearMessageSetWireFormat() {
        }

        private void clearNoStandardDescriptorAccessor() {
        }

        private void clearUninterpretedOption() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static MessageOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<MessageOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setDeprecated(boolean z) {
        }

        private void setMapEntry(boolean z) {
        }

        private void setMessageSetWireFormat(boolean z) {
        }

        private void setNoStandardDescriptorAccessor(boolean z) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getMapEntry() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getMessageSetWireFormat() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getNoStandardDescriptorAccessor() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasMapEntry() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasMessageSetWireFormat() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasNoStandardDescriptorAccessor() {
        }

        public static Builder newBuilder(MessageOptions messageOptions) {
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MessageOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static MessageOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MessageOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static MessageOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MessageOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static MessageOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface MessageOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MessageOptions, MessageOptions.Builder> {
        boolean getDeprecated();

        boolean getMapEntry();

        boolean getMessageSetWireFormat();

        boolean getNoStandardDescriptorAccessor();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasMapEntry();

        boolean hasMessageSetWireFormat();

        boolean hasNoStandardDescriptorAccessor();
    }

    public static final class MethodDescriptorProto extends GeneratedMessageLite<MethodDescriptorProto, Builder> implements MethodDescriptorProtoOrBuilder {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final MethodDescriptorProto DEFAULT_INSTANCE = null;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile Parser<MethodDescriptorProto> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private String inputType_;
        private byte memoizedIsInitialized;
        private String name_;
        private MethodOptions options_;
        private String outputType_;
        private boolean serverStreaming_;

        public static final class Builder extends GeneratedMessageLite.Builder<MethodDescriptorProto, Builder> implements MethodDescriptorProtoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder clearClientStreaming() {
            }

            public Builder clearInputType() {
            }

            public Builder clearName() {
            }

            public Builder clearOptions() {
            }

            public Builder clearOutputType() {
            }

            public Builder clearServerStreaming() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean getClientStreaming() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getInputType() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getInputTypeBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public MethodOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getOutputType() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getOutputTypeBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean getServerStreaming() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasClientStreaming() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasInputType() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasOutputType() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasServerStreaming() {
            }

            public Builder mergeOptions(MethodOptions methodOptions) {
            }

            public Builder setClientStreaming(boolean z) {
            }

            public Builder setInputType(String str) {
            }

            public Builder setInputTypeBytes(ByteString byteString) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setOptions(MethodOptions methodOptions) {
            }

            public Builder setOutputType(String str) {
            }

            public Builder setOutputTypeBytes(ByteString byteString) {
            }

            public Builder setServerStreaming(boolean z) {
            }

            private Builder() {
            }

            public Builder setOptions(MethodOptions.Builder builder) {
            }
        }

        private MethodDescriptorProto() {
        }

        static /* synthetic */ MethodDescriptorProto access$23300() {
        }

        static /* synthetic */ void access$23400(MethodDescriptorProto methodDescriptorProto, String str) {
        }

        static /* synthetic */ void access$23500(MethodDescriptorProto methodDescriptorProto) {
        }

        static /* synthetic */ void access$23600(MethodDescriptorProto methodDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$23700(MethodDescriptorProto methodDescriptorProto, String str) {
        }

        static /* synthetic */ void access$23800(MethodDescriptorProto methodDescriptorProto) {
        }

        static /* synthetic */ void access$23900(MethodDescriptorProto methodDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$24000(MethodDescriptorProto methodDescriptorProto, String str) {
        }

        static /* synthetic */ void access$24100(MethodDescriptorProto methodDescriptorProto) {
        }

        static /* synthetic */ void access$24200(MethodDescriptorProto methodDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$24300(MethodDescriptorProto methodDescriptorProto, MethodOptions methodOptions) {
        }

        static /* synthetic */ void access$24400(MethodDescriptorProto methodDescriptorProto, MethodOptions methodOptions) {
        }

        static /* synthetic */ void access$24500(MethodDescriptorProto methodDescriptorProto) {
        }

        static /* synthetic */ void access$24600(MethodDescriptorProto methodDescriptorProto, boolean z) {
        }

        static /* synthetic */ void access$24700(MethodDescriptorProto methodDescriptorProto) {
        }

        static /* synthetic */ void access$24800(MethodDescriptorProto methodDescriptorProto, boolean z) {
        }

        static /* synthetic */ void access$24900(MethodDescriptorProto methodDescriptorProto) {
        }

        private void clearClientStreaming() {
        }

        private void clearInputType() {
        }

        private void clearName() {
        }

        private void clearOptions() {
        }

        private void clearOutputType() {
        }

        private void clearServerStreaming() {
        }

        public static MethodDescriptorProto getDefaultInstance() {
        }

        private void mergeOptions(MethodOptions methodOptions) {
        }

        public static Builder newBuilder() {
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<MethodDescriptorProto> parser() {
        }

        private void setClientStreaming(boolean z) {
        }

        private void setInputType(String str) {
        }

        private void setInputTypeBytes(ByteString byteString) {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setOptions(MethodOptions methodOptions) {
        }

        private void setOutputType(String str) {
        }

        private void setOutputTypeBytes(ByteString byteString) {
        }

        private void setServerStreaming(boolean z) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean getClientStreaming() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getInputType() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getInputTypeBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public MethodOptions getOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getOutputType() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getOutputTypeBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean getServerStreaming() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasClientStreaming() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasInputType() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasOutputType() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasServerStreaming() {
        }

        public static Builder newBuilder(MethodDescriptorProto methodDescriptorProto) {
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface MethodDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        boolean getClientStreaming();

        String getInputType();

        ByteString getInputTypeBytes();

        String getName();

        ByteString getNameBytes();

        MethodOptions getOptions();

        String getOutputType();

        ByteString getOutputTypeBytes();

        boolean getServerStreaming();

        boolean hasClientStreaming();

        boolean hasInputType();

        boolean hasName();

        boolean hasOptions();

        boolean hasOutputType();

        boolean hasServerStreaming();
    }

    public static final class MethodOptions extends GeneratedMessageLite.ExtendableMessage<MethodOptions, Builder> implements MethodOptionsOrBuilder {
        private static final MethodOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile Parser<MethodOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MethodOptions, Builder> implements MethodOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearDeprecated() {
            }

            public Builder clearIdempotencyLevel() {
            }

            public Builder clearUninterpretedOption() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean getDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public IdempotencyLevel getIdempotencyLevel() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean hasDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean hasIdempotencyLevel() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setDeprecated(boolean z) {
            }

            public Builder setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class IdempotencyLevel implements Internal.EnumLite {
            private static final /* synthetic */ IdempotencyLevel[] $VALUES = null;
            public static final IdempotencyLevel IDEMPOTENCY_UNKNOWN = null;
            public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
            public static final IdempotencyLevel IDEMPOTENT = null;
            public static final int IDEMPOTENT_VALUE = 2;
            public static final IdempotencyLevel NO_SIDE_EFFECTS = null;
            public static final int NO_SIDE_EFFECTS_VALUE = 1;
            private static final Internal.EnumLiteMap<IdempotencyLevel> internalValueMap = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel$1 */
            class C12951 implements Internal.EnumLiteMap<IdempotencyLevel> {
                C12951() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                public /* bridge */ /* synthetic */ IdempotencyLevel findValueByNumber(int i) {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public IdempotencyLevel findValueByNumber(int i) {
                }
            }

            private static final class IdempotencyLevelVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = null;

                private IdempotencyLevelVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                }
            }

            private IdempotencyLevel(String str, int i, int i2) {
            }

            public static IdempotencyLevel forNumber(int i) {
            }

            public static Internal.EnumLiteMap<IdempotencyLevel> internalGetValueMap() {
            }

            public static Internal.EnumVerifier internalGetVerifier() {
            }

            public static IdempotencyLevel valueOf(String str) {
            }

            public static IdempotencyLevel[] values() {
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
            }

            @Deprecated
            public static IdempotencyLevel valueOf(int i) {
            }
        }

        private MethodOptions() {
        }

        static /* synthetic */ MethodOptions access$38500() {
        }

        static /* synthetic */ void access$38600(MethodOptions methodOptions, boolean z) {
        }

        static /* synthetic */ void access$38700(MethodOptions methodOptions) {
        }

        static /* synthetic */ void access$38800(MethodOptions methodOptions, IdempotencyLevel idempotencyLevel) {
        }

        static /* synthetic */ void access$38900(MethodOptions methodOptions) {
        }

        static /* synthetic */ void access$39000(MethodOptions methodOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$39100(MethodOptions methodOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$39200(MethodOptions methodOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$39300(MethodOptions methodOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$39400(MethodOptions methodOptions) {
        }

        static /* synthetic */ void access$39500(MethodOptions methodOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearDeprecated() {
        }

        private void clearIdempotencyLevel() {
        }

        private void clearUninterpretedOption() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static MethodOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<MethodOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setDeprecated(boolean z) {
        }

        private void setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean getDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public IdempotencyLevel getIdempotencyLevel() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean hasDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean hasIdempotencyLevel() {
        }

        public static Builder newBuilder(MethodOptions methodOptions) {
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MethodOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static MethodOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MethodOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static MethodOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MethodOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static MethodOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface MethodOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MethodOptions, MethodOptions.Builder> {
        boolean getDeprecated();

        MethodOptions.IdempotencyLevel getIdempotencyLevel();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasIdempotencyLevel();
    }

    public static final class OneofDescriptorProto extends GeneratedMessageLite<OneofDescriptorProto, Builder> implements OneofDescriptorProtoOrBuilder {
        private static final OneofDescriptorProto DEFAULT_INSTANCE = null;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile Parser<OneofDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private String name_;
        private OneofOptions options_;

        public static final class Builder extends GeneratedMessageLite.Builder<OneofDescriptorProto, Builder> implements OneofDescriptorProtoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder clearName() {
            }

            public Builder clearOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public String getName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public OneofOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public boolean hasName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public boolean hasOptions() {
            }

            public Builder mergeOptions(OneofOptions oneofOptions) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setOptions(OneofOptions oneofOptions) {
            }

            private Builder() {
            }

            public Builder setOptions(OneofOptions.Builder builder) {
            }
        }

        private OneofDescriptorProto() {
        }

        static /* synthetic */ OneofDescriptorProto access$17000() {
        }

        static /* synthetic */ void access$17100(OneofDescriptorProto oneofDescriptorProto, String str) {
        }

        static /* synthetic */ void access$17200(OneofDescriptorProto oneofDescriptorProto) {
        }

        static /* synthetic */ void access$17300(OneofDescriptorProto oneofDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$17400(OneofDescriptorProto oneofDescriptorProto, OneofOptions oneofOptions) {
        }

        static /* synthetic */ void access$17500(OneofDescriptorProto oneofDescriptorProto, OneofOptions oneofOptions) {
        }

        static /* synthetic */ void access$17600(OneofDescriptorProto oneofDescriptorProto) {
        }

        private void clearName() {
        }

        private void clearOptions() {
        }

        public static OneofDescriptorProto getDefaultInstance() {
        }

        private void mergeOptions(OneofOptions oneofOptions) {
        }

        public static Builder newBuilder() {
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<OneofDescriptorProto> parser() {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setOptions(OneofOptions oneofOptions) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public OneofOptions getOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public boolean hasName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public boolean hasOptions() {
        }

        public static Builder newBuilder(OneofDescriptorProto oneofDescriptorProto) {
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface OneofDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        OneofOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class OneofOptions extends GeneratedMessageLite.ExtendableMessage<OneofOptions, Builder> implements OneofOptionsOrBuilder {
        private static final OneofOptions DEFAULT_INSTANCE = null;
        private static volatile Parser<OneofOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<OneofOptions, Builder> implements OneofOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearUninterpretedOption() {
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        private OneofOptions() {
        }

        static /* synthetic */ OneofOptions access$34500() {
        }

        static /* synthetic */ void access$34600(OneofOptions oneofOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$34700(OneofOptions oneofOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$34800(OneofOptions oneofOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$34900(OneofOptions oneofOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$35000(OneofOptions oneofOptions) {
        }

        static /* synthetic */ void access$35100(OneofOptions oneofOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearUninterpretedOption() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static OneofOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<OneofOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        public static Builder newBuilder(OneofOptions oneofOptions) {
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static OneofOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static OneofOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static OneofOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static OneofOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static OneofOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static OneofOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static OneofOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static OneofOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface OneofOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<OneofOptions, OneofOptions.Builder> {
        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();
    }

    public static final class ServiceDescriptorProto extends GeneratedMessageLite<ServiceDescriptorProto, Builder> implements ServiceDescriptorProtoOrBuilder {
        private static final ServiceDescriptorProto DEFAULT_INSTANCE = null;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<ServiceDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<MethodDescriptorProto> method_;
        private String name_;
        private ServiceOptions options_;

        public static final class Builder extends GeneratedMessageLite.Builder<ServiceDescriptorProto, Builder> implements ServiceDescriptorProtoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
            }

            public Builder addMethod(MethodDescriptorProto methodDescriptorProto) {
            }

            public Builder clearMethod() {
            }

            public Builder clearName() {
            }

            public Builder clearOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public MethodDescriptorProto getMethod(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public int getMethodCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public List<MethodDescriptorProto> getMethodList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public String getName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public ServiceOptions getOptions() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public boolean hasName() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public boolean hasOptions() {
            }

            public Builder mergeOptions(ServiceOptions serviceOptions) {
            }

            public Builder removeMethod(int i) {
            }

            public Builder setMethod(int i, MethodDescriptorProto methodDescriptorProto) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setOptions(ServiceOptions serviceOptions) {
            }

            private Builder() {
            }

            public Builder addMethod(int i, MethodDescriptorProto methodDescriptorProto) {
            }

            public Builder setMethod(int i, MethodDescriptorProto.Builder builder) {
            }

            public Builder setOptions(ServiceOptions.Builder builder) {
            }

            public Builder addMethod(MethodDescriptorProto.Builder builder) {
            }

            public Builder addMethod(int i, MethodDescriptorProto.Builder builder) {
            }
        }

        private ServiceDescriptorProto() {
        }

        static /* synthetic */ ServiceDescriptorProto access$21900() {
        }

        static /* synthetic */ void access$22000(ServiceDescriptorProto serviceDescriptorProto, String str) {
        }

        static /* synthetic */ void access$22100(ServiceDescriptorProto serviceDescriptorProto) {
        }

        static /* synthetic */ void access$22200(ServiceDescriptorProto serviceDescriptorProto, ByteString byteString) {
        }

        static /* synthetic */ void access$22300(ServiceDescriptorProto serviceDescriptorProto, int i, MethodDescriptorProto methodDescriptorProto) {
        }

        static /* synthetic */ void access$22400(ServiceDescriptorProto serviceDescriptorProto, MethodDescriptorProto methodDescriptorProto) {
        }

        static /* synthetic */ void access$22500(ServiceDescriptorProto serviceDescriptorProto, int i, MethodDescriptorProto methodDescriptorProto) {
        }

        static /* synthetic */ void access$22600(ServiceDescriptorProto serviceDescriptorProto, Iterable iterable) {
        }

        static /* synthetic */ void access$22700(ServiceDescriptorProto serviceDescriptorProto) {
        }

        static /* synthetic */ void access$22800(ServiceDescriptorProto serviceDescriptorProto, int i) {
        }

        static /* synthetic */ void access$22900(ServiceDescriptorProto serviceDescriptorProto, ServiceOptions serviceOptions) {
        }

        static /* synthetic */ void access$23000(ServiceDescriptorProto serviceDescriptorProto, ServiceOptions serviceOptions) {
        }

        static /* synthetic */ void access$23100(ServiceDescriptorProto serviceDescriptorProto) {
        }

        private void addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
        }

        private void addMethod(MethodDescriptorProto methodDescriptorProto) {
        }

        private void clearMethod() {
        }

        private void clearName() {
        }

        private void clearOptions() {
        }

        private void ensureMethodIsMutable() {
        }

        public static ServiceDescriptorProto getDefaultInstance() {
        }

        private void mergeOptions(ServiceOptions serviceOptions) {
        }

        public static Builder newBuilder() {
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<ServiceDescriptorProto> parser() {
        }

        private void removeMethod(int i) {
        }

        private void setMethod(int i, MethodDescriptorProto methodDescriptorProto) {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setOptions(ServiceOptions serviceOptions) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public MethodDescriptorProto getMethod(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public int getMethodCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public List<MethodDescriptorProto> getMethodList() {
        }

        public MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i) {
        }

        public List<? extends MethodDescriptorProtoOrBuilder> getMethodOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public ServiceOptions getOptions() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public boolean hasName() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public boolean hasOptions() {
        }

        public static Builder newBuilder(ServiceDescriptorProto serviceDescriptorProto) {
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addMethod(int i, MethodDescriptorProto methodDescriptorProto) {
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface ServiceDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        MethodDescriptorProto getMethod(int i);

        int getMethodCount();

        List<MethodDescriptorProto> getMethodList();

        String getName();

        ByteString getNameBytes();

        ServiceOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class ServiceOptions extends GeneratedMessageLite.ExtendableMessage<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
        private static final ServiceOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private static volatile Parser<ServiceOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            }

            public Builder clearDeprecated() {
            }

            public Builder clearUninterpretedOption() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public boolean getDeprecated() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public int getUninterpretedOptionCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public boolean hasDeprecated() {
            }

            public Builder removeUninterpretedOption(int i) {
            }

            public Builder setDeprecated(boolean z) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            private Builder() {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
            }
        }

        private ServiceOptions() {
        }

        static /* synthetic */ ServiceOptions access$37500() {
        }

        static /* synthetic */ void access$37600(ServiceOptions serviceOptions, boolean z) {
        }

        static /* synthetic */ void access$37700(ServiceOptions serviceOptions) {
        }

        static /* synthetic */ void access$37800(ServiceOptions serviceOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$37900(ServiceOptions serviceOptions, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$38000(ServiceOptions serviceOptions, int i, UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$38100(ServiceOptions serviceOptions, Iterable iterable) {
        }

        static /* synthetic */ void access$38200(ServiceOptions serviceOptions) {
        }

        static /* synthetic */ void access$38300(ServiceOptions serviceOptions, int i) {
        }

        private void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
        }

        private void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
        }

        private void clearDeprecated() {
        }

        private void clearUninterpretedOption() {
        }

        private void ensureUninterpretedOptionIsMutable() {
        }

        public static ServiceOptions getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<ServiceOptions> parser() {
        }

        private void removeUninterpretedOption(int i) {
        }

        private void setDeprecated(boolean z) {
        }

        private void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public boolean getDeprecated() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public int getUninterpretedOptionCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public boolean hasDeprecated() {
        }

        public static Builder newBuilder(ServiceOptions serviceOptions) {
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ServiceOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
        }

        public static ServiceOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ServiceOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static ServiceOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static ServiceOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static ServiceOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface ServiceOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<ServiceOptions, ServiceOptions.Builder> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    public static final class SourceCodeInfo extends GeneratedMessageLite<SourceCodeInfo, Builder> implements SourceCodeInfoOrBuilder {
        private static final SourceCodeInfo DEFAULT_INSTANCE = null;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile Parser<SourceCodeInfo> PARSER;
        private Internal.ProtobufList<Location> location_;

        public static final class Builder extends GeneratedMessageLite.Builder<SourceCodeInfo, Builder> implements SourceCodeInfoOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllLocation(Iterable<? extends Location> iterable) {
            }

            public Builder addLocation(Location location) {
            }

            public Builder clearLocation() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public Location getLocation(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public int getLocationCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public List<Location> getLocationList() {
            }

            public Builder removeLocation(int i) {
            }

            public Builder setLocation(int i, Location location) {
            }

            private Builder() {
            }

            public Builder addLocation(int i, Location location) {
            }

            public Builder setLocation(int i, Location.Builder builder) {
            }

            public Builder addLocation(Location.Builder builder) {
            }

            public Builder addLocation(int i, Location.Builder builder) {
            }
        }

        public static final class Location extends GeneratedMessageLite<Location, Builder> implements LocationOrBuilder {
            private static final Location DEFAULT_INSTANCE = null;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile Parser<Location> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private String leadingComments_;
            private Internal.ProtobufList<String> leadingDetachedComments_;
            private int pathMemoizedSerializedSize;
            private Internal.IntList path_;
            private int spanMemoizedSerializedSize;
            private Internal.IntList span_;
            private String trailingComments_;

            public static final class Builder extends GeneratedMessageLite.Builder<Location, Builder> implements LocationOrBuilder {
                /* synthetic */ Builder(C12891 c12891) {
                }

                public Builder addAllLeadingDetachedComments(Iterable<String> iterable) {
                }

                public Builder addAllPath(Iterable<? extends Integer> iterable) {
                }

                public Builder addAllSpan(Iterable<? extends Integer> iterable) {
                }

                public Builder addLeadingDetachedComments(String str) {
                }

                public Builder addLeadingDetachedCommentsBytes(ByteString byteString) {
                }

                public Builder addPath(int i) {
                }

                public Builder addSpan(int i) {
                }

                public Builder clearLeadingComments() {
                }

                public Builder clearLeadingDetachedComments() {
                }

                public Builder clearPath() {
                }

                public Builder clearSpan() {
                }

                public Builder clearTrailingComments() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getLeadingComments() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getLeadingCommentsBytes() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getLeadingDetachedComments(int i) {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getLeadingDetachedCommentsBytes(int i) {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getLeadingDetachedCommentsCount() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<String> getLeadingDetachedCommentsList() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getPath(int i) {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getPathCount() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<Integer> getPathList() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getSpan(int i) {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getSpanCount() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<Integer> getSpanList() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getTrailingComments() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getTrailingCommentsBytes() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public boolean hasLeadingComments() {
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public boolean hasTrailingComments() {
                }

                public Builder setLeadingComments(String str) {
                }

                public Builder setLeadingCommentsBytes(ByteString byteString) {
                }

                public Builder setLeadingDetachedComments(int i, String str) {
                }

                public Builder setPath(int i, int i2) {
                }

                public Builder setSpan(int i, int i2) {
                }

                public Builder setTrailingComments(String str) {
                }

                public Builder setTrailingCommentsBytes(ByteString byteString) {
                }

                private Builder() {
                }
            }

            private Location() {
            }

            static /* synthetic */ Location access$42600() {
            }

            static /* synthetic */ void access$42700(Location location, int i, int i2) {
            }

            static /* synthetic */ void access$42800(Location location, int i) {
            }

            static /* synthetic */ void access$42900(Location location, Iterable iterable) {
            }

            static /* synthetic */ void access$43000(Location location) {
            }

            static /* synthetic */ void access$43100(Location location, int i, int i2) {
            }

            static /* synthetic */ void access$43200(Location location, int i) {
            }

            static /* synthetic */ void access$43300(Location location, Iterable iterable) {
            }

            static /* synthetic */ void access$43400(Location location) {
            }

            static /* synthetic */ void access$43500(Location location, String str) {
            }

            static /* synthetic */ void access$43600(Location location) {
            }

            static /* synthetic */ void access$43700(Location location, ByteString byteString) {
            }

            static /* synthetic */ void access$43800(Location location, String str) {
            }

            static /* synthetic */ void access$43900(Location location) {
            }

            static /* synthetic */ void access$44000(Location location, ByteString byteString) {
            }

            static /* synthetic */ void access$44100(Location location, int i, String str) {
            }

            static /* synthetic */ void access$44200(Location location, String str) {
            }

            static /* synthetic */ void access$44300(Location location, Iterable iterable) {
            }

            static /* synthetic */ void access$44400(Location location) {
            }

            static /* synthetic */ void access$44500(Location location, ByteString byteString) {
            }

            private void addAllLeadingDetachedComments(Iterable<String> iterable) {
            }

            private void addAllPath(Iterable<? extends Integer> iterable) {
            }

            private void addAllSpan(Iterable<? extends Integer> iterable) {
            }

            private void addLeadingDetachedComments(String str) {
            }

            private void addLeadingDetachedCommentsBytes(ByteString byteString) {
            }

            private void addPath(int i) {
            }

            private void addSpan(int i) {
            }

            private void clearLeadingComments() {
            }

            private void clearLeadingDetachedComments() {
            }

            private void clearPath() {
            }

            private void clearSpan() {
            }

            private void clearTrailingComments() {
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
            }

            private void ensurePathIsMutable() {
            }

            private void ensureSpanIsMutable() {
            }

            public static Location getDefaultInstance() {
            }

            public static Builder newBuilder() {
            }

            public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<Location> parser() {
            }

            private void setLeadingComments(String str) {
            }

            private void setLeadingCommentsBytes(ByteString byteString) {
            }

            private void setLeadingDetachedComments(int i, String str) {
            }

            private void setPath(int i, int i2) {
            }

            private void setSpan(int i, int i2) {
            }

            private void setTrailingComments(String str) {
            }

            private void setTrailingCommentsBytes(ByteString byteString) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getLeadingComments() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getLeadingCommentsBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getLeadingDetachedComments(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getLeadingDetachedCommentsBytes(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getLeadingDetachedCommentsCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<String> getLeadingDetachedCommentsList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getPath(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getPathCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<Integer> getPathList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getSpan(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getSpanCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<Integer> getSpanList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getTrailingComments() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getTrailingCommentsBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public boolean hasLeadingComments() {
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public boolean hasTrailingComments() {
            }

            public static Builder newBuilder(Location location) {
            }

            public static Location parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Location parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Location parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static Location parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static Location parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Location parseFrom(InputStream inputStream) throws IOException {
            }

            public static Location parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Location parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static Location parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface LocationOrBuilder extends MessageLiteOrBuilder {
            String getLeadingComments();

            ByteString getLeadingCommentsBytes();

            String getLeadingDetachedComments(int i);

            ByteString getLeadingDetachedCommentsBytes(int i);

            int getLeadingDetachedCommentsCount();

            List<String> getLeadingDetachedCommentsList();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            int getSpan(int i);

            int getSpanCount();

            List<Integer> getSpanList();

            String getTrailingComments();

            ByteString getTrailingCommentsBytes();

            boolean hasLeadingComments();

            boolean hasTrailingComments();
        }

        private SourceCodeInfo() {
        }

        static /* synthetic */ SourceCodeInfo access$44700() {
        }

        static /* synthetic */ void access$44800(SourceCodeInfo sourceCodeInfo, int i, Location location) {
        }

        static /* synthetic */ void access$44900(SourceCodeInfo sourceCodeInfo, Location location) {
        }

        static /* synthetic */ void access$45000(SourceCodeInfo sourceCodeInfo, int i, Location location) {
        }

        static /* synthetic */ void access$45100(SourceCodeInfo sourceCodeInfo, Iterable iterable) {
        }

        static /* synthetic */ void access$45200(SourceCodeInfo sourceCodeInfo) {
        }

        static /* synthetic */ void access$45300(SourceCodeInfo sourceCodeInfo, int i) {
        }

        private void addAllLocation(Iterable<? extends Location> iterable) {
        }

        private void addLocation(Location location) {
        }

        private void clearLocation() {
        }

        private void ensureLocationIsMutable() {
        }

        public static SourceCodeInfo getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<SourceCodeInfo> parser() {
        }

        private void removeLocation(int i) {
        }

        private void setLocation(int i, Location location) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public Location getLocation(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public int getLocationCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public List<Location> getLocationList() {
        }

        public LocationOrBuilder getLocationOrBuilder(int i) {
        }

        public List<? extends LocationOrBuilder> getLocationOrBuilderList() {
        }

        public static Builder newBuilder(SourceCodeInfo sourceCodeInfo) {
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static SourceCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addLocation(int i, Location location) {
        }

        public static SourceCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static SourceCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static SourceCodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface SourceCodeInfoOrBuilder extends MessageLiteOrBuilder {
        SourceCodeInfo.Location getLocation(int i);

        int getLocationCount();

        List<SourceCodeInfo.Location> getLocationList();
    }

    public static final class UninterpretedOption extends GeneratedMessageLite<UninterpretedOption, Builder> implements UninterpretedOptionOrBuilder {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final UninterpretedOption DEFAULT_INSTANCE = null;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile Parser<UninterpretedOption> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private String aggregateValue_;
        private int bitField0_;
        private double doubleValue_;
        private String identifierValue_;
        private byte memoizedIsInitialized;
        private Internal.ProtobufList<NamePart> name_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private ByteString stringValue_;

        public static final class Builder extends GeneratedMessageLite.Builder<UninterpretedOption, Builder> implements UninterpretedOptionOrBuilder {
            /* synthetic */ Builder(C12891 c12891) {
            }

            public Builder addAllName(Iterable<? extends NamePart> iterable) {
            }

            public Builder addName(NamePart namePart) {
            }

            public Builder clearAggregateValue() {
            }

            public Builder clearDoubleValue() {
            }

            public Builder clearIdentifierValue() {
            }

            public Builder clearName() {
            }

            public Builder clearNegativeIntValue() {
            }

            public Builder clearPositiveIntValue() {
            }

            public Builder clearStringValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public String getAggregateValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getAggregateValueBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public double getDoubleValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public String getIdentifierValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getIdentifierValueBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public NamePart getName(int i) {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public int getNameCount() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public List<NamePart> getNameList() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public long getNegativeIntValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public long getPositiveIntValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getStringValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasAggregateValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasDoubleValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasIdentifierValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasNegativeIntValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasPositiveIntValue() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasStringValue() {
            }

            public Builder removeName(int i) {
            }

            public Builder setAggregateValue(String str) {
            }

            public Builder setAggregateValueBytes(ByteString byteString) {
            }

            public Builder setDoubleValue(double d) {
            }

            public Builder setIdentifierValue(String str) {
            }

            public Builder setIdentifierValueBytes(ByteString byteString) {
            }

            public Builder setName(int i, NamePart namePart) {
            }

            public Builder setNegativeIntValue(long j) {
            }

            public Builder setPositiveIntValue(long j) {
            }

            public Builder setStringValue(ByteString byteString) {
            }

            private Builder() {
            }

            public Builder addName(int i, NamePart namePart) {
            }

            public Builder setName(int i, NamePart.Builder builder) {
            }

            public Builder addName(NamePart.Builder builder) {
            }

            public Builder addName(int i, NamePart.Builder builder) {
            }
        }

        public static final class NamePart extends GeneratedMessageLite<NamePart, Builder> implements NamePartOrBuilder {
            private static final NamePart DEFAULT_INSTANCE = null;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile Parser<NamePart> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized;
            private String namePart_;

            public static final class Builder extends GeneratedMessageLite.Builder<NamePart, Builder> implements NamePartOrBuilder {
                /* synthetic */ Builder(C12891 c12891) {
                }

                public Builder clearIsExtension() {
                }

                public Builder clearNamePart() {
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean getIsExtension() {
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public String getNamePart() {
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public ByteString getNamePartBytes() {
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean hasIsExtension() {
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean hasNamePart() {
                }

                public Builder setIsExtension(boolean z) {
                }

                public Builder setNamePart(String str) {
                }

                public Builder setNamePartBytes(ByteString byteString) {
                }

                private Builder() {
                }
            }

            private NamePart() {
            }

            static /* synthetic */ NamePart access$39700() {
            }

            static /* synthetic */ void access$39800(NamePart namePart, String str) {
            }

            static /* synthetic */ void access$39900(NamePart namePart) {
            }

            static /* synthetic */ void access$40000(NamePart namePart, ByteString byteString) {
            }

            static /* synthetic */ void access$40100(NamePart namePart, boolean z) {
            }

            static /* synthetic */ void access$40200(NamePart namePart) {
            }

            private void clearIsExtension() {
            }

            private void clearNamePart() {
            }

            public static NamePart getDefaultInstance() {
            }

            public static Builder newBuilder() {
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<NamePart> parser() {
            }

            private void setIsExtension(boolean z) {
            }

            private void setNamePart(String str) {
            }

            private void setNamePartBytes(ByteString byteString) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean getIsExtension() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public String getNamePart() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public ByteString getNamePartBytes() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean hasIsExtension() {
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean hasNamePart() {
            }

            public static Builder newBuilder(NamePart namePart) {
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static NamePart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static NamePart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static NamePart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static NamePart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static NamePart parseFrom(InputStream inputStream) throws IOException {
            }

            public static NamePart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface NamePartOrBuilder extends MessageLiteOrBuilder {
            boolean getIsExtension();

            String getNamePart();

            ByteString getNamePartBytes();

            boolean hasIsExtension();

            boolean hasNamePart();
        }

        private UninterpretedOption() {
        }

        static /* synthetic */ UninterpretedOption access$40400() {
        }

        static /* synthetic */ void access$40500(UninterpretedOption uninterpretedOption, int i, NamePart namePart) {
        }

        static /* synthetic */ void access$40600(UninterpretedOption uninterpretedOption, NamePart namePart) {
        }

        static /* synthetic */ void access$40700(UninterpretedOption uninterpretedOption, int i, NamePart namePart) {
        }

        static /* synthetic */ void access$40800(UninterpretedOption uninterpretedOption, Iterable iterable) {
        }

        static /* synthetic */ void access$40900(UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$41000(UninterpretedOption uninterpretedOption, int i) {
        }

        static /* synthetic */ void access$41100(UninterpretedOption uninterpretedOption, String str) {
        }

        static /* synthetic */ void access$41200(UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$41300(UninterpretedOption uninterpretedOption, ByteString byteString) {
        }

        static /* synthetic */ void access$41400(UninterpretedOption uninterpretedOption, long j) {
        }

        static /* synthetic */ void access$41500(UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$41600(UninterpretedOption uninterpretedOption, long j) {
        }

        static /* synthetic */ void access$41700(UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$41800(UninterpretedOption uninterpretedOption, double d) {
        }

        static /* synthetic */ void access$41900(UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$42000(UninterpretedOption uninterpretedOption, ByteString byteString) {
        }

        static /* synthetic */ void access$42100(UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$42200(UninterpretedOption uninterpretedOption, String str) {
        }

        static /* synthetic */ void access$42300(UninterpretedOption uninterpretedOption) {
        }

        static /* synthetic */ void access$42400(UninterpretedOption uninterpretedOption, ByteString byteString) {
        }

        private void addAllName(Iterable<? extends NamePart> iterable) {
        }

        private void addName(NamePart namePart) {
        }

        private void clearAggregateValue() {
        }

        private void clearDoubleValue() {
        }

        private void clearIdentifierValue() {
        }

        private void clearName() {
        }

        private void clearNegativeIntValue() {
        }

        private void clearPositiveIntValue() {
        }

        private void clearStringValue() {
        }

        private void ensureNameIsMutable() {
        }

        public static UninterpretedOption getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<UninterpretedOption> parser() {
        }

        private void removeName(int i) {
        }

        private void setAggregateValue(String str) {
        }

        private void setAggregateValueBytes(ByteString byteString) {
        }

        private void setDoubleValue(double d) {
        }

        private void setIdentifierValue(String str) {
        }

        private void setIdentifierValueBytes(ByteString byteString) {
        }

        private void setName(int i, NamePart namePart) {
        }

        private void setNegativeIntValue(long j) {
        }

        private void setPositiveIntValue(long j) {
        }

        private void setStringValue(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public String getAggregateValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getAggregateValueBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public double getDoubleValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public String getIdentifierValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getIdentifierValueBytes() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public NamePart getName(int i) {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public int getNameCount() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public List<NamePart> getNameList() {
        }

        public NamePartOrBuilder getNameOrBuilder(int i) {
        }

        public List<? extends NamePartOrBuilder> getNameOrBuilderList() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public long getNegativeIntValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public long getPositiveIntValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getStringValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasAggregateValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasDoubleValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasIdentifierValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasNegativeIntValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasPositiveIntValue() {
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasStringValue() {
        }

        public static Builder newBuilder(UninterpretedOption uninterpretedOption) {
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static UninterpretedOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addName(int i, NamePart namePart) {
        }

        public static UninterpretedOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static UninterpretedOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static UninterpretedOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static UninterpretedOption parseFrom(InputStream inputStream) throws IOException {
        }

        public static UninterpretedOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface UninterpretedOptionOrBuilder extends MessageLiteOrBuilder {
        String getAggregateValue();

        ByteString getAggregateValueBytes();

        double getDoubleValue();

        String getIdentifierValue();

        ByteString getIdentifierValueBytes();

        UninterpretedOption.NamePart getName(int i);

        int getNameCount();

        List<UninterpretedOption.NamePart> getNameList();

        long getNegativeIntValue();

        long getPositiveIntValue();

        ByteString getStringValue();

        boolean hasAggregateValue();

        boolean hasDoubleValue();

        boolean hasIdentifierValue();

        boolean hasNegativeIntValue();

        boolean hasPositiveIntValue();

        boolean hasStringValue();
    }

    private DescriptorProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
