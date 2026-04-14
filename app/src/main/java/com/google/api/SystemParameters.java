package com.google.api;

import com.google.api.SystemParameterRule;
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
public final class SystemParameters extends GeneratedMessageLite<SystemParameters, Builder> implements SystemParametersOrBuilder {
    private static final SystemParameters DEFAULT_INSTANCE = null;
    private static volatile Parser<SystemParameters> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<SystemParameterRule> rules_;

    /* renamed from: com.google.api.SystemParameters$1 */
    static /* synthetic */ class C05971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f91xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SystemParameters, Builder> implements SystemParametersOrBuilder {
        /* synthetic */ Builder(C05971 c05971) {
        }

        public Builder addAllRules(Iterable<? extends SystemParameterRule> iterable) {
        }

        public Builder addRules(SystemParameterRule systemParameterRule) {
        }

        public Builder clearRules() {
        }

        @Override // com.google.api.SystemParametersOrBuilder
        public SystemParameterRule getRules(int i) {
        }

        @Override // com.google.api.SystemParametersOrBuilder
        public int getRulesCount() {
        }

        @Override // com.google.api.SystemParametersOrBuilder
        public List<SystemParameterRule> getRulesList() {
        }

        public Builder removeRules(int i) {
        }

        public Builder setRules(int i, SystemParameterRule systemParameterRule) {
        }

        private Builder() {
        }

        public Builder addRules(int i, SystemParameterRule systemParameterRule) {
        }

        public Builder setRules(int i, SystemParameterRule.Builder builder) {
        }

        public Builder addRules(SystemParameterRule.Builder builder) {
        }

        public Builder addRules(int i, SystemParameterRule.Builder builder) {
        }
    }

    private SystemParameters() {
    }

    static /* synthetic */ SystemParameters access$000() {
    }

    static /* synthetic */ void access$100(SystemParameters systemParameters, int i, SystemParameterRule systemParameterRule) {
    }

    static /* synthetic */ void access$200(SystemParameters systemParameters, SystemParameterRule systemParameterRule) {
    }

    static /* synthetic */ void access$300(SystemParameters systemParameters, int i, SystemParameterRule systemParameterRule) {
    }

    static /* synthetic */ void access$400(SystemParameters systemParameters, Iterable iterable) {
    }

    static /* synthetic */ void access$500(SystemParameters systemParameters) {
    }

    static /* synthetic */ void access$600(SystemParameters systemParameters, int i) {
    }

    private void addAllRules(Iterable<? extends SystemParameterRule> iterable) {
    }

    private void addRules(SystemParameterRule systemParameterRule) {
    }

    private void clearRules() {
    }

    private void ensureRulesIsMutable() {
    }

    public static SystemParameters getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<SystemParameters> parser() {
    }

    private void removeRules(int i) {
    }

    private void setRules(int i, SystemParameterRule systemParameterRule) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.SystemParametersOrBuilder
    public SystemParameterRule getRules(int i) {
    }

    @Override // com.google.api.SystemParametersOrBuilder
    public int getRulesCount() {
    }

    @Override // com.google.api.SystemParametersOrBuilder
    public List<SystemParameterRule> getRulesList() {
    }

    public SystemParameterRuleOrBuilder getRulesOrBuilder(int i) {
    }

    public List<? extends SystemParameterRuleOrBuilder> getRulesOrBuilderList() {
    }

    public static Builder newBuilder(SystemParameters systemParameters) {
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addRules(int i, SystemParameterRule systemParameterRule) {
    }

    public static SystemParameters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static SystemParameters parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameters parseFrom(InputStream inputStream) throws IOException {
    }

    public static SystemParameters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SystemParameters parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static SystemParameters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
