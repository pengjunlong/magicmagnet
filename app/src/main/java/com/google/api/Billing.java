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
public final class Billing extends GeneratedMessageLite<Billing, Builder> implements BillingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE = null;
    private static volatile Parser<Billing> PARSER;
    private Internal.ProtobufList<BillingDestination> consumerDestinations_;

    /* renamed from: com.google.api.Billing$1 */
    static /* synthetic */ class C05531 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f55xa1df5c61 = null;
    }

    public static final class BillingDestination extends GeneratedMessageLite<BillingDestination, Builder> implements BillingDestinationOrBuilder {
        private static final BillingDestination DEFAULT_INSTANCE = null;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<BillingDestination> PARSER;
        private Internal.ProtobufList<String> metrics_;
        private String monitoredResource_;

        public static final class Builder extends GeneratedMessageLite.Builder<BillingDestination, Builder> implements BillingDestinationOrBuilder {
            /* synthetic */ Builder(C05531 c05531) {
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

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public String getMetrics(int i) {
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public ByteString getMetricsBytes(int i) {
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public int getMetricsCount() {
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public List<String> getMetricsList() {
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public String getMonitoredResource() {
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
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

        private BillingDestination() {
        }

        static /* synthetic */ BillingDestination access$000() {
        }

        static /* synthetic */ void access$100(BillingDestination billingDestination, String str) {
        }

        static /* synthetic */ void access$200(BillingDestination billingDestination) {
        }

        static /* synthetic */ void access$300(BillingDestination billingDestination, ByteString byteString) {
        }

        static /* synthetic */ void access$400(BillingDestination billingDestination, int i, String str) {
        }

        static /* synthetic */ void access$500(BillingDestination billingDestination, String str) {
        }

        static /* synthetic */ void access$600(BillingDestination billingDestination, Iterable iterable) {
        }

        static /* synthetic */ void access$700(BillingDestination billingDestination) {
        }

        static /* synthetic */ void access$800(BillingDestination billingDestination, ByteString byteString) {
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

        public static BillingDestination getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<BillingDestination> parser() {
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

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public String getMetrics(int i) {
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public ByteString getMetricsBytes(int i) {
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public int getMetricsCount() {
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public List<String> getMetricsList() {
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public String getMonitoredResource() {
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public ByteString getMonitoredResourceBytes() {
        }

        public static Builder newBuilder(BillingDestination billingDestination) {
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static BillingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static BillingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static BillingDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static BillingDestination parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static BillingDestination parseFrom(InputStream inputStream) throws IOException {
        }

        public static BillingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static BillingDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static BillingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface BillingDestinationOrBuilder extends MessageLiteOrBuilder {
        String getMetrics(int i);

        ByteString getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getMonitoredResource();

        ByteString getMonitoredResourceBytes();
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Billing, Builder> implements BillingOrBuilder {
        /* synthetic */ Builder(C05531 c05531) {
        }

        public Builder addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
        }

        public Builder addConsumerDestinations(BillingDestination billingDestination) {
        }

        public Builder clearConsumerDestinations() {
        }

        @Override // com.google.api.BillingOrBuilder
        public BillingDestination getConsumerDestinations(int i) {
        }

        @Override // com.google.api.BillingOrBuilder
        public int getConsumerDestinationsCount() {
        }

        @Override // com.google.api.BillingOrBuilder
        public List<BillingDestination> getConsumerDestinationsList() {
        }

        public Builder removeConsumerDestinations(int i) {
        }

        public Builder setConsumerDestinations(int i, BillingDestination billingDestination) {
        }

        private Builder() {
        }

        public Builder addConsumerDestinations(int i, BillingDestination billingDestination) {
        }

        public Builder setConsumerDestinations(int i, BillingDestination.Builder builder) {
        }

        public Builder addConsumerDestinations(BillingDestination.Builder builder) {
        }

        public Builder addConsumerDestinations(int i, BillingDestination.Builder builder) {
        }
    }

    private Billing() {
    }

    static /* synthetic */ Billing access$1000() {
    }

    static /* synthetic */ void access$1100(Billing billing, int i, BillingDestination billingDestination) {
    }

    static /* synthetic */ void access$1200(Billing billing, BillingDestination billingDestination) {
    }

    static /* synthetic */ void access$1300(Billing billing, int i, BillingDestination billingDestination) {
    }

    static /* synthetic */ void access$1400(Billing billing, Iterable iterable) {
    }

    static /* synthetic */ void access$1500(Billing billing) {
    }

    static /* synthetic */ void access$1600(Billing billing, int i) {
    }

    private void addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
    }

    private void addConsumerDestinations(BillingDestination billingDestination) {
    }

    private void clearConsumerDestinations() {
    }

    private void ensureConsumerDestinationsIsMutable() {
    }

    public static Billing getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Billing parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Billing> parser() {
    }

    private void removeConsumerDestinations(int i) {
    }

    private void setConsumerDestinations(int i, BillingDestination billingDestination) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.BillingOrBuilder
    public BillingDestination getConsumerDestinations(int i) {
    }

    @Override // com.google.api.BillingOrBuilder
    public int getConsumerDestinationsCount() {
    }

    @Override // com.google.api.BillingOrBuilder
    public List<BillingDestination> getConsumerDestinationsList() {
    }

    public BillingDestinationOrBuilder getConsumerDestinationsOrBuilder(int i) {
    }

    public List<? extends BillingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
    }

    public static Builder newBuilder(Billing billing) {
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Billing parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Billing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addConsumerDestinations(int i, BillingDestination billingDestination) {
    }

    public static Billing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Billing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Billing parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Billing parseFrom(InputStream inputStream) throws IOException {
    }

    public static Billing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Billing parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Billing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
