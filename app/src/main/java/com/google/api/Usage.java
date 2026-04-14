package com.google.api;

import com.google.api.UsageRule;
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
public final class Usage extends GeneratedMessageLite<Usage, Builder> implements UsageOrBuilder {
    private static final Usage DEFAULT_INSTANCE = null;
    private static volatile Parser<Usage> PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private String producerNotificationChannel_;
    private Internal.ProtobufList<String> requirements_;
    private Internal.ProtobufList<UsageRule> rules_;

    /* renamed from: com.google.api.Usage$1 */
    static /* synthetic */ class C05981 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f92xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Usage, Builder> implements UsageOrBuilder {
        /* synthetic */ Builder(C05981 c05981) {
        }

        public Builder addAllRequirements(Iterable<String> iterable) {
        }

        public Builder addAllRules(Iterable<? extends UsageRule> iterable) {
        }

        public Builder addRequirements(String str) {
        }

        public Builder addRequirementsBytes(ByteString byteString) {
        }

        public Builder addRules(UsageRule usageRule) {
        }

        public Builder clearProducerNotificationChannel() {
        }

        public Builder clearRequirements() {
        }

        public Builder clearRules() {
        }

        @Override // com.google.api.UsageOrBuilder
        public String getProducerNotificationChannel() {
        }

        @Override // com.google.api.UsageOrBuilder
        public ByteString getProducerNotificationChannelBytes() {
        }

        @Override // com.google.api.UsageOrBuilder
        public String getRequirements(int i) {
        }

        @Override // com.google.api.UsageOrBuilder
        public ByteString getRequirementsBytes(int i) {
        }

        @Override // com.google.api.UsageOrBuilder
        public int getRequirementsCount() {
        }

        @Override // com.google.api.UsageOrBuilder
        public List<String> getRequirementsList() {
        }

        @Override // com.google.api.UsageOrBuilder
        public UsageRule getRules(int i) {
        }

        @Override // com.google.api.UsageOrBuilder
        public int getRulesCount() {
        }

        @Override // com.google.api.UsageOrBuilder
        public List<UsageRule> getRulesList() {
        }

        public Builder removeRules(int i) {
        }

        public Builder setProducerNotificationChannel(String str) {
        }

        public Builder setProducerNotificationChannelBytes(ByteString byteString) {
        }

        public Builder setRequirements(int i, String str) {
        }

        public Builder setRules(int i, UsageRule usageRule) {
        }

        private Builder() {
        }

        public Builder addRules(int i, UsageRule usageRule) {
        }

        public Builder setRules(int i, UsageRule.Builder builder) {
        }

        public Builder addRules(UsageRule.Builder builder) {
        }

        public Builder addRules(int i, UsageRule.Builder builder) {
        }
    }

    private Usage() {
    }

    static /* synthetic */ Usage access$000() {
    }

    static /* synthetic */ void access$100(Usage usage, int i, String str) {
    }

    static /* synthetic */ void access$1000(Usage usage) {
    }

    static /* synthetic */ void access$1100(Usage usage, int i) {
    }

    static /* synthetic */ void access$1200(Usage usage, String str) {
    }

    static /* synthetic */ void access$1300(Usage usage) {
    }

    static /* synthetic */ void access$1400(Usage usage, ByteString byteString) {
    }

    static /* synthetic */ void access$200(Usage usage, String str) {
    }

    static /* synthetic */ void access$300(Usage usage, Iterable iterable) {
    }

    static /* synthetic */ void access$400(Usage usage) {
    }

    static /* synthetic */ void access$500(Usage usage, ByteString byteString) {
    }

    static /* synthetic */ void access$600(Usage usage, int i, UsageRule usageRule) {
    }

    static /* synthetic */ void access$700(Usage usage, UsageRule usageRule) {
    }

    static /* synthetic */ void access$800(Usage usage, int i, UsageRule usageRule) {
    }

    static /* synthetic */ void access$900(Usage usage, Iterable iterable) {
    }

    private void addAllRequirements(Iterable<String> iterable) {
    }

    private void addAllRules(Iterable<? extends UsageRule> iterable) {
    }

    private void addRequirements(String str) {
    }

    private void addRequirementsBytes(ByteString byteString) {
    }

    private void addRules(UsageRule usageRule) {
    }

    private void clearProducerNotificationChannel() {
    }

    private void clearRequirements() {
    }

    private void clearRules() {
    }

    private void ensureRequirementsIsMutable() {
    }

    private void ensureRulesIsMutable() {
    }

    public static Usage getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Usage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Usage> parser() {
    }

    private void removeRules(int i) {
    }

    private void setProducerNotificationChannel(String str) {
    }

    private void setProducerNotificationChannelBytes(ByteString byteString) {
    }

    private void setRequirements(int i, String str) {
    }

    private void setRules(int i, UsageRule usageRule) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.UsageOrBuilder
    public String getProducerNotificationChannel() {
    }

    @Override // com.google.api.UsageOrBuilder
    public ByteString getProducerNotificationChannelBytes() {
    }

    @Override // com.google.api.UsageOrBuilder
    public String getRequirements(int i) {
    }

    @Override // com.google.api.UsageOrBuilder
    public ByteString getRequirementsBytes(int i) {
    }

    @Override // com.google.api.UsageOrBuilder
    public int getRequirementsCount() {
    }

    @Override // com.google.api.UsageOrBuilder
    public List<String> getRequirementsList() {
    }

    @Override // com.google.api.UsageOrBuilder
    public UsageRule getRules(int i) {
    }

    @Override // com.google.api.UsageOrBuilder
    public int getRulesCount() {
    }

    @Override // com.google.api.UsageOrBuilder
    public List<UsageRule> getRulesList() {
    }

    public UsageRuleOrBuilder getRulesOrBuilder(int i) {
    }

    public List<? extends UsageRuleOrBuilder> getRulesOrBuilderList() {
    }

    public static Builder newBuilder(Usage usage) {
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Usage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Usage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addRules(int i, UsageRule usageRule) {
    }

    public static Usage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Usage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Usage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Usage parseFrom(InputStream inputStream) throws IOException {
    }

    public static Usage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Usage parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Usage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
