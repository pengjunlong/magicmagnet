package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.PerfSession;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class TraceMetric extends GeneratedMessageLite<TraceMetric, Builder> implements TraceMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final TraceMetric DEFAULT_INSTANCE = null;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<TraceMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, Long> counters_;
    private MapFieldLite<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private Internal.ProtobufList<PerfSession> perfSessions_;
    private Internal.ProtobufList<TraceMetric> subtraces_;

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$1 */
    static /* synthetic */ class C11981 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f126xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TraceMetric, Builder> implements TraceMetricOrBuilder {
        /* synthetic */ Builder(C11981 c11981) {
        }

        public Builder addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        }

        public Builder addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
        }

        public Builder addPerfSessions(PerfSession perfSession) {
        }

        public Builder addSubtraces(TraceMetric traceMetric) {
        }

        public Builder clearClientStartTimeUs() {
        }

        public Builder clearCounters() {
        }

        public Builder clearCustomAttributes() {
        }

        public Builder clearDurationUs() {
        }

        public Builder clearIsAuto() {
        }

        public Builder clearName() {
        }

        public Builder clearPerfSessions() {
        }

        public Builder clearSubtraces() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean containsCounters(String str) {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean containsCustomAttributes(String str) {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public long getClientStartTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        @Deprecated
        public Map<String, Long> getCounters() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public int getCountersCount() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public Map<String, Long> getCountersMap() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public long getCountersOrDefault(String str, long j) {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public long getCountersOrThrow(String str) {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        @Deprecated
        public Map<String, String> getCustomAttributes() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public int getCustomAttributesCount() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public Map<String, String> getCustomAttributesMap() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public String getCustomAttributesOrDefault(String str, String str2) {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public String getCustomAttributesOrThrow(String str) {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public long getDurationUs() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean getIsAuto() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public String getName() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public PerfSession getPerfSessions(int i) {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public int getPerfSessionsCount() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public List<PerfSession> getPerfSessionsList() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public TraceMetric getSubtraces(int i) {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public int getSubtracesCount() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public List<TraceMetric> getSubtracesList() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean hasClientStartTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean hasDurationUs() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean hasIsAuto() {
        }

        @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
        public boolean hasName() {
        }

        public Builder putAllCounters(Map<String, Long> map) {
        }

        public Builder putAllCustomAttributes(Map<String, String> map) {
        }

        public Builder putCounters(String str, long j) {
        }

        public Builder putCustomAttributes(String str, String str2) {
        }

        public Builder removeCounters(String str) {
        }

        public Builder removeCustomAttributes(String str) {
        }

        public Builder removePerfSessions(int i) {
        }

        public Builder removeSubtraces(int i) {
        }

        public Builder setClientStartTimeUs(long j) {
        }

        public Builder setDurationUs(long j) {
        }

        public Builder setIsAuto(boolean z) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setPerfSessions(int i, PerfSession perfSession) {
        }

        public Builder setSubtraces(int i, TraceMetric traceMetric) {
        }

        private Builder() {
        }

        public Builder addPerfSessions(int i, PerfSession perfSession) {
        }

        public Builder addSubtraces(int i, TraceMetric traceMetric) {
        }

        public Builder setPerfSessions(int i, PerfSession.Builder builder) {
        }

        public Builder setSubtraces(int i, Builder builder) {
        }

        public Builder addPerfSessions(PerfSession.Builder builder) {
        }

        public Builder addSubtraces(Builder builder) {
        }

        public Builder addPerfSessions(int i, PerfSession.Builder builder) {
        }

        public Builder addSubtraces(int i, Builder builder) {
        }
    }

    private static final class CountersDefaultEntryHolder {
        static final MapEntryLite<String, Long> defaultEntry = null;

        private CountersDefaultEntryHolder() {
        }
    }

    private static final class CustomAttributesDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry = null;

        private CustomAttributesDefaultEntryHolder() {
        }
    }

    private TraceMetric() {
    }

    static /* synthetic */ TraceMetric access$000() {
    }

    static /* synthetic */ void access$100(TraceMetric traceMetric, String str) {
    }

    static /* synthetic */ Map access$1000(TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$1100(TraceMetric traceMetric, int i, TraceMetric traceMetric2) {
    }

    static /* synthetic */ void access$1200(TraceMetric traceMetric, TraceMetric traceMetric2) {
    }

    static /* synthetic */ void access$1300(TraceMetric traceMetric, int i, TraceMetric traceMetric2) {
    }

    static /* synthetic */ void access$1400(TraceMetric traceMetric, Iterable iterable) {
    }

    static /* synthetic */ void access$1500(TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$1600(TraceMetric traceMetric, int i) {
    }

    static /* synthetic */ Map access$1700(TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$1800(TraceMetric traceMetric, int i, PerfSession perfSession) {
    }

    static /* synthetic */ void access$1900(TraceMetric traceMetric, PerfSession perfSession) {
    }

    static /* synthetic */ void access$200(TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$2000(TraceMetric traceMetric, int i, PerfSession perfSession) {
    }

    static /* synthetic */ void access$2100(TraceMetric traceMetric, Iterable iterable) {
    }

    static /* synthetic */ void access$2200(TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$2300(TraceMetric traceMetric, int i) {
    }

    static /* synthetic */ void access$300(TraceMetric traceMetric, ByteString byteString) {
    }

    static /* synthetic */ void access$400(TraceMetric traceMetric, boolean z) {
    }

    static /* synthetic */ void access$500(TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$600(TraceMetric traceMetric, long j) {
    }

    static /* synthetic */ void access$700(TraceMetric traceMetric) {
    }

    static /* synthetic */ void access$800(TraceMetric traceMetric, long j) {
    }

    static /* synthetic */ void access$900(TraceMetric traceMetric) {
    }

    private void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
    }

    private void addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
    }

    private void addPerfSessions(PerfSession perfSession) {
    }

    private void addSubtraces(TraceMetric traceMetric) {
    }

    private void clearClientStartTimeUs() {
    }

    private void clearDurationUs() {
    }

    private void clearIsAuto() {
    }

    private void clearName() {
    }

    private void clearPerfSessions() {
    }

    private void clearSubtraces() {
    }

    private void ensurePerfSessionsIsMutable() {
    }

    private void ensureSubtracesIsMutable() {
    }

    public static TraceMetric getDefaultInstance() {
    }

    private Map<String, Long> getMutableCountersMap() {
    }

    private Map<String, String> getMutableCustomAttributesMap() {
    }

    private MapFieldLite<String, Long> internalGetCounters() {
    }

    private MapFieldLite<String, String> internalGetCustomAttributes() {
    }

    private MapFieldLite<String, Long> internalGetMutableCounters() {
    }

    private MapFieldLite<String, String> internalGetMutableCustomAttributes() {
    }

    public static Builder newBuilder() {
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<TraceMetric> parser() {
    }

    private void removePerfSessions(int i) {
    }

    private void removeSubtraces(int i) {
    }

    private void setClientStartTimeUs(long j) {
    }

    private void setDurationUs(long j) {
    }

    private void setIsAuto(boolean z) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setPerfSessions(int i, PerfSession perfSession) {
    }

    private void setSubtraces(int i, TraceMetric traceMetric) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean containsCounters(String str) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean containsCustomAttributes(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public long getClientStartTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    @Deprecated
    public Map<String, Long> getCounters() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public int getCountersCount() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public Map<String, Long> getCountersMap() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public long getCountersOrDefault(String str, long j) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public long getCountersOrThrow(String str) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    @Deprecated
    public Map<String, String> getCustomAttributes() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public int getCustomAttributesCount() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public Map<String, String> getCustomAttributesMap() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public String getCustomAttributesOrDefault(String str, String str2) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public String getCustomAttributesOrThrow(String str) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public long getDurationUs() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean getIsAuto() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public String getName() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public PerfSession getPerfSessions(int i) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public int getPerfSessionsCount() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public List<PerfSession> getPerfSessionsList() {
    }

    public PerfSessionOrBuilder getPerfSessionsOrBuilder(int i) {
    }

    public List<? extends PerfSessionOrBuilder> getPerfSessionsOrBuilderList() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public TraceMetric getSubtraces(int i) {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public int getSubtracesCount() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public List<TraceMetric> getSubtracesList() {
    }

    public TraceMetricOrBuilder getSubtracesOrBuilder(int i) {
    }

    public List<? extends TraceMetricOrBuilder> getSubtracesOrBuilderList() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean hasClientStartTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean hasDurationUs() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean hasIsAuto() {
    }

    @Override // com.google.firebase.perf.v1.TraceMetricOrBuilder
    public boolean hasName() {
    }

    public static Builder newBuilder(TraceMetric traceMetric) {
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TraceMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addPerfSessions(int i, PerfSession perfSession) {
    }

    private void addSubtraces(int i, TraceMetric traceMetric) {
    }

    public static TraceMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TraceMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static TraceMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TraceMetric parseFrom(InputStream inputStream) throws IOException {
    }

    public static TraceMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static TraceMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static TraceMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
