package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
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
public final class Monitoring extends GeneratedMessageLite<Monitoring, Builder> implements MonitoringOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Monitoring DEFAULT_INSTANCE = null;
    private static volatile Parser<Monitoring> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<MonitoringDestination> consumerDestinations_;
    private Internal.ProtobufList<MonitoringDestination> producerDestinations_;

    /* renamed from: com.google.api.Monitoring$1 */
    static /* synthetic */ class C05821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f78xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Monitoring, Builder> implements MonitoringOrBuilder {
        /* synthetic */ Builder(C05821 c05821) {
        }

        public Builder addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        }

        public Builder addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        }

        public Builder addConsumerDestinations(MonitoringDestination monitoringDestination) {
        }

        public Builder addProducerDestinations(MonitoringDestination monitoringDestination) {
        }

        public Builder clearConsumerDestinations() {
        }

        public Builder clearProducerDestinations() {
        }

        @Override // com.google.api.MonitoringOrBuilder
        public MonitoringDestination getConsumerDestinations(int i) {
        }

        @Override // com.google.api.MonitoringOrBuilder
        public int getConsumerDestinationsCount() {
        }

        @Override // com.google.api.MonitoringOrBuilder
        public List<MonitoringDestination> getConsumerDestinationsList() {
        }

        @Override // com.google.api.MonitoringOrBuilder
        public MonitoringDestination getProducerDestinations(int i) {
        }

        @Override // com.google.api.MonitoringOrBuilder
        public int getProducerDestinationsCount() {
        }

        @Override // com.google.api.MonitoringOrBuilder
        public List<MonitoringDestination> getProducerDestinationsList() {
        }

        public Builder removeConsumerDestinations(int i) {
        }

        public Builder removeProducerDestinations(int i) {
        }

        public Builder setConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
        }

        public Builder setProducerDestinations(int i, MonitoringDestination monitoringDestination) {
        }

        private Builder() {
        }

        public Builder addConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
        }

        public Builder addProducerDestinations(int i, MonitoringDestination monitoringDestination) {
        }

        public Builder setConsumerDestinations(int i, MonitoringDestination.Builder builder) {
        }

        public Builder setProducerDestinations(int i, MonitoringDestination.Builder builder) {
        }

        public Builder addConsumerDestinations(MonitoringDestination.Builder builder) {
        }

        public Builder addProducerDestinations(MonitoringDestination.Builder builder) {
        }

        public Builder addConsumerDestinations(int i, MonitoringDestination.Builder builder) {
        }

        public Builder addProducerDestinations(int i, MonitoringDestination.Builder builder) {
        }
    }

    public static final class MonitoringDestination extends GeneratedMessageLite<MonitoringDestination, Builder> implements MonitoringDestinationOrBuilder {
        private static final MonitoringDestination DEFAULT_INSTANCE = null;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<MonitoringDestination> PARSER;
        private Internal.ProtobufList<String> metrics_;
        private String monitoredResource_;

        public static final class Builder extends GeneratedMessageLite.Builder<MonitoringDestination, Builder> implements MonitoringDestinationOrBuilder {
            /* synthetic */ Builder(C05821 c05821) {
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
            }

            public Builder addMetrics(String str) {
            }

            public Builder addMetricsBytes(ByteString byteString) {
            }

            public Builder clearMetrics() {
            }

            public Builder clearMonitoredResource() {
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public String getMetrics(int i) {
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public ByteString getMetricsBytes(int i) {
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public int getMetricsCount() {
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public List<String> getMetricsList() {
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public String getMonitoredResource() {
            }

            @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
            public ByteString getMonitoredResourceBytes() {
            }

            public Builder setMetrics(int i, String str) {
            }

            public Builder setMonitoredResource(String str) {
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
            }

            private Builder() {
            }
        }

        private MonitoringDestination() {
        }

        static /* synthetic */ MonitoringDestination access$000() {
        }

        static /* synthetic */ void access$100(MonitoringDestination monitoringDestination, String str) {
        }

        static /* synthetic */ void access$200(MonitoringDestination monitoringDestination) {
        }

        static /* synthetic */ void access$300(MonitoringDestination monitoringDestination, ByteString byteString) {
        }

        static /* synthetic */ void access$400(MonitoringDestination monitoringDestination, int i, String str) {
        }

        static /* synthetic */ void access$500(MonitoringDestination monitoringDestination, String str) {
        }

        static /* synthetic */ void access$600(MonitoringDestination monitoringDestination, Iterable iterable) {
        }

        static /* synthetic */ void access$700(MonitoringDestination monitoringDestination) {
        }

        static /* synthetic */ void access$800(MonitoringDestination monitoringDestination, ByteString byteString) {
        }

        private void addAllMetrics(Iterable<String> iterable) {
        }

        private void addMetrics(String str) {
        }

        private void addMetricsBytes(ByteString byteString) {
        }

        private void clearMetrics() {
        }

        private void clearMonitoredResource() {
        }

        private void ensureMetricsIsMutable() {
        }

        public static MonitoringDestination getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<MonitoringDestination> parser() {
        }

        private void setMetrics(int i, String str) {
        }

        private void setMonitoredResource(String str) {
        }

        private void setMonitoredResourceBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public String getMetrics(int i) {
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public ByteString getMetricsBytes(int i) {
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public int getMetricsCount() {
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public List<String> getMetricsList() {
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public String getMonitoredResource() {
        }

        @Override // com.google.api.Monitoring.MonitoringDestinationOrBuilder
        public ByteString getMonitoredResourceBytes() {
        }

        public static Builder newBuilder(MonitoringDestination monitoringDestination) {
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MonitoringDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static MonitoringDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MonitoringDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static MonitoringDestination parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static MonitoringDestination parseFrom(InputStream inputStream) throws IOException {
        }

        public static MonitoringDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static MonitoringDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static MonitoringDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface MonitoringDestinationOrBuilder extends MessageLiteOrBuilder {
        String getMetrics(int i);

        ByteString getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getMonitoredResource();

        ByteString getMonitoredResourceBytes();
    }

    private Monitoring() {
    }

    static /* synthetic */ Monitoring access$1000() {
    }

    static /* synthetic */ void access$1100(Monitoring monitoring, int i, MonitoringDestination monitoringDestination) {
    }

    static /* synthetic */ void access$1200(Monitoring monitoring, MonitoringDestination monitoringDestination) {
    }

    static /* synthetic */ void access$1300(Monitoring monitoring, int i, MonitoringDestination monitoringDestination) {
    }

    static /* synthetic */ void access$1400(Monitoring monitoring, Iterable iterable) {
    }

    static /* synthetic */ void access$1500(Monitoring monitoring) {
    }

    static /* synthetic */ void access$1600(Monitoring monitoring, int i) {
    }

    static /* synthetic */ void access$1700(Monitoring monitoring, int i, MonitoringDestination monitoringDestination) {
    }

    static /* synthetic */ void access$1800(Monitoring monitoring, MonitoringDestination monitoringDestination) {
    }

    static /* synthetic */ void access$1900(Monitoring monitoring, int i, MonitoringDestination monitoringDestination) {
    }

    static /* synthetic */ void access$2000(Monitoring monitoring, Iterable iterable) {
    }

    static /* synthetic */ void access$2100(Monitoring monitoring) {
    }

    static /* synthetic */ void access$2200(Monitoring monitoring, int i) {
    }

    private void addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
    }

    private void addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
    }

    private void addConsumerDestinations(MonitoringDestination monitoringDestination) {
    }

    private void addProducerDestinations(MonitoringDestination monitoringDestination) {
    }

    private void clearConsumerDestinations() {
    }

    private void clearProducerDestinations() {
    }

    private void ensureConsumerDestinationsIsMutable() {
    }

    private void ensureProducerDestinationsIsMutable() {
    }

    public static Monitoring getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Monitoring> parser() {
    }

    private void removeConsumerDestinations(int i) {
    }

    private void removeProducerDestinations(int i) {
    }

    private void setConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
    }

    private void setProducerDestinations(int i, MonitoringDestination monitoringDestination) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.MonitoringOrBuilder
    public MonitoringDestination getConsumerDestinations(int i) {
    }

    @Override // com.google.api.MonitoringOrBuilder
    public int getConsumerDestinationsCount() {
    }

    @Override // com.google.api.MonitoringOrBuilder
    public List<MonitoringDestination> getConsumerDestinationsList() {
    }

    public MonitoringDestinationOrBuilder getConsumerDestinationsOrBuilder(int i) {
    }

    public List<? extends MonitoringDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
    }

    @Override // com.google.api.MonitoringOrBuilder
    public MonitoringDestination getProducerDestinations(int i) {
    }

    @Override // com.google.api.MonitoringOrBuilder
    public int getProducerDestinationsCount() {
    }

    @Override // com.google.api.MonitoringOrBuilder
    public List<MonitoringDestination> getProducerDestinationsList() {
    }

    public MonitoringDestinationOrBuilder getProducerDestinationsOrBuilder(int i) {
    }

    public List<? extends MonitoringDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
    }

    public static Builder newBuilder(Monitoring monitoring) {
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Monitoring parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
    }

    private void addProducerDestinations(int i, MonitoringDestination monitoringDestination) {
    }

    public static Monitoring parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Monitoring parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Monitoring parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Monitoring parseFrom(InputStream inputStream) throws IOException {
    }

    public static Monitoring parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Monitoring parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Monitoring parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
