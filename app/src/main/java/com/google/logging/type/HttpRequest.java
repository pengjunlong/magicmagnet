package com.google.logging.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class HttpRequest extends GeneratedMessageLite<HttpRequest, Builder> implements HttpRequestOrBuilder {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final HttpRequest DEFAULT_INSTANCE = null;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile Parser<HttpRequest> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private String protocol_;
    private String referer_;
    private String remoteIp_;
    private String requestMethod_;
    private long requestSize_;
    private String requestUrl_;
    private long responseSize_;
    private String serverIp_;
    private int status_;
    private String userAgent_;

    /* renamed from: com.google.logging.type.HttpRequest$1 */
    static /* synthetic */ class C12631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f129xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HttpRequest, Builder> implements HttpRequestOrBuilder {
        /* synthetic */ Builder(C12631 c12631) {
        }

        public Builder clearCacheFillBytes() {
        }

        public Builder clearCacheHit() {
        }

        public Builder clearCacheLookup() {
        }

        public Builder clearCacheValidatedWithOriginServer() {
        }

        public Builder clearLatency() {
        }

        public Builder clearProtocol() {
        }

        public Builder clearReferer() {
        }

        public Builder clearRemoteIp() {
        }

        public Builder clearRequestMethod() {
        }

        public Builder clearRequestSize() {
        }

        public Builder clearRequestUrl() {
        }

        public Builder clearResponseSize() {
        }

        public Builder clearServerIp() {
        }

        public Builder clearStatus() {
        }

        public Builder clearUserAgent() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public long getCacheFillBytes() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public boolean getCacheHit() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public boolean getCacheLookup() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public boolean getCacheValidatedWithOriginServer() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public Duration getLatency() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getProtocol() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getProtocolBytes() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getReferer() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getRefererBytes() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getRemoteIp() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getRemoteIpBytes() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getRequestMethod() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getRequestMethodBytes() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public long getRequestSize() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getRequestUrl() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getRequestUrlBytes() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public long getResponseSize() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getServerIp() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getServerIpBytes() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public int getStatus() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public String getUserAgent() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public ByteString getUserAgentBytes() {
        }

        @Override // com.google.logging.type.HttpRequestOrBuilder
        public boolean hasLatency() {
        }

        public Builder mergeLatency(Duration duration) {
        }

        public Builder setCacheFillBytes(long j) {
        }

        public Builder setCacheHit(boolean z) {
        }

        public Builder setCacheLookup(boolean z) {
        }

        public Builder setCacheValidatedWithOriginServer(boolean z) {
        }

        public Builder setLatency(Duration duration) {
        }

        public Builder setProtocol(String str) {
        }

        public Builder setProtocolBytes(ByteString byteString) {
        }

        public Builder setReferer(String str) {
        }

        public Builder setRefererBytes(ByteString byteString) {
        }

        public Builder setRemoteIp(String str) {
        }

        public Builder setRemoteIpBytes(ByteString byteString) {
        }

        public Builder setRequestMethod(String str) {
        }

        public Builder setRequestMethodBytes(ByteString byteString) {
        }

        public Builder setRequestSize(long j) {
        }

        public Builder setRequestUrl(String str) {
        }

        public Builder setRequestUrlBytes(ByteString byteString) {
        }

        public Builder setResponseSize(long j) {
        }

        public Builder setServerIp(String str) {
        }

        public Builder setServerIpBytes(ByteString byteString) {
        }

        public Builder setStatus(int i) {
        }

        public Builder setUserAgent(String str) {
        }

        public Builder setUserAgentBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder setLatency(Duration.Builder builder) {
        }
    }

    private HttpRequest() {
    }

    static /* synthetic */ HttpRequest access$000() {
    }

    static /* synthetic */ void access$100(HttpRequest httpRequest, String str) {
    }

    static /* synthetic */ void access$1000(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$1100(HttpRequest httpRequest, long j) {
    }

    static /* synthetic */ void access$1200(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$1300(HttpRequest httpRequest, String str) {
    }

    static /* synthetic */ void access$1400(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$1500(HttpRequest httpRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$1600(HttpRequest httpRequest, String str) {
    }

    static /* synthetic */ void access$1700(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$1800(HttpRequest httpRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$1900(HttpRequest httpRequest, String str) {
    }

    static /* synthetic */ void access$200(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$2000(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$2100(HttpRequest httpRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$2200(HttpRequest httpRequest, String str) {
    }

    static /* synthetic */ void access$2300(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$2400(HttpRequest httpRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$2500(HttpRequest httpRequest, Duration duration) {
    }

    static /* synthetic */ void access$2600(HttpRequest httpRequest, Duration duration) {
    }

    static /* synthetic */ void access$2700(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$2800(HttpRequest httpRequest, boolean z) {
    }

    static /* synthetic */ void access$2900(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$300(HttpRequest httpRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$3000(HttpRequest httpRequest, boolean z) {
    }

    static /* synthetic */ void access$3100(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$3200(HttpRequest httpRequest, boolean z) {
    }

    static /* synthetic */ void access$3300(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$3400(HttpRequest httpRequest, long j) {
    }

    static /* synthetic */ void access$3500(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$3600(HttpRequest httpRequest, String str) {
    }

    static /* synthetic */ void access$3700(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$3800(HttpRequest httpRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$400(HttpRequest httpRequest, String str) {
    }

    static /* synthetic */ void access$500(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$600(HttpRequest httpRequest, ByteString byteString) {
    }

    static /* synthetic */ void access$700(HttpRequest httpRequest, long j) {
    }

    static /* synthetic */ void access$800(HttpRequest httpRequest) {
    }

    static /* synthetic */ void access$900(HttpRequest httpRequest, int i) {
    }

    private void clearCacheFillBytes() {
    }

    private void clearCacheHit() {
    }

    private void clearCacheLookup() {
    }

    private void clearCacheValidatedWithOriginServer() {
    }

    private void clearLatency() {
    }

    private void clearProtocol() {
    }

    private void clearReferer() {
    }

    private void clearRemoteIp() {
    }

    private void clearRequestMethod() {
    }

    private void clearRequestSize() {
    }

    private void clearRequestUrl() {
    }

    private void clearResponseSize() {
    }

    private void clearServerIp() {
    }

    private void clearStatus() {
    }

    private void clearUserAgent() {
    }

    public static HttpRequest getDefaultInstance() {
    }

    private void mergeLatency(Duration duration) {
    }

    public static Builder newBuilder() {
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<HttpRequest> parser() {
    }

    private void setCacheFillBytes(long j) {
    }

    private void setCacheHit(boolean z) {
    }

    private void setCacheLookup(boolean z) {
    }

    private void setCacheValidatedWithOriginServer(boolean z) {
    }

    private void setLatency(Duration duration) {
    }

    private void setProtocol(String str) {
    }

    private void setProtocolBytes(ByteString byteString) {
    }

    private void setReferer(String str) {
    }

    private void setRefererBytes(ByteString byteString) {
    }

    private void setRemoteIp(String str) {
    }

    private void setRemoteIpBytes(ByteString byteString) {
    }

    private void setRequestMethod(String str) {
    }

    private void setRequestMethodBytes(ByteString byteString) {
    }

    private void setRequestSize(long j) {
    }

    private void setRequestUrl(String str) {
    }

    private void setRequestUrlBytes(ByteString byteString) {
    }

    private void setResponseSize(long j) {
    }

    private void setServerIp(String str) {
    }

    private void setServerIpBytes(ByteString byteString) {
    }

    private void setStatus(int i) {
    }

    private void setUserAgent(String str) {
    }

    private void setUserAgentBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public long getCacheFillBytes() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public boolean getCacheHit() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public boolean getCacheLookup() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public boolean getCacheValidatedWithOriginServer() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public Duration getLatency() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getProtocol() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getProtocolBytes() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getReferer() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getRefererBytes() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getRemoteIp() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getRemoteIpBytes() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getRequestMethod() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getRequestMethodBytes() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public long getRequestSize() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getRequestUrl() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getRequestUrlBytes() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public long getResponseSize() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getServerIp() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getServerIpBytes() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public int getStatus() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public String getUserAgent() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public ByteString getUserAgentBytes() {
    }

    @Override // com.google.logging.type.HttpRequestOrBuilder
    public boolean hasLatency() {
    }

    public static Builder newBuilder(HttpRequest httpRequest) {
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static HttpRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static HttpRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static HttpRequest parseFrom(InputStream inputStream) throws IOException {
    }

    public static HttpRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
