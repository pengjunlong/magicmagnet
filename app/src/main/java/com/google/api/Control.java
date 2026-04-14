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
public final class Control extends GeneratedMessageLite<Control, Builder> implements ControlOrBuilder {
    private static final Control DEFAULT_INSTANCE = null;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile Parser<Control> PARSER;
    private String environment_;

    /* renamed from: com.google.api.Control$1 */
    static /* synthetic */ class C05581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f59xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Control, Builder> implements ControlOrBuilder {
        /* synthetic */ Builder(C05581 c05581) {
        }

        public Builder clearEnvironment() {
        }

        @Override // com.google.api.ControlOrBuilder
        public String getEnvironment() {
        }

        @Override // com.google.api.ControlOrBuilder
        public ByteString getEnvironmentBytes() {
        }

        public Builder setEnvironment(String str) {
        }

        public Builder setEnvironmentBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private Control() {
    }

    static /* synthetic */ Control access$000() {
    }

    static /* synthetic */ void access$100(Control control, String str) {
    }

    static /* synthetic */ void access$200(Control control) {
    }

    static /* synthetic */ void access$300(Control control, ByteString byteString) {
    }

    private void clearEnvironment() {
    }

    public static Control getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Control parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Control parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Control> parser() {
    }

    private void setEnvironment(String str) {
    }

    private void setEnvironmentBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.ControlOrBuilder
    public String getEnvironment() {
    }

    @Override // com.google.api.ControlOrBuilder
    public ByteString getEnvironmentBytes() {
    }

    public static Builder newBuilder(Control control) {
    }

    public static Control parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Control parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Control parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Control parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Control parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Control parseFrom(InputStream inputStream) throws IOException {
    }

    public static Control parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Control parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Control parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
