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
public final class UsageRule extends GeneratedMessageLite<UsageRule, Builder> implements UsageRuleOrBuilder {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final UsageRule DEFAULT_INSTANCE = null;
    private static volatile Parser<UsageRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_;
    private boolean skipServiceControl_;

    /* renamed from: com.google.api.UsageRule$1 */
    static /* synthetic */ class C05991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f93xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UsageRule, Builder> implements UsageRuleOrBuilder {
        /* synthetic */ Builder(C05991 c05991) {
        }

        public Builder clearAllowUnregisteredCalls() {
        }

        public Builder clearSelector() {
        }

        public Builder clearSkipServiceControl() {
        }

        @Override // com.google.api.UsageRuleOrBuilder
        public boolean getAllowUnregisteredCalls() {
        }

        @Override // com.google.api.UsageRuleOrBuilder
        public String getSelector() {
        }

        @Override // com.google.api.UsageRuleOrBuilder
        public ByteString getSelectorBytes() {
        }

        @Override // com.google.api.UsageRuleOrBuilder
        public boolean getSkipServiceControl() {
        }

        public Builder setAllowUnregisteredCalls(boolean z) {
        }

        public Builder setSelector(String str) {
        }

        public Builder setSelectorBytes(ByteString byteString) {
        }

        public Builder setSkipServiceControl(boolean z) {
        }

        private Builder() {
        }
    }

    private UsageRule() {
    }

    static /* synthetic */ UsageRule access$000() {
    }

    static /* synthetic */ void access$100(UsageRule usageRule, String str) {
    }

    static /* synthetic */ void access$200(UsageRule usageRule) {
    }

    static /* synthetic */ void access$300(UsageRule usageRule, ByteString byteString) {
    }

    static /* synthetic */ void access$400(UsageRule usageRule, boolean z) {
    }

    static /* synthetic */ void access$500(UsageRule usageRule) {
    }

    static /* synthetic */ void access$600(UsageRule usageRule, boolean z) {
    }

    static /* synthetic */ void access$700(UsageRule usageRule) {
    }

    private void clearAllowUnregisteredCalls() {
    }

    private void clearSelector() {
    }

    private void clearSkipServiceControl() {
    }

    public static UsageRule getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static UsageRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<UsageRule> parser() {
    }

    private void setAllowUnregisteredCalls(boolean z) {
    }

    private void setSelector(String str) {
    }

    private void setSelectorBytes(ByteString byteString) {
    }

    private void setSkipServiceControl(boolean z) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.UsageRuleOrBuilder
    public boolean getAllowUnregisteredCalls() {
    }

    @Override // com.google.api.UsageRuleOrBuilder
    public String getSelector() {
    }

    @Override // com.google.api.UsageRuleOrBuilder
    public ByteString getSelectorBytes() {
    }

    @Override // com.google.api.UsageRuleOrBuilder
    public boolean getSkipServiceControl() {
    }

    public static Builder newBuilder(UsageRule usageRule) {
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static UsageRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static UsageRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static UsageRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static UsageRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static UsageRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static UsageRule parseFrom(InputStream inputStream) throws IOException {
    }

    public static UsageRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static UsageRule parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static UsageRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
