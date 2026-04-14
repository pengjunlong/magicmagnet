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
public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, Builder> implements NetworkRequestMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE = null;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, String> customAttributes_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private Internal.ProtobufList<PerfSession> perfSessions_;
    private long requestPayloadBytes_;
    private String responseContentType_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_;

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$1 */
    static /* synthetic */ class C11911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f123xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NetworkRequestMetric, Builder> implements NetworkRequestMetricOrBuilder {
        /* synthetic */ Builder(C11911 c11911) {
        }

        public Builder addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        }

        public Builder addPerfSessions(PerfSession perfSession) {
        }

        public Builder clearClientStartTimeUs() {
        }

        public Builder clearCustomAttributes() {
        }

        public Builder clearHttpMethod() {
        }

        public Builder clearHttpResponseCode() {
        }

        public Builder clearNetworkClientErrorReason() {
        }

        public Builder clearPerfSessions() {
        }

        public Builder clearRequestPayloadBytes() {
        }

        public Builder clearResponseContentType() {
        }

        public Builder clearResponsePayloadBytes() {
        }

        public Builder clearTimeToRequestCompletedUs() {
        }

        public Builder clearTimeToResponseCompletedUs() {
        }

        public Builder clearTimeToResponseInitiatedUs() {
        }

        public Builder clearUrl() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean containsCustomAttributes(String str) {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getClientStartTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        @Deprecated
        public Map<String, String> getCustomAttributes() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public int getCustomAttributesCount() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public Map<String, String> getCustomAttributesMap() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public String getCustomAttributesOrDefault(String str, String str2) {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public String getCustomAttributesOrThrow(String str) {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public HttpMethod getHttpMethod() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public int getHttpResponseCode() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public NetworkClientErrorReason getNetworkClientErrorReason() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public PerfSession getPerfSessions(int i) {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public int getPerfSessionsCount() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public List<PerfSession> getPerfSessionsList() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getRequestPayloadBytes() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public String getResponseContentType() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public ByteString getResponseContentTypeBytes() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getResponsePayloadBytes() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getTimeToRequestCompletedUs() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getTimeToResponseCompletedUs() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public long getTimeToResponseInitiatedUs() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public String getUrl() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public ByteString getUrlBytes() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasClientStartTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasHttpMethod() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasHttpResponseCode() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasNetworkClientErrorReason() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasRequestPayloadBytes() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasResponseContentType() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasResponsePayloadBytes() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasTimeToRequestCompletedUs() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasTimeToResponseCompletedUs() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasTimeToResponseInitiatedUs() {
        }

        @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
        public boolean hasUrl() {
        }

        public Builder putAllCustomAttributes(Map<String, String> map) {
        }

        public Builder putCustomAttributes(String str, String str2) {
        }

        public Builder removeCustomAttributes(String str) {
        }

        public Builder removePerfSessions(int i) {
        }

        public Builder setClientStartTimeUs(long j) {
        }

        public Builder setHttpMethod(HttpMethod httpMethod) {
        }

        public Builder setHttpResponseCode(int i) {
        }

        public Builder setNetworkClientErrorReason(NetworkClientErrorReason networkClientErrorReason) {
        }

        public Builder setPerfSessions(int i, PerfSession perfSession) {
        }

        public Builder setRequestPayloadBytes(long j) {
        }

        public Builder setResponseContentType(String str) {
        }

        public Builder setResponseContentTypeBytes(ByteString byteString) {
        }

        public Builder setResponsePayloadBytes(long j) {
        }

        public Builder setTimeToRequestCompletedUs(long j) {
        }

        public Builder setTimeToResponseCompletedUs(long j) {
        }

        public Builder setTimeToResponseInitiatedUs(long j) {
        }

        public Builder setUrl(String str) {
        }

        public Builder setUrlBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addPerfSessions(int i, PerfSession perfSession) {
        }

        public Builder setPerfSessions(int i, PerfSession.Builder builder) {
        }

        public Builder addPerfSessions(PerfSession.Builder builder) {
        }

        public Builder addPerfSessions(int i, PerfSession.Builder builder) {
        }
    }

    private static final class CustomAttributesDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry = null;

        private CustomAttributesDefaultEntryHolder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class HttpMethod implements Internal.EnumLite {
        private static final /* synthetic */ HttpMethod[] $VALUES = null;
        public static final HttpMethod CONNECT = null;
        public static final int CONNECT_VALUE = 9;
        public static final HttpMethod DELETE = null;
        public static final int DELETE_VALUE = 4;
        public static final HttpMethod GET = null;
        public static final int GET_VALUE = 1;
        public static final HttpMethod HEAD = null;
        public static final int HEAD_VALUE = 5;
        public static final HttpMethod HTTP_METHOD_UNKNOWN = null;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final HttpMethod OPTIONS = null;
        public static final int OPTIONS_VALUE = 7;
        public static final HttpMethod PATCH = null;
        public static final int PATCH_VALUE = 6;
        public static final HttpMethod POST = null;
        public static final int POST_VALUE = 3;
        public static final HttpMethod PUT = null;
        public static final int PUT_VALUE = 2;
        public static final HttpMethod TRACE = null;
        public static final int TRACE_VALUE = 8;
        private static final Internal.EnumLiteMap<HttpMethod> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$1 */
        class C11921 implements Internal.EnumLiteMap<HttpMethod> {
            C11921() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ HttpMethod findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public HttpMethod findValueByNumber(int i) {
            }
        }

        private static final class HttpMethodVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private HttpMethodVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private HttpMethod(String str, int i, int i2) {
        }

        public static HttpMethod forNumber(int i) {
        }

        public static Internal.EnumLiteMap<HttpMethod> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static HttpMethod valueOf(String str) {
        }

        public static HttpMethod[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static HttpMethod valueOf(int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class NetworkClientErrorReason implements Internal.EnumLite {
        private static final /* synthetic */ NetworkClientErrorReason[] $VALUES = null;
        public static final NetworkClientErrorReason GENERIC_CLIENT_ERROR = null;
        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final NetworkClientErrorReason NETWORK_CLIENT_ERROR_REASON_UNKNOWN = null;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<NetworkClientErrorReason> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason$1 */
        class C11931 implements Internal.EnumLiteMap<NetworkClientErrorReason> {
            C11931() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ NetworkClientErrorReason findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NetworkClientErrorReason findValueByNumber(int i) {
            }
        }

        private static final class NetworkClientErrorReasonVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private NetworkClientErrorReasonVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private NetworkClientErrorReason(String str, int i, int i2) {
        }

        public static NetworkClientErrorReason forNumber(int i) {
        }

        public static Internal.EnumLiteMap<NetworkClientErrorReason> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static NetworkClientErrorReason valueOf(String str) {
        }

        public static NetworkClientErrorReason[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static NetworkClientErrorReason valueOf(int i) {
        }
    }

    private NetworkRequestMetric() {
    }

    static /* synthetic */ NetworkRequestMetric access$000() {
    }

    static /* synthetic */ void access$100(NetworkRequestMetric networkRequestMetric, String str) {
    }

    static /* synthetic */ void access$1000(NetworkRequestMetric networkRequestMetric, NetworkClientErrorReason networkClientErrorReason) {
    }

    static /* synthetic */ void access$1100(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$1200(NetworkRequestMetric networkRequestMetric, int i) {
    }

    static /* synthetic */ void access$1300(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$1400(NetworkRequestMetric networkRequestMetric, String str) {
    }

    static /* synthetic */ void access$1500(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$1600(NetworkRequestMetric networkRequestMetric, ByteString byteString) {
    }

    static /* synthetic */ void access$1700(NetworkRequestMetric networkRequestMetric, long j) {
    }

    static /* synthetic */ void access$1800(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$1900(NetworkRequestMetric networkRequestMetric, long j) {
    }

    static /* synthetic */ void access$200(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$2000(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$2100(NetworkRequestMetric networkRequestMetric, long j) {
    }

    static /* synthetic */ void access$2200(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$2300(NetworkRequestMetric networkRequestMetric, long j) {
    }

    static /* synthetic */ void access$2400(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ Map access$2500(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$2600(NetworkRequestMetric networkRequestMetric, int i, PerfSession perfSession) {
    }

    static /* synthetic */ void access$2700(NetworkRequestMetric networkRequestMetric, PerfSession perfSession) {
    }

    static /* synthetic */ void access$2800(NetworkRequestMetric networkRequestMetric, int i, PerfSession perfSession) {
    }

    static /* synthetic */ void access$2900(NetworkRequestMetric networkRequestMetric, Iterable iterable) {
    }

    static /* synthetic */ void access$300(NetworkRequestMetric networkRequestMetric, ByteString byteString) {
    }

    static /* synthetic */ void access$3000(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$3100(NetworkRequestMetric networkRequestMetric, int i) {
    }

    static /* synthetic */ void access$400(NetworkRequestMetric networkRequestMetric, HttpMethod httpMethod) {
    }

    static /* synthetic */ void access$500(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$600(NetworkRequestMetric networkRequestMetric, long j) {
    }

    static /* synthetic */ void access$700(NetworkRequestMetric networkRequestMetric) {
    }

    static /* synthetic */ void access$800(NetworkRequestMetric networkRequestMetric, long j) {
    }

    static /* synthetic */ void access$900(NetworkRequestMetric networkRequestMetric) {
    }

    private void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
    }

    private void addPerfSessions(PerfSession perfSession) {
    }

    private void clearClientStartTimeUs() {
    }

    private void clearHttpMethod() {
    }

    private void clearHttpResponseCode() {
    }

    private void clearNetworkClientErrorReason() {
    }

    private void clearPerfSessions() {
    }

    private void clearRequestPayloadBytes() {
    }

    private void clearResponseContentType() {
    }

    private void clearResponsePayloadBytes() {
    }

    private void clearTimeToRequestCompletedUs() {
    }

    private void clearTimeToResponseCompletedUs() {
    }

    private void clearTimeToResponseInitiatedUs() {
    }

    private void clearUrl() {
    }

    private void ensurePerfSessionsIsMutable() {
    }

    public static NetworkRequestMetric getDefaultInstance() {
    }

    private Map<String, String> getMutableCustomAttributesMap() {
    }

    private MapFieldLite<String, String> internalGetCustomAttributes() {
    }

    private MapFieldLite<String, String> internalGetMutableCustomAttributes() {
    }

    public static Builder newBuilder() {
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<NetworkRequestMetric> parser() {
    }

    private void removePerfSessions(int i) {
    }

    private void setClientStartTimeUs(long j) {
    }

    private void setHttpMethod(HttpMethod httpMethod) {
    }

    private void setHttpResponseCode(int i) {
    }

    private void setNetworkClientErrorReason(NetworkClientErrorReason networkClientErrorReason) {
    }

    private void setPerfSessions(int i, PerfSession perfSession) {
    }

    private void setRequestPayloadBytes(long j) {
    }

    private void setResponseContentType(String str) {
    }

    private void setResponseContentTypeBytes(ByteString byteString) {
    }

    private void setResponsePayloadBytes(long j) {
    }

    private void setTimeToRequestCompletedUs(long j) {
    }

    private void setTimeToResponseCompletedUs(long j) {
    }

    private void setTimeToResponseInitiatedUs(long j) {
    }

    private void setUrl(String str) {
    }

    private void setUrlBytes(ByteString byteString) {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean containsCustomAttributes(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getClientStartTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    @Deprecated
    public Map<String, String> getCustomAttributes() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public int getCustomAttributesCount() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public Map<String, String> getCustomAttributesMap() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public String getCustomAttributesOrDefault(String str, String str2) {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public String getCustomAttributesOrThrow(String str) {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public HttpMethod getHttpMethod() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public int getHttpResponseCode() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public NetworkClientErrorReason getNetworkClientErrorReason() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public PerfSession getPerfSessions(int i) {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public int getPerfSessionsCount() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public List<PerfSession> getPerfSessionsList() {
    }

    public PerfSessionOrBuilder getPerfSessionsOrBuilder(int i) {
    }

    public List<? extends PerfSessionOrBuilder> getPerfSessionsOrBuilderList() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getRequestPayloadBytes() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public String getResponseContentType() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public ByteString getResponseContentTypeBytes() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getResponsePayloadBytes() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getTimeToRequestCompletedUs() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getTimeToResponseCompletedUs() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public long getTimeToResponseInitiatedUs() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public String getUrl() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public ByteString getUrlBytes() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasClientStartTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasHttpMethod() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasHttpResponseCode() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasNetworkClientErrorReason() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasRequestPayloadBytes() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasResponseContentType() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasResponsePayloadBytes() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasTimeToRequestCompletedUs() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasTimeToResponseCompletedUs() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasTimeToResponseInitiatedUs() {
    }

    @Override // com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder
    public boolean hasUrl() {
    }

    public static Builder newBuilder(NetworkRequestMetric networkRequestMetric) {
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static NetworkRequestMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addPerfSessions(int i, PerfSession perfSession) {
    }

    public static NetworkRequestMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream) throws IOException {
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static NetworkRequestMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static NetworkRequestMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
