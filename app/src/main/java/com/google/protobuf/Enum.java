package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Enum extends GeneratedMessageLite<Enum, Builder> implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE = null;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private Internal.ProtobufList<EnumValue> enumvalue_;
    private String name_;
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: com.google.protobuf.Enum$1 */
    static /* synthetic */ class C12991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f146xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Enum, Builder> implements EnumOrBuilder {
        /* synthetic */ Builder(C12991 c12991) {
        }

        public Builder addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addEnumvalue(EnumValue enumValue) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearEnumvalue() {
        }

        public Builder clearName() {
        }

        public Builder clearOptions() {
        }

        public Builder clearSourceContext() {
        }

        public Builder clearSyntax() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int i) {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public List<EnumValue> getEnumvalueList() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public Option getOptions(int i) {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getOptionsCount() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public List<Option> getOptionsList() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public Syntax getSyntax() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
        }

        public Builder removeEnumvalue(int i) {
        }

        public Builder removeOptions(int i) {
        }

        public Builder setEnumvalue(int i, EnumValue enumValue) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setOptions(int i, Option option) {
        }

        public Builder setSourceContext(SourceContext sourceContext) {
        }

        public Builder setSyntax(Syntax syntax) {
        }

        public Builder setSyntaxValue(int i) {
        }

        private Builder() {
        }

        public Builder addEnumvalue(int i, EnumValue enumValue) {
        }

        public Builder addOptions(int i, Option option) {
        }

        public Builder setEnumvalue(int i, EnumValue.Builder builder) {
        }

        public Builder setOptions(int i, Option.Builder builder) {
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
        }

        public Builder addEnumvalue(EnumValue.Builder builder) {
        }

        public Builder addOptions(Option.Builder builder) {
        }

        public Builder addEnumvalue(int i, EnumValue.Builder builder) {
        }

        public Builder addOptions(int i, Option.Builder builder) {
        }
    }

    private Enum() {
    }

    static /* synthetic */ Enum access$000() {
    }

    static /* synthetic */ void access$100(Enum r0, String str) {
    }

    static /* synthetic */ void access$1000(Enum r0, int i, Option option) {
    }

    static /* synthetic */ void access$1100(Enum r0, Option option) {
    }

    static /* synthetic */ void access$1200(Enum r0, int i, Option option) {
    }

    static /* synthetic */ void access$1300(Enum r0, Iterable iterable) {
    }

    static /* synthetic */ void access$1400(Enum r0) {
    }

    static /* synthetic */ void access$1500(Enum r0, int i) {
    }

    static /* synthetic */ void access$1600(Enum r0, SourceContext sourceContext) {
    }

    static /* synthetic */ void access$1700(Enum r0, SourceContext sourceContext) {
    }

    static /* synthetic */ void access$1800(Enum r0) {
    }

    static /* synthetic */ void access$1900(Enum r0, int i) {
    }

    static /* synthetic */ void access$200(Enum r0) {
    }

    static /* synthetic */ void access$2000(Enum r0, Syntax syntax) {
    }

    static /* synthetic */ void access$2100(Enum r0) {
    }

    static /* synthetic */ void access$300(Enum r0, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Enum r0, int i, EnumValue enumValue) {
    }

    static /* synthetic */ void access$500(Enum r0, EnumValue enumValue) {
    }

    static /* synthetic */ void access$600(Enum r0, int i, EnumValue enumValue) {
    }

    static /* synthetic */ void access$700(Enum r0, Iterable iterable) {
    }

    static /* synthetic */ void access$800(Enum r0) {
    }

    static /* synthetic */ void access$900(Enum r0, int i) {
    }

    private void addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addEnumvalue(EnumValue enumValue) {
    }

    private void addOptions(Option option) {
    }

    private void clearEnumvalue() {
    }

    private void clearName() {
    }

    private void clearOptions() {
    }

    private void clearSourceContext() {
    }

    private void clearSyntax() {
    }

    private void ensureEnumvalueIsMutable() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static Enum getDefaultInstance() {
    }

    private void mergeSourceContext(SourceContext sourceContext) {
    }

    public static Builder newBuilder() {
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Enum> parser() {
    }

    private void removeEnumvalue(int i) {
    }

    private void removeOptions(int i) {
    }

    private void setEnumvalue(int i, EnumValue enumValue) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setOptions(int i, Option option) {
    }

    private void setSourceContext(SourceContext sourceContext) {
    }

    private void setSyntax(Syntax syntax) {
    }

    private void setSyntaxValue(int i) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int i) {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public List<EnumValue> getEnumvalueList() {
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
    }

    public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public String getName() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public Option getOptions(int i) {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public int getOptionsCount() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public Syntax getSyntax() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
    }

    public static Builder newBuilder(Enum r1) {
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addEnumvalue(int i, EnumValue enumValue) {
    }

    private void addOptions(int i, Option option) {
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Enum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
    }

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
