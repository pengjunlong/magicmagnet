package com.google.api;

import com.google.api.MetricRule;
import com.google.api.QuotaLimit;
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
public final class Quota extends GeneratedMessageLite<Quota, Builder> implements QuotaOrBuilder {
    private static final Quota DEFAULT_INSTANCE = null;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile Parser<Quota> PARSER;
    private Internal.ProtobufList<QuotaLimit> limits_;
    private Internal.ProtobufList<MetricRule> metricRules_;

    /* renamed from: com.google.api.Quota$1 */
    static /* synthetic */ class C05881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f83xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Quota, Builder> implements QuotaOrBuilder {
        /* synthetic */ Builder(C05881 c05881) {
        }

        public Builder addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        }

        public Builder addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        }

        public Builder addLimits(QuotaLimit quotaLimit) {
        }

        public Builder addMetricRules(MetricRule metricRule) {
        }

        public Builder clearLimits() {
        }

        public Builder clearMetricRules() {
        }

        @Override // com.google.api.QuotaOrBuilder
        public QuotaLimit getLimits(int i) {
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getLimitsCount() {
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<QuotaLimit> getLimitsList() {
        }

        @Override // com.google.api.QuotaOrBuilder
        public MetricRule getMetricRules(int i) {
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getMetricRulesCount() {
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<MetricRule> getMetricRulesList() {
        }

        public Builder removeLimits(int i) {
        }

        public Builder removeMetricRules(int i) {
        }

        public Builder setLimits(int i, QuotaLimit quotaLimit) {
        }

        public Builder setMetricRules(int i, MetricRule metricRule) {
        }

        private Builder() {
        }

        public Builder addLimits(int i, QuotaLimit quotaLimit) {
        }

        public Builder addMetricRules(int i, MetricRule metricRule) {
        }

        public Builder setLimits(int i, QuotaLimit.Builder builder) {
        }

        public Builder setMetricRules(int i, MetricRule.Builder builder) {
        }

        public Builder addLimits(QuotaLimit.Builder builder) {
        }

        public Builder addMetricRules(MetricRule.Builder builder) {
        }

        public Builder addLimits(int i, QuotaLimit.Builder builder) {
        }

        public Builder addMetricRules(int i, MetricRule.Builder builder) {
        }
    }

    private Quota() {
    }

    static /* synthetic */ Quota access$000() {
    }

    static /* synthetic */ void access$100(Quota quota, int i, QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$1000(Quota quota, Iterable iterable) {
    }

    static /* synthetic */ void access$1100(Quota quota) {
    }

    static /* synthetic */ void access$1200(Quota quota, int i) {
    }

    static /* synthetic */ void access$200(Quota quota, QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$300(Quota quota, int i, QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$400(Quota quota, Iterable iterable) {
    }

    static /* synthetic */ void access$500(Quota quota) {
    }

    static /* synthetic */ void access$600(Quota quota, int i) {
    }

    static /* synthetic */ void access$700(Quota quota, int i, MetricRule metricRule) {
    }

    static /* synthetic */ void access$800(Quota quota, MetricRule metricRule) {
    }

    static /* synthetic */ void access$900(Quota quota, int i, MetricRule metricRule) {
    }

    private void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
    }

    private void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
    }

    private void addLimits(QuotaLimit quotaLimit) {
    }

    private void addMetricRules(MetricRule metricRule) {
    }

    private void clearLimits() {
    }

    private void clearMetricRules() {
    }

    private void ensureLimitsIsMutable() {
    }

    private void ensureMetricRulesIsMutable() {
    }

    public static Quota getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Quota> parser() {
    }

    private void removeLimits(int i) {
    }

    private void removeMetricRules(int i) {
    }

    private void setLimits(int i, QuotaLimit quotaLimit) {
    }

    private void setMetricRules(int i, MetricRule metricRule) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.QuotaOrBuilder
    public QuotaLimit getLimits(int i) {
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getLimitsCount() {
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<QuotaLimit> getLimitsList() {
    }

    public QuotaLimitOrBuilder getLimitsOrBuilder(int i) {
    }

    public List<? extends QuotaLimitOrBuilder> getLimitsOrBuilderList() {
    }

    @Override // com.google.api.QuotaOrBuilder
    public MetricRule getMetricRules(int i) {
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getMetricRulesCount() {
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<MetricRule> getMetricRulesList() {
    }

    public MetricRuleOrBuilder getMetricRulesOrBuilder(int i) {
    }

    public List<? extends MetricRuleOrBuilder> getMetricRulesOrBuilderList() {
    }

    public static Builder newBuilder(Quota quota) {
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Quota parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addLimits(int i, QuotaLimit quotaLimit) {
    }

    private void addMetricRules(int i, MetricRule metricRule) {
    }

    public static Quota parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Quota parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Quota parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
    }

    public static Quota parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Quota parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Quota parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
