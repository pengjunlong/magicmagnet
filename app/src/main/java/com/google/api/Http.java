package com.google.api;

import com.google.api.HttpRule;
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
public final class Http extends GeneratedMessageLite<Http, Builder> implements HttpOrBuilder {
    private static final Http DEFAULT_INSTANCE = null;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile Parser<Http> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private Internal.ProtobufList<HttpRule> rules_;

    /* renamed from: com.google.api.Http$1 */
    static /* synthetic */ class C05651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f65xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Http, Builder> implements HttpOrBuilder {
        /* synthetic */ Builder(C05651 c05651) {
        }

        public Builder addAllRules(Iterable<? extends HttpRule> iterable) {
        }

        public Builder addRules(HttpRule httpRule) {
        }

        public Builder clearFullyDecodeReservedExpansion() {
        }

        public Builder clearRules() {
        }

        @Override // com.google.api.HttpOrBuilder
        public boolean getFullyDecodeReservedExpansion() {
        }

        @Override // com.google.api.HttpOrBuilder
        public HttpRule getRules(int i) {
        }

        @Override // com.google.api.HttpOrBuilder
        public int getRulesCount() {
        }

        @Override // com.google.api.HttpOrBuilder
        public List<HttpRule> getRulesList() {
        }

        public Builder removeRules(int i) {
        }

        public Builder setFullyDecodeReservedExpansion(boolean z) {
        }

        public Builder setRules(int i, HttpRule httpRule) {
        }

        private Builder() {
        }

        public Builder addRules(int i, HttpRule httpRule) {
        }

        public Builder setRules(int i, HttpRule.Builder builder) {
        }

        public Builder addRules(HttpRule.Builder builder) {
        }

        public Builder addRules(int i, HttpRule.Builder builder) {
        }
    }

    private Http() {
    }

    static /* synthetic */ Http access$000() {
    }

    static /* synthetic */ void access$100(Http http, int i, HttpRule httpRule) {
    }

    static /* synthetic */ void access$200(Http http, HttpRule httpRule) {
    }

    static /* synthetic */ void access$300(Http http, int i, HttpRule httpRule) {
    }

    static /* synthetic */ void access$400(Http http, Iterable iterable) {
    }

    static /* synthetic */ void access$500(Http http) {
    }

    static /* synthetic */ void access$600(Http http, int i) {
    }

    static /* synthetic */ void access$700(Http http, boolean z) {
    }

    static /* synthetic */ void access$800(Http http) {
    }

    private void addAllRules(Iterable<? extends HttpRule> iterable) {
    }

    private void addRules(HttpRule httpRule) {
    }

    private void clearFullyDecodeReservedExpansion() {
    }

    private void clearRules() {
    }

    private void ensureRulesIsMutable() {
    }

    public static Http getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Http parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Http parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Http> parser() {
    }

    private void removeRules(int i) {
    }

    private void setFullyDecodeReservedExpansion(boolean z) {
    }

    private void setRules(int i, HttpRule httpRule) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.HttpOrBuilder
    public boolean getFullyDecodeReservedExpansion() {
    }

    @Override // com.google.api.HttpOrBuilder
    public HttpRule getRules(int i) {
    }

    @Override // com.google.api.HttpOrBuilder
    public int getRulesCount() {
    }

    @Override // com.google.api.HttpOrBuilder
    public List<HttpRule> getRulesList() {
    }

    public HttpRuleOrBuilder getRulesOrBuilder(int i) {
    }

    public List<? extends HttpRuleOrBuilder> getRulesOrBuilderList() {
    }

    public static Builder newBuilder(Http http) {
    }

    public static Http parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Http parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Http parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addRules(int i, HttpRule httpRule) {
    }

    public static Http parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Http parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Http parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Http parseFrom(InputStream inputStream) throws IOException {
    }

    public static Http parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Http parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Http parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
