package com.google.api;

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
public final class Advice extends GeneratedMessageLite<Advice, Builder> implements AdviceOrBuilder {
    private static final Advice DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<Advice> PARSER;
    private String description_;

    /* renamed from: com.google.api.Advice$1 */
    static /* synthetic */ class C05451 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f48xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Advice, Builder> implements AdviceOrBuilder {
        /* synthetic */ Builder(C05451 c05451) {
        }

        public Builder clearDescription() {
        }

        @Override // com.google.api.AdviceOrBuilder
        public String getDescription() {
        }

        @Override // com.google.api.AdviceOrBuilder
        public ByteString getDescriptionBytes() {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private Advice() {
    }

    static /* synthetic */ Advice access$000() {
    }

    static /* synthetic */ void access$100(Advice advice, String str) {
    }

    static /* synthetic */ void access$200(Advice advice) {
    }

    static /* synthetic */ void access$300(Advice advice, ByteString byteString) {
    }

    private void clearDescription() {
    }

    public static Advice getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Advice parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Advice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Advice> parser() {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.AdviceOrBuilder
    public String getDescription() {
    }

    @Override // com.google.api.AdviceOrBuilder
    public ByteString getDescriptionBytes() {
    }

    public static Builder newBuilder(Advice advice) {
    }

    public static Advice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Advice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Advice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Advice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Advice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Advice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Advice parseFrom(InputStream inputStream) throws IOException {
    }

    public static Advice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Advice parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Advice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
