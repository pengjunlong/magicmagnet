package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MetricRule extends GeneratedMessageLite<MetricRule, Builder> implements MetricRuleOrBuilder {
    private static final MetricRule DEFAULT_INSTANCE = null;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile Parser<MetricRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private MapFieldLite<String, Long> metricCosts_;
    private String selector_;

    /* renamed from: com.google.api.MetricRule$1 */
    static /* synthetic */ class C05781 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f74xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MetricRule, Builder> implements MetricRuleOrBuilder {
        /* synthetic */ Builder(C05781 c05781) {
        }

        public Builder clearMetricCosts() {
        }

        public Builder clearSelector() {
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public boolean containsMetricCosts(String str) {
        }

        @Override // com.google.api.MetricRuleOrBuilder
        @Deprecated
        public Map<String, Long> getMetricCosts() {
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public int getMetricCostsCount() {
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public Map<String, Long> getMetricCostsMap() {
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public long getMetricCostsOrDefault(String str, long j) {
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public long getMetricCostsOrThrow(String str) {
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public String getSelector() {
        }

        @Override // com.google.api.MetricRuleOrBuilder
        public ByteString getSelectorBytes() {
        }

        public Builder putAllMetricCosts(Map<String, Long> map) {
        }

        public Builder putMetricCosts(String str, long j) {
        }

        public Builder removeMetricCosts(String str) {
        }

        public Builder setSelector(String str) {
        }

        public Builder setSelectorBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private static final class MetricCostsDefaultEntryHolder {
        static final MapEntryLite<String, Long> defaultEntry = null;

        private MetricCostsDefaultEntryHolder() {
        }
    }

    private MetricRule() {
    }

    static /* synthetic */ MetricRule access$000() {
    }

    static /* synthetic */ void access$100(MetricRule metricRule, String str) {
    }

    static /* synthetic */ void access$200(MetricRule metricRule) {
    }

    static /* synthetic */ void access$300(MetricRule metricRule, ByteString byteString) {
    }

    static /* synthetic */ Map access$400(MetricRule metricRule) {
    }

    private void clearSelector() {
    }

    public static MetricRule getDefaultInstance() {
    }

    private Map<String, Long> getMutableMetricCostsMap() {
    }

    private MapFieldLite<String, Long> internalGetMetricCosts() {
    }

    private MapFieldLite<String, Long> internalGetMutableMetricCosts() {
    }

    public static Builder newBuilder() {
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<MetricRule> parser() {
    }

    private void setSelector(String str) {
    }

    private void setSelectorBytes(ByteString byteString) {
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public boolean containsMetricCosts(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.MetricRuleOrBuilder
    @Deprecated
    public Map<String, Long> getMetricCosts() {
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public int getMetricCostsCount() {
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public Map<String, Long> getMetricCostsMap() {
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public long getMetricCostsOrDefault(String str, long j) {
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public long getMetricCostsOrThrow(String str) {
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public String getSelector() {
    }

    @Override // com.google.api.MetricRuleOrBuilder
    public ByteString getSelectorBytes() {
    }

    public static Builder newBuilder(MetricRule metricRule) {
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MetricRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static MetricRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MetricRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static MetricRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MetricRule parseFrom(InputStream inputStream) throws IOException {
    }

    public static MetricRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static MetricRule parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static MetricRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
