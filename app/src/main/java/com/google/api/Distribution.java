package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Distribution extends GeneratedMessageLite<Distribution, Builder> implements DistributionOrBuilder {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final Distribution DEFAULT_INSTANCE = null;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile Parser<Distribution> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bucketCountsMemoizedSerializedSize;
    private Internal.LongList bucketCounts_;
    private BucketOptions bucketOptions_;
    private long count_;
    private Internal.ProtobufList<Exemplar> exemplars_;
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;

    /* renamed from: com.google.api.Distribution$1 */
    static /* synthetic */ class C05601 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f61xa1df5c61 = null;
    }

    public static final class BucketOptions extends GeneratedMessageLite<BucketOptions, Builder> implements BucketOptionsOrBuilder {
        private static final BucketOptions DEFAULT_INSTANCE = null;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile Parser<BucketOptions> PARSER;
        private int optionsCase_;
        private Object options_;

        public static final class Builder extends GeneratedMessageLite.Builder<BucketOptions, Builder> implements BucketOptionsOrBuilder {
            /* synthetic */ Builder(C05601 c05601) {
            }

            public Builder clearExplicitBuckets() {
            }

            public Builder clearExponentialBuckets() {
            }

            public Builder clearLinearBuckets() {
            }

            public Builder clearOptions() {
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Explicit getExplicitBuckets() {
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Exponential getExponentialBuckets() {
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Linear getLinearBuckets() {
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public OptionsCase getOptionsCase() {
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasExplicitBuckets() {
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasExponentialBuckets() {
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasLinearBuckets() {
            }

            public Builder mergeExplicitBuckets(Explicit explicit) {
            }

            public Builder mergeExponentialBuckets(Exponential exponential) {
            }

            public Builder mergeLinearBuckets(Linear linear) {
            }

            public Builder setExplicitBuckets(Explicit explicit) {
            }

            public Builder setExponentialBuckets(Exponential exponential) {
            }

            public Builder setLinearBuckets(Linear linear) {
            }

            private Builder() {
            }

            public Builder setExplicitBuckets(Explicit.Builder builder) {
            }

            public Builder setExponentialBuckets(Exponential.Builder builder) {
            }

            public Builder setLinearBuckets(Linear.Builder builder) {
            }
        }

        public static final class Explicit extends GeneratedMessageLite<Explicit, Builder> implements ExplicitOrBuilder {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final Explicit DEFAULT_INSTANCE = null;
            private static volatile Parser<Explicit> PARSER;
            private int boundsMemoizedSerializedSize;
            private Internal.DoubleList bounds_;

            public static final class Builder extends GeneratedMessageLite.Builder<Explicit, Builder> implements ExplicitOrBuilder {
                /* synthetic */ Builder(C05601 c05601) {
                }

                public Builder addAllBounds(Iterable<? extends Double> iterable) {
                }

                public Builder addBounds(double d) {
                }

                public Builder clearBounds() {
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public double getBounds(int i) {
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public int getBoundsCount() {
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public List<Double> getBoundsList() {
                }

                public Builder setBounds(int i, double d) {
                }

                private Builder() {
                }
            }

            private Explicit() {
            }

            static /* synthetic */ Explicit access$2200() {
            }

            static /* synthetic */ void access$2300(Explicit explicit, int i, double d) {
            }

            static /* synthetic */ void access$2400(Explicit explicit, double d) {
            }

            static /* synthetic */ void access$2500(Explicit explicit, Iterable iterable) {
            }

            static /* synthetic */ void access$2600(Explicit explicit) {
            }

            private void addAllBounds(Iterable<? extends Double> iterable) {
            }

            private void addBounds(double d) {
            }

            private void clearBounds() {
            }

            private void ensureBoundsIsMutable() {
            }

            public static Explicit getDefaultInstance() {
            }

            public static Builder newBuilder() {
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<Explicit> parser() {
            }

            private void setBounds(int i, double d) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public double getBounds(int i) {
            }

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public int getBoundsCount() {
            }

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public List<Double> getBoundsList() {
            }

            public static Builder newBuilder(Explicit explicit) {
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Explicit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static Explicit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Explicit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static Explicit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Explicit parseFrom(InputStream inputStream) throws IOException {
            }

            public static Explicit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface ExplicitOrBuilder extends MessageLiteOrBuilder {
            double getBounds(int i);

            int getBoundsCount();

            List<Double> getBoundsList();
        }

        public static final class Exponential extends GeneratedMessageLite<Exponential, Builder> implements ExponentialOrBuilder {
            private static final Exponential DEFAULT_INSTANCE = null;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile Parser<Exponential> PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            public static final class Builder extends GeneratedMessageLite.Builder<Exponential, Builder> implements ExponentialOrBuilder {
                /* synthetic */ Builder(C05601 c05601) {
                }

                public Builder clearGrowthFactor() {
                }

                public Builder clearNumFiniteBuckets() {
                }

                public Builder clearScale() {
                }

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public double getGrowthFactor() {
                }

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public int getNumFiniteBuckets() {
                }

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public double getScale() {
                }

                public Builder setGrowthFactor(double d) {
                }

                public Builder setNumFiniteBuckets(int i) {
                }

                public Builder setScale(double d) {
                }

                private Builder() {
                }
            }

            private Exponential() {
            }

            static /* synthetic */ Exponential access$1400() {
            }

            static /* synthetic */ void access$1500(Exponential exponential, int i) {
            }

            static /* synthetic */ void access$1600(Exponential exponential) {
            }

            static /* synthetic */ void access$1700(Exponential exponential, double d) {
            }

            static /* synthetic */ void access$1800(Exponential exponential) {
            }

            static /* synthetic */ void access$1900(Exponential exponential, double d) {
            }

            static /* synthetic */ void access$2000(Exponential exponential) {
            }

            private void clearGrowthFactor() {
            }

            private void clearNumFiniteBuckets() {
            }

            private void clearScale() {
            }

            public static Exponential getDefaultInstance() {
            }

            public static Builder newBuilder() {
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<Exponential> parser() {
            }

            private void setGrowthFactor(double d) {
            }

            private void setNumFiniteBuckets(int i) {
            }

            private void setScale(double d) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public double getGrowthFactor() {
            }

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public int getNumFiniteBuckets() {
            }

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public double getScale() {
            }

            public static Builder newBuilder(Exponential exponential) {
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Exponential parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static Exponential parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Exponential parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static Exponential parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Exponential parseFrom(InputStream inputStream) throws IOException {
            }

            public static Exponential parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface ExponentialOrBuilder extends MessageLiteOrBuilder {
            double getGrowthFactor();

            int getNumFiniteBuckets();

            double getScale();
        }

        public static final class Linear extends GeneratedMessageLite<Linear, Builder> implements LinearOrBuilder {
            private static final Linear DEFAULT_INSTANCE = null;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile Parser<Linear> PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            public static final class Builder extends GeneratedMessageLite.Builder<Linear, Builder> implements LinearOrBuilder {
                /* synthetic */ Builder(C05601 c05601) {
                }

                public Builder clearNumFiniteBuckets() {
                }

                public Builder clearOffset() {
                }

                public Builder clearWidth() {
                }

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public int getNumFiniteBuckets() {
                }

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public double getOffset() {
                }

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public double getWidth() {
                }

                public Builder setNumFiniteBuckets(int i) {
                }

                public Builder setOffset(double d) {
                }

                public Builder setWidth(double d) {
                }

                private Builder() {
                }
            }

            private Linear() {
            }

            static /* synthetic */ void access$1000(Linear linear) {
            }

            static /* synthetic */ void access$1100(Linear linear, double d) {
            }

            static /* synthetic */ void access$1200(Linear linear) {
            }

            static /* synthetic */ Linear access$600() {
            }

            static /* synthetic */ void access$700(Linear linear, int i) {
            }

            static /* synthetic */ void access$800(Linear linear) {
            }

            static /* synthetic */ void access$900(Linear linear, double d) {
            }

            private void clearNumFiniteBuckets() {
            }

            private void clearOffset() {
            }

            private void clearWidth() {
            }

            public static Linear getDefaultInstance() {
            }

            public static Builder newBuilder() {
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static Linear parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            }

            public static Parser<Linear> parser() {
            }

            private void setNumFiniteBuckets(int i) {
            }

            private void setOffset(double d) {
            }

            private void setWidth(double d) {
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            }

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public int getNumFiniteBuckets() {
            }

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public double getOffset() {
            }

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public double getWidth() {
            }

            public static Builder newBuilder(Linear linear) {
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Linear parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Linear parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            }

            public static Linear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Linear parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            }

            public static Linear parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            }

            public static Linear parseFrom(InputStream inputStream) throws IOException {
            }

            public static Linear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }

            public static Linear parseFrom(CodedInputStream codedInputStream) throws IOException {
            }

            public static Linear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            }
        }

        public interface LinearOrBuilder extends MessageLiteOrBuilder {
            int getNumFiniteBuckets();

            double getOffset();

            double getWidth();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class OptionsCase {
            private static final /* synthetic */ OptionsCase[] $VALUES = null;
            public static final OptionsCase EXPLICIT_BUCKETS = null;
            public static final OptionsCase EXPONENTIAL_BUCKETS = null;
            public static final OptionsCase LINEAR_BUCKETS = null;
            public static final OptionsCase OPTIONS_NOT_SET = null;
            private final int value;

            private OptionsCase(String str, int i, int i2) {
            }

            public static OptionsCase forNumber(int i) {
            }

            public static OptionsCase valueOf(String str) {
            }

            public static OptionsCase[] values() {
            }

            public int getNumber() {
            }

            @Deprecated
            public static OptionsCase valueOf(int i) {
            }
        }

        private BucketOptions() {
        }

        static /* synthetic */ BucketOptions access$2800() {
        }

        static /* synthetic */ void access$2900(BucketOptions bucketOptions) {
        }

        static /* synthetic */ void access$3000(BucketOptions bucketOptions, Linear linear) {
        }

        static /* synthetic */ void access$3100(BucketOptions bucketOptions, Linear linear) {
        }

        static /* synthetic */ void access$3200(BucketOptions bucketOptions) {
        }

        static /* synthetic */ void access$3300(BucketOptions bucketOptions, Exponential exponential) {
        }

        static /* synthetic */ void access$3400(BucketOptions bucketOptions, Exponential exponential) {
        }

        static /* synthetic */ void access$3500(BucketOptions bucketOptions) {
        }

        static /* synthetic */ void access$3600(BucketOptions bucketOptions, Explicit explicit) {
        }

        static /* synthetic */ void access$3700(BucketOptions bucketOptions, Explicit explicit) {
        }

        static /* synthetic */ void access$3800(BucketOptions bucketOptions) {
        }

        private void clearExplicitBuckets() {
        }

        private void clearExponentialBuckets() {
        }

        private void clearLinearBuckets() {
        }

        private void clearOptions() {
        }

        public static BucketOptions getDefaultInstance() {
        }

        private void mergeExplicitBuckets(Explicit explicit) {
        }

        private void mergeExponentialBuckets(Exponential exponential) {
        }

        private void mergeLinearBuckets(Linear linear) {
        }

        public static Builder newBuilder() {
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<BucketOptions> parser() {
        }

        private void setExplicitBuckets(Explicit explicit) {
        }

        private void setExponentialBuckets(Exponential exponential) {
        }

        private void setLinearBuckets(Linear linear) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Explicit getExplicitBuckets() {
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Exponential getExponentialBuckets() {
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Linear getLinearBuckets() {
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public OptionsCase getOptionsCase() {
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasExplicitBuckets() {
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasExponentialBuckets() {
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasLinearBuckets() {
        }

        public static Builder newBuilder(BucketOptions bucketOptions) {
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static BucketOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static BucketOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static BucketOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static BucketOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static BucketOptions parseFrom(InputStream inputStream) throws IOException {
        }

        public static BucketOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface BucketOptionsOrBuilder extends MessageLiteOrBuilder {
        BucketOptions.Explicit getExplicitBuckets();

        BucketOptions.Exponential getExponentialBuckets();

        BucketOptions.Linear getLinearBuckets();

        BucketOptions.OptionsCase getOptionsCase();

        boolean hasExplicitBuckets();

        boolean hasExponentialBuckets();

        boolean hasLinearBuckets();
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Distribution, Builder> implements DistributionOrBuilder {
        /* synthetic */ Builder(C05601 c05601) {
        }

        public Builder addAllBucketCounts(Iterable<? extends Long> iterable) {
        }

        public Builder addAllExemplars(Iterable<? extends Exemplar> iterable) {
        }

        public Builder addBucketCounts(long j) {
        }

        public Builder addExemplars(Exemplar exemplar) {
        }

        public Builder clearBucketCounts() {
        }

        public Builder clearBucketOptions() {
        }

        public Builder clearCount() {
        }

        public Builder clearExemplars() {
        }

        public Builder clearMean() {
        }

        public Builder clearRange() {
        }

        public Builder clearSumOfSquaredDeviation() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public long getBucketCounts(int i) {
        }

        @Override // com.google.api.DistributionOrBuilder
        public int getBucketCountsCount() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public List<Long> getBucketCountsList() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public BucketOptions getBucketOptions() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public long getCount() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public Exemplar getExemplars(int i) {
        }

        @Override // com.google.api.DistributionOrBuilder
        public int getExemplarsCount() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public List<Exemplar> getExemplarsList() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public double getMean() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public Range getRange() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public double getSumOfSquaredDeviation() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public boolean hasBucketOptions() {
        }

        @Override // com.google.api.DistributionOrBuilder
        public boolean hasRange() {
        }

        public Builder mergeBucketOptions(BucketOptions bucketOptions) {
        }

        public Builder mergeRange(Range range) {
        }

        public Builder removeExemplars(int i) {
        }

        public Builder setBucketCounts(int i, long j) {
        }

        public Builder setBucketOptions(BucketOptions bucketOptions) {
        }

        public Builder setCount(long j) {
        }

        public Builder setExemplars(int i, Exemplar exemplar) {
        }

        public Builder setMean(double d) {
        }

        public Builder setRange(Range range) {
        }

        public Builder setSumOfSquaredDeviation(double d) {
        }

        private Builder() {
        }

        public Builder addExemplars(int i, Exemplar exemplar) {
        }

        public Builder setBucketOptions(BucketOptions.Builder builder) {
        }

        public Builder setExemplars(int i, Exemplar.Builder builder) {
        }

        public Builder setRange(Range.Builder builder) {
        }

        public Builder addExemplars(Exemplar.Builder builder) {
        }

        public Builder addExemplars(int i, Exemplar.Builder builder) {
        }
    }

    public static final class Exemplar extends GeneratedMessageLite<Exemplar, Builder> implements ExemplarOrBuilder {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        private static final Exemplar DEFAULT_INSTANCE = null;
        private static volatile Parser<Exemplar> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private Internal.ProtobufList<Any> attachments_;
        private Timestamp timestamp_;
        private double value_;

        public static final class Builder extends GeneratedMessageLite.Builder<Exemplar, Builder> implements ExemplarOrBuilder {
            /* synthetic */ Builder(C05601 c05601) {
            }

            public Builder addAllAttachments(Iterable<? extends Any> iterable) {
            }

            public Builder addAttachments(Any any) {
            }

            public Builder clearAttachments() {
            }

            public Builder clearTimestamp() {
            }

            public Builder clearValue() {
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public Any getAttachments(int i) {
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public int getAttachmentsCount() {
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public List<Any> getAttachmentsList() {
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public Timestamp getTimestamp() {
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public double getValue() {
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public boolean hasTimestamp() {
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
            }

            public Builder removeAttachments(int i) {
            }

            public Builder setAttachments(int i, Any any) {
            }

            public Builder setTimestamp(Timestamp timestamp) {
            }

            public Builder setValue(double d) {
            }

            private Builder() {
            }

            public Builder addAttachments(int i, Any any) {
            }

            public Builder setAttachments(int i, Any.Builder builder) {
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
            }

            public Builder addAttachments(Any.Builder builder) {
            }

            public Builder addAttachments(int i, Any.Builder builder) {
            }
        }

        private Exemplar() {
        }

        static /* synthetic */ Exemplar access$4000() {
        }

        static /* synthetic */ void access$4100(Exemplar exemplar, double d) {
        }

        static /* synthetic */ void access$4200(Exemplar exemplar) {
        }

        static /* synthetic */ void access$4300(Exemplar exemplar, Timestamp timestamp) {
        }

        static /* synthetic */ void access$4400(Exemplar exemplar, Timestamp timestamp) {
        }

        static /* synthetic */ void access$4500(Exemplar exemplar) {
        }

        static /* synthetic */ void access$4600(Exemplar exemplar, int i, Any any) {
        }

        static /* synthetic */ void access$4700(Exemplar exemplar, Any any) {
        }

        static /* synthetic */ void access$4800(Exemplar exemplar, int i, Any any) {
        }

        static /* synthetic */ void access$4900(Exemplar exemplar, Iterable iterable) {
        }

        static /* synthetic */ void access$5000(Exemplar exemplar) {
        }

        static /* synthetic */ void access$5100(Exemplar exemplar, int i) {
        }

        private void addAllAttachments(Iterable<? extends Any> iterable) {
        }

        private void addAttachments(Any any) {
        }

        private void clearAttachments() {
        }

        private void clearTimestamp() {
        }

        private void clearValue() {
        }

        private void ensureAttachmentsIsMutable() {
        }

        public static Exemplar getDefaultInstance() {
        }

        private void mergeTimestamp(Timestamp timestamp) {
        }

        public static Builder newBuilder() {
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Exemplar> parser() {
        }

        private void removeAttachments(int i) {
        }

        private void setAttachments(int i, Any any) {
        }

        private void setTimestamp(Timestamp timestamp) {
        }

        private void setValue(double d) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public Any getAttachments(int i) {
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public int getAttachmentsCount() {
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public List<Any> getAttachmentsList() {
        }

        public AnyOrBuilder getAttachmentsOrBuilder(int i) {
        }

        public List<? extends AnyOrBuilder> getAttachmentsOrBuilderList() {
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public Timestamp getTimestamp() {
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public double getValue() {
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public boolean hasTimestamp() {
        }

        public static Builder newBuilder(Exemplar exemplar) {
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Exemplar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        private void addAttachments(int i, Any any) {
        }

        public static Exemplar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Exemplar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Exemplar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Exemplar parseFrom(InputStream inputStream) throws IOException {
        }

        public static Exemplar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Exemplar parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Exemplar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface ExemplarOrBuilder extends MessageLiteOrBuilder {
        Any getAttachments(int i);

        int getAttachmentsCount();

        List<Any> getAttachmentsList();

        Timestamp getTimestamp();

        double getValue();

        boolean hasTimestamp();
    }

    public static final class Range extends GeneratedMessageLite<Range, Builder> implements RangeOrBuilder {
        private static final Range DEFAULT_INSTANCE = null;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile Parser<Range> PARSER;
        private double max_;
        private double min_;

        public static final class Builder extends GeneratedMessageLite.Builder<Range, Builder> implements RangeOrBuilder {
            /* synthetic */ Builder(C05601 c05601) {
            }

            public Builder clearMax() {
            }

            public Builder clearMin() {
            }

            @Override // com.google.api.Distribution.RangeOrBuilder
            public double getMax() {
            }

            @Override // com.google.api.Distribution.RangeOrBuilder
            public double getMin() {
            }

            public Builder setMax(double d) {
            }

            public Builder setMin(double d) {
            }

            private Builder() {
            }
        }

        private Range() {
        }

        static /* synthetic */ Range access$000() {
        }

        static /* synthetic */ void access$100(Range range, double d) {
        }

        static /* synthetic */ void access$200(Range range) {
        }

        static /* synthetic */ void access$300(Range range, double d) {
        }

        static /* synthetic */ void access$400(Range range) {
        }

        private void clearMax() {
        }

        private void clearMin() {
        }

        public static Range getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static Range parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Range parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Range> parser() {
        }

        private void setMax(double d) {
        }

        private void setMin(double d) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.api.Distribution.RangeOrBuilder
        public double getMax() {
        }

        @Override // com.google.api.Distribution.RangeOrBuilder
        public double getMin() {
        }

        public static Builder newBuilder(Range range) {
        }

        public static Range parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Range parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Range parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Range parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Range parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Range parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Range parseFrom(InputStream inputStream) throws IOException {
        }

        public static Range parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Range parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Range parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface RangeOrBuilder extends MessageLiteOrBuilder {
        double getMax();

        double getMin();
    }

    private Distribution() {
    }

    static /* synthetic */ Distribution access$5300() {
    }

    static /* synthetic */ void access$5400(Distribution distribution, long j) {
    }

    static /* synthetic */ void access$5500(Distribution distribution) {
    }

    static /* synthetic */ void access$5600(Distribution distribution, double d) {
    }

    static /* synthetic */ void access$5700(Distribution distribution) {
    }

    static /* synthetic */ void access$5800(Distribution distribution, double d) {
    }

    static /* synthetic */ void access$5900(Distribution distribution) {
    }

    static /* synthetic */ void access$6000(Distribution distribution, Range range) {
    }

    static /* synthetic */ void access$6100(Distribution distribution, Range range) {
    }

    static /* synthetic */ void access$6200(Distribution distribution) {
    }

    static /* synthetic */ void access$6300(Distribution distribution, BucketOptions bucketOptions) {
    }

    static /* synthetic */ void access$6400(Distribution distribution, BucketOptions bucketOptions) {
    }

    static /* synthetic */ void access$6500(Distribution distribution) {
    }

    static /* synthetic */ void access$6600(Distribution distribution, int i, long j) {
    }

    static /* synthetic */ void access$6700(Distribution distribution, long j) {
    }

    static /* synthetic */ void access$6800(Distribution distribution, Iterable iterable) {
    }

    static /* synthetic */ void access$6900(Distribution distribution) {
    }

    static /* synthetic */ void access$7000(Distribution distribution, int i, Exemplar exemplar) {
    }

    static /* synthetic */ void access$7100(Distribution distribution, Exemplar exemplar) {
    }

    static /* synthetic */ void access$7200(Distribution distribution, int i, Exemplar exemplar) {
    }

    static /* synthetic */ void access$7300(Distribution distribution, Iterable iterable) {
    }

    static /* synthetic */ void access$7400(Distribution distribution) {
    }

    static /* synthetic */ void access$7500(Distribution distribution, int i) {
    }

    private void addAllBucketCounts(Iterable<? extends Long> iterable) {
    }

    private void addAllExemplars(Iterable<? extends Exemplar> iterable) {
    }

    private void addBucketCounts(long j) {
    }

    private void addExemplars(Exemplar exemplar) {
    }

    private void clearBucketCounts() {
    }

    private void clearBucketOptions() {
    }

    private void clearCount() {
    }

    private void clearExemplars() {
    }

    private void clearMean() {
    }

    private void clearRange() {
    }

    private void clearSumOfSquaredDeviation() {
    }

    private void ensureBucketCountsIsMutable() {
    }

    private void ensureExemplarsIsMutable() {
    }

    public static Distribution getDefaultInstance() {
    }

    private void mergeBucketOptions(BucketOptions bucketOptions) {
    }

    private void mergeRange(Range range) {
    }

    public static Builder newBuilder() {
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Distribution> parser() {
    }

    private void removeExemplars(int i) {
    }

    private void setBucketCounts(int i, long j) {
    }

    private void setBucketOptions(BucketOptions bucketOptions) {
    }

    private void setCount(long j) {
    }

    private void setExemplars(int i, Exemplar exemplar) {
    }

    private void setMean(double d) {
    }

    private void setRange(Range range) {
    }

    private void setSumOfSquaredDeviation(double d) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.DistributionOrBuilder
    public long getBucketCounts(int i) {
    }

    @Override // com.google.api.DistributionOrBuilder
    public int getBucketCountsCount() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public List<Long> getBucketCountsList() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public BucketOptions getBucketOptions() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public long getCount() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public Exemplar getExemplars(int i) {
    }

    @Override // com.google.api.DistributionOrBuilder
    public int getExemplarsCount() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public List<Exemplar> getExemplarsList() {
    }

    public ExemplarOrBuilder getExemplarsOrBuilder(int i) {
    }

    public List<? extends ExemplarOrBuilder> getExemplarsOrBuilderList() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public double getMean() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public Range getRange() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public double getSumOfSquaredDeviation() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public boolean hasBucketOptions() {
    }

    @Override // com.google.api.DistributionOrBuilder
    public boolean hasRange() {
    }

    public static Builder newBuilder(Distribution distribution) {
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Distribution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addExemplars(int i, Exemplar exemplar) {
    }

    public static Distribution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Distribution parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Distribution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Distribution parseFrom(InputStream inputStream) throws IOException {
    }

    public static Distribution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
