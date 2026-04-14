package com.google.cloud.audit;

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
public final class AuthenticationInfo extends GeneratedMessageLite<AuthenticationInfo, Builder> implements AuthenticationInfoOrBuilder {
    private static final AuthenticationInfo DEFAULT_INSTANCE = null;
    private static volatile Parser<AuthenticationInfo> PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_;

    /* renamed from: com.google.cloud.audit.AuthenticationInfo$1 */
    static /* synthetic */ class C06011 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f95xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthenticationInfo, Builder> implements AuthenticationInfoOrBuilder {
        /* synthetic */ Builder(C06011 c06011) {
        }

        public Builder clearPrincipalEmail() {
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public String getPrincipalEmail() {
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public ByteString getPrincipalEmailBytes() {
        }

        public Builder setPrincipalEmail(String str) {
        }

        public Builder setPrincipalEmailBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private AuthenticationInfo() {
    }

    static /* synthetic */ AuthenticationInfo access$000() {
    }

    static /* synthetic */ void access$100(AuthenticationInfo authenticationInfo, String str) {
    }

    static /* synthetic */ void access$200(AuthenticationInfo authenticationInfo) {
    }

    static /* synthetic */ void access$300(AuthenticationInfo authenticationInfo, ByteString byteString) {
    }

    private void clearPrincipalEmail() {
    }

    public static AuthenticationInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AuthenticationInfo> parser() {
    }

    private void setPrincipalEmail(String str) {
    }

    private void setPrincipalEmailBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public String getPrincipalEmail() {
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public ByteString getPrincipalEmailBytes() {
    }

    public static Builder newBuilder(AuthenticationInfo authenticationInfo) {
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthenticationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static AuthenticationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthenticationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AuthenticationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthenticationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AuthenticationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
