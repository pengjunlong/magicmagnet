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
public final class AuthRequirement extends GeneratedMessageLite<AuthRequirement, Builder> implements AuthRequirementOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final AuthRequirement DEFAULT_INSTANCE = null;
    private static volatile Parser<AuthRequirement> PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String audiences_;
    private String providerId_;

    /* renamed from: com.google.api.AuthRequirement$1 */
    static /* synthetic */ class C05471 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f50xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthRequirement, Builder> implements AuthRequirementOrBuilder {
        /* synthetic */ Builder(C05471 c05471) {
        }

        public Builder clearAudiences() {
        }

        public Builder clearProviderId() {
        }

        @Override // com.google.api.AuthRequirementOrBuilder
        public String getAudiences() {
        }

        @Override // com.google.api.AuthRequirementOrBuilder
        public ByteString getAudiencesBytes() {
        }

        @Override // com.google.api.AuthRequirementOrBuilder
        public String getProviderId() {
        }

        @Override // com.google.api.AuthRequirementOrBuilder
        public ByteString getProviderIdBytes() {
        }

        public Builder setAudiences(String str) {
        }

        public Builder setAudiencesBytes(ByteString byteString) {
        }

        public Builder setProviderId(String str) {
        }

        public Builder setProviderIdBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private AuthRequirement() {
    }

    static /* synthetic */ AuthRequirement access$000() {
    }

    static /* synthetic */ void access$100(AuthRequirement authRequirement, String str) {
    }

    static /* synthetic */ void access$200(AuthRequirement authRequirement) {
    }

    static /* synthetic */ void access$300(AuthRequirement authRequirement, ByteString byteString) {
    }

    static /* synthetic */ void access$400(AuthRequirement authRequirement, String str) {
    }

    static /* synthetic */ void access$500(AuthRequirement authRequirement) {
    }

    static /* synthetic */ void access$600(AuthRequirement authRequirement, ByteString byteString) {
    }

    private void clearAudiences() {
    }

    private void clearProviderId() {
    }

    public static AuthRequirement getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AuthRequirement> parser() {
    }

    private void setAudiences(String str) {
    }

    private void setAudiencesBytes(ByteString byteString) {
    }

    private void setProviderId(String str) {
    }

    private void setProviderIdBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.AuthRequirementOrBuilder
    public String getAudiences() {
    }

    @Override // com.google.api.AuthRequirementOrBuilder
    public ByteString getAudiencesBytes() {
    }

    @Override // com.google.api.AuthRequirementOrBuilder
    public String getProviderId() {
    }

    @Override // com.google.api.AuthRequirementOrBuilder
    public ByteString getProviderIdBytes() {
    }

    public static Builder newBuilder(AuthRequirement authRequirement) {
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthRequirement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static AuthRequirement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthRequirement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AuthRequirement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthRequirement parseFrom(InputStream inputStream) throws IOException {
    }

    public static AuthRequirement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthRequirement parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AuthRequirement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
