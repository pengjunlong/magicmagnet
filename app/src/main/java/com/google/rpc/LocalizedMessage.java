package com.google.rpc;

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
public final class LocalizedMessage extends GeneratedMessageLite<LocalizedMessage, Builder> implements LocalizedMessageOrBuilder {
    private static final LocalizedMessage DEFAULT_INSTANCE = null;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<LocalizedMessage> PARSER;
    private String locale_;
    private String message_;

    /* renamed from: com.google.rpc.LocalizedMessage$1 */
    static /* synthetic */ class C13571 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f169xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LocalizedMessage, Builder> implements LocalizedMessageOrBuilder {
        /* synthetic */ Builder(C13571 c13571) {
        }

        public Builder clearLocale() {
        }

        public Builder clearMessage() {
        }

        @Override // com.google.rpc.LocalizedMessageOrBuilder
        public String getLocale() {
        }

        @Override // com.google.rpc.LocalizedMessageOrBuilder
        public ByteString getLocaleBytes() {
        }

        @Override // com.google.rpc.LocalizedMessageOrBuilder
        public String getMessage() {
        }

        @Override // com.google.rpc.LocalizedMessageOrBuilder
        public ByteString getMessageBytes() {
        }

        public Builder setLocale(String str) {
        }

        public Builder setLocaleBytes(ByteString byteString) {
        }

        public Builder setMessage(String str) {
        }

        public Builder setMessageBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private LocalizedMessage() {
    }

    static /* synthetic */ LocalizedMessage access$000() {
    }

    static /* synthetic */ void access$100(LocalizedMessage localizedMessage, String str) {
    }

    static /* synthetic */ void access$200(LocalizedMessage localizedMessage) {
    }

    static /* synthetic */ void access$300(LocalizedMessage localizedMessage, ByteString byteString) {
    }

    static /* synthetic */ void access$400(LocalizedMessage localizedMessage, String str) {
    }

    static /* synthetic */ void access$500(LocalizedMessage localizedMessage) {
    }

    static /* synthetic */ void access$600(LocalizedMessage localizedMessage, ByteString byteString) {
    }

    private void clearLocale() {
    }

    private void clearMessage() {
    }

    public static LocalizedMessage getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static LocalizedMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<LocalizedMessage> parser() {
    }

    private void setLocale(String str) {
    }

    private void setLocaleBytes(ByteString byteString) {
    }

    private void setMessage(String str) {
    }

    private void setMessageBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.LocalizedMessageOrBuilder
    public String getLocale() {
    }

    @Override // com.google.rpc.LocalizedMessageOrBuilder
    public ByteString getLocaleBytes() {
    }

    @Override // com.google.rpc.LocalizedMessageOrBuilder
    public String getMessage() {
    }

    @Override // com.google.rpc.LocalizedMessageOrBuilder
    public ByteString getMessageBytes() {
    }

    public static Builder newBuilder(LocalizedMessage localizedMessage) {
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static LocalizedMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LocalizedMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static LocalizedMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LocalizedMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static LocalizedMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LocalizedMessage parseFrom(InputStream inputStream) throws IOException {
    }

    public static LocalizedMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static LocalizedMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static LocalizedMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
