package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Option extends GeneratedMessageLite<Option, Builder> implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_;
    private Any value_;

    /* renamed from: com.google.protobuf.Option$1 */
    static /* synthetic */ class C13251 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f156xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Option, Builder> implements OptionOrBuilder {
        /* synthetic */ Builder(C13251 c13251) {
        }

        public Builder clearName() {
        }

        public Builder clearValue() {
        }

        @Override // com.google.protobuf.OptionOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.OptionOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.OptionOrBuilder
        public Any getValue() {
        }

        @Override // com.google.protobuf.OptionOrBuilder
        public boolean hasValue() {
        }

        public Builder mergeValue(Any any) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setValue(Any any) {
        }

        private Builder() {
        }

        public Builder setValue(Any.Builder builder) {
        }
    }

    private Option() {
    }

    static /* synthetic */ Option access$000() {
    }

    static /* synthetic */ void access$100(Option option, String str) {
    }

    static /* synthetic */ void access$200(Option option) {
    }

    static /* synthetic */ void access$300(Option option, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Option option, Any any) {
    }

    static /* synthetic */ void access$500(Option option, Any any) {
    }

    static /* synthetic */ void access$600(Option option) {
    }

    private void clearName() {
    }

    private void clearValue() {
    }

    public static Option getDefaultInstance() {
    }

    private void mergeValue(Any any) {
    }

    public static Builder newBuilder() {
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Option> parser() {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setValue(Any any) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.OptionOrBuilder
    public String getName() {
    }

    @Override // com.google.protobuf.OptionOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.protobuf.OptionOrBuilder
    public Any getValue() {
    }

    @Override // com.google.protobuf.OptionOrBuilder
    public boolean hasValue() {
    }

    public static Builder newBuilder(Option option) {
    }

    public static Option parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Option parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
    }

    public static Option parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Option parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Option parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
