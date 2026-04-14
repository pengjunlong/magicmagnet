package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Type extends GeneratedMessageLite<Type, Builder> implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private Internal.ProtobufList<Field> fields_;
    private String name_;
    private Internal.ProtobufList<String> oneofs_;
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: com.google.protobuf.Type$1 */
    static /* synthetic */ class C13371 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f161xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Type, Builder> implements TypeOrBuilder {
        /* synthetic */ Builder(C13371 c13371) {
        }

        public Builder addAllFields(Iterable<? extends Field> iterable) {
        }

        public Builder addAllOneofs(Iterable<String> iterable) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addFields(Field field) {
        }

        public Builder addOneofs(String str) {
        }

        public Builder addOneofsBytes(ByteString byteString) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearFields() {
        }

        public Builder clearName() {
        }

        public Builder clearOneofs() {
        }

        public Builder clearOptions() {
        }

        public Builder clearSourceContext() {
        }

        public Builder clearSyntax() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Field getFields(int i) {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getFieldsCount() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<Field> getFieldsList() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public String getOneofs(int i) {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public ByteString getOneofsBytes(int i) {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOneofsCount() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<String> getOneofsList() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Option getOptions(int i) {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOptionsCount() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<Option> getOptionsList() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Syntax getSyntax() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
        }

        public Builder removeFields(int i) {
        }

        public Builder removeOptions(int i) {
        }

        public Builder setFields(int i, Field field) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setOneofs(int i, String str) {
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

        public Builder addFields(int i, Field field) {
        }

        public Builder addOptions(int i, Option option) {
        }

        public Builder setFields(int i, Field.Builder builder) {
        }

        public Builder setOptions(int i, Option.Builder builder) {
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
        }

        public Builder addFields(Field.Builder builder) {
        }

        public Builder addOptions(Option.Builder builder) {
        }

        public Builder addFields(int i, Field.Builder builder) {
        }

        public Builder addOptions(int i, Option.Builder builder) {
        }
    }

    private Type() {
    }

    static /* synthetic */ Type access$000() {
    }

    static /* synthetic */ void access$100(Type type, String str) {
    }

    static /* synthetic */ void access$1000(Type type, int i, String str) {
    }

    static /* synthetic */ void access$1100(Type type, String str) {
    }

    static /* synthetic */ void access$1200(Type type, Iterable iterable) {
    }

    static /* synthetic */ void access$1300(Type type) {
    }

    static /* synthetic */ void access$1400(Type type, ByteString byteString) {
    }

    static /* synthetic */ void access$1500(Type type, int i, Option option) {
    }

    static /* synthetic */ void access$1600(Type type, Option option) {
    }

    static /* synthetic */ void access$1700(Type type, int i, Option option) {
    }

    static /* synthetic */ void access$1800(Type type, Iterable iterable) {
    }

    static /* synthetic */ void access$1900(Type type) {
    }

    static /* synthetic */ void access$200(Type type) {
    }

    static /* synthetic */ void access$2000(Type type, int i) {
    }

    static /* synthetic */ void access$2100(Type type, SourceContext sourceContext) {
    }

    static /* synthetic */ void access$2200(Type type, SourceContext sourceContext) {
    }

    static /* synthetic */ void access$2300(Type type) {
    }

    static /* synthetic */ void access$2400(Type type, int i) {
    }

    static /* synthetic */ void access$2500(Type type, Syntax syntax) {
    }

    static /* synthetic */ void access$2600(Type type) {
    }

    static /* synthetic */ void access$300(Type type, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Type type, int i, Field field) {
    }

    static /* synthetic */ void access$500(Type type, Field field) {
    }

    static /* synthetic */ void access$600(Type type, int i, Field field) {
    }

    static /* synthetic */ void access$700(Type type, Iterable iterable) {
    }

    static /* synthetic */ void access$800(Type type) {
    }

    static /* synthetic */ void access$900(Type type, int i) {
    }

    private void addAllFields(Iterable<? extends Field> iterable) {
    }

    private void addAllOneofs(Iterable<String> iterable) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addFields(Field field) {
    }

    private void addOneofs(String str) {
    }

    private void addOneofsBytes(ByteString byteString) {
    }

    private void addOptions(Option option) {
    }

    private void clearFields() {
    }

    private void clearName() {
    }

    private void clearOneofs() {
    }

    private void clearOptions() {
    }

    private void clearSourceContext() {
    }

    private void clearSyntax() {
    }

    private void ensureFieldsIsMutable() {
    }

    private void ensureOneofsIsMutable() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static Type getDefaultInstance() {
    }

    private void mergeSourceContext(SourceContext sourceContext) {
    }

    public static Builder newBuilder() {
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Type> parser() {
    }

    private void removeFields(int i) {
    }

    private void removeOptions(int i) {
    }

    private void setFields(int i, Field field) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setOneofs(int i, String str) {
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

    @Override // com.google.protobuf.TypeOrBuilder
    public Field getFields(int i) {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getFieldsCount() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public List<Field> getFieldsList() {
    }

    public FieldOrBuilder getFieldsOrBuilder(int i) {
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public String getName() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public String getOneofs(int i) {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public ByteString getOneofsBytes(int i) {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOneofsCount() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public List<String> getOneofsList() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public Option getOptions(int i) {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOptionsCount() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public Syntax getSyntax() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
    }

    public static Builder newBuilder(Type type) {
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addFields(int i, Field field) {
    }

    private void addOptions(int i, Option option) {
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Type parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Type parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
