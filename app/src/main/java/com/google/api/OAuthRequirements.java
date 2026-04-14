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
public final class OAuthRequirements extends GeneratedMessageLite<OAuthRequirements, Builder> implements OAuthRequirementsOrBuilder {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    private static final OAuthRequirements DEFAULT_INSTANCE = null;
    private static volatile Parser<OAuthRequirements> PARSER;
    private String canonicalScopes_;

    /* renamed from: com.google.api.OAuthRequirements$1 */
    static /* synthetic */ class C05831 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f79xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<OAuthRequirements, Builder> implements OAuthRequirementsOrBuilder {
        /* synthetic */ Builder(C05831 c05831) {
        }

        public Builder clearCanonicalScopes() {
        }

        @Override // com.google.api.OAuthRequirementsOrBuilder
        public String getCanonicalScopes() {
        }

        @Override // com.google.api.OAuthRequirementsOrBuilder
        public ByteString getCanonicalScopesBytes() {
        }

        public Builder setCanonicalScopes(String str) {
        }

        public Builder setCanonicalScopesBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private OAuthRequirements() {
    }

    static /* synthetic */ OAuthRequirements access$000() {
    }

    static /* synthetic */ void access$100(OAuthRequirements oAuthRequirements, String str) {
    }

    static /* synthetic */ void access$200(OAuthRequirements oAuthRequirements) {
    }

    static /* synthetic */ void access$300(OAuthRequirements oAuthRequirements, ByteString byteString) {
    }

    private void clearCanonicalScopes() {
    }

    public static OAuthRequirements getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static OAuthRequirements parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static OAuthRequirements parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<OAuthRequirements> parser() {
    }

    private void setCanonicalScopes(String str) {
    }

    private void setCanonicalScopesBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.OAuthRequirementsOrBuilder
    public String getCanonicalScopes() {
    }

    @Override // com.google.api.OAuthRequirementsOrBuilder
    public ByteString getCanonicalScopesBytes() {
    }

    public static Builder newBuilder(OAuthRequirements oAuthRequirements) {
    }

    public static OAuthRequirements parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static OAuthRequirements parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static OAuthRequirements parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static OAuthRequirements parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static OAuthRequirements parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static OAuthRequirements parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static OAuthRequirements parseFrom(InputStream inputStream) throws IOException {
    }

    public static OAuthRequirements parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static OAuthRequirements parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static OAuthRequirements parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
