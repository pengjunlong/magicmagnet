package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.OAuthRequirements;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class AuthenticationRule extends GeneratedMessageLite<AuthenticationRule, Builder> implements AuthenticationRuleOrBuilder {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final AuthenticationRule DEFAULT_INSTANCE = null;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile Parser<AuthenticationRule> PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private OAuthRequirements oauth_;
    private Internal.ProtobufList<AuthRequirement> requirements_;
    private String selector_;

    /* renamed from: com.google.api.AuthenticationRule$1 */
    static /* synthetic */ class C05491 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f52xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthenticationRule, Builder> implements AuthenticationRuleOrBuilder {
        /* synthetic */ Builder(C05491 c05491) {
        }

        public Builder addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
        }

        public Builder addRequirements(AuthRequirement authRequirement) {
        }

        public Builder clearAllowWithoutCredential() {
        }

        public Builder clearOauth() {
        }

        public Builder clearRequirements() {
        }

        public Builder clearSelector() {
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public boolean getAllowWithoutCredential() {
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public OAuthRequirements getOauth() {
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public AuthRequirement getRequirements(int i) {
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public int getRequirementsCount() {
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public List<AuthRequirement> getRequirementsList() {
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public String getSelector() {
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public ByteString getSelectorBytes() {
        }

        @Override // com.google.api.AuthenticationRuleOrBuilder
        public boolean hasOauth() {
        }

        public Builder mergeOauth(OAuthRequirements oAuthRequirements) {
        }

        public Builder removeRequirements(int i) {
        }

        public Builder setAllowWithoutCredential(boolean z) {
        }

        public Builder setOauth(OAuthRequirements oAuthRequirements) {
        }

        public Builder setRequirements(int i, AuthRequirement authRequirement) {
        }

        public Builder setSelector(String str) {
        }

        public Builder setSelectorBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addRequirements(int i, AuthRequirement authRequirement) {
        }

        public Builder setOauth(OAuthRequirements.Builder builder) {
        }

        public Builder setRequirements(int i, AuthRequirement.Builder builder) {
        }

        public Builder addRequirements(AuthRequirement.Builder builder) {
        }

        public Builder addRequirements(int i, AuthRequirement.Builder builder) {
        }
    }

    private AuthenticationRule() {
    }

    static /* synthetic */ AuthenticationRule access$000() {
    }

    static /* synthetic */ void access$100(AuthenticationRule authenticationRule, String str) {
    }

    static /* synthetic */ void access$1000(AuthenticationRule authenticationRule, AuthRequirement authRequirement) {
    }

    static /* synthetic */ void access$1100(AuthenticationRule authenticationRule, int i, AuthRequirement authRequirement) {
    }

    static /* synthetic */ void access$1200(AuthenticationRule authenticationRule, Iterable iterable) {
    }

    static /* synthetic */ void access$1300(AuthenticationRule authenticationRule) {
    }

    static /* synthetic */ void access$1400(AuthenticationRule authenticationRule, int i) {
    }

    static /* synthetic */ void access$200(AuthenticationRule authenticationRule) {
    }

    static /* synthetic */ void access$300(AuthenticationRule authenticationRule, ByteString byteString) {
    }

    static /* synthetic */ void access$400(AuthenticationRule authenticationRule, OAuthRequirements oAuthRequirements) {
    }

    static /* synthetic */ void access$500(AuthenticationRule authenticationRule, OAuthRequirements oAuthRequirements) {
    }

    static /* synthetic */ void access$600(AuthenticationRule authenticationRule) {
    }

    static /* synthetic */ void access$700(AuthenticationRule authenticationRule, boolean z) {
    }

    static /* synthetic */ void access$800(AuthenticationRule authenticationRule) {
    }

    static /* synthetic */ void access$900(AuthenticationRule authenticationRule, int i, AuthRequirement authRequirement) {
    }

    private void addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
    }

    private void addRequirements(AuthRequirement authRequirement) {
    }

    private void clearAllowWithoutCredential() {
    }

    private void clearOauth() {
    }

    private void clearRequirements() {
    }

    private void clearSelector() {
    }

    private void ensureRequirementsIsMutable() {
    }

    public static AuthenticationRule getDefaultInstance() {
    }

    private void mergeOauth(OAuthRequirements oAuthRequirements) {
    }

    public static Builder newBuilder() {
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AuthenticationRule> parser() {
    }

    private void removeRequirements(int i) {
    }

    private void setAllowWithoutCredential(boolean z) {
    }

    private void setOauth(OAuthRequirements oAuthRequirements) {
    }

    private void setRequirements(int i, AuthRequirement authRequirement) {
    }

    private void setSelector(String str) {
    }

    private void setSelectorBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public boolean getAllowWithoutCredential() {
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public OAuthRequirements getOauth() {
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public AuthRequirement getRequirements(int i) {
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public int getRequirementsCount() {
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public List<AuthRequirement> getRequirementsList() {
    }

    public AuthRequirementOrBuilder getRequirementsOrBuilder(int i) {
    }

    public List<? extends AuthRequirementOrBuilder> getRequirementsOrBuilderList() {
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public String getSelector() {
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public ByteString getSelectorBytes() {
    }

    @Override // com.google.api.AuthenticationRuleOrBuilder
    public boolean hasOauth() {
    }

    public static Builder newBuilder(AuthenticationRule authenticationRule) {
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthenticationRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addRequirements(int i, AuthRequirement authRequirement) {
    }

    public static AuthenticationRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthenticationRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AuthenticationRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthenticationRule parseFrom(InputStream inputStream) throws IOException {
    }

    public static AuthenticationRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthenticationRule parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AuthenticationRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
