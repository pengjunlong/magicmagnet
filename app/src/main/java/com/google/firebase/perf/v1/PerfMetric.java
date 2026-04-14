package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.perf.v1.TransportInfo;
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
public final class PerfMetric extends GeneratedMessageLite<PerfMetric, Builder> implements PerfMetricOrBuilder {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final PerfMetric DEFAULT_INSTANCE = null;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser<PerfMetric> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ApplicationInfo applicationInfo_;
    private int bitField0_;
    private GaugeMetric gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private TraceMetric traceMetric_;
    private TransportInfo transportInfo_;

    /* renamed from: com.google.firebase.perf.v1.PerfMetric$1 */
    static /* synthetic */ class C11941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f124xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PerfMetric, Builder> implements PerfMetricOrBuilder {
        /* synthetic */ Builder(C11941 c11941) {
        }

        public Builder clearApplicationInfo() {
        }

        public Builder clearGaugeMetric() {
        }

        public Builder clearNetworkRequestMetric() {
        }

        public Builder clearTraceMetric() {
        }

        public Builder clearTransportInfo() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public ApplicationInfo getApplicationInfo() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public GaugeMetric getGaugeMetric() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public NetworkRequestMetric getNetworkRequestMetric() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public TraceMetric getTraceMetric() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public TransportInfo getTransportInfo() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasApplicationInfo() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasGaugeMetric() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasNetworkRequestMetric() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasTraceMetric() {
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasTransportInfo() {
        }

        public Builder mergeApplicationInfo(ApplicationInfo applicationInfo) {
        }

        public Builder mergeGaugeMetric(GaugeMetric gaugeMetric) {
        }

        public Builder mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        }

        public Builder mergeTraceMetric(TraceMetric traceMetric) {
        }

        public Builder mergeTransportInfo(TransportInfo transportInfo) {
        }

        public Builder setApplicationInfo(ApplicationInfo applicationInfo) {
        }

        public Builder setGaugeMetric(GaugeMetric gaugeMetric) {
        }

        public Builder setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        }

        public Builder setTraceMetric(TraceMetric traceMetric) {
        }

        public Builder setTransportInfo(TransportInfo transportInfo) {
        }

        private Builder() {
        }

        public Builder setApplicationInfo(ApplicationInfo.Builder builder) {
        }

        public Builder setGaugeMetric(GaugeMetric.Builder builder) {
        }

        public Builder setNetworkRequestMetric(NetworkRequestMetric.Builder builder) {
        }

        public Builder setTraceMetric(TraceMetric.Builder builder) {
        }

        public Builder setTransportInfo(TransportInfo.Builder builder) {
        }
    }

    private PerfMetric() {
    }

    static /* synthetic */ PerfMetric access$000() {
    }

    static /* synthetic */ void access$100(PerfMetric perfMetric, ApplicationInfo applicationInfo) {
    }

    static /* synthetic */ void access$1000(PerfMetric perfMetric, GaugeMetric gaugeMetric) {
    }

    static /* synthetic */ void access$1100(PerfMetric perfMetric, GaugeMetric gaugeMetric) {
    }

    static /* synthetic */ void access$1200(PerfMetric perfMetric) {
    }

    static /* synthetic */ void access$1300(PerfMetric perfMetric, TransportInfo transportInfo) {
    }

    static /* synthetic */ void access$1400(PerfMetric perfMetric, TransportInfo transportInfo) {
    }

    static /* synthetic */ void access$1500(PerfMetric perfMetric) {
    }

    static /* synthetic */ void access$200(PerfMetric perfMetric, ApplicationInfo applicationInfo) {
    }

    static /* synthetic */ void access$300(PerfMetric perfMetric) {
    }

    static /* synthetic */ void access$400(PerfMetric perfMetric, TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$500(PerfMetric perfMetric, TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$600(PerfMetric perfMetric) {
    }

    static /* synthetic */ void access$700(PerfMetric perfMetric, NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$800(PerfMetric perfMetric, NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$900(PerfMetric perfMetric) {
    }

    private void clearApplicationInfo() {
    }

    private void clearGaugeMetric() {
    }

    private void clearNetworkRequestMetric() {
    }

    private void clearTraceMetric() {
    }

    private void clearTransportInfo() {
    }

    public static PerfMetric getDefaultInstance() {
    }

    private void mergeApplicationInfo(ApplicationInfo applicationInfo) {
    }

    private void mergeGaugeMetric(GaugeMetric gaugeMetric) {
    }

    private void mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
    }

    private void mergeTraceMetric(TraceMetric traceMetric) {
    }

    private void mergeTransportInfo(TransportInfo transportInfo) {
    }

    public static Builder newBuilder() {
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<PerfMetric> parser() {
    }

    private void setApplicationInfo(ApplicationInfo applicationInfo) {
    }

    private void setGaugeMetric(GaugeMetric gaugeMetric) {
    }

    private void setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
    }

    private void setTraceMetric(TraceMetric traceMetric) {
    }

    private void setTransportInfo(TransportInfo transportInfo) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public ApplicationInfo getApplicationInfo() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public GaugeMetric getGaugeMetric() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public NetworkRequestMetric getNetworkRequestMetric() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public TraceMetric getTraceMetric() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public TransportInfo getTransportInfo() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasApplicationInfo() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasGaugeMetric() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasNetworkRequestMetric() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasTraceMetric() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasTransportInfo() {
    }

    public static Builder newBuilder(PerfMetric perfMetric) {
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PerfMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static PerfMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PerfMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static PerfMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static PerfMetric parseFrom(InputStream inputStream) throws IOException {
    }

    public static PerfMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static PerfMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static PerfMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
