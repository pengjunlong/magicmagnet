package com.google.api;

import com.google.api.ContextRule;
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
public final class Context extends GeneratedMessageLite<Context, Builder> implements ContextOrBuilder {
    private static final Context DEFAULT_INSTANCE = null;
    private static volatile Parser<Context> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ContextRule> rules_;

    /* renamed from: com.google.api.Context$1 */
    static /* synthetic */ class C05561 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f57xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Context, Builder> implements ContextOrBuilder {
        /* synthetic */ Builder(C05561 c05561) {
        }

        public Builder addAllRules(Iterable<? extends ContextRule> iterable) {
        }

        public Builder addRules(ContextRule contextRule) {
        }

        public Builder clearRules() {
        }

        @Override // com.google.api.ContextOrBuilder
        public ContextRule getRules(int i) {
        }

        @Override // com.google.api.ContextOrBuilder
        public int getRulesCount() {
        }

        @Override // com.google.api.ContextOrBuilder
        public List<ContextRule> getRulesList() {
        }

        public Builder removeRules(int i) {
        }

        public Builder setRules(int i, ContextRule contextRule) {
        }

        private Builder() {
        }

        public Builder addRules(int i, ContextRule contextRule) {
        }

        public Builder setRules(int i, ContextRule.Builder builder) {
        }

        public Builder addRules(ContextRule.Builder builder) {
        }

        public Builder addRules(int i, ContextRule.Builder builder) {
        }
    }

    private Context() {
    }

    static /* synthetic */ Context access$000() {
    }

    static /* synthetic */ void access$100(Context context, int i, ContextRule contextRule) {
    }

    static /* synthetic */ void access$200(Context context, ContextRule contextRule) {
    }

    static /* synthetic */ void access$300(Context context, int i, ContextRule contextRule) {
    }

    static /* synthetic */ void access$400(Context context, Iterable iterable) {
    }

    static /* synthetic */ void access$500(Context context) {
    }

    static /* synthetic */ void access$600(Context context, int i) {
    }

    private void addAllRules(Iterable<? extends ContextRule> iterable) {
    }

    private void addRules(ContextRule contextRule) {
    }

    private void clearRules() {
    }

    private void ensureRulesIsMutable() {
    }

    public static Context getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Context> parser() {
    }

    private void removeRules(int i) {
    }

    private void setRules(int i, ContextRule contextRule) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.ContextOrBuilder
    public ContextRule getRules(int i) {
    }

    @Override // com.google.api.ContextOrBuilder
    public int getRulesCount() {
    }

    @Override // com.google.api.ContextOrBuilder
    public List<ContextRule> getRulesList() {
    }

    public ContextRuleOrBuilder getRulesOrBuilder(int i) {
    }

    public List<? extends ContextRuleOrBuilder> getRulesOrBuilderList() {
    }

    public static Builder newBuilder(Context context) {
    }

    public static Context parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Context parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addRules(int i, ContextRule contextRule) {
    }

    public static Context parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Context parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
    }

    public static Context parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Context parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Context parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
