package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class EnumValue extends GeneratedMessageLite<EnumValue, Builder> implements EnumValueOrBuilder {
    private static final EnumValue DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<EnumValue> PARSER;
    private String name_;
    private int number_;
    private Internal.ProtobufList<Option> options_;

    /* renamed from: com.google.protobuf.EnumValue$1 */
    static /* synthetic */ class C13001 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f147xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EnumValue, Builder> implements EnumValueOrBuilder {
        /* synthetic */ Builder(C13001 c13001) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearName() {
        }

        public Builder clearNumber() {
        }

        public Builder clearOptions() {
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public int getNumber() {
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public Option getOptions(int i) {
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public List<Option> getOptionsList() {
        }

        public Builder removeOptions(int i) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setNumber(int i) {
        }

        public Builder setOptions(int i, Option option) {
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

    private EnumValue() {
    }

    static /* synthetic */ EnumValue access$000() {
    }

    static /* synthetic */ void access$100(EnumValue enumValue, String str) {
    }

    static /* synthetic */ void access$1000(EnumValue enumValue) {
    }

    static /* synthetic */ void access$1100(EnumValue enumValue, int i) {
    }

    static /* synthetic */ void access$200(EnumValue enumValue) {
    }

    static /* synthetic */ void access$300(EnumValue enumValue, ByteString byteString) {
    }

    static /* synthetic */ void access$400(EnumValue enumValue, int i) {
    }

    static /* synthetic */ void access$500(EnumValue enumValue) {
    }

    static /* synthetic */ void access$600(EnumValue enumValue, int i, Option option) {
    }

    static /* synthetic */ void access$700(EnumValue enumValue, Option option) {
    }

    static /* synthetic */ void access$800(EnumValue enumValue, int i, Option option) {
    }

    static /* synthetic */ void access$900(EnumValue enumValue, Iterable iterable) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addOptions(Option option) {
    }

    private void clearName() {
    }

    private void clearNumber() {
    }

    private void clearOptions() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static EnumValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<EnumValue> parser() {
    }

    private void removeOptions(int i) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setNumber(int i) {
    }

    private void setOptions(int i, Option option) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public String getName() {
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public int getNumber() {
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public Option getOptions(int i) {
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    public static Builder newBuilder(EnumValue enumValue) {
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static EnumValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addOptions(int i, Option option) {
    }

    public static EnumValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static EnumValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static EnumValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static EnumValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
