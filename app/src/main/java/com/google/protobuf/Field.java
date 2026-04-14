package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Field extends GeneratedMessageLite<Field, Builder> implements FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE = null;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile Parser<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private String defaultValue_;
    private String jsonName_;
    private int kind_;
    private String name_;
    private int number_;
    private int oneofIndex_;
    private Internal.ProtobufList<Option> options_;
    private boolean packed_;
    private String typeUrl_;

    /* renamed from: com.google.protobuf.Field$1 */
    static /* synthetic */ class C13021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f148xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Field, Builder> implements FieldOrBuilder {
        /* synthetic */ Builder(C13021 c13021) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearCardinality() {
        }

        public Builder clearDefaultValue() {
        }

        public Builder clearJsonName() {
        }

        public Builder clearKind() {
        }

        public Builder clearName() {
        }

        public Builder clearNumber() {
        }

        public Builder clearOneofIndex() {
        }

        public Builder clearOptions() {
        }

        public Builder clearPacked() {
        }

        public Builder clearTypeUrl() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public Cardinality getCardinality() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getCardinalityValue() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public String getDefaultValue() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public ByteString getDefaultValueBytes() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public String getJsonName() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public ByteString getJsonNameBytes() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public Kind getKind() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getKindValue() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getNumber() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getOneofIndex() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public Option getOptions(int i) {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public int getOptionsCount() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public List<Option> getOptionsList() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public boolean getPacked() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public String getTypeUrl() {
        }

        @Override // com.google.protobuf.FieldOrBuilder
        public ByteString getTypeUrlBytes() {
        }

        public Builder removeOptions(int i) {
        }

        public Builder setCardinality(Cardinality cardinality) {
        }

        public Builder setCardinalityValue(int i) {
        }

        public Builder setDefaultValue(String str) {
        }

        public Builder setDefaultValueBytes(ByteString byteString) {
        }

        public Builder setJsonName(String str) {
        }

        public Builder setJsonNameBytes(ByteString byteString) {
        }

        public Builder setKind(Kind kind) {
        }

        public Builder setKindValue(int i) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setNumber(int i) {
        }

        public Builder setOneofIndex(int i) {
        }

        public Builder setOptions(int i, Option option) {
        }

        public Builder setPacked(boolean z) {
        }

        public Builder setTypeUrl(String str) {
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addOptions(int i, Option option) {
        }

        public Builder setOptions(int i, Option.Builder builder) {
        }

        public Builder addOptions(Option.Builder builder) {
        }

        public Builder addOptions(int i, Option.Builder builder) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Cardinality implements Internal.EnumLite {
        private static final /* synthetic */ Cardinality[] $VALUES = null;
        public static final Cardinality CARDINALITY_OPTIONAL = null;
        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final Cardinality CARDINALITY_REPEATED = null;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final Cardinality CARDINALITY_REQUIRED = null;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final Cardinality CARDINALITY_UNKNOWN = null;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        public static final Cardinality UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<Cardinality> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.protobuf.Field$Cardinality$1 */
        static class C13031 implements Internal.EnumLiteMap<Cardinality> {
            C13031() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ Cardinality findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Cardinality findValueByNumber(int i) {
            }
        }

        private static final class CardinalityVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private CardinalityVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private Cardinality(String str, int i, int i2) {
        }

        public static Cardinality forNumber(int i) {
        }

        public static Internal.EnumLiteMap<Cardinality> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static Cardinality valueOf(String str) {
        }

        public static Cardinality[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static Cardinality valueOf(int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Kind implements Internal.EnumLite {
        private static final /* synthetic */ Kind[] $VALUES = null;
        public static final Kind TYPE_BOOL = null;
        public static final int TYPE_BOOL_VALUE = 8;
        public static final Kind TYPE_BYTES = null;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final Kind TYPE_DOUBLE = null;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final Kind TYPE_ENUM = null;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final Kind TYPE_FIXED32 = null;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final Kind TYPE_FIXED64 = null;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final Kind TYPE_FLOAT = null;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final Kind TYPE_GROUP = null;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final Kind TYPE_INT32 = null;
        public static final int TYPE_INT32_VALUE = 5;
        public static final Kind TYPE_INT64 = null;
        public static final int TYPE_INT64_VALUE = 3;
        public static final Kind TYPE_MESSAGE = null;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final Kind TYPE_SFIXED32 = null;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final Kind TYPE_SFIXED64 = null;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final Kind TYPE_SINT32 = null;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final Kind TYPE_SINT64 = null;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final Kind TYPE_STRING = null;
        public static final int TYPE_STRING_VALUE = 9;
        public static final Kind TYPE_UINT32 = null;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final Kind TYPE_UINT64 = null;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final Kind TYPE_UNKNOWN = null;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        public static final Kind UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<Kind> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.protobuf.Field$Kind$1 */
        static class C13041 implements Internal.EnumLiteMap<Kind> {
            C13041() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ Kind findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Kind findValueByNumber(int i) {
            }
        }

        private static final class KindVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private KindVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private Kind(String str, int i, int i2) {
        }

        public static Kind forNumber(int i) {
        }

        public static Internal.EnumLiteMap<Kind> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static Kind valueOf(String str) {
        }

        public static Kind[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static Kind valueOf(int i) {
        }
    }

    private Field() {
    }

    static /* synthetic */ Field access$000() {
    }

    static /* synthetic */ void access$100(Field field, int i) {
    }

    static /* synthetic */ void access$1000(Field field) {
    }

    static /* synthetic */ void access$1100(Field field, ByteString byteString) {
    }

    static /* synthetic */ void access$1200(Field field, String str) {
    }

    static /* synthetic */ void access$1300(Field field) {
    }

    static /* synthetic */ void access$1400(Field field, ByteString byteString) {
    }

    static /* synthetic */ void access$1500(Field field, int i) {
    }

    static /* synthetic */ void access$1600(Field field) {
    }

    static /* synthetic */ void access$1700(Field field, boolean z) {
    }

    static /* synthetic */ void access$1800(Field field) {
    }

    static /* synthetic */ void access$1900(Field field, int i, Option option) {
    }

    static /* synthetic */ void access$200(Field field, Kind kind) {
    }

    static /* synthetic */ void access$2000(Field field, Option option) {
    }

    static /* synthetic */ void access$2100(Field field, int i, Option option) {
    }

    static /* synthetic */ void access$2200(Field field, Iterable iterable) {
    }

    static /* synthetic */ void access$2300(Field field) {
    }

    static /* synthetic */ void access$2400(Field field, int i) {
    }

    static /* synthetic */ void access$2500(Field field, String str) {
    }

    static /* synthetic */ void access$2600(Field field) {
    }

    static /* synthetic */ void access$2700(Field field, ByteString byteString) {
    }

    static /* synthetic */ void access$2800(Field field, String str) {
    }

    static /* synthetic */ void access$2900(Field field) {
    }

    static /* synthetic */ void access$300(Field field) {
    }

    static /* synthetic */ void access$3000(Field field, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Field field, int i) {
    }

    static /* synthetic */ void access$500(Field field, Cardinality cardinality) {
    }

    static /* synthetic */ void access$600(Field field) {
    }

    static /* synthetic */ void access$700(Field field, int i) {
    }

    static /* synthetic */ void access$800(Field field) {
    }

    static /* synthetic */ void access$900(Field field, String str) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addOptions(Option option) {
    }

    private void clearCardinality() {
    }

    private void clearDefaultValue() {
    }

    private void clearJsonName() {
    }

    private void clearKind() {
    }

    private void clearName() {
    }

    private void clearNumber() {
    }

    private void clearOneofIndex() {
    }

    private void clearOptions() {
    }

    private void clearPacked() {
    }

    private void clearTypeUrl() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static Field getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Field> parser() {
    }

    private void removeOptions(int i) {
    }

    private void setCardinality(Cardinality cardinality) {
    }

    private void setCardinalityValue(int i) {
    }

    private void setDefaultValue(String str) {
    }

    private void setDefaultValueBytes(ByteString byteString) {
    }

    private void setJsonName(String str) {
    }

    private void setJsonNameBytes(ByteString byteString) {
    }

    private void setKind(Kind kind) {
    }

    private void setKindValue(int i) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setNumber(int i) {
    }

    private void setOneofIndex(int i) {
    }

    private void setOptions(int i, Option option) {
    }

    private void setPacked(boolean z) {
    }

    private void setTypeUrl(String str) {
    }

    private void setTypeUrlBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public Cardinality getCardinality() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getCardinalityValue() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public String getDefaultValue() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public ByteString getDefaultValueBytes() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public String getJsonName() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public ByteString getJsonNameBytes() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public Kind getKind() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getKindValue() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public String getName() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getNumber() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getOneofIndex() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public Option getOptions(int i) {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public int getOptionsCount() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public boolean getPacked() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public String getTypeUrl() {
    }

    @Override // com.google.protobuf.FieldOrBuilder
    public ByteString getTypeUrlBytes() {
    }

    public static Builder newBuilder(Field field) {
    }

    public static Field parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Field parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Field parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addOptions(int i, Option option) {
    }

    public static Field parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Field parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Field parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
    }

    public static Field parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Field parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Field parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
