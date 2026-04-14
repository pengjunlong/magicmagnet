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
public final class Logging extends GeneratedMessageLite<Logging, Builder> implements LoggingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE = null;
    private static volatile Parser<Logging> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<LoggingDestination> consumerDestinations_;
    private Internal.ProtobufList<LoggingDestination> producerDestinations_;

    /* renamed from: com.google.api.Logging$1 */
    static /* synthetic */ class C05731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f71xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Logging, Builder> implements LoggingOrBuilder {
        /* synthetic */ Builder(C05731 c05731) {
        }

        public Builder addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
        }

        public Builder addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
        }

        public Builder addConsumerDestinations(LoggingDestination loggingDestination) {
        }

        public Builder addProducerDestinations(LoggingDestination loggingDestination) {
        }

        public Builder clearConsumerDestinations() {
        }

        public Builder clearProducerDestinations() {
        }

        @Override // com.google.api.LoggingOrBuilder
        public LoggingDestination getConsumerDestinations(int i) {
        }

        @Override // com.google.api.LoggingOrBuilder
        public int getConsumerDestinationsCount() {
        }

        @Override // com.google.api.LoggingOrBuilder
        public List<LoggingDestination> getConsumerDestinationsList() {
        }

        @Override // com.google.api.LoggingOrBuilder
        public LoggingDestination getProducerDestinations(int i) {
        }

        @Override // com.google.api.LoggingOrBuilder
        public int getProducerDestinationsCount() {
        }

        @Override // com.google.api.LoggingOrBuilder
        public List<LoggingDestination> getProducerDestinationsList() {
        }

        public Builder removeConsumerDestinations(int i) {
        }

        public Builder removeProducerDestinations(int i) {
        }

        public Builder setConsumerDestinations(int i, LoggingDestination loggingDestination) {
        }

        public Builder setProducerDestinations(int i, LoggingDestination loggingDestination) {
        }

        private Builder() {
        }

        public Builder addConsumerDestinations(int i, LoggingDestination loggingDestination) {
        }

        public Builder addProducerDestinations(int i, LoggingDestination loggingDestination) {
        }

        public Builder setConsumerDestinations(int i, LoggingDestination.Builder builder) {
        }

        public Builder setProducerDestinations(int i, LoggingDestination.Builder builder) {
        }

        public Builder addConsumerDestinations(LoggingDestination.Builder builder) {
        }

        public Builder addProducerDestinations(LoggingDestination.Builder builder) {
        }

        public Builder addConsumerDestinations(int i, LoggingDestination.Builder builder) {
        }

        public Builder addProducerDestinations(int i, LoggingDestination.Builder builder) {
        }
    }

    public static final class LoggingDestination extends GeneratedMessageLite<LoggingDestination, Builder> implements LoggingDestinationOrBuilder {
        private static final LoggingDestination DEFAULT_INSTANCE = null;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile Parser<LoggingDestination> PARSER;
        private Internal.ProtobufList<String> logs_;
        private String monitoredResource_;

        public static final class Builder extends GeneratedMessageLite.Builder<LoggingDestination, Builder> implements LoggingDestinationOrBuilder {
            /* synthetic */ Builder(C05731 c05731) {
            }

            public Builder addAllLogs(Iterable<String> iterable) {
            }

            public Builder addLogs(String str) {
            }

            public Builder addLogsBytes(ByteString byteString) {
            }

            public Builder clearLogs() {
            }

            public Builder clearMonitoredResource() {
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public String getLogs(int i) {
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public ByteString getLogsBytes(int i) {
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public int getLogsCount() {
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public List<String> getLogsList() {
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public String getMonitoredResource() {
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public ByteString getMonitoredResourceBytes() {
            }

            public Builder setLogs(int i, String str) {
            }

            public Builder setMonitoredResource(String str) {
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
            }

            private Builder() {
            }
        }

        private LoggingDestination() {
        }

        static /* synthetic */ LoggingDestination access$000() {
        }

        static /* synthetic */ void access$100(LoggingDestination loggingDestination, String str) {
        }

        static /* synthetic */ void access$200(LoggingDestination loggingDestination) {
        }

        static /* synthetic */ void access$300(LoggingDestination loggingDestination, ByteString byteString) {
        }

        static /* synthetic */ void access$400(LoggingDestination loggingDestination, int i, String str) {
        }

        static /* synthetic */ void access$500(LoggingDestination loggingDestination, String str) {
        }

        static /* synthetic */ void access$600(LoggingDestination loggingDestination, Iterable iterable) {
        }

        static /* synthetic */ void access$700(LoggingDestination loggingDestination) {
        }

        static /* synthetic */ void access$800(LoggingDestination loggingDestination, ByteString byteString) {
        }

        private void addAllLogs(Iterable<String> iterable) {
        }

        private void addLogs(String str) {
        }

        private void addLogsBytes(ByteString byteString) {
        }

        private void clearLogs() {
        }

        private void clearMonitoredResource() {
        }

        private void ensureLogsIsMutable() {
        }

        public static LoggingDestination getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<LoggingDestination> parser() {
        }

        private void setLogs(int i, String str) {
        }

        private void setMonitoredResource(String str) {
        }

        private void setMonitoredResourceBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public String getLogs(int i) {
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public ByteString getLogsBytes(int i) {
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public int getLogsCount() {
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public List<String> getLogsList() {
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public String getMonitoredResource() {
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public ByteString getMonitoredResourceBytes() {
        }

        public static Builder newBuilder(LoggingDestination loggingDestination) {
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static LoggingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static LoggingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static LoggingDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static LoggingDestination parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static LoggingDestination parseFrom(InputStream inputStream) throws IOException {
        }

        public static LoggingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static LoggingDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static LoggingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface LoggingDestinationOrBuilder extends MessageLiteOrBuilder {
        String getLogs(int i);

        ByteString getLogsBytes(int i);

        int getLogsCount();

        List<String> getLogsList();

        String getMonitoredResource();

        ByteString getMonitoredResourceBytes();
    }

    private Logging() {
    }

    static /* synthetic */ Logging access$1000() {
    }

    static /* synthetic */ void access$1100(Logging logging, int i, LoggingDestination loggingDestination) {
    }

    static /* synthetic */ void access$1200(Logging logging, LoggingDestination loggingDestination) {
    }

    static /* synthetic */ void access$1300(Logging logging, int i, LoggingDestination loggingDestination) {
    }

    static /* synthetic */ void access$1400(Logging logging, Iterable iterable) {
    }

    static /* synthetic */ void access$1500(Logging logging) {
    }

    static /* synthetic */ void access$1600(Logging logging, int i) {
    }

    static /* synthetic */ void access$1700(Logging logging, int i, LoggingDestination loggingDestination) {
    }

    static /* synthetic */ void access$1800(Logging logging, LoggingDestination loggingDestination) {
    }

    static /* synthetic */ void access$1900(Logging logging, int i, LoggingDestination loggingDestination) {
    }

    static /* synthetic */ void access$2000(Logging logging, Iterable iterable) {
    }

    static /* synthetic */ void access$2100(Logging logging) {
    }

    static /* synthetic */ void access$2200(Logging logging, int i) {
    }

    private void addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
    }

    private void addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
    }

    private void addConsumerDestinations(LoggingDestination loggingDestination) {
    }

    private void addProducerDestinations(LoggingDestination loggingDestination) {
    }

    private void clearConsumerDestinations() {
    }

    private void clearProducerDestinations() {
    }

    private void ensureConsumerDestinationsIsMutable() {
    }

    private void ensureProducerDestinationsIsMutable() {
    }

    public static Logging getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Logging parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Logging> parser() {
    }

    private void removeConsumerDestinations(int i) {
    }

    private void removeProducerDestinations(int i) {
    }

    private void setConsumerDestinations(int i, LoggingDestination loggingDestination) {
    }

    private void setProducerDestinations(int i, LoggingDestination loggingDestination) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.LoggingOrBuilder
    public LoggingDestination getConsumerDestinations(int i) {
    }

    @Override // com.google.api.LoggingOrBuilder
    public int getConsumerDestinationsCount() {
    }

    @Override // com.google.api.LoggingOrBuilder
    public List<LoggingDestination> getConsumerDestinationsList() {
    }

    public LoggingDestinationOrBuilder getConsumerDestinationsOrBuilder(int i) {
    }

    public List<? extends LoggingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
    }

    @Override // com.google.api.LoggingOrBuilder
    public LoggingDestination getProducerDestinations(int i) {
    }

    @Override // com.google.api.LoggingOrBuilder
    public int getProducerDestinationsCount() {
    }

    @Override // com.google.api.LoggingOrBuilder
    public List<LoggingDestination> getProducerDestinationsList() {
    }

    public LoggingDestinationOrBuilder getProducerDestinationsOrBuilder(int i) {
    }

    public List<? extends LoggingDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
    }

    public static Builder newBuilder(Logging logging) {
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Logging parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Logging parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addConsumerDestinations(int i, LoggingDestination loggingDestination) {
    }

    private void addProducerDestinations(int i, LoggingDestination loggingDestination) {
    }

    public static Logging parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Logging parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Logging parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Logging parseFrom(InputStream inputStream) throws IOException {
    }

    public static Logging parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Logging parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Logging parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
