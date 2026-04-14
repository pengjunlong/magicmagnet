package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MetricDescriptor extends GeneratedMessageLite<MetricDescriptor, Builder> implements MetricDescriptorOrBuilder {
    private static final MetricDescriptor DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<MetricDescriptor> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private String description_;
    private String displayName_;
    private Internal.ProtobufList<LabelDescriptor> labels_;
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private String name_;
    private String type_;
    private String unit_;
    private int valueType_;

    /* renamed from: com.google.api.MetricDescriptor$1 */
    static /* synthetic */ class C05751 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f73xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MetricDescriptor, Builder> implements MetricDescriptorOrBuilder {
        /* synthetic */ Builder(C05751 c05751) {
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
        }

        public Builder clearDescription() {
        }

        public Builder clearDisplayName() {
        }

        public Builder clearLabels() {
        }

        public Builder clearLaunchStage() {
        }

        public Builder clearMetadata() {
        }

        public Builder clearMetricKind() {
        }

        public Builder clearName() {
        }

        public Builder clearType() {
        }

        public Builder clearUnit() {
        }

        public Builder clearValueType() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getDescription() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getDisplayName() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getDisplayNameBytes() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getLabelsCount() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LaunchStage getLaunchStage() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getLaunchStageValue() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricDescriptorMetadata getMetadata() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricKind getMetricKind() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getMetricKindValue() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getName() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getType() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getTypeBytes() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getUnit() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getUnitBytes() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ValueType getValueType() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getValueTypeValue() {
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public boolean hasMetadata() {
        }

        public Builder mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        }

        public Builder removeLabels(int i) {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        public Builder setDisplayName(String str) {
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
        }

        public Builder setLabels(int i, LabelDescriptor labelDescriptor) {
        }

        public Builder setLaunchStage(LaunchStage launchStage) {
        }

        public Builder setLaunchStageValue(int i) {
        }

        public Builder setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        }

        public Builder setMetricKind(MetricKind metricKind) {
        }

        public Builder setMetricKindValue(int i) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setType(String str) {
        }

        public Builder setTypeBytes(ByteString byteString) {
        }

        public Builder setUnit(String str) {
        }

        public Builder setUnitBytes(ByteString byteString) {
        }

        public Builder setValueType(ValueType valueType) {
        }

        public Builder setValueTypeValue(int i) {
        }

        private Builder() {
        }

        public Builder addLabels(int i, LabelDescriptor labelDescriptor) {
        }

        public Builder setLabels(int i, LabelDescriptor.Builder builder) {
        }

        public Builder setMetadata(MetricDescriptorMetadata.Builder builder) {
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
        }

        public Builder addLabels(int i, LabelDescriptor.Builder builder) {
        }
    }

    public static final class MetricDescriptorMetadata extends GeneratedMessageLite<MetricDescriptorMetadata, Builder> implements MetricDescriptorMetadataOrBuilder {
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE = null;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile Parser<MetricDescriptorMetadata> PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        public static final class Builder extends GeneratedMessageLite.Builder<MetricDescriptorMetadata, Builder> implements MetricDescriptorMetadataOrBuilder {
            /* synthetic */ Builder(C05751 c05751) {
            }

            public Builder clearIngestDelay() {
            }

            @Deprecated
            public Builder clearLaunchStage() {
            }

            public Builder clearSamplePeriod() {
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public Duration getIngestDelay() {
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            @Deprecated
            public LaunchStage getLaunchStage() {
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            @Deprecated
            public int getLaunchStageValue() {
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public Duration getSamplePeriod() {
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public boolean hasIngestDelay() {
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public boolean hasSamplePeriod() {
            }

            public Builder mergeIngestDelay(Duration duration) {
            }

            public Builder mergeSamplePeriod(Duration duration) {
            }

            public Builder setIngestDelay(Duration duration) {
            }

            @Deprecated
            public Builder setLaunchStage(LaunchStage launchStage) {
            }

            @Deprecated
            public Builder setLaunchStageValue(int i) {
            }

            public Builder setSamplePeriod(Duration duration) {
            }

            private Builder() {
            }

            public Builder setIngestDelay(Duration.Builder builder) {
            }

            public Builder setSamplePeriod(Duration.Builder builder) {
            }
        }

        private MetricDescriptorMetadata() {
        }

        static /* synthetic */ MetricDescriptorMetadata access$000() {
        }

        static /* synthetic */ void access$100(MetricDescriptorMetadata metricDescriptorMetadata, int i) {
        }

        static /* synthetic */ void access$200(MetricDescriptorMetadata metricDescriptorMetadata, LaunchStage launchStage) {
        }

        static /* synthetic */ void access$300(MetricDescriptorMetadata metricDescriptorMetadata) {
        }

        static /* synthetic */ void access$400(MetricDescriptorMetadata metricDescriptorMetadata, Duration duration) {
        }

        static /* synthetic */ void access$500(MetricDescriptorMetadata metricDescriptorMetadata, Duration duration) {
        }

        static /* synthetic */ void access$600(MetricDescriptorMetadata metricDescriptorMetadata) {
        }

        static /* synthetic */ void access$700(MetricDescriptorMetadata metricDescriptorMetadata, Duration duration) {
        }

        static /* synthetic */ void access$800(MetricDescriptorMetadata metricDescriptorMetadata, Duration duration) {
        }

        static /* synthetic */ void access$900(MetricDescriptorMetadata metricDescriptorMetadata) {
        }

        private void clearIngestDelay() {
        }

        private void clearLaunchStage() {
        }

        private void clearSamplePeriod() {
        }

        public static MetricDescriptorMetadata getDefaultInstance() {
        }

        private void mergeIngestDelay(Duration duration) {
        }

        private void mergeSamplePeriod(Duration duration) {
        }

        public static Builder newBuilder() {
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<MetricDescriptorMetadata> parser() {
        }

        private void setIngestDelay(Duration duration) {
        }

        private void setLaunchStage(LaunchStage launchStage) {
        }

        private void setLaunchStageValue(int i) {
        }

        private void setSamplePeriod(Duration duration) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public Duration getIngestDelay() {
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        @Deprecated
        public LaunchStage getLaunchStage() {
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        @Deprecated
        public int getLaunchStageValue() {
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public Duration getSamplePeriod() {
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public boolean hasIngestDelay() {
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public boolean hasSamplePeriod() {
        }

        public static Builder newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) throws IOException {
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface MetricDescriptorMetadataOrBuilder extends MessageLiteOrBuilder {
        Duration getIngestDelay();

        @Deprecated
        LaunchStage getLaunchStage();

        @Deprecated
        int getLaunchStageValue();

        Duration getSamplePeriod();

        boolean hasIngestDelay();

        boolean hasSamplePeriod();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class MetricKind implements Internal.EnumLite {
        private static final /* synthetic */ MetricKind[] $VALUES = null;
        public static final MetricKind CUMULATIVE = null;
        public static final int CUMULATIVE_VALUE = 3;
        public static final MetricKind DELTA = null;
        public static final int DELTA_VALUE = 2;
        public static final MetricKind GAUGE = null;
        public static final int GAUGE_VALUE = 1;
        public static final MetricKind METRIC_KIND_UNSPECIFIED = null;
        public static final int METRIC_KIND_UNSPECIFIED_VALUE = 0;
        public static final MetricKind UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<MetricKind> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.api.MetricDescriptor$MetricKind$1 */
        class C05761 implements Internal.EnumLiteMap<MetricKind> {
            C05761() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ MetricKind findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MetricKind findValueByNumber(int i) {
            }
        }

        private static final class MetricKindVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private MetricKindVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private MetricKind(String str, int i, int i2) {
        }

        public static MetricKind forNumber(int i) {
        }

        public static Internal.EnumLiteMap<MetricKind> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static MetricKind valueOf(String str) {
        }

        public static MetricKind[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static MetricKind valueOf(int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class ValueType implements Internal.EnumLite {
        private static final /* synthetic */ ValueType[] $VALUES = null;
        public static final ValueType BOOL = null;
        public static final int BOOL_VALUE = 1;
        public static final ValueType DISTRIBUTION = null;
        public static final int DISTRIBUTION_VALUE = 5;
        public static final ValueType DOUBLE = null;
        public static final int DOUBLE_VALUE = 3;
        public static final ValueType INT64 = null;
        public static final int INT64_VALUE = 2;
        public static final ValueType MONEY = null;
        public static final int MONEY_VALUE = 6;
        public static final ValueType STRING = null;
        public static final int STRING_VALUE = 4;
        public static final ValueType UNRECOGNIZED = null;
        public static final ValueType VALUE_TYPE_UNSPECIFIED = null;
        public static final int VALUE_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<ValueType> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.api.MetricDescriptor$ValueType$1 */
        class C05771 implements Internal.EnumLiteMap<ValueType> {
            C05771() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ ValueType findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ValueType findValueByNumber(int i) {
            }
        }

        private static final class ValueTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private ValueTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private ValueType(String str, int i, int i2) {
        }

        public static ValueType forNumber(int i) {
        }

        public static Internal.EnumLiteMap<ValueType> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static ValueType valueOf(String str) {
        }

        public static ValueType[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static ValueType valueOf(int i) {
        }
    }

    private MetricDescriptor() {
    }

    static /* synthetic */ MetricDescriptor access$1100() {
    }

    static /* synthetic */ void access$1200(MetricDescriptor metricDescriptor, String str) {
    }

    static /* synthetic */ void access$1300(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$1400(MetricDescriptor metricDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$1500(MetricDescriptor metricDescriptor, String str) {
    }

    static /* synthetic */ void access$1600(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$1700(MetricDescriptor metricDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$1800(MetricDescriptor metricDescriptor, int i, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$1900(MetricDescriptor metricDescriptor, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$2000(MetricDescriptor metricDescriptor, int i, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$2100(MetricDescriptor metricDescriptor, Iterable iterable) {
    }

    static /* synthetic */ void access$2200(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$2300(MetricDescriptor metricDescriptor, int i) {
    }

    static /* synthetic */ void access$2400(MetricDescriptor metricDescriptor, int i) {
    }

    static /* synthetic */ void access$2500(MetricDescriptor metricDescriptor, MetricKind metricKind) {
    }

    static /* synthetic */ void access$2600(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$2700(MetricDescriptor metricDescriptor, int i) {
    }

    static /* synthetic */ void access$2800(MetricDescriptor metricDescriptor, ValueType valueType) {
    }

    static /* synthetic */ void access$2900(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$3000(MetricDescriptor metricDescriptor, String str) {
    }

    static /* synthetic */ void access$3100(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$3200(MetricDescriptor metricDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$3300(MetricDescriptor metricDescriptor, String str) {
    }

    static /* synthetic */ void access$3400(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$3500(MetricDescriptor metricDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$3600(MetricDescriptor metricDescriptor, String str) {
    }

    static /* synthetic */ void access$3700(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$3800(MetricDescriptor metricDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$3900(MetricDescriptor metricDescriptor, MetricDescriptorMetadata metricDescriptorMetadata) {
    }

    static /* synthetic */ void access$4000(MetricDescriptor metricDescriptor, MetricDescriptorMetadata metricDescriptorMetadata) {
    }

    static /* synthetic */ void access$4100(MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$4200(MetricDescriptor metricDescriptor, int i) {
    }

    static /* synthetic */ void access$4300(MetricDescriptor metricDescriptor, LaunchStage launchStage) {
    }

    static /* synthetic */ void access$4400(MetricDescriptor metricDescriptor) {
    }

    private void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
    }

    private void addLabels(LabelDescriptor labelDescriptor) {
    }

    private void clearDescription() {
    }

    private void clearDisplayName() {
    }

    private void clearLabels() {
    }

    private void clearLaunchStage() {
    }

    private void clearMetadata() {
    }

    private void clearMetricKind() {
    }

    private void clearName() {
    }

    private void clearType() {
    }

    private void clearUnit() {
    }

    private void clearValueType() {
    }

    private void ensureLabelsIsMutable() {
    }

    public static MetricDescriptor getDefaultInstance() {
    }

    private void mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
    }

    public static Builder newBuilder() {
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<MetricDescriptor> parser() {
    }

    private void removeLabels(int i) {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    private void setDisplayName(String str) {
    }

    private void setDisplayNameBytes(ByteString byteString) {
    }

    private void setLabels(int i, LabelDescriptor labelDescriptor) {
    }

    private void setLaunchStage(LaunchStage launchStage) {
    }

    private void setLaunchStageValue(int i) {
    }

    private void setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
    }

    private void setMetricKind(MetricKind metricKind) {
    }

    private void setMetricKindValue(int i) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setType(String str) {
    }

    private void setTypeBytes(ByteString byteString) {
    }

    private void setUnit(String str) {
    }

    private void setUnitBytes(ByteString byteString) {
    }

    private void setValueType(ValueType valueType) {
    }

    private void setValueTypeValue(int i) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getDescription() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getDisplayName() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getDisplayNameBytes() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getLabelsCount() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LaunchStage getLaunchStage() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getLaunchStageValue() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricDescriptorMetadata getMetadata() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricKind getMetricKind() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getMetricKindValue() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getName() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getType() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getTypeBytes() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getUnit() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getUnitBytes() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ValueType getValueType() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getValueTypeValue() {
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public boolean hasMetadata() {
    }

    public static Builder newBuilder(MetricDescriptor metricDescriptor) {
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MetricDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addLabels(int i, LabelDescriptor labelDescriptor) {
    }

    public static MetricDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MetricDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static MetricDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) throws IOException {
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
