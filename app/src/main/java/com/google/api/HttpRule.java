package com.google.api;

import com.google.api.CustomHttpPattern;
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
public final class HttpRule extends GeneratedMessageLite<HttpRule, Builder> implements HttpRuleOrBuilder {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final HttpRule DEFAULT_INSTANCE = null;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile Parser<HttpRule> PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal.ProtobufList<HttpRule> additionalBindings_;
    private String body_;
    private int patternCase_;
    private Object pattern_;
    private String responseBody_;
    private String selector_;

    /* renamed from: com.google.api.HttpRule$1 */
    static /* synthetic */ class C05671 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f67xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HttpRule, Builder> implements HttpRuleOrBuilder {
        /* synthetic */ Builder(C05671 c05671) {
        }

        public Builder addAdditionalBindings(HttpRule httpRule) {
        }

        public Builder addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        }

        public Builder clearAdditionalBindings() {
        }

        public Builder clearBody() {
        }

        public Builder clearCustom() {
        }

        public Builder clearDelete() {
        }

        public Builder clearGet() {
        }

        public Builder clearPatch() {
        }

        public Builder clearPattern() {
        }

        public Builder clearPost() {
        }

        public Builder clearPut() {
        }

        public Builder clearResponseBody() {
        }

        public Builder clearSelector() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public HttpRule getAdditionalBindings(int i) {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public int getAdditionalBindingsCount() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public List<HttpRule> getAdditionalBindingsList() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getBody() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public ByteString getBodyBytes() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public CustomHttpPattern getCustom() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getDelete() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public ByteString getDeleteBytes() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getGet() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public ByteString getGetBytes() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getPatch() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public ByteString getPatchBytes() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public PatternCase getPatternCase() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getPost() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public ByteString getPostBytes() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getPut() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public ByteString getPutBytes() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getResponseBody() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public ByteString getResponseBodyBytes() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public String getSelector() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public ByteString getSelectorBytes() {
        }

        @Override // com.google.api.HttpRuleOrBuilder
        public boolean hasCustom() {
        }

        public Builder mergeCustom(CustomHttpPattern customHttpPattern) {
        }

        public Builder removeAdditionalBindings(int i) {
        }

        public Builder setAdditionalBindings(int i, HttpRule httpRule) {
        }

        public Builder setBody(String str) {
        }

        public Builder setBodyBytes(ByteString byteString) {
        }

        public Builder setCustom(CustomHttpPattern customHttpPattern) {
        }

        public Builder setDelete(String str) {
        }

        public Builder setDeleteBytes(ByteString byteString) {
        }

        public Builder setGet(String str) {
        }

        public Builder setGetBytes(ByteString byteString) {
        }

        public Builder setPatch(String str) {
        }

        public Builder setPatchBytes(ByteString byteString) {
        }

        public Builder setPost(String str) {
        }

        public Builder setPostBytes(ByteString byteString) {
        }

        public Builder setPut(String str) {
        }

        public Builder setPutBytes(ByteString byteString) {
        }

        public Builder setResponseBody(String str) {
        }

        public Builder setResponseBodyBytes(ByteString byteString) {
        }

        public Builder setSelector(String str) {
        }

        public Builder setSelectorBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addAdditionalBindings(int i, HttpRule httpRule) {
        }

        public Builder setAdditionalBindings(int i, Builder builder) {
        }

        public Builder setCustom(CustomHttpPattern.Builder builder) {
        }

        public Builder addAdditionalBindings(Builder builder) {
        }

        public Builder addAdditionalBindings(int i, Builder builder) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class PatternCase {
        private static final /* synthetic */ PatternCase[] $VALUES = null;
        public static final PatternCase CUSTOM = null;
        public static final PatternCase DELETE = null;
        public static final PatternCase GET = null;
        public static final PatternCase PATCH = null;
        public static final PatternCase PATTERN_NOT_SET = null;
        public static final PatternCase POST = null;
        public static final PatternCase PUT = null;
        private final int value;

        private PatternCase(String str, int i, int i2) {
        }

        public static PatternCase forNumber(int i) {
        }

        public static PatternCase valueOf(String str) {
        }

        public static PatternCase[] values() {
        }

        public int getNumber() {
        }

        @Deprecated
        public static PatternCase valueOf(int i) {
        }
    }

    private HttpRule() {
    }

    static /* synthetic */ HttpRule access$000() {
    }

    static /* synthetic */ void access$100(HttpRule httpRule) {
    }

    static /* synthetic */ void access$1000(HttpRule httpRule, ByteString byteString) {
    }

    static /* synthetic */ void access$1100(HttpRule httpRule, String str) {
    }

    static /* synthetic */ void access$1200(HttpRule httpRule) {
    }

    static /* synthetic */ void access$1300(HttpRule httpRule, ByteString byteString) {
    }

    static /* synthetic */ void access$1400(HttpRule httpRule, String str) {
    }

    static /* synthetic */ void access$1500(HttpRule httpRule) {
    }

    static /* synthetic */ void access$1600(HttpRule httpRule, ByteString byteString) {
    }

    static /* synthetic */ void access$1700(HttpRule httpRule, String str) {
    }

    static /* synthetic */ void access$1800(HttpRule httpRule) {
    }

    static /* synthetic */ void access$1900(HttpRule httpRule, ByteString byteString) {
    }

    static /* synthetic */ void access$200(HttpRule httpRule, String str) {
    }

    static /* synthetic */ void access$2000(HttpRule httpRule, CustomHttpPattern customHttpPattern) {
    }

    static /* synthetic */ void access$2100(HttpRule httpRule, CustomHttpPattern customHttpPattern) {
    }

    static /* synthetic */ void access$2200(HttpRule httpRule) {
    }

    static /* synthetic */ void access$2300(HttpRule httpRule, String str) {
    }

    static /* synthetic */ void access$2400(HttpRule httpRule) {
    }

    static /* synthetic */ void access$2500(HttpRule httpRule, ByteString byteString) {
    }

    static /* synthetic */ void access$2600(HttpRule httpRule, String str) {
    }

    static /* synthetic */ void access$2700(HttpRule httpRule) {
    }

    static /* synthetic */ void access$2800(HttpRule httpRule, ByteString byteString) {
    }

    static /* synthetic */ void access$2900(HttpRule httpRule, int i, HttpRule httpRule2) {
    }

    static /* synthetic */ void access$300(HttpRule httpRule) {
    }

    static /* synthetic */ void access$3000(HttpRule httpRule, HttpRule httpRule2) {
    }

    static /* synthetic */ void access$3100(HttpRule httpRule, int i, HttpRule httpRule2) {
    }

    static /* synthetic */ void access$3200(HttpRule httpRule, Iterable iterable) {
    }

    static /* synthetic */ void access$3300(HttpRule httpRule) {
    }

    static /* synthetic */ void access$3400(HttpRule httpRule, int i) {
    }

    static /* synthetic */ void access$400(HttpRule httpRule, ByteString byteString) {
    }

    static /* synthetic */ void access$500(HttpRule httpRule, String str) {
    }

    static /* synthetic */ void access$600(HttpRule httpRule) {
    }

    static /* synthetic */ void access$700(HttpRule httpRule, ByteString byteString) {
    }

    static /* synthetic */ void access$800(HttpRule httpRule, String str) {
    }

    static /* synthetic */ void access$900(HttpRule httpRule) {
    }

    private void addAdditionalBindings(HttpRule httpRule) {
    }

    private void addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
    }

    private void clearAdditionalBindings() {
    }

    private void clearBody() {
    }

    private void clearCustom() {
    }

    private void clearDelete() {
    }

    private void clearGet() {
    }

    private void clearPatch() {
    }

    private void clearPattern() {
    }

    private void clearPost() {
    }

    private void clearPut() {
    }

    private void clearResponseBody() {
    }

    private void clearSelector() {
    }

    private void ensureAdditionalBindingsIsMutable() {
    }

    public static HttpRule getDefaultInstance() {
    }

    private void mergeCustom(CustomHttpPattern customHttpPattern) {
    }

    public static Builder newBuilder() {
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<HttpRule> parser() {
    }

    private void removeAdditionalBindings(int i) {
    }

    private void setAdditionalBindings(int i, HttpRule httpRule) {
    }

    private void setBody(String str) {
    }

    private void setBodyBytes(ByteString byteString) {
    }

    private void setCustom(CustomHttpPattern customHttpPattern) {
    }

    private void setDelete(String str) {
    }

    private void setDeleteBytes(ByteString byteString) {
    }

    private void setGet(String str) {
    }

    private void setGetBytes(ByteString byteString) {
    }

    private void setPatch(String str) {
    }

    private void setPatchBytes(ByteString byteString) {
    }

    private void setPost(String str) {
    }

    private void setPostBytes(ByteString byteString) {
    }

    private void setPut(String str) {
    }

    private void setPutBytes(ByteString byteString) {
    }

    private void setResponseBody(String str) {
    }

    private void setResponseBodyBytes(ByteString byteString) {
    }

    private void setSelector(String str) {
    }

    private void setSelectorBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public HttpRule getAdditionalBindings(int i) {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public int getAdditionalBindingsCount() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public List<HttpRule> getAdditionalBindingsList() {
    }

    public HttpRuleOrBuilder getAdditionalBindingsOrBuilder(int i) {
    }

    public List<? extends HttpRuleOrBuilder> getAdditionalBindingsOrBuilderList() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getBody() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public ByteString getBodyBytes() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public CustomHttpPattern getCustom() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getDelete() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public ByteString getDeleteBytes() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getGet() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public ByteString getGetBytes() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getPatch() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public ByteString getPatchBytes() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public PatternCase getPatternCase() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getPost() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public ByteString getPostBytes() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getPut() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public ByteString getPutBytes() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getResponseBody() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public ByteString getResponseBodyBytes() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public String getSelector() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public ByteString getSelectorBytes() {
    }

    @Override // com.google.api.HttpRuleOrBuilder
    public boolean hasCustom() {
    }

    public static Builder newBuilder(HttpRule httpRule) {
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addAdditionalBindings(int i, HttpRule httpRule) {
    }

    public static HttpRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static HttpRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpRule parseFrom(InputStream inputStream) throws IOException {
    }

    public static HttpRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static HttpRule parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static HttpRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
