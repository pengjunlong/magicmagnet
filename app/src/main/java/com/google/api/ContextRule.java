package com.google.api;

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
public final class ContextRule extends GeneratedMessageLite<ContextRule, Builder> implements ContextRuleOrBuilder {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE = null;
    private static volatile Parser<ContextRule> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> allowedRequestExtensions_;
    private Internal.ProtobufList<String> allowedResponseExtensions_;
    private Internal.ProtobufList<String> provided_;
    private Internal.ProtobufList<String> requested_;
    private String selector_;

    /* renamed from: com.google.api.ContextRule$1 */
    static /* synthetic */ class C05571 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f58xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ContextRule, Builder> implements ContextRuleOrBuilder {
        /* synthetic */ Builder(C05571 c05571) {
        }

        public Builder addAllAllowedRequestExtensions(Iterable<String> iterable) {
        }

        public Builder addAllAllowedResponseExtensions(Iterable<String> iterable) {
        }

        public Builder addAllProvided(Iterable<String> iterable) {
        }

        public Builder addAllRequested(Iterable<String> iterable) {
        }

        public Builder addAllowedRequestExtensions(String str) {
        }

        public Builder addAllowedRequestExtensionsBytes(ByteString byteString) {
        }

        public Builder addAllowedResponseExtensions(String str) {
        }

        public Builder addAllowedResponseExtensionsBytes(ByteString byteString) {
        }

        public Builder addProvided(String str) {
        }

        public Builder addProvidedBytes(ByteString byteString) {
        }

        public Builder addRequested(String str) {
        }

        public Builder addRequestedBytes(ByteString byteString) {
        }

        public Builder clearAllowedRequestExtensions() {
        }

        public Builder clearAllowedResponseExtensions() {
        }

        public Builder clearProvided() {
        }

        public Builder clearRequested() {
        }

        public Builder clearSelector() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getAllowedRequestExtensions(int i) {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getAllowedRequestExtensionsBytes(int i) {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getAllowedRequestExtensionsCount() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public List<String> getAllowedRequestExtensionsList() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getAllowedResponseExtensions(int i) {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getAllowedResponseExtensionsBytes(int i) {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getAllowedResponseExtensionsCount() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public List<String> getAllowedResponseExtensionsList() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getProvided(int i) {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getProvidedBytes(int i) {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getProvidedCount() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public List<String> getProvidedList() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getRequested(int i) {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getRequestedBytes(int i) {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getRequestedCount() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public List<String> getRequestedList() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getSelector() {
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getSelectorBytes() {
        }

        public Builder setAllowedRequestExtensions(int i, String str) {
        }

        public Builder setAllowedResponseExtensions(int i, String str) {
        }

        public Builder setProvided(int i, String str) {
        }

        public Builder setRequested(int i, String str) {
        }

        public Builder setSelector(String str) {
        }

        public Builder setSelectorBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private ContextRule() {
    }

    static /* synthetic */ ContextRule access$000() {
    }

    static /* synthetic */ void access$100(ContextRule contextRule, String str) {
    }

    static /* synthetic */ void access$1000(ContextRule contextRule, String str) {
    }

    static /* synthetic */ void access$1100(ContextRule contextRule, Iterable iterable) {
    }

    static /* synthetic */ void access$1200(ContextRule contextRule) {
    }

    static /* synthetic */ void access$1300(ContextRule contextRule, ByteString byteString) {
    }

    static /* synthetic */ void access$1400(ContextRule contextRule, int i, String str) {
    }

    static /* synthetic */ void access$1500(ContextRule contextRule, String str) {
    }

    static /* synthetic */ void access$1600(ContextRule contextRule, Iterable iterable) {
    }

    static /* synthetic */ void access$1700(ContextRule contextRule) {
    }

    static /* synthetic */ void access$1800(ContextRule contextRule, ByteString byteString) {
    }

    static /* synthetic */ void access$1900(ContextRule contextRule, int i, String str) {
    }

    static /* synthetic */ void access$200(ContextRule contextRule) {
    }

    static /* synthetic */ void access$2000(ContextRule contextRule, String str) {
    }

    static /* synthetic */ void access$2100(ContextRule contextRule, Iterable iterable) {
    }

    static /* synthetic */ void access$2200(ContextRule contextRule) {
    }

    static /* synthetic */ void access$2300(ContextRule contextRule, ByteString byteString) {
    }

    static /* synthetic */ void access$300(ContextRule contextRule, ByteString byteString) {
    }

    static /* synthetic */ void access$400(ContextRule contextRule, int i, String str) {
    }

    static /* synthetic */ void access$500(ContextRule contextRule, String str) {
    }

    static /* synthetic */ void access$600(ContextRule contextRule, Iterable iterable) {
    }

    static /* synthetic */ void access$700(ContextRule contextRule) {
    }

    static /* synthetic */ void access$800(ContextRule contextRule, ByteString byteString) {
    }

    static /* synthetic */ void access$900(ContextRule contextRule, int i, String str) {
    }

    private void addAllAllowedRequestExtensions(Iterable<String> iterable) {
    }

    private void addAllAllowedResponseExtensions(Iterable<String> iterable) {
    }

    private void addAllProvided(Iterable<String> iterable) {
    }

    private void addAllRequested(Iterable<String> iterable) {
    }

    private void addAllowedRequestExtensions(String str) {
    }

    private void addAllowedRequestExtensionsBytes(ByteString byteString) {
    }

    private void addAllowedResponseExtensions(String str) {
    }

    private void addAllowedResponseExtensionsBytes(ByteString byteString) {
    }

    private void addProvided(String str) {
    }

    private void addProvidedBytes(ByteString byteString) {
    }

    private void addRequested(String str) {
    }

    private void addRequestedBytes(ByteString byteString) {
    }

    private void clearAllowedRequestExtensions() {
    }

    private void clearAllowedResponseExtensions() {
    }

    private void clearProvided() {
    }

    private void clearRequested() {
    }

    private void clearSelector() {
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
    }

    private void ensureProvidedIsMutable() {
    }

    private void ensureRequestedIsMutable() {
    }

    public static ContextRule getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ContextRule> parser() {
    }

    private void setAllowedRequestExtensions(int i, String str) {
    }

    private void setAllowedResponseExtensions(int i, String str) {
    }

    private void setProvided(int i, String str) {
    }

    private void setRequested(int i, String str) {
    }

    private void setSelector(String str) {
    }

    private void setSelectorBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getAllowedRequestExtensions(int i) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getAllowedRequestExtensionsBytes(int i) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getAllowedRequestExtensionsCount() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public List<String> getAllowedRequestExtensionsList() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getAllowedResponseExtensions(int i) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getAllowedResponseExtensionsBytes(int i) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getAllowedResponseExtensionsCount() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public List<String> getAllowedResponseExtensionsList() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getProvided(int i) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getProvidedBytes(int i) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getProvidedCount() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public List<String> getProvidedList() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getRequested(int i) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getRequestedBytes(int i) {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getRequestedCount() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public List<String> getRequestedList() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getSelector() {
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getSelectorBytes() {
    }

    public static Builder newBuilder(ContextRule contextRule) {
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ContextRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static ContextRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ContextRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ContextRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
    }

    public static ContextRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
