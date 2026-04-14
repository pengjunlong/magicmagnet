package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthenticationRule;
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
public final class Authentication extends GeneratedMessageLite<Authentication, Builder> implements AuthenticationOrBuilder {
    private static final Authentication DEFAULT_INSTANCE = null;
    private static volatile Parser<Authentication> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private Internal.ProtobufList<AuthProvider> providers_;
    private Internal.ProtobufList<AuthenticationRule> rules_;

    /* renamed from: com.google.api.Authentication$1 */
    static /* synthetic */ class C05481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Authentication, Builder> implements AuthenticationOrBuilder {
        /* synthetic */ Builder(C05481 c05481) {
        }

        public Builder addAllProviders(Iterable<? extends AuthProvider> iterable) {
        }

        public Builder addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        }

        public Builder addProviders(AuthProvider authProvider) {
        }

        public Builder addRules(AuthenticationRule authenticationRule) {
        }

        public Builder clearProviders() {
        }

        public Builder clearRules() {
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public AuthProvider getProviders(int i) {
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public int getProvidersCount() {
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public List<AuthProvider> getProvidersList() {
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public AuthenticationRule getRules(int i) {
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public int getRulesCount() {
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public List<AuthenticationRule> getRulesList() {
        }

        public Builder removeProviders(int i) {
        }

        public Builder removeRules(int i) {
        }

        public Builder setProviders(int i, AuthProvider authProvider) {
        }

        public Builder setRules(int i, AuthenticationRule authenticationRule) {
        }

        private Builder() {
        }

        public Builder addProviders(int i, AuthProvider authProvider) {
        }

        public Builder addRules(int i, AuthenticationRule authenticationRule) {
        }

        public Builder setProviders(int i, AuthProvider.Builder builder) {
        }

        public Builder setRules(int i, AuthenticationRule.Builder builder) {
        }

        public Builder addProviders(AuthProvider.Builder builder) {
        }

        public Builder addRules(AuthenticationRule.Builder builder) {
        }

        public Builder addProviders(int i, AuthProvider.Builder builder) {
        }

        public Builder addRules(int i, AuthenticationRule.Builder builder) {
        }
    }

    private Authentication() {
    }

    static /* synthetic */ Authentication access$000() {
    }

    static /* synthetic */ void access$100(Authentication authentication, int i, AuthenticationRule authenticationRule) {
    }

    static /* synthetic */ void access$1000(Authentication authentication, Iterable iterable) {
    }

    static /* synthetic */ void access$1100(Authentication authentication) {
    }

    static /* synthetic */ void access$1200(Authentication authentication, int i) {
    }

    static /* synthetic */ void access$200(Authentication authentication, AuthenticationRule authenticationRule) {
    }

    static /* synthetic */ void access$300(Authentication authentication, int i, AuthenticationRule authenticationRule) {
    }

    static /* synthetic */ void access$400(Authentication authentication, Iterable iterable) {
    }

    static /* synthetic */ void access$500(Authentication authentication) {
    }

    static /* synthetic */ void access$600(Authentication authentication, int i) {
    }

    static /* synthetic */ void access$700(Authentication authentication, int i, AuthProvider authProvider) {
    }

    static /* synthetic */ void access$800(Authentication authentication, AuthProvider authProvider) {
    }

    static /* synthetic */ void access$900(Authentication authentication, int i, AuthProvider authProvider) {
    }

    private void addAllProviders(Iterable<? extends AuthProvider> iterable) {
    }

    private void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
    }

    private void addProviders(AuthProvider authProvider) {
    }

    private void addRules(AuthenticationRule authenticationRule) {
    }

    private void clearProviders() {
    }

    private void clearRules() {
    }

    private void ensureProvidersIsMutable() {
    }

    private void ensureRulesIsMutable() {
    }

    public static Authentication getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Authentication> parser() {
    }

    private void removeProviders(int i) {
    }

    private void removeRules(int i) {
    }

    private void setProviders(int i, AuthProvider authProvider) {
    }

    private void setRules(int i, AuthenticationRule authenticationRule) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public AuthProvider getProviders(int i) {
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public int getProvidersCount() {
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public List<AuthProvider> getProvidersList() {
    }

    public AuthProviderOrBuilder getProvidersOrBuilder(int i) {
    }

    public List<? extends AuthProviderOrBuilder> getProvidersOrBuilderList() {
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public AuthenticationRule getRules(int i) {
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public int getRulesCount() {
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public List<AuthenticationRule> getRulesList() {
    }

    public AuthenticationRuleOrBuilder getRulesOrBuilder(int i) {
    }

    public List<? extends AuthenticationRuleOrBuilder> getRulesOrBuilderList() {
    }

    public static Builder newBuilder(Authentication authentication) {
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Authentication parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addProviders(int i, AuthProvider authProvider) {
    }

    private void addRules(int i, AuthenticationRule authenticationRule) {
    }

    public static Authentication parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Authentication parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Authentication parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Authentication parseFrom(InputStream inputStream) throws IOException {
    }

    public static Authentication parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
