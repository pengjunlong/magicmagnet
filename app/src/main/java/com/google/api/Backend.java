package com.google.api;

import com.google.api.BackendRule;
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
public final class Backend extends GeneratedMessageLite<Backend, Builder> implements BackendOrBuilder {
    private static final Backend DEFAULT_INSTANCE = null;
    private static volatile Parser<Backend> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<BackendRule> rules_;

    /* renamed from: com.google.api.Backend$1 */
    static /* synthetic */ class C05501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f53xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Backend, Builder> implements BackendOrBuilder {
        /* synthetic */ Builder(C05501 c05501) {
        }

        public Builder addAllRules(Iterable<? extends BackendRule> iterable) {
        }

        public Builder addRules(BackendRule backendRule) {
        }

        public Builder clearRules() {
        }

        @Override // com.google.api.BackendOrBuilder
        public BackendRule getRules(int i) {
        }

        @Override // com.google.api.BackendOrBuilder
        public int getRulesCount() {
        }

        @Override // com.google.api.BackendOrBuilder
        public List<BackendRule> getRulesList() {
        }

        public Builder removeRules(int i) {
        }

        public Builder setRules(int i, BackendRule backendRule) {
        }

        private Builder() {
        }

        public Builder addRules(int i, BackendRule backendRule) {
        }

        public Builder setRules(int i, BackendRule.Builder builder) {
        }

        public Builder addRules(BackendRule.Builder builder) {
        }

        public Builder addRules(int i, BackendRule.Builder builder) {
        }
    }

    private Backend() {
    }

    static /* synthetic */ Backend access$000() {
    }

    static /* synthetic */ void access$100(Backend backend, int i, BackendRule backendRule) {
    }

    static /* synthetic */ void access$200(Backend backend, BackendRule backendRule) {
    }

    static /* synthetic */ void access$300(Backend backend, int i, BackendRule backendRule) {
    }

    static /* synthetic */ void access$400(Backend backend, Iterable iterable) {
    }

    static /* synthetic */ void access$500(Backend backend) {
    }

    static /* synthetic */ void access$600(Backend backend, int i) {
    }

    private void addAllRules(Iterable<? extends BackendRule> iterable) {
    }

    private void addRules(BackendRule backendRule) {
    }

    private void clearRules() {
    }

    private void ensureRulesIsMutable() {
    }

    public static Backend getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Backend parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Backend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Backend> parser() {
    }

    private void removeRules(int i) {
    }

    private void setRules(int i, BackendRule backendRule) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.BackendOrBuilder
    public BackendRule getRules(int i) {
    }

    @Override // com.google.api.BackendOrBuilder
    public int getRulesCount() {
    }

    @Override // com.google.api.BackendOrBuilder
    public List<BackendRule> getRulesList() {
    }

    public BackendRuleOrBuilder getRulesOrBuilder(int i) {
    }

    public List<? extends BackendRuleOrBuilder> getRulesOrBuilderList() {
    }

    public static Builder newBuilder(Backend backend) {
    }

    public static Backend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Backend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Backend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addRules(int i, BackendRule backendRule) {
    }

    public static Backend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Backend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Backend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Backend parseFrom(InputStream inputStream) throws IOException {
    }

    public static Backend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Backend parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Backend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
