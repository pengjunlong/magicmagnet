package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
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
public final class GaugeMetric extends GeneratedMessageLite<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final GaugeMetric DEFAULT_INSTANCE = null;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<GaugeMetric> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList<AndroidMemoryReading> androidMemoryReadings_;
    private int bitField0_;
    private Internal.ProtobufList<CpuMetricReading> cpuMetricReadings_;
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_;

    /* renamed from: com.google.firebase.perf.v1.GaugeMetric$1 */
    static /* synthetic */ class C11871 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f121xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
        /* synthetic */ Builder(C11871 c11871) {
        }

        public Builder addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
        }

        public Builder addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
        }

        public Builder addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
        }

        public Builder addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
        }

        public Builder clearAndroidMemoryReadings() {
        }

        public Builder clearCpuMetricReadings() {
        }

        public Builder clearGaugeMetadata() {
        }

        public Builder clearSessionId() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public AndroidMemoryReading getAndroidMemoryReadings(int i) {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public int getAndroidMemoryReadingsCount() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public CpuMetricReading getCpuMetricReadings(int i) {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public int getCpuMetricReadingsCount() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public List<CpuMetricReading> getCpuMetricReadingsList() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public GaugeMetadata getGaugeMetadata() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public String getSessionId() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public ByteString getSessionIdBytes() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public boolean hasGaugeMetadata() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
        public boolean hasSessionId() {
        }

        public Builder mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
        }

        public Builder removeAndroidMemoryReadings(int i) {
        }

        public Builder removeCpuMetricReadings(int i) {
        }

        public Builder setAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
        }

        public Builder setCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
        }

        public Builder setGaugeMetadata(GaugeMetadata gaugeMetadata) {
        }

        public Builder setSessionId(String str) {
        }

        public Builder setSessionIdBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
        }

        public Builder addCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
        }

        public Builder setAndroidMemoryReadings(int i, AndroidMemoryReading.Builder builder) {
        }

        public Builder setCpuMetricReadings(int i, CpuMetricReading.Builder builder) {
        }

        public Builder setGaugeMetadata(GaugeMetadata.Builder builder) {
        }

        public Builder addAndroidMemoryReadings(AndroidMemoryReading.Builder builder) {
        }

        public Builder addCpuMetricReadings(CpuMetricReading.Builder builder) {
        }

        public Builder addAndroidMemoryReadings(int i, AndroidMemoryReading.Builder builder) {
        }

        public Builder addCpuMetricReadings(int i, CpuMetricReading.Builder builder) {
        }
    }

    private GaugeMetric() {
    }

    static /* synthetic */ GaugeMetric access$000() {
    }

    static /* synthetic */ void access$100(GaugeMetric gaugeMetric, String str) {
    }

    static /* synthetic */ void access$1000(GaugeMetric gaugeMetric, Iterable iterable) {
    }

    static /* synthetic */ void access$1100(GaugeMetric gaugeMetric) {
    }

    static /* synthetic */ void access$1200(GaugeMetric gaugeMetric, int i) {
    }

    static /* synthetic */ void access$1300(GaugeMetric gaugeMetric, int i, AndroidMemoryReading androidMemoryReading) {
    }

    static /* synthetic */ void access$1400(GaugeMetric gaugeMetric, AndroidMemoryReading androidMemoryReading) {
    }

    static /* synthetic */ void access$1500(GaugeMetric gaugeMetric, int i, AndroidMemoryReading androidMemoryReading) {
    }

    static /* synthetic */ void access$1600(GaugeMetric gaugeMetric, Iterable iterable) {
    }

    static /* synthetic */ void access$1700(GaugeMetric gaugeMetric) {
    }

    static /* synthetic */ void access$1800(GaugeMetric gaugeMetric, int i) {
    }

    static /* synthetic */ void access$200(GaugeMetric gaugeMetric) {
    }

    static /* synthetic */ void access$300(GaugeMetric gaugeMetric, ByteString byteString) {
    }

    static /* synthetic */ void access$400(GaugeMetric gaugeMetric, GaugeMetadata gaugeMetadata) {
    }

    static /* synthetic */ void access$500(GaugeMetric gaugeMetric, GaugeMetadata gaugeMetadata) {
    }

    static /* synthetic */ void access$600(GaugeMetric gaugeMetric) {
    }

    static /* synthetic */ void access$700(GaugeMetric gaugeMetric, int i, CpuMetricReading cpuMetricReading) {
    }

    static /* synthetic */ void access$800(GaugeMetric gaugeMetric, CpuMetricReading cpuMetricReading) {
    }

    static /* synthetic */ void access$900(GaugeMetric gaugeMetric, int i, CpuMetricReading cpuMetricReading) {
    }

    private void addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
    }

    private void addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
    }

    private void addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
    }

    private void addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
    }

    private void clearAndroidMemoryReadings() {
    }

    private void clearCpuMetricReadings() {
    }

    private void clearGaugeMetadata() {
    }

    private void clearSessionId() {
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
    }

    private void ensureCpuMetricReadingsIsMutable() {
    }

    public static GaugeMetric getDefaultInstance() {
    }

    private void mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
    }

    public static Builder newBuilder() {
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<GaugeMetric> parser() {
    }

    private void removeAndroidMemoryReadings(int i) {
    }

    private void removeCpuMetricReadings(int i) {
    }

    private void setAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
    }

    private void setCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
    }

    private void setGaugeMetadata(GaugeMetadata gaugeMetadata) {
    }

    private void setSessionId(String str) {
    }

    private void setSessionIdBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public AndroidMemoryReading getAndroidMemoryReadings(int i) {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public int getAndroidMemoryReadingsCount() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
    }

    public AndroidMemoryReadingOrBuilder getAndroidMemoryReadingsOrBuilder(int i) {
    }

    public List<? extends AndroidMemoryReadingOrBuilder> getAndroidMemoryReadingsOrBuilderList() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public CpuMetricReading getCpuMetricReadings(int i) {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public int getCpuMetricReadingsCount() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public List<CpuMetricReading> getCpuMetricReadingsList() {
    }

    public CpuMetricReadingOrBuilder getCpuMetricReadingsOrBuilder(int i) {
    }

    public List<? extends CpuMetricReadingOrBuilder> getCpuMetricReadingsOrBuilderList() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public GaugeMetadata getGaugeMetadata() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public String getSessionId() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public ByteString getSessionIdBytes() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public boolean hasGaugeMetadata() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetricOrBuilder
    public boolean hasSessionId() {
    }

    public static Builder newBuilder(GaugeMetric gaugeMetric) {
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GaugeMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
    }

    private void addCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
    }

    public static GaugeMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GaugeMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static GaugeMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GaugeMetric parseFrom(InputStream inputStream) throws IOException {
    }

    public static GaugeMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static GaugeMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static GaugeMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
