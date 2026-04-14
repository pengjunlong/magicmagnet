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
public final class QuotaLimit extends GeneratedMessageLite<QuotaLimit, Builder> implements QuotaLimitOrBuilder {
    private static final QuotaLimit DEFAULT_INSTANCE = null;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile Parser<QuotaLimit> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private String description_;
    private String displayName_;
    private String duration_;
    private long freeTier_;
    private long maxLimit_;
    private String metric_;
    private String name_;
    private String unit_;
    private MapFieldLite<String, Long> values_;

    /* renamed from: com.google.api.QuotaLimit$1 */
    static /* synthetic */ class C05891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f84xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<QuotaLimit, Builder> implements QuotaLimitOrBuilder {
        /* synthetic */ Builder(C05891 c05891) {
        }

        public Builder clearDefaultLimit() {
        }

        public Builder clearDescription() {
        }

        public Builder clearDisplayName() {
        }

        public Builder clearDuration() {
        }

        public Builder clearFreeTier() {
        }

        public Builder clearMaxLimit() {
        }

        public Builder clearMetric() {
        }

        public Builder clearName() {
        }

        public Builder clearUnit() {
        }

        public Builder clearValues() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public boolean containsValues(String str) {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getDefaultLimit() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getDescription() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getDisplayName() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public ByteString getDisplayNameBytes() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getDuration() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public ByteString getDurationBytes() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getFreeTier() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getMaxLimit() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getMetric() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public ByteString getMetricBytes() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getName() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public String getUnit() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public ByteString getUnitBytes() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        @Deprecated
        public Map<String, Long> getValues() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public int getValuesCount() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public Map<String, Long> getValuesMap() {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getValuesOrDefault(String str, long j) {
        }

        @Override // com.google.api.QuotaLimitOrBuilder
        public long getValuesOrThrow(String str) {
        }

        public Builder putAllValues(Map<String, Long> map) {
        }

        public Builder putValues(String str, long j) {
        }

        public Builder removeValues(String str) {
        }

        public Builder setDefaultLimit(long j) {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        public Builder setDisplayName(String str) {
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
        }

        public Builder setDuration(String str) {
        }

        public Builder setDurationBytes(ByteString byteString) {
        }

        public Builder setFreeTier(long j) {
        }

        public Builder setMaxLimit(long j) {
        }

        public Builder setMetric(String str) {
        }

        public Builder setMetricBytes(ByteString byteString) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setUnit(String str) {
        }

        public Builder setUnitBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private static final class ValuesDefaultEntryHolder {
        static final MapEntryLite<String, Long> defaultEntry = null;

        private ValuesDefaultEntryHolder() {
        }
    }

    private QuotaLimit() {
    }

    static /* synthetic */ QuotaLimit access$000() {
    }

    static /* synthetic */ void access$100(QuotaLimit quotaLimit, String str) {
    }

    static /* synthetic */ void access$1000(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$1100(QuotaLimit quotaLimit, long j) {
    }

    static /* synthetic */ void access$1200(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$1300(QuotaLimit quotaLimit, String str) {
    }

    static /* synthetic */ void access$1400(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$1500(QuotaLimit quotaLimit, ByteString byteString) {
    }

    static /* synthetic */ void access$1600(QuotaLimit quotaLimit, String str) {
    }

    static /* synthetic */ void access$1700(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$1800(QuotaLimit quotaLimit, ByteString byteString) {
    }

    static /* synthetic */ void access$1900(QuotaLimit quotaLimit, String str) {
    }

    static /* synthetic */ void access$200(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$2000(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$2100(QuotaLimit quotaLimit, ByteString byteString) {
    }

    static /* synthetic */ Map access$2200(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$2300(QuotaLimit quotaLimit, String str) {
    }

    static /* synthetic */ void access$2400(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$2500(QuotaLimit quotaLimit, ByteString byteString) {
    }

    static /* synthetic */ void access$300(QuotaLimit quotaLimit, ByteString byteString) {
    }

    static /* synthetic */ void access$400(QuotaLimit quotaLimit, String str) {
    }

    static /* synthetic */ void access$500(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$600(QuotaLimit quotaLimit, ByteString byteString) {
    }

    static /* synthetic */ void access$700(QuotaLimit quotaLimit, long j) {
    }

    static /* synthetic */ void access$800(QuotaLimit quotaLimit) {
    }

    static /* synthetic */ void access$900(QuotaLimit quotaLimit, long j) {
    }

    private void clearDefaultLimit() {
    }

    private void clearDescription() {
    }

    private void clearDisplayName() {
    }

    private void clearDuration() {
    }

    private void clearFreeTier() {
    }

    private void clearMaxLimit() {
    }

    private void clearMetric() {
    }

    private void clearName() {
    }

    private void clearUnit() {
    }

    public static QuotaLimit getDefaultInstance() {
    }

    private Map<String, Long> getMutableValuesMap() {
    }

    private MapFieldLite<String, Long> internalGetMutableValues() {
    }

    private MapFieldLite<String, Long> internalGetValues() {
    }

    public static Builder newBuilder() {
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<QuotaLimit> parser() {
    }

    private void setDefaultLimit(long j) {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    private void setDisplayName(String str) {
    }

    private void setDisplayNameBytes(ByteString byteString) {
    }

    private void setDuration(String str) {
    }

    private void setDurationBytes(ByteString byteString) {
    }

    private void setFreeTier(long j) {
    }

    private void setMaxLimit(long j) {
    }

    private void setMetric(String str) {
    }

    private void setMetricBytes(ByteString byteString) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setUnit(String str) {
    }

    private void setUnitBytes(ByteString byteString) {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public boolean containsValues(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public long getDefaultLimit() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getDescription() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getDisplayName() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public ByteString getDisplayNameBytes() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getDuration() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public ByteString getDurationBytes() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public long getFreeTier() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public long getMaxLimit() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getMetric() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public ByteString getMetricBytes() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getName() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public String getUnit() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public ByteString getUnitBytes() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    @Deprecated
    public Map<String, Long> getValues() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public int getValuesCount() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public Map<String, Long> getValuesMap() {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public long getValuesOrDefault(String str, long j) {
    }

    @Override // com.google.api.QuotaLimitOrBuilder
    public long getValuesOrThrow(String str) {
    }

    public static Builder newBuilder(QuotaLimit quotaLimit) {
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static QuotaLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static QuotaLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static QuotaLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static QuotaLimit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static QuotaLimit parseFrom(InputStream inputStream) throws IOException {
    }

    public static QuotaLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static QuotaLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static QuotaLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
